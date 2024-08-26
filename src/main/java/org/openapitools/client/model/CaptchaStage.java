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
 * CaptchaStage Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class CaptchaStage {
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

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "public_key";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public static final String SERIALIZED_NAME_JS_URL = "js_url";
  @SerializedName(SERIALIZED_NAME_JS_URL)
  private String jsUrl;

  public static final String SERIALIZED_NAME_API_URL = "api_url";
  @SerializedName(SERIALIZED_NAME_API_URL)
  private String apiUrl;

  public static final String SERIALIZED_NAME_SCORE_MIN_THRESHOLD = "score_min_threshold";
  @SerializedName(SERIALIZED_NAME_SCORE_MIN_THRESHOLD)
  private Double scoreMinThreshold;

  public static final String SERIALIZED_NAME_SCORE_MAX_THRESHOLD = "score_max_threshold";
  @SerializedName(SERIALIZED_NAME_SCORE_MAX_THRESHOLD)
  private Double scoreMaxThreshold;

  public static final String SERIALIZED_NAME_ERROR_ON_INVALID_SCORE = "error_on_invalid_score";
  @SerializedName(SERIALIZED_NAME_ERROR_ON_INVALID_SCORE)
  private Boolean errorOnInvalidScore;

  public CaptchaStage() {
  }

  public CaptchaStage(
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



  public CaptchaStage name(String name) {
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



  public CaptchaStage flowSet(List<FlowSet> flowSet) {
    this.flowSet = flowSet;
    return this;
  }

  public CaptchaStage addFlowSetItem(FlowSet flowSetItem) {
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


  public CaptchaStage publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Public key, acquired your captcha Provider.
   * @return publicKey
   */
  @javax.annotation.Nonnull
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public CaptchaStage jsUrl(String jsUrl) {
    this.jsUrl = jsUrl;
    return this;
  }

  /**
   * Get jsUrl
   * @return jsUrl
   */
  @javax.annotation.Nullable
  public String getJsUrl() {
    return jsUrl;
  }

  public void setJsUrl(String jsUrl) {
    this.jsUrl = jsUrl;
  }


  public CaptchaStage apiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
    return this;
  }

  /**
   * Get apiUrl
   * @return apiUrl
   */
  @javax.annotation.Nullable
  public String getApiUrl() {
    return apiUrl;
  }

  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  public CaptchaStage scoreMinThreshold(Double scoreMinThreshold) {
    this.scoreMinThreshold = scoreMinThreshold;
    return this;
  }

  /**
   * Get scoreMinThreshold
   * @return scoreMinThreshold
   */
  @javax.annotation.Nullable
  public Double getScoreMinThreshold() {
    return scoreMinThreshold;
  }

  public void setScoreMinThreshold(Double scoreMinThreshold) {
    this.scoreMinThreshold = scoreMinThreshold;
  }


  public CaptchaStage scoreMaxThreshold(Double scoreMaxThreshold) {
    this.scoreMaxThreshold = scoreMaxThreshold;
    return this;
  }

  /**
   * Get scoreMaxThreshold
   * @return scoreMaxThreshold
   */
  @javax.annotation.Nullable
  public Double getScoreMaxThreshold() {
    return scoreMaxThreshold;
  }

  public void setScoreMaxThreshold(Double scoreMaxThreshold) {
    this.scoreMaxThreshold = scoreMaxThreshold;
  }


  public CaptchaStage errorOnInvalidScore(Boolean errorOnInvalidScore) {
    this.errorOnInvalidScore = errorOnInvalidScore;
    return this;
  }

  /**
   * When enabled and the received captcha score is outside of the given threshold, the stage will show an error message. When not enabled, the flow will continue, but the data from the captcha will be available in the context for policy decisions
   * @return errorOnInvalidScore
   */
  @javax.annotation.Nullable
  public Boolean getErrorOnInvalidScore() {
    return errorOnInvalidScore;
  }

  public void setErrorOnInvalidScore(Boolean errorOnInvalidScore) {
    this.errorOnInvalidScore = errorOnInvalidScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaptchaStage captchaStage = (CaptchaStage) o;
    return Objects.equals(this.pk, captchaStage.pk) &&
        Objects.equals(this.name, captchaStage.name) &&
        Objects.equals(this.component, captchaStage.component) &&
        Objects.equals(this.verboseName, captchaStage.verboseName) &&
        Objects.equals(this.verboseNamePlural, captchaStage.verboseNamePlural) &&
        Objects.equals(this.metaModelName, captchaStage.metaModelName) &&
        Objects.equals(this.flowSet, captchaStage.flowSet) &&
        Objects.equals(this.publicKey, captchaStage.publicKey) &&
        Objects.equals(this.jsUrl, captchaStage.jsUrl) &&
        Objects.equals(this.apiUrl, captchaStage.apiUrl) &&
        Objects.equals(this.scoreMinThreshold, captchaStage.scoreMinThreshold) &&
        Objects.equals(this.scoreMaxThreshold, captchaStage.scoreMaxThreshold) &&
        Objects.equals(this.errorOnInvalidScore, captchaStage.errorOnInvalidScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, name, component, verboseName, verboseNamePlural, metaModelName, flowSet, publicKey, jsUrl, apiUrl, scoreMinThreshold, scoreMaxThreshold, errorOnInvalidScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaptchaStage {\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    verboseName: ").append(toIndentedString(verboseName)).append("\n");
    sb.append("    verboseNamePlural: ").append(toIndentedString(verboseNamePlural)).append("\n");
    sb.append("    metaModelName: ").append(toIndentedString(metaModelName)).append("\n");
    sb.append("    flowSet: ").append(toIndentedString(flowSet)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    jsUrl: ").append(toIndentedString(jsUrl)).append("\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    scoreMinThreshold: ").append(toIndentedString(scoreMinThreshold)).append("\n");
    sb.append("    scoreMaxThreshold: ").append(toIndentedString(scoreMaxThreshold)).append("\n");
    sb.append("    errorOnInvalidScore: ").append(toIndentedString(errorOnInvalidScore)).append("\n");
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
    openapiFields.add("public_key");
    openapiFields.add("js_url");
    openapiFields.add("api_url");
    openapiFields.add("score_min_threshold");
    openapiFields.add("score_max_threshold");
    openapiFields.add("error_on_invalid_score");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pk");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("verbose_name");
    openapiRequiredFields.add("verbose_name_plural");
    openapiRequiredFields.add("meta_model_name");
    openapiRequiredFields.add("public_key");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CaptchaStage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CaptchaStage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaptchaStage is not found in the empty JSON string", CaptchaStage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CaptchaStage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CaptchaStage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaptchaStage.openapiRequiredFields) {
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
      if (!jsonObj.get("public_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_key").toString()));
      }
      if ((jsonObj.get("js_url") != null && !jsonObj.get("js_url").isJsonNull()) && !jsonObj.get("js_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `js_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("js_url").toString()));
      }
      if ((jsonObj.get("api_url") != null && !jsonObj.get("api_url").isJsonNull()) && !jsonObj.get("api_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaptchaStage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaptchaStage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaptchaStage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaptchaStage.class));

       return (TypeAdapter<T>) new TypeAdapter<CaptchaStage>() {
           @Override
           public void write(JsonWriter out, CaptchaStage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CaptchaStage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CaptchaStage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CaptchaStage
   * @throws IOException if the JSON string is invalid with respect to CaptchaStage
   */
  public static CaptchaStage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaptchaStage.class);
  }

  /**
   * Convert an instance of CaptchaStage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

