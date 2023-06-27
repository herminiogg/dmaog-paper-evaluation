package com.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<SchemaMovie> movies = new SchemaMovieService().getAll().stream();
        System.out.println("\n-----All films-----\n");
        movies.forEach(m -> System.out.println(m.getId().iri() + ", " +
                            m.getSchemaName() + ", " +
                            m.getYear().localName() + ", " +
                            m.getSchemaDirector().localName() + ", " +
                            m.getSchemaCountryOfOrigin().localName() + ", " +
                            m.getSchemaMusicBy().localName() + ", " +
                            m.getScreenwritter().stream().map(s -> s.localName()).collect(Collectors.joining(" & "))));
        System.out.println("\n\n");

        Stream<SchemaMovie> dunkirkMovies = new SchemaMovieService().getByField("schemaName", "Dunkirk").stream();
        System.out.println("\n-----Films named Dunkirk-----");
        dunkirkMovies.forEach(m -> System.out.println(m.getId().iri() + ", " +
                                    m.getSchemaName() + ", " +
                                    m.getYear().localName() + ", " +
                                    m.getCinematographer().localName() + ", " +
                                    m.getSchemaDirector().localName() + ", " +
                                    m.getSchemaCountryOfOrigin().localName() + ", " +
                                    m.getSchemaMusicBy().localName() + ", " +
                                    m.getScreenwritter().stream().map(s -> s.localName()).collect(Collectors.joining(" & "))));
        System.out.println("\n\n");
    }
}
