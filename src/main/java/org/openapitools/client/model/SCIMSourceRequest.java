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
import org.openapitools.client.model.UserMatchingModeEnum;

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
 * SCIMSource Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class SCIMSourceRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_USER_MATCHING_MODE = "user_matching_mode";
  @SerializedName(SERIALIZED_NAME_USER_MATCHING_MODE)
  private UserMatchingModeEnum userMatchingMode;

  public static final String SERIALIZED_NAME_USER_PATH_TEMPLATE = "user_path_template";
  @SerializedName(SERIALIZED_NAME_USER_PATH_TEMPLATE)
  private String userPathTemplate;

  public SCIMSourceRequest() {
  }

  public SCIMSourceRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Source&#39;s display Name.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SCIMSourceRequest slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Internal source name, used in URLs.
   * @return slug
   */
  @javax.annotation.Nonnull
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  public SCIMSourceRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public SCIMSourceRequest userMatchingMode(UserMatchingModeEnum userMatchingMode) {
    this.userMatchingMode = userMatchingMode;
    return this;
  }

  /**
   * How the source determines if an existing user should be authenticated or a new user enrolled.
   * @return userMatchingMode
   */
  @javax.annotation.Nullable
  public UserMatchingModeEnum getUserMatchingMode() {
    return userMatchingMode;
  }

  public void setUserMatchingMode(UserMatchingModeEnum userMatchingMode) {
    this.userMatchingMode = userMatchingMode;
  }


  public SCIMSourceRequest userPathTemplate(String userPathTemplate) {
    this.userPathTemplate = userPathTemplate;
    return this;
  }

  /**
   * Get userPathTemplate
   * @return userPathTemplate
   */
  @javax.annotation.Nullable
  public String getUserPathTemplate() {
    return userPathTemplate;
  }

  public void setUserPathTemplate(String userPathTemplate) {
    this.userPathTemplate = userPathTemplate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCIMSourceRequest scIMSourceRequest = (SCIMSourceRequest) o;
    return Objects.equals(this.name, scIMSourceRequest.name) &&
        Objects.equals(this.slug, scIMSourceRequest.slug) &&
        Objects.equals(this.enabled, scIMSourceRequest.enabled) &&
        Objects.equals(this.userMatchingMode, scIMSourceRequest.userMatchingMode) &&
        Objects.equals(this.userPathTemplate, scIMSourceRequest.userPathTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, enabled, userMatchingMode, userPathTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCIMSourceRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    userMatchingMode: ").append(toIndentedString(userMatchingMode)).append("\n");
    sb.append("    userPathTemplate: ").append(toIndentedString(userPathTemplate)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("slug");
    openapiFields.add("enabled");
    openapiFields.add("user_matching_mode");
    openapiFields.add("user_path_template");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("slug");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SCIMSourceRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SCIMSourceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SCIMSourceRequest is not found in the empty JSON string", SCIMSourceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SCIMSourceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SCIMSourceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SCIMSourceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      // validate the optional field `user_matching_mode`
      if (jsonObj.get("user_matching_mode") != null && !jsonObj.get("user_matching_mode").isJsonNull()) {
        UserMatchingModeEnum.validateJsonElement(jsonObj.get("user_matching_mode"));
      }
      if ((jsonObj.get("user_path_template") != null && !jsonObj.get("user_path_template").isJsonNull()) && !jsonObj.get("user_path_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_path_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_path_template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SCIMSourceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SCIMSourceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SCIMSourceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SCIMSourceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SCIMSourceRequest>() {
           @Override
           public void write(JsonWriter out, SCIMSourceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SCIMSourceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SCIMSourceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SCIMSourceRequest
   * @throws IOException if the JSON string is invalid with respect to SCIMSourceRequest
   */
  public static SCIMSourceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SCIMSourceRequest.class);
  }

  /**
   * Convert an instance of SCIMSourceRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

