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
 * ScopeMapping Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class PatchedScopeMappingRequest {
  public static final String SERIALIZED_NAME_MANAGED = "managed";
  @SerializedName(SERIALIZED_NAME_MANAGED)
  private String managed;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_SCOPE_NAME = "scope_name";
  @SerializedName(SERIALIZED_NAME_SCOPE_NAME)
  private String scopeName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public PatchedScopeMappingRequest() {
  }

  public PatchedScopeMappingRequest managed(String managed) {
    this.managed = managed;
    return this;
  }

  /**
   * Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update.
   * @return managed
   */
  @javax.annotation.Nullable
  public String getManaged() {
    return managed;
  }

  public void setManaged(String managed) {
    this.managed = managed;
  }


  public PatchedScopeMappingRequest name(String name) {
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


  public PatchedScopeMappingRequest expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
   */
  @javax.annotation.Nullable
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }


  public PatchedScopeMappingRequest scopeName(String scopeName) {
    this.scopeName = scopeName;
    return this;
  }

  /**
   * Scope name requested by the client
   * @return scopeName
   */
  @javax.annotation.Nullable
  public String getScopeName() {
    return scopeName;
  }

  public void setScopeName(String scopeName) {
    this.scopeName = scopeName;
  }


  public PatchedScopeMappingRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description shown to the user when consenting. If left empty, the user won&#39;t be informed.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchedScopeMappingRequest patchedScopeMappingRequest = (PatchedScopeMappingRequest) o;
    return Objects.equals(this.managed, patchedScopeMappingRequest.managed) &&
        Objects.equals(this.name, patchedScopeMappingRequest.name) &&
        Objects.equals(this.expression, patchedScopeMappingRequest.expression) &&
        Objects.equals(this.scopeName, patchedScopeMappingRequest.scopeName) &&
        Objects.equals(this.description, patchedScopeMappingRequest.description);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(managed, name, expression, scopeName, description);
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
    sb.append("class PatchedScopeMappingRequest {\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("managed");
    openapiFields.add("name");
    openapiFields.add("expression");
    openapiFields.add("scope_name");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatchedScopeMappingRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchedScopeMappingRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchedScopeMappingRequest is not found in the empty JSON string", PatchedScopeMappingRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchedScopeMappingRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchedScopeMappingRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("managed") != null && !jsonObj.get("managed").isJsonNull()) && !jsonObj.get("managed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managed").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("expression") != null && !jsonObj.get("expression").isJsonNull()) && !jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      if ((jsonObj.get("scope_name") != null && !jsonObj.get("scope_name").isJsonNull()) && !jsonObj.get("scope_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope_name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchedScopeMappingRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchedScopeMappingRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchedScopeMappingRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchedScopeMappingRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchedScopeMappingRequest>() {
           @Override
           public void write(JsonWriter out, PatchedScopeMappingRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchedScopeMappingRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatchedScopeMappingRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatchedScopeMappingRequest
   * @throws IOException if the JSON string is invalid with respect to PatchedScopeMappingRequest
   */
  public static PatchedScopeMappingRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchedScopeMappingRequest.class);
  }

  /**
   * Convert an instance of PatchedScopeMappingRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

