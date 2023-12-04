import { parseRdf } from "@ldo/ldo";
import { namedNode } from "@rdfjs/data-model";
import { FilmShapeType } from "./.ldo/film.shapeTypes";
import { readFileSync } from 'fs';

async function run() {

    const rawTurtle = readFileSync('../films.ttl', 'utf-8');

    const ldoDataset = await parseRdf(rawTurtle, {
        baseIRI: "http://example.com/",
    });
    
    console.log("All films");
    fetchFilms(ldoDataset).then(() => {
        console.log("\nOnly the films with the title Dunkirk");
        searchFilmByName(ldoDataset, "Dunkirk")
    });
}

async function fetchFilms(dataset) {
    const films = dataset
        .usingType(FilmShapeType)
        .matchSubject(
            namedNode("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"),
            namedNode("http://schema.org/Movie")
        );
    films.forEach((film) => { showFilm(film); }) 
}

async function searchFilmByName(dataset, name: String) {
    const films = dataset
        .usingType(FilmShapeType)
        .matchSubject(
            namedNode("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"),
            namedNode("http://schema.org/Movie")
        );
    for (const film of films) { 
        if(film.name === name) showFilm(film); 
    }
}

function showFilm(film) {
    console.log(film.year["@id"]);
    console.log(`${film["@id"]}, ${film.name}, ${film.year["@id"]}, ${film.countryOfOrigin["@id"]}, 
        ${film.director["@id"]}, ${film.musicBy["@id"]}, ${screenwriterToString(film)}`);
}

function screenwriterToString(film) {
    return film.screenwritter.map((f) => f["@id"]).join(", ")
}

run();