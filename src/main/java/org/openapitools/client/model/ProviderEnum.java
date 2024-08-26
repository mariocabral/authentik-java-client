/*
 * authentik
 * Making authentication simple.
 *
 * The version of the OpenAPI document: 2024.6.3
 * Contact: hello@goauthentik.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ProviderEnum
 */
@JsonAdapter(ProviderEnum.Adapter.class)
public enum ProviderEnum {
  
  TWILIO("twilio"),
  
  GENERIC("generic");

  private String value;

  ProviderEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProviderEnum fromValue(String value) {
    for (ProviderEnum b : ProviderEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ProviderEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProviderEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProviderEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProviderEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ProviderEnum.fromValue(value);
  }
}

