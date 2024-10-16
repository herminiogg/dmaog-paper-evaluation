import { schema } from "ldkit/namespaces";
import { createNamespace } from "ldkit";
import { type Options, createLens } from "ldkit";

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
    year: ex.year,
    countryOfOrigin: schema.countryOfOrigin,
    director: schema.director,
    musicBy: schema.musicBy,
    name: schema.name
  } as const;

const options: Options = {
    sources: ["http://localhost:3030/films/sparql"], // SPARQL endpoint
    language: "en", // Preferred language
};

const Movies = createLens(FilmSchema, options);

console.log("All films");
fetchFilms().then(() => {
    console.log("\nOnly the films with the title Dunkirk");
    searchFilmByName("Dunkirk")
});


async function fetchFilms() {
    const films = await Movies.find();
    for (const film of films) { showFilm(film); }
}

async function searchFilmByName(name: string) {  
  const films = await Movies.find({
    where: {
      name: {
        $equals: name
      }
    }
  });
  for (const film of films) {
    showFilm(film);
  }
}

function showFilm(film) {
    console.log(`${film.$id}, ${film.name}, ${film.year}, ${film.countryOfOrigin}, 
        ${film.director}, ${film.musicBy}, ${film.screenwritter}`);
}

