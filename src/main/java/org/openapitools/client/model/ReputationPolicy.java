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
 * Reputation Policy Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class ReputationPolicy {
  public static final String SERIALIZED_NAME_PK = "pk";
  @SerializedName(SERIALIZED_NAME_PK)
  private UUID pk;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXECUTION_LOGGING = "execution_logging";
  @SerializedName(SERIALIZED_NAME_EXECUTION_LOGGING)
  private Boolean executionLogging;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_VERBOSE_NAME = "verbose_name";
  @SerializedName(SERIALIZED_NAME_VERBOSE_NAME)
  private String verboseName;

  public static final String SERIALIZED_NAME_VERBOSE_NAME_PLURAL = "verbose_name_plural";
  @SerializedName(SERIALIZED_NAME_VERBOSE_NAME_PLURAL)
  private String verboseNamePlural;

  public static final String SERIALIZED_NAME_META_MODEL_NAME = "meta_model_name";
  @SerializedName(SERIALIZED_NAME_META_MODEL_NAME)
  private String metaModelName;

  public static final String SERIALIZED_NAME_BOUND_TO = "bound_to";
  @SerializedName(SERIALIZED_NAME_BOUND_TO)
  private Integer boundTo;

  public static final String SERIALIZED_NAME_CHECK_IP = "check_ip";
  @SerializedName(SERIALIZED_NAME_CHECK_IP)
  private Boolean checkIp;

  public static final String SERIALIZED_NAME_CHECK_USERNAME = "check_username";
  @SerializedName(SERIALIZED_NAME_CHECK_USERNAME)
  private Boolean checkUsername;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Integer threshold;

  public ReputationPolicy() {
  }

  public ReputationPolicy(
     UUID pk, 
     String component, 
     String verboseName, 
     String verboseNamePlural, 
     String metaModelName, 
     Integer boundTo
  ) {
    this();
    this.pk = pk;
    this.component = component;
    this.verboseName = verboseName;
    this.verboseNamePlural = verboseNamePlural;
    this.metaModelName = metaModelName;
    this.boundTo = boundTo;
  }

  /**
   * Get pk
   * @return pk
   */
  @javax.annotation.Nonnull
  public UUID getPk() {
    return pk;
  }



  public ReputationPolicy name(String name) {
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


  public ReputationPolicy executionLogging(Boolean executionLogging) {
    this.executionLogging = executionLogging;
    return this;
  }

  /**
   * When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged.
   * @return executionLogging
   */
  @javax.annotation.Nullable
  public Boolean getExecutionLogging() {
    return executionLogging;
  }

  public void setExecutionLogging(Boolean executionLogging) {
    this.executionLogging = executionLogging;
  }


  /**
   * Get object component so that we know how to edit the object
   * @return component
   */
  @javax.annotation.Nonnull
  public String getComponent() {
    return component;
  }



  /**
   * Return object&#39;s verbose_name
   * @return verboseName
   */
  @javax.annotation.Nonnull
  public String getVerboseName() {
    return verboseName;
  }



  /**
   * Return object&#39;s plural verbose_name
   * @return verboseNamePlural
   */
  @javax.annotation.Nonnull
  public String getVerboseNamePlural() {
    return verboseNamePlural;
  }



  /**
   * Return internal model name
   * @return metaModelName
   */
  @javax.annotation.Nonnull
  public String getMetaModelName() {
    return metaModelName;
  }



  /**
   * Return objects policy is bound to
   * @return boundTo
   */
  @javax.annotation.Nonnull
  public Integer getBoundTo() {
    return boundTo;
  }



  public ReputationPolicy checkIp(Boolean checkIp) {
    this.checkIp = checkIp;
    return this;
  }

  /**
   * Get checkIp
   * @return checkIp
   */
  @javax.annotation.Nullable
  public Boolean getCheckIp() {
    return checkIp;
  }

  public void setCheckIp(Boolean checkIp) {
    this.checkIp = checkIp;
  }


  public ReputationPolicy checkUsername(Boolean checkUsername) {
    this.checkUsername = checkUsername;
    return this;
  }

  /**
   * Get checkUsername
   * @return checkUsername
   */
  @javax.annotation.Nullable
  public Boolean getCheckUsername() {
    return checkUsername;
  }

  public void setCheckUsername(Boolean checkUsername) {
    this.checkUsername = checkUsername;
  }


  public ReputationPolicy threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * minimum: -2147483648
   * maximum: 2147483647
   * @return threshold
   */
  @javax.annotation.Nullable
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReputationPolicy reputationPolicy = (ReputationPolicy) o;
    return Objects.equals(this.pk, reputationPolicy.pk) &&
        Objects.equals(this.name, reputationPolicy.name) &&
        Objects.equals(this.executionLogging, reputationPolicy.executionLogging) &&
        Objects.equals(this.component, reputationPolicy.component) &&
        Objects.equals(this.verboseName, reputationPolicy.verboseName) &&
        Objects.equals(this.verboseNamePlural, reputationPolicy.verboseNamePlural) &&
        Objects.equals(this.metaModelName, reputationPolicy.metaModelName) &&
        Objects.equals(this.boundTo, reputationPolicy.boundTo) &&
        Objects.equals(this.checkIp, reputationPolicy.checkIp) &&
        Objects.equals(this.checkUsername, reputationPolicy.checkUsername) &&
        Objects.equals(this.threshold, reputationPolicy.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, name, executionLogging, component, verboseName, verboseNamePlural, metaModelName, boundTo, checkIp, checkUsername, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReputationPolicy {\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    executionLogging: ").append(toIndentedString(executionLogging)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    verboseName: ").append(toIndentedString(verboseName)).append("\n");
    sb.append("    verboseNamePlural: ").append(toIndentedString(verboseNamePlural)).append("\n");
    sb.append("    metaModelName: ").append(toIndentedString(metaModelName)).append("\n");
    sb.append("    boundTo: ").append(toIndentedString(boundTo)).append("\n");
    sb.append("    checkIp: ").append(toIndentedString(checkIp)).append("\n");
    sb.append("    checkUsername: ").append(toIndentedString(checkUsername)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
    openapiFields.add("pk");
    openapiFields.add("name");
    openapiFields.add("execution_logging");
    openapiFields.add("component");
    openapiFields.add("verbose_name");
    openapiFields.add("verbose_name_plural");
    openapiFields.add("meta_model_name");
    openapiFields.add("bound_to");
    openapiFields.add("check_ip");
    openapiFields.add("check_username");
    openapiFields.add("threshold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pk");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("verbose_name");
    openapiRequiredFields.add("verbose_name_plural");
    openapiRequiredFields.add("meta_model_name");
    openapiRequiredFields.add("bound_to");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReputationPolicy
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReputationPolicy.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReputationPolicy is not found in the empty JSON string", ReputationPolicy.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReputationPolicy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReputationPolicy` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReputationPolicy.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("pk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pk").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (!jsonObj.get("verbose_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verbose_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verbose_name").toString()));
      }
      if (!jsonObj.get("verbose_name_plural").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verbose_name_plural` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verbose_name_plural").toString()));
      }
      if (!jsonObj.get("meta_model_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meta_model_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meta_model_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReputationPolicy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReputationPolicy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReputationPolicy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReputationPolicy.class));

       return (TypeAdapter<T>) new TypeAdapter<ReputationPolicy>() {
           @Override
           public void write(JsonWriter out, ReputationPolicy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReputationPolicy read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReputationPolicy given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReputationPolicy
   * @throws IOException if the JSON string is invalid with respect to ReputationPolicy
   */
  public static ReputationPolicy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReputationPolicy.class);
  }

  /**
   * Convert an instance of ReputationPolicy to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

