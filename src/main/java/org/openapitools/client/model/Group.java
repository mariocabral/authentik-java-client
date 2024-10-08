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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.client.model.GroupMember;
import org.openapitools.client.model.Role;
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
 * Group Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class Group {
  public static final String SERIALIZED_NAME_PK = "pk";
  @SerializedName(SERIALIZED_NAME_PK)
  private UUID pk;

  public static final String SERIALIZED_NAME_NUM_PK = "num_pk";
  @SerializedName(SERIALIZED_NAME_NUM_PK)
  private Integer numPk;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_IS_SUPERUSER = "is_superuser";
  @SerializedName(SERIALIZED_NAME_IS_SUPERUSER)
  private Boolean isSuperuser;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private UUID parent;

  public static final String SERIALIZED_NAME_PARENT_NAME = "parent_name";
  @SerializedName(SERIALIZED_NAME_PARENT_NAME)
  private String parentName;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<Integer> users = new ArrayList<>();

  public static final String SERIALIZED_NAME_USERS_OBJ = "users_obj";
  @SerializedName(SERIALIZED_NAME_USERS_OBJ)
  private List<GroupMember> usersObj;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = new HashMap<>();

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<UUID> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_ROLES_OBJ = "roles_obj";
  @SerializedName(SERIALIZED_NAME_ROLES_OBJ)
  private List<Role> rolesObj = new ArrayList<>();

  public Group() {
  }

  public Group(
     UUID pk, 
     Integer numPk, 
     String parentName, 
     List<GroupMember> usersObj, 
     List<Role> rolesObj
  ) {
    this();
    this.pk = pk;
    this.numPk = numPk;
    this.parentName = parentName;
    this.usersObj = usersObj;
    this.rolesObj = rolesObj;
  }

  /**
   * Get pk
   * @return pk
   */
  @javax.annotation.Nonnull
  public UUID getPk() {
    return pk;
  }



  /**
   * Get numPk
   * @return numPk
   */
  @javax.annotation.Nonnull
  public Integer getNumPk() {
    return numPk;
  }



  public Group name(String name) {
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


  public Group isSuperuser(Boolean isSuperuser) {
    this.isSuperuser = isSuperuser;
    return this;
  }

  /**
   * Users added to this group will be superusers.
   * @return isSuperuser
   */
  @javax.annotation.Nullable
  public Boolean getIsSuperuser() {
    return isSuperuser;
  }

  public void setIsSuperuser(Boolean isSuperuser) {
    this.isSuperuser = isSuperuser;
  }


  public Group parent(UUID parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @javax.annotation.Nullable
  public UUID getParent() {
    return parent;
  }

  public void setParent(UUID parent) {
    this.parent = parent;
  }


  /**
   * Get parentName
   * @return parentName
   */
  @javax.annotation.Nullable
  public String getParentName() {
    return parentName;
  }



  public Group users(List<Integer> users) {
    this.users = users;
    return this;
  }

  public Group addUsersItem(Integer usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   */
  @javax.annotation.Nullable
  public List<Integer> getUsers() {
    return users;
  }

  public void setUsers(List<Integer> users) {
    this.users = users;
  }


  /**
   * Get usersObj
   * @return usersObj
   */
  @javax.annotation.Nullable
  public List<GroupMember> getUsersObj() {
    return usersObj;
  }



  public Group attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Group putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @javax.annotation.Nullable
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public Group roles(List<UUID> roles) {
    this.roles = roles;
    return this;
  }

  public Group addRolesItem(UUID rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nullable
  public List<UUID> getRoles() {
    return roles;
  }

  public void setRoles(List<UUID> roles) {
    this.roles = roles;
  }


  /**
   * Get rolesObj
   * @return rolesObj
   */
  @javax.annotation.Nonnull
  public List<Role> getRolesObj() {
    return rolesObj;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.pk, group.pk) &&
        Objects.equals(this.numPk, group.numPk) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.isSuperuser, group.isSuperuser) &&
        Objects.equals(this.parent, group.parent) &&
        Objects.equals(this.parentName, group.parentName) &&
        Objects.equals(this.users, group.users) &&
        Objects.equals(this.usersObj, group.usersObj) &&
        Objects.equals(this.attributes, group.attributes) &&
        Objects.equals(this.roles, group.roles) &&
        Objects.equals(this.rolesObj, group.rolesObj);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(pk, numPk, name, isSuperuser, parent, parentName, users, usersObj, attributes, roles, rolesObj);
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
    sb.append("class Group {\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    numPk: ").append(toIndentedString(numPk)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isSuperuser: ").append(toIndentedString(isSuperuser)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    usersObj: ").append(toIndentedString(usersObj)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    rolesObj: ").append(toIndentedString(rolesObj)).append("\n");
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
    openapiFields.add("num_pk");
    openapiFields.add("name");
    openapiFields.add("is_superuser");
    openapiFields.add("parent");
    openapiFields.add("parent_name");
    openapiFields.add("users");
    openapiFields.add("users_obj");
    openapiFields.add("attributes");
    openapiFields.add("roles");
    openapiFields.add("roles_obj");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pk");
    openapiRequiredFields.add("num_pk");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("parent_name");
    openapiRequiredFields.add("users_obj");
    openapiRequiredFields.add("roles_obj");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Group
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Group.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Group is not found in the empty JSON string", Group.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Group.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Group` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Group.openapiRequiredFields) {
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
      if ((jsonObj.get("parent") != null && !jsonObj.get("parent").isJsonNull()) && !jsonObj.get("parent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent").toString()));
      }
      if ((jsonObj.get("parent_name") != null && !jsonObj.get("parent_name").isJsonNull()) && !jsonObj.get("parent_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parent_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parent_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull() && !jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("users_obj").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users_obj` to be an array in the JSON string but got `%s`", jsonObj.get("users_obj").toString()));
      }

      JsonArray jsonArrayusersObj = jsonObj.getAsJsonArray("users_obj");
      // validate the required field `users_obj` (array)
      for (int i = 0; i < jsonArrayusersObj.size(); i++) {
        GroupMember.validateJsonElement(jsonArrayusersObj.get(i));
      };
      // ensure the optional json data is an array if present
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull() && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("roles_obj").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles_obj` to be an array in the JSON string but got `%s`", jsonObj.get("roles_obj").toString()));
      }

      JsonArray jsonArrayrolesObj = jsonObj.getAsJsonArray("roles_obj");
      // validate the required field `roles_obj` (array)
      for (int i = 0; i < jsonArrayrolesObj.size(); i++) {
        Role.validateJsonElement(jsonArrayrolesObj.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Group.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Group' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Group> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Group.class));

       return (TypeAdapter<T>) new TypeAdapter<Group>() {
           @Override
           public void write(JsonWriter out, Group value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Group read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Group given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Group
   * @throws IOException if the JSON string is invalid with respect to Group
   */
  public static Group fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Group.class);
  }

  /**
   * Convert an instance of Group to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

