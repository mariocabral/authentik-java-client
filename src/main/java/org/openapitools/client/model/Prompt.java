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
import org.openapitools.client.model.PromptTypeEnum;
import org.openapitools.client.model.Stage;

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
 * Prompt Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class Prompt {
  public static final String SERIALIZED_NAME_PK = "pk";
  @SerializedName(SERIALIZED_NAME_PK)
  private UUID pk;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FIELD_KEY = "field_key";
  @SerializedName(SERIALIZED_NAME_FIELD_KEY)
  private String fieldKey;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private PromptTypeEnum type;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_PLACEHOLDER = "placeholder";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER)
  private String placeholder;

  public static final String SERIALIZED_NAME_INITIAL_VALUE = "initial_value";
  @SerializedName(SERIALIZED_NAME_INITIAL_VALUE)
  private String initialValue;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Integer order;

  public static final String SERIALIZED_NAME_PROMPTSTAGE_SET = "promptstage_set";
  @SerializedName(SERIALIZED_NAME_PROMPTSTAGE_SET)
  private List<Stage> promptstageSet = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUB_TEXT = "sub_text";
  @SerializedName(SERIALIZED_NAME_SUB_TEXT)
  private String subText;

  public static final String SERIALIZED_NAME_PLACEHOLDER_EXPRESSION = "placeholder_expression";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER_EXPRESSION)
  private Boolean placeholderExpression;

  public static final String SERIALIZED_NAME_INITIAL_VALUE_EXPRESSION = "initial_value_expression";
  @SerializedName(SERIALIZED_NAME_INITIAL_VALUE_EXPRESSION)
  private Boolean initialValueExpression;

  public Prompt() {
  }

  public Prompt(
     UUID pk
  ) {
    this();
    this.pk = pk;
  }

  /**
   * Get pk
   * @return pk
   */
  @javax.annotation.Nonnull
  public UUID getPk() {
    return pk;
  }



  public Prompt name(String name) {
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


  public Prompt fieldKey(String fieldKey) {
    this.fieldKey = fieldKey;
    return this;
  }

  /**
   * Name of the form field, also used to store the value
   * @return fieldKey
   */
  @javax.annotation.Nonnull
  public String getFieldKey() {
    return fieldKey;
  }

  public void setFieldKey(String fieldKey) {
    this.fieldKey = fieldKey;
  }


  public Prompt label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nonnull
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public Prompt type(PromptTypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public PromptTypeEnum getType() {
    return type;
  }

  public void setType(PromptTypeEnum type) {
    this.type = type;
  }


  public Prompt required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
   */
  @javax.annotation.Nullable
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }


  public Prompt placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * Optionally provide a short hint that describes the expected input value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple choices.
   * @return placeholder
   */
  @javax.annotation.Nullable
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }


  public Prompt initialValue(String initialValue) {
    this.initialValue = initialValue;
    return this;
  }

  /**
   * Optionally pre-fill the input with an initial value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple default choices.
   * @return initialValue
   */
  @javax.annotation.Nullable
  public String getInitialValue() {
    return initialValue;
  }

  public void setInitialValue(String initialValue) {
    this.initialValue = initialValue;
  }


  public Prompt order(Integer order) {
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


  public Prompt promptstageSet(List<Stage> promptstageSet) {
    this.promptstageSet = promptstageSet;
    return this;
  }

  public Prompt addPromptstageSetItem(Stage promptstageSetItem) {
    if (this.promptstageSet == null) {
      this.promptstageSet = new ArrayList<>();
    }
    this.promptstageSet.add(promptstageSetItem);
    return this;
  }

  /**
   * Get promptstageSet
   * @return promptstageSet
   */
  @javax.annotation.Nullable
  public List<Stage> getPromptstageSet() {
    return promptstageSet;
  }

  public void setPromptstageSet(List<Stage> promptstageSet) {
    this.promptstageSet = promptstageSet;
  }


  public Prompt subText(String subText) {
    this.subText = subText;
    return this;
  }

  /**
   * Get subText
   * @return subText
   */
  @javax.annotation.Nullable
  public String getSubText() {
    return subText;
  }

  public void setSubText(String subText) {
    this.subText = subText;
  }


  public Prompt placeholderExpression(Boolean placeholderExpression) {
    this.placeholderExpression = placeholderExpression;
    return this;
  }

  /**
   * Get placeholderExpression
   * @return placeholderExpression
   */
  @javax.annotation.Nullable
  public Boolean getPlaceholderExpression() {
    return placeholderExpression;
  }

  public void setPlaceholderExpression(Boolean placeholderExpression) {
    this.placeholderExpression = placeholderExpression;
  }


  public Prompt initialValueExpression(Boolean initialValueExpression) {
    this.initialValueExpression = initialValueExpression;
    return this;
  }

  /**
   * Get initialValueExpression
   * @return initialValueExpression
   */
  @javax.annotation.Nullable
  public Boolean getInitialValueExpression() {
    return initialValueExpression;
  }

  public void setInitialValueExpression(Boolean initialValueExpression) {
    this.initialValueExpression = initialValueExpression;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prompt prompt = (Prompt) o;
    return Objects.equals(this.pk, prompt.pk) &&
        Objects.equals(this.name, prompt.name) &&
        Objects.equals(this.fieldKey, prompt.fieldKey) &&
        Objects.equals(this.label, prompt.label) &&
        Objects.equals(this.type, prompt.type) &&
        Objects.equals(this.required, prompt.required) &&
        Objects.equals(this.placeholder, prompt.placeholder) &&
        Objects.equals(this.initialValue, prompt.initialValue) &&
        Objects.equals(this.order, prompt.order) &&
        Objects.equals(this.promptstageSet, prompt.promptstageSet) &&
        Objects.equals(this.subText, prompt.subText) &&
        Objects.equals(this.placeholderExpression, prompt.placeholderExpression) &&
        Objects.equals(this.initialValueExpression, prompt.initialValueExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, name, fieldKey, label, type, required, placeholder, initialValue, order, promptstageSet, subText, placeholderExpression, initialValueExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prompt {\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    initialValue: ").append(toIndentedString(initialValue)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    promptstageSet: ").append(toIndentedString(promptstageSet)).append("\n");
    sb.append("    subText: ").append(toIndentedString(subText)).append("\n");
    sb.append("    placeholderExpression: ").append(toIndentedString(placeholderExpression)).append("\n");
    sb.append("    initialValueExpression: ").append(toIndentedString(initialValueExpression)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("field_key");
    openapiFields.add("label");
    openapiFields.add("type");
    openapiFields.add("required");
    openapiFields.add("placeholder");
    openapiFields.add("initial_value");
    openapiFields.add("order");
    openapiFields.add("promptstage_set");
    openapiFields.add("sub_text");
    openapiFields.add("placeholder_expression");
    openapiFields.add("initial_value_expression");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pk");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("field_key");
    openapiRequiredFields.add("label");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Prompt
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Prompt.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Prompt is not found in the empty JSON string", Prompt.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Prompt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Prompt` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Prompt.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("pk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pk").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("field_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_key").toString()));
      }
      if (!jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      // validate the required field `type`
      PromptTypeEnum.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("placeholder") != null && !jsonObj.get("placeholder").isJsonNull()) && !jsonObj.get("placeholder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placeholder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placeholder").toString()));
      }
      if ((jsonObj.get("initial_value") != null && !jsonObj.get("initial_value").isJsonNull()) && !jsonObj.get("initial_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initial_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initial_value").toString()));
      }
      if (jsonObj.get("promptstage_set") != null && !jsonObj.get("promptstage_set").isJsonNull()) {
        JsonArray jsonArraypromptstageSet = jsonObj.getAsJsonArray("promptstage_set");
        if (jsonArraypromptstageSet != null) {
          // ensure the json data is an array
          if (!jsonObj.get("promptstage_set").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `promptstage_set` to be an array in the JSON string but got `%s`", jsonObj.get("promptstage_set").toString()));
          }

          // validate the optional field `promptstage_set` (array)
          for (int i = 0; i < jsonArraypromptstageSet.size(); i++) {
            Stage.validateJsonElement(jsonArraypromptstageSet.get(i));
          };
        }
      }
      if ((jsonObj.get("sub_text") != null && !jsonObj.get("sub_text").isJsonNull()) && !jsonObj.get("sub_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Prompt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Prompt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Prompt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Prompt.class));

       return (TypeAdapter<T>) new TypeAdapter<Prompt>() {
           @Override
           public void write(JsonWriter out, Prompt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Prompt read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Prompt given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Prompt
   * @throws IOException if the JSON string is invalid with respect to Prompt
   */
  public static Prompt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Prompt.class);
  }

  /**
   * Convert an instance of Prompt to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

