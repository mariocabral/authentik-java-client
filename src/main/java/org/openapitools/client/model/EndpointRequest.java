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
import org.openapitools.client.model.AuthModeEnum;
import org.openapitools.client.model.ProtocolEnum;
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
 * Endpoint Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class EndpointRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private Integer provider;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private Object settings = null;

  public static final String SERIALIZED_NAME_PROPERTY_MAPPINGS = "property_mappings";
  @SerializedName(SERIALIZED_NAME_PROPERTY_MAPPINGS)
  private List<UUID> propertyMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUTH_MODE = "auth_mode";
  @SerializedName(SERIALIZED_NAME_AUTH_MODE)
  private AuthModeEnum authMode;

  public static final String SERIALIZED_NAME_MAXIMUM_CONNECTIONS = "maximum_connections";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_CONNECTIONS)
  private Integer maximumConnections;

  public EndpointRequest() {
  }

  public EndpointRequest name(String name) {
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


  public EndpointRequest provider(Integer provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   */
  @javax.annotation.Nonnull
  public Integer getProvider() {
    return provider;
  }

  public void setProvider(Integer provider) {
    this.provider = provider;
  }


  public EndpointRequest protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
   */
  @javax.annotation.Nonnull
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  public EndpointRequest host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   */
  @javax.annotation.Nonnull
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public EndpointRequest settings(Object settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
   */
  @javax.annotation.Nullable
  public Object getSettings() {
    return settings;
  }

  public void setSettings(Object settings) {
    this.settings = settings;
  }


  public EndpointRequest propertyMappings(List<UUID> propertyMappings) {
    this.propertyMappings = propertyMappings;
    return this;
  }

  public EndpointRequest addPropertyMappingsItem(UUID propertyMappingsItem) {
    if (this.propertyMappings == null) {
      this.propertyMappings = new ArrayList<>();
    }
    this.propertyMappings.add(propertyMappingsItem);
    return this;
  }

  /**
   * Get propertyMappings
   * @return propertyMappings
   */
  @javax.annotation.Nullable
  public List<UUID> getPropertyMappings() {
    return propertyMappings;
  }

  public void setPropertyMappings(List<UUID> propertyMappings) {
    this.propertyMappings = propertyMappings;
  }


  public EndpointRequest authMode(AuthModeEnum authMode) {
    this.authMode = authMode;
    return this;
  }

  /**
   * Get authMode
   * @return authMode
   */
  @javax.annotation.Nonnull
  public AuthModeEnum getAuthMode() {
    return authMode;
  }

  public void setAuthMode(AuthModeEnum authMode) {
    this.authMode = authMode;
  }


  public EndpointRequest maximumConnections(Integer maximumConnections) {
    this.maximumConnections = maximumConnections;
    return this;
  }

  /**
   * Get maximumConnections
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maximumConnections
   */
  @javax.annotation.Nullable
  public Integer getMaximumConnections() {
    return maximumConnections;
  }

  public void setMaximumConnections(Integer maximumConnections) {
    this.maximumConnections = maximumConnections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointRequest endpointRequest = (EndpointRequest) o;
    return Objects.equals(this.name, endpointRequest.name) &&
        Objects.equals(this.provider, endpointRequest.provider) &&
        Objects.equals(this.protocol, endpointRequest.protocol) &&
        Objects.equals(this.host, endpointRequest.host) &&
        Objects.equals(this.settings, endpointRequest.settings) &&
        Objects.equals(this.propertyMappings, endpointRequest.propertyMappings) &&
        Objects.equals(this.authMode, endpointRequest.authMode) &&
        Objects.equals(this.maximumConnections, endpointRequest.maximumConnections);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, provider, protocol, host, settings, propertyMappings, authMode, maximumConnections);
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
    sb.append("class EndpointRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    propertyMappings: ").append(toIndentedString(propertyMappings)).append("\n");
    sb.append("    authMode: ").append(toIndentedString(authMode)).append("\n");
    sb.append("    maximumConnections: ").append(toIndentedString(maximumConnections)).append("\n");
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
    openapiFields.add("provider");
    openapiFields.add("protocol");
    openapiFields.add("host");
    openapiFields.add("settings");
    openapiFields.add("property_mappings");
    openapiFields.add("auth_mode");
    openapiFields.add("maximum_connections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("provider");
    openapiRequiredFields.add("protocol");
    openapiRequiredFields.add("host");
    openapiRequiredFields.add("auth_mode");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EndpointRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointRequest is not found in the empty JSON string", EndpointRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EndpointRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `protocol`
      ProtocolEnum.validateJsonElement(jsonObj.get("protocol"));
      if (!jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("property_mappings") != null && !jsonObj.get("property_mappings").isJsonNull() && !jsonObj.get("property_mappings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_mappings` to be an array in the JSON string but got `%s`", jsonObj.get("property_mappings").toString()));
      }
      // validate the required field `auth_mode`
      AuthModeEnum.validateJsonElement(jsonObj.get("auth_mode"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointRequest>() {
           @Override
           public void write(JsonWriter out, EndpointRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EndpointRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EndpointRequest
   * @throws IOException if the JSON string is invalid with respect to EndpointRequest
   */
  public static EndpointRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointRequest.class);
  }

  /**
   * Convert an instance of EndpointRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

