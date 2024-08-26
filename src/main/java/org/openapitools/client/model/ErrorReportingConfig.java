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
 * Config for error reporting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class ErrorReportingConfig {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_SENTRY_DSN = "sentry_dsn";
  @SerializedName(SERIALIZED_NAME_SENTRY_DSN)
  private String sentryDsn;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private String environment;

  public static final String SERIALIZED_NAME_SEND_PII = "send_pii";
  @SerializedName(SERIALIZED_NAME_SEND_PII)
  private Boolean sendPii;

  public static final String SERIALIZED_NAME_TRACES_SAMPLE_RATE = "traces_sample_rate";
  @SerializedName(SERIALIZED_NAME_TRACES_SAMPLE_RATE)
  private Double tracesSampleRate;

  public ErrorReportingConfig() {
  }

  public ErrorReportingConfig(
     Boolean enabled, 
     String sentryDsn, 
     String environment, 
     Boolean sendPii, 
     Double tracesSampleRate
  ) {
    this();
    this.enabled = enabled;
    this.sentryDsn = sentryDsn;
    this.environment = environment;
    this.sendPii = sendPii;
    this.tracesSampleRate = tracesSampleRate;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nonnull
  public Boolean getEnabled() {
    return enabled;
  }



  /**
   * Get sentryDsn
   * @return sentryDsn
   */
  @javax.annotation.Nonnull
  public String getSentryDsn() {
    return sentryDsn;
  }



  /**
   * Get environment
   * @return environment
   */
  @javax.annotation.Nonnull
  public String getEnvironment() {
    return environment;
  }



  /**
   * Get sendPii
   * @return sendPii
   */
  @javax.annotation.Nonnull
  public Boolean getSendPii() {
    return sendPii;
  }



  /**
   * Get tracesSampleRate
   * @return tracesSampleRate
   */
  @javax.annotation.Nonnull
  public Double getTracesSampleRate() {
    return tracesSampleRate;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorReportingConfig errorReportingConfig = (ErrorReportingConfig) o;
    return Objects.equals(this.enabled, errorReportingConfig.enabled) &&
        Objects.equals(this.sentryDsn, errorReportingConfig.sentryDsn) &&
        Objects.equals(this.environment, errorReportingConfig.environment) &&
        Objects.equals(this.sendPii, errorReportingConfig.sendPii) &&
        Objects.equals(this.tracesSampleRate, errorReportingConfig.tracesSampleRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, sentryDsn, environment, sendPii, tracesSampleRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorReportingConfig {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    sentryDsn: ").append(toIndentedString(sentryDsn)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    sendPii: ").append(toIndentedString(sendPii)).append("\n");
    sb.append("    tracesSampleRate: ").append(toIndentedString(tracesSampleRate)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("sentry_dsn");
    openapiFields.add("environment");
    openapiFields.add("send_pii");
    openapiFields.add("traces_sample_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enabled");
    openapiRequiredFields.add("sentry_dsn");
    openapiRequiredFields.add("environment");
    openapiRequiredFields.add("send_pii");
    openapiRequiredFields.add("traces_sample_rate");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ErrorReportingConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ErrorReportingConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorReportingConfig is not found in the empty JSON string", ErrorReportingConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ErrorReportingConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorReportingConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ErrorReportingConfig.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("sentry_dsn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sentry_dsn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sentry_dsn").toString()));
      }
      if (!jsonObj.get("environment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `environment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("environment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorReportingConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorReportingConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorReportingConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorReportingConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorReportingConfig>() {
           @Override
           public void write(JsonWriter out, ErrorReportingConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorReportingConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ErrorReportingConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ErrorReportingConfig
   * @throws IOException if the JSON string is invalid with respect to ErrorReportingConfig
   */
  public static ErrorReportingConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorReportingConfig.class);
  }

  /**
   * Convert an instance of ErrorReportingConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

