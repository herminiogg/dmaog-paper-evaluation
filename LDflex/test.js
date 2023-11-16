const { PathFactory } = require('ldflex');
const { default: ComunicaEngine } = require('@ldflex/comunica');
const { namedNode } = require('@rdfjs/data-model');

// The JSON-LD context for resolving properties
const context = {
    "@context": {
        "film": "http://schema.org/Movie",
        "name": "http://schema.org/name",
        "countryOfOrigin": "http://schema.org/countryOfOrigin",
        "director": "http://schema.org/director",
        "musicBy": "http://schema.org/musicBy",
        "screenwritter": "http://example.com/screenwritter",
        "year": "http://example.com/year",
        "schema": "http://schema.org/",
        "dbr": "http://dbpedia.org/resource/"
    }
};

// The query engine and its source
const queryEngine = new ComunicaEngine('http://localhost:3030/films/sparql');

// The object that can create new paths
const path = new PathFactory({ context, queryEngine });

const film1 = path.create({ subject: namedNode('http://example.com/1') });

console.log("All films");

let retrievedFilms = [];
for await (const film of films.subjects) {
	await retrievedFilms.push(film);
}

let dunkirkFilms = [];
for await (const film of films.subjects) {
	if(await film.name == "Dunkirk")
		dunkirkFilms.push(film);
}