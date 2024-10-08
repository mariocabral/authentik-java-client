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
 * Global permission
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class Permission {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODENAME = "codename";
  @SerializedName(SERIALIZED_NAME_CODENAME)
  private String codename;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_APP_LABEL = "app_label";
  @SerializedName(SERIALIZED_NAME_APP_LABEL)
  private String appLabel;

  public static final String SERIALIZED_NAME_APP_LABEL_VERBOSE = "app_label_verbose";
  @SerializedName(SERIALIZED_NAME_APP_LABEL_VERBOSE)
  private String appLabelVerbose;

  public static final String SERIALIZED_NAME_MODEL_VERBOSE = "model_verbose";
  @SerializedName(SERIALIZED_NAME_MODEL_VERBOSE)
  private String modelVerbose;

  public Permission() {
  }

  public Permission(
     Integer id, 
     String model, 
     String appLabel, 
     String appLabelVerbose, 
     String modelVerbose
  ) {
    this();
    this.id = id;
    this.model = model;
    this.appLabel = appLabel;
    this.appLabelVerbose = appLabelVerbose;
    this.modelVerbose = modelVerbose;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }



  public Permission name(String name) {
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


  public Permission codename(String codename) {
    this.codename = codename;
    return this;
  }

  /**
   * Get codename
   * @return codename
   */
  @javax.annotation.Nonnull
  public String getCodename() {
    return codename;
  }

  public void setCodename(String codename) {
    this.codename = codename;
  }


  /**
   * Get model
   * @return model
   */
  @javax.annotation.Nonnull
  public String getModel() {
    return model;
  }



  /**
   * Get appLabel
   * @return appLabel
   */
  @javax.annotation.Nonnull
  public String getAppLabel() {
    return appLabel;
  }



  /**
   * Human-readable app label
   * @return appLabelVerbose
   */
  @javax.annotation.Nonnull
  public String getAppLabelVerbose() {
    return appLabelVerbose;
  }



  /**
   * Human-readable model name
   * @return modelVerbose
   */
  @javax.annotation.Nonnull
  public String getModelVerbose() {
    return modelVerbose;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.id, permission.id) &&
        Objects.equals(this.name, permission.name) &&
        Objects.equals(this.codename, permission.codename) &&
        Objects.equals(this.model, permission.model) &&
        Objects.equals(this.appLabel, permission.appLabel) &&
        Objects.equals(this.appLabelVerbose, permission.appLabelVerbose) &&
        Objects.equals(this.modelVerbose, permission.modelVerbose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, codename, model, appLabel, appLabelVerbose, modelVerbose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    codename: ").append(toIndentedString(codename)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    appLabel: ").append(toIndentedString(appLabel)).append("\n");
    sb.append("    appLabelVerbose: ").append(toIndentedString(appLabelVerbose)).append("\n");
    sb.append("    modelVerbose: ").append(toIndentedString(modelVerbose)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("codename");
    openapiFields.add("model");
    openapiFields.add("app_label");
    openapiFields.add("app_label_verbose");
    openapiFields.add("model_verbose");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("codename");
    openapiRequiredFields.add("model");
    openapiRequiredFields.add("app_label");
    openapiRequiredFields.add("app_label_verbose");
    openapiRequiredFields.add("model_verbose");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Permission
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Permission.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Permission is not found in the empty JSON string", Permission.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Permission.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Permission` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Permission.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("codename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codename").toString()));
      }
      if (!jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if (!jsonObj.get("app_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_label").toString()));
      }
      if (!jsonObj.get("app_label_verbose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_label_verbose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_label_verbose").toString()));
      }
      if (!jsonObj.get("model_verbose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_verbose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_verbose").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Permission.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Permission' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Permission> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Permission.class));

       return (TypeAdapter<T>) new TypeAdapter<Permission>() {
           @Override
           public void write(JsonWriter out, Permission value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Permission read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Permission given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Permission
   * @throws IOException if the JSON string is invalid with respect to Permission
   */
  public static Permission fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Permission.class);
  }

  /**
   * Convert an instance of Permission to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

