import { parseRdf } from "@ldo/ldo";
import { namedNode } from "@rdfjs/data-model";
import { FilmShapeType } from "./.ldo/film.shapeTypes";
import { readFileSync } from 'fs';

(async () => {
    const rawTurtle = readFileSync('../../bigFilmsFile.ttl', 'utf-8');

    const ldoDataset = await parseRdf(rawTurtle, {
        baseIRI: "http://example.com/",
    });

    for (let i = 0; i < 30; i++) {
        let millis1 = Date.now();
        for (let j = 0; j < 10; j++) {
            await allFilms(ldoDataset);
        }
        let millis2 = Date.now();
        console.log(millis2 - millis1);
    }
})();

async function allFilms(dataset) {
    const films = dataset
        .usingType(FilmShapeType)
        .matchSubject(
            namedNode("http://www.w3.org/1999/02/22-rdf-syntax-ns#type"),
            namedNode("http://schema.org/Movie")
        );
    films.forEach((film) => { 
        new Film(film["@id"], film.name, film.year["@id"], film.countryOfOrigin[0]["@id"], film.director[0]["@id"], film.musicBy[0]["@id"], film.screenwritter[0]["@id"]);
    });
}

class Film {
    id: URL;
    name: string;
    year: Date;
    countryOfOrigin: URL;
    director: URL;
    musicBy: URL;
    screenwritter: URL;

    constructor(id: string, name:string, year: Date, countryOfOrigin: string, director: string, musicBy: string, screenwritter: string) {
        this.id = new URL(id);
        this.name = name;
        this.year = year;
        this.countryOfOrigin = new URL(countryOfOrigin);
        this.director=new URL(director);
        this.musicBy=new URL(musicBy);
        this.screenwritter=new URL(screenwritter);
    }
}