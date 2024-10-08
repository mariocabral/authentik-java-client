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
public class PatchedSCIMSourceRequest {
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

  public PatchedSCIMSourceRequest() {
  }

  public PatchedSCIMSourceRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Source&#39;s display Name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PatchedSCIMSourceRequest slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Internal source name, used in URLs.
   * @return slug
   */
  @javax.annotation.Nullable
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  public PatchedSCIMSourceRequest enabled(Boolean enabled) {
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


  public PatchedSCIMSourceRequest userMatchingMode(UserMatchingModeEnum userMatchingMode) {
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


  public PatchedSCIMSourceRequest userPathTemplate(String userPathTemplate) {
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
    PatchedSCIMSourceRequest patchedSCIMSourceRequest = (PatchedSCIMSourceRequest) o;
    return Objects.equals(this.name, patchedSCIMSourceRequest.name) &&
        Objects.equals(this.slug, patchedSCIMSourceRequest.slug) &&
        Objects.equals(this.enabled, patchedSCIMSourceRequest.enabled) &&
        Objects.equals(this.userMatchingMode, patchedSCIMSourceRequest.userMatchingMode) &&
        Objects.equals(this.userPathTemplate, patchedSCIMSourceRequest.userPathTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, enabled, userMatchingMode, userPathTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchedSCIMSourceRequest {\n");
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
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatchedSCIMSourceRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchedSCIMSourceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchedSCIMSourceRequest is not found in the empty JSON string", PatchedSCIMSourceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchedSCIMSourceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchedSCIMSourceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
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
       if (!PatchedSCIMSourceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchedSCIMSourceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchedSCIMSourceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchedSCIMSourceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchedSCIMSourceRequest>() {
           @Override
           public void write(JsonWriter out, PatchedSCIMSourceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchedSCIMSourceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatchedSCIMSourceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatchedSCIMSourceRequest
   * @throws IOException if the JSON string is invalid with respect to PatchedSCIMSourceRequest
   */
  public static PatchedSCIMSourceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchedSCIMSourceRequest.class);
  }

  /**
   * Convert an instance of PatchedSCIMSourceRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

