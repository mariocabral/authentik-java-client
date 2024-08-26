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
import org.openapitools.client.model.OutgoingSyncDeleteAction;
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
 * GoogleWorkspaceProvider Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class GoogleWorkspaceProvider {
  public static final String SERIALIZED_NAME_PK = "pk";
  @SerializedName(SERIALIZED_NAME_PK)
  private Integer pk;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY_MAPPINGS = "property_mappings";
  @SerializedName(SERIALIZED_NAME_PROPERTY_MAPPINGS)
  private List<UUID> propertyMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTY_MAPPINGS_GROUP = "property_mappings_group";
  @SerializedName(SERIALIZED_NAME_PROPERTY_MAPPINGS_GROUP)
  private List<UUID> propertyMappingsGroup = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_ASSIGNED_BACKCHANNEL_APPLICATION_SLUG = "assigned_backchannel_application_slug";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_BACKCHANNEL_APPLICATION_SLUG)
  private String assignedBackchannelApplicationSlug;

  public static final String SERIALIZED_NAME_ASSIGNED_BACKCHANNEL_APPLICATION_NAME = "assigned_backchannel_application_name";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_BACKCHANNEL_APPLICATION_NAME)
  private String assignedBackchannelApplicationName;

  public static final String SERIALIZED_NAME_VERBOSE_NAME = "verbose_name";
  @SerializedName(SERIALIZED_NAME_VERBOSE_NAME)
  private String verboseName;

  public static final String SERIALIZED_NAME_VERBOSE_NAME_PLURAL = "verbose_name_plural";
  @SerializedName(SERIALIZED_NAME_VERBOSE_NAME_PLURAL)
  private String verboseNamePlural;

  public static final String SERIALIZED_NAME_META_MODEL_NAME = "meta_model_name";
  @SerializedName(SERIALIZED_NAME_META_MODEL_NAME)
  private String metaModelName;

  public static final String SERIALIZED_NAME_DELEGATED_SUBJECT = "delegated_subject";
  @SerializedName(SERIALIZED_NAME_DELEGATED_SUBJECT)
  private String delegatedSubject;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private Object credentials = null;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private String scopes;

  public static final String SERIALIZED_NAME_EXCLUDE_USERS_SERVICE_ACCOUNT = "exclude_users_service_account";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_USERS_SERVICE_ACCOUNT)
  private Boolean excludeUsersServiceAccount;

  public static final String SERIALIZED_NAME_FILTER_GROUP = "filter_group";
  @SerializedName(SERIALIZED_NAME_FILTER_GROUP)
  private UUID filterGroup;

  public static final String SERIALIZED_NAME_USER_DELETE_ACTION = "user_delete_action";
  @SerializedName(SERIALIZED_NAME_USER_DELETE_ACTION)
  private OutgoingSyncDeleteAction userDeleteAction;

  public static final String SERIALIZED_NAME_GROUP_DELETE_ACTION = "group_delete_action";
  @SerializedName(SERIALIZED_NAME_GROUP_DELETE_ACTION)
  private OutgoingSyncDeleteAction groupDeleteAction;

  public static final String SERIALIZED_NAME_DEFAULT_GROUP_EMAIL_DOMAIN = "default_group_email_domain";
  @SerializedName(SERIALIZED_NAME_DEFAULT_GROUP_EMAIL_DOMAIN)
  private String defaultGroupEmailDomain;

  public GoogleWorkspaceProvider() {
  }

  public GoogleWorkspaceProvider(
     Integer pk, 
     String component, 
     String assignedBackchannelApplicationSlug, 
     String assignedBackchannelApplicationName, 
     String verboseName, 
     String verboseNamePlural, 
     String metaModelName
  ) {
    this();
    this.pk = pk;
    this.component = component;
    this.assignedBackchannelApplicationSlug = assignedBackchannelApplicationSlug;
    this.assignedBackchannelApplicationName = assignedBackchannelApplicationName;
    this.verboseName = verboseName;
    this.verboseNamePlural = verboseNamePlural;
    this.metaModelName = metaModelName;
  }

  /**
   * Get pk
   * @return pk
   */
  @javax.annotation.Nonnull
  public Integer getPk() {
    return pk;
  }



  public GoogleWorkspaceProvider name(String name) {
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


  public GoogleWorkspaceProvider propertyMappings(List<UUID> propertyMappings) {
    this.propertyMappings = propertyMappings;
    return this;
  }

  public GoogleWorkspaceProvider addPropertyMappingsItem(UUID propertyMappingsItem) {
    if (this.propertyMappings == null) {
      this.propertyMappings = new ArrayList<>();
    }
    this.propertyMappings.add(propertyMappingsItem);
    return this;
  }

  /**
   * Get propertyMappings
   * @return propertyMappings
   */
  @javax.annotation.Nullable
  public List<UUID> getPropertyMappings() {
    return propertyMappings;
  }

  public void setPropertyMappings(List<UUID> propertyMappings) {
    this.propertyMappings = propertyMappings;
  }


  public GoogleWorkspaceProvider propertyMappingsGroup(List<UUID> propertyMappingsGroup) {
    this.propertyMappingsGroup = propertyMappingsGroup;
    return this;
  }

  public GoogleWorkspaceProvider addPropertyMappingsGroupItem(UUID propertyMappingsGroupItem) {
    if (this.propertyMappingsGroup == null) {
      this.propertyMappingsGroup = new ArrayList<>();
    }
    this.propertyMappingsGroup.add(propertyMappingsGroupItem);
    return this;
  }

  /**
   * Property mappings used for group creation/updating.
   * @return propertyMappingsGroup
   */
  @javax.annotation.Nullable
  public List<UUID> getPropertyMappingsGroup() {
    return propertyMappingsGroup;
  }

  public void setPropertyMappingsGroup(List<UUID> propertyMappingsGroup) {
    this.propertyMappingsGroup = propertyMappingsGroup;
  }


  /**
   * Get object component so that we know how to edit the object
   * @return component
   */
  @javax.annotation.Nonnull
  public String getComponent() {
    return component;
  }



  /**
   * Internal application name, used in URLs.
   * @return assignedBackchannelApplicationSlug
   */
  @javax.annotation.Nonnull
  public String getAssignedBackchannelApplicationSlug() {
    return assignedBackchannelApplicationSlug;
  }



  /**
   * Application&#39;s display Name.
   * @return assignedBackchannelApplicationName
   */
  @javax.annotation.Nonnull
  public String getAssignedBackchannelApplicationName() {
    return assignedBackchannelApplicationName;
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



  public GoogleWorkspaceProvider delegatedSubject(String delegatedSubject) {
    this.delegatedSubject = delegatedSubject;
    return this;
  }

  /**
   * Get delegatedSubject
   * @return delegatedSubject
   */
  @javax.annotation.Nonnull
  public String getDelegatedSubject() {
    return delegatedSubject;
  }

  public void setDelegatedSubject(String delegatedSubject) {
    this.delegatedSubject = delegatedSubject;
  }


  public GoogleWorkspaceProvider credentials(Object credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   */
  @javax.annotation.Nullable
  public Object getCredentials() {
    return credentials;
  }

  public void setCredentials(Object credentials) {
    this.credentials = credentials;
  }


  public GoogleWorkspaceProvider scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Get scopes
   * @return scopes
   */
  @javax.annotation.Nullable
  public String getScopes() {
    return scopes;
  }

  public void setScopes(String scopes) {
    this.scopes = scopes;
  }


  public GoogleWorkspaceProvider excludeUsersServiceAccount(Boolean excludeUsersServiceAccount) {
    this.excludeUsersServiceAccount = excludeUsersServiceAccount;
    return this;
  }

  /**
   * Get excludeUsersServiceAccount
   * @return excludeUsersServiceAccount
   */
  @javax.annotation.Nullable
  public Boolean getExcludeUsersServiceAccount() {
    return excludeUsersServiceAccount;
  }

  public void setExcludeUsersServiceAccount(Boolean excludeUsersServiceAccount) {
    this.excludeUsersServiceAccount = excludeUsersServiceAccount;
  }


  public GoogleWorkspaceProvider filterGroup(UUID filterGroup) {
    this.filterGroup = filterGroup;
    return this;
  }

  /**
   * Get filterGroup
   * @return filterGroup
   */
  @javax.annotation.Nullable
  public UUID getFilterGroup() {
    return filterGroup;
  }

  public void setFilterGroup(UUID filterGroup) {
    this.filterGroup = filterGroup;
  }


  public GoogleWorkspaceProvider userDeleteAction(OutgoingSyncDeleteAction userDeleteAction) {
    this.userDeleteAction = userDeleteAction;
    return this;
  }

  /**
   * Get userDeleteAction
   * @return userDeleteAction
   */
  @javax.annotation.Nullable
  public OutgoingSyncDeleteAction getUserDeleteAction() {
    return userDeleteAction;
  }

  public void setUserDeleteAction(OutgoingSyncDeleteAction userDeleteAction) {
    this.userDeleteAction = userDeleteAction;
  }


  public GoogleWorkspaceProvider groupDeleteAction(OutgoingSyncDeleteAction groupDeleteAction) {
    this.groupDeleteAction = groupDeleteAction;
    return this;
  }

  /**
   * Get groupDeleteAction
   * @return groupDeleteAction
   */
  @javax.annotation.Nullable
  public OutgoingSyncDeleteAction getGroupDeleteAction() {
    return groupDeleteAction;
  }

  public void setGroupDeleteAction(OutgoingSyncDeleteAction groupDeleteAction) {
    this.groupDeleteAction = groupDeleteAction;
  }


  public GoogleWorkspaceProvider defaultGroupEmailDomain(String defaultGroupEmailDomain) {
    this.defaultGroupEmailDomain = defaultGroupEmailDomain;
    return this;
  }

  /**
   * Get defaultGroupEmailDomain
   * @return defaultGroupEmailDomain
   */
  @javax.annotation.Nonnull
  public String getDefaultGroupEmailDomain() {
    return defaultGroupEmailDomain;
  }

  public void setDefaultGroupEmailDomain(String defaultGroupEmailDomain) {
    this.defaultGroupEmailDomain = defaultGroupEmailDomain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleWorkspaceProvider googleWorkspaceProvider = (GoogleWorkspaceProvider) o;
    return Objects.equals(this.pk, googleWorkspaceProvider.pk) &&
        Objects.equals(this.name, googleWorkspaceProvider.name) &&
        Objects.equals(this.propertyMappings, googleWorkspaceProvider.propertyMappings) &&
        Objects.equals(this.propertyMappingsGroup, googleWorkspaceProvider.propertyMappingsGroup) &&
        Objects.equals(this.component, googleWorkspaceProvider.component) &&
        Objects.equals(this.assignedBackchannelApplicationSlug, googleWorkspaceProvider.assignedBackchannelApplicationSlug) &&
        Objects.equals(this.assignedBackchannelApplicationName, googleWorkspaceProvider.assignedBackchannelApplicationName) &&
        Objects.equals(this.verboseName, googleWorkspaceProvider.verboseName) &&
        Objects.equals(this.verboseNamePlural, googleWorkspaceProvider.verboseNamePlural) &&
        Objects.equals(this.metaModelName, googleWorkspaceProvider.metaModelName) &&
        Objects.equals(this.delegatedSubject, googleWorkspaceProvider.delegatedSubject) &&
        Objects.equals(this.credentials, googleWorkspaceProvider.credentials) &&
        Objects.equals(this.scopes, googleWorkspaceProvider.scopes) &&
        Objects.equals(this.excludeUsersServiceAccount, googleWorkspaceProvider.excludeUsersServiceAccount) &&
        Objects.equals(this.filterGroup, googleWorkspaceProvider.filterGroup) &&
        Objects.equals(this.userDeleteAction, googleWorkspaceProvider.userDeleteAction) &&
        Objects.equals(this.groupDeleteAction, googleWorkspaceProvider.groupDeleteAction) &&
        Objects.equals(this.defaultGroupEmailDomain, googleWorkspaceProvider.defaultGroupEmailDomain);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, name, propertyMappings, propertyMappingsGroup, component, assignedBackchannelApplicationSlug, assignedBackchannelApplicationName, verboseName, verboseNamePlural, metaModelName, delegatedSubject, credentials, scopes, excludeUsersServiceAccount, filterGroup, userDeleteAction, groupDeleteAction, defaultGroupEmailDomain);
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
    sb.append("class GoogleWorkspaceProvider {\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyMappings: ").append(toIndentedString(propertyMappings)).append("\n");
    sb.append("    propertyMappingsGroup: ").append(toIndentedString(propertyMappingsGroup)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    assignedBackchannelApplicationSlug: ").append(toIndentedString(assignedBackchannelApplicationSlug)).append("\n");
    sb.append("    assignedBackchannelApplicationName: ").append(toIndentedString(assignedBackchannelApplicationName)).append("\n");
    sb.append("    verboseName: ").append(toIndentedString(verboseName)).append("\n");
    sb.append("    verboseNamePlural: ").append(toIndentedString(verboseNamePlural)).append("\n");
    sb.append("    metaModelName: ").append(toIndentedString(metaModelName)).append("\n");
    sb.append("    delegatedSubject: ").append(toIndentedString(delegatedSubject)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    excludeUsersServiceAccount: ").append(toIndentedString(excludeUsersServiceAccount)).append("\n");
    sb.append("    filterGroup: ").append(toIndentedString(filterGroup)).append("\n");
    sb.append("    userDeleteAction: ").append(toIndentedString(userDeleteAction)).append("\n");
    sb.append("    groupDeleteAction: ").append(toIndentedString(groupDeleteAction)).append("\n");
    sb.append("    defaultGroupEmailDomain: ").append(toIndentedString(defaultGroupEmailDomain)).append("\n");
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
    openapiFields.add("property_mappings");
    openapiFields.add("property_mappings_group");
    openapiFields.add("component");
    openapiFields.add("assigned_backchannel_application_slug");
    openapiFields.add("assigned_backchannel_application_name");
    openapiFields.add("verbose_name");
    openapiFields.add("verbose_name_plural");
    openapiFields.add("meta_model_name");
    openapiFields.add("delegated_subject");
    openapiFields.add("credentials");
    openapiFields.add("scopes");
    openapiFields.add("exclude_users_service_account");
    openapiFields.add("filter_group");
    openapiFields.add("user_delete_action");
    openapiFields.add("group_delete_action");
    openapiFields.add("default_group_email_domain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pk");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("component");
    openapiRequiredFields.add("assigned_backchannel_application_slug");
    openapiRequiredFields.add("assigned_backchannel_application_name");
    openapiRequiredFields.add("verbose_name");
    openapiRequiredFields.add("verbose_name_plural");
    openapiRequiredFields.add("meta_model_name");
    openapiRequiredFields.add("delegated_subject");
    openapiRequiredFields.add("credentials");
    openapiRequiredFields.add("default_group_email_domain");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleWorkspaceProvider
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleWorkspaceProvider.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleWorkspaceProvider is not found in the empty JSON string", GoogleWorkspaceProvider.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleWorkspaceProvider.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleWorkspaceProvider` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GoogleWorkspaceProvider.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("property_mappings") != null && !jsonObj.get("property_mappings").isJsonNull() && !jsonObj.get("property_mappings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_mappings` to be an array in the JSON string but got `%s`", jsonObj.get("property_mappings").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("property_mappings_group") != null && !jsonObj.get("property_mappings_group").isJsonNull() && !jsonObj.get("property_mappings_group").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_mappings_group` to be an array in the JSON string but got `%s`", jsonObj.get("property_mappings_group").toString()));
      }
      if (!jsonObj.get("component").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `component` to be a primitive type in the JSON string but got `%s`", jsonObj.get("component").toString()));
      }
      if (!jsonObj.get("assigned_backchannel_application_slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assigned_backchannel_application_slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assigned_backchannel_application_slug").toString()));
      }
      if (!jsonObj.get("assigned_backchannel_application_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assigned_backchannel_application_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assigned_backchannel_application_name").toString()));
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
      if (!jsonObj.get("delegated_subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delegated_subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delegated_subject").toString()));
      }
      if ((jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonNull()) && !jsonObj.get("scopes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
      if ((jsonObj.get("filter_group") != null && !jsonObj.get("filter_group").isJsonNull()) && !jsonObj.get("filter_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter_group").toString()));
      }
      // validate the optional field `user_delete_action`
      if (jsonObj.get("user_delete_action") != null && !jsonObj.get("user_delete_action").isJsonNull()) {
        OutgoingSyncDeleteAction.validateJsonElement(jsonObj.get("user_delete_action"));
      }
      // validate the optional field `group_delete_action`
      if (jsonObj.get("group_delete_action") != null && !jsonObj.get("group_delete_action").isJsonNull()) {
        OutgoingSyncDeleteAction.validateJsonElement(jsonObj.get("group_delete_action"));
      }
      if (!jsonObj.get("default_group_email_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_group_email_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_group_email_domain").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoogleWorkspaceProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleWorkspaceProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleWorkspaceProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleWorkspaceProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleWorkspaceProvider>() {
           @Override
           public void write(JsonWriter out, GoogleWorkspaceProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleWorkspaceProvider read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleWorkspaceProvider given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleWorkspaceProvider
   * @throws IOException if the JSON string is invalid with respect to GoogleWorkspaceProvider
   */
  public static GoogleWorkspaceProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleWorkspaceProvider.class);
  }

  /**
   * Convert an instance of GoogleWorkspaceProvider to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

