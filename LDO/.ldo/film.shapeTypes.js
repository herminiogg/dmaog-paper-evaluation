"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FilmShapeType = void 0;
var film_schema_1 = require("./film.schema");
var film_context_1 = require("./film.context");
/**
 * =============================================================================
 * LDO ShapeTypes film
 * =============================================================================
 */
/**
 * Film ShapeType
 */
exports.FilmShapeType = {
    schema: film_schema_1.filmSchema,
    shape: "http://example.com/Film",
    context: film_context_1.filmContext,
};
