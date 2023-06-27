package com.example.domain;

import com.github.kburger.rdf4j.beans.annotation.Predicate;
import com.github.kburger.rdf4j.beans.annotation.Type;

import java.net.URI;
import java.util.List;

@Type("http://schema.org/Movie")
public class Film {

    @Predicate(value = "http://schema.org/name", isLiteral = true)
    private List<String> name;
    @Predicate(value = "http://example.com/year")
    private List<String> year;
    @Predicate(value = "http://schema.org/countryOfOrigin")
    private List<URI> countryoforigin;
    @Predicate(value = "http://schema.org/director")
    private List<URI> director;
    @Predicate(value = "http://example.com/screenwritter")
    private List<URI> screenwritter;
    @Predicate(value = "http://schema.org/musicBy")
    private List<URI> musicby;
    @Predicate(value = "http://example.com/cinematographer")
    private List<URI> cinematographer;

    public Film(){}
    public Film(List<String> name, List<String> year, List<URI> countryoforigin, List<URI> director, List<URI> screenwritter, List<URI> musicby, List<URI> cinematographer) {
        this.name = name;
        this.year = year;
        this.countryoforigin = countryoforigin;
        this.director = director;
        this.screenwritter = screenwritter;
        this.musicby = musicby;
        this.cinematographer = cinematographer;
    }

    public List<String> getName() {
        return this.name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getYear() {
        return this.year;
    }

    public void setYear(List<String> year) {
        this.year = year;
    }

    public List<URI> getCountryoforigin() {
        return this.countryoforigin;
    }

    public void setCountryoforigin(List<URI> countryoforigin) {
        this.countryoforigin = countryoforigin;
    }

    public List<URI> getDirector() {
        return this.director;
    }

    public void setDirector(List<URI> director) {
        this.director = director;
    }

    public List<URI> getScreenwritter() {
        return this.screenwritter;
    }

    public void setScreenwritter(List<URI> screenwritter) {
        this.screenwritter = screenwritter;
    }

    public List<URI> getMusicby() {
        return this.musicby;
    }

    public void setMusicby(List<URI> musicby) {
        this.musicby = musicby;
    }

    public List<URI> getCinematographer() {
        return this.cinematographer;
    }

    public void setCinematographer(List<URI> cinematographer) {
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
