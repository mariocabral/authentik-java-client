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
 * Gets or Sets UserTypeEnum
 */
@JsonAdapter(UserTypeEnum.Adapter.class)
public enum UserTypeEnum {
  
  INTERNAL("internal"),
  
  EXTERNAL("external"),
  
  SERVICE_ACCOUNT("service_account"),
  
  INTERNAL_SERVICE_ACCOUNT("internal_service_account");

  private String value;

  UserTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserTypeEnum fromValue(String value) {
    for (UserTypeEnum b : UserTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UserTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserTypeEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserTypeEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    UserTypeEnum.fromValue(value);
  }
}

