import { ContextDefinition } from "jsonld";

/**
 * =============================================================================
 * filmContext: JSONLD Context for film
 * =============================================================================
 */
export const filmContext: ContextDefinition = {
  type: {
    "@id": "@type",
  },
  Movie: "http://schema.org/Movie",
  name: {
    "@id": "http://schema.org/name",
    "@type": "http://www.w3.org/2001/XMLSchema#string",
  },
  year: {
    "@id": "http://example.com/year",
    "@type": "http://www.w3.org/2001/XMLSchema#dateTimeStamp",
  },
  countryOfOrigin: {
    "@id": "http://schema.org/countryOfOrigin",
    "@type": "@id",
    "@container": "@set",
  },
  director: {
    "@id": "http://schema.org/director",
    "@type": "@id",
    "@container": "@set",
  },
  screenwritter: {
    "@id": "http://example.com/screenwritter",
    "@type": "@id",
    "@container": "@set",
  },
  musicBy: {
    "@id": "http://schema.org/musicBy",
    "@type": "@id",
    "@container": "@set",
  },
  cinematographer: {
    "@id": "http://example.com/cinematographer",
    "@type": "@id",
    "@container": "@set",
  },
};
