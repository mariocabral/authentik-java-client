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
import org.openapitools.client.model.PolicyEngineMode;
import org.openapitools.client.model.ProviderTypeEnum;
import org.openapitools.client.model.UserMatchingModeEnum;
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
 * OAuth Source Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class PatchedOAuthSourceRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_AUTHENTICATION_FLOW = "authentication_flow";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_FLOW)
  private UUID authenticationFlow;

  public static final String SERIALIZED_NAME_ENROLLMENT_FLOW = "enrollment_flow";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_FLOW)
  private UUID enrollmentFlow;

  public static final String SERIALIZED_NAME_POLICY_ENGINE_MODE = "policy_engine_mode";
  @SerializedName(SERIALIZED_NAME_POLICY_ENGINE_MODE)
  private PolicyEngineMode policyEngineMode;

  public static final String SERIALIZED_NAME_USER_MATCHING_MODE = "user_matching_mode";
  @SerializedName(SERIALIZED_NAME_USER_MATCHING_MODE)
  private UserMatchingModeEnum userMatchingMode;

  public static final String SERIALIZED_NAME_USER_PATH_TEMPLATE = "user_path_template";
  @SerializedName(SERIALIZED_NAME_USER_PATH_TEMPLATE)
  private String userPathTemplate;

  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "provider_type";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private ProviderTypeEnum providerType;

  public static final String SERIALIZED_NAME_REQUEST_TOKEN_URL = "request_token_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_TOKEN_URL)
  private String requestTokenUrl;

  public static final String SERIALIZED_NAME_AUTHORIZATION_URL = "authorization_url";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_URL)
  private String authorizationUrl;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN_URL = "access_token_url";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN_URL)
  private String accessTokenUrl;

  public static final String SERIALIZED_NAME_PROFILE_URL = "profile_url";
  @SerializedName(SERIALIZED_NAME_PROFILE_URL)
  private String profileUrl;

  public static final String SERIALIZED_NAME_CONSUMER_KEY = "consumer_key";
  @SerializedName(SERIALIZED_NAME_CONSUMER_KEY)
  private String consumerKey;

  public static final String SERIALIZED_NAME_CONSUMER_SECRET = "consumer_secret";
  @SerializedName(SERIALIZED_NAME_CONSUMER_SECRET)
  private String consumerSecret;

  public static final String SERIALIZED_NAME_ADDITIONAL_SCOPES = "additional_scopes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_SCOPES)
  private String additionalScopes;

  public static final String SERIALIZED_NAME_OIDC_WELL_KNOWN_URL = "oidc_well_known_url";
  @SerializedName(SERIALIZED_NAME_OIDC_WELL_KNOWN_URL)
  private String oidcWellKnownUrl;

  public static final String SERIALIZED_NAME_OIDC_JWKS_URL = "oidc_jwks_url";
  @SerializedName(SERIALIZED_NAME_OIDC_JWKS_URL)
  private String oidcJwksUrl;

  public static final String SERIALIZED_NAME_OIDC_JWKS = "oidc_jwks";
  @SerializedName(SERIALIZED_NAME_OIDC_JWKS)
  private Object oidcJwks = null;

  public PatchedOAuthSourceRequest() {
  }

  public PatchedOAuthSourceRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Source&#39;s display Name.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PatchedOAuthSourceRequest slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Internal source name, used in URLs.
   * @return slug
   */
  @javax.annotation.Nullable
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  public PatchedOAuthSourceRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PatchedOAuthSourceRequest authenticationFlow(UUID authenticationFlow) {
    this.authenticationFlow = authenticationFlow;
    return this;
  }

  /**
   * Flow to use when authenticating existing users.
   * @return authenticationFlow
   */
  @javax.annotation.Nullable
  public UUID getAuthenticationFlow() {
    return authenticationFlow;
  }

  public void setAuthenticationFlow(UUID authenticationFlow) {
    this.authenticationFlow = authenticationFlow;
  }


  public PatchedOAuthSourceRequest enrollmentFlow(UUID enrollmentFlow) {
    this.enrollmentFlow = enrollmentFlow;
    return this;
  }

  /**
   * Flow to use when enrolling new users.
   * @return enrollmentFlow
   */
  @javax.annotation.Nullable
  public UUID getEnrollmentFlow() {
    return enrollmentFlow;
  }

  public void setEnrollmentFlow(UUID enrollmentFlow) {
    this.enrollmentFlow = enrollmentFlow;
  }


  public PatchedOAuthSourceRequest policyEngineMode(PolicyEngineMode policyEngineMode) {
    this.policyEngineMode = policyEngineMode;
    return this;
  }

  /**
   * Get policyEngineMode
   * @return policyEngineMode
   */
  @javax.annotation.Nullable
  public PolicyEngineMode getPolicyEngineMode() {
    return policyEngineMode;
  }

  public void setPolicyEngineMode(PolicyEngineMode policyEngineMode) {
    this.policyEngineMode = policyEngineMode;
  }


  public PatchedOAuthSourceRequest userMatchingMode(UserMatchingModeEnum userMatchingMode) {
    this.userMatchingMode = userMatchingMode;
    return this;
  }

  /**
   * How the source determines if an existing user should be authenticated or a new user enrolled.
   * @return userMatchingMode
   */
  @javax.annotation.Nullable
  public UserMatchingModeEnum getUserMatchingMode() {
    return userMatchingMode;
  }

  public void setUserMatchingMode(UserMatchingModeEnum userMatchingMode) {
    this.userMatchingMode = userMatchingMode;
  }


  public PatchedOAuthSourceRequest userPathTemplate(String userPathTemplate) {
    this.userPathTemplate = userPathTemplate;
    return this;
  }

  /**
   * Get userPathTemplate
   * @return userPathTemplate
   */
  @javax.annotation.Nullable
  public String getUserPathTemplate() {
    return userPathTemplate;
  }

  public void setUserPathTemplate(String userPathTemplate) {
    this.userPathTemplate = userPathTemplate;
  }


  public PatchedOAuthSourceRequest providerType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
    return this;
  }

  /**
   * Get providerType
   * @return providerType
   */
  @javax.annotation.Nullable
  public ProviderTypeEnum getProviderType() {
    return providerType;
  }

  public void setProviderType(ProviderTypeEnum providerType) {
    this.providerType = providerType;
  }


  public PatchedOAuthSourceRequest requestTokenUrl(String requestTokenUrl) {
    this.requestTokenUrl = requestTokenUrl;
    return this;
  }

  /**
   * URL used to request the initial token. This URL is only required for OAuth 1.
   * @return requestTokenUrl
   */
  @javax.annotation.Nullable
  public String getRequestTokenUrl() {
    return requestTokenUrl;
  }

  public void setRequestTokenUrl(String requestTokenUrl) {
    this.requestTokenUrl = requestTokenUrl;
  }


  public PatchedOAuthSourceRequest authorizationUrl(String authorizationUrl) {
    this.authorizationUrl = authorizationUrl;
    return this;
  }

  /**
   * URL the user is redirect to to conest the flow.
   * @return authorizationUrl
   */
  @javax.annotation.Nullable
  public String getAuthorizationUrl() {
    return authorizationUrl;
  }

  public void setAuthorizationUrl(String authorizationUrl) {
    this.authorizationUrl = authorizationUrl;
  }


  public PatchedOAuthSourceRequest accessTokenUrl(String accessTokenUrl) {
    this.accessTokenUrl = accessTokenUrl;
    return this;
  }

  /**
   * URL used by authentik to retrieve tokens.
   * @return accessTokenUrl
   */
  @javax.annotation.Nullable
  public String getAccessTokenUrl() {
    return accessTokenUrl;
  }

  public void setAccessTokenUrl(String accessTokenUrl) {
    this.accessTokenUrl = accessTokenUrl;
  }


  public PatchedOAuthSourceRequest profileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
    return this;
  }

  /**
   * URL used by authentik to get user information.
   * @return profileUrl
   */
  @javax.annotation.Nullable
  public String getProfileUrl() {
    return profileUrl;
  }

  public void setProfileUrl(String profileUrl) {
    this.profileUrl = profileUrl;
  }


  public PatchedOAuthSourceRequest consumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }

  /**
   * Get consumerKey
   * @return consumerKey
   */
  @javax.annotation.Nullable
  public String getConsumerKey() {
    return consumerKey;
  }

  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }


  public PatchedOAuthSourceRequest consumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
    return this;
  }

  /**
   * Get consumerSecret
   * @return consumerSecret
   */
  @javax.annotation.Nullable
  public String getConsumerSecret() {
    return consumerSecret;
  }

  public void setConsumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
  }


  public PatchedOAuthSourceRequest additionalScopes(String additionalScopes) {
    this.additionalScopes = additionalScopes;
    return this;
  }

  /**
   * Get additionalScopes
   * @return additionalScopes
   */
  @javax.annotation.Nullable
  public String getAdditionalScopes() {
    return additionalScopes;
  }

  public void setAdditionalScopes(String additionalScopes) {
    this.additionalScopes = additionalScopes;
  }


  public PatchedOAuthSourceRequest oidcWellKnownUrl(String oidcWellKnownUrl) {
    this.oidcWellKnownUrl = oidcWellKnownUrl;
    return this;
  }

  /**
   * Get oidcWellKnownUrl
   * @return oidcWellKnownUrl
   */
  @javax.annotation.Nullable
  public String getOidcWellKnownUrl() {
    return oidcWellKnownUrl;
  }

  public void setOidcWellKnownUrl(String oidcWellKnownUrl) {
    this.oidcWellKnownUrl = oidcWellKnownUrl;
  }


  public PatchedOAuthSourceRequest oidcJwksUrl(String oidcJwksUrl) {
    this.oidcJwksUrl = oidcJwksUrl;
    return this;
  }

  /**
   * Get oidcJwksUrl
   * @return oidcJwksUrl
   */
  @javax.annotation.Nullable
  public String getOidcJwksUrl() {
    return oidcJwksUrl;
  }

  public void setOidcJwksUrl(String oidcJwksUrl) {
    this.oidcJwksUrl = oidcJwksUrl;
  }


  public PatchedOAuthSourceRequest oidcJwks(Object oidcJwks) {
    this.oidcJwks = oidcJwks;
    return this;
  }

  /**
   * Get oidcJwks
   * @return oidcJwks
   */
  @javax.annotation.Nullable
  public Object getOidcJwks() {
    return oidcJwks;
  }

  public void setOidcJwks(Object oidcJwks) {
    this.oidcJwks = oidcJwks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchedOAuthSourceRequest patchedOAuthSourceRequest = (PatchedOAuthSourceRequest) o;
    return Objects.equals(this.name, patchedOAuthSourceRequest.name) &&
        Objects.equals(this.slug, patchedOAuthSourceRequest.slug) &&
        Objects.equals(this.enabled, patchedOAuthSourceRequest.enabled) &&
        Objects.equals(this.authenticationFlow, patchedOAuthSourceRequest.authenticationFlow) &&
        Objects.equals(this.enrollmentFlow, patchedOAuthSourceRequest.enrollmentFlow) &&
        Objects.equals(this.policyEngineMode, patchedOAuthSourceRequest.policyEngineMode) &&
        Objects.equals(this.userMatchingMode, patchedOAuthSourceRequest.userMatchingMode) &&
        Objects.equals(this.userPathTemplate, patchedOAuthSourceRequest.userPathTemplate) &&
        Objects.equals(this.providerType, patchedOAuthSourceRequest.providerType) &&
        Objects.equals(this.requestTokenUrl, patchedOAuthSourceRequest.requestTokenUrl) &&
        Objects.equals(this.authorizationUrl, patchedOAuthSourceRequest.authorizationUrl) &&
        Objects.equals(this.accessTokenUrl, patchedOAuthSourceRequest.accessTokenUrl) &&
        Objects.equals(this.profileUrl, patchedOAuthSourceRequest.profileUrl) &&
        Objects.equals(this.consumerKey, patchedOAuthSourceRequest.consumerKey) &&
        Objects.equals(this.consumerSecret, patchedOAuthSourceRequest.consumerSecret) &&
        Objects.equals(this.additionalScopes, patchedOAuthSourceRequest.additionalScopes) &&
        Objects.equals(this.oidcWellKnownUrl, patchedOAuthSourceRequest.oidcWellKnownUrl) &&
        Objects.equals(this.oidcJwksUrl, patchedOAuthSourceRequest.oidcJwksUrl) &&
        Objects.equals(this.oidcJwks, patchedOAuthSourceRequest.oidcJwks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, enabled, authenticationFlow, enrollmentFlow, policyEngineMode, userMatchingMode, userPathTemplate, providerType, requestTokenUrl, authorizationUrl, accessTokenUrl, profileUrl, consumerKey, consumerSecret, additionalScopes, oidcWellKnownUrl, oidcJwksUrl, oidcJwks);
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
    sb.append("class PatchedOAuthSourceRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    authenticationFlow: ").append(toIndentedString(authenticationFlow)).append("\n");
    sb.append("    enrollmentFlow: ").append(toIndentedString(enrollmentFlow)).append("\n");
    sb.append("    policyEngineMode: ").append(toIndentedString(policyEngineMode)).append("\n");
    sb.append("    userMatchingMode: ").append(toIndentedString(userMatchingMode)).append("\n");
    sb.append("    userPathTemplate: ").append(toIndentedString(userPathTemplate)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    requestTokenUrl: ").append(toIndentedString(requestTokenUrl)).append("\n");
    sb.append("    authorizationUrl: ").append(toIndentedString(authorizationUrl)).append("\n");
    sb.append("    accessTokenUrl: ").append(toIndentedString(accessTokenUrl)).append("\n");
    sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    consumerSecret: ").append(toIndentedString(consumerSecret)).append("\n");
    sb.append("    additionalScopes: ").append(toIndentedString(additionalScopes)).append("\n");
    sb.append("    oidcWellKnownUrl: ").append(toIndentedString(oidcWellKnownUrl)).append("\n");
    sb.append("    oidcJwksUrl: ").append(toIndentedString(oidcJwksUrl)).append("\n");
    sb.append("    oidcJwks: ").append(toIndentedString(oidcJwks)).append("\n");
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
    openapiFields.add("slug");
    openapiFields.add("enabled");
    openapiFields.add("authentication_flow");
    openapiFields.add("enrollment_flow");
    openapiFields.add("policy_engine_mode");
    openapiFields.add("user_matching_mode");
    openapiFields.add("user_path_template");
    openapiFields.add("provider_type");
    openapiFields.add("request_token_url");
    openapiFields.add("authorization_url");
    openapiFields.add("access_token_url");
    openapiFields.add("profile_url");
    openapiFields.add("consumer_key");
    openapiFields.add("consumer_secret");
    openapiFields.add("additional_scopes");
    openapiFields.add("oidc_well_known_url");
    openapiFields.add("oidc_jwks_url");
    openapiFields.add("oidc_jwks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PatchedOAuthSourceRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatchedOAuthSourceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchedOAuthSourceRequest is not found in the empty JSON string", PatchedOAuthSourceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatchedOAuthSourceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchedOAuthSourceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("slug") != null && !jsonObj.get("slug").isJsonNull()) && !jsonObj.get("slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slug").toString()));
      }
      if ((jsonObj.get("authentication_flow") != null && !jsonObj.get("authentication_flow").isJsonNull()) && !jsonObj.get("authentication_flow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authentication_flow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authentication_flow").toString()));
      }
      if ((jsonObj.get("enrollment_flow") != null && !jsonObj.get("enrollment_flow").isJsonNull()) && !jsonObj.get("enrollment_flow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enrollment_flow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enrollment_flow").toString()));
      }
      // validate the optional field `policy_engine_mode`
      if (jsonObj.get("policy_engine_mode") != null && !jsonObj.get("policy_engine_mode").isJsonNull()) {
        PolicyEngineMode.validateJsonElement(jsonObj.get("policy_engine_mode"));
      }
      // validate the optional field `user_matching_mode`
      if (jsonObj.get("user_matching_mode") != null && !jsonObj.get("user_matching_mode").isJsonNull()) {
        UserMatchingModeEnum.validateJsonElement(jsonObj.get("user_matching_mode"));
      }
      if ((jsonObj.get("user_path_template") != null && !jsonObj.get("user_path_template").isJsonNull()) && !jsonObj.get("user_path_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_path_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_path_template").toString()));
      }
      // validate the optional field `provider_type`
      if (jsonObj.get("provider_type") != null && !jsonObj.get("provider_type").isJsonNull()) {
        ProviderTypeEnum.validateJsonElement(jsonObj.get("provider_type"));
      }
      if ((jsonObj.get("request_token_url") != null && !jsonObj.get("request_token_url").isJsonNull()) && !jsonObj.get("request_token_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_token_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_token_url").toString()));
      }
      if ((jsonObj.get("authorization_url") != null && !jsonObj.get("authorization_url").isJsonNull()) && !jsonObj.get("authorization_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_url").toString()));
      }
      if ((jsonObj.get("access_token_url") != null && !jsonObj.get("access_token_url").isJsonNull()) && !jsonObj.get("access_token_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token_url").toString()));
      }
      if ((jsonObj.get("profile_url") != null && !jsonObj.get("profile_url").isJsonNull()) && !jsonObj.get("profile_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_url").toString()));
      }
      if ((jsonObj.get("consumer_key") != null && !jsonObj.get("consumer_key").isJsonNull()) && !jsonObj.get("consumer_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_key").toString()));
      }
      if ((jsonObj.get("consumer_secret") != null && !jsonObj.get("consumer_secret").isJsonNull()) && !jsonObj.get("consumer_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_secret").toString()));
      }
      if ((jsonObj.get("additional_scopes") != null && !jsonObj.get("additional_scopes").isJsonNull()) && !jsonObj.get("additional_scopes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_scopes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_scopes").toString()));
      }
      if ((jsonObj.get("oidc_well_known_url") != null && !jsonObj.get("oidc_well_known_url").isJsonNull()) && !jsonObj.get("oidc_well_known_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oidc_well_known_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oidc_well_known_url").toString()));
      }
      if ((jsonObj.get("oidc_jwks_url") != null && !jsonObj.get("oidc_jwks_url").isJsonNull()) && !jsonObj.get("oidc_jwks_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oidc_jwks_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oidc_jwks_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchedOAuthSourceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchedOAuthSourceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchedOAuthSourceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchedOAuthSourceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchedOAuthSourceRequest>() {
           @Override
           public void write(JsonWriter out, PatchedOAuthSourceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchedOAuthSourceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PatchedOAuthSourceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PatchedOAuthSourceRequest
   * @throws IOException if the JSON string is invalid with respect to PatchedOAuthSourceRequest
   */
  public static PatchedOAuthSourceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchedOAuthSourceRequest.class);
  }

  /**
   * Convert an instance of PatchedOAuthSourceRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

