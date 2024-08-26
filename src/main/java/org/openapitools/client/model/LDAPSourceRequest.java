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
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.PolicyEngineMode;
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
 * LDAP Source Serializer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-25T23:12:57.050901581-03:00[America/Argentina/Cordoba]", comments = "Generator version: 7.8.0")
public class LDAPSourceRequest {
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

  public static final String SERIALIZED_NAME_SERVER_URI = "server_uri";
  @SerializedName(SERIALIZED_NAME_SERVER_URI)
  private URI serverUri;

  public static final String SERIALIZED_NAME_PEER_CERTIFICATE = "peer_certificate";
  @SerializedName(SERIALIZED_NAME_PEER_CERTIFICATE)
  private UUID peerCertificate;

  public static final String SERIALIZED_NAME_CLIENT_CERTIFICATE = "client_certificate";
  @SerializedName(SERIALIZED_NAME_CLIENT_CERTIFICATE)
  private UUID clientCertificate;

  public static final String SERIALIZED_NAME_BIND_CN = "bind_cn";
  @SerializedName(SERIALIZED_NAME_BIND_CN)
  private String bindCn;

  public static final String SERIALIZED_NAME_BIND_PASSWORD = "bind_password";
  @SerializedName(SERIALIZED_NAME_BIND_PASSWORD)
  private String bindPassword;

  public static final String SERIALIZED_NAME_START_TLS = "start_tls";
  @SerializedName(SERIALIZED_NAME_START_TLS)
  private Boolean startTls;

  public static final String SERIALIZED_NAME_SNI = "sni";
  @SerializedName(SERIALIZED_NAME_SNI)
  private Boolean sni;

  public static final String SERIALIZED_NAME_BASE_DN = "base_dn";
  @SerializedName(SERIALIZED_NAME_BASE_DN)
  private String baseDn;

