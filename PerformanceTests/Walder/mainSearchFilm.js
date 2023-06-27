(async () => {
    for (let i = 0; i < 30; i++) {
        let millis1 = Date.now();
        let promises = Array.from({ length: 1000 }, (value, index) => index).map( () => {
            return fetch("http://localhost:3000/film/Carmen", {
                headers: {
                    "Accept": "application/ld+json"
                }
            }).then(function(response) {
                return response.json();
            });
        });
        await Promise.all(promises)
            .then((values) => {
                values.forEach(d => d['@graph'].forEach(f => createFilm(f)));
                let millis2 = Date.now();
                console.log(millis2 - millis1);
            });
    }
})();

function createFilm(film) {
    new Film(`${film['@id']}, ${film.name}, ${film.year[0]['@id']}, ${film.countryOfOrigin[0]['@id']}, 
        ${film.director[0]['@id']}, ${film.musicBy[0]['@id']}, ${film.screenwritter[0]['@id']}`);
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
