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
 * DummyStage Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class PatchedDummyStageRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FLOW_SET = "flow_set";
  @SerializedName(SERIALIZED_NAME_FLOW_SET)
  private List<FlowSetRequest> flowSet = new ArrayList<>();

  public static final String SERIALIZED_NAME_THROW_ERROR = "throw_error";
  @SerializedName(SERIALIZED_NAME_THROW_ERROR)
  private Boolean throwError;

  public PatchedDummyStageRequest() {
  }

  public PatchedDummyStageRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PatchedDummyStageRequest flowSet(List<FlowSetRequest> flowSet) {
    this.flowSet = flowSet;
    return this;
  }

  public PatchedDummyStageRequest addFlowSetItem(FlowSetRequest flowSetItem) {
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


  public PatchedDummyStageRequest throwError(Boolean throwError) {
    this.throwError = throwError;
    return this;
  }

  /**
   * Get throwError
   * @return throwError
   */
  @javax.annotation.Nullable
  public Boolean getThrowError() {
    return throwError;
  }

  public void setThrowError(Boolean throwError) {
    this.throwError = throwError;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchedDummyStageRequest patchedDummyStageRequest = (PatchedDummyStageRequest) o;
    return Objects.equals(this.name, patchedDummyStageRequest.name) &&
        Objects.equals(this.flowSet, patchedDummyStageRequest.flowSet) &&
        Objects.equals(this.throwError, patchedDummyStageRequest.throwError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, flowSet, throwError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchedDummyStageRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowSet: ").append(toIndentedString(flowSet)).append("\n");
    sb.append("    throwError: ").append(toIndentedString(throwError)).append("\n");
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
    openapiFields.add("throw_error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatchedDummyStageRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchedDummyStageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchedDummyStageRequest is not found in the empty JSON string", PatchedDummyStageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchedDummyStageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchedDummyStageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchedDummyStageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchedDummyStageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchedDummyStageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchedDummyStageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchedDummyStageRequest>() {
           @Override
           public void write(JsonWriter out, PatchedDummyStageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchedDummyStageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatchedDummyStageRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatchedDummyStageRequest
   * @throws IOException if the JSON string is invalid with respect to PatchedDummyStageRequest
   */
  public static PatchedDummyStageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchedDummyStageRequest.class);
  }

  /**
   * Convert an instance of PatchedDummyStageRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

