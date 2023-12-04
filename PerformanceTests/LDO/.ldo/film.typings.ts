import { ContextDefinition } from "jsonld";

/**
 * =============================================================================
 * Typescript Typings for film
 * =============================================================================
 */

/**
 * Film Type
 */
export interface Film {
  "@id"?: string;
  "@context"?: ContextDefinition;
  type: {
    "@id": "Movie";
  };
  name: string;
  year: string;
  countryOfOrigin: {
    "@id": string;
  }[];
  director: {
    "@id": string;
  }[];
  screenwritter: {
    "@id": string;
  }[];
  musicBy: {
    "@id": string;
  }[];
  cinematographer: {
    "@id": string;
  }[];
}
