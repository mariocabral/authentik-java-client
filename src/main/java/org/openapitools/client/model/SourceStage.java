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
import org.openapitools.client.model.FlowSet;

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
 * SourceStage Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class SourceStage {
  public static final String SERIALIZED_NAME_PK = "pk";
  @SerializedName(SERIALIZED_NAME_PK)
  private UUID pk;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_FLOW_SET = "flow_set";
  @SerializedName(SERIALIZED_NAME_FLOW_SET)
  private List<FlowSet> flowSet = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private UUID source;

  public static final String SERIALIZED_NAME_RESUME_TIMEOUT = "resume_timeout";
  @SerializedName(SERIALIZED_NAME_RESUME_TIMEOUT)
  private String resumeTimeout;

  public SourceStage() {
  }

  public SourceStage(
     UUID pk, 
     String component, 
     String verboseName, 
     String verboseNamePlural, 
     String metaModelName
  ) {
    this();
    this.pk = pk;
    this.component = component;
    this.verboseName = verboseName;
    this.verboseNamePlural = verboseNamePlural;
    this.metaModelName = metaModelName;
  }

  /**
   * Get pk
   * @return pk
   */
  @javax.annotation.Nonnull
  public UUID getPk() {
    return pk;
  }



  public SourceStage name(String name) {
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


  /**
   * Get object type so that we know how to edit the object
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



  public SourceStage flowSet(List<FlowSet> flowSet) {
    this.flowSet = flowSet;
    return this;
  }

  public SourceStage addFlowSetItem(FlowSet flowSetItem) {
    if (this.flowSet == null) {
      this.flowSet = new ArrayList<>();
    }
    this.flowSet.add(flowSetItem);
    return this;
  }

  /**
   * Get flowSet
   * @return flowSet
   */
  @javax.annotation.Nullable
  public List<FlowSet> getFlowSet() {
    return flowSet;
  }

  public void setFlowSet(List<FlowSet> flowSet) {
    this.flowSet = flowSet;
  }


  public SourceStage source(UUID source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nonnull
  public UUID getSource() {
    return source;
  }

  public void setSource(UUID source) {
    this.source = source;
  }


  public SourceStage resumeTimeout(String resumeTimeout) {
    this.resumeTimeout = resumeTimeout;
    return this;
  }

  /**
   * Amount of time a user can take to return from the source to continue the flow (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3)
   * @return resumeTimeout
   */
  @javax.annotation.Nullable
  public String getResumeTimeout() {
    return resumeTimeout;
  }

  public void setResumeTimeout(String resumeTimeout) {
    this.resumeTimeout = resumeTimeout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceStage sourceStage = (SourceStage) o;
    return Objects.equals(this.pk, sourceStage.pk) &&
        Objects.equals(this.name, sourceStage.name) &&
        Objects.equals(this.component, sourceStage.component) &&
        Objects.equals(this.verboseName, sourceStage.verboseName) &&
        Objects.equals(this.verboseNamePlural, sourceStage.verboseNamePlural) &&
        Objects.equals(this.metaModelName, sourceStage.metaModelName) &&
        Objects.equals(this.flowSet, sourceStage.flowSet) &&
        Objects.equals(this.source, sourceStage.source) &&
        Objects.equals(this.resumeTimeout, sourceStage.resumeTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, name, component, verboseName, verboseNamePlural, metaModelName, flowSet, source, resumeTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceStage {\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    verboseName: ").append(toIndentedString(verboseName)).append("\n");
    sb.append("    verboseNamePlural: ").append(toIndentedString(verboseNamePlural)).append("\n");
    sb.append("    metaModelName: ").append(toIndentedString(metaModelName)).append("\n");
    sb.append("    flowSet: ").append(toIndentedString(flowSet)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    resumeTimeout: ").append(toIndentedString(resumeTimeout)).append("\n");
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
    openapiFields.add("component");
    openapiFields.add("verbose_name");
    openapiFields.add("verbose_name_plural");
    openapiFields.add("meta_model_name");
    openapiFields.add("flow_set");
    openapiFields.add("source");
    openapiFields.add("resume_timeout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pk");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("verbose_name");
    openapiRequiredFields.add("verbose_name_plural");
    openapiRequiredFields.add("meta_model_name");
    openapiRequiredFields.add("source");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SourceStage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SourceStage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceStage is not found in the empty JSON string", SourceStage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SourceStage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SourceStage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SourceStage.openapiRequiredFields) {
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
      if (jsonObj.get("flow_set") != null && !jsonObj.get("flow_set").isJsonNull()) {
        JsonArray jsonArrayflowSet = jsonObj.getAsJsonArray("flow_set");
        if (jsonArrayflowSet != null) {
          // ensure the json data is an array
          if (!jsonObj.get("flow_set").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `flow_set` to be an array in the JSON string but got `%s`", jsonObj.get("flow_set").toString()));
          }

          // validate the optional field `flow_set` (array)
          for (int i = 0; i < jsonArrayflowSet.size(); i++) {
            FlowSet.validateJsonElement(jsonArrayflowSet.get(i));
          };
        }
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("resume_timeout") != null && !jsonObj.get("resume_timeout").isJsonNull()) && !jsonObj.get("resume_timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resume_timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resume_timeout").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceStage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceStage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceStage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceStage.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceStage>() {
           @Override
           public void write(JsonWriter out, SourceStage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SourceStage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SourceStage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SourceStage
   * @throws IOException if the JSON string is invalid with respect to SourceStage
   */
  public static SourceStage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceStage.class);
  }

  /**
   * Convert an instance of SourceStage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

