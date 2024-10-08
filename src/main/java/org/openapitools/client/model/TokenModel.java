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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.OAuth2Provider;
import org.openapitools.client.model.User;
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
 * Serializer for BaseGrantModel and RefreshToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class TokenModel {
  public static final String SERIALIZED_NAME_PK = "pk";
  @SerializedName(SERIALIZED_NAME_PK)
  private Integer pk;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private OAuth2Provider provider;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public static final String SERIALIZED_NAME_IS_EXPIRED = "is_expired";
  @SerializedName(SERIALIZED_NAME_IS_EXPIRED)
  private Boolean isExpired;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private List<String> scope = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID_TOKEN = "id_token";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN)
  private String idToken;

  public static final String SERIALIZED_NAME_REVOKED = "revoked";
  @SerializedName(SERIALIZED_NAME_REVOKED)
  private Boolean revoked;

  public TokenModel() {
  }

  public TokenModel(
     Integer pk, 
     Boolean isExpired, 
     String idToken
  ) {
    this();
    this.pk = pk;
    this.isExpired = isExpired;
    this.idToken = idToken;
  }

  /**
   * Get pk
   * @return pk
   */
  @javax.annotation.Nonnull
  public Integer getPk() {
    return pk;
  }



  public TokenModel provider(OAuth2Provider provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   */
  @javax.annotation.Nonnull
  public OAuth2Provider getProvider() {
    return provider;
  }

  public void setProvider(OAuth2Provider provider) {
    this.provider = provider;
  }


  public TokenModel user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nonnull
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  /**
   * Check if token is expired yet.
   * @return isExpired
   */
  @javax.annotation.Nonnull
  public Boolean getIsExpired() {
    return isExpired;
  }



  public TokenModel expires(OffsetDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Get expires
   * @return expires
   */
  @javax.annotation.Nullable
  public OffsetDateTime getExpires() {
    return expires;
  }

  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }


  public TokenModel scope(List<String> scope) {
    this.scope = scope;
    return this;
  }

  public TokenModel addScopeItem(String scopeItem) {
    if (this.scope == null) {
      this.scope = new ArrayList<>();
    }
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * Get scope
   * @return scope
   */
  @javax.annotation.Nonnull
  public List<String> getScope() {
    return scope;
  }

  public void setScope(List<String> scope) {
    this.scope = scope;
  }


  /**
   * Get the token&#39;s id_token as JSON String
   * @return idToken
   */
  @javax.annotation.Nonnull
  public String getIdToken() {
    return idToken;
  }



  public TokenModel revoked(Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

  /**
   * Get revoked
   * @return revoked
   */
  @javax.annotation.Nullable
  public Boolean getRevoked() {
    return revoked;
  }

  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenModel tokenModel = (TokenModel) o;
    return Objects.equals(this.pk, tokenModel.pk) &&
        Objects.equals(this.provider, tokenModel.provider) &&
        Objects.equals(this.user, tokenModel.user) &&
        Objects.equals(this.isExpired, tokenModel.isExpired) &&
        Objects.equals(this.expires, tokenModel.expires) &&
        Objects.equals(this.scope, tokenModel.scope) &&
        Objects.equals(this.idToken, tokenModel.idToken) &&
        Objects.equals(this.revoked, tokenModel.revoked);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, provider, user, isExpired, expires, scope, idToken, revoked);
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
    sb.append("class TokenModel {\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
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
    openapiFields.add("provider");
    openapiFields.add("user");
    openapiFields.add("is_expired");
    openapiFields.add("expires");
    openapiFields.add("scope");
    openapiFields.add("id_token");
    openapiFields.add("revoked");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pk");
    openapiRequiredFields.add("provider");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("is_expired");
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("id_token");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TokenModel
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenModel is not found in the empty JSON string", TokenModel.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TokenModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TokenModel` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenModel.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `provider`
      OAuth2Provider.validateJsonElement(jsonObj.get("provider"));
      // validate the required field `user`
      User.validateJsonElement(jsonObj.get("user"));
      // ensure the required json array is present
      if (jsonObj.get("scope") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("scope").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be an array in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if (!jsonObj.get("id_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenModel>() {
           @Override
           public void write(JsonWriter out, TokenModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TokenModel read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TokenModel given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TokenModel
   * @throws IOException if the JSON string is invalid with respect to TokenModel
   */
  public static TokenModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenModel.class);
  }

  /**
   * Convert an instance of TokenModel to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

