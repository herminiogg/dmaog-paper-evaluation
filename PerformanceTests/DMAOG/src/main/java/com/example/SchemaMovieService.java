package com.example;

import com.herminiogarcia.dmaog.dataAccess.DataAccess;
import java.util.List;
import java.util.Optional;

public class SchemaMovieService {

    private DataAccess dataAccess;

    public SchemaMovieService() {
        this.dataAccess = DataAccessSingleton.getInstance();
    }

    public List<SchemaMovie> getAll() {
        return dataAccess.getAll(SchemaMovie.class);
    }

    public String getAll(String rdfFormat) {
        return dataAccess.getAll(SchemaMovie.class, rdfFormat);
    }

    public List<SchemaMovie> getAll(Long limit, Long offset) {
        return dataAccess.getAll(SchemaMovie.class, limit, offset);
    }

    public Long count() {
        return dataAccess.count(SchemaMovie.class);
    }

    public Optional<SchemaMovie> getById(String id) {
        return dataAccess.getById(SchemaMovie.class, id);
    }

    public String getById(String id, String rdfFormat) {
        return dataAccess.getById(SchemaMovie.class, id, rdfFormat);
    }

    public List<SchemaMovie> getByField(String fieldName, String value) {
        return dataAccess.getByField(SchemaMovie.class, fieldName, value);
    }

    public String getByField(String fieldName, String value, String rdfFormat) {
        return dataAccess.getByField(SchemaMovie.class, fieldName, value, rdfFormat);
    }

    public void commit(SchemaMovie instance) {
        dataAccess.delete(instance);
        dataAccess.insert(instance);
    }

    public void delete(SchemaMovie instance) {
        dataAccess.delete(instance);
    }

}