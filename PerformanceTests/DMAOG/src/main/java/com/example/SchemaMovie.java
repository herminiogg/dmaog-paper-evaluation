package com.example;

import com.herminiogarcia.dmaog.common.IRIValue;
import com.herminiogarcia.dmaog.common.MultilingualString;
import java.util.List;

public class SchemaMovie {

    public final static String rdfType = "http://schema.org/Movie";
    public final static String subjectPrefix = "http://example.com/";

    private List<IRIValue> cinematographer;
    private List<IRIValue> schemaMusicBy;
    private List<IRIValue> schemaCountryOfOrigin;
    private List<IRIValue> screenwritter;
    private List<IRIValue> schemaDirector;
    private List<String> schemaName;
    private List<java.time.ZonedDateTime> year;
    private IRIValue id;

    public SchemaMovie() {

    }

    public List<IRIValue> getCinematographer() {
        return this.cinematographer;
    }

    public List<IRIValue> getSchemaMusicBy() {
        return this.schemaMusicBy;
    }

    public List<IRIValue> getSchemaCountryOfOrigin() {
        return this.schemaCountryOfOrigin;
    }

    public List<IRIValue> getScreenwritter() {
        return this.screenwritter;
    }

    public List<IRIValue> getSchemaDirector() {
        return this.schemaDirector;
    }

    public List<String> getSchemaName() {
        return this.schemaName;
    }

    public List<java.time.ZonedDateTime> getYear() {
        return this.year;
    }

    public IRIValue getId() {
        return this.id;
    }


    public SchemaMovie setCinematographer(List<IRIValue> cinematographer) {
        this.cinematographer = cinematographer;
        return this;
    }

    public SchemaMovie setSchemaMusicBy(List<IRIValue> schemaMusicBy) {
        this.schemaMusicBy = schemaMusicBy;
        return this;
    }

    public SchemaMovie setSchemaCountryOfOrigin(List<IRIValue> schemaCountryOfOrigin) {
        this.schemaCountryOfOrigin = schemaCountryOfOrigin;
        return this;
    }

    public SchemaMovie setScreenwritter(List<IRIValue> screenwritter) {
        this.screenwritter = screenwritter;
        return this;
    }

    public SchemaMovie setSchemaDirector(List<IRIValue> schemaDirector) {
        this.schemaDirector = schemaDirector;
        return this;
    }

    public SchemaMovie setSchemaName(List<String> schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    public SchemaMovie setYear(List<java.time.ZonedDateTime> year) {
        this.year = year;
        return this;
    }

    public SchemaMovie setId(IRIValue id) {
        this.id = id;
        return this;
    }


}