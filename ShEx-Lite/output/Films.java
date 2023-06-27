package com.example;
import java.util.List;

public class Films {
	private String name;
	private String year;
	private String countryoforigin;
	private String director;
	private List<String> screenwritter;
	private String musicby;
	private String cinematographer;

	public Films(){}
	public Films(String name, String year, String countryoforigin, String director, List<String> screenwritter, String musicby, String cinematographer) {
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

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCountryoforigin() {
		return this.countryoforigin;
	}

	public void setCountryoforigin(String countryoforigin) {
		this.countryoforigin = countryoforigin;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<String> getScreenwritter() {
		return this.screenwritter;
	}

	public void setScreenwritter(List<String> screenwritter) {
		this.screenwritter = screenwritter;
	}

	public String getMusicby() {
		return this.musicby;
	}

	public void setMusicby(String musicby) {
		this.musicby = musicby;
	}

	public String getCinematographer() {
		return this.cinematographer;
	}

	public void setCinematographer(String cinematographer) {
		this.cinematographer = cinematographer;
	}

}
