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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * SCIMProvider Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class SCIMProviderRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY_MAPPINGS = "property_mappings";
  @SerializedName(SERIALIZED_NAME_PROPERTY_MAPPINGS)
  private List<UUID> propertyMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTY_MAPPINGS_GROUP = "property_mappings_group";
  @SerializedName(SERIALIZED_NAME_PROPERTY_MAPPINGS_GROUP)
  private List<UUID> propertyMappingsGroup = new ArrayList<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_EXCLUDE_USERS_SERVICE_ACCOUNT = "exclude_users_service_account";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_USERS_SERVICE_ACCOUNT)
  private Boolean excludeUsersServiceAccount;

  public static final String SERIALIZED_NAME_FILTER_GROUP = "filter_group";
  @SerializedName(SERIALIZED_NAME_FILTER_GROUP)
  private UUID filterGroup;

  public SCIMProviderRequest() {
  }

  public SCIMProviderRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SCIMProviderRequest propertyMappings(List<UUID> propertyMappings) {
    this.propertyMappings = propertyMappings;
    return this;
  }

  public SCIMProviderRequest addPropertyMappingsItem(UUID propertyMappingsItem) {
    if (this.propertyMappings == null) {
      this.propertyMappings = new ArrayList<>();
    }
    this.propertyMappings.add(propertyMappingsItem);
    return this;
  }

  /**
   * Get propertyMappings
   * @return propertyMappings
   */
  @javax.annotation.Nullable
  public List<UUID> getPropertyMappings() {
    return propertyMappings;
  }

  public void setPropertyMappings(List<UUID> propertyMappings) {
    this.propertyMappings = propertyMappings;
  }


  public SCIMProviderRequest propertyMappingsGroup(List<UUID> propertyMappingsGroup) {
    this.propertyMappingsGroup = propertyMappingsGroup;
    return this;
  }

  public SCIMProviderRequest addPropertyMappingsGroupItem(UUID propertyMappingsGroupItem) {
    if (this.propertyMappingsGroup == null) {
      this.propertyMappingsGroup = new ArrayList<>();
    }
    this.propertyMappingsGroup.add(propertyMappingsGroupItem);
    return this;
  }

  /**
   * Property mappings used for group creation/updating.
   * @return propertyMappingsGroup
   */
  @javax.annotation.Nullable
  public List<UUID> getPropertyMappingsGroup() {
    return propertyMappingsGroup;
  }

  public void setPropertyMappingsGroup(List<UUID> propertyMappingsGroup) {
    this.propertyMappingsGroup = propertyMappingsGroup;
  }


  public SCIMProviderRequest url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Base URL to SCIM requests, usually ends in /v2
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public SCIMProviderRequest token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication token
   * @return token
   */
  @javax.annotation.Nonnull
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  public SCIMProviderRequest excludeUsersServiceAccount(Boolean excludeUsersServiceAccount) {
    this.excludeUsersServiceAccount = excludeUsersServiceAccount;
    return this;
  }

  /**
   * Get excludeUsersServiceAccount
   * @return excludeUsersServiceAccount
   */
  @javax.annotation.Nullable
  public Boolean getExcludeUsersServiceAccount() {
    return excludeUsersServiceAccount;
  }

  public void setExcludeUsersServiceAccount(Boolean excludeUsersServiceAccount) {
    this.excludeUsersServiceAccount = excludeUsersServiceAccount;
  }


  public SCIMProviderRequest filterGroup(UUID filterGroup) {
    this.filterGroup = filterGroup;
    return this;
  }

  /**
   * Get filterGroup
   * @return filterGroup
   */
  @javax.annotation.Nullable
  public UUID getFilterGroup() {
    return filterGroup;
  }

  public void setFilterGroup(UUID filterGroup) {
    this.filterGroup = filterGroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SCIMProviderRequest scIMProviderRequest = (SCIMProviderRequest) o;
    return Objects.equals(this.name, scIMProviderRequest.name) &&
        Objects.equals(this.propertyMappings, scIMProviderRequest.propertyMappings) &&
        Objects.equals(this.propertyMappingsGroup, scIMProviderRequest.propertyMappingsGroup) &&
        Objects.equals(this.url, scIMProviderRequest.url) &&
        Objects.equals(this.token, scIMProviderRequest.token) &&
        Objects.equals(this.excludeUsersServiceAccount, scIMProviderRequest.excludeUsersServiceAccount) &&
        Objects.equals(this.filterGroup, scIMProviderRequest.filterGroup);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, propertyMappings, propertyMappingsGroup, url, token, excludeUsersServiceAccount, filterGroup);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SCIMProviderRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyMappings: ").append(toIndentedString(propertyMappings)).append("\n");
    sb.append("    propertyMappingsGroup: ").append(toIndentedString(propertyMappingsGroup)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    excludeUsersServiceAccount: ").append(toIndentedString(excludeUsersServiceAccount)).append("\n");
    sb.append("    filterGroup: ").append(toIndentedString(filterGroup)).append("\n");
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
    openapiFields.add("property_mappings");
    openapiFields.add("property_mappings_group");
    openapiFields.add("url");
    openapiFields.add("token");
    openapiFields.add("exclude_users_service_account");
    openapiFields.add("filter_group");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("token");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SCIMProviderRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SCIMProviderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SCIMProviderRequest is not found in the empty JSON string", SCIMProviderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SCIMProviderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SCIMProviderRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SCIMProviderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("property_mappings") != null && !jsonObj.get("property_mappings").isJsonNull() && !jsonObj.get("property_mappings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_mappings` to be an array in the JSON string but got `%s`", jsonObj.get("property_mappings").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("property_mappings_group") != null && !jsonObj.get("property_mappings_group").isJsonNull() && !jsonObj.get("property_mappings_group").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_mappings_group` to be an array in the JSON string but got `%s`", jsonObj.get("property_mappings_group").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("filter_group") != null && !jsonObj.get("filter_group").isJsonNull()) && !jsonObj.get("filter_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter_group").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SCIMProviderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SCIMProviderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SCIMProviderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SCIMProviderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SCIMProviderRequest>() {
           @Override
           public void write(JsonWriter out, SCIMProviderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SCIMProviderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SCIMProviderRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SCIMProviderRequest
   * @throws IOException if the JSON string is invalid with respect to SCIMProviderRequest
   */
  public static SCIMProviderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SCIMProviderRequest.class);
  }

  /**
   * Convert an instance of SCIMProviderRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

