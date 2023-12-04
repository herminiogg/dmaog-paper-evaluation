import { ShapeType } from "@ldo/ldo";
import { filmSchema } from "./film.schema";
import { filmContext } from "./film.context";
import { Film } from "./film.typings";

/**
 * =============================================================================
 * LDO ShapeTypes film
 * =============================================================================
 */

/**
 * Film ShapeType
 */
export const FilmShapeType: ShapeType<Film> = {
  schema: filmSchema,
  shape: "http://example.com/Film",
  context: filmContext,
};
