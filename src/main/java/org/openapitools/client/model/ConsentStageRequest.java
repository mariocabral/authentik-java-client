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
import org.openapitools.client.model.ConsentStageModeEnum;
import org.openapitools.client.model.FlowSetRequest;

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
 * ConsentStage Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class ConsentStageRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FLOW_SET = "flow_set";
  @SerializedName(SERIALIZED_NAME_FLOW_SET)
  private List<FlowSetRequest> flowSet = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ConsentStageModeEnum mode;

  public static final String SERIALIZED_NAME_CONSENT_EXPIRE_IN = "consent_expire_in";
  @SerializedName(SERIALIZED_NAME_CONSENT_EXPIRE_IN)
  private String consentExpireIn;

  public ConsentStageRequest() {
  }

  public ConsentStageRequest name(String name) {
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


  public ConsentStageRequest flowSet(List<FlowSetRequest> flowSet) {
    this.flowSet = flowSet;
    return this;
  }

  public ConsentStageRequest addFlowSetItem(FlowSetRequest flowSetItem) {
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
  public List<FlowSetRequest> getFlowSet() {
    return flowSet;
  }

  public void setFlowSet(List<FlowSetRequest> flowSet) {
    this.flowSet = flowSet;
  }


  public ConsentStageRequest mode(ConsentStageModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   */
  @javax.annotation.Nullable
  public ConsentStageModeEnum getMode() {
    return mode;
  }

  public void setMode(ConsentStageModeEnum mode) {
    this.mode = mode;
  }


  public ConsentStageRequest consentExpireIn(String consentExpireIn) {
    this.consentExpireIn = consentExpireIn;
    return this;
  }

  /**
   * Offset after which consent expires. (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3).
   * @return consentExpireIn
   */
  @javax.annotation.Nullable
  public String getConsentExpireIn() {
    return consentExpireIn;
  }

  public void setConsentExpireIn(String consentExpireIn) {
    this.consentExpireIn = consentExpireIn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentStageRequest consentStageRequest = (ConsentStageRequest) o;
    return Objects.equals(this.name, consentStageRequest.name) &&
        Objects.equals(this.flowSet, consentStageRequest.flowSet) &&
        Objects.equals(this.mode, consentStageRequest.mode) &&
        Objects.equals(this.consentExpireIn, consentStageRequest.consentExpireIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, flowSet, mode, consentExpireIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentStageRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowSet: ").append(toIndentedString(flowSet)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    consentExpireIn: ").append(toIndentedString(consentExpireIn)).append("\n");
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
    openapiFields.add("flow_set");
    openapiFields.add("mode");
    openapiFields.add("consent_expire_in");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ConsentStageRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConsentStageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentStageRequest is not found in the empty JSON string", ConsentStageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConsentStageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentStageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentStageRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
            FlowSetRequest.validateJsonElement(jsonArrayflowSet.get(i));
          };
        }
      }
      // validate the optional field `mode`
      if (jsonObj.get("mode") != null && !jsonObj.get("mode").isJsonNull()) {
        ConsentStageModeEnum.validateJsonElement(jsonObj.get("mode"));
      }
      if ((jsonObj.get("consent_expire_in") != null && !jsonObj.get("consent_expire_in").isJsonNull()) && !jsonObj.get("consent_expire_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consent_expire_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consent_expire_in").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentStageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentStageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentStageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentStageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentStageRequest>() {
           @Override
           public void write(JsonWriter out, ConsentStageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentStageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ConsentStageRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ConsentStageRequest
   * @throws IOException if the JSON string is invalid with respect to ConsentStageRequest
   */
  public static ConsentStageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentStageRequest.class);
  }

  /**
   * Convert an instance of ConsentStageRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

