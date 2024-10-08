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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * AuthenticatorDuoStageManualDeviceImportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class AuthenticatorDuoStageManualDeviceImportRequest {
  public static final String SERIALIZED_NAME_DUO_USER_ID = "duo_user_id";
  @SerializedName(SERIALIZED_NAME_DUO_USER_ID)
  private String duoUserId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public AuthenticatorDuoStageManualDeviceImportRequest() {
  }

  public AuthenticatorDuoStageManualDeviceImportRequest duoUserId(String duoUserId) {
    this.duoUserId = duoUserId;
    return this;
  }

  /**
   * Get duoUserId
   * @return duoUserId
   */
  @javax.annotation.Nonnull
  public String getDuoUserId() {
    return duoUserId;
  }

  public void setDuoUserId(String duoUserId) {
    this.duoUserId = duoUserId;
  }


  public AuthenticatorDuoStageManualDeviceImportRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatorDuoStageManualDeviceImportRequest authenticatorDuoStageManualDeviceImportRequest = (AuthenticatorDuoStageManualDeviceImportRequest) o;
    return Objects.equals(this.duoUserId, authenticatorDuoStageManualDeviceImportRequest.duoUserId) &&
        Objects.equals(this.username, authenticatorDuoStageManualDeviceImportRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duoUserId, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatorDuoStageManualDeviceImportRequest {\n");
    sb.append("    duoUserId: ").append(toIndentedString(duoUserId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("duo_user_id");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("duo_user_id");
    openapiRequiredFields.add("username");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthenticatorDuoStageManualDeviceImportRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthenticatorDuoStageManualDeviceImportRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticatorDuoStageManualDeviceImportRequest is not found in the empty JSON string", AuthenticatorDuoStageManualDeviceImportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthenticatorDuoStageManualDeviceImportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticatorDuoStageManualDeviceImportRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthenticatorDuoStageManualDeviceImportRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("duo_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duo_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duo_user_id").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticatorDuoStageManualDeviceImportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticatorDuoStageManualDeviceImportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticatorDuoStageManualDeviceImportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticatorDuoStageManualDeviceImportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticatorDuoStageManualDeviceImportRequest>() {
           @Override
           public void write(JsonWriter out, AuthenticatorDuoStageManualDeviceImportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticatorDuoStageManualDeviceImportRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthenticatorDuoStageManualDeviceImportRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticatorDuoStageManualDeviceImportRequest
   * @throws IOException if the JSON string is invalid with respect to AuthenticatorDuoStageManualDeviceImportRequest
   */
  public static AuthenticatorDuoStageManualDeviceImportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticatorDuoStageManualDeviceImportRequest.class);
  }

  /**
   * Convert an instance of AuthenticatorDuoStageManualDeviceImportRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

