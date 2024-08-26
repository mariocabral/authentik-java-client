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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.client.model.EventActions;
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
 * Event Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class Event {
  public static final String SERIALIZED_NAME_PK = "pk";
  @SerializedName(SERIALIZED_NAME_PK)
  private UUID pk;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Object user = null;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private EventActions action;

  public static final String SERIALIZED_NAME_APP = "app";
  @SerializedName(SERIALIZED_NAME_APP)
  private String app;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Object context = null;

  public static final String SERIALIZED_NAME_CLIENT_IP = "client_ip";
  @SerializedName(SERIALIZED_NAME_CLIENT_IP)
  private String clientIp;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private Object brand = null;

  public Event() {
  }

  public Event(
     UUID pk, 
     OffsetDateTime created
  ) {
    this();
    this.pk = pk;
    this.created = created;
  }

  /**
   * Get pk
   * @return pk
   */
  @javax.annotation.Nonnull
  public UUID getPk() {
    return pk;
  }



  public Event user(Object user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nullable
  public Object getUser() {
    return user;
  }

  public void setUser(Object user) {
    this.user = user;
  }


  public Event action(EventActions action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
   */
  @javax.annotation.Nonnull
  public EventActions getAction() {
    return action;
  }

  public void setAction(EventActions action) {
    this.action = action;
  }


  public Event app(String app) {
    this.app = app;
    return this;
  }

  /**
   * Get app
   * @return app
   */
  @javax.annotation.Nonnull
  public String getApp() {
    return app;
  }

  public void setApp(String app) {
    this.app = app;
  }


  public Event context(Object context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   */
  @javax.annotation.Nullable
  public Object getContext() {
    return context;
  }

  public void setContext(Object context) {
    this.context = context;
  }


  public Event clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

  /**
   * Get clientIp
   * @return clientIp
   */
  @javax.annotation.Nullable
  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }


  /**
   * Get created
   * @return created
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreated() {
    return created;
  }



  public Event expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Get expires
   * @return expires
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }


  public Event brand(Object brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
   */
  @javax.annotation.Nullable
  public Object getBrand() {
    return brand;
  }

  public void setBrand(Object brand) {
    this.brand = brand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.pk, event.pk) &&
        Objects.equals(this.user, event.user) &&
        Objects.equals(this.action, event.action) &&
        Objects.equals(this.app, event.app) &&
        Objects.equals(this.context, event.context) &&
        Objects.equals(this.clientIp, event.clientIp) &&
        Objects.equals(this.created, event.created) &&
        Objects.equals(this.expires, event.expires) &&
        Objects.equals(this.brand, event.brand);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, user, action, app, context, clientIp, created, expires, brand);
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
    sb.append("class Event {\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("action");
    openapiFields.add("app");
    openapiFields.add("context");
    openapiFields.add("client_ip");
    openapiFields.add("created");
    openapiFields.add("expires");
    openapiFields.add("brand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pk");
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("app");
    openapiRequiredFields.add("created");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Event
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Event.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Event is not found in the empty JSON string", Event.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Event.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Event` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Event.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("pk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pk").toString()));
      }
      // validate the required field `action`
      EventActions.validateJsonElement(jsonObj.get("action"));
      if (!jsonObj.get("app").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app").toString()));
      }
      if ((jsonObj.get("client_ip") != null && !jsonObj.get("client_ip").isJsonNull()) && !jsonObj.get("client_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_ip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Event.class));

       return (TypeAdapter<T>) new TypeAdapter<Event>() {
           @Override
           public void write(JsonWriter out, Event value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Event read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Event given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Event
   * @throws IOException if the JSON string is invalid with respect to Event
   */
  public static Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Event.class);
  }

  /**
   * Convert an instance of Event to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

