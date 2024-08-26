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
 * Password Policy Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class PatchedPasswordPolicyRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EXECUTION_LOGGING = "execution_logging";
  @SerializedName(SERIALIZED_NAME_EXECUTION_LOGGING)
  private Boolean executionLogging;

  public static final String SERIALIZED_NAME_PASSWORD_FIELD = "password_field";
  @SerializedName(SERIALIZED_NAME_PASSWORD_FIELD)
  private String passwordField;

  public static final String SERIALIZED_NAME_AMOUNT_DIGITS = "amount_digits";
  @SerializedName(SERIALIZED_NAME_AMOUNT_DIGITS)
  private Integer amountDigits;

  public static final String SERIALIZED_NAME_AMOUNT_UPPERCASE = "amount_uppercase";
  @SerializedName(SERIALIZED_NAME_AMOUNT_UPPERCASE)
  private Integer amountUppercase;

  public static final String SERIALIZED_NAME_AMOUNT_LOWERCASE = "amount_lowercase";
  @SerializedName(SERIALIZED_NAME_AMOUNT_LOWERCASE)
  private Integer amountLowercase;

  public static final String SERIALIZED_NAME_AMOUNT_SYMBOLS = "amount_symbols";
  @SerializedName(SERIALIZED_NAME_AMOUNT_SYMBOLS)
  private Integer amountSymbols;

  public static final String SERIALIZED_NAME_LENGTH_MIN = "length_min";
  @SerializedName(SERIALIZED_NAME_LENGTH_MIN)
  private Integer lengthMin;

  public static final String SERIALIZED_NAME_SYMBOL_CHARSET = "symbol_charset";
  @SerializedName(SERIALIZED_NAME_SYMBOL_CHARSET)
  private String symbolCharset;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_CHECK_STATIC_RULES = "check_static_rules";
  @SerializedName(SERIALIZED_NAME_CHECK_STATIC_RULES)
  private Boolean checkStaticRules;

  public static final String SERIALIZED_NAME_CHECK_HAVE_I_BEEN_PWNED = "check_have_i_been_pwned";
  @SerializedName(SERIALIZED_NAME_CHECK_HAVE_I_BEEN_PWNED)
  private Boolean checkHaveIBeenPwned;

  public static final String SERIALIZED_NAME_CHECK_ZXCVBN = "check_zxcvbn";
  @SerializedName(SERIALIZED_NAME_CHECK_ZXCVBN)
  private Boolean checkZxcvbn;

  public static final String SERIALIZED_NAME_HIBP_ALLOWED_COUNT = "hibp_allowed_count";
  @SerializedName(SERIALIZED_NAME_HIBP_ALLOWED_COUNT)
  private Integer hibpAllowedCount;

  public static final String SERIALIZED_NAME_ZXCVBN_SCORE_THRESHOLD = "zxcvbn_score_threshold";
  @SerializedName(SERIALIZED_NAME_ZXCVBN_SCORE_THRESHOLD)
  private Integer zxcvbnScoreThreshold;

  public PatchedPasswordPolicyRequest() {
  }

  public PatchedPasswordPolicyRequest name(String name) {
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


  public PatchedPasswordPolicyRequest executionLogging(Boolean executionLogging) {
    this.executionLogging = executionLogging;
    return this;
  }

  /**
   * When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged.
   * @return executionLogging
   */
  @javax.annotation.Nullable
  public Boolean getExecutionLogging() {
    return executionLogging;
  }

  public void setExecutionLogging(Boolean executionLogging) {
    this.executionLogging = executionLogging;
  }


  public PatchedPasswordPolicyRequest passwordField(String passwordField) {
    this.passwordField = passwordField;
    return this;
  }

  /**
   * Field key to check, field keys defined in Prompt stages are available.
   * @return passwordField
   */
  @javax.annotation.Nullable
  public String getPasswordField() {
    return passwordField;
  }

  public void setPasswordField(String passwordField) {
    this.passwordField = passwordField;
  }


  public PatchedPasswordPolicyRequest amountDigits(Integer amountDigits) {
    this.amountDigits = amountDigits;
    return this;
  }

  /**
   * Get amountDigits
   * minimum: 0
   * maximum: 2147483647
   * @return amountDigits
   */
  @javax.annotation.Nullable
  public Integer getAmountDigits() {
    return amountDigits;
  }

  public void setAmountDigits(Integer amountDigits) {
    this.amountDigits = amountDigits;
  }


  public PatchedPasswordPolicyRequest amountUppercase(Integer amountUppercase) {
    this.amountUppercase = amountUppercase;
    return this;
  }

  /**
   * Get amountUppercase
   * minimum: 0
   * maximum: 2147483647
   * @return amountUppercase
   */
  @javax.annotation.Nullable
  public Integer getAmountUppercase() {
    return amountUppercase;
  }

  public void setAmountUppercase(Integer amountUppercase) {
    this.amountUppercase = amountUppercase;
  }


  public PatchedPasswordPolicyRequest amountLowercase(Integer amountLowercase) {
    this.amountLowercase = amountLowercase;
    return this;
  }

  /**
   * Get amountLowercase
   * minimum: 0
   * maximum: 2147483647
   * @return amountLowercase
   */
  @javax.annotation.Nullable
  public Integer getAmountLowercase() {
    return amountLowercase;
  }

  public void setAmountLowercase(Integer amountLowercase) {
    this.amountLowercase = amountLowercase;
  }


  public PatchedPasswordPolicyRequest amountSymbols(Integer amountSymbols) {
    this.amountSymbols = amountSymbols;
    return this;
  }

  /**
   * Get amountSymbols
   * minimum: 0
   * maximum: 2147483647
   * @return amountSymbols
   */
  @javax.annotation.Nullable
  public Integer getAmountSymbols() {
    return amountSymbols;
  }

  public void setAmountSymbols(Integer amountSymbols) {
    this.amountSymbols = amountSymbols;
  }


  public PatchedPasswordPolicyRequest lengthMin(Integer lengthMin) {
    this.lengthMin = lengthMin;
    return this;
  }

  /**
   * Get lengthMin
   * minimum: 0
   * maximum: 2147483647
   * @return lengthMin
   */
  @javax.annotation.Nullable
  public Integer getLengthMin() {
    return lengthMin;
  }

  public void setLengthMin(Integer lengthMin) {
    this.lengthMin = lengthMin;
  }


  public PatchedPasswordPolicyRequest symbolCharset(String symbolCharset) {
    this.symbolCharset = symbolCharset;
    return this;
  }

  /**
   * Get symbolCharset
   * @return symbolCharset
   */
  @javax.annotation.Nullable
  public String getSymbolCharset() {
    return symbolCharset;
  }

  public void setSymbolCharset(String symbolCharset) {
    this.symbolCharset = symbolCharset;
  }


  public PatchedPasswordPolicyRequest errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public PatchedPasswordPolicyRequest checkStaticRules(Boolean checkStaticRules) {
    this.checkStaticRules = checkStaticRules;
    return this;
  }

  /**
   * Get checkStaticRules
   * @return checkStaticRules
   */
  @javax.annotation.Nullable
  public Boolean getCheckStaticRules() {
    return checkStaticRules;
  }

  public void setCheckStaticRules(Boolean checkStaticRules) {
    this.checkStaticRules = checkStaticRules;
  }


  public PatchedPasswordPolicyRequest checkHaveIBeenPwned(Boolean checkHaveIBeenPwned) {
    this.checkHaveIBeenPwned = checkHaveIBeenPwned;
    return this;
  }

  /**
   * Get checkHaveIBeenPwned
   * @return checkHaveIBeenPwned
   */
  @javax.annotation.Nullable
  public Boolean getCheckHaveIBeenPwned() {
    return checkHaveIBeenPwned;
  }

  public void setCheckHaveIBeenPwned(Boolean checkHaveIBeenPwned) {
    this.checkHaveIBeenPwned = checkHaveIBeenPwned;
  }


  public PatchedPasswordPolicyRequest checkZxcvbn(Boolean checkZxcvbn) {
    this.checkZxcvbn = checkZxcvbn;
    return this;
  }

  /**
   * Get checkZxcvbn
   * @return checkZxcvbn
   */
  @javax.annotation.Nullable
  public Boolean getCheckZxcvbn() {
    return checkZxcvbn;
  }

  public void setCheckZxcvbn(Boolean checkZxcvbn) {
    this.checkZxcvbn = checkZxcvbn;
  }


  public PatchedPasswordPolicyRequest hibpAllowedCount(Integer hibpAllowedCount) {
    this.hibpAllowedCount = hibpAllowedCount;
    return this;
  }

  /**
   * How many times the password hash is allowed to be on haveibeenpwned
   * minimum: 0
   * maximum: 2147483647
   * @return hibpAllowedCount
   */
  @javax.annotation.Nullable
  public Integer getHibpAllowedCount() {
    return hibpAllowedCount;
  }

  public void setHibpAllowedCount(Integer hibpAllowedCount) {
    this.hibpAllowedCount = hibpAllowedCount;
  }


  public PatchedPasswordPolicyRequest zxcvbnScoreThreshold(Integer zxcvbnScoreThreshold) {
    this.zxcvbnScoreThreshold = zxcvbnScoreThreshold;
    return this;
  }

  /**
   * If the zxcvbn score is equal or less than this value, the policy will fail.
   * minimum: 0
   * maximum: 2147483647
   * @return zxcvbnScoreThreshold
   */
  @javax.annotation.Nullable
  public Integer getZxcvbnScoreThreshold() {
    return zxcvbnScoreThreshold;
  }

  public void setZxcvbnScoreThreshold(Integer zxcvbnScoreThreshold) {
    this.zxcvbnScoreThreshold = zxcvbnScoreThreshold;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchedPasswordPolicyRequest patchedPasswordPolicyRequest = (PatchedPasswordPolicyRequest) o;
    return Objects.equals(this.name, patchedPasswordPolicyRequest.name) &&
        Objects.equals(this.executionLogging, patchedPasswordPolicyRequest.executionLogging) &&
        Objects.equals(this.passwordField, patchedPasswordPolicyRequest.passwordField) &&
        Objects.equals(this.amountDigits, patchedPasswordPolicyRequest.amountDigits) &&
        Objects.equals(this.amountUppercase, patchedPasswordPolicyRequest.amountUppercase) &&
        Objects.equals(this.amountLowercase, patchedPasswordPolicyRequest.amountLowercase) &&
        Objects.equals(this.amountSymbols, patchedPasswordPolicyRequest.amountSymbols) &&
        Objects.equals(this.lengthMin, patchedPasswordPolicyRequest.lengthMin) &&
        Objects.equals(this.symbolCharset, patchedPasswordPolicyRequest.symbolCharset) &&
        Objects.equals(this.errorMessage, patchedPasswordPolicyRequest.errorMessage) &&
        Objects.equals(this.checkStaticRules, patchedPasswordPolicyRequest.checkStaticRules) &&
        Objects.equals(this.checkHaveIBeenPwned, patchedPasswordPolicyRequest.checkHaveIBeenPwned) &&
        Objects.equals(this.checkZxcvbn, patchedPasswordPolicyRequest.checkZxcvbn) &&
        Objects.equals(this.hibpAllowedCount, patchedPasswordPolicyRequest.hibpAllowedCount) &&
        Objects.equals(this.zxcvbnScoreThreshold, patchedPasswordPolicyRequest.zxcvbnScoreThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, executionLogging, passwordField, amountDigits, amountUppercase, amountLowercase, amountSymbols, lengthMin, symbolCharset, errorMessage, checkStaticRules, checkHaveIBeenPwned, checkZxcvbn, hibpAllowedCount, zxcvbnScoreThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchedPasswordPolicyRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    executionLogging: ").append(toIndentedString(executionLogging)).append("\n");
    sb.append("    passwordField: ").append(toIndentedString(passwordField)).append("\n");
    sb.append("    amountDigits: ").append(toIndentedString(amountDigits)).append("\n");
    sb.append("    amountUppercase: ").append(toIndentedString(amountUppercase)).append("\n");
    sb.append("    amountLowercase: ").append(toIndentedString(amountLowercase)).append("\n");
    sb.append("    amountSymbols: ").append(toIndentedString(amountSymbols)).append("\n");
    sb.append("    lengthMin: ").append(toIndentedString(lengthMin)).append("\n");
    sb.append("    symbolCharset: ").append(toIndentedString(symbolCharset)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    checkStaticRules: ").append(toIndentedString(checkStaticRules)).append("\n");
    sb.append("    checkHaveIBeenPwned: ").append(toIndentedString(checkHaveIBeenPwned)).append("\n");
    sb.append("    checkZxcvbn: ").append(toIndentedString(checkZxcvbn)).append("\n");
    sb.append("    hibpAllowedCount: ").append(toIndentedString(hibpAllowedCount)).append("\n");
    sb.append("    zxcvbnScoreThreshold: ").append(toIndentedString(zxcvbnScoreThreshold)).append("\n");
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
    openapiFields.add("execution_logging");
    openapiFields.add("password_field");
    openapiFields.add("amount_digits");
    openapiFields.add("amount_uppercase");
    openapiFields.add("amount_lowercase");
    openapiFields.add("amount_symbols");
    openapiFields.add("length_min");
    openapiFields.add("symbol_charset");
    openapiFields.add("error_message");
    openapiFields.add("check_static_rules");
    openapiFields.add("check_have_i_been_pwned");
    openapiFields.add("check_zxcvbn");
    openapiFields.add("hibp_allowed_count");
    openapiFields.add("zxcvbn_score_threshold");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatchedPasswordPolicyRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchedPasswordPolicyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchedPasswordPolicyRequest is not found in the empty JSON string", PatchedPasswordPolicyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchedPasswordPolicyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchedPasswordPolicyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("password_field") != null && !jsonObj.get("password_field").isJsonNull()) && !jsonObj.get("password_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password_field").toString()));
      }
      if ((jsonObj.get("symbol_charset") != null && !jsonObj.get("symbol_charset").isJsonNull()) && !jsonObj.get("symbol_charset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol_charset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol_charset").toString()));
      }
      if ((jsonObj.get("error_message") != null && !jsonObj.get("error_message").isJsonNull()) && !jsonObj.get("error_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchedPasswordPolicyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchedPasswordPolicyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchedPasswordPolicyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchedPasswordPolicyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchedPasswordPolicyRequest>() {
           @Override
           public void write(JsonWriter out, PatchedPasswordPolicyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchedPasswordPolicyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatchedPasswordPolicyRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatchedPasswordPolicyRequest
   * @throws IOException if the JSON string is invalid with respect to PatchedPasswordPolicyRequest
   */
  public static PatchedPasswordPolicyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchedPasswordPolicyRequest.class);
  }

  /**
   * Convert an instance of PatchedPasswordPolicyRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