  public static final String SERIALIZED_NAME_ADDITIONAL_USER_DN = "additional_user_dn";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_USER_DN)
  private String additionalUserDn;

  public static final String SERIALIZED_NAME_ADDITIONAL_GROUP_DN = "additional_group_dn";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_GROUP_DN)
  private String additionalGroupDn;

  public static final String SERIALIZED_NAME_USER_OBJECT_FILTER = "user_object_filter";
  @SerializedName(SERIALIZED_NAME_USER_OBJECT_FILTER)
  private String userObjectFilter;

  public static final String SERIALIZED_NAME_GROUP_OBJECT_FILTER = "group_object_filter";
  @SerializedName(SERIALIZED_NAME_GROUP_OBJECT_FILTER)
  private String groupObjectFilter;

  public static final String SERIALIZED_NAME_GROUP_MEMBERSHIP_FIELD = "group_membership_field";
  @SerializedName(SERIALIZED_NAME_GROUP_MEMBERSHIP_FIELD)
  private String groupMembershipField;

  public static final String SERIALIZED_NAME_OBJECT_UNIQUENESS_FIELD = "object_uniqueness_field";
  @SerializedName(SERIALIZED_NAME_OBJECT_UNIQUENESS_FIELD)
  private String objectUniquenessField;

  public static final String SERIALIZED_NAME_PASSWORD_LOGIN_UPDATE_INTERNAL_PASSWORD = "password_login_update_internal_password";
  @SerializedName(SERIALIZED_NAME_PASSWORD_LOGIN_UPDATE_INTERNAL_PASSWORD)
  private Boolean passwordLoginUpdateInternalPassword;

  public static final String SERIALIZED_NAME_SYNC_USERS = "sync_users";
  @SerializedName(SERIALIZED_NAME_SYNC_USERS)
  private Boolean syncUsers;

  public static final String SERIALIZED_NAME_SYNC_USERS_PASSWORD = "sync_users_password";
  @SerializedName(SERIALIZED_NAME_SYNC_USERS_PASSWORD)
  private Boolean syncUsersPassword;

  public static final String SERIALIZED_NAME_SYNC_GROUPS = "sync_groups";
  @SerializedName(SERIALIZED_NAME_SYNC_GROUPS)
  private Boolean syncGroups;

  public static final String SERIALIZED_NAME_SYNC_PARENT_GROUP = "sync_parent_group";
  @SerializedName(SERIALIZED_NAME_SYNC_PARENT_GROUP)
  private UUID syncParentGroup;

  public static final String SERIALIZED_NAME_PROPERTY_MAPPINGS = "property_mappings";
  @SerializedName(SERIALIZED_NAME_PROPERTY_MAPPINGS)
  private List<UUID> propertyMappings = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTY_MAPPINGS_GROUP = "property_mappings_group";
  @SerializedName(SERIALIZED_NAME_PROPERTY_MAPPINGS_GROUP)
  private List<UUID> propertyMappingsGroup = new ArrayList<>();

  public LDAPSourceRequest() {
  }

  public LDAPSourceRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Source&#39;s display Name.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public LDAPSourceRequest slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Internal source name, used in URLs.
   * @return slug
   */
  @javax.annotation.Nonnull
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  public LDAPSourceRequest enabled(Boolean enabled) {
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


  public LDAPSourceRequest authenticationFlow(UUID authenticationFlow) {
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


  public LDAPSourceRequest enrollmentFlow(UUID enrollmentFlow) {
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


  public LDAPSourceRequest policyEngineMode(PolicyEngineMode policyEngineMode) {
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


  public LDAPSourceRequest userMatchingMode(UserMatchingModeEnum userMatchingMode) {
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


  public LDAPSourceRequest userPathTemplate(String userPathTemplate) {
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


  public LDAPSourceRequest serverUri(URI serverUri) {
    this.serverUri = serverUri;
    return this;
  }

  /**
   * Get serverUri
   * @return serverUri
   */
  @javax.annotation.Nonnull
  public URI getServerUri() {
    return serverUri;
  }

  public void setServerUri(URI serverUri) {
    this.serverUri = serverUri;
  }


  public LDAPSourceRequest peerCertificate(UUID peerCertificate) {
    this.peerCertificate = peerCertificate;
    return this;
  }

  /**
   * Optionally verify the LDAP Server&#39;s Certificate against the CA Chain in this keypair.
   * @return peerCertificate
   */
  @javax.annotation.Nullable
  public UUID getPeerCertificate() {
    return peerCertificate;
  }

  public void setPeerCertificate(UUID peerCertificate) {
    this.peerCertificate = peerCertificate;
  }


  public LDAPSourceRequest clientCertificate(UUID clientCertificate) {
    this.clientCertificate = clientCertificate;
    return this;
  }

  /**
   * Client certificate to authenticate against the LDAP Server&#39;s Certificate.
   * @return clientCertificate
   */
  @javax.annotation.Nullable
  public UUID getClientCertificate() {
    return clientCertificate;
  }

  public void setClientCertificate(UUID clientCertificate) {
    this.clientCertificate = clientCertificate;
  }


  public LDAPSourceRequest bindCn(String bindCn) {
    this.bindCn = bindCn;
    return this;
  }

  /**
   * Get bindCn
   * @return bindCn
   */
  @javax.annotation.Nullable
  public String getBindCn() {
    return bindCn;
  }

  public void setBindCn(String bindCn) {
    this.bindCn = bindCn;
  }


  public LDAPSourceRequest bindPassword(String bindPassword) {
    this.bindPassword = bindPassword;
    return this;
  }

  /**
   * Get bindPassword
   * @return bindPassword
   */
  @javax.annotation.Nullable
  public String getBindPassword() {
    return bindPassword;
  }

  public void setBindPassword(String bindPassword) {
    this.bindPassword = bindPassword;
  }


  public LDAPSourceRequest startTls(Boolean startTls) {
    this.startTls = startTls;
    return this;
  }

  /**
   * Get startTls
   * @return startTls
   */
  @javax.annotation.Nullable
  public Boolean getStartTls() {
    return startTls;
  }

  public void setStartTls(Boolean startTls) {
    this.startTls = startTls;
  }


  public LDAPSourceRequest sni(Boolean sni) {
    this.sni = sni;
    return this;
  }

  /**
   * Get sni
   * @return sni
   */
  @javax.annotation.Nullable
  public Boolean getSni() {
    return sni;
  }

  public void setSni(Boolean sni) {
    this.sni = sni;
  }


  public LDAPSourceRequest baseDn(String baseDn) {
    this.baseDn = baseDn;
    return this;
  }

  /**
   * Get baseDn
   * @return baseDn
   */
  @javax.annotation.Nonnull
  public String getBaseDn() {
    return baseDn;
  }

  public void setBaseDn(String baseDn) {
    this.baseDn = baseDn;
  }


  public LDAPSourceRequest additionalUserDn(String additionalUserDn) {
    this.additionalUserDn = additionalUserDn;
    return this;
  }

  /**
   * Prepended to Base DN for User-queries.
   * @return additionalUserDn
   */
  @javax.annotation.Nullable
  public String getAdditionalUserDn() {
    return additionalUserDn;
  }

  public void setAdditionalUserDn(String additionalUserDn) {
    this.additionalUserDn = additionalUserDn;
  }


  public LDAPSourceRequest additionalGroupDn(String additionalGroupDn) {
    this.additionalGroupDn = additionalGroupDn;
    return this;
  }

  /**
   * Prepended to Base DN for Group-queries.
   * @return additionalGroupDn
   */
  @javax.annotation.Nullable
  public String getAdditionalGroupDn() {
    return additionalGroupDn;
  }

  public void setAdditionalGroupDn(String additionalGroupDn) {
    this.additionalGroupDn = additionalGroupDn;
  }


  public LDAPSourceRequest userObjectFilter(String userObjectFilter) {
    this.userObjectFilter = userObjectFilter;
    return this;
  }

  /**
   * Consider Objects matching this filter to be Users.
   * @return userObjectFilter
   */
  @javax.annotation.Nullable
  public String getUserObjectFilter() {
    return userObjectFilter;
  }

  public void setUserObjectFilter(String userObjectFilter) {
    this.userObjectFilter = userObjectFilter;
  }


  public LDAPSourceRequest groupObjectFilter(String groupObjectFilter) {
    this.groupObjectFilter = groupObjectFilter;
    return this;
  }

  /**
   * Consider Objects matching this filter to be Groups.
   * @return groupObjectFilter
   */
  @javax.annotation.Nullable
  public String getGroupObjectFilter() {
    return groupObjectFilter;
  }

  public void setGroupObjectFilter(String groupObjectFilter) {
    this.groupObjectFilter = groupObjectFilter;
  }


  public LDAPSourceRequest groupMembershipField(String groupMembershipField) {
    this.groupMembershipField = groupMembershipField;
    return this;
  }

  /**
   * Field which contains members of a group.
   * @return groupMembershipField
   */
  @javax.annotation.Nullable
  public String getGroupMembershipField() {
    return groupMembershipField;
  }

  public void setGroupMembershipField(String groupMembershipField) {
    this.groupMembershipField = groupMembershipField;
  }


  public LDAPSourceRequest objectUniquenessField(String objectUniquenessField) {
    this.objectUniquenessField = objectUniquenessField;
    return this;
  }

  /**
   * Field which contains a unique Identifier.
   * @return objectUniquenessField
   */
  @javax.annotation.Nullable
  public String getObjectUniquenessField() {
    return objectUniquenessField;
  }

  public void setObjectUniquenessField(String objectUniquenessField) {
    this.objectUniquenessField = objectUniquenessField;
  }


  public LDAPSourceRequest passwordLoginUpdateInternalPassword(Boolean passwordLoginUpdateInternalPassword) {
    this.passwordLoginUpdateInternalPassword = passwordLoginUpdateInternalPassword;
    return this;
  }

  /**
   * Update internal authentik password when login succeeds with LDAP
   * @return passwordLoginUpdateInternalPassword
   */
  @javax.annotation.Nullable
  public Boolean getPasswordLoginUpdateInternalPassword() {
    return passwordLoginUpdateInternalPassword;
  }

  public void setPasswordLoginUpdateInternalPassword(Boolean passwordLoginUpdateInternalPassword) {
    this.passwordLoginUpdateInternalPassword = passwordLoginUpdateInternalPassword;
  }


  public LDAPSourceRequest syncUsers(Boolean syncUsers) {
    this.syncUsers = syncUsers;
    return this;
  }

  /**
   * Get syncUsers
   * @return syncUsers
   */
  @javax.annotation.Nullable
  public Boolean getSyncUsers() {
    return syncUsers;
  }

  public void setSyncUsers(Boolean syncUsers) {
    this.syncUsers = syncUsers;
  }


  public LDAPSourceRequest syncUsersPassword(Boolean syncUsersPassword) {
    this.syncUsersPassword = syncUsersPassword;
    return this;
  }

  /**
   * When a user changes their password, sync it back to LDAP. This can only be enabled on a single LDAP source.
   * @return syncUsersPassword
   */
  @javax.annotation.Nullable
  public Boolean getSyncUsersPassword() {
    return syncUsersPassword;
  }

  public void setSyncUsersPassword(Boolean syncUsersPassword) {
    this.syncUsersPassword = syncUsersPassword;
  }


  public LDAPSourceRequest syncGroups(Boolean syncGroups) {
    this.syncGroups = syncGroups;
    return this;
  }

  /**
   * Get syncGroups
   * @return syncGroups
   */
  @javax.annotation.Nullable
  public Boolean getSyncGroups() {
    return syncGroups;
  }

  public void setSyncGroups(Boolean syncGroups) {
    this.syncGroups = syncGroups;
  }


  public LDAPSourceRequest syncParentGroup(UUID syncParentGroup) {
    this.syncParentGroup = syncParentGroup;
    return this;
  }

  /**
   * Get syncParentGroup
   * @return syncParentGroup
   */
  @javax.annotation.Nullable
  public UUID getSyncParentGroup() {
    return syncParentGroup;
  }

  public void setSyncParentGroup(UUID syncParentGroup) {
    this.syncParentGroup = syncParentGroup;
  }


  public LDAPSourceRequest propertyMappings(List<UUID> propertyMappings) {
    this.propertyMappings = propertyMappings;
    return this;
  }

  public LDAPSourceRequest addPropertyMappingsItem(UUID propertyMappingsItem) {
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


  public LDAPSourceRequest propertyMappingsGroup(List<UUID> propertyMappingsGroup) {
    this.propertyMappingsGroup = propertyMappingsGroup;
    return this;
  }

  public LDAPSourceRequest addPropertyMappingsGroupItem(UUID propertyMappingsGroupItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LDAPSourceRequest ldAPSourceRequest = (LDAPSourceRequest) o;
    return Objects.equals(this.name, ldAPSourceRequest.name) &&
        Objects.equals(this.slug, ldAPSourceRequest.slug) &&
        Objects.equals(this.enabled, ldAPSourceRequest.enabled) &&
        Objects.equals(this.authenticationFlow, ldAPSourceRequest.authenticationFlow) &&
        Objects.equals(this.enrollmentFlow, ldAPSourceRequest.enrollmentFlow) &&
        Objects.equals(this.policyEngineMode, ldAPSourceRequest.policyEngineMode) &&
        Objects.equals(this.userMatchingMode, ldAPSourceRequest.userMatchingMode) &&
        Objects.equals(this.userPathTemplate, ldAPSourceRequest.userPathTemplate) &&
        Objects.equals(this.serverUri, ldAPSourceRequest.serverUri) &&
        Objects.equals(this.peerCertificate, ldAPSourceRequest.peerCertificate) &&
        Objects.equals(this.clientCertificate, ldAPSourceRequest.clientCertificate) &&
        Objects.equals(this.bindCn, ldAPSourceRequest.bindCn) &&
        Objects.equals(this.bindPassword, ldAPSourceRequest.bindPassword) &&
        Objects.equals(this.startTls, ldAPSourceRequest.startTls) &&
        Objects.equals(this.sni, ldAPSourceRequest.sni) &&
        Objects.equals(this.baseDn, ldAPSourceRequest.baseDn) &&
        Objects.equals(this.additionalUserDn, ldAPSourceRequest.additionalUserDn) &&
        Objects.equals(this.additionalGroupDn, ldAPSourceRequest.additionalGroupDn) &&
        Objects.equals(this.userObjectFilter, ldAPSourceRequest.userObjectFilter) &&
        Objects.equals(this.groupObjectFilter, ldAPSourceRequest.groupObjectFilter) &&
        Objects.equals(this.groupMembershipField, ldAPSourceRequest.groupMembershipField) &&
        Objects.equals(this.objectUniquenessField, ldAPSourceRequest.objectUniquenessField) &&
        Objects.equals(this.passwordLoginUpdateInternalPassword, ldAPSourceRequest.passwordLoginUpdateInternalPassword) &&
        Objects.equals(this.syncUsers, ldAPSourceRequest.syncUsers) &&
        Objects.equals(this.syncUsersPassword, ldAPSourceRequest.syncUsersPassword) &&
        Objects.equals(this.syncGroups, ldAPSourceRequest.syncGroups) &&
        Objects.equals(this.syncParentGroup, ldAPSourceRequest.syncParentGroup) &&
        Objects.equals(this.propertyMappings, ldAPSourceRequest.propertyMappings) &&
        Objects.equals(this.propertyMappingsGroup, ldAPSourceRequest.propertyMappingsGroup);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, slug, enabled, authenticationFlow, enrollmentFlow, policyEngineMode, userMatchingMode, userPathTemplate, serverUri, peerCertificate, clientCertificate, bindCn, bindPassword, startTls, sni, baseDn, additionalUserDn, additionalGroupDn, userObjectFilter, groupObjectFilter, groupMembershipField, objectUniquenessField, passwordLoginUpdateInternalPassword, syncUsers, syncUsersPassword, syncGroups, syncParentGroup, propertyMappings, propertyMappingsGroup);
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
    sb.append("class LDAPSourceRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    authenticationFlow: ").append(toIndentedString(authenticationFlow)).append("\n");
    sb.append("    enrollmentFlow: ").append(toIndentedString(enrollmentFlow)).append("\n");
    sb.append("    policyEngineMode: ").append(toIndentedString(policyEngineMode)).append("\n");
    sb.append("    userMatchingMode: ").append(toIndentedString(userMatchingMode)).append("\n");
    sb.append("    userPathTemplate: ").append(toIndentedString(userPathTemplate)).append("\n");
    sb.append("    serverUri: ").append(toIndentedString(serverUri)).append("\n");
    sb.append("    peerCertificate: ").append(toIndentedString(peerCertificate)).append("\n");
    sb.append("    clientCertificate: ").append(toIndentedString(clientCertificate)).append("\n");
    sb.append("    bindCn: ").append(toIndentedString(bindCn)).append("\n");
    sb.append("    bindPassword: ").append(toIndentedString(bindPassword)).append("\n");
    sb.append("    startTls: ").append(toIndentedString(startTls)).append("\n");
    sb.append("    sni: ").append(toIndentedString(sni)).append("\n");
    sb.append("    baseDn: ").append(toIndentedString(baseDn)).append("\n");
    sb.append("    additionalUserDn: ").append(toIndentedString(additionalUserDn)).append("\n");
    sb.append("    additionalGroupDn: ").append(toIndentedString(additionalGroupDn)).append("\n");
    sb.append("    userObjectFilter: ").append(toIndentedString(userObjectFilter)).append("\n");
    sb.append("    groupObjectFilter: ").append(toIndentedString(groupObjectFilter)).append("\n");
    sb.append("    groupMembershipField: ").append(toIndentedString(groupMembershipField)).append("\n");
    sb.append("    objectUniquenessField: ").append(toIndentedString(objectUniquenessField)).append("\n");
    sb.append("    passwordLoginUpdateInternalPassword: ").append(toIndentedString(passwordLoginUpdateInternalPassword)).append("\n");
    sb.append("    syncUsers: ").append(toIndentedString(syncUsers)).append("\n");
    sb.append("    syncUsersPassword: ").append(toIndentedString(syncUsersPassword)).append("\n");
    sb.append("    syncGroups: ").append(toIndentedString(syncGroups)).append("\n");
    sb.append("    syncParentGroup: ").append(toIndentedString(syncParentGroup)).append("\n");
    sb.append("    propertyMappings: ").append(toIndentedString(propertyMappings)).append("\n");
    sb.append("    propertyMappingsGroup: ").append(toIndentedString(propertyMappingsGroup)).append("\n");
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
    openapiFields.add("server_uri");
    openapiFields.add("peer_certificate");
    openapiFields.add("client_certificate");
    openapiFields.add("bind_cn");
    openapiFields.add("bind_password");
    openapiFields.add("start_tls");
    openapiFields.add("sni");
    openapiFields.add("base_dn");
    openapiFields.add("additional_user_dn");
    openapiFields.add("additional_group_dn");
    openapiFields.add("user_object_filter");
    openapiFields.add("group_object_filter");
    openapiFields.add("group_membership_field");
    openapiFields.add("object_uniqueness_field");
    openapiFields.add("password_login_update_internal_password");
    openapiFields.add("sync_users");
    openapiFields.add("sync_users_password");
    openapiFields.add("sync_groups");
    openapiFields.add("sync_parent_group");
    openapiFields.add("property_mappings");
    openapiFields.add("property_mappings_group");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("slug");
    openapiRequiredFields.add("server_uri");
    openapiRequiredFields.add("base_dn");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LDAPSourceRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LDAPSourceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LDAPSourceRequest is not found in the empty JSON string", LDAPSourceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LDAPSourceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LDAPSourceRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LDAPSourceRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("slug").isJsonPrimitive()) {
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
      if (!jsonObj.get("server_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `server_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("server_uri").toString()));
      }
      if ((jsonObj.get("peer_certificate") != null && !jsonObj.get("peer_certificate").isJsonNull()) && !jsonObj.get("peer_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `peer_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("peer_certificate").toString()));
      }
      if ((jsonObj.get("client_certificate") != null && !jsonObj.get("client_certificate").isJsonNull()) && !jsonObj.get("client_certificate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_certificate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_certificate").toString()));
      }
      if ((jsonObj.get("bind_cn") != null && !jsonObj.get("bind_cn").isJsonNull()) && !jsonObj.get("bind_cn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_cn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_cn").toString()));
      }
      if ((jsonObj.get("bind_password") != null && !jsonObj.get("bind_password").isJsonNull()) && !jsonObj.get("bind_password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bind_password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bind_password").toString()));
      }
      if (!jsonObj.get("base_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_dn").toString()));
      }
      if ((jsonObj.get("additional_user_dn") != null && !jsonObj.get("additional_user_dn").isJsonNull()) && !jsonObj.get("additional_user_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_user_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_user_dn").toString()));
      }
      if ((jsonObj.get("additional_group_dn") != null && !jsonObj.get("additional_group_dn").isJsonNull()) && !jsonObj.get("additional_group_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_group_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_group_dn").toString()));
      }
      if ((jsonObj.get("user_object_filter") != null && !jsonObj.get("user_object_filter").isJsonNull()) && !jsonObj.get("user_object_filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_object_filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_object_filter").toString()));
      }
      if ((jsonObj.get("group_object_filter") != null && !jsonObj.get("group_object_filter").isJsonNull()) && !jsonObj.get("group_object_filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_object_filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_object_filter").toString()));
      }
      if ((jsonObj.get("group_membership_field") != null && !jsonObj.get("group_membership_field").isJsonNull()) && !jsonObj.get("group_membership_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_membership_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_membership_field").toString()));
      }
      if ((jsonObj.get("object_uniqueness_field") != null && !jsonObj.get("object_uniqueness_field").isJsonNull()) && !jsonObj.get("object_uniqueness_field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object_uniqueness_field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object_uniqueness_field").toString()));
      }
      if ((jsonObj.get("sync_parent_group") != null && !jsonObj.get("sync_parent_group").isJsonNull()) && !jsonObj.get("sync_parent_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sync_parent_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sync_parent_group").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("property_mappings") != null && !jsonObj.get("property_mappings").isJsonNull() && !jsonObj.get("property_mappings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_mappings` to be an array in the JSON string but got `%s`", jsonObj.get("property_mappings").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("property_mappings_group") != null && !jsonObj.get("property_mappings_group").isJsonNull() && !jsonObj.get("property_mappings_group").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `property_mappings_group` to be an array in the JSON string but got `%s`", jsonObj.get("property_mappings_group").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LDAPSourceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LDAPSourceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LDAPSourceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LDAPSourceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LDAPSourceRequest>() {
           @Override
           public void write(JsonWriter out, LDAPSourceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LDAPSourceRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LDAPSourceRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LDAPSourceRequest
   * @throws IOException if the JSON string is invalid with respect to LDAPSourceRequest
   */
  public static LDAPSourceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LDAPSourceRequest.class);
  }

  /**
   * Convert an instance of LDAPSourceRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

