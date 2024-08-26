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
 * OAuth2 Provider Metadata serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class OAuth2ProviderSetupURLs {
  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_AUTHORIZE = "authorize";
  @SerializedName(SERIALIZED_NAME_AUTHORIZE)
  private String authorize;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_USER_INFO = "user_info";
  @SerializedName(SERIALIZED_NAME_USER_INFO)
  private String userInfo;

  public static final String SERIALIZED_NAME_PROVIDER_INFO = "provider_info";
  @SerializedName(SERIALIZED_NAME_PROVIDER_INFO)
  private String providerInfo;

  public static final String SERIALIZED_NAME_LOGOUT = "logout";
  @SerializedName(SERIALIZED_NAME_LOGOUT)
  private String logout;

  public static final String SERIALIZED_NAME_JWKS = "jwks";
  @SerializedName(SERIALIZED_NAME_JWKS)
  private String jwks;

  public OAuth2ProviderSetupURLs() {
  }

  public OAuth2ProviderSetupURLs(
     String issuer, 
     String authorize, 
     String token, 
     String userInfo, 
     String providerInfo, 
     String logout, 
     String jwks
  ) {
    this();
    this.issuer = issuer;
    this.authorize = authorize;
    this.token = token;
    this.userInfo = userInfo;
    this.providerInfo = providerInfo;
    this.logout = logout;
    this.jwks = jwks;
  }

  /**
   * Get issuer
   * @return issuer
   */
  @javax.annotation.Nonnull
  public String getIssuer() {
    return issuer;
  }



  /**
   * Get authorize
   * @return authorize
   */
  @javax.annotation.Nonnull
  public String getAuthorize() {
    return authorize;
  }



  /**
   * Get token
   * @return token
   */
  @javax.annotation.Nonnull
  public String getToken() {
    return token;
  }



  /**
   * Get userInfo
   * @return userInfo
   */
  @javax.annotation.Nonnull
  public String getUserInfo() {
    return userInfo;
  }



  /**
   * Get providerInfo
   * @return providerInfo
   */
  @javax.annotation.Nonnull
  public String getProviderInfo() {
    return providerInfo;
  }



  /**
   * Get logout
   * @return logout
   */
  @javax.annotation.Nonnull
  public String getLogout() {
    return logout;
  }



  /**
   * Get jwks
   * @return jwks
   */
  @javax.annotation.Nonnull
  public String getJwks() {
    return jwks;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2ProviderSetupURLs oauth2ProviderSetupURLs = (OAuth2ProviderSetupURLs) o;
    return Objects.equals(this.issuer, oauth2ProviderSetupURLs.issuer) &&
        Objects.equals(this.authorize, oauth2ProviderSetupURLs.authorize) &&
        Objects.equals(this.token, oauth2ProviderSetupURLs.token) &&
        Objects.equals(this.userInfo, oauth2ProviderSetupURLs.userInfo) &&
        Objects.equals(this.providerInfo, oauth2ProviderSetupURLs.providerInfo) &&
        Objects.equals(this.logout, oauth2ProviderSetupURLs.logout) &&
        Objects.equals(this.jwks, oauth2ProviderSetupURLs.jwks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuer, authorize, token, userInfo, providerInfo, logout, jwks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ProviderSetupURLs {\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    authorize: ").append(toIndentedString(authorize)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
    sb.append("    providerInfo: ").append(toIndentedString(providerInfo)).append("\n");
    sb.append("    logout: ").append(toIndentedString(logout)).append("\n");
    sb.append("    jwks: ").append(toIndentedString(jwks)).append("\n");
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
    openapiFields.add("issuer");
    openapiFields.add("authorize");
    openapiFields.add("token");
    openapiFields.add("user_info");
    openapiFields.add("provider_info");
    openapiFields.add("logout");
    openapiFields.add("jwks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issuer");
    openapiRequiredFields.add("authorize");
    openapiRequiredFields.add("token");
    openapiRequiredFields.add("user_info");
    openapiRequiredFields.add("provider_info");
    openapiRequiredFields.add("logout");
    openapiRequiredFields.add("jwks");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OAuth2ProviderSetupURLs
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OAuth2ProviderSetupURLs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuth2ProviderSetupURLs is not found in the empty JSON string", OAuth2ProviderSetupURLs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OAuth2ProviderSetupURLs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OAuth2ProviderSetupURLs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OAuth2ProviderSetupURLs.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if (!jsonObj.get("authorize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorize").toString()));
      }
      if (!jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if (!jsonObj.get("user_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_info").toString()));
      }
      if (!jsonObj.get("provider_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `provider_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("provider_info").toString()));
      }
      if (!jsonObj.get("logout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logout").toString()));
      }
      if (!jsonObj.get("jwks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwks").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuth2ProviderSetupURLs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuth2ProviderSetupURLs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuth2ProviderSetupURLs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuth2ProviderSetupURLs.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuth2ProviderSetupURLs>() {
           @Override
           public void write(JsonWriter out, OAuth2ProviderSetupURLs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OAuth2ProviderSetupURLs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OAuth2ProviderSetupURLs given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OAuth2ProviderSetupURLs
   * @throws IOException if the JSON string is invalid with respect to OAuth2ProviderSetupURLs
   */
  public static OAuth2ProviderSetupURLs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuth2ProviderSetupURLs.class);
  }

  /**
   * Convert an instance of OAuth2ProviderSetupURLs to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

