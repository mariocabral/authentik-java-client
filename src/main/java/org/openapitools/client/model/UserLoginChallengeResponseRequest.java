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
 * User login challenge
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class UserLoginChallengeResponseRequest {
  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "ak-stage-user-login";

  public static final String SERIALIZED_NAME_REMEMBER_ME = "remember_me";
  @SerializedName(SERIALIZED_NAME_REMEMBER_ME)
  private Boolean rememberMe;

  public UserLoginChallengeResponseRequest() {
  }

  public UserLoginChallengeResponseRequest component(String component) {
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


  public UserLoginChallengeResponseRequest rememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
    return this;
  }

  /**
   * Get rememberMe
   * @return rememberMe
   */
  @javax.annotation.Nonnull
  public Boolean getRememberMe() {
    return rememberMe;
  }

  public void setRememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLoginChallengeResponseRequest userLoginChallengeResponseRequest = (UserLoginChallengeResponseRequest) o;
    return Objects.equals(this.component, userLoginChallengeResponseRequest.component) &&
        Objects.equals(this.rememberMe, userLoginChallengeResponseRequest.rememberMe);
  }

  @Override
  public int hashCode() {
    return Objects.hash(component, rememberMe);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLoginChallengeResponseRequest {\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
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
    openapiFields.add("remember_me");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("remember_me");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UserLoginChallengeResponseRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserLoginChallengeResponseRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserLoginChallengeResponseRequest is not found in the empty JSON string", UserLoginChallengeResponseRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserLoginChallengeResponseRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserLoginChallengeResponseRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserLoginChallengeResponseRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
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
       if (!UserLoginChallengeResponseRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserLoginChallengeResponseRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserLoginChallengeResponseRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserLoginChallengeResponseRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UserLoginChallengeResponseRequest>() {
           @Override
           public void write(JsonWriter out, UserLoginChallengeResponseRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserLoginChallengeResponseRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UserLoginChallengeResponseRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UserLoginChallengeResponseRequest
   * @throws IOException if the JSON string is invalid with respect to UserLoginChallengeResponseRequest
   */
  public static UserLoginChallengeResponseRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserLoginChallengeResponseRequest.class);
  }

  /**
   * Convert an instance of UserLoginChallengeResponseRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

