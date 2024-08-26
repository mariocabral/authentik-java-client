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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.ChallengeChoices;
import org.openapitools.client.model.ContextualFlowInfo;
import org.openapitools.client.model.ErrorDetail;

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
 * Autosubmit challenge used to send and navigate a POST request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class AutosubmitChallenge {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ChallengeChoices type;

  public static final String SERIALIZED_NAME_FLOW_INFO = "flow_info";
  @SerializedName(SERIALIZED_NAME_FLOW_INFO)
  private ContextualFlowInfo flowInfo;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "ak-stage-autosubmit";

  public static final String SERIALIZED_NAME_RESPONSE_ERRORS = "response_errors";
  @SerializedName(SERIALIZED_NAME_RESPONSE_ERRORS)
  private Map<String, List<ErrorDetail>> responseErrors = new HashMap<>();

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ATTRS = "attrs";
  @SerializedName(SERIALIZED_NAME_ATTRS)
  private Map<String, String> attrs = new HashMap<>();

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public AutosubmitChallenge() {
  }

  public AutosubmitChallenge type(ChallengeChoices type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public ChallengeChoices getType() {
    return type;
  }

  public void setType(ChallengeChoices type) {
    this.type = type;
  }


  public AutosubmitChallenge flowInfo(ContextualFlowInfo flowInfo) {
    this.flowInfo = flowInfo;
    return this;
  }

  /**
   * Get flowInfo
   * @return flowInfo
   */
  @javax.annotation.Nullable
  public ContextualFlowInfo getFlowInfo() {
    return flowInfo;
  }

  public void setFlowInfo(ContextualFlowInfo flowInfo) {
    this.flowInfo = flowInfo;
  }


  public AutosubmitChallenge component(String component) {
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


  public AutosubmitChallenge responseErrors(Map<String, List<ErrorDetail>> responseErrors) {
    this.responseErrors = responseErrors;
    return this;
  }

  public AutosubmitChallenge putResponseErrorsItem(String key, List<ErrorDetail> responseErrorsItem) {
    if (this.responseErrors == null) {
      this.responseErrors = new HashMap<>();
    }
    this.responseErrors.put(key, responseErrorsItem);
    return this;
  }

  /**
   * Get responseErrors
   * @return responseErrors
   */
  @javax.annotation.Nullable
  public Map<String, List<ErrorDetail>> getResponseErrors() {
    return responseErrors;
  }

  public void setResponseErrors(Map<String, List<ErrorDetail>> responseErrors) {
    this.responseErrors = responseErrors;
  }


  public AutosubmitChallenge url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public AutosubmitChallenge attrs(Map<String, String> attrs) {
    this.attrs = attrs;
    return this;
  }

  public AutosubmitChallenge putAttrsItem(String key, String attrsItem) {
    if (this.attrs == null) {
      this.attrs = new HashMap<>();
    }
    this.attrs.put(key, attrsItem);
    return this;
  }

  /**
   * Get attrs
   * @return attrs
   */
  @javax.annotation.Nonnull
  public Map<String, String> getAttrs() {
    return attrs;
  }

  public void setAttrs(Map<String, String> attrs) {
    this.attrs = attrs;
  }


  public AutosubmitChallenge title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutosubmitChallenge autosubmitChallenge = (AutosubmitChallenge) o;
    return Objects.equals(this.type, autosubmitChallenge.type) &&
        Objects.equals(this.flowInfo, autosubmitChallenge.flowInfo) &&
        Objects.equals(this.component, autosubmitChallenge.component) &&
        Objects.equals(this.responseErrors, autosubmitChallenge.responseErrors) &&
        Objects.equals(this.url, autosubmitChallenge.url) &&
        Objects.equals(this.attrs, autosubmitChallenge.attrs) &&
        Objects.equals(this.title, autosubmitChallenge.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, flowInfo, component, responseErrors, url, attrs, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutosubmitChallenge {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    flowInfo: ").append(toIndentedString(flowInfo)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    responseErrors: ").append(toIndentedString(responseErrors)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("flow_info");
    openapiFields.add("component");
    openapiFields.add("response_errors");
    openapiFields.add("url");
    openapiFields.add("attrs");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("attrs");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AutosubmitChallenge
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutosubmitChallenge.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutosubmitChallenge is not found in the empty JSON string", AutosubmitChallenge.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AutosubmitChallenge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutosubmitChallenge` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutosubmitChallenge.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `type`
      ChallengeChoices.validateJsonElement(jsonObj.get("type"));
      // validate the optional field `flow_info`
      if (jsonObj.get("flow_info") != null && !jsonObj.get("flow_info").isJsonNull()) {
        ContextualFlowInfo.validateJsonElement(jsonObj.get("flow_info"));
      }
      if ((jsonObj.get("component") != null && !jsonObj.get("component").isJsonNull()) && !jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutosubmitChallenge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutosubmitChallenge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutosubmitChallenge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutosubmitChallenge.class));

       return (TypeAdapter<T>) new TypeAdapter<AutosubmitChallenge>() {
           @Override
           public void write(JsonWriter out, AutosubmitChallenge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutosubmitChallenge read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AutosubmitChallenge given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AutosubmitChallenge
   * @throws IOException if the JSON string is invalid with respect to AutosubmitChallenge
   */
  public static AutosubmitChallenge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutosubmitChallenge.class);
  }

  /**
   * Convert an instance of AutosubmitChallenge to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

