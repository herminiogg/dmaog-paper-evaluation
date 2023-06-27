package com.example;

import com.herminiogarcia.dmaog.common.IRIValue;
import com.herminiogarcia.dmaog.common.MultilingualString;
import java.util.List;

public class SchemaMovie {

    public final static String rdfType = "http://schema.org/Movie";
    public final static String subjectPrefix = "http://example.com/";

    private String schemaName;
    private IRIValue schemaMusicBy;
    private IRIValue schemaDirector;
    private IRIValue schemaCountryOfOrigin;
    private IRIValue year;
    private List<IRIValue> screenwritter;
    private IRIValue cinematographer;
    private IRIValue id;

    public SchemaMovie() {

    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public IRIValue getSchemaMusicBy() {
        return this.schemaMusicBy;
    }

    public IRIValue getSchemaDirector() {
        return this.schemaDirector;
    }

    public IRIValue getSchemaCountryOfOrigin() {
        return this.schemaCountryOfOrigin;
    }

    public IRIValue getYear() {
        return this.year;
    }

    public List<IRIValue> getScreenwritter() {
        return this.screenwritter;
    }

    public IRIValue getCinematographer() {
        return this.cinematographer;
    }

    public IRIValue getId() {
        return this.id;
    }


    public SchemaMovie setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    public SchemaMovie setSchemaMusicBy(IRIValue schemaMusicBy) {
        this.schemaMusicBy = schemaMusicBy;
        return this;
    }

    public SchemaMovie setSchemaDirector(IRIValue schemaDirector) {
        this.schemaDirector = schemaDirector;
        return this;
    }

    public SchemaMovie setSchemaCountryOfOrigin(IRIValue schemaCountryOfOrigin) {
        this.schemaCountryOfOrigin = schemaCountryOfOrigin;
        return this;
    }

    public SchemaMovie setYear(IRIValue year) {
        this.year = year;
        return this;
    }

    public SchemaMovie setScreenwritter(List<IRIValue> screenwritter) {
        this.screenwritter = screenwritter;
        return this;
    }

    public SchemaMovie setCinematographer(IRIValue cinematographer) {
        this.cinematographer = cinematographer;
        return this;
    }

    public SchemaMovie setId(IRIValue id) {
        this.id = id;
        return this;
    }


}