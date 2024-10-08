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
import org.openapitools.client.model.GroupMember;

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
 * MicrosoftEntraProviderUser Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class MicrosoftEntraProviderUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_MICROSOFT_ID = "microsoft_id";
  @SerializedName(SERIALIZED_NAME_MICROSOFT_ID)
  private String microsoftId;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Integer user;

  public static final String SERIALIZED_NAME_USER_OBJ = "user_obj";
  @SerializedName(SERIALIZED_NAME_USER_OBJ)
  private GroupMember userObj;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private Integer provider;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes = null;

  public MicrosoftEntraProviderUser() {
  }

  public MicrosoftEntraProviderUser(
     UUID id, 
     GroupMember userObj, 
     Object attributes
  ) {
    this();
    this.id = id;
    this.userObj = userObj;
    this.attributes = attributes;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public UUID getId() {
    return id;
  }



  public MicrosoftEntraProviderUser microsoftId(String microsoftId) {
    this.microsoftId = microsoftId;
    return this;
  }

  /**
   * Get microsoftId
   * @return microsoftId
   */
  @javax.annotation.Nonnull
  public String getMicrosoftId() {
    return microsoftId;
  }

  public void setMicrosoftId(String microsoftId) {
    this.microsoftId = microsoftId;
  }


  public MicrosoftEntraProviderUser user(Integer user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @javax.annotation.Nonnull
  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }


  /**
   * Get userObj
   * @return userObj
   */
  @javax.annotation.Nonnull
  public GroupMember getUserObj() {
    return userObj;
  }



  public MicrosoftEntraProviderUser provider(Integer provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
   */
  @javax.annotation.Nonnull
  public Integer getProvider() {
    return provider;
  }

  public void setProvider(Integer provider) {
    this.provider = provider;
  }


  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public Object getAttributes() {
    return attributes;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicrosoftEntraProviderUser microsoftEntraProviderUser = (MicrosoftEntraProviderUser) o;
    return Objects.equals(this.id, microsoftEntraProviderUser.id) &&
        Objects.equals(this.microsoftId, microsoftEntraProviderUser.microsoftId) &&
        Objects.equals(this.user, microsoftEntraProviderUser.user) &&
        Objects.equals(this.userObj, microsoftEntraProviderUser.userObj) &&
        Objects.equals(this.provider, microsoftEntraProviderUser.provider) &&
        Objects.equals(this.attributes, microsoftEntraProviderUser.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, microsoftId, user, userObj, provider, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicrosoftEntraProviderUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    microsoftId: ").append(toIndentedString(microsoftId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userObj: ").append(toIndentedString(userObj)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("microsoft_id");
    openapiFields.add("user");
    openapiFields.add("user_obj");
    openapiFields.add("provider");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("microsoft_id");
    openapiRequiredFields.add("user");
    openapiRequiredFields.add("user_obj");
    openapiRequiredFields.add("provider");
    openapiRequiredFields.add("attributes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MicrosoftEntraProviderUser
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MicrosoftEntraProviderUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MicrosoftEntraProviderUser is not found in the empty JSON string", MicrosoftEntraProviderUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MicrosoftEntraProviderUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MicrosoftEntraProviderUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MicrosoftEntraProviderUser.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("microsoft_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `microsoft_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("microsoft_id").toString()));
      }
      // validate the required field `user_obj`
      GroupMember.validateJsonElement(jsonObj.get("user_obj"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MicrosoftEntraProviderUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MicrosoftEntraProviderUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MicrosoftEntraProviderUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MicrosoftEntraProviderUser.class));

       return (TypeAdapter<T>) new TypeAdapter<MicrosoftEntraProviderUser>() {
           @Override
           public void write(JsonWriter out, MicrosoftEntraProviderUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MicrosoftEntraProviderUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MicrosoftEntraProviderUser given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MicrosoftEntraProviderUser
   * @throws IOException if the JSON string is invalid with respect to MicrosoftEntraProviderUser
   */
  public static MicrosoftEntraProviderUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MicrosoftEntraProviderUser.class);
  }

  /**
   * Convert an instance of MicrosoftEntraProviderUser to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

