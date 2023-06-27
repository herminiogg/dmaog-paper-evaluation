package com.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Get all films");
        for(int i = 0; i < 30; i++) {
            long millis1 = System.currentTimeMillis();
            for (int j = 0; j < 100; j++) {
                List<SchemaMovie> movies = new SchemaMovieService().getAll();
            }
            long millis2 = System.currentTimeMillis();
            System.out.println(millis2 - millis1);
        }

        System.out.println("Get films whose name is Carmen");
        for(int i = 0; i < 30; i++) {
            long millis1 = System.currentTimeMillis();
            for (int j = 0; j < 100; j++) {
                List<SchemaMovie> filteredMovies = new SchemaMovieService().getByField("schemaName", "Carmen");
            }
            long millis2 = System.currentTimeMillis();
            System.out.println(millis2 - millis1);
        }
    }
}
