// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.v2.annotation.Generated;
import com.azure.core.v2.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Element containing the text with translation.
 */
@Immutable
public final class DictionaryExampleTextItem extends InputTextItem {
    /*
     * A string specifying the translated text previously returned by the Dictionary lookup operation.
     * This should be the value from the normalizedTarget field in the translations list of the Dictionary
     * lookup response. The service will return examples for the specific source-target word-pair.
     */
    @Generated
    private final String translation;

    /**
     * Creates an instance of DictionaryExampleTextItem class.
     * 
     * @param text the text value to set.
     * @param translation the translation value to set.
     */
    @Generated
    public DictionaryExampleTextItem(String text, String translation) {
        super(text);
        this.translation = translation;
    }

    /**
     * Get the translation property: A string specifying the translated text previously returned by the Dictionary
     * lookup operation.
     * This should be the value from the normalizedTarget field in the translations list of the Dictionary
     * lookup response. The service will return examples for the specific source-target word-pair.
     * 
     * @return the translation value.
     */
    @Generated
    public String getTranslation() {
        return this.translation;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", getText());
        jsonWriter.writeStringField("translation", this.translation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DictionaryExampleTextItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DictionaryExampleTextItem if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DictionaryExampleTextItem.
     */
    @Generated
    public static DictionaryExampleTextItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String text = null;
            String translation = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else if ("translation".equals(fieldName)) {
                    translation = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new DictionaryExampleTextItem(text, translation);
        });
    }
}
