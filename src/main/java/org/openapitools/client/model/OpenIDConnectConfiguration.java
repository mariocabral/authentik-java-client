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
 * rest_framework Serializer for OIDC Configuration
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class OpenIDConnectConfiguration {
  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_AUTHORIZATION_ENDPOINT = "authorization_endpoint";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_ENDPOINT)
  private String authorizationEndpoint;

  public static final String SERIALIZED_NAME_TOKEN_ENDPOINT = "token_endpoint";
  @SerializedName(SERIALIZED_NAME_TOKEN_ENDPOINT)
  private String tokenEndpoint;

  public static final String SERIALIZED_NAME_USERINFO_ENDPOINT = "userinfo_endpoint";
  @SerializedName(SERIALIZED_NAME_USERINFO_ENDPOINT)
  private String userinfoEndpoint;

  public static final String SERIALIZED_NAME_END_SESSION_ENDPOINT = "end_session_endpoint";
  @SerializedName(SERIALIZED_NAME_END_SESSION_ENDPOINT)
  private String endSessionEndpoint;

  public static final String SERIALIZED_NAME_INTROSPECTION_ENDPOINT = "introspection_endpoint";
  @SerializedName(SERIALIZED_NAME_INTROSPECTION_ENDPOINT)
  private String introspectionEndpoint;

  public static final String SERIALIZED_NAME_JWKS_URI = "jwks_uri";
  @SerializedName(SERIALIZED_NAME_JWKS_URI)
  private String jwksUri;

  public static final String SERIALIZED_NAME_RESPONSE_TYPES_SUPPORTED = "response_types_supported";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPES_SUPPORTED)
  private List<String> responseTypesSupported = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID_TOKEN_SIGNING_ALG_VALUES_SUPPORTED = "id_token_signing_alg_values_supported";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN_SIGNING_ALG_VALUES_SUPPORTED)
  private List<String> idTokenSigningAlgValuesSupported = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBJECT_TYPES_SUPPORTED = "subject_types_supported";
  @SerializedName(SERIALIZED_NAME_SUBJECT_TYPES_SUPPORTED)
  private List<String> subjectTypesSupported = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_METHODS_SUPPORTED = "token_endpoint_auth_methods_supported";
  @SerializedName(SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_METHODS_SUPPORTED)
  private List<String> tokenEndpointAuthMethodsSupported = new ArrayList<>();

  public OpenIDConnectConfiguration() {
  }

  public OpenIDConnectConfiguration issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
   */
  @javax.annotation.Nonnull
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public OpenIDConnectConfiguration authorizationEndpoint(String authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
    return this;
  }

  /**
   * Get authorizationEndpoint
   * @return authorizationEndpoint
   */
  @javax.annotation.Nonnull
  public String getAuthorizationEndpoint() {
    return authorizationEndpoint;
  }

  public void setAuthorizationEndpoint(String authorizationEndpoint) {
    this.authorizationEndpoint = authorizationEndpoint;
  }


  public OpenIDConnectConfiguration tokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

  /**
   * Get tokenEndpoint
   * @return tokenEndpoint
   */
  @javax.annotation.Nonnull
  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  public void setTokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
  }


  public OpenIDConnectConfiguration userinfoEndpoint(String userinfoEndpoint) {
    this.userinfoEndpoint = userinfoEndpoint;
    return this;
  }

  /**
   * Get userinfoEndpoint
   * @return userinfoEndpoint
   */
  @javax.annotation.Nonnull
  public String getUserinfoEndpoint() {
    return userinfoEndpoint;
  }

  public void setUserinfoEndpoint(String userinfoEndpoint) {
    this.userinfoEndpoint = userinfoEndpoint;
  }


  public OpenIDConnectConfiguration endSessionEndpoint(String endSessionEndpoint) {
    this.endSessionEndpoint = endSessionEndpoint;
    return this;
  }

  /**
   * Get endSessionEndpoint
   * @return endSessionEndpoint
   */
  @javax.annotation.Nonnull
  public String getEndSessionEndpoint() {
    return endSessionEndpoint;
  }

  public void setEndSessionEndpoint(String endSessionEndpoint) {
    this.endSessionEndpoint = endSessionEndpoint;
  }


  public OpenIDConnectConfiguration introspectionEndpoint(String introspectionEndpoint) {
    this.introspectionEndpoint = introspectionEndpoint;
    return this;
  }

  /**
   * Get introspectionEndpoint
   * @return introspectionEndpoint
   */
  @javax.annotation.Nonnull
  public String getIntrospectionEndpoint() {
    return introspectionEndpoint;
  }

  public void setIntrospectionEndpoint(String introspectionEndpoint) {
    this.introspectionEndpoint = introspectionEndpoint;
  }


  public OpenIDConnectConfiguration jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * Get jwksUri
   * @return jwksUri
   */
  @javax.annotation.Nonnull
  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }


  public OpenIDConnectConfiguration responseTypesSupported(List<String> responseTypesSupported) {
    this.responseTypesSupported = responseTypesSupported;
    return this;
  }

  public OpenIDConnectConfiguration addResponseTypesSupportedItem(String responseTypesSupportedItem) {
    if (this.responseTypesSupported == null) {
      this.responseTypesSupported = new ArrayList<>();
    }
    this.responseTypesSupported.add(responseTypesSupportedItem);
    return this;
  }

  /**
   * Get responseTypesSupported
   * @return responseTypesSupported
   */
  @javax.annotation.Nonnull
  public List<String> getResponseTypesSupported() {
    return responseTypesSupported;
  }

  public void setResponseTypesSupported(List<String> responseTypesSupported) {
    this.responseTypesSupported = responseTypesSupported;
  }


  public OpenIDConnectConfiguration idTokenSigningAlgValuesSupported(List<String> idTokenSigningAlgValuesSupported) {
    this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
    return this;
  }

  public OpenIDConnectConfiguration addIdTokenSigningAlgValuesSupportedItem(String idTokenSigningAlgValuesSupportedItem) {
    if (this.idTokenSigningAlgValuesSupported == null) {
      this.idTokenSigningAlgValuesSupported = new ArrayList<>();
    }
    this.idTokenSigningAlgValuesSupported.add(idTokenSigningAlgValuesSupportedItem);
    return this;
  }

  /**
   * Get idTokenSigningAlgValuesSupported
   * @return idTokenSigningAlgValuesSupported
   */
  @javax.annotation.Nonnull
  public List<String> getIdTokenSigningAlgValuesSupported() {
    return idTokenSigningAlgValuesSupported;
  }

  public void setIdTokenSigningAlgValuesSupported(List<String> idTokenSigningAlgValuesSupported) {
    this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
  }


  public OpenIDConnectConfiguration subjectTypesSupported(List<String> subjectTypesSupported) {
    this.subjectTypesSupported = subjectTypesSupported;
    return this;
  }

  public OpenIDConnectConfiguration addSubjectTypesSupportedItem(String subjectTypesSupportedItem) {
    if (this.subjectTypesSupported == null) {
      this.subjectTypesSupported = new ArrayList<>();
    }
    this.subjectTypesSupported.add(subjectTypesSupportedItem);
    return this;
  }

  /**
   * Get subjectTypesSupported
   * @return subjectTypesSupported
   */
  @javax.annotation.Nonnull
  public List<String> getSubjectTypesSupported() {
    return subjectTypesSupported;
  }

  public void setSubjectTypesSupported(List<String> subjectTypesSupported) {
    this.subjectTypesSupported = subjectTypesSupported;
  }


  public OpenIDConnectConfiguration tokenEndpointAuthMethodsSupported(List<String> tokenEndpointAuthMethodsSupported) {
    this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
    return this;
  }

  public OpenIDConnectConfiguration addTokenEndpointAuthMethodsSupportedItem(String tokenEndpointAuthMethodsSupportedItem) {
    if (this.tokenEndpointAuthMethodsSupported == null) {
      this.tokenEndpointAuthMethodsSupported = new ArrayList<>();
    }
    this.tokenEndpointAuthMethodsSupported.add(tokenEndpointAuthMethodsSupportedItem);
    return this;
  }

  /**
   * Get tokenEndpointAuthMethodsSupported
   * @return tokenEndpointAuthMethodsSupported
   */
  @javax.annotation.Nonnull
  public List<String> getTokenEndpointAuthMethodsSupported() {
    return tokenEndpointAuthMethodsSupported;
  }

  public void setTokenEndpointAuthMethodsSupported(List<String> tokenEndpointAuthMethodsSupported) {
    this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenIDConnectConfiguration openIDConnectConfiguration = (OpenIDConnectConfiguration) o;
    return Objects.equals(this.issuer, openIDConnectConfiguration.issuer) &&
        Objects.equals(this.authorizationEndpoint, openIDConnectConfiguration.authorizationEndpoint) &&
        Objects.equals(this.tokenEndpoint, openIDConnectConfiguration.tokenEndpoint) &&
        Objects.equals(this.userinfoEndpoint, openIDConnectConfiguration.userinfoEndpoint) &&
        Objects.equals(this.endSessionEndpoint, openIDConnectConfiguration.endSessionEndpoint) &&
        Objects.equals(this.introspectionEndpoint, openIDConnectConfiguration.introspectionEndpoint) &&
        Objects.equals(this.jwksUri, openIDConnectConfiguration.jwksUri) &&
        Objects.equals(this.responseTypesSupported, openIDConnectConfiguration.responseTypesSupported) &&
        Objects.equals(this.idTokenSigningAlgValuesSupported, openIDConnectConfiguration.idTokenSigningAlgValuesSupported) &&
        Objects.equals(this.subjectTypesSupported, openIDConnectConfiguration.subjectTypesSupported) &&
        Objects.equals(this.tokenEndpointAuthMethodsSupported, openIDConnectConfiguration.tokenEndpointAuthMethodsSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuer, authorizationEndpoint, tokenEndpoint, userinfoEndpoint, endSessionEndpoint, introspectionEndpoint, jwksUri, responseTypesSupported, idTokenSigningAlgValuesSupported, subjectTypesSupported, tokenEndpointAuthMethodsSupported);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIDConnectConfiguration {\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    authorizationEndpoint: ").append(toIndentedString(authorizationEndpoint)).append("\n");
    sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
    sb.append("    userinfoEndpoint: ").append(toIndentedString(userinfoEndpoint)).append("\n");
    sb.append("    endSessionEndpoint: ").append(toIndentedString(endSessionEndpoint)).append("\n");
    sb.append("    introspectionEndpoint: ").append(toIndentedString(introspectionEndpoint)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
    sb.append("    responseTypesSupported: ").append(toIndentedString(responseTypesSupported)).append("\n");
    sb.append("    idTokenSigningAlgValuesSupported: ").append(toIndentedString(idTokenSigningAlgValuesSupported)).append("\n");
    sb.append("    subjectTypesSupported: ").append(toIndentedString(subjectTypesSupported)).append("\n");
    sb.append("    tokenEndpointAuthMethodsSupported: ").append(toIndentedString(tokenEndpointAuthMethodsSupported)).append("\n");
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
    openapiFields.add("authorization_endpoint");
    openapiFields.add("token_endpoint");
    openapiFields.add("userinfo_endpoint");
    openapiFields.add("end_session_endpoint");
    openapiFields.add("introspection_endpoint");
    openapiFields.add("jwks_uri");
    openapiFields.add("response_types_supported");
    openapiFields.add("id_token_signing_alg_values_supported");
    openapiFields.add("subject_types_supported");
    openapiFields.add("token_endpoint_auth_methods_supported");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issuer");
    openapiRequiredFields.add("authorization_endpoint");
    openapiRequiredFields.add("token_endpoint");
    openapiRequiredFields.add("userinfo_endpoint");
    openapiRequiredFields.add("end_session_endpoint");
    openapiRequiredFields.add("introspection_endpoint");
    openapiRequiredFields.add("jwks_uri");
    openapiRequiredFields.add("response_types_supported");
    openapiRequiredFields.add("id_token_signing_alg_values_supported");
    openapiRequiredFields.add("subject_types_supported");
    openapiRequiredFields.add("token_endpoint_auth_methods_supported");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OpenIDConnectConfiguration
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpenIDConnectConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpenIDConnectConfiguration is not found in the empty JSON string", OpenIDConnectConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpenIDConnectConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpenIDConnectConfiguration` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OpenIDConnectConfiguration.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if (!jsonObj.get("authorization_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_endpoint").toString()));
      }
      if (!jsonObj.get("token_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_endpoint").toString()));
      }
      if (!jsonObj.get("userinfo_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userinfo_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userinfo_endpoint").toString()));
      }
      if (!jsonObj.get("end_session_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_session_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_session_endpoint").toString()));
      }
      if (!jsonObj.get("introspection_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `introspection_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("introspection_endpoint").toString()));
      }
      if (!jsonObj.get("jwks_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwks_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwks_uri").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("response_types_supported") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("response_types_supported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_types_supported` to be an array in the JSON string but got `%s`", jsonObj.get("response_types_supported").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("id_token_signing_alg_values_supported") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("id_token_signing_alg_values_supported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_token_signing_alg_values_supported` to be an array in the JSON string but got `%s`", jsonObj.get("id_token_signing_alg_values_supported").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("subject_types_supported") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("subject_types_supported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_types_supported` to be an array in the JSON string but got `%s`", jsonObj.get("subject_types_supported").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("token_endpoint_auth_methods_supported") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("token_endpoint_auth_methods_supported").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_endpoint_auth_methods_supported` to be an array in the JSON string but got `%s`", jsonObj.get("token_endpoint_auth_methods_supported").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpenIDConnectConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpenIDConnectConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpenIDConnectConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpenIDConnectConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<OpenIDConnectConfiguration>() {
           @Override
           public void write(JsonWriter out, OpenIDConnectConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpenIDConnectConfiguration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OpenIDConnectConfiguration given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OpenIDConnectConfiguration
   * @throws IOException if the JSON string is invalid with respect to OpenIDConnectConfiguration
   */
  public static OpenIDConnectConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpenIDConnectConfiguration.class);
  }

  /**
   * Convert an instance of OpenIDConnectConfiguration to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

