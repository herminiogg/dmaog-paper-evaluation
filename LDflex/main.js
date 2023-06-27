const { PathFactory } = require('ldflex');
const { default: ComunicaEngine } = require('@ldflex/comunica');
const { namedNode } = require('@rdfjs/data-model');

// The JSON-LD context for resolving properties
const context = {
    "@context": {
        "film": "http://schema.org/Movie",
        "name": "http://schema.org/name",
        "countryOfOrigin": "http://schema.org/countryOfOrigin",
        "director": "http://schema.org/director",
        "musicBy": "http://schema.org/musicBy",
        "screenwritter": "http://example.com/screenwritter",
        "year": "http://example.com/year",
        "schema": "http://schema.org/",
        "dbr": "http://dbpedia.org/resource/"
    }
};
// The query engine and its source
const queryEngine = new ComunicaEngine('http://localhost:3030/films/sparql');
// The object that can create new paths
const path = new PathFactory({ context, queryEngine });

const film1 = path.create({ subject: namedNode('http://example.com/1') });

console.log("All films");
showAllFilms(film1).then(() => {
    console.log("\nOnly the films with the title Dunkirk");
    showFilmByName(film1, "Dunkirk");
});

async function showAllFilms(films) {
    for await (const film of films.subjects) {
        await showFilm(film);
    }
}

async function showFilmByName(films, name) {
    for await (const film of films.subjects) {
        if(await film.name == name)
            showFilm(film);
    }
}

async function showFilm(film) {
    console.log(`${await film.name}, ${await film.year}, ${await film.countryOfOrigin}, 
        ${await film.director}, ${await film.musicBy}, ${await film.screenwritter}`);
}

