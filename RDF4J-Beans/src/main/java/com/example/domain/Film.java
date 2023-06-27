package com.example.domain;

import com.github.kburger.rdf4j.beans.annotation.Predicate;
import com.github.kburger.rdf4j.beans.annotation.Type;

import java.net.URI;
import java.util.List;

@Type("http://schema.org/Movie")
public class Film {

    @Predicate(value = "http://schema.org/name", isLiteral = true)
    private String name;
    @Predicate(value = "http://example.com/year")
    private URI year;
    @Predicate(value = "http://schema.org/countryOfOrigin")
    private URI countryoforigin;
    @Predicate(value = "http://schema.org/director")
    private URI director;
    @Predicate(value = "http://example.com/screenwritter")
    private List<URI> screenwritter;
    @Predicate(value = "http://schema.org/musicBy")
    private URI musicby;
    @Predicate(value = "http://example.com/cinematographer")
    private URI cinematographer;

    public Film(){}
    public Film(String name, URI year, URI countryoforigin, URI director, List<URI> screenwritter, URI musicby, URI cinematographer) {
        this.name = name;
        this.year = year;
        this.countryoforigin = countryoforigin;
        this.director = director;
        this.screenwritter = screenwritter;
        this.musicby = musicby;
        this.cinematographer = cinematographer;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URI getYear() {
        return this.year;
    }

    public void setYear(URI year) {
        this.year = year;
    }

    public URI getCountryoforigin() {
        return this.countryoforigin;
    }

    public void setCountryoforigin(URI countryoforigin) {
        this.countryoforigin = countryoforigin;
    }

    public URI getDirector() {
        return this.director;
    }

    public void setDirector(URI director) {
        this.director = director;
    }

    public List<URI> getScreenwritter() {
        return this.screenwritter;
    }

    public void setScreenwritter(List<URI> screenwritter) {
        this.screenwritter = screenwritter;
    }

    public URI getMusicby() {
        return this.musicby;
    }

    public void setMusicby(URI musicby) {
        this.musicby = musicby;
    }

    public URI getCinematographer() {
        return this.cinematographer;
    }

    public void setCinematographer(URI cinematographer) {
        this.cinematographer = cinematographer;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", countryoforigin=" + countryoforigin +
                ", director=" + director +
                ", screenwritter=" + screenwritter +
                ", musicby=" + musicby +
                ", cinematographer=" + cinematographer +
                '}';
    }
}
