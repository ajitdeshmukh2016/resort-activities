package com.heroku.ra.util.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonOnlyDaySerializer extends JsonSerializer<Date>
{
    @Override
    public void serialize(Date aDate, JsonGenerator aJsonGenerator, SerializerProvider aSerializerProvider)
            throws IOException, JsonProcessingException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
        String dateString = dateFormat.format(aDate);
        aJsonGenerator.writeString(dateString);
    }
}