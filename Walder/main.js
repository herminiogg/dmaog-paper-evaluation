fetch("http://localhost:3000/film", {
    headers: {
        "Accept": "application/ld+json"
    }
}).then(function(response) {
    return response.json();
}).then(function(data) {
    console.log("All films");
    data['@graph'].forEach(function (film) {
        showFilm(film);
    });
});

fetch("http://localhost:3000/film/Dunkirk", {
    headers: {
        "Accept": "application/ld+json"
    }
}).then(function(response) {
    return response.json();
}).then(function(data) {
    console.log("\nOnly the films with the title Dunkirk");
    showFilm(data['@graph'][0]);
});

function showFilm(film) {
    console.log(`${film['@id']}, ${film.name}, ${film.year[0]['@id']}, ${film.countryOfOrigin[0]['@id']}, 
        ${film.director[0]['@id']}, ${film.musicBy[0]['@id']}, ${film.screenwritter[0]['@id']}`);
}
