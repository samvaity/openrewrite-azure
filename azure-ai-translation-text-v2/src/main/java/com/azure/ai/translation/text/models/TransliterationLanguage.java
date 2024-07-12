// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.v2.annotation.Generated;
import com.azure.core.v2.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The value of the transliteration property is a dictionary of (key, value) pairs.
 * Each key is a BCP 47 language tag. A key identifies a language for which text can be converted from one script
 * to another script.
 */
@Immutable
public final class TransliterationLanguage implements JsonSerializable<TransliterationLanguage> {
    /*
     * Display name of the language in the locale requested via Accept-Language header.
     */
    @Generated
    private final String name;

    /*
     * Display name of the language in the locale native for this language.
     */
    @Generated
    private final String nativeName;

    /*
     * List of scripts to convert from.
     */
    @Generated
    private final List<TransliterableScript> scripts;

    /**
     * Creates an instance of TransliterationLanguage class.
     * 
     * @param name the name value to set.
     * @param nativeName the nativeName value to set.
     * @param scripts the scripts value to set.
     */
    @Generated
    private TransliterationLanguage(String name, String nativeName, List<TransliterableScript> scripts) {
        this.name = name;
        this.nativeName = nativeName;
        this.scripts = scripts;
    }

    /**
     * Get the name property: Display name of the language in the locale requested via Accept-Language header.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the nativeName property: Display name of the language in the locale native for this language.
     * 
     * @return the nativeName value.
     */
    @Generated
    public String getNativeName() {
        return this.nativeName;
    }

    /**
     * Get the scripts property: List of scripts to convert from.
     * 
     * @return the scripts value.
     */
    @Generated
    public List<TransliterableScript> getScripts() {
        return this.scripts;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("nativeName", this.nativeName);
        jsonWriter.writeArrayField("scripts", this.scripts, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TransliterationLanguage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TransliterationLanguage if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TransliterationLanguage.
     */
    @Generated
    public static TransliterationLanguage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            String nativeName = null;
            List<TransliterableScript> scripts = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("nativeName".equals(fieldName)) {
                    nativeName = reader.getString();
                } else if ("scripts".equals(fieldName)) {
                    scripts = reader.readArray(reader1 -> TransliterableScript.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new TransliterationLanguage(name, nativeName, scripts);
        });
    }
}
