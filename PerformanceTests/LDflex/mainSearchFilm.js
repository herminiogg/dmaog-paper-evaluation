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
const queryEngine = new ComunicaEngine('http://localhost:3030/filmsBig/sparql');
// The object that can create new paths
const path = new PathFactory({ context, queryEngine });

const film1 = path.create({ subject: namedNode('http://example.com/1') });

(async () => {
    for (let i = 0; i < 30; i++) {
        let millis1 = Date.now();
        for (let j = 0; j < 10; j++) {
            await getFilmByName(film1, 'Carmen');
        }
        let millis2 = Date.now();
        console.log(millis2 - millis1);
    }
})();

async function getFilmByName(films, name) {
    for await (const film of films.subjects) {
        if(await film.name == name)
            createFilm(film);
    }
}

async function createFilm(film) {
    return new Film(await film.name, await film.year, await film.countryOfOrigin, 
        await film.director, await film.musicBy, await film.screenwritter);
}

class Film {
    constructor(id, name, year, countryOfOrigin, director, musicBy, screenwritter) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.countryOfOrigin = countryOfOrigin;
        this.director=director;
        this.musicBy=musicBy;
        this.screenwritter=screenwritter;
    }
}
