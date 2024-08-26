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
 * OAuth Device code challenge
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class OAuthDeviceCodeChallenge {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private ChallengeChoices type;

  public static final String SERIALIZED_NAME_FLOW_INFO = "flow_info";
  @SerializedName(SERIALIZED_NAME_FLOW_INFO)
  private ContextualFlowInfo flowInfo;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component = "ak-provider-oauth2-device-code";

  public static final String SERIALIZED_NAME_RESPONSE_ERRORS = "response_errors";
  @SerializedName(SERIALIZED_NAME_RESPONSE_ERRORS)
  private Map<String, List<ErrorDetail>> responseErrors = new HashMap<>();

  public OAuthDeviceCodeChallenge() {
  }

  public OAuthDeviceCodeChallenge type(ChallengeChoices type) {
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


  public OAuthDeviceCodeChallenge flowInfo(ContextualFlowInfo flowInfo) {
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


  public OAuthDeviceCodeChallenge component(String component) {
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


  public OAuthDeviceCodeChallenge responseErrors(Map<String, List<ErrorDetail>> responseErrors) {
    this.responseErrors = responseErrors;
    return this;
  }

  public OAuthDeviceCodeChallenge putResponseErrorsItem(String key, List<ErrorDetail> responseErrorsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthDeviceCodeChallenge oauthDeviceCodeChallenge = (OAuthDeviceCodeChallenge) o;
    return Objects.equals(this.type, oauthDeviceCodeChallenge.type) &&
        Objects.equals(this.flowInfo, oauthDeviceCodeChallenge.flowInfo) &&
        Objects.equals(this.component, oauthDeviceCodeChallenge.component) &&
        Objects.equals(this.responseErrors, oauthDeviceCodeChallenge.responseErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, flowInfo, component, responseErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthDeviceCodeChallenge {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    flowInfo: ").append(toIndentedString(flowInfo)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    responseErrors: ").append(toIndentedString(responseErrors)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OAuthDeviceCodeChallenge
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OAuthDeviceCodeChallenge.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuthDeviceCodeChallenge is not found in the empty JSON string", OAuthDeviceCodeChallenge.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OAuthDeviceCodeChallenge.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OAuthDeviceCodeChallenge` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OAuthDeviceCodeChallenge.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuthDeviceCodeChallenge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuthDeviceCodeChallenge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuthDeviceCodeChallenge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuthDeviceCodeChallenge.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuthDeviceCodeChallenge>() {
           @Override
           public void write(JsonWriter out, OAuthDeviceCodeChallenge value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OAuthDeviceCodeChallenge read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OAuthDeviceCodeChallenge given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OAuthDeviceCodeChallenge
   * @throws IOException if the JSON string is invalid with respect to OAuthDeviceCodeChallenge
   */
  public static OAuthDeviceCodeChallenge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuthDeviceCodeChallenge.class);
  }

  /**
   * Convert an instance of OAuthDeviceCodeChallenge to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

