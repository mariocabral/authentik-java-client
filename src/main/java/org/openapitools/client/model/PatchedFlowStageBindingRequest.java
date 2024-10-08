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
import org.openapitools.client.model.InvalidResponseActionEnum;
import org.openapitools.client.model.PolicyEngineMode;

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
 * FlowStageBinding Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class PatchedFlowStageBindingRequest {
  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private UUID target;

  public static final String SERIALIZED_NAME_STAGE = "stage";
  @SerializedName(SERIALIZED_NAME_STAGE)
  private UUID stage;

  public static final String SERIALIZED_NAME_EVALUATE_ON_PLAN = "evaluate_on_plan";
  @SerializedName(SERIALIZED_NAME_EVALUATE_ON_PLAN)
  private Boolean evaluateOnPlan;

  public static final String SERIALIZED_NAME_RE_EVALUATE_POLICIES = "re_evaluate_policies";
  @SerializedName(SERIALIZED_NAME_RE_EVALUATE_POLICIES)
  private Boolean reEvaluatePolicies;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_POLICY_ENGINE_MODE = "policy_engine_mode";
  @SerializedName(SERIALIZED_NAME_POLICY_ENGINE_MODE)
  private PolicyEngineMode policyEngineMode;

  public static final String SERIALIZED_NAME_INVALID_RESPONSE_ACTION = "invalid_response_action";
  @SerializedName(SERIALIZED_NAME_INVALID_RESPONSE_ACTION)
  private InvalidResponseActionEnum invalidResponseAction;

  public PatchedFlowStageBindingRequest() {
  }

  public PatchedFlowStageBindingRequest target(UUID target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @javax.annotation.Nullable
  public UUID getTarget() {
    return target;
  }

  public void setTarget(UUID target) {
    this.target = target;
  }


  public PatchedFlowStageBindingRequest stage(UUID stage) {
    this.stage = stage;
    return this;
  }

  /**
   * Get stage
   * @return stage
   */
  @javax.annotation.Nullable
  public UUID getStage() {
    return stage;
  }

  public void setStage(UUID stage) {
    this.stage = stage;
  }


  public PatchedFlowStageBindingRequest evaluateOnPlan(Boolean evaluateOnPlan) {
    this.evaluateOnPlan = evaluateOnPlan;
    return this;
  }

  /**
   * Evaluate policies during the Flow planning process.
   * @return evaluateOnPlan
   */
  @javax.annotation.Nullable
  public Boolean getEvaluateOnPlan() {
    return evaluateOnPlan;
  }

  public void setEvaluateOnPlan(Boolean evaluateOnPlan) {
    this.evaluateOnPlan = evaluateOnPlan;
  }


  public PatchedFlowStageBindingRequest reEvaluatePolicies(Boolean reEvaluatePolicies) {
    this.reEvaluatePolicies = reEvaluatePolicies;
    return this;
  }

  /**
   * Evaluate policies when the Stage is present to the user.
   * @return reEvaluatePolicies
   */
  @javax.annotation.Nullable
  public Boolean getReEvaluatePolicies() {
    return reEvaluatePolicies;
  }

  public void setReEvaluatePolicies(Boolean reEvaluatePolicies) {
    this.reEvaluatePolicies = reEvaluatePolicies;
  }


  public PatchedFlowStageBindingRequest order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
   */
  @javax.annotation.Nullable
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  public PatchedFlowStageBindingRequest policyEngineMode(PolicyEngineMode policyEngineMode) {
    this.policyEngineMode = policyEngineMode;
    return this;
  }

  /**
   * Get policyEngineMode
   * @return policyEngineMode
   */
  @javax.annotation.Nullable
  public PolicyEngineMode getPolicyEngineMode() {
    return policyEngineMode;
  }

  public void setPolicyEngineMode(PolicyEngineMode policyEngineMode) {
    this.policyEngineMode = policyEngineMode;
  }


  public PatchedFlowStageBindingRequest invalidResponseAction(InvalidResponseActionEnum invalidResponseAction) {
    this.invalidResponseAction = invalidResponseAction;
    return this;
  }

  /**
   * Configure how the flow executor should handle an invalid response to a challenge. RETRY returns the error message and a similar challenge to the executor. RESTART restarts the flow from the beginning, and RESTART_WITH_CONTEXT restarts the flow while keeping the current context.
   * @return invalidResponseAction
   */
  @javax.annotation.Nullable
  public InvalidResponseActionEnum getInvalidResponseAction() {
    return invalidResponseAction;
  }

  public void setInvalidResponseAction(InvalidResponseActionEnum invalidResponseAction) {
    this.invalidResponseAction = invalidResponseAction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchedFlowStageBindingRequest patchedFlowStageBindingRequest = (PatchedFlowStageBindingRequest) o;
    return Objects.equals(this.target, patchedFlowStageBindingRequest.target) &&
        Objects.equals(this.stage, patchedFlowStageBindingRequest.stage) &&
        Objects.equals(this.evaluateOnPlan, patchedFlowStageBindingRequest.evaluateOnPlan) &&
        Objects.equals(this.reEvaluatePolicies, patchedFlowStageBindingRequest.reEvaluatePolicies) &&
        Objects.equals(this.order, patchedFlowStageBindingRequest.order) &&
        Objects.equals(this.policyEngineMode, patchedFlowStageBindingRequest.policyEngineMode) &&
        Objects.equals(this.invalidResponseAction, patchedFlowStageBindingRequest.invalidResponseAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, stage, evaluateOnPlan, reEvaluatePolicies, order, policyEngineMode, invalidResponseAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchedFlowStageBindingRequest {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    evaluateOnPlan: ").append(toIndentedString(evaluateOnPlan)).append("\n");
    sb.append("    reEvaluatePolicies: ").append(toIndentedString(reEvaluatePolicies)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    policyEngineMode: ").append(toIndentedString(policyEngineMode)).append("\n");
    sb.append("    invalidResponseAction: ").append(toIndentedString(invalidResponseAction)).append("\n");
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
    openapiFields.add("target");
    openapiFields.add("stage");
    openapiFields.add("evaluate_on_plan");
    openapiFields.add("re_evaluate_policies");
    openapiFields.add("order");
    openapiFields.add("policy_engine_mode");
    openapiFields.add("invalid_response_action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatchedFlowStageBindingRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchedFlowStageBindingRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchedFlowStageBindingRequest is not found in the empty JSON string", PatchedFlowStageBindingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchedFlowStageBindingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchedFlowStageBindingRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) && !jsonObj.get("target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target").toString()));
      }
      if ((jsonObj.get("stage") != null && !jsonObj.get("stage").isJsonNull()) && !jsonObj.get("stage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stage").toString()));
      }
      // validate the optional field `policy_engine_mode`
      if (jsonObj.get("policy_engine_mode") != null && !jsonObj.get("policy_engine_mode").isJsonNull()) {
        PolicyEngineMode.validateJsonElement(jsonObj.get("policy_engine_mode"));
      }
      // validate the optional field `invalid_response_action`
      if (jsonObj.get("invalid_response_action") != null && !jsonObj.get("invalid_response_action").isJsonNull()) {
        InvalidResponseActionEnum.validateJsonElement(jsonObj.get("invalid_response_action"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchedFlowStageBindingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchedFlowStageBindingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchedFlowStageBindingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchedFlowStageBindingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchedFlowStageBindingRequest>() {
           @Override
           public void write(JsonWriter out, PatchedFlowStageBindingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchedFlowStageBindingRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatchedFlowStageBindingRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatchedFlowStageBindingRequest
   * @throws IOException if the JSON string is invalid with respect to PatchedFlowStageBindingRequest
   */
  public static PatchedFlowStageBindingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchedFlowStageBindingRequest.class);
  }

  /**
   * Convert an instance of PatchedFlowStageBindingRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

