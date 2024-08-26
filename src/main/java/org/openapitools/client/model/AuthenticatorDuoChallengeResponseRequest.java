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
 * Pseudo class for duo response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class AuthenticatorDuoChallengeResponseRequest {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "ak-stage-authenticator-duo";

  public AuthenticatorDuoChallengeResponseRequest() {
  }

  public AuthenticatorDuoChallengeResponseRequest component(String component) {
    this.component = component;
    return this;
  }

  /**
   * Get component
   * @return component
   */
  @javax.annotation.Nullable
  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatorDuoChallengeResponseRequest authenticatorDuoChallengeResponseRequest = (AuthenticatorDuoChallengeResponseRequest) o;
    return Objects.equals(this.component, authenticatorDuoChallengeResponseRequest.component);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatorDuoChallengeResponseRequest {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
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
    openapiFields.add("component");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthenticatorDuoChallengeResponseRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthenticatorDuoChallengeResponseRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticatorDuoChallengeResponseRequest is not found in the empty JSON string", AuthenticatorDuoChallengeResponseRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthenticatorDuoChallengeResponseRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticatorDuoChallengeResponseRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) && !jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticatorDuoChallengeResponseRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticatorDuoChallengeResponseRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticatorDuoChallengeResponseRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticatorDuoChallengeResponseRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticatorDuoChallengeResponseRequest>() {
           @Override
           public void write(JsonWriter out, AuthenticatorDuoChallengeResponseRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticatorDuoChallengeResponseRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthenticatorDuoChallengeResponseRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticatorDuoChallengeResponseRequest
   * @throws IOException if the JSON string is invalid with respect to AuthenticatorDuoChallengeResponseRequest
   */
  public static AuthenticatorDuoChallengeResponseRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticatorDuoChallengeResponseRequest.class);
  }

  /**
   * Convert an instance of AuthenticatorDuoChallengeResponseRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

