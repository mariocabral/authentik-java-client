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
 * Gets or Sets BlueprintInstanceStatusEnum
 */
@JsonAdapter(BlueprintInstanceStatusEnum.Adapter.class)
public enum BlueprintInstanceStatusEnum {
  
  SUCCESSFUL("successful"),
  
  WARNING("warning"),
  
  ERROR("error"),
  
  ORPHANED("orphaned"),
  
  UNKNOWN("unknown");

  private String value;

  BlueprintInstanceStatusEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BlueprintInstanceStatusEnum fromValue(String value) {
    for (BlueprintInstanceStatusEnum b : BlueprintInstanceStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BlueprintInstanceStatusEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final BlueprintInstanceStatusEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BlueprintInstanceStatusEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BlueprintInstanceStatusEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    BlueprintInstanceStatusEnum.fromValue(value);
  }
}

