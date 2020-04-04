package com.aneesh.football.aneeshfootballmatch.domain.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;

public class CountryDeserializer extends StdDeserializer<Country> {

    private static final long serialVersionUID = 1883547683050039861L;

    public CountryDeserializer() {
        this(null);
    }

    public CountryDeserializer(final Class<?> vc) {
        super(vc);
    }

    /**
     * {"id":1,"itemNr":"theItem","owner":2}
     */
    @Override
    public Country deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        final JsonNode node = jp.getCodec()
            .readTree(jp);
        final String countryId =  node.get("country_id").asText();
        final String countryNameName = node.get("country_name")
            .asText();
     

        return new Country(countryId, countryNameName);
    }

}
