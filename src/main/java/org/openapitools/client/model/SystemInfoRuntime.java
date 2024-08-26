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
 * Get versions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class SystemInfoRuntime {
  public static final String SERIALIZED_NAME_PYTHON_VERSION = "python_version";
  @SerializedName(SERIALIZED_NAME_PYTHON_VERSION)
  private String pythonVersion;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
  private String architecture;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_UNAME = "uname";
  @SerializedName(SERIALIZED_NAME_UNAME)
  private String uname;

  public static final String SERIALIZED_NAME_OPENSSL_VERSION = "openssl_version";
  @SerializedName(SERIALIZED_NAME_OPENSSL_VERSION)
  private String opensslVersion;

  public static final String SERIALIZED_NAME_OPENSSL_FIPS_ENABLED = "openssl_fips_enabled";
  @SerializedName(SERIALIZED_NAME_OPENSSL_FIPS_ENABLED)
  private Boolean opensslFipsEnabled;

  public static final String SERIALIZED_NAME_AUTHENTIK_VERSION = "authentik_version";
  @SerializedName(SERIALIZED_NAME_AUTHENTIK_VERSION)
  private String authentikVersion;

  public SystemInfoRuntime() {
  }

  public SystemInfoRuntime pythonVersion(String pythonVersion) {
    this.pythonVersion = pythonVersion;
    return this;
  }

  /**
   * Get pythonVersion
   * @return pythonVersion
   */
  @javax.annotation.Nonnull
  public String getPythonVersion() {
    return pythonVersion;
  }

  public void setPythonVersion(String pythonVersion) {
    this.pythonVersion = pythonVersion;
  }


  public SystemInfoRuntime environment(String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   */
  @javax.annotation.Nonnull
  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public SystemInfoRuntime architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
   */
  @javax.annotation.Nonnull
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }


  public SystemInfoRuntime platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @javax.annotation.Nonnull
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public SystemInfoRuntime uname(String uname) {
    this.uname = uname;
    return this;
  }

  /**
   * Get uname
   * @return uname
   */
  @javax.annotation.Nonnull
  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public SystemInfoRuntime opensslVersion(String opensslVersion) {
    this.opensslVersion = opensslVersion;
    return this;
  }

  /**
   * Get opensslVersion
   * @return opensslVersion
   */
  @javax.annotation.Nonnull
  public String getOpensslVersion() {
    return opensslVersion;
  }

  public void setOpensslVersion(String opensslVersion) {
    this.opensslVersion = opensslVersion;
  }


  public SystemInfoRuntime opensslFipsEnabled(Boolean opensslFipsEnabled) {
    this.opensslFipsEnabled = opensslFipsEnabled;
    return this;
  }

  /**
   * Get opensslFipsEnabled
   * @return opensslFipsEnabled
   */
  @javax.annotation.Nullable
  public Boolean getOpensslFipsEnabled() {
    return opensslFipsEnabled;
  }

  public void setOpensslFipsEnabled(Boolean opensslFipsEnabled) {
    this.opensslFipsEnabled = opensslFipsEnabled;
  }


  public SystemInfoRuntime authentikVersion(String authentikVersion) {
    this.authentikVersion = authentikVersion;
    return this;
  }

  /**
   * Get authentikVersion
   * @return authentikVersion
   */
  @javax.annotation.Nonnull
  public String getAuthentikVersion() {
    return authentikVersion;
  }

  public void setAuthentikVersion(String authentikVersion) {
    this.authentikVersion = authentikVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfoRuntime systemInfoRuntime = (SystemInfoRuntime) o;
    return Objects.equals(this.pythonVersion, systemInfoRuntime.pythonVersion) &&
        Objects.equals(this.environment, systemInfoRuntime.environment) &&
        Objects.equals(this.architecture, systemInfoRuntime.architecture) &&
        Objects.equals(this.platform, systemInfoRuntime.platform) &&
        Objects.equals(this.uname, systemInfoRuntime.uname) &&
        Objects.equals(this.opensslVersion, systemInfoRuntime.opensslVersion) &&
        Objects.equals(this.opensslFipsEnabled, systemInfoRuntime.opensslFipsEnabled) &&
        Objects.equals(this.authentikVersion, systemInfoRuntime.authentikVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pythonVersion, environment, architecture, platform, uname, opensslVersion, opensslFipsEnabled, authentikVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfoRuntime {\n");
    sb.append("    pythonVersion: ").append(toIndentedString(pythonVersion)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    uname: ").append(toIndentedString(uname)).append("\n");
    sb.append("    opensslVersion: ").append(toIndentedString(opensslVersion)).append("\n");
    sb.append("    opensslFipsEnabled: ").append(toIndentedString(opensslFipsEnabled)).append("\n");
    sb.append("    authentikVersion: ").append(toIndentedString(authentikVersion)).append("\n");
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
    openapiFields.add("python_version");
    openapiFields.add("environment");
    openapiFields.add("architecture");
    openapiFields.add("platform");
    openapiFields.add("uname");
    openapiFields.add("openssl_version");
    openapiFields.add("openssl_fips_enabled");
    openapiFields.add("authentik_version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("python_version");
    openapiRequiredFields.add("environment");
    openapiRequiredFields.add("architecture");
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("uname");
    openapiRequiredFields.add("openssl_version");
    openapiRequiredFields.add("openssl_fips_enabled");
    openapiRequiredFields.add("authentik_version");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SystemInfoRuntime
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SystemInfoRuntime.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SystemInfoRuntime is not found in the empty JSON string", SystemInfoRuntime.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SystemInfoRuntime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SystemInfoRuntime` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SystemInfoRuntime.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("python_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `python_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("python_version").toString()));
      }
      if (!jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
      if (!jsonObj.get("architecture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `architecture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("architecture").toString()));
      }
      if (!jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if (!jsonObj.get("uname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uname").toString()));
      }
      if (!jsonObj.get("openssl_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `openssl_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("openssl_version").toString()));
      }
      if (!jsonObj.get("authentik_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authentik_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authentik_version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SystemInfoRuntime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SystemInfoRuntime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SystemInfoRuntime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SystemInfoRuntime.class));

       return (TypeAdapter<T>) new TypeAdapter<SystemInfoRuntime>() {
           @Override
           public void write(JsonWriter out, SystemInfoRuntime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SystemInfoRuntime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SystemInfoRuntime given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SystemInfoRuntime
   * @throws IOException if the JSON string is invalid with respect to SystemInfoRuntime
   */
  public static SystemInfoRuntime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SystemInfoRuntime.class);
  }

  /**
   * Convert an instance of SystemInfoRuntime to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

