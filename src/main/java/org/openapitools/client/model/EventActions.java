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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EventActions
 */
@JsonAdapter(EventActions.Adapter.class)
public enum EventActions {
  
  LOGIN("login"),
  
  LOGIN_FAILED("login_failed"),
  
  LOGOUT("logout"),
  
  USER_WRITE("user_write"),
  
  SUSPICIOUS_REQUEST("suspicious_request"),
  
  PASSWORD_SET("password_set"),
  
  SECRET_VIEW("secret_view"),
  
  SECRET_ROTATE("secret_rotate"),
  
  INVITATION_USED("invitation_used"),
  
  AUTHORIZE_APPLICATION("authorize_application"),
  
  SOURCE_LINKED("source_linked"),
  
  IMPERSONATION_STARTED("impersonation_started"),
  
  IMPERSONATION_ENDED("impersonation_ended"),
  
  FLOW_EXECUTION("flow_execution"),
  
  POLICY_EXECUTION("policy_execution"),
  
  POLICY_EXCEPTION("policy_exception"),
  
  PROPERTY_MAPPING_EXCEPTION("property_mapping_exception"),
  
  SYSTEM_TASK_EXECUTION("system_task_execution"),
  
  SYSTEM_TASK_EXCEPTION("system_task_exception"),
  
  SYSTEM_EXCEPTION("system_exception"),
  
  CONFIGURATION_ERROR("configuration_error"),
  
  MODEL_CREATED("model_created"),
  
  MODEL_UPDATED("model_updated"),
  
  MODEL_DELETED("model_deleted"),
  
  EMAIL_SENT("email_sent"),
  
  UPDATE_AVAILABLE("update_available"),
  
  CUSTOM_("custom_");

  private String value;

  EventActions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventActions fromValue(String value) {
    for (EventActions b : EventActions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventActions> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventActions enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventActions read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventActions.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    EventActions.fromValue(value);
  }
}

