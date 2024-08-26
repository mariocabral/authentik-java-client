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
 * Settings Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class Settings {
  public static final String SERIALIZED_NAME_AVATARS = "avatars";
  @SerializedName(SERIALIZED_NAME_AVATARS)
  private String avatars;

  public static final String SERIALIZED_NAME_DEFAULT_USER_CHANGE_NAME = "default_user_change_name";
  @SerializedName(SERIALIZED_NAME_DEFAULT_USER_CHANGE_NAME)
  private Boolean defaultUserChangeName;

  public static final String SERIALIZED_NAME_DEFAULT_USER_CHANGE_EMAIL = "default_user_change_email";
  @SerializedName(SERIALIZED_NAME_DEFAULT_USER_CHANGE_EMAIL)
  private Boolean defaultUserChangeEmail;

  public static final String SERIALIZED_NAME_DEFAULT_USER_CHANGE_USERNAME = "default_user_change_username";
  @SerializedName(SERIALIZED_NAME_DEFAULT_USER_CHANGE_USERNAME)
  private Boolean defaultUserChangeUsername;

  public static final String SERIALIZED_NAME_EVENT_RETENTION = "event_retention";
  @SerializedName(SERIALIZED_NAME_EVENT_RETENTION)
  private String eventRetention;

  public static final String SERIALIZED_NAME_FOOTER_LINKS = "footer_links";
  @SerializedName(SERIALIZED_NAME_FOOTER_LINKS)
  private Object footerLinks = null;

  public static final String SERIALIZED_NAME_GDPR_COMPLIANCE = "gdpr_compliance";
  @SerializedName(SERIALIZED_NAME_GDPR_COMPLIANCE)
  private Boolean gdprCompliance;

  public static final String SERIALIZED_NAME_IMPERSONATION = "impersonation";
  @SerializedName(SERIALIZED_NAME_IMPERSONATION)
  private Boolean impersonation;

  public static final String SERIALIZED_NAME_DEFAULT_TOKEN_DURATION = "default_token_duration";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TOKEN_DURATION)
  private String defaultTokenDuration;

  public static final String SERIALIZED_NAME_DEFAULT_TOKEN_LENGTH = "default_token_length";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TOKEN_LENGTH)
  private Integer defaultTokenLength;

  public Settings() {
  }

  public Settings avatars(String avatars) {
    this.avatars = avatars;
    return this;
  }

  /**
   * Configure how authentik should show avatars for users.
   * @return avatars
   */
  @javax.annotation.Nullable
  public String getAvatars() {
    return avatars;
  }

  public void setAvatars(String avatars) {
    this.avatars = avatars;
  }


  public Settings defaultUserChangeName(Boolean defaultUserChangeName) {
    this.defaultUserChangeName = defaultUserChangeName;
    return this;
  }

  /**
   * Enable the ability for users to change their name.
   * @return defaultUserChangeName
   */
  @javax.annotation.Nullable
  public Boolean getDefaultUserChangeName() {
    return defaultUserChangeName;
  }

  public void setDefaultUserChangeName(Boolean defaultUserChangeName) {
    this.defaultUserChangeName = defaultUserChangeName;
  }


  public Settings defaultUserChangeEmail(Boolean defaultUserChangeEmail) {
    this.defaultUserChangeEmail = defaultUserChangeEmail;
    return this;
  }

  /**
   * Enable the ability for users to change their email address.
   * @return defaultUserChangeEmail
   */
  @javax.annotation.Nullable
  public Boolean getDefaultUserChangeEmail() {
    return defaultUserChangeEmail;
  }

  public void setDefaultUserChangeEmail(Boolean defaultUserChangeEmail) {
    this.defaultUserChangeEmail = defaultUserChangeEmail;
  }


  public Settings defaultUserChangeUsername(Boolean defaultUserChangeUsername) {
    this.defaultUserChangeUsername = defaultUserChangeUsername;
    return this;
  }

  /**
   * Enable the ability for users to change their username.
   * @return defaultUserChangeUsername
   */
  @javax.annotation.Nullable
  public Boolean getDefaultUserChangeUsername() {
    return defaultUserChangeUsername;
  }

  public void setDefaultUserChangeUsername(Boolean defaultUserChangeUsername) {
    this.defaultUserChangeUsername = defaultUserChangeUsername;
  }


  public Settings eventRetention(String eventRetention) {
    this.eventRetention = eventRetention;
    return this;
  }

  /**
   * Events will be deleted after this duration.(Format: weeks&#x3D;3;days&#x3D;2;hours&#x3D;3,seconds&#x3D;2).
   * @return eventRetention
   */
  @javax.annotation.Nullable
  public String getEventRetention() {
    return eventRetention;
  }

  public void setEventRetention(String eventRetention) {
    this.eventRetention = eventRetention;
  }


  public Settings footerLinks(Object footerLinks) {
    this.footerLinks = footerLinks;
    return this;
  }

  /**
   * The option configures the footer links on the flow executor pages.
   * @return footerLinks
   */
  @javax.annotation.Nullable
  public Object getFooterLinks() {
    return footerLinks;
  }

  public void setFooterLinks(Object footerLinks) {
    this.footerLinks = footerLinks;
  }


  public Settings gdprCompliance(Boolean gdprCompliance) {
    this.gdprCompliance = gdprCompliance;
    return this;
  }

  /**
   * When enabled, all the events caused by a user will be deleted upon the user&#39;s deletion.
   * @return gdprCompliance
   */
  @javax.annotation.Nullable
  public Boolean getGdprCompliance() {
    return gdprCompliance;
  }

  public void setGdprCompliance(Boolean gdprCompliance) {
    this.gdprCompliance = gdprCompliance;
  }


  public Settings impersonation(Boolean impersonation) {
    this.impersonation = impersonation;
    return this;
  }

  /**
   * Globally enable/disable impersonation.
   * @return impersonation
   */
  @javax.annotation.Nullable
  public Boolean getImpersonation() {
    return impersonation;
  }

  public void setImpersonation(Boolean impersonation) {
    this.impersonation = impersonation;
  }


  public Settings defaultTokenDuration(String defaultTokenDuration) {
    this.defaultTokenDuration = defaultTokenDuration;
    return this;
  }

  /**
   * Default token duration
   * @return defaultTokenDuration
   */
  @javax.annotation.Nullable
  public String getDefaultTokenDuration() {
    return defaultTokenDuration;
  }

  public void setDefaultTokenDuration(String defaultTokenDuration) {
    this.defaultTokenDuration = defaultTokenDuration;
  }


  public Settings defaultTokenLength(Integer defaultTokenLength) {
    this.defaultTokenLength = defaultTokenLength;
    return this;
  }

  /**
   * Default token length
   * minimum: 1
   * maximum: 2147483647
   * @return defaultTokenLength
   */
  @javax.annotation.Nullable
  public Integer getDefaultTokenLength() {
    return defaultTokenLength;
  }

  public void setDefaultTokenLength(Integer defaultTokenLength) {
    this.defaultTokenLength = defaultTokenLength;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;
    return Objects.equals(this.avatars, settings.avatars) &&
        Objects.equals(this.defaultUserChangeName, settings.defaultUserChangeName) &&
        Objects.equals(this.defaultUserChangeEmail, settings.defaultUserChangeEmail) &&
        Objects.equals(this.defaultUserChangeUsername, settings.defaultUserChangeUsername) &&
        Objects.equals(this.eventRetention, settings.eventRetention) &&
        Objects.equals(this.footerLinks, settings.footerLinks) &&
        Objects.equals(this.gdprCompliance, settings.gdprCompliance) &&
        Objects.equals(this.impersonation, settings.impersonation) &&
        Objects.equals(this.defaultTokenDuration, settings.defaultTokenDuration) &&
        Objects.equals(this.defaultTokenLength, settings.defaultTokenLength);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatars, defaultUserChangeName, defaultUserChangeEmail, defaultUserChangeUsername, eventRetention, footerLinks, gdprCompliance, impersonation, defaultTokenDuration, defaultTokenLength);
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
    sb.append("class Settings {\n");
    sb.append("    avatars: ").append(toIndentedString(avatars)).append("\n");
    sb.append("    defaultUserChangeName: ").append(toIndentedString(defaultUserChangeName)).append("\n");
    sb.append("    defaultUserChangeEmail: ").append(toIndentedString(defaultUserChangeEmail)).append("\n");
    sb.append("    defaultUserChangeUsername: ").append(toIndentedString(defaultUserChangeUsername)).append("\n");
    sb.append("    eventRetention: ").append(toIndentedString(eventRetention)).append("\n");
    sb.append("    footerLinks: ").append(toIndentedString(footerLinks)).append("\n");
    sb.append("    gdprCompliance: ").append(toIndentedString(gdprCompliance)).append("\n");
    sb.append("    impersonation: ").append(toIndentedString(impersonation)).append("\n");
    sb.append("    defaultTokenDuration: ").append(toIndentedString(defaultTokenDuration)).append("\n");
    sb.append("    defaultTokenLength: ").append(toIndentedString(defaultTokenLength)).append("\n");
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
    openapiFields.add("avatars");
    openapiFields.add("default_user_change_name");
    openapiFields.add("default_user_change_email");
    openapiFields.add("default_user_change_username");
    openapiFields.add("event_retention");
    openapiFields.add("footer_links");
    openapiFields.add("gdpr_compliance");
    openapiFields.add("impersonation");
    openapiFields.add("default_token_duration");
    openapiFields.add("default_token_length");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Settings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Settings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Settings is not found in the empty JSON string", Settings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Settings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Settings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("avatars") != null && !jsonObj.get("avatars").isJsonNull()) && !jsonObj.get("avatars").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatars` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatars").toString()));
      }
      if ((jsonObj.get("event_retention") != null && !jsonObj.get("event_retention").isJsonNull()) && !jsonObj.get("event_retention").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_retention` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_retention").toString()));
      }
      if ((jsonObj.get("default_token_duration") != null && !jsonObj.get("default_token_duration").isJsonNull()) && !jsonObj.get("default_token_duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_token_duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_token_duration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Settings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Settings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Settings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Settings.class));

       return (TypeAdapter<T>) new TypeAdapter<Settings>() {
           @Override
           public void write(JsonWriter out, Settings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Settings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Settings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Settings
   * @throws IOException if the JSON string is invalid with respect to Settings
   */
  public static Settings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Settings.class);
  }

  /**
   * Convert an instance of Settings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

