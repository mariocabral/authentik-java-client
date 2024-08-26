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
 * PropertyMapping Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class PropertyMapping {
  public static final String SERIALIZED_NAME_PK = "pk";
  @SerializedName(SERIALIZED_NAME_PK)
  private UUID pk;

  public static final String SERIALIZED_NAME_MANAGED = "managed";
  @SerializedName(SERIALIZED_NAME_MANAGED)
  private String managed;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_VERBOSE_NAME = "verbose_name";
  @SerializedName(SERIALIZED_NAME_VERBOSE_NAME)
  private String verboseName;

  public static final String SERIALIZED_NAME_VERBOSE_NAME_PLURAL = "verbose_name_plural";
  @SerializedName(SERIALIZED_NAME_VERBOSE_NAME_PLURAL)
  private String verboseNamePlural;

  public static final String SERIALIZED_NAME_META_MODEL_NAME = "meta_model_name";
  @SerializedName(SERIALIZED_NAME_META_MODEL_NAME)
  private String metaModelName;

  public PropertyMapping() {
  }

  public PropertyMapping(
     UUID pk, 
     String component, 
     String verboseName, 
     String verboseNamePlural, 
     String metaModelName
  ) {
    this();
    this.pk = pk;
    this.component = component;
    this.verboseName = verboseName;
    this.verboseNamePlural = verboseNamePlural;
    this.metaModelName = metaModelName;
  }

  /**
   * Get pk
   * @return pk
   */
  @javax.annotation.Nonnull
  public UUID getPk() {
    return pk;
  }



  public PropertyMapping managed(String managed) {
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


  public PropertyMapping name(String name) {
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


  public PropertyMapping expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression
   * @return expression
   */
  @javax.annotation.Nonnull
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }


  /**
   * Get object&#39;s component so that we know how to edit the object
   * @return component
   */
  @javax.annotation.Nonnull
  public String getComponent() {
    return component;
  }



  /**
   * Return object&#39;s verbose_name
   * @return verboseName
   */
  @javax.annotation.Nonnull
  public String getVerboseName() {
    return verboseName;
  }



  /**
   * Return object&#39;s plural verbose_name
   * @return verboseNamePlural
   */
  @javax.annotation.Nonnull
  public String getVerboseNamePlural() {
    return verboseNamePlural;
  }



  /**
   * Return internal model name
   * @return metaModelName
   */
  @javax.annotation.Nonnull
  public String getMetaModelName() {
    return metaModelName;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyMapping propertyMapping = (PropertyMapping) o;
    return Objects.equals(this.pk, propertyMapping.pk) &&
        Objects.equals(this.managed, propertyMapping.managed) &&
        Objects.equals(this.name, propertyMapping.name) &&
        Objects.equals(this.expression, propertyMapping.expression) &&
        Objects.equals(this.component, propertyMapping.component) &&
        Objects.equals(this.verboseName, propertyMapping.verboseName) &&
        Objects.equals(this.verboseNamePlural, propertyMapping.verboseNamePlural) &&
        Objects.equals(this.metaModelName, propertyMapping.metaModelName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, managed, name, expression, component, verboseName, verboseNamePlural, metaModelName);
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
    sb.append("class PropertyMapping {\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    verboseName: ").append(toIndentedString(verboseName)).append("\n");
    sb.append("    verboseNamePlural: ").append(toIndentedString(verboseNamePlural)).append("\n");
    sb.append("    metaModelName: ").append(toIndentedString(metaModelName)).append("\n");
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
    openapiFields.add("managed");
    openapiFields.add("name");
    openapiFields.add("expression");
    openapiFields.add("component");
    openapiFields.add("verbose_name");
    openapiFields.add("verbose_name_plural");
    openapiFields.add("meta_model_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pk");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("expression");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("verbose_name");
    openapiRequiredFields.add("verbose_name_plural");
    openapiRequiredFields.add("meta_model_name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PropertyMapping
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PropertyMapping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropertyMapping is not found in the empty JSON string", PropertyMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PropertyMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropertyMapping` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PropertyMapping.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("pk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pk").toString()));
      }
      if ((jsonObj.get("managed") != null && !jsonObj.get("managed").isJsonNull()) && !jsonObj.get("managed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managed").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (!jsonObj.get("verbose_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verbose_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verbose_name").toString()));
      }
      if (!jsonObj.get("verbose_name_plural").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verbose_name_plural` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verbose_name_plural").toString()));
      }
      if (!jsonObj.get("meta_model_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meta_model_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meta_model_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropertyMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropertyMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropertyMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropertyMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<PropertyMapping>() {
           @Override
           public void write(JsonWriter out, PropertyMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropertyMapping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PropertyMapping given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PropertyMapping
   * @throws IOException if the JSON string is invalid with respect to PropertyMapping
   */
  public static PropertyMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropertyMapping.class);
  }

  /**
   * Convert an instance of PropertyMapping to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

