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

/**
 * Common properties of language script.
 */
@Immutable
public class LanguageScript implements JsonSerializable<LanguageScript> {
    /*
     * Code identifying the script.
     */
    @Generated
    private final String code;

    /*
     * Display name of the script in the locale requested via Accept-Language header.
     */
    @Generated
    private final String name;

    /*
     * Display name of the language in the locale native for the language.
     */
    @Generated
    private final String nativeName;

    /*
     * Directionality, which is rtl for right-to-left languages or ltr for left-to-right languages.
     */
    @Generated
    private final LanguageDirectionality directionality;

    /**
     * Creates an instance of LanguageScript class.
     * 
     * @param code the code value to set.
     * @param name the name value to set.
     * @param nativeName the nativeName value to set.
     * @param directionality the directionality value to set.
     */
    @Generated
    protected LanguageScript(String code, String name, String nativeName, LanguageDirectionality directionality) {
        this.code = code;
        this.name = name;
        this.nativeName = nativeName;
        this.directionality = directionality;
    }

    /**
     * Get the code property: Code identifying the script.
     * 
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the name property: Display name of the script in the locale requested via Accept-Language header.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the nativeName property: Display name of the language in the locale native for the language.
     * 
     * @return the nativeName value.
     */
    @Generated
    public String getNativeName() {
        return this.nativeName;
    }

    /**
     * Get the directionality property: Directionality, which is rtl for right-to-left languages or ltr for
     * left-to-right languages.
     * 
     * @return the directionality value.
     */
    @Generated
    public LanguageDirectionality getDirectionality() {
        return this.directionality;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("nativeName", this.nativeName);
        jsonWriter.writeStringField("dir", this.directionality == null ? null : this.directionality.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LanguageScript from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LanguageScript if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LanguageScript.
     */
    @Generated
    public static LanguageScript fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String code = null;
            String name = null;
            String nativeName = null;
            LanguageDirectionality directionality = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    code = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("nativeName".equals(fieldName)) {
                    nativeName = reader.getString();
                } else if ("dir".equals(fieldName)) {
                    directionality = LanguageDirectionality.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new LanguageScript(code, name, nativeName, directionality);
        });
    }
}
