"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (g && (g = 0, op[0] && (_ = 0)), _) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
Object.defineProperty(exports, "__esModule", { value: true });
var namespaces_1 = require("ldkit/namespaces");
var ldkit_1 = require("ldkit");
var ldkit_2 = require("ldkit");
var ex = (0, ldkit_1.createNamespace)({
    iri: "http://example.com/",
    prefix: ":",
    terms: [
        "screenwritter",
        "year"
    ],
});
var FilmSchema = {
    "@type": namespaces_1.schema.Movie,
    screenwritter: ex.screenwritter,
    year: {
        "@id": ex.year,
        "@type": namespaces_1.xsd.dateTime,
    },
    countryOfOrigin: namespaces_1.schema.countryOfOrigin,
    director: namespaces_1.schema.director,
    musicBy: namespaces_1.schema.musicBy,
    name: namespaces_1.schema.name
};
var options = {
    sources: ["http://localhost:3030/filmsBig/sparql"],
    language: "en", // Preferred language
};
var Movies = (0, ldkit_2.createLens)(FilmSchema, options);
(function () { return __awaiter(void 0, void 0, void 0, function () {
    var i, millis1, j, millis2;
    return __generator(this, function (_a) {
        switch (_a.label) {
            case 0:
                i = 0;
                _a.label = 1;
            case 1:
                if (!(i < 30)) return [3 /*break*/, 7];
                millis1 = Date.now();
                j = 0;
                _a.label = 2;
            case 2:
                if (!(j < 100)) return [3 /*break*/, 5];
                return [4 /*yield*/, allFilms()];
            case 3:
                _a.sent();
                _a.label = 4;
            case 4:
                j++;
                return [3 /*break*/, 2];
            case 5:
                millis2 = Date.now();
                console.log(millis2 - millis1);
                _a.label = 6;
            case 6:
                i++;
                return [3 /*break*/, 1];
            case 7: return [2 /*return*/];
        }
    });
}); })();
function allFilms() {
    return __awaiter(this, void 0, void 0, function () {
        var films, _i, films_1, film;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0: return [4 /*yield*/, Movies.find()];
                case 1:
                    films = _a.sent();
                    for (_i = 0, films_1 = films; _i < films_1.length; _i++) {
                        film = films_1[_i];
                        new Film(film.$id, film.name, film.year, film.countryOfOrigin, film.director, film.musicBy, film.screenwritter);
                    }
                    return [2 /*return*/];
            }
        });
    });
}
var Film = /** @class */ (function () {
    function Film(id, name, year, countryOfOrigin, director, musicBy, screenwritter) {
        this.id = new URL(id);
        this.name = name;
        this.year = year;
        this.countryOfOrigin = new URL(countryOfOrigin);
        this.director = new URL(director);
        this.musicBy = new URL(musicBy);
        this.screenwritter = new URL(screenwritter);
    }
    return Film;
}());
