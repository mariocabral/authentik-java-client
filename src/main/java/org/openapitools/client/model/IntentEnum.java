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
 * Gets or Sets IntentEnum
 */
@JsonAdapter(IntentEnum.Adapter.class)
public enum IntentEnum {
  
  VERIFICATION("verification"),
  
  API("api"),
  
  RECOVERY("recovery"),
  
  APP_PASSWORD("app_password");

  private String value;

  IntentEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IntentEnum fromValue(String value) {
    for (IntentEnum b : IntentEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IntentEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final IntentEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IntentEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IntentEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    IntentEnum.fromValue(value);
  }
}

