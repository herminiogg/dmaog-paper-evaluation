import { schema, xsd } from "ldkit/namespaces";
import { createNamespace } from "ldkit";
import { type Context, createLens } from "ldkit";

const ex = createNamespace(
    {
      iri: "http://example.com/",
      prefix: ":",
      terms: [
        "screenwritter",
        "year"
      ],
    } as const,
  );

const FilmSchema = {
    "@type": schema.Movie,
    screenwritter: ex.screenwritter,
    year: {
        "@id": ex.year,
        "@type": xsd.dateTime,
    },
    countryOfOrigin: schema.countryOfOrigin,
    director: schema.director,
    musicBy: schema.musicBy,
    name: schema.name
  } as const;

const context: Context = {
    sources: ["http://localhost:3030/filmsBig/sparql"], // SPARQL endpoint
    language: "en", // Preferred language
};

const Movies = createLens(FilmSchema, context);

(async () => {
    for (let i = 0; i < 30; i++) {
        let millis1 = Date.now();
        for (let j = 0; j < 100; j++) {
            await getFilmByName('Carmen');
        }
        let millis2 = Date.now();
        console.log(millis2 - millis1);
    }
})();


async function getFilmByName(name: string) {
    const films = await Movies.find();
    for (const film of films) {
        if(film.name === name) {
            new Film(film.$id, film.name, film.year, film.countryOfOrigin, film.director, film.musicBy, film.screenwritter);
        }
    }
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