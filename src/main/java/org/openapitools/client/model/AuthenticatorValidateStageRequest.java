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
import org.openapitools.client.model.DeviceClassesEnum;
import org.openapitools.client.model.FlowSetRequest;
import org.openapitools.client.model.NotConfiguredActionEnum;
import org.openapitools.client.model.UserVerificationEnum;

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
 * AuthenticatorValidateStage Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class AuthenticatorValidateStageRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FLOW_SET = "flow_set";
  @SerializedName(SERIALIZED_NAME_FLOW_SET)
  private List<FlowSetRequest> flowSet = new ArrayList<>();

  public static final String SERIALIZED_NAME_NOT_CONFIGURED_ACTION = "not_configured_action";
  @SerializedName(SERIALIZED_NAME_NOT_CONFIGURED_ACTION)
  private NotConfiguredActionEnum notConfiguredAction;

  public static final String SERIALIZED_NAME_DEVICE_CLASSES = "device_classes";
  @SerializedName(SERIALIZED_NAME_DEVICE_CLASSES)
  private List<DeviceClassesEnum> deviceClasses = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONFIGURATION_STAGES = "configuration_stages";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_STAGES)
  private List<UUID> configurationStages = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_AUTH_THRESHOLD = "last_auth_threshold";
  @SerializedName(SERIALIZED_NAME_LAST_AUTH_THRESHOLD)
  private String lastAuthThreshold;

  public static final String SERIALIZED_NAME_WEBAUTHN_USER_VERIFICATION = "webauthn_user_verification";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN_USER_VERIFICATION)
  private UserVerificationEnum webauthnUserVerification;

  public static final String SERIALIZED_NAME_WEBAUTHN_ALLOWED_DEVICE_TYPES = "webauthn_allowed_device_types";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN_ALLOWED_DEVICE_TYPES)
  private List<UUID> webauthnAllowedDeviceTypes = new ArrayList<>();

  public AuthenticatorValidateStageRequest() {
  }

  public AuthenticatorValidateStageRequest name(String name) {
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


  public AuthenticatorValidateStageRequest flowSet(List<FlowSetRequest> flowSet) {
    this.flowSet = flowSet;
    return this;
  }

  public AuthenticatorValidateStageRequest addFlowSetItem(FlowSetRequest flowSetItem) {
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


  public AuthenticatorValidateStageRequest notConfiguredAction(NotConfiguredActionEnum notConfiguredAction) {
    this.notConfiguredAction = notConfiguredAction;
    return this;
  }

  /**
   * Get notConfiguredAction
   * @return notConfiguredAction
   */
  @javax.annotation.Nullable
  public NotConfiguredActionEnum getNotConfiguredAction() {
    return notConfiguredAction;
  }

  public void setNotConfiguredAction(NotConfiguredActionEnum notConfiguredAction) {
    this.notConfiguredAction = notConfiguredAction;
  }


  public AuthenticatorValidateStageRequest deviceClasses(List<DeviceClassesEnum> deviceClasses) {
    this.deviceClasses = deviceClasses;
    return this;
  }

  public AuthenticatorValidateStageRequest addDeviceClassesItem(DeviceClassesEnum deviceClassesItem) {
    if (this.deviceClasses == null) {
      this.deviceClasses = new ArrayList<>();
    }
    this.deviceClasses.add(deviceClassesItem);
    return this;
  }

  /**
   * Device classes which can be used to authenticate
   * @return deviceClasses
   */
  @javax.annotation.Nullable
  public List<DeviceClassesEnum> getDeviceClasses() {
    return deviceClasses;
  }

  public void setDeviceClasses(List<DeviceClassesEnum> deviceClasses) {
    this.deviceClasses = deviceClasses;
  }


  public AuthenticatorValidateStageRequest configurationStages(List<UUID> configurationStages) {
    this.configurationStages = configurationStages;
    return this;
  }

  public AuthenticatorValidateStageRequest addConfigurationStagesItem(UUID configurationStagesItem) {
    if (this.configurationStages == null) {
      this.configurationStages = new ArrayList<>();
    }
    this.configurationStages.add(configurationStagesItem);
    return this;
  }

  /**
   * Stages used to configure Authenticator when user doesn&#39;t have any compatible devices. After this configuration Stage passes, the user is not prompted again.
   * @return configurationStages
   */
  @javax.annotation.Nullable
  public List<UUID> getConfigurationStages() {
    return configurationStages;
  }

  public void setConfigurationStages(List<UUID> configurationStages) {
    this.configurationStages = configurationStages;
  }


  public AuthenticatorValidateStageRequest lastAuthThreshold(String lastAuthThreshold) {
    this.lastAuthThreshold = lastAuthThreshold;
    return this;
  }

  /**
   * If any of the user&#39;s device has been used within this threshold, this stage will be skipped
   * @return lastAuthThreshold
   */
  @javax.annotation.Nullable
  public String getLastAuthThreshold() {
    return lastAuthThreshold;
  }

  public void setLastAuthThreshold(String lastAuthThreshold) {
    this.lastAuthThreshold = lastAuthThreshold;
  }


  public AuthenticatorValidateStageRequest webauthnUserVerification(UserVerificationEnum webauthnUserVerification) {
    this.webauthnUserVerification = webauthnUserVerification;
    return this;
  }

  /**
   * Enforce user verification for WebAuthn devices.
   * @return webauthnUserVerification
   */
  @javax.annotation.Nullable
  public UserVerificationEnum getWebauthnUserVerification() {
    return webauthnUserVerification;
  }

  public void setWebauthnUserVerification(UserVerificationEnum webauthnUserVerification) {
    this.webauthnUserVerification = webauthnUserVerification;
  }


  public AuthenticatorValidateStageRequest webauthnAllowedDeviceTypes(List<UUID> webauthnAllowedDeviceTypes) {
    this.webauthnAllowedDeviceTypes = webauthnAllowedDeviceTypes;
    return this;
  }

  public AuthenticatorValidateStageRequest addWebauthnAllowedDeviceTypesItem(UUID webauthnAllowedDeviceTypesItem) {
    if (this.webauthnAllowedDeviceTypes == null) {
      this.webauthnAllowedDeviceTypes = new ArrayList<>();
    }
    this.webauthnAllowedDeviceTypes.add(webauthnAllowedDeviceTypesItem);
    return this;
  }

  /**
   * Get webauthnAllowedDeviceTypes
   * @return webauthnAllowedDeviceTypes
   */
  @javax.annotation.Nullable
  public List<UUID> getWebauthnAllowedDeviceTypes() {
    return webauthnAllowedDeviceTypes;
  }

  public void setWebauthnAllowedDeviceTypes(List<UUID> webauthnAllowedDeviceTypes) {
    this.webauthnAllowedDeviceTypes = webauthnAllowedDeviceTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatorValidateStageRequest authenticatorValidateStageRequest = (AuthenticatorValidateStageRequest) o;
    return Objects.equals(this.name, authenticatorValidateStageRequest.name) &&
        Objects.equals(this.flowSet, authenticatorValidateStageRequest.flowSet) &&
        Objects.equals(this.notConfiguredAction, authenticatorValidateStageRequest.notConfiguredAction) &&
        Objects.equals(this.deviceClasses, authenticatorValidateStageRequest.deviceClasses) &&
        Objects.equals(this.configurationStages, authenticatorValidateStageRequest.configurationStages) &&
        Objects.equals(this.lastAuthThreshold, authenticatorValidateStageRequest.lastAuthThreshold) &&
        Objects.equals(this.webauthnUserVerification, authenticatorValidateStageRequest.webauthnUserVerification) &&
        Objects.equals(this.webauthnAllowedDeviceTypes, authenticatorValidateStageRequest.webauthnAllowedDeviceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, flowSet, notConfiguredAction, deviceClasses, configurationStages, lastAuthThreshold, webauthnUserVerification, webauthnAllowedDeviceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatorValidateStageRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowSet: ").append(toIndentedString(flowSet)).append("\n");
    sb.append("    notConfiguredAction: ").append(toIndentedString(notConfiguredAction)).append("\n");
    sb.append("    deviceClasses: ").append(toIndentedString(deviceClasses)).append("\n");
    sb.append("    configurationStages: ").append(toIndentedString(configurationStages)).append("\n");
    sb.append("    lastAuthThreshold: ").append(toIndentedString(lastAuthThreshold)).append("\n");
    sb.append("    webauthnUserVerification: ").append(toIndentedString(webauthnUserVerification)).append("\n");
    sb.append("    webauthnAllowedDeviceTypes: ").append(toIndentedString(webauthnAllowedDeviceTypes)).append("\n");
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
    openapiFields.add("not_configured_action");
    openapiFields.add("device_classes");
    openapiFields.add("configuration_stages");
    openapiFields.add("last_auth_threshold");
    openapiFields.add("webauthn_user_verification");
    openapiFields.add("webauthn_allowed_device_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthenticatorValidateStageRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthenticatorValidateStageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticatorValidateStageRequest is not found in the empty JSON string", AuthenticatorValidateStageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthenticatorValidateStageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticatorValidateStageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthenticatorValidateStageRequest.openapiRequiredFields) {
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
      // validate the optional field `not_configured_action`
      if (jsonObj.get("not_configured_action") != null && !jsonObj.get("not_configured_action").isJsonNull()) {
        NotConfiguredActionEnum.validateJsonElement(jsonObj.get("not_configured_action"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("device_classes") != null && !jsonObj.get("device_classes").isJsonNull() && !jsonObj.get("device_classes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_classes` to be an array in the JSON string but got `%s`", jsonObj.get("device_classes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("configuration_stages") != null && !jsonObj.get("configuration_stages").isJsonNull() && !jsonObj.get("configuration_stages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `configuration_stages` to be an array in the JSON string but got `%s`", jsonObj.get("configuration_stages").toString()));
      }
      if ((jsonObj.get("last_auth_threshold") != null && !jsonObj.get("last_auth_threshold").isJsonNull()) && !jsonObj.get("last_auth_threshold").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_auth_threshold` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_auth_threshold").toString()));
      }
      // validate the optional field `webauthn_user_verification`
      if (jsonObj.get("webauthn_user_verification") != null && !jsonObj.get("webauthn_user_verification").isJsonNull()) {
        UserVerificationEnum.validateJsonElement(jsonObj.get("webauthn_user_verification"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("webauthn_allowed_device_types") != null && !jsonObj.get("webauthn_allowed_device_types").isJsonNull() && !jsonObj.get("webauthn_allowed_device_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `webauthn_allowed_device_types` to be an array in the JSON string but got `%s`", jsonObj.get("webauthn_allowed_device_types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticatorValidateStageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticatorValidateStageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticatorValidateStageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticatorValidateStageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticatorValidateStageRequest>() {
           @Override
           public void write(JsonWriter out, AuthenticatorValidateStageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticatorValidateStageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthenticatorValidateStageRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticatorValidateStageRequest
   * @throws IOException if the JSON string is invalid with respect to AuthenticatorValidateStageRequest
   */
  public static AuthenticatorValidateStageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticatorValidateStageRequest.class);
  }

  /**
   * Convert an instance of AuthenticatorValidateStageRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

