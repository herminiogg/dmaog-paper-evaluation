package com.example;

import com.example.domain.Film;
import com.github.kburger.rdf4j.beans.BeanAnalyzer;
import com.github.kburger.rdf4j.beans.BeanMapper;
import com.github.kburger.rdf4j.beans.ClassAnalysis;
import org.eclipse.rdf4j.rio.RDFFormat;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BeanMapper mapper = new BeanMapper();

        String fileContent = Files.readString(Path.of("..\\films.ttl"));
        Film film1 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/1", RDFFormat.TURTLE);
        Film film2 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/2", RDFFormat.TURTLE);
        Film film3 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/3", RDFFormat.TURTLE);
        Film film4 = mapper.read(new StringReader(fileContent), Film.class, "http://example.com/4", RDFFormat.TURTLE);
        List<Film> films = Arrays.asList(film1, film2, film3, film4);

        System.out.println("All films");
        films.forEach(System.out::println);

        System.out.println("\nOnly the films with the title Dunkirk");
        films.stream().filter(f -> f.getName().equals("Dunkirk")).forEach(System.out::println);

    }
}
