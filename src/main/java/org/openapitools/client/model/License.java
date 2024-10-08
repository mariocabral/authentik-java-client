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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;

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
 * License Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class License {
  public static final String SERIALIZED_NAME_LICENSE_UUID = "license_uuid";
  @SerializedName(SERIALIZED_NAME_LICENSE_UUID)
  private UUID licenseUuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private OffsetDateTime expiry;

  public static final String SERIALIZED_NAME_INTERNAL_USERS = "internal_users";
  @SerializedName(SERIALIZED_NAME_INTERNAL_USERS)
  private Integer internalUsers;

  public static final String SERIALIZED_NAME_EXTERNAL_USERS = "external_users";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USERS)
  private Integer externalUsers;

  public License() {
  }

  public License(
     UUID licenseUuid, 
     String name, 
     OffsetDateTime expiry, 
     Integer internalUsers, 
     Integer externalUsers
  ) {
    this();
    this.licenseUuid = licenseUuid;
    this.name = name;
    this.expiry = expiry;
    this.internalUsers = internalUsers;
    this.externalUsers = externalUsers;
  }

  /**
   * Get licenseUuid
   * @return licenseUuid
   */
  @javax.annotation.Nonnull
  public UUID getLicenseUuid() {
    return licenseUuid;
  }



  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }



  public License key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  /**
   * Get expiry
   * @return expiry
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getExpiry() {
    return expiry;
  }



  /**
   * Get internalUsers
   * @return internalUsers
   */
  @javax.annotation.Nonnull
  public Integer getInternalUsers() {
    return internalUsers;
  }



  /**
   * Get externalUsers
   * @return externalUsers
   */
  @javax.annotation.Nonnull
  public Integer getExternalUsers() {
    return externalUsers;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    License license = (License) o;
    return Objects.equals(this.licenseUuid, license.licenseUuid) &&
        Objects.equals(this.name, license.name) &&
        Objects.equals(this.key, license.key) &&
        Objects.equals(this.expiry, license.expiry) &&
        Objects.equals(this.internalUsers, license.internalUsers) &&
        Objects.equals(this.externalUsers, license.externalUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseUuid, name, key, expiry, internalUsers, externalUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class License {\n");
    sb.append("    licenseUuid: ").append(toIndentedString(licenseUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    internalUsers: ").append(toIndentedString(internalUsers)).append("\n");
    sb.append("    externalUsers: ").append(toIndentedString(externalUsers)).append("\n");
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
    openapiFields.add("license_uuid");
    openapiFields.add("name");
    openapiFields.add("key");
    openapiFields.add("expiry");
    openapiFields.add("internal_users");
    openapiFields.add("external_users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("license_uuid");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("expiry");
    openapiRequiredFields.add("internal_users");
    openapiRequiredFields.add("external_users");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to License
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!License.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in License is not found in the empty JSON string", License.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!License.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `License` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : License.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("license_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_uuid").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!License.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'License' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<License> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(License.class));

       return (TypeAdapter<T>) new TypeAdapter<License>() {
           @Override
           public void write(JsonWriter out, License value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public License read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of License given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of License
   * @throws IOException if the JSON string is invalid with respect to License
   */
  public static License fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, License.class);
  }

  /**
   * Convert an instance of License to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

