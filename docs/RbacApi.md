# RbacApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rbacPermissionsAssignedByRolesAssignCreate**](RbacApi.md#rbacPermissionsAssignedByRolesAssignCreate) | **POST** /rbac/permissions/assigned_by_roles/{uuid}/assign/ |  |
| [**rbacPermissionsAssignedByRolesList**](RbacApi.md#rbacPermissionsAssignedByRolesList) | **GET** /rbac/permissions/assigned_by_roles/ |  |
| [**rbacPermissionsAssignedByRolesUnassignPartialUpdate**](RbacApi.md#rbacPermissionsAssignedByRolesUnassignPartialUpdate) | **PATCH** /rbac/permissions/assigned_by_roles/{uuid}/unassign/ |  |
| [**rbacPermissionsAssignedByUsersAssignCreate**](RbacApi.md#rbacPermissionsAssignedByUsersAssignCreate) | **POST** /rbac/permissions/assigned_by_users/{id}/assign/ |  |
| [**rbacPermissionsAssignedByUsersList**](RbacApi.md#rbacPermissionsAssignedByUsersList) | **GET** /rbac/permissions/assigned_by_users/ |  |
| [**rbacPermissionsAssignedByUsersUnassignPartialUpdate**](RbacApi.md#rbacPermissionsAssignedByUsersUnassignPartialUpdate) | **PATCH** /rbac/permissions/assigned_by_users/{id}/unassign/ |  |
| [**rbacPermissionsList**](RbacApi.md#rbacPermissionsList) | **GET** /rbac/permissions/ |  |
| [**rbacPermissionsRetrieve**](RbacApi.md#rbacPermissionsRetrieve) | **GET** /rbac/permissions/{id}/ |  |
| [**rbacPermissionsRolesList**](RbacApi.md#rbacPermissionsRolesList) | **GET** /rbac/permissions/roles/ |  |
| [**rbacPermissionsUsersList**](RbacApi.md#rbacPermissionsUsersList) | **GET** /rbac/permissions/users/ |  |
| [**rbacRolesCreate**](RbacApi.md#rbacRolesCreate) | **POST** /rbac/roles/ |  |
| [**rbacRolesDestroy**](RbacApi.md#rbacRolesDestroy) | **DELETE** /rbac/roles/{uuid}/ |  |
| [**rbacRolesList**](RbacApi.md#rbacRolesList) | **GET** /rbac/roles/ |  |
| [**rbacRolesPartialUpdate**](RbacApi.md#rbacRolesPartialUpdate) | **PATCH** /rbac/roles/{uuid}/ |  |
| [**rbacRolesRetrieve**](RbacApi.md#rbacRolesRetrieve) | **GET** /rbac/roles/{uuid}/ |  |
| [**rbacRolesUpdate**](RbacApi.md#rbacRolesUpdate) | **PUT** /rbac/roles/{uuid}/ |  |
| [**rbacRolesUsedByList**](RbacApi.md#rbacRolesUsedByList) | **GET** /rbac/roles/{uuid}/used_by/ |  |


<a id="rbacPermissionsAssignedByRolesAssignCreate"></a>
# **rbacPermissionsAssignedByRolesAssignCreate**
> rbacPermissionsAssignedByRolesAssignCreate(uuid, permissionAssignRequest)



Assign permission(s) to role. When &#x60;object_pk&#x60; is set, the permissions are only assigned to the specific object, otherwise they are assigned globally.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Role.
    PermissionAssignRequest permissionAssignRequest = new PermissionAssignRequest(); // PermissionAssignRequest | 
    try {
      apiInstance.rbacPermissionsAssignedByRolesAssignCreate(uuid, permissionAssignRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsAssignedByRolesAssignCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Role. | |
| **permissionAssignRequest** | [**PermissionAssignRequest**](PermissionAssignRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully assigned |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacPermissionsAssignedByRolesList"></a>
# **rbacPermissionsAssignedByRolesList**
> PaginatedRoleAssignedObjectPermissionList rbacPermissionsAssignedByRolesList(model, objectPk, ordering, page, pageSize, search)



Get assigned object permissions for a single object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    String model = "authentik_blueprints.blueprintinstance"; // String | 
    String objectPk = "objectPk_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedRoleAssignedObjectPermissionList result = apiInstance.rbacPermissionsAssignedByRolesList(model, objectPk, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsAssignedByRolesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**|  | [enum: authentik_blueprints.blueprintinstance, authentik_brands.brand, authentik_core.application, authentik_core.group, authentik_core.token, authentik_core.user, authentik_crypto.certificatekeypair, authentik_enterprise.license, authentik_events.event, authentik_events.notification, authentik_events.notificationrule, authentik_events.notificationtransport, authentik_events.notificationwebhookmapping, authentik_flows.flow, authentik_flows.flowstagebinding, authentik_outposts.dockerserviceconnection, authentik_outposts.kubernetesserviceconnection, authentik_outposts.outpost, authentik_policies.policybinding, authentik_policies_dummy.dummypolicy, authentik_policies_event_matcher.eventmatcherpolicy, authentik_policies_expiry.passwordexpirypolicy, authentik_policies_expression.expressionpolicy, authentik_policies_password.passwordpolicy, authentik_policies_reputation.reputationpolicy, authentik_providers_google_workspace.googleworkspaceprovider, authentik_providers_google_workspace.googleworkspaceprovidermapping, authentik_providers_ldap.ldapprovider, authentik_providers_microsoft_entra.microsoftentraprovider, authentik_providers_microsoft_entra.microsoftentraprovidermapping, authentik_providers_oauth2.oauth2provider, authentik_providers_oauth2.scopemapping, authentik_providers_proxy.proxyprovider, authentik_providers_rac.endpoint, authentik_providers_rac.racpropertymapping, authentik_providers_rac.racprovider, authentik_providers_radius.radiusprovider, authentik_providers_saml.samlpropertymapping, authentik_providers_saml.samlprovider, authentik_providers_scim.scimmapping, authentik_providers_scim.scimprovider, authentik_rbac.role, authentik_sources_ldap.ldappropertymapping, authentik_sources_ldap.ldapsource, authentik_sources_oauth.oauthsource, authentik_sources_oauth.useroauthsourceconnection, authentik_sources_plex.plexsource, authentik_sources_plex.plexsourceconnection, authentik_sources_saml.samlsource, authentik_sources_saml.usersamlsourceconnection, authentik_sources_scim.scimsource, authentik_stages_authenticator_duo.authenticatorduostage, authentik_stages_authenticator_duo.duodevice, authentik_stages_authenticator_sms.authenticatorsmsstage, authentik_stages_authenticator_sms.smsdevice, authentik_stages_authenticator_static.authenticatorstaticstage, authentik_stages_authenticator_static.staticdevice, authentik_stages_authenticator_totp.authenticatortotpstage, authentik_stages_authenticator_totp.totpdevice, authentik_stages_authenticator_validate.authenticatorvalidatestage, authentik_stages_authenticator_webauthn.authenticatorwebauthnstage, authentik_stages_authenticator_webauthn.webauthndevice, authentik_stages_captcha.captchastage, authentik_stages_consent.consentstage, authentik_stages_consent.userconsent, authentik_stages_deny.denystage, authentik_stages_dummy.dummystage, authentik_stages_email.emailstage, authentik_stages_identification.identificationstage, authentik_stages_invitation.invitation, authentik_stages_invitation.invitationstage, authentik_stages_password.passwordstage, authentik_stages_prompt.prompt, authentik_stages_prompt.promptstage, authentik_stages_source.sourcestage, authentik_stages_user_delete.userdeletestage, authentik_stages_user_login.userloginstage, authentik_stages_user_logout.userlogoutstage, authentik_stages_user_write.userwritestage, authentik_tenants.domain] |
| **objectPk** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedRoleAssignedObjectPermissionList**](PaginatedRoleAssignedObjectPermissionList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacPermissionsAssignedByRolesUnassignPartialUpdate"></a>
# **rbacPermissionsAssignedByRolesUnassignPartialUpdate**
> rbacPermissionsAssignedByRolesUnassignPartialUpdate(uuid, patchedPermissionAssignRequest)



Unassign permission(s) to role. When &#x60;object_pk&#x60; is set, the permissions are only assigned to the specific object, otherwise they are assigned globally.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Role.
    PatchedPermissionAssignRequest patchedPermissionAssignRequest = new PatchedPermissionAssignRequest(); // PatchedPermissionAssignRequest | 
    try {
      apiInstance.rbacPermissionsAssignedByRolesUnassignPartialUpdate(uuid, patchedPermissionAssignRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsAssignedByRolesUnassignPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Role. | |
| **patchedPermissionAssignRequest** | [**PatchedPermissionAssignRequest**](PatchedPermissionAssignRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully unassigned |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacPermissionsAssignedByUsersAssignCreate"></a>
# **rbacPermissionsAssignedByUsersAssignCreate**
> rbacPermissionsAssignedByUsersAssignCreate(id, permissionAssignRequest)



Assign permission(s) to user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    PermissionAssignRequest permissionAssignRequest = new PermissionAssignRequest(); // PermissionAssignRequest | 
    try {
      apiInstance.rbacPermissionsAssignedByUsersAssignCreate(id, permissionAssignRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsAssignedByUsersAssignCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this User. | |
| **permissionAssignRequest** | [**PermissionAssignRequest**](PermissionAssignRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully assigned |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacPermissionsAssignedByUsersList"></a>
# **rbacPermissionsAssignedByUsersList**
> PaginatedUserAssignedObjectPermissionList rbacPermissionsAssignedByUsersList(model, objectPk, ordering, page, pageSize, search)



Get assigned object permissions for a single object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    String model = "authentik_blueprints.blueprintinstance"; // String | 
    String objectPk = "objectPk_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedUserAssignedObjectPermissionList result = apiInstance.rbacPermissionsAssignedByUsersList(model, objectPk, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsAssignedByUsersList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **model** | **String**|  | [enum: authentik_blueprints.blueprintinstance, authentik_brands.brand, authentik_core.application, authentik_core.group, authentik_core.token, authentik_core.user, authentik_crypto.certificatekeypair, authentik_enterprise.license, authentik_events.event, authentik_events.notification, authentik_events.notificationrule, authentik_events.notificationtransport, authentik_events.notificationwebhookmapping, authentik_flows.flow, authentik_flows.flowstagebinding, authentik_outposts.dockerserviceconnection, authentik_outposts.kubernetesserviceconnection, authentik_outposts.outpost, authentik_policies.policybinding, authentik_policies_dummy.dummypolicy, authentik_policies_event_matcher.eventmatcherpolicy, authentik_policies_expiry.passwordexpirypolicy, authentik_policies_expression.expressionpolicy, authentik_policies_password.passwordpolicy, authentik_policies_reputation.reputationpolicy, authentik_providers_google_workspace.googleworkspaceprovider, authentik_providers_google_workspace.googleworkspaceprovidermapping, authentik_providers_ldap.ldapprovider, authentik_providers_microsoft_entra.microsoftentraprovider, authentik_providers_microsoft_entra.microsoftentraprovidermapping, authentik_providers_oauth2.oauth2provider, authentik_providers_oauth2.scopemapping, authentik_providers_proxy.proxyprovider, authentik_providers_rac.endpoint, authentik_providers_rac.racpropertymapping, authentik_providers_rac.racprovider, authentik_providers_radius.radiusprovider, authentik_providers_saml.samlpropertymapping, authentik_providers_saml.samlprovider, authentik_providers_scim.scimmapping, authentik_providers_scim.scimprovider, authentik_rbac.role, authentik_sources_ldap.ldappropertymapping, authentik_sources_ldap.ldapsource, authentik_sources_oauth.oauthsource, authentik_sources_oauth.useroauthsourceconnection, authentik_sources_plex.plexsource, authentik_sources_plex.plexsourceconnection, authentik_sources_saml.samlsource, authentik_sources_saml.usersamlsourceconnection, authentik_sources_scim.scimsource, authentik_stages_authenticator_duo.authenticatorduostage, authentik_stages_authenticator_duo.duodevice, authentik_stages_authenticator_sms.authenticatorsmsstage, authentik_stages_authenticator_sms.smsdevice, authentik_stages_authenticator_static.authenticatorstaticstage, authentik_stages_authenticator_static.staticdevice, authentik_stages_authenticator_totp.authenticatortotpstage, authentik_stages_authenticator_totp.totpdevice, authentik_stages_authenticator_validate.authenticatorvalidatestage, authentik_stages_authenticator_webauthn.authenticatorwebauthnstage, authentik_stages_authenticator_webauthn.webauthndevice, authentik_stages_captcha.captchastage, authentik_stages_consent.consentstage, authentik_stages_consent.userconsent, authentik_stages_deny.denystage, authentik_stages_dummy.dummystage, authentik_stages_email.emailstage, authentik_stages_identification.identificationstage, authentik_stages_invitation.invitation, authentik_stages_invitation.invitationstage, authentik_stages_password.passwordstage, authentik_stages_prompt.prompt, authentik_stages_prompt.promptstage, authentik_stages_source.sourcestage, authentik_stages_user_delete.userdeletestage, authentik_stages_user_login.userloginstage, authentik_stages_user_logout.userlogoutstage, authentik_stages_user_write.userwritestage, authentik_tenants.domain] |
| **objectPk** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedUserAssignedObjectPermissionList**](PaginatedUserAssignedObjectPermissionList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacPermissionsAssignedByUsersUnassignPartialUpdate"></a>
# **rbacPermissionsAssignedByUsersUnassignPartialUpdate**
> rbacPermissionsAssignedByUsersUnassignPartialUpdate(id, patchedPermissionAssignRequest)



Unassign permission(s) to user. When &#x60;object_pk&#x60; is set, the permissions are only assigned to the specific object, otherwise they are assigned globally.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    PatchedPermissionAssignRequest patchedPermissionAssignRequest = new PatchedPermissionAssignRequest(); // PatchedPermissionAssignRequest | 
    try {
      apiInstance.rbacPermissionsAssignedByUsersUnassignPartialUpdate(id, patchedPermissionAssignRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsAssignedByUsersUnassignPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this User. | |
| **patchedPermissionAssignRequest** | [**PatchedPermissionAssignRequest**](PatchedPermissionAssignRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully unassigned |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacPermissionsList"></a>
# **rbacPermissionsList**
> PaginatedPermissionList rbacPermissionsList(codename, contentTypeAppLabel, contentTypeModel, ordering, page, pageSize, role, search, user)



Read-only list of all permissions, filterable by model and app

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    String codename = "codename_example"; // String | 
    String contentTypeAppLabel = "contentTypeAppLabel_example"; // String | 
    String contentTypeModel = "contentTypeModel_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String role = "role_example"; // String | 
    String search = "search_example"; // String | A search term.
    Integer user = 56; // Integer | 
    try {
      PaginatedPermissionList result = apiInstance.rbacPermissionsList(codename, contentTypeAppLabel, contentTypeModel, ordering, page, pageSize, role, search, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **codename** | **String**|  | [optional] |
| **contentTypeAppLabel** | **String**|  | [optional] |
| **contentTypeModel** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **role** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **user** | **Integer**|  | [optional] |

### Return type

[**PaginatedPermissionList**](PaginatedPermissionList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacPermissionsRetrieve"></a>
# **rbacPermissionsRetrieve**
> Permission rbacPermissionsRetrieve(id)



Read-only list of all permissions, filterable by model and app

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this permission.
    try {
      Permission result = apiInstance.rbacPermissionsRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this permission. | |

### Return type

[**Permission**](Permission.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacPermissionsRolesList"></a>
# **rbacPermissionsRolesList**
> PaginatedExtraRoleObjectPermissionList rbacPermissionsRolesList(uuid, ordering, page, pageSize, search)



Get a role&#39;s assigned object permissions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedExtraRoleObjectPermissionList result = apiInstance.rbacPermissionsRolesList(uuid, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsRolesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**|  | |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedExtraRoleObjectPermissionList**](PaginatedExtraRoleObjectPermissionList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacPermissionsUsersList"></a>
# **rbacPermissionsUsersList**
> PaginatedExtraUserObjectPermissionList rbacPermissionsUsersList(userId, ordering, page, pageSize, search)



Get a users&#39;s assigned object permissions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    Integer userId = 56; // Integer | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedExtraUserObjectPermissionList result = apiInstance.rbacPermissionsUsersList(userId, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacPermissionsUsersList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **Integer**|  | |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedExtraUserObjectPermissionList**](PaginatedExtraUserObjectPermissionList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacRolesCreate"></a>
# **rbacRolesCreate**
> Role rbacRolesCreate(roleRequest)



Role viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    RoleRequest roleRequest = new RoleRequest(); // RoleRequest | 
    try {
      Role result = apiInstance.rbacRolesCreate(roleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacRolesCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **roleRequest** | [**RoleRequest**](RoleRequest.md)|  | |

### Return type

[**Role**](Role.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacRolesDestroy"></a>
# **rbacRolesDestroy**
> rbacRolesDestroy(uuid)



Role viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Role.
    try {
      apiInstance.rbacRolesDestroy(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacRolesDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Role. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacRolesList"></a>
# **rbacRolesList**
> PaginatedRoleList rbacRolesList(groupName, ordering, page, pageSize, search)



Role viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    String groupName = "groupName_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedRoleList result = apiInstance.rbacRolesList(groupName, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacRolesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupName** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedRoleList**](PaginatedRoleList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacRolesPartialUpdate"></a>
# **rbacRolesPartialUpdate**
> Role rbacRolesPartialUpdate(uuid, patchedRoleRequest)



Role viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Role.
    PatchedRoleRequest patchedRoleRequest = new PatchedRoleRequest(); // PatchedRoleRequest | 
    try {
      Role result = apiInstance.rbacRolesPartialUpdate(uuid, patchedRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacRolesPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Role. | |
| **patchedRoleRequest** | [**PatchedRoleRequest**](PatchedRoleRequest.md)|  | [optional] |

### Return type

[**Role**](Role.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacRolesRetrieve"></a>
# **rbacRolesRetrieve**
> Role rbacRolesRetrieve(uuid)



Role viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Role.
    try {
      Role result = apiInstance.rbacRolesRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacRolesRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Role. | |

### Return type

[**Role**](Role.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacRolesUpdate"></a>
# **rbacRolesUpdate**
> Role rbacRolesUpdate(uuid, roleRequest)



Role viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Role.
    RoleRequest roleRequest = new RoleRequest(); // RoleRequest | 
    try {
      Role result = apiInstance.rbacRolesUpdate(uuid, roleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacRolesUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Role. | |
| **roleRequest** | [**RoleRequest**](RoleRequest.md)|  | |

### Return type

[**Role**](Role.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="rbacRolesUsedByList"></a>
# **rbacRolesUsedByList**
> List&lt;UsedBy&gt; rbacRolesUsedByList(uuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RbacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RbacApi apiInstance = new RbacApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Role.
    try {
      List<UsedBy> result = apiInstance.rbacRolesUsedByList(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RbacApi#rbacRolesUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Role. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

