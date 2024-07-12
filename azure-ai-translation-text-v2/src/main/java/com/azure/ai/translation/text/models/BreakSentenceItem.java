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
 * Item containing break sentence result.
 */
@Immutable
public final class BreakSentenceItem implements JsonSerializable<BreakSentenceItem> {
    /*
     * The detectedLanguage property is only present in the result object when language auto-detection is requested.
     */
    @Generated
    private DetectedLanguage detectedLanguage;

    /*
     * An integer array representing the lengths of the sentences in the input text.
     * The length of the array is the number of sentences, and the values are the length of each sentence.
     */
    @Generated
    private final List<Integer> sentencesLengths;

    /**
     * Creates an instance of BreakSentenceItem class.
     * 
     * @param sentencesLengths the sentencesLengths value to set.
     */
    @Generated
    private BreakSentenceItem(List<Integer> sentencesLengths) {
        this.sentencesLengths = sentencesLengths;
    }

    /**
     * Get the detectedLanguage property: The detectedLanguage property is only present in the result object when
     * language auto-detection is requested.
     * 
     * @return the detectedLanguage value.
     */
    @Generated
    public DetectedLanguage getDetectedLanguage() {
        return this.detectedLanguage;
    }

    /**
     * Get the sentencesLengths property: An integer array representing the lengths of the sentences in the input text.
     * The length of the array is the number of sentences, and the values are the length of each sentence.
     * 
     * @return the sentencesLengths value.
     */
    @Generated
    public List<Integer> getSentencesLengths() {
        return this.sentencesLengths;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("sentLen", this.sentencesLengths, (writer, element) -> writer.writeInt(element));
        jsonWriter.writeJsonField("detectedLanguage", this.detectedLanguage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BreakSentenceItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BreakSentenceItem if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BreakSentenceItem.
     */
    @Generated
    public static BreakSentenceItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<Integer> sentencesLengths = null;
            DetectedLanguage detectedLanguage = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sentLen".equals(fieldName)) {
                    sentencesLengths = reader.readArray(reader1 -> reader1.getInt());
                } else if ("detectedLanguage".equals(fieldName)) {
                    detectedLanguage = DetectedLanguage.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            BreakSentenceItem deserializedBreakSentenceItem = new BreakSentenceItem(sentencesLengths);
            deserializedBreakSentenceItem.detectedLanguage = detectedLanguage;

            return deserializedBreakSentenceItem;
        });
    }
}
