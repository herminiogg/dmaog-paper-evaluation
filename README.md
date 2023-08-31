# DMAOG Paper examples and performance measurement scripts
In this repository you can find usage examples for the tools compared in the paper: DMAOG, LDflex, RDF4J-Beans, ShEx-Lite and Walder alongside a performance evaluation suite designed to compare four of these tools (DMAOG, LDflex, RDF4J-Beans, and Walder). The process of configuration and running of these examples is described in the following sections.

> If you want to see the statistical analysis of the data obtained using these examples you can visit the page [Statistical Analysis](StatisticalAnalysis).

## Used data
The data used in the examples is available in the root of this repository:
* films.ttl: File with four films used in the usage examples
* bigFilmsFile.ttl: File with 938 films extracted from Wikidata and transformed to match the used schema. This file is used in the performances tests.
* films.shex: Shape expression for the film used to generate the domain files with ShEx-Lite.
* films.shexml: ShExML mapping rules used to generate the films.ttl file.
* createBigFilmsFile.shexml: ShExML mapping rules used to generate the bigFilmsFile.ttl.
* films_modified.ttl: Same entities as in films.ttl but modified not to have predicates with a list of objects (only one per subject and predicate). This is due to a bug in RDF4J-Beans that can be resolved easily as explained later.

## Usage examples
All the examples in this section are meant to illustrate how a developer can use these libraries and the amoun of code/configuration needed to set up a minimal project. All examples are designed to do two basic operations:
* Get all films
* Get films whose name is Dunkirk

### Setting up a SPARQL endpoint
The vast majority of these examples use the files explained before but against a SPARQL endpoint to better recreate a production ready environment. To launch a SPARQL endpoint you can use [Apache Jena Fuseki](https://jena.apache.org/documentation/fuseki2/) and type the following command"

```
$ fuseki-server.bat --file=path/to/films.ttl /films
```

### DMAOG
First thing to do with DMAOG is to generate the data access code. For that you can use the [last release JAR library](https://github.com/herminiogg/dmaog/releases/tag/v0.1.4) and the following command that will generate all the needed classes.

```
$ java -jar DMAOG-v0.1.4-SNAPSHOT.jar -d ../films.ttl -o . -p com.example
```

Nevertheless, for convenience this is already provided in this repository and you can directly run the whole project using the command below:

```
$ mvn exec:java
```

The amount of code needed can be inspected by looking at the Main class. In addition, the initial set up explained at the beginning of this section is needed to generate the rest of the code.

### RDF4J-Beans
To work with RDF4J-Beans you can download the code from the [archived repository](https://github.com/kburger/rdf4j-beans) and then build and install the library in your local machine using:

```
$ mvn install
```

However, the code contians a bug not allowing to map objects with varying cardinality. For example, if you inspect films.ttl you can see that the object for predicate :screenwritter can be one or two, being the most adequate type a List. Unfortuntely, it will only work if all the objects for this predicate are always two or more. In order to overcome this limitation we introduced a change in the code that you can download [here](https://github.com/herminiogg/rdf4j-beans) and you can install it in the same way as the official repository. If you keep using the official one you then need to change your source to films_modified.ttl.

To run the project you can use the following command. Take into account that given the current technical limitations, this code is actually using the films.ttl file instead of the SPARQL endpoint.

```
$ mvn exec:java
```

The amount of coded needed in this specific case is divided in two classes: Film.java which contains the domain object and the mapping (through annotations) and Main.java with the call to the BeanMapper.

### ShEx-Lite
ShEx-Lite cannot actually generate all the needed code to run a whole example. Instead it provides the domain model from a set of Shape Expressions but the querying code is still on developers hands. However, we keep it here for demonstration as it could be possible to use ShEx-Lite in combination with RDF4J-Beans to speed up development. We can download [the project repository](https://github.com/weso/shex-lite), build an assembly and generate the code (Films.java) using the following commands:

```
$ sbt assembly
$ java -jar shExLite-assembly-0.1.jar --at-output-folder=output to-java --with-package=com.example --with-schema-json ../films.shex
```
In addition to having to write all the querying code, the developer also need to provide the Shape Expressions.

### Walder
In order to work with Walder you first have to install the library in your system as documented in the [Walder repository](https://github.com/KNowledgeOnWebScale/walder#installation). Then you can launch the REST API by using the following command:

```
$ yarn run walder -c config.yaml
```

Afterwards you can run the example using:

```
$ node main.js
```

In this case developers need to provide configuration of the different methods using GrahpQL queries and JSON-LD contexts (config.yaml). Then, the different mehtods can be queried from any programming language (for example in Javascript as in main.js).

### LDflex
To run any piece of code using LDflex you first have to install the library as mentioned in the [LDflex repository](https://github.com/LDflex/LDflex#installation).

The usage example can be launched typing the command below:

```
$ node main.js
```

In LDflex the developer does not need to provide any predefined configuration. All the configuration is done directly before the invocation of the library methods.

## Performance evaluation
Under the folder PerformanceTest you can find similar projects to those explained in usage example but designed to measure the performance of each solution: for getting all the films and for getting fields based on their name.

The performance evaluation is done by placing the execution between two iterators. First one is used to provide the different measure times that will be then aggregated into their mean. This iterator is set to 30 in order to have a good statistical result. The inner iterator is meant to normalise the execution times across different calls as we can encounter different engine activities that might affect the measurements (e.g., garbage collector). The value for this iterator can be established from 10 to 1000000 in order to have execution times of 4 digits that after conversion keep some significance.

### Setting up the SPARQL endpoint and how to create test data
The test data is provided under bigFilmsFile.ttl and it contains 938 films extracted from Wikidata. To create a SPARQL endpoint with it you can use this command:

```
$ fuseki-server.bat --file=path/to/bigFilmsFile.ttl /filmsBig
```

It is possible to create a new set of films using the createBigFilmsFile.shexml mapping rules. It will extract new films from Wikidata and create a new file for testing.

### DMAOG
The program will first launch the measurements for getting all the films and then for getting the films by the name. You can start it using:

```
$ mvn exec:java
```

### RDF4J-Beans
The program will first launch the measurements for getting all the films, then for getting the films by the name (first using the films in memory; then calling get all films firstly and filtering later). Unfortunately RDF4J-Beans does not support getting all or filtering by a field as it only loads a provided entity in a Java object. You can start this performance evaluation using:

```
$ mvn exec:java
```

### Walder
To start the performance evaluation of Walder we need to firstly launch Walder to expose the REST API. As mentioned earlier we can do it using the following command:

```
$ yarn run walder -c config.yaml
```

To launch the evaluation of getting all the films we can launch the main.js script using the command below. 

```
$ node main.js
```

In this case, the evaluation of getting all the films and searching by the name is separated in order to avoid a possible simultaneous execution due to the asynchronus Javascript nature. Therefore to run the search film by name evluation you have to run the mainSearchFilm.js script using:

```
$ node mainSearchFilm.js
```

### LDflex
As in the case of Walder the evalution of getting all the films and getting the films by name are separated. Therefore for running the evaluation of getting all the films you should use this command:

```
$ node main.js
```

And for evaluating getting the films by name you can use the command below:

```
$ node mainSearchFilm.js
```