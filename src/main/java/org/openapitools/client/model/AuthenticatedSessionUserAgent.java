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
import org.openapitools.client.model.AuthenticatedSessionUserAgentDevice;
import org.openapitools.client.model.AuthenticatedSessionUserAgentOs;
import org.openapitools.client.model.AuthenticatedSessionUserAgentUserAgent;

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
 * Get parsed user agent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class AuthenticatedSessionUserAgent {
  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private AuthenticatedSessionUserAgentDevice device;

  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private AuthenticatedSessionUserAgentOs os;

  public static final String SERIALIZED_NAME_USER_AGENT = "user_agent";
  @SerializedName(SERIALIZED_NAME_USER_AGENT)
  private AuthenticatedSessionUserAgentUserAgent userAgent;

  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  private String string;

  public AuthenticatedSessionUserAgent() {
  }

  public AuthenticatedSessionUserAgent device(AuthenticatedSessionUserAgentDevice device) {
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
   */
  @javax.annotation.Nonnull
  public AuthenticatedSessionUserAgentDevice getDevice() {
    return device;
  }

  public void setDevice(AuthenticatedSessionUserAgentDevice device) {
    this.device = device;
  }


  public AuthenticatedSessionUserAgent os(AuthenticatedSessionUserAgentOs os) {
    this.os = os;
    return this;
  }

  /**
   * Get os
   * @return os
   */
  @javax.annotation.Nonnull
  public AuthenticatedSessionUserAgentOs getOs() {
    return os;
  }

  public void setOs(AuthenticatedSessionUserAgentOs os) {
    this.os = os;
  }


  public AuthenticatedSessionUserAgent userAgent(AuthenticatedSessionUserAgentUserAgent userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Get userAgent
   * @return userAgent
   */
  @javax.annotation.Nonnull
  public AuthenticatedSessionUserAgentUserAgent getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(AuthenticatedSessionUserAgentUserAgent userAgent) {
    this.userAgent = userAgent;
  }


  public AuthenticatedSessionUserAgent string(String string) {
    this.string = string;
    return this;
  }

  /**
   * Get string
   * @return string
   */
  @javax.annotation.Nonnull
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatedSessionUserAgent authenticatedSessionUserAgent = (AuthenticatedSessionUserAgent) o;
    return Objects.equals(this.device, authenticatedSessionUserAgent.device) &&
        Objects.equals(this.os, authenticatedSessionUserAgent.os) &&
        Objects.equals(this.userAgent, authenticatedSessionUserAgent.userAgent) &&
        Objects.equals(this.string, authenticatedSessionUserAgent.string);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, os, userAgent, string);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatedSessionUserAgent {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
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
    openapiFields.add("device");
    openapiFields.add("os");
    openapiFields.add("user_agent");
    openapiFields.add("string");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("device");
    openapiRequiredFields.add("os");
    openapiRequiredFields.add("user_agent");
    openapiRequiredFields.add("string");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthenticatedSessionUserAgent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthenticatedSessionUserAgent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticatedSessionUserAgent is not found in the empty JSON string", AuthenticatedSessionUserAgent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthenticatedSessionUserAgent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticatedSessionUserAgent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthenticatedSessionUserAgent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `device`
      AuthenticatedSessionUserAgentDevice.validateJsonElement(jsonObj.get("device"));
      // validate the required field `os`
      AuthenticatedSessionUserAgentOs.validateJsonElement(jsonObj.get("os"));
      // validate the required field `user_agent`
      AuthenticatedSessionUserAgentUserAgent.validateJsonElement(jsonObj.get("user_agent"));
      if (!jsonObj.get("string").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticatedSessionUserAgent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticatedSessionUserAgent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticatedSessionUserAgent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticatedSessionUserAgent.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticatedSessionUserAgent>() {
           @Override
           public void write(JsonWriter out, AuthenticatedSessionUserAgent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticatedSessionUserAgent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthenticatedSessionUserAgent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticatedSessionUserAgent
   * @throws IOException if the JSON string is invalid with respect to AuthenticatedSessionUserAgent
   */
  public static AuthenticatedSessionUserAgent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticatedSessionUserAgent.class);
  }

  /**
   * Convert an instance of AuthenticatedSessionUserAgent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

