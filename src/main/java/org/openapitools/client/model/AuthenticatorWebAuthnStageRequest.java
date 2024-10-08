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
import org.openapitools.client.model.AuthenticatorAttachmentEnum;
import org.openapitools.client.model.FlowSetRequest;
import org.openapitools.client.model.ResidentKeyRequirementEnum;
import org.openapitools.client.model.UserVerificationEnum;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AuthenticatorWebAuthnStage Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class AuthenticatorWebAuthnStageRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FLOW_SET = "flow_set";
  @SerializedName(SERIALIZED_NAME_FLOW_SET)
  private List<FlowSetRequest> flowSet = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONFIGURE_FLOW = "configure_flow";
  @SerializedName(SERIALIZED_NAME_CONFIGURE_FLOW)
  private UUID configureFlow;

  public static final String SERIALIZED_NAME_FRIENDLY_NAME = "friendly_name";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_NAME)
  private String friendlyName;

  public static final String SERIALIZED_NAME_USER_VERIFICATION = "user_verification";
  @SerializedName(SERIALIZED_NAME_USER_VERIFICATION)
  private UserVerificationEnum userVerification;

  public static final String SERIALIZED_NAME_AUTHENTICATOR_ATTACHMENT = "authenticator_attachment";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATOR_ATTACHMENT)
  private AuthenticatorAttachmentEnum authenticatorAttachment;

  public static final String SERIALIZED_NAME_RESIDENT_KEY_REQUIREMENT = "resident_key_requirement";
  @SerializedName(SERIALIZED_NAME_RESIDENT_KEY_REQUIREMENT)
  private ResidentKeyRequirementEnum residentKeyRequirement;

  public static final String SERIALIZED_NAME_DEVICE_TYPE_RESTRICTIONS = "device_type_restrictions";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE_RESTRICTIONS)
  private List<UUID> deviceTypeRestrictions = new ArrayList<>();

  public AuthenticatorWebAuthnStageRequest() {
  }

  public AuthenticatorWebAuthnStageRequest name(String name) {
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


  public AuthenticatorWebAuthnStageRequest flowSet(List<FlowSetRequest> flowSet) {
    this.flowSet = flowSet;
    return this;
  }

  public AuthenticatorWebAuthnStageRequest addFlowSetItem(FlowSetRequest flowSetItem) {
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


  public AuthenticatorWebAuthnStageRequest configureFlow(UUID configureFlow) {
    this.configureFlow = configureFlow;
    return this;
  }

  /**
   * Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage.
   * @return configureFlow
   */
  @javax.annotation.Nullable
  public UUID getConfigureFlow() {
    return configureFlow;
  }

  public void setConfigureFlow(UUID configureFlow) {
    this.configureFlow = configureFlow;
  }


  public AuthenticatorWebAuthnStageRequest friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * Get friendlyName
   * @return friendlyName
   */
  @javax.annotation.Nullable
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }


  public AuthenticatorWebAuthnStageRequest userVerification(UserVerificationEnum userVerification) {
    this.userVerification = userVerification;
    return this;
  }

  /**
   * Get userVerification
   * @return userVerification
   */
  @javax.annotation.Nullable
  public UserVerificationEnum getUserVerification() {
    return userVerification;
  }

  public void setUserVerification(UserVerificationEnum userVerification) {
    this.userVerification = userVerification;
  }


  public AuthenticatorWebAuthnStageRequest authenticatorAttachment(AuthenticatorAttachmentEnum authenticatorAttachment) {
    this.authenticatorAttachment = authenticatorAttachment;
    return this;
  }

  /**
   * Get authenticatorAttachment
   * @return authenticatorAttachment
   */
  @javax.annotation.Nullable
  public AuthenticatorAttachmentEnum getAuthenticatorAttachment() {
    return authenticatorAttachment;
  }

  public void setAuthenticatorAttachment(AuthenticatorAttachmentEnum authenticatorAttachment) {
    this.authenticatorAttachment = authenticatorAttachment;
  }


  public AuthenticatorWebAuthnStageRequest residentKeyRequirement(ResidentKeyRequirementEnum residentKeyRequirement) {
    this.residentKeyRequirement = residentKeyRequirement;
    return this;
  }

  /**
   * Get residentKeyRequirement
   * @return residentKeyRequirement
   */
  @javax.annotation.Nullable
  public ResidentKeyRequirementEnum getResidentKeyRequirement() {
    return residentKeyRequirement;
  }

  public void setResidentKeyRequirement(ResidentKeyRequirementEnum residentKeyRequirement) {
    this.residentKeyRequirement = residentKeyRequirement;
  }


  public AuthenticatorWebAuthnStageRequest deviceTypeRestrictions(List<UUID> deviceTypeRestrictions) {
    this.deviceTypeRestrictions = deviceTypeRestrictions;
    return this;
  }

  public AuthenticatorWebAuthnStageRequest addDeviceTypeRestrictionsItem(UUID deviceTypeRestrictionsItem) {
    if (this.deviceTypeRestrictions == null) {
      this.deviceTypeRestrictions = new ArrayList<>();
    }
    this.deviceTypeRestrictions.add(deviceTypeRestrictionsItem);
    return this;
  }

  /**
   * Get deviceTypeRestrictions
   * @return deviceTypeRestrictions
   */
  @javax.annotation.Nullable
  public List<UUID> getDeviceTypeRestrictions() {
    return deviceTypeRestrictions;
  }

  public void setDeviceTypeRestrictions(List<UUID> deviceTypeRestrictions) {
    this.deviceTypeRestrictions = deviceTypeRestrictions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatorWebAuthnStageRequest authenticatorWebAuthnStageRequest = (AuthenticatorWebAuthnStageRequest) o;
    return Objects.equals(this.name, authenticatorWebAuthnStageRequest.name) &&
        Objects.equals(this.flowSet, authenticatorWebAuthnStageRequest.flowSet) &&
        Objects.equals(this.configureFlow, authenticatorWebAuthnStageRequest.configureFlow) &&
        Objects.equals(this.friendlyName, authenticatorWebAuthnStageRequest.friendlyName) &&
        Objects.equals(this.userVerification, authenticatorWebAuthnStageRequest.userVerification) &&
        Objects.equals(this.authenticatorAttachment, authenticatorWebAuthnStageRequest.authenticatorAttachment) &&
        Objects.equals(this.residentKeyRequirement, authenticatorWebAuthnStageRequest.residentKeyRequirement) &&
        Objects.equals(this.deviceTypeRestrictions, authenticatorWebAuthnStageRequest.deviceTypeRestrictions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, flowSet, configureFlow, friendlyName, userVerification, authenticatorAttachment, residentKeyRequirement, deviceTypeRestrictions);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatorWebAuthnStageRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    flowSet: ").append(toIndentedString(flowSet)).append("\n");
    sb.append("    configureFlow: ").append(toIndentedString(configureFlow)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    userVerification: ").append(toIndentedString(userVerification)).append("\n");
    sb.append("    authenticatorAttachment: ").append(toIndentedString(authenticatorAttachment)).append("\n");
    sb.append("    residentKeyRequirement: ").append(toIndentedString(residentKeyRequirement)).append("\n");
    sb.append("    deviceTypeRestrictions: ").append(toIndentedString(deviceTypeRestrictions)).append("\n");
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
    openapiFields.add("configure_flow");
    openapiFields.add("friendly_name");
    openapiFields.add("user_verification");
    openapiFields.add("authenticator_attachment");
    openapiFields.add("resident_key_requirement");
    openapiFields.add("device_type_restrictions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthenticatorWebAuthnStageRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthenticatorWebAuthnStageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticatorWebAuthnStageRequest is not found in the empty JSON string", AuthenticatorWebAuthnStageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthenticatorWebAuthnStageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticatorWebAuthnStageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthenticatorWebAuthnStageRequest.openapiRequiredFields) {
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
      if ((jsonObj.get("configure_flow") != null && !jsonObj.get("configure_flow").isJsonNull()) && !jsonObj.get("configure_flow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configure_flow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configure_flow").toString()));
      }
      if ((jsonObj.get("friendly_name") != null && !jsonObj.get("friendly_name").isJsonNull()) && !jsonObj.get("friendly_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friendly_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friendly_name").toString()));
      }
      // validate the optional field `user_verification`
      if (jsonObj.get("user_verification") != null && !jsonObj.get("user_verification").isJsonNull()) {
        UserVerificationEnum.validateJsonElement(jsonObj.get("user_verification"));
      }
      // validate the optional field `authenticator_attachment`
      if (jsonObj.get("authenticator_attachment") != null && !jsonObj.get("authenticator_attachment").isJsonNull()) {
        AuthenticatorAttachmentEnum.validateJsonElement(jsonObj.get("authenticator_attachment"));
      }
      // validate the optional field `resident_key_requirement`
      if (jsonObj.get("resident_key_requirement") != null && !jsonObj.get("resident_key_requirement").isJsonNull()) {
        ResidentKeyRequirementEnum.validateJsonElement(jsonObj.get("resident_key_requirement"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("device_type_restrictions") != null && !jsonObj.get("device_type_restrictions").isJsonNull() && !jsonObj.get("device_type_restrictions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_type_restrictions` to be an array in the JSON string but got `%s`", jsonObj.get("device_type_restrictions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticatorWebAuthnStageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticatorWebAuthnStageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticatorWebAuthnStageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticatorWebAuthnStageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticatorWebAuthnStageRequest>() {
           @Override
           public void write(JsonWriter out, AuthenticatorWebAuthnStageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticatorWebAuthnStageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthenticatorWebAuthnStageRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticatorWebAuthnStageRequest
   * @throws IOException if the JSON string is invalid with respect to AuthenticatorWebAuthnStageRequest
   */
  public static AuthenticatorWebAuthnStageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticatorWebAuthnStageRequest.class);
  }

  /**
   * Convert an instance of AuthenticatorWebAuthnStageRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

