# ProvidersApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**providersAllDestroy**](ProvidersApi.md#providersAllDestroy) | **DELETE** /providers/all/{id}/ |  |
| [**providersAllList**](ProvidersApi.md#providersAllList) | **GET** /providers/all/ |  |
| [**providersAllRetrieve**](ProvidersApi.md#providersAllRetrieve) | **GET** /providers/all/{id}/ |  |
| [**providersAllTypesList**](ProvidersApi.md#providersAllTypesList) | **GET** /providers/all/types/ |  |
| [**providersAllUsedByList**](ProvidersApi.md#providersAllUsedByList) | **GET** /providers/all/{id}/used_by/ |  |
| [**providersGoogleWorkspaceCreate**](ProvidersApi.md#providersGoogleWorkspaceCreate) | **POST** /providers/google_workspace/ |  |
| [**providersGoogleWorkspaceDestroy**](ProvidersApi.md#providersGoogleWorkspaceDestroy) | **DELETE** /providers/google_workspace/{id}/ |  |
| [**providersGoogleWorkspaceGroupsCreate**](ProvidersApi.md#providersGoogleWorkspaceGroupsCreate) | **POST** /providers/google_workspace_groups/ |  |
| [**providersGoogleWorkspaceGroupsDestroy**](ProvidersApi.md#providersGoogleWorkspaceGroupsDestroy) | **DELETE** /providers/google_workspace_groups/{id}/ |  |
| [**providersGoogleWorkspaceGroupsList**](ProvidersApi.md#providersGoogleWorkspaceGroupsList) | **GET** /providers/google_workspace_groups/ |  |
| [**providersGoogleWorkspaceGroupsRetrieve**](ProvidersApi.md#providersGoogleWorkspaceGroupsRetrieve) | **GET** /providers/google_workspace_groups/{id}/ |  |
| [**providersGoogleWorkspaceGroupsUsedByList**](ProvidersApi.md#providersGoogleWorkspaceGroupsUsedByList) | **GET** /providers/google_workspace_groups/{id}/used_by/ |  |
| [**providersGoogleWorkspaceList**](ProvidersApi.md#providersGoogleWorkspaceList) | **GET** /providers/google_workspace/ |  |
| [**providersGoogleWorkspacePartialUpdate**](ProvidersApi.md#providersGoogleWorkspacePartialUpdate) | **PATCH** /providers/google_workspace/{id}/ |  |
| [**providersGoogleWorkspaceRetrieve**](ProvidersApi.md#providersGoogleWorkspaceRetrieve) | **GET** /providers/google_workspace/{id}/ |  |
| [**providersGoogleWorkspaceSyncStatusRetrieve**](ProvidersApi.md#providersGoogleWorkspaceSyncStatusRetrieve) | **GET** /providers/google_workspace/{id}/sync/status/ |  |
| [**providersGoogleWorkspaceUpdate**](ProvidersApi.md#providersGoogleWorkspaceUpdate) | **PUT** /providers/google_workspace/{id}/ |  |
| [**providersGoogleWorkspaceUsedByList**](ProvidersApi.md#providersGoogleWorkspaceUsedByList) | **GET** /providers/google_workspace/{id}/used_by/ |  |
| [**providersGoogleWorkspaceUsersCreate**](ProvidersApi.md#providersGoogleWorkspaceUsersCreate) | **POST** /providers/google_workspace_users/ |  |
| [**providersGoogleWorkspaceUsersDestroy**](ProvidersApi.md#providersGoogleWorkspaceUsersDestroy) | **DELETE** /providers/google_workspace_users/{id}/ |  |
| [**providersGoogleWorkspaceUsersList**](ProvidersApi.md#providersGoogleWorkspaceUsersList) | **GET** /providers/google_workspace_users/ |  |
| [**providersGoogleWorkspaceUsersRetrieve**](ProvidersApi.md#providersGoogleWorkspaceUsersRetrieve) | **GET** /providers/google_workspace_users/{id}/ |  |
| [**providersGoogleWorkspaceUsersUsedByList**](ProvidersApi.md#providersGoogleWorkspaceUsersUsedByList) | **GET** /providers/google_workspace_users/{id}/used_by/ |  |
| [**providersLdapCreate**](ProvidersApi.md#providersLdapCreate) | **POST** /providers/ldap/ |  |
| [**providersLdapDestroy**](ProvidersApi.md#providersLdapDestroy) | **DELETE** /providers/ldap/{id}/ |  |
| [**providersLdapList**](ProvidersApi.md#providersLdapList) | **GET** /providers/ldap/ |  |
| [**providersLdapPartialUpdate**](ProvidersApi.md#providersLdapPartialUpdate) | **PATCH** /providers/ldap/{id}/ |  |
| [**providersLdapRetrieve**](ProvidersApi.md#providersLdapRetrieve) | **GET** /providers/ldap/{id}/ |  |
| [**providersLdapUpdate**](ProvidersApi.md#providersLdapUpdate) | **PUT** /providers/ldap/{id}/ |  |
| [**providersLdapUsedByList**](ProvidersApi.md#providersLdapUsedByList) | **GET** /providers/ldap/{id}/used_by/ |  |
| [**providersMicrosoftEntraCreate**](ProvidersApi.md#providersMicrosoftEntraCreate) | **POST** /providers/microsoft_entra/ |  |
| [**providersMicrosoftEntraDestroy**](ProvidersApi.md#providersMicrosoftEntraDestroy) | **DELETE** /providers/microsoft_entra/{id}/ |  |
| [**providersMicrosoftEntraGroupsCreate**](ProvidersApi.md#providersMicrosoftEntraGroupsCreate) | **POST** /providers/microsoft_entra_groups/ |  |
| [**providersMicrosoftEntraGroupsDestroy**](ProvidersApi.md#providersMicrosoftEntraGroupsDestroy) | **DELETE** /providers/microsoft_entra_groups/{id}/ |  |
| [**providersMicrosoftEntraGroupsList**](ProvidersApi.md#providersMicrosoftEntraGroupsList) | **GET** /providers/microsoft_entra_groups/ |  |
| [**providersMicrosoftEntraGroupsRetrieve**](ProvidersApi.md#providersMicrosoftEntraGroupsRetrieve) | **GET** /providers/microsoft_entra_groups/{id}/ |  |
| [**providersMicrosoftEntraGroupsUsedByList**](ProvidersApi.md#providersMicrosoftEntraGroupsUsedByList) | **GET** /providers/microsoft_entra_groups/{id}/used_by/ |  |
| [**providersMicrosoftEntraList**](ProvidersApi.md#providersMicrosoftEntraList) | **GET** /providers/microsoft_entra/ |  |
| [**providersMicrosoftEntraPartialUpdate**](ProvidersApi.md#providersMicrosoftEntraPartialUpdate) | **PATCH** /providers/microsoft_entra/{id}/ |  |
| [**providersMicrosoftEntraRetrieve**](ProvidersApi.md#providersMicrosoftEntraRetrieve) | **GET** /providers/microsoft_entra/{id}/ |  |
| [**providersMicrosoftEntraSyncStatusRetrieve**](ProvidersApi.md#providersMicrosoftEntraSyncStatusRetrieve) | **GET** /providers/microsoft_entra/{id}/sync/status/ |  |
| [**providersMicrosoftEntraUpdate**](ProvidersApi.md#providersMicrosoftEntraUpdate) | **PUT** /providers/microsoft_entra/{id}/ |  |
| [**providersMicrosoftEntraUsedByList**](ProvidersApi.md#providersMicrosoftEntraUsedByList) | **GET** /providers/microsoft_entra/{id}/used_by/ |  |
| [**providersMicrosoftEntraUsersCreate**](ProvidersApi.md#providersMicrosoftEntraUsersCreate) | **POST** /providers/microsoft_entra_users/ |  |
| [**providersMicrosoftEntraUsersDestroy**](ProvidersApi.md#providersMicrosoftEntraUsersDestroy) | **DELETE** /providers/microsoft_entra_users/{id}/ |  |
| [**providersMicrosoftEntraUsersList**](ProvidersApi.md#providersMicrosoftEntraUsersList) | **GET** /providers/microsoft_entra_users/ |  |
| [**providersMicrosoftEntraUsersRetrieve**](ProvidersApi.md#providersMicrosoftEntraUsersRetrieve) | **GET** /providers/microsoft_entra_users/{id}/ |  |
| [**providersMicrosoftEntraUsersUsedByList**](ProvidersApi.md#providersMicrosoftEntraUsersUsedByList) | **GET** /providers/microsoft_entra_users/{id}/used_by/ |  |
| [**providersOauth2Create**](ProvidersApi.md#providersOauth2Create) | **POST** /providers/oauth2/ |  |
| [**providersOauth2Destroy**](ProvidersApi.md#providersOauth2Destroy) | **DELETE** /providers/oauth2/{id}/ |  |
| [**providersOauth2List**](ProvidersApi.md#providersOauth2List) | **GET** /providers/oauth2/ |  |
| [**providersOauth2PartialUpdate**](ProvidersApi.md#providersOauth2PartialUpdate) | **PATCH** /providers/oauth2/{id}/ |  |
| [**providersOauth2PreviewUserRetrieve**](ProvidersApi.md#providersOauth2PreviewUserRetrieve) | **GET** /providers/oauth2/{id}/preview_user/ |  |
| [**providersOauth2Retrieve**](ProvidersApi.md#providersOauth2Retrieve) | **GET** /providers/oauth2/{id}/ |  |
| [**providersOauth2SetupUrlsRetrieve**](ProvidersApi.md#providersOauth2SetupUrlsRetrieve) | **GET** /providers/oauth2/{id}/setup_urls/ |  |
| [**providersOauth2Update**](ProvidersApi.md#providersOauth2Update) | **PUT** /providers/oauth2/{id}/ |  |
| [**providersOauth2UsedByList**](ProvidersApi.md#providersOauth2UsedByList) | **GET** /providers/oauth2/{id}/used_by/ |  |
| [**providersProxyCreate**](ProvidersApi.md#providersProxyCreate) | **POST** /providers/proxy/ |  |
| [**providersProxyDestroy**](ProvidersApi.md#providersProxyDestroy) | **DELETE** /providers/proxy/{id}/ |  |
| [**providersProxyList**](ProvidersApi.md#providersProxyList) | **GET** /providers/proxy/ |  |
| [**providersProxyPartialUpdate**](ProvidersApi.md#providersProxyPartialUpdate) | **PATCH** /providers/proxy/{id}/ |  |
| [**providersProxyRetrieve**](ProvidersApi.md#providersProxyRetrieve) | **GET** /providers/proxy/{id}/ |  |
| [**providersProxyUpdate**](ProvidersApi.md#providersProxyUpdate) | **PUT** /providers/proxy/{id}/ |  |
| [**providersProxyUsedByList**](ProvidersApi.md#providersProxyUsedByList) | **GET** /providers/proxy/{id}/used_by/ |  |
| [**providersRacCreate**](ProvidersApi.md#providersRacCreate) | **POST** /providers/rac/ |  |
| [**providersRacDestroy**](ProvidersApi.md#providersRacDestroy) | **DELETE** /providers/rac/{id}/ |  |
| [**providersRacList**](ProvidersApi.md#providersRacList) | **GET** /providers/rac/ |  |
| [**providersRacPartialUpdate**](ProvidersApi.md#providersRacPartialUpdate) | **PATCH** /providers/rac/{id}/ |  |
| [**providersRacRetrieve**](ProvidersApi.md#providersRacRetrieve) | **GET** /providers/rac/{id}/ |  |
| [**providersRacUpdate**](ProvidersApi.md#providersRacUpdate) | **PUT** /providers/rac/{id}/ |  |
| [**providersRacUsedByList**](ProvidersApi.md#providersRacUsedByList) | **GET** /providers/rac/{id}/used_by/ |  |
| [**providersRadiusCreate**](ProvidersApi.md#providersRadiusCreate) | **POST** /providers/radius/ |  |
| [**providersRadiusDestroy**](ProvidersApi.md#providersRadiusDestroy) | **DELETE** /providers/radius/{id}/ |  |
| [**providersRadiusList**](ProvidersApi.md#providersRadiusList) | **GET** /providers/radius/ |  |
| [**providersRadiusPartialUpdate**](ProvidersApi.md#providersRadiusPartialUpdate) | **PATCH** /providers/radius/{id}/ |  |
| [**providersRadiusRetrieve**](ProvidersApi.md#providersRadiusRetrieve) | **GET** /providers/radius/{id}/ |  |
| [**providersRadiusUpdate**](ProvidersApi.md#providersRadiusUpdate) | **PUT** /providers/radius/{id}/ |  |
| [**providersRadiusUsedByList**](ProvidersApi.md#providersRadiusUsedByList) | **GET** /providers/radius/{id}/used_by/ |  |
| [**providersSamlCreate**](ProvidersApi.md#providersSamlCreate) | **POST** /providers/saml/ |  |
| [**providersSamlDestroy**](ProvidersApi.md#providersSamlDestroy) | **DELETE** /providers/saml/{id}/ |  |
| [**providersSamlImportMetadataCreate**](ProvidersApi.md#providersSamlImportMetadataCreate) | **POST** /providers/saml/import_metadata/ |  |
| [**providersSamlList**](ProvidersApi.md#providersSamlList) | **GET** /providers/saml/ |  |
| [**providersSamlMetadataRetrieve**](ProvidersApi.md#providersSamlMetadataRetrieve) | **GET** /providers/saml/{id}/metadata/ |  |
| [**providersSamlPartialUpdate**](ProvidersApi.md#providersSamlPartialUpdate) | **PATCH** /providers/saml/{id}/ |  |
| [**providersSamlPreviewUserRetrieve**](ProvidersApi.md#providersSamlPreviewUserRetrieve) | **GET** /providers/saml/{id}/preview_user/ |  |
| [**providersSamlRetrieve**](ProvidersApi.md#providersSamlRetrieve) | **GET** /providers/saml/{id}/ |  |
| [**providersSamlUpdate**](ProvidersApi.md#providersSamlUpdate) | **PUT** /providers/saml/{id}/ |  |
| [**providersSamlUsedByList**](ProvidersApi.md#providersSamlUsedByList) | **GET** /providers/saml/{id}/used_by/ |  |
| [**providersScimCreate**](ProvidersApi.md#providersScimCreate) | **POST** /providers/scim/ |  |
| [**providersScimDestroy**](ProvidersApi.md#providersScimDestroy) | **DELETE** /providers/scim/{id}/ |  |
| [**providersScimGroupsCreate**](ProvidersApi.md#providersScimGroupsCreate) | **POST** /providers/scim_groups/ |  |
| [**providersScimGroupsDestroy**](ProvidersApi.md#providersScimGroupsDestroy) | **DELETE** /providers/scim_groups/{id}/ |  |
| [**providersScimGroupsList**](ProvidersApi.md#providersScimGroupsList) | **GET** /providers/scim_groups/ |  |
| [**providersScimGroupsRetrieve**](ProvidersApi.md#providersScimGroupsRetrieve) | **GET** /providers/scim_groups/{id}/ |  |
| [**providersScimGroupsUsedByList**](ProvidersApi.md#providersScimGroupsUsedByList) | **GET** /providers/scim_groups/{id}/used_by/ |  |
| [**providersScimList**](ProvidersApi.md#providersScimList) | **GET** /providers/scim/ |  |
| [**providersScimPartialUpdate**](ProvidersApi.md#providersScimPartialUpdate) | **PATCH** /providers/scim/{id}/ |  |
| [**providersScimRetrieve**](ProvidersApi.md#providersScimRetrieve) | **GET** /providers/scim/{id}/ |  |
| [**providersScimSyncStatusRetrieve**](ProvidersApi.md#providersScimSyncStatusRetrieve) | **GET** /providers/scim/{id}/sync/status/ |  |
| [**providersScimUpdate**](ProvidersApi.md#providersScimUpdate) | **PUT** /providers/scim/{id}/ |  |
| [**providersScimUsedByList**](ProvidersApi.md#providersScimUsedByList) | **GET** /providers/scim/{id}/used_by/ |  |
| [**providersScimUsersCreate**](ProvidersApi.md#providersScimUsersCreate) | **POST** /providers/scim_users/ |  |
| [**providersScimUsersDestroy**](ProvidersApi.md#providersScimUsersDestroy) | **DELETE** /providers/scim_users/{id}/ |  |
| [**providersScimUsersList**](ProvidersApi.md#providersScimUsersList) | **GET** /providers/scim_users/ |  |
| [**providersScimUsersRetrieve**](ProvidersApi.md#providersScimUsersRetrieve) | **GET** /providers/scim_users/{id}/ |  |
| [**providersScimUsersUsedByList**](ProvidersApi.md#providersScimUsersUsedByList) | **GET** /providers/scim_users/{id}/used_by/ |  |


<a id="providersAllDestroy"></a>
# **providersAllDestroy**
> providersAllDestroy(id)



Provider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this provider.
    try {
      apiInstance.providersAllDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersAllDestroy");
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
| **id** | **Integer**| A unique integer value identifying this provider. | |

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

<a id="providersAllList"></a>
# **providersAllList**
> PaginatedProviderList providersAllList(applicationIsnull, backchannel, ordering, page, pageSize, search)



Provider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Boolean applicationIsnull = true; // Boolean | 
    Boolean backchannel = true; // Boolean | When not set all providers are returned. When set to true, only backchannel providers are returned. When set to false, backchannel providers are excluded
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedProviderList result = apiInstance.providersAllList(applicationIsnull, backchannel, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersAllList");
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
| **applicationIsnull** | **Boolean**|  | [optional] |
| **backchannel** | **Boolean**| When not set all providers are returned. When set to true, only backchannel providers are returned. When set to false, backchannel providers are excluded | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedProviderList**](PaginatedProviderList.md)

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

<a id="providersAllRetrieve"></a>
# **providersAllRetrieve**
> Provider providersAllRetrieve(id)



Provider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this provider.
    try {
      Provider result = apiInstance.providersAllRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersAllRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this provider. | |

### Return type

[**Provider**](Provider.md)

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

<a id="providersAllTypesList"></a>
# **providersAllTypesList**
> List&lt;TypeCreate&gt; providersAllTypesList()



Get all creatable types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    try {
      List<TypeCreate> result = apiInstance.providersAllTypesList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersAllTypesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TypeCreate&gt;**](TypeCreate.md)

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

<a id="providersAllUsedByList"></a>
# **providersAllUsedByList**
> List&lt;UsedBy&gt; providersAllUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this provider.
    try {
      List<UsedBy> result = apiInstance.providersAllUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersAllUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this provider. | |

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

<a id="providersGoogleWorkspaceCreate"></a>
# **providersGoogleWorkspaceCreate**
> GoogleWorkspaceProvider providersGoogleWorkspaceCreate(googleWorkspaceProviderRequest)



GoogleWorkspaceProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    GoogleWorkspaceProviderRequest googleWorkspaceProviderRequest = new GoogleWorkspaceProviderRequest(); // GoogleWorkspaceProviderRequest | 
    try {
      GoogleWorkspaceProvider result = apiInstance.providersGoogleWorkspaceCreate(googleWorkspaceProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceCreate");
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
| **googleWorkspaceProviderRequest** | [**GoogleWorkspaceProviderRequest**](GoogleWorkspaceProviderRequest.md)|  | |

### Return type

[**GoogleWorkspaceProvider**](GoogleWorkspaceProvider.md)

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

<a id="providersGoogleWorkspaceDestroy"></a>
# **providersGoogleWorkspaceDestroy**
> providersGoogleWorkspaceDestroy(id)



GoogleWorkspaceProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Google Workspace Provider.
    try {
      apiInstance.providersGoogleWorkspaceDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceDestroy");
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
| **id** | **Integer**| A unique integer value identifying this Google Workspace Provider. | |

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

<a id="providersGoogleWorkspaceGroupsCreate"></a>
# **providersGoogleWorkspaceGroupsCreate**
> GoogleWorkspaceProviderGroup providersGoogleWorkspaceGroupsCreate(googleWorkspaceProviderGroupRequest)



GoogleWorkspaceProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    GoogleWorkspaceProviderGroupRequest googleWorkspaceProviderGroupRequest = new GoogleWorkspaceProviderGroupRequest(); // GoogleWorkspaceProviderGroupRequest | 
    try {
      GoogleWorkspaceProviderGroup result = apiInstance.providersGoogleWorkspaceGroupsCreate(googleWorkspaceProviderGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceGroupsCreate");
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
| **googleWorkspaceProviderGroupRequest** | [**GoogleWorkspaceProviderGroupRequest**](GoogleWorkspaceProviderGroupRequest.md)|  | |

### Return type

[**GoogleWorkspaceProviderGroup**](GoogleWorkspaceProviderGroup.md)

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

<a id="providersGoogleWorkspaceGroupsDestroy"></a>
# **providersGoogleWorkspaceGroupsDestroy**
> providersGoogleWorkspaceGroupsDestroy(id)



GoogleWorkspaceProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider Group.
    try {
      apiInstance.providersGoogleWorkspaceGroupsDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceGroupsDestroy");
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
| **id** | **UUID**| A UUID string identifying this Google Workspace Provider Group. | |

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

<a id="providersGoogleWorkspaceGroupsList"></a>
# **providersGoogleWorkspaceGroupsList**
> PaginatedGoogleWorkspaceProviderGroupList providersGoogleWorkspaceGroupsList(groupGroupUuid, groupName, ordering, page, pageSize, providerId, search)



GoogleWorkspaceProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID groupGroupUuid = UUID.randomUUID(); // UUID | 
    String groupName = "groupName_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer providerId = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedGoogleWorkspaceProviderGroupList result = apiInstance.providersGoogleWorkspaceGroupsList(groupGroupUuid, groupName, ordering, page, pageSize, providerId, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceGroupsList");
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
| **groupGroupUuid** | **UUID**|  | [optional] |
| **groupName** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **providerId** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedGoogleWorkspaceProviderGroupList**](PaginatedGoogleWorkspaceProviderGroupList.md)

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

<a id="providersGoogleWorkspaceGroupsRetrieve"></a>
# **providersGoogleWorkspaceGroupsRetrieve**
> GoogleWorkspaceProviderGroup providersGoogleWorkspaceGroupsRetrieve(id)



GoogleWorkspaceProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider Group.
    try {
      GoogleWorkspaceProviderGroup result = apiInstance.providersGoogleWorkspaceGroupsRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceGroupsRetrieve");
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
| **id** | **UUID**| A UUID string identifying this Google Workspace Provider Group. | |

### Return type

[**GoogleWorkspaceProviderGroup**](GoogleWorkspaceProviderGroup.md)

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

<a id="providersGoogleWorkspaceGroupsUsedByList"></a>
# **providersGoogleWorkspaceGroupsUsedByList**
> List&lt;UsedBy&gt; providersGoogleWorkspaceGroupsUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider Group.
    try {
      List<UsedBy> result = apiInstance.providersGoogleWorkspaceGroupsUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceGroupsUsedByList");
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
| **id** | **UUID**| A UUID string identifying this Google Workspace Provider Group. | |

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

<a id="providersGoogleWorkspaceList"></a>
# **providersGoogleWorkspaceList**
> PaginatedGoogleWorkspaceProviderList providersGoogleWorkspaceList(delegatedSubject, excludeUsersServiceAccount, filterGroup, name, ordering, page, pageSize, search)



GoogleWorkspaceProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    String delegatedSubject = "delegatedSubject_example"; // String | 
    Boolean excludeUsersServiceAccount = true; // Boolean | 
    UUID filterGroup = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedGoogleWorkspaceProviderList result = apiInstance.providersGoogleWorkspaceList(delegatedSubject, excludeUsersServiceAccount, filterGroup, name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceList");
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
| **delegatedSubject** | **String**|  | [optional] |
| **excludeUsersServiceAccount** | **Boolean**|  | [optional] |
| **filterGroup** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedGoogleWorkspaceProviderList**](PaginatedGoogleWorkspaceProviderList.md)

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

<a id="providersGoogleWorkspacePartialUpdate"></a>
# **providersGoogleWorkspacePartialUpdate**
> GoogleWorkspaceProvider providersGoogleWorkspacePartialUpdate(id, patchedGoogleWorkspaceProviderRequest)



GoogleWorkspaceProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Google Workspace Provider.
    PatchedGoogleWorkspaceProviderRequest patchedGoogleWorkspaceProviderRequest = new PatchedGoogleWorkspaceProviderRequest(); // PatchedGoogleWorkspaceProviderRequest | 
    try {
      GoogleWorkspaceProvider result = apiInstance.providersGoogleWorkspacePartialUpdate(id, patchedGoogleWorkspaceProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspacePartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this Google Workspace Provider. | |
| **patchedGoogleWorkspaceProviderRequest** | [**PatchedGoogleWorkspaceProviderRequest**](PatchedGoogleWorkspaceProviderRequest.md)|  | [optional] |

### Return type

[**GoogleWorkspaceProvider**](GoogleWorkspaceProvider.md)

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

<a id="providersGoogleWorkspaceRetrieve"></a>
# **providersGoogleWorkspaceRetrieve**
> GoogleWorkspaceProvider providersGoogleWorkspaceRetrieve(id)



GoogleWorkspaceProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Google Workspace Provider.
    try {
      GoogleWorkspaceProvider result = apiInstance.providersGoogleWorkspaceRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this Google Workspace Provider. | |

### Return type

[**GoogleWorkspaceProvider**](GoogleWorkspaceProvider.md)

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

<a id="providersGoogleWorkspaceSyncStatusRetrieve"></a>
# **providersGoogleWorkspaceSyncStatusRetrieve**
> SyncStatus providersGoogleWorkspaceSyncStatusRetrieve(id)



Get provider&#39;s sync status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Google Workspace Provider.
    try {
      SyncStatus result = apiInstance.providersGoogleWorkspaceSyncStatusRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceSyncStatusRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this Google Workspace Provider. | |

### Return type

[**SyncStatus**](SyncStatus.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **404** | Task not found |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="providersGoogleWorkspaceUpdate"></a>
# **providersGoogleWorkspaceUpdate**
> GoogleWorkspaceProvider providersGoogleWorkspaceUpdate(id, googleWorkspaceProviderRequest)



GoogleWorkspaceProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Google Workspace Provider.
    GoogleWorkspaceProviderRequest googleWorkspaceProviderRequest = new GoogleWorkspaceProviderRequest(); // GoogleWorkspaceProviderRequest | 
    try {
      GoogleWorkspaceProvider result = apiInstance.providersGoogleWorkspaceUpdate(id, googleWorkspaceProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceUpdate");
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
| **id** | **Integer**| A unique integer value identifying this Google Workspace Provider. | |
| **googleWorkspaceProviderRequest** | [**GoogleWorkspaceProviderRequest**](GoogleWorkspaceProviderRequest.md)|  | |

### Return type

[**GoogleWorkspaceProvider**](GoogleWorkspaceProvider.md)

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

<a id="providersGoogleWorkspaceUsedByList"></a>
# **providersGoogleWorkspaceUsedByList**
> List&lt;UsedBy&gt; providersGoogleWorkspaceUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Google Workspace Provider.
    try {
      List<UsedBy> result = apiInstance.providersGoogleWorkspaceUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this Google Workspace Provider. | |

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

<a id="providersGoogleWorkspaceUsersCreate"></a>
# **providersGoogleWorkspaceUsersCreate**
> GoogleWorkspaceProviderUser providersGoogleWorkspaceUsersCreate(googleWorkspaceProviderUserRequest)



GoogleWorkspaceProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    GoogleWorkspaceProviderUserRequest googleWorkspaceProviderUserRequest = new GoogleWorkspaceProviderUserRequest(); // GoogleWorkspaceProviderUserRequest | 
    try {
      GoogleWorkspaceProviderUser result = apiInstance.providersGoogleWorkspaceUsersCreate(googleWorkspaceProviderUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceUsersCreate");
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
| **googleWorkspaceProviderUserRequest** | [**GoogleWorkspaceProviderUserRequest**](GoogleWorkspaceProviderUserRequest.md)|  | |

### Return type

[**GoogleWorkspaceProviderUser**](GoogleWorkspaceProviderUser.md)

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

<a id="providersGoogleWorkspaceUsersDestroy"></a>
# **providersGoogleWorkspaceUsersDestroy**
> providersGoogleWorkspaceUsersDestroy(id)



GoogleWorkspaceProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider User.
    try {
      apiInstance.providersGoogleWorkspaceUsersDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceUsersDestroy");
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
| **id** | **UUID**| A UUID string identifying this Google Workspace Provider User. | |

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

<a id="providersGoogleWorkspaceUsersList"></a>
# **providersGoogleWorkspaceUsersList**
> PaginatedGoogleWorkspaceProviderUserList providersGoogleWorkspaceUsersList(ordering, page, pageSize, providerId, search, userId, userUsername)



GoogleWorkspaceProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer providerId = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    Integer userId = 56; // Integer | 
    String userUsername = "userUsername_example"; // String | 
    try {
      PaginatedGoogleWorkspaceProviderUserList result = apiInstance.providersGoogleWorkspaceUsersList(ordering, page, pageSize, providerId, search, userId, userUsername);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceUsersList");
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
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **providerId** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **userId** | **Integer**|  | [optional] |
| **userUsername** | **String**|  | [optional] |

### Return type

[**PaginatedGoogleWorkspaceProviderUserList**](PaginatedGoogleWorkspaceProviderUserList.md)

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

<a id="providersGoogleWorkspaceUsersRetrieve"></a>
# **providersGoogleWorkspaceUsersRetrieve**
> GoogleWorkspaceProviderUser providersGoogleWorkspaceUsersRetrieve(id)



GoogleWorkspaceProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider User.
    try {
      GoogleWorkspaceProviderUser result = apiInstance.providersGoogleWorkspaceUsersRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceUsersRetrieve");
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
| **id** | **UUID**| A UUID string identifying this Google Workspace Provider User. | |

### Return type

[**GoogleWorkspaceProviderUser**](GoogleWorkspaceProviderUser.md)

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

<a id="providersGoogleWorkspaceUsersUsedByList"></a>
# **providersGoogleWorkspaceUsersUsedByList**
> List&lt;UsedBy&gt; providersGoogleWorkspaceUsersUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider User.
    try {
      List<UsedBy> result = apiInstance.providersGoogleWorkspaceUsersUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersGoogleWorkspaceUsersUsedByList");
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
| **id** | **UUID**| A UUID string identifying this Google Workspace Provider User. | |

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

<a id="providersLdapCreate"></a>
# **providersLdapCreate**
> LDAPProvider providersLdapCreate(ldAPProviderRequest)



LDAPProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    LDAPProviderRequest ldAPProviderRequest = new LDAPProviderRequest(); // LDAPProviderRequest | 
    try {
      LDAPProvider result = apiInstance.providersLdapCreate(ldAPProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersLdapCreate");
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
| **ldAPProviderRequest** | [**LDAPProviderRequest**](LDAPProviderRequest.md)|  | |

### Return type

[**LDAPProvider**](LDAPProvider.md)

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

<a id="providersLdapDestroy"></a>
# **providersLdapDestroy**
> providersLdapDestroy(id)



LDAPProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this LDAP Provider.
    try {
      apiInstance.providersLdapDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersLdapDestroy");
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
| **id** | **Integer**| A unique integer value identifying this LDAP Provider. | |

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

<a id="providersLdapList"></a>
# **providersLdapList**
> PaginatedLDAPProviderList providersLdapList(applicationIsnull, authorizationFlowSlugIexact, baseDnIexact, certificateKpUuidIexact, certificateNameIexact, gidStartNumberIexact, nameIexact, ordering, page, pageSize, search, searchGroupGroupUuidIexact, searchGroupNameIexact, tlsServerNameIexact, uidStartNumberIexact)



LDAPProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Boolean applicationIsnull = true; // Boolean | 
    String authorizationFlowSlugIexact = "authorizationFlowSlugIexact_example"; // String | 
    String baseDnIexact = "baseDnIexact_example"; // String | 
    UUID certificateKpUuidIexact = UUID.randomUUID(); // UUID | 
    String certificateNameIexact = "certificateNameIexact_example"; // String | 
    Integer gidStartNumberIexact = 56; // Integer | 
    String nameIexact = "nameIexact_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID searchGroupGroupUuidIexact = UUID.randomUUID(); // UUID | 
    String searchGroupNameIexact = "searchGroupNameIexact_example"; // String | 
    String tlsServerNameIexact = "tlsServerNameIexact_example"; // String | 
    Integer uidStartNumberIexact = 56; // Integer | 
    try {
      PaginatedLDAPProviderList result = apiInstance.providersLdapList(applicationIsnull, authorizationFlowSlugIexact, baseDnIexact, certificateKpUuidIexact, certificateNameIexact, gidStartNumberIexact, nameIexact, ordering, page, pageSize, search, searchGroupGroupUuidIexact, searchGroupNameIexact, tlsServerNameIexact, uidStartNumberIexact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersLdapList");
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
| **applicationIsnull** | **Boolean**|  | [optional] |
| **authorizationFlowSlugIexact** | **String**|  | [optional] |
| **baseDnIexact** | **String**|  | [optional] |
| **certificateKpUuidIexact** | **UUID**|  | [optional] |
| **certificateNameIexact** | **String**|  | [optional] |
| **gidStartNumberIexact** | **Integer**|  | [optional] |
| **nameIexact** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **searchGroupGroupUuidIexact** | **UUID**|  | [optional] |
| **searchGroupNameIexact** | **String**|  | [optional] |
| **tlsServerNameIexact** | **String**|  | [optional] |
| **uidStartNumberIexact** | **Integer**|  | [optional] |

### Return type

[**PaginatedLDAPProviderList**](PaginatedLDAPProviderList.md)

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

<a id="providersLdapPartialUpdate"></a>
# **providersLdapPartialUpdate**
> LDAPProvider providersLdapPartialUpdate(id, patchedLDAPProviderRequest)



LDAPProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this LDAP Provider.
    PatchedLDAPProviderRequest patchedLDAPProviderRequest = new PatchedLDAPProviderRequest(); // PatchedLDAPProviderRequest | 
    try {
      LDAPProvider result = apiInstance.providersLdapPartialUpdate(id, patchedLDAPProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersLdapPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this LDAP Provider. | |
| **patchedLDAPProviderRequest** | [**PatchedLDAPProviderRequest**](PatchedLDAPProviderRequest.md)|  | [optional] |

### Return type

[**LDAPProvider**](LDAPProvider.md)

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

<a id="providersLdapRetrieve"></a>
# **providersLdapRetrieve**
> LDAPProvider providersLdapRetrieve(id)



LDAPProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this LDAP Provider.
    try {
      LDAPProvider result = apiInstance.providersLdapRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersLdapRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this LDAP Provider. | |

### Return type

[**LDAPProvider**](LDAPProvider.md)

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

<a id="providersLdapUpdate"></a>
# **providersLdapUpdate**
> LDAPProvider providersLdapUpdate(id, ldAPProviderRequest)



LDAPProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this LDAP Provider.
    LDAPProviderRequest ldAPProviderRequest = new LDAPProviderRequest(); // LDAPProviderRequest | 
    try {
      LDAPProvider result = apiInstance.providersLdapUpdate(id, ldAPProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersLdapUpdate");
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
| **id** | **Integer**| A unique integer value identifying this LDAP Provider. | |
| **ldAPProviderRequest** | [**LDAPProviderRequest**](LDAPProviderRequest.md)|  | |

### Return type

[**LDAPProvider**](LDAPProvider.md)

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

<a id="providersLdapUsedByList"></a>
# **providersLdapUsedByList**
> List&lt;UsedBy&gt; providersLdapUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this LDAP Provider.
    try {
      List<UsedBy> result = apiInstance.providersLdapUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersLdapUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this LDAP Provider. | |

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

<a id="providersMicrosoftEntraCreate"></a>
# **providersMicrosoftEntraCreate**
> MicrosoftEntraProvider providersMicrosoftEntraCreate(microsoftEntraProviderRequest)



MicrosoftEntraProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    MicrosoftEntraProviderRequest microsoftEntraProviderRequest = new MicrosoftEntraProviderRequest(); // MicrosoftEntraProviderRequest | 
    try {
      MicrosoftEntraProvider result = apiInstance.providersMicrosoftEntraCreate(microsoftEntraProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraCreate");
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
| **microsoftEntraProviderRequest** | [**MicrosoftEntraProviderRequest**](MicrosoftEntraProviderRequest.md)|  | |

### Return type

[**MicrosoftEntraProvider**](MicrosoftEntraProvider.md)

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

<a id="providersMicrosoftEntraDestroy"></a>
# **providersMicrosoftEntraDestroy**
> providersMicrosoftEntraDestroy(id)



MicrosoftEntraProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Microsoft Entra Provider.
    try {
      apiInstance.providersMicrosoftEntraDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraDestroy");
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
| **id** | **Integer**| A unique integer value identifying this Microsoft Entra Provider. | |

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

<a id="providersMicrosoftEntraGroupsCreate"></a>
# **providersMicrosoftEntraGroupsCreate**
> MicrosoftEntraProviderGroup providersMicrosoftEntraGroupsCreate(microsoftEntraProviderGroupRequest)



MicrosoftEntraProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    MicrosoftEntraProviderGroupRequest microsoftEntraProviderGroupRequest = new MicrosoftEntraProviderGroupRequest(); // MicrosoftEntraProviderGroupRequest | 
    try {
      MicrosoftEntraProviderGroup result = apiInstance.providersMicrosoftEntraGroupsCreate(microsoftEntraProviderGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraGroupsCreate");
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
| **microsoftEntraProviderGroupRequest** | [**MicrosoftEntraProviderGroupRequest**](MicrosoftEntraProviderGroupRequest.md)|  | |

### Return type

[**MicrosoftEntraProviderGroup**](MicrosoftEntraProviderGroup.md)

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

<a id="providersMicrosoftEntraGroupsDestroy"></a>
# **providersMicrosoftEntraGroupsDestroy**
> providersMicrosoftEntraGroupsDestroy(id)



MicrosoftEntraProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider Group.
    try {
      apiInstance.providersMicrosoftEntraGroupsDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraGroupsDestroy");
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
| **id** | **UUID**| A UUID string identifying this Microsoft Entra Provider Group. | |

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

<a id="providersMicrosoftEntraGroupsList"></a>
# **providersMicrosoftEntraGroupsList**
> PaginatedMicrosoftEntraProviderGroupList providersMicrosoftEntraGroupsList(groupGroupUuid, groupName, ordering, page, pageSize, providerId, search)



MicrosoftEntraProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID groupGroupUuid = UUID.randomUUID(); // UUID | 
    String groupName = "groupName_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer providerId = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedMicrosoftEntraProviderGroupList result = apiInstance.providersMicrosoftEntraGroupsList(groupGroupUuid, groupName, ordering, page, pageSize, providerId, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraGroupsList");
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
| **groupGroupUuid** | **UUID**|  | [optional] |
| **groupName** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **providerId** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedMicrosoftEntraProviderGroupList**](PaginatedMicrosoftEntraProviderGroupList.md)

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

<a id="providersMicrosoftEntraGroupsRetrieve"></a>
# **providersMicrosoftEntraGroupsRetrieve**
> MicrosoftEntraProviderGroup providersMicrosoftEntraGroupsRetrieve(id)



MicrosoftEntraProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider Group.
    try {
      MicrosoftEntraProviderGroup result = apiInstance.providersMicrosoftEntraGroupsRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraGroupsRetrieve");
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
| **id** | **UUID**| A UUID string identifying this Microsoft Entra Provider Group. | |

### Return type

[**MicrosoftEntraProviderGroup**](MicrosoftEntraProviderGroup.md)

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

<a id="providersMicrosoftEntraGroupsUsedByList"></a>
# **providersMicrosoftEntraGroupsUsedByList**
> List&lt;UsedBy&gt; providersMicrosoftEntraGroupsUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider Group.
    try {
      List<UsedBy> result = apiInstance.providersMicrosoftEntraGroupsUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraGroupsUsedByList");
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
| **id** | **UUID**| A UUID string identifying this Microsoft Entra Provider Group. | |

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

<a id="providersMicrosoftEntraList"></a>
# **providersMicrosoftEntraList**
> PaginatedMicrosoftEntraProviderList providersMicrosoftEntraList(excludeUsersServiceAccount, filterGroup, name, ordering, page, pageSize, search)



MicrosoftEntraProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Boolean excludeUsersServiceAccount = true; // Boolean | 
    UUID filterGroup = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedMicrosoftEntraProviderList result = apiInstance.providersMicrosoftEntraList(excludeUsersServiceAccount, filterGroup, name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraList");
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
| **excludeUsersServiceAccount** | **Boolean**|  | [optional] |
| **filterGroup** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedMicrosoftEntraProviderList**](PaginatedMicrosoftEntraProviderList.md)

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

<a id="providersMicrosoftEntraPartialUpdate"></a>
# **providersMicrosoftEntraPartialUpdate**
> MicrosoftEntraProvider providersMicrosoftEntraPartialUpdate(id, patchedMicrosoftEntraProviderRequest)



MicrosoftEntraProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Microsoft Entra Provider.
    PatchedMicrosoftEntraProviderRequest patchedMicrosoftEntraProviderRequest = new PatchedMicrosoftEntraProviderRequest(); // PatchedMicrosoftEntraProviderRequest | 
    try {
      MicrosoftEntraProvider result = apiInstance.providersMicrosoftEntraPartialUpdate(id, patchedMicrosoftEntraProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this Microsoft Entra Provider. | |
| **patchedMicrosoftEntraProviderRequest** | [**PatchedMicrosoftEntraProviderRequest**](PatchedMicrosoftEntraProviderRequest.md)|  | [optional] |

### Return type

[**MicrosoftEntraProvider**](MicrosoftEntraProvider.md)

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

<a id="providersMicrosoftEntraRetrieve"></a>
# **providersMicrosoftEntraRetrieve**
> MicrosoftEntraProvider providersMicrosoftEntraRetrieve(id)



MicrosoftEntraProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Microsoft Entra Provider.
    try {
      MicrosoftEntraProvider result = apiInstance.providersMicrosoftEntraRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this Microsoft Entra Provider. | |

### Return type

[**MicrosoftEntraProvider**](MicrosoftEntraProvider.md)

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

<a id="providersMicrosoftEntraSyncStatusRetrieve"></a>
# **providersMicrosoftEntraSyncStatusRetrieve**
> SyncStatus providersMicrosoftEntraSyncStatusRetrieve(id)



Get provider&#39;s sync status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Microsoft Entra Provider.
    try {
      SyncStatus result = apiInstance.providersMicrosoftEntraSyncStatusRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraSyncStatusRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this Microsoft Entra Provider. | |

### Return type

[**SyncStatus**](SyncStatus.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **404** | Task not found |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="providersMicrosoftEntraUpdate"></a>
# **providersMicrosoftEntraUpdate**
> MicrosoftEntraProvider providersMicrosoftEntraUpdate(id, microsoftEntraProviderRequest)



MicrosoftEntraProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Microsoft Entra Provider.
    MicrosoftEntraProviderRequest microsoftEntraProviderRequest = new MicrosoftEntraProviderRequest(); // MicrosoftEntraProviderRequest | 
    try {
      MicrosoftEntraProvider result = apiInstance.providersMicrosoftEntraUpdate(id, microsoftEntraProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraUpdate");
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
| **id** | **Integer**| A unique integer value identifying this Microsoft Entra Provider. | |
| **microsoftEntraProviderRequest** | [**MicrosoftEntraProviderRequest**](MicrosoftEntraProviderRequest.md)|  | |

### Return type

[**MicrosoftEntraProvider**](MicrosoftEntraProvider.md)

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

<a id="providersMicrosoftEntraUsedByList"></a>
# **providersMicrosoftEntraUsedByList**
> List&lt;UsedBy&gt; providersMicrosoftEntraUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Microsoft Entra Provider.
    try {
      List<UsedBy> result = apiInstance.providersMicrosoftEntraUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this Microsoft Entra Provider. | |

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

<a id="providersMicrosoftEntraUsersCreate"></a>
# **providersMicrosoftEntraUsersCreate**
> MicrosoftEntraProviderUser providersMicrosoftEntraUsersCreate(microsoftEntraProviderUserRequest)



MicrosoftEntraProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    MicrosoftEntraProviderUserRequest microsoftEntraProviderUserRequest = new MicrosoftEntraProviderUserRequest(); // MicrosoftEntraProviderUserRequest | 
    try {
      MicrosoftEntraProviderUser result = apiInstance.providersMicrosoftEntraUsersCreate(microsoftEntraProviderUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraUsersCreate");
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
| **microsoftEntraProviderUserRequest** | [**MicrosoftEntraProviderUserRequest**](MicrosoftEntraProviderUserRequest.md)|  | |

### Return type

[**MicrosoftEntraProviderUser**](MicrosoftEntraProviderUser.md)

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

<a id="providersMicrosoftEntraUsersDestroy"></a>
# **providersMicrosoftEntraUsersDestroy**
> providersMicrosoftEntraUsersDestroy(id)



MicrosoftEntraProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider User.
    try {
      apiInstance.providersMicrosoftEntraUsersDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraUsersDestroy");
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
| **id** | **UUID**| A UUID string identifying this Microsoft Entra Provider User. | |

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

<a id="providersMicrosoftEntraUsersList"></a>
# **providersMicrosoftEntraUsersList**
> PaginatedMicrosoftEntraProviderUserList providersMicrosoftEntraUsersList(ordering, page, pageSize, providerId, search, userId, userUsername)



MicrosoftEntraProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer providerId = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    Integer userId = 56; // Integer | 
    String userUsername = "userUsername_example"; // String | 
    try {
      PaginatedMicrosoftEntraProviderUserList result = apiInstance.providersMicrosoftEntraUsersList(ordering, page, pageSize, providerId, search, userId, userUsername);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraUsersList");
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
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **providerId** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **userId** | **Integer**|  | [optional] |
| **userUsername** | **String**|  | [optional] |

### Return type

[**PaginatedMicrosoftEntraProviderUserList**](PaginatedMicrosoftEntraProviderUserList.md)

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

<a id="providersMicrosoftEntraUsersRetrieve"></a>
# **providersMicrosoftEntraUsersRetrieve**
> MicrosoftEntraProviderUser providersMicrosoftEntraUsersRetrieve(id)



MicrosoftEntraProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider User.
    try {
      MicrosoftEntraProviderUser result = apiInstance.providersMicrosoftEntraUsersRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraUsersRetrieve");
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
| **id** | **UUID**| A UUID string identifying this Microsoft Entra Provider User. | |

### Return type

[**MicrosoftEntraProviderUser**](MicrosoftEntraProviderUser.md)

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

<a id="providersMicrosoftEntraUsersUsedByList"></a>
# **providersMicrosoftEntraUsersUsedByList**
> List&lt;UsedBy&gt; providersMicrosoftEntraUsersUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider User.
    try {
      List<UsedBy> result = apiInstance.providersMicrosoftEntraUsersUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersMicrosoftEntraUsersUsedByList");
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
| **id** | **UUID**| A UUID string identifying this Microsoft Entra Provider User. | |

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

<a id="providersOauth2Create"></a>
# **providersOauth2Create**
> OAuth2Provider providersOauth2Create(oauth2ProviderRequest)



OAuth2Provider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    OAuth2ProviderRequest oauth2ProviderRequest = new OAuth2ProviderRequest(); // OAuth2ProviderRequest | 
    try {
      OAuth2Provider result = apiInstance.providersOauth2Create(oauth2ProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersOauth2Create");
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
| **oauth2ProviderRequest** | [**OAuth2ProviderRequest**](OAuth2ProviderRequest.md)|  | |

### Return type

[**OAuth2Provider**](OAuth2Provider.md)

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

<a id="providersOauth2Destroy"></a>
# **providersOauth2Destroy**
> providersOauth2Destroy(id)



OAuth2Provider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2/OpenID Provider.
    try {
      apiInstance.providersOauth2Destroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersOauth2Destroy");
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
| **id** | **Integer**| A unique integer value identifying this OAuth2/OpenID Provider. | |

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

<a id="providersOauth2List"></a>
# **providersOauth2List**
> PaginatedOAuth2ProviderList providersOauth2List(accessCodeValidity, accessTokenValidity, application, authorizationFlow, clientId, clientType, includeClaimsInIdToken, issuerMode, name, ordering, page, pageSize, propertyMappings, redirectUris, refreshTokenValidity, search, signingKey, subMode)



OAuth2Provider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    String accessCodeValidity = "accessCodeValidity_example"; // String | 
    String accessTokenValidity = "accessTokenValidity_example"; // String | 
    UUID application = UUID.randomUUID(); // UUID | 
    UUID authorizationFlow = UUID.randomUUID(); // UUID | 
    String clientId = "clientId_example"; // String | 
    String clientType = "confidential"; // String | Confidential clients are capable of maintaining the confidentiality of their credentials. Public clients are incapable  
    Boolean includeClaimsInIdToken = true; // Boolean | 
    String issuerMode = "global"; // String | Configure how the issuer field of the ID Token should be filled.  
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    List<UUID> propertyMappings = Arrays.asList(); // List<UUID> | 
    String redirectUris = "redirectUris_example"; // String | 
    String refreshTokenValidity = "refreshTokenValidity_example"; // String | 
    String search = "search_example"; // String | A search term.
    UUID signingKey = UUID.randomUUID(); // UUID | 
    String subMode = "hashed_user_id"; // String | Configure what data should be used as unique User Identifier. For most cases, the default should be fine.  
    try {
      PaginatedOAuth2ProviderList result = apiInstance.providersOauth2List(accessCodeValidity, accessTokenValidity, application, authorizationFlow, clientId, clientType, includeClaimsInIdToken, issuerMode, name, ordering, page, pageSize, propertyMappings, redirectUris, refreshTokenValidity, search, signingKey, subMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersOauth2List");
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
| **accessCodeValidity** | **String**|  | [optional] |
| **accessTokenValidity** | **String**|  | [optional] |
| **application** | **UUID**|  | [optional] |
| **authorizationFlow** | **UUID**|  | [optional] |
| **clientId** | **String**|  | [optional] |
| **clientType** | **String**| Confidential clients are capable of maintaining the confidentiality of their credentials. Public clients are incapable   | [optional] [enum: confidential, public] |
| **includeClaimsInIdToken** | **Boolean**|  | [optional] |
| **issuerMode** | **String**| Configure how the issuer field of the ID Token should be filled.   | [optional] [enum: global, per_provider] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **propertyMappings** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **redirectUris** | **String**|  | [optional] |
| **refreshTokenValidity** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **signingKey** | **UUID**|  | [optional] |
| **subMode** | **String**| Configure what data should be used as unique User Identifier. For most cases, the default should be fine.   | [optional] [enum: hashed_user_id, user_email, user_id, user_upn, user_username, user_uuid] |

### Return type

[**PaginatedOAuth2ProviderList**](PaginatedOAuth2ProviderList.md)

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

<a id="providersOauth2PartialUpdate"></a>
# **providersOauth2PartialUpdate**
> OAuth2Provider providersOauth2PartialUpdate(id, patchedOAuth2ProviderRequest)



OAuth2Provider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2/OpenID Provider.
    PatchedOAuth2ProviderRequest patchedOAuth2ProviderRequest = new PatchedOAuth2ProviderRequest(); // PatchedOAuth2ProviderRequest | 
    try {
      OAuth2Provider result = apiInstance.providersOauth2PartialUpdate(id, patchedOAuth2ProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersOauth2PartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this OAuth2/OpenID Provider. | |
| **patchedOAuth2ProviderRequest** | [**PatchedOAuth2ProviderRequest**](PatchedOAuth2ProviderRequest.md)|  | [optional] |

### Return type

[**OAuth2Provider**](OAuth2Provider.md)

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

<a id="providersOauth2PreviewUserRetrieve"></a>
# **providersOauth2PreviewUserRetrieve**
> PropertyMappingPreview providersOauth2PreviewUserRetrieve(id, forUser)



Preview user data for provider

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2/OpenID Provider.
    Integer forUser = 56; // Integer | 
    try {
      PropertyMappingPreview result = apiInstance.providersOauth2PreviewUserRetrieve(id, forUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersOauth2PreviewUserRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this OAuth2/OpenID Provider. | |
| **forUser** | **Integer**|  | [optional] |

### Return type

[**PropertyMappingPreview**](PropertyMappingPreview.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="providersOauth2Retrieve"></a>
# **providersOauth2Retrieve**
> OAuth2Provider providersOauth2Retrieve(id)



OAuth2Provider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2/OpenID Provider.
    try {
      OAuth2Provider result = apiInstance.providersOauth2Retrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersOauth2Retrieve");
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
| **id** | **Integer**| A unique integer value identifying this OAuth2/OpenID Provider. | |

### Return type

[**OAuth2Provider**](OAuth2Provider.md)

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

<a id="providersOauth2SetupUrlsRetrieve"></a>
# **providersOauth2SetupUrlsRetrieve**
> OAuth2ProviderSetupURLs providersOauth2SetupUrlsRetrieve(id)



Get Providers setup URLs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2/OpenID Provider.
    try {
      OAuth2ProviderSetupURLs result = apiInstance.providersOauth2SetupUrlsRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersOauth2SetupUrlsRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this OAuth2/OpenID Provider. | |

### Return type

[**OAuth2ProviderSetupURLs**](OAuth2ProviderSetupURLs.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **404** | Provider has no application assigned |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="providersOauth2Update"></a>
# **providersOauth2Update**
> OAuth2Provider providersOauth2Update(id, oauth2ProviderRequest)



OAuth2Provider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2/OpenID Provider.
    OAuth2ProviderRequest oauth2ProviderRequest = new OAuth2ProviderRequest(); // OAuth2ProviderRequest | 
    try {
      OAuth2Provider result = apiInstance.providersOauth2Update(id, oauth2ProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersOauth2Update");
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
| **id** | **Integer**| A unique integer value identifying this OAuth2/OpenID Provider. | |
| **oauth2ProviderRequest** | [**OAuth2ProviderRequest**](OAuth2ProviderRequest.md)|  | |

### Return type

[**OAuth2Provider**](OAuth2Provider.md)

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

<a id="providersOauth2UsedByList"></a>
# **providersOauth2UsedByList**
> List&lt;UsedBy&gt; providersOauth2UsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2/OpenID Provider.
    try {
      List<UsedBy> result = apiInstance.providersOauth2UsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersOauth2UsedByList");
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
| **id** | **Integer**| A unique integer value identifying this OAuth2/OpenID Provider. | |

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

<a id="providersProxyCreate"></a>
# **providersProxyCreate**
> ProxyProvider providersProxyCreate(proxyProviderRequest)



ProxyProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    ProxyProviderRequest proxyProviderRequest = new ProxyProviderRequest(); // ProxyProviderRequest | 
    try {
      ProxyProvider result = apiInstance.providersProxyCreate(proxyProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersProxyCreate");
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
| **proxyProviderRequest** | [**ProxyProviderRequest**](ProxyProviderRequest.md)|  | |

### Return type

[**ProxyProvider**](ProxyProvider.md)

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

<a id="providersProxyDestroy"></a>
# **providersProxyDestroy**
> providersProxyDestroy(id)



ProxyProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Proxy Provider.
    try {
      apiInstance.providersProxyDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersProxyDestroy");
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
| **id** | **Integer**| A unique integer value identifying this Proxy Provider. | |

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

<a id="providersProxyList"></a>
# **providersProxyList**
> PaginatedProxyProviderList providersProxyList(applicationIsnull, authorizationFlowSlugIexact, basicAuthEnabledIexact, basicAuthPasswordAttributeIexact, basicAuthUserAttributeIexact, certificateKpUuidIexact, certificateNameIexact, cookieDomainIexact, externalHostIexact, internalHostIexact, internalHostSslValidationIexact, modeIexact, nameIexact, ordering, page, pageSize, propertyMappingsIexact, redirectUrisIexact, search, skipPathRegexIexact)



ProxyProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Boolean applicationIsnull = true; // Boolean | 
    String authorizationFlowSlugIexact = "authorizationFlowSlugIexact_example"; // String | 
    Boolean basicAuthEnabledIexact = true; // Boolean | 
    String basicAuthPasswordAttributeIexact = "basicAuthPasswordAttributeIexact_example"; // String | 
    String basicAuthUserAttributeIexact = "basicAuthUserAttributeIexact_example"; // String | 
    UUID certificateKpUuidIexact = UUID.randomUUID(); // UUID | 
    String certificateNameIexact = "certificateNameIexact_example"; // String | 
    String cookieDomainIexact = "cookieDomainIexact_example"; // String | 
    String externalHostIexact = "externalHostIexact_example"; // String | 
    String internalHostIexact = "internalHostIexact_example"; // String | 
    Boolean internalHostSslValidationIexact = true; // Boolean | 
    String modeIexact = "modeIexact_example"; // String | 
    String nameIexact = "nameIexact_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    List<UUID> propertyMappingsIexact = Arrays.asList(); // List<UUID> | 
    String redirectUrisIexact = "redirectUrisIexact_example"; // String | 
    String search = "search_example"; // String | A search term.
    String skipPathRegexIexact = "skipPathRegexIexact_example"; // String | 
    try {
      PaginatedProxyProviderList result = apiInstance.providersProxyList(applicationIsnull, authorizationFlowSlugIexact, basicAuthEnabledIexact, basicAuthPasswordAttributeIexact, basicAuthUserAttributeIexact, certificateKpUuidIexact, certificateNameIexact, cookieDomainIexact, externalHostIexact, internalHostIexact, internalHostSslValidationIexact, modeIexact, nameIexact, ordering, page, pageSize, propertyMappingsIexact, redirectUrisIexact, search, skipPathRegexIexact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersProxyList");
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
| **applicationIsnull** | **Boolean**|  | [optional] |
| **authorizationFlowSlugIexact** | **String**|  | [optional] |
| **basicAuthEnabledIexact** | **Boolean**|  | [optional] |
| **basicAuthPasswordAttributeIexact** | **String**|  | [optional] |
| **basicAuthUserAttributeIexact** | **String**|  | [optional] |
| **certificateKpUuidIexact** | **UUID**|  | [optional] |
| **certificateNameIexact** | **String**|  | [optional] |
| **cookieDomainIexact** | **String**|  | [optional] |
| **externalHostIexact** | **String**|  | [optional] |
| **internalHostIexact** | **String**|  | [optional] |
| **internalHostSslValidationIexact** | **Boolean**|  | [optional] |
| **modeIexact** | **String**|  | [optional] |
| **nameIexact** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **propertyMappingsIexact** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **redirectUrisIexact** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **skipPathRegexIexact** | **String**|  | [optional] |

### Return type

[**PaginatedProxyProviderList**](PaginatedProxyProviderList.md)

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

<a id="providersProxyPartialUpdate"></a>
# **providersProxyPartialUpdate**
> ProxyProvider providersProxyPartialUpdate(id, patchedProxyProviderRequest)



ProxyProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Proxy Provider.
    PatchedProxyProviderRequest patchedProxyProviderRequest = new PatchedProxyProviderRequest(); // PatchedProxyProviderRequest | 
    try {
      ProxyProvider result = apiInstance.providersProxyPartialUpdate(id, patchedProxyProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersProxyPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this Proxy Provider. | |
| **patchedProxyProviderRequest** | [**PatchedProxyProviderRequest**](PatchedProxyProviderRequest.md)|  | [optional] |

### Return type

[**ProxyProvider**](ProxyProvider.md)

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

<a id="providersProxyRetrieve"></a>
# **providersProxyRetrieve**
> ProxyProvider providersProxyRetrieve(id)



ProxyProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Proxy Provider.
    try {
      ProxyProvider result = apiInstance.providersProxyRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersProxyRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this Proxy Provider. | |

### Return type

[**ProxyProvider**](ProxyProvider.md)

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

<a id="providersProxyUpdate"></a>
# **providersProxyUpdate**
> ProxyProvider providersProxyUpdate(id, proxyProviderRequest)



ProxyProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Proxy Provider.
    ProxyProviderRequest proxyProviderRequest = new ProxyProviderRequest(); // ProxyProviderRequest | 
    try {
      ProxyProvider result = apiInstance.providersProxyUpdate(id, proxyProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersProxyUpdate");
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
| **id** | **Integer**| A unique integer value identifying this Proxy Provider. | |
| **proxyProviderRequest** | [**ProxyProviderRequest**](ProxyProviderRequest.md)|  | |

### Return type

[**ProxyProvider**](ProxyProvider.md)

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

<a id="providersProxyUsedByList"></a>
# **providersProxyUsedByList**
> List&lt;UsedBy&gt; providersProxyUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Proxy Provider.
    try {
      List<UsedBy> result = apiInstance.providersProxyUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersProxyUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this Proxy Provider. | |

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

<a id="providersRacCreate"></a>
# **providersRacCreate**
> RACProvider providersRacCreate(raCProviderRequest)



RACProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    RACProviderRequest raCProviderRequest = new RACProviderRequest(); // RACProviderRequest | 
    try {
      RACProvider result = apiInstance.providersRacCreate(raCProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRacCreate");
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
| **raCProviderRequest** | [**RACProviderRequest**](RACProviderRequest.md)|  | |

### Return type

[**RACProvider**](RACProvider.md)

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

<a id="providersRacDestroy"></a>
# **providersRacDestroy**
> providersRacDestroy(id)



RACProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this RAC Provider.
    try {
      apiInstance.providersRacDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRacDestroy");
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
| **id** | **Integer**| A unique integer value identifying this RAC Provider. | |

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

<a id="providersRacList"></a>
# **providersRacList**
> PaginatedRACProviderList providersRacList(applicationIsnull, nameIexact, ordering, page, pageSize, search)



RACProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Boolean applicationIsnull = true; // Boolean | 
    String nameIexact = "nameIexact_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedRACProviderList result = apiInstance.providersRacList(applicationIsnull, nameIexact, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRacList");
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
| **applicationIsnull** | **Boolean**|  | [optional] |
| **nameIexact** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedRACProviderList**](PaginatedRACProviderList.md)

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

<a id="providersRacPartialUpdate"></a>
# **providersRacPartialUpdate**
> RACProvider providersRacPartialUpdate(id, patchedRACProviderRequest)



RACProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this RAC Provider.
    PatchedRACProviderRequest patchedRACProviderRequest = new PatchedRACProviderRequest(); // PatchedRACProviderRequest | 
    try {
      RACProvider result = apiInstance.providersRacPartialUpdate(id, patchedRACProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRacPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this RAC Provider. | |
| **patchedRACProviderRequest** | [**PatchedRACProviderRequest**](PatchedRACProviderRequest.md)|  | [optional] |

### Return type

[**RACProvider**](RACProvider.md)

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

<a id="providersRacRetrieve"></a>
# **providersRacRetrieve**
> RACProvider providersRacRetrieve(id)



RACProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this RAC Provider.
    try {
      RACProvider result = apiInstance.providersRacRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRacRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this RAC Provider. | |

### Return type

[**RACProvider**](RACProvider.md)

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

<a id="providersRacUpdate"></a>
# **providersRacUpdate**
> RACProvider providersRacUpdate(id, raCProviderRequest)



RACProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this RAC Provider.
    RACProviderRequest raCProviderRequest = new RACProviderRequest(); // RACProviderRequest | 
    try {
      RACProvider result = apiInstance.providersRacUpdate(id, raCProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRacUpdate");
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
| **id** | **Integer**| A unique integer value identifying this RAC Provider. | |
| **raCProviderRequest** | [**RACProviderRequest**](RACProviderRequest.md)|  | |

### Return type

[**RACProvider**](RACProvider.md)

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

<a id="providersRacUsedByList"></a>
# **providersRacUsedByList**
> List&lt;UsedBy&gt; providersRacUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this RAC Provider.
    try {
      List<UsedBy> result = apiInstance.providersRacUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRacUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this RAC Provider. | |

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

<a id="providersRadiusCreate"></a>
# **providersRadiusCreate**
> RadiusProvider providersRadiusCreate(radiusProviderRequest)



RadiusProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    RadiusProviderRequest radiusProviderRequest = new RadiusProviderRequest(); // RadiusProviderRequest | 
    try {
      RadiusProvider result = apiInstance.providersRadiusCreate(radiusProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRadiusCreate");
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
| **radiusProviderRequest** | [**RadiusProviderRequest**](RadiusProviderRequest.md)|  | |

### Return type

[**RadiusProvider**](RadiusProvider.md)

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

<a id="providersRadiusDestroy"></a>
# **providersRadiusDestroy**
> providersRadiusDestroy(id)



RadiusProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Radius Provider.
    try {
      apiInstance.providersRadiusDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRadiusDestroy");
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
| **id** | **Integer**| A unique integer value identifying this Radius Provider. | |

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

<a id="providersRadiusList"></a>
# **providersRadiusList**
> PaginatedRadiusProviderList providersRadiusList(applicationIsnull, authorizationFlowSlugIexact, clientNetworksIexact, nameIexact, ordering, page, pageSize, search)



RadiusProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Boolean applicationIsnull = true; // Boolean | 
    String authorizationFlowSlugIexact = "authorizationFlowSlugIexact_example"; // String | 
    String clientNetworksIexact = "clientNetworksIexact_example"; // String | 
    String nameIexact = "nameIexact_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedRadiusProviderList result = apiInstance.providersRadiusList(applicationIsnull, authorizationFlowSlugIexact, clientNetworksIexact, nameIexact, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRadiusList");
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
| **applicationIsnull** | **Boolean**|  | [optional] |
| **authorizationFlowSlugIexact** | **String**|  | [optional] |
| **clientNetworksIexact** | **String**|  | [optional] |
| **nameIexact** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedRadiusProviderList**](PaginatedRadiusProviderList.md)

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

<a id="providersRadiusPartialUpdate"></a>
# **providersRadiusPartialUpdate**
> RadiusProvider providersRadiusPartialUpdate(id, patchedRadiusProviderRequest)



RadiusProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Radius Provider.
    PatchedRadiusProviderRequest patchedRadiusProviderRequest = new PatchedRadiusProviderRequest(); // PatchedRadiusProviderRequest | 
    try {
      RadiusProvider result = apiInstance.providersRadiusPartialUpdate(id, patchedRadiusProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRadiusPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this Radius Provider. | |
| **patchedRadiusProviderRequest** | [**PatchedRadiusProviderRequest**](PatchedRadiusProviderRequest.md)|  | [optional] |

### Return type

[**RadiusProvider**](RadiusProvider.md)

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

<a id="providersRadiusRetrieve"></a>
# **providersRadiusRetrieve**
> RadiusProvider providersRadiusRetrieve(id)



RadiusProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Radius Provider.
    try {
      RadiusProvider result = apiInstance.providersRadiusRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRadiusRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this Radius Provider. | |

### Return type

[**RadiusProvider**](RadiusProvider.md)

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

<a id="providersRadiusUpdate"></a>
# **providersRadiusUpdate**
> RadiusProvider providersRadiusUpdate(id, radiusProviderRequest)



RadiusProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Radius Provider.
    RadiusProviderRequest radiusProviderRequest = new RadiusProviderRequest(); // RadiusProviderRequest | 
    try {
      RadiusProvider result = apiInstance.providersRadiusUpdate(id, radiusProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRadiusUpdate");
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
| **id** | **Integer**| A unique integer value identifying this Radius Provider. | |
| **radiusProviderRequest** | [**RadiusProviderRequest**](RadiusProviderRequest.md)|  | |

### Return type

[**RadiusProvider**](RadiusProvider.md)

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

<a id="providersRadiusUsedByList"></a>
# **providersRadiusUsedByList**
> List&lt;UsedBy&gt; providersRadiusUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Radius Provider.
    try {
      List<UsedBy> result = apiInstance.providersRadiusUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersRadiusUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this Radius Provider. | |

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

<a id="providersSamlCreate"></a>
# **providersSamlCreate**
> SAMLProvider providersSamlCreate(saMLProviderRequest)



SAMLProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    SAMLProviderRequest saMLProviderRequest = new SAMLProviderRequest(); // SAMLProviderRequest | 
    try {
      SAMLProvider result = apiInstance.providersSamlCreate(saMLProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlCreate");
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
| **saMLProviderRequest** | [**SAMLProviderRequest**](SAMLProviderRequest.md)|  | |

### Return type

[**SAMLProvider**](SAMLProvider.md)

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

<a id="providersSamlDestroy"></a>
# **providersSamlDestroy**
> providersSamlDestroy(id)



SAMLProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SAML Provider.
    try {
      apiInstance.providersSamlDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlDestroy");
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
| **id** | **Integer**| A unique integer value identifying this SAML Provider. | |

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

<a id="providersSamlImportMetadataCreate"></a>
# **providersSamlImportMetadataCreate**
> providersSamlImportMetadataCreate(name, authorizationFlow, _file)



Create provider from SAML Metadata

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    String name = "name_example"; // String | 
    UUID authorizationFlow = UUID.randomUUID(); // UUID | 
    File _file = new File("/path/to/file"); // File | 
    try {
      apiInstance.providersSamlImportMetadataCreate(name, authorizationFlow, _file);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlImportMetadataCreate");
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
| **name** | **String**|  | |
| **authorizationFlow** | **UUID**|  | |
| **_file** | **File**|  | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully imported provider |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="providersSamlList"></a>
# **providersSamlList**
> PaginatedSAMLProviderList providersSamlList(acsUrl, assertionValidNotBefore, assertionValidNotOnOrAfter, audience, authenticationFlow, authorizationFlow, backchannelApplication, defaultRelayState, digestAlgorithm, isBackchannel, issuer, name, nameIdMapping, ordering, page, pageSize, propertyMappings, search, sessionValidNotOnOrAfter, signatureAlgorithm, signingKp, spBinding, verificationKp)



SAMLProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    String acsUrl = "acsUrl_example"; // String | 
    String assertionValidNotBefore = "assertionValidNotBefore_example"; // String | 
    String assertionValidNotOnOrAfter = "assertionValidNotOnOrAfter_example"; // String | 
    String audience = "audience_example"; // String | 
    UUID authenticationFlow = UUID.randomUUID(); // UUID | 
    UUID authorizationFlow = UUID.randomUUID(); // UUID | 
    UUID backchannelApplication = UUID.randomUUID(); // UUID | 
    String defaultRelayState = "defaultRelayState_example"; // String | 
    String digestAlgorithm = "http://www.w3.org/2000/09/xmldsig#sha1"; // String | 
    Boolean isBackchannel = true; // Boolean | 
    String issuer = "issuer_example"; // String | 
    String name = "name_example"; // String | 
    UUID nameIdMapping = UUID.randomUUID(); // UUID | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    List<UUID> propertyMappings = Arrays.asList(); // List<UUID> | 
    String search = "search_example"; // String | A search term.
    String sessionValidNotOnOrAfter = "sessionValidNotOnOrAfter_example"; // String | 
    String signatureAlgorithm = "http://www.w3.org/2000/09/xmldsig#dsa-sha1"; // String | 
    UUID signingKp = UUID.randomUUID(); // UUID | 
    String spBinding = "post"; // String | This determines how authentik sends the response back to the Service Provider.  
    UUID verificationKp = UUID.randomUUID(); // UUID | 
    try {
      PaginatedSAMLProviderList result = apiInstance.providersSamlList(acsUrl, assertionValidNotBefore, assertionValidNotOnOrAfter, audience, authenticationFlow, authorizationFlow, backchannelApplication, defaultRelayState, digestAlgorithm, isBackchannel, issuer, name, nameIdMapping, ordering, page, pageSize, propertyMappings, search, sessionValidNotOnOrAfter, signatureAlgorithm, signingKp, spBinding, verificationKp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlList");
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
| **acsUrl** | **String**|  | [optional] |
| **assertionValidNotBefore** | **String**|  | [optional] |
| **assertionValidNotOnOrAfter** | **String**|  | [optional] |
| **audience** | **String**|  | [optional] |
| **authenticationFlow** | **UUID**|  | [optional] |
| **authorizationFlow** | **UUID**|  | [optional] |
| **backchannelApplication** | **UUID**|  | [optional] |
| **defaultRelayState** | **String**|  | [optional] |
| **digestAlgorithm** | **String**|  | [optional] [enum: http://www.w3.org/2000/09/xmldsig#sha1, http://www.w3.org/2001/04/xmldsig-more#sha384, http://www.w3.org/2001/04/xmlenc#sha256, http://www.w3.org/2001/04/xmlenc#sha512] |
| **isBackchannel** | **Boolean**|  | [optional] |
| **issuer** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **nameIdMapping** | **UUID**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **propertyMappings** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **sessionValidNotOnOrAfter** | **String**|  | [optional] |
| **signatureAlgorithm** | **String**|  | [optional] [enum: http://www.w3.org/2000/09/xmldsig#dsa-sha1, http://www.w3.org/2000/09/xmldsig#rsa-sha1, http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1, http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256, http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384, http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512, http://www.w3.org/2001/04/xmldsig-more#rsa-sha256, http://www.w3.org/2001/04/xmldsig-more#rsa-sha384, http://www.w3.org/2001/04/xmldsig-more#rsa-sha512] |
| **signingKp** | **UUID**|  | [optional] |
| **spBinding** | **String**| This determines how authentik sends the response back to the Service Provider.   | [optional] [enum: post, redirect] |
| **verificationKp** | **UUID**|  | [optional] |

### Return type

[**PaginatedSAMLProviderList**](PaginatedSAMLProviderList.md)

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

<a id="providersSamlMetadataRetrieve"></a>
# **providersSamlMetadataRetrieve**
> SAMLMetadata providersSamlMetadataRetrieve(id, download, forceBinding)



Return metadata as XML string

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SAML Provider.
    Boolean download = true; // Boolean | 
    String forceBinding = "urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST"; // String | Optionally force the metadata to only include one binding.
    try {
      SAMLMetadata result = apiInstance.providersSamlMetadataRetrieve(id, download, forceBinding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlMetadataRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this SAML Provider. | |
| **download** | **Boolean**|  | [optional] |
| **forceBinding** | **String**| Optionally force the metadata to only include one binding. | [optional] [enum: urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST, urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect] |

### Return type

[**SAMLMetadata**](SAMLMetadata.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **404** | Provider has no application assigned |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="providersSamlPartialUpdate"></a>
# **providersSamlPartialUpdate**
> SAMLProvider providersSamlPartialUpdate(id, patchedSAMLProviderRequest)



SAMLProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SAML Provider.
    PatchedSAMLProviderRequest patchedSAMLProviderRequest = new PatchedSAMLProviderRequest(); // PatchedSAMLProviderRequest | 
    try {
      SAMLProvider result = apiInstance.providersSamlPartialUpdate(id, patchedSAMLProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this SAML Provider. | |
| **patchedSAMLProviderRequest** | [**PatchedSAMLProviderRequest**](PatchedSAMLProviderRequest.md)|  | [optional] |

### Return type

[**SAMLProvider**](SAMLProvider.md)

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

<a id="providersSamlPreviewUserRetrieve"></a>
# **providersSamlPreviewUserRetrieve**
> PropertyMappingPreview providersSamlPreviewUserRetrieve(id, forUser)



Preview user data for provider

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SAML Provider.
    Integer forUser = 56; // Integer | 
    try {
      PropertyMappingPreview result = apiInstance.providersSamlPreviewUserRetrieve(id, forUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlPreviewUserRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this SAML Provider. | |
| **forUser** | **Integer**|  | [optional] |

### Return type

[**PropertyMappingPreview**](PropertyMappingPreview.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="providersSamlRetrieve"></a>
# **providersSamlRetrieve**
> SAMLProvider providersSamlRetrieve(id)



SAMLProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SAML Provider.
    try {
      SAMLProvider result = apiInstance.providersSamlRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this SAML Provider. | |

### Return type

[**SAMLProvider**](SAMLProvider.md)

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

<a id="providersSamlUpdate"></a>
# **providersSamlUpdate**
> SAMLProvider providersSamlUpdate(id, saMLProviderRequest)



SAMLProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SAML Provider.
    SAMLProviderRequest saMLProviderRequest = new SAMLProviderRequest(); // SAMLProviderRequest | 
    try {
      SAMLProvider result = apiInstance.providersSamlUpdate(id, saMLProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlUpdate");
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
| **id** | **Integer**| A unique integer value identifying this SAML Provider. | |
| **saMLProviderRequest** | [**SAMLProviderRequest**](SAMLProviderRequest.md)|  | |

### Return type

[**SAMLProvider**](SAMLProvider.md)

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

<a id="providersSamlUsedByList"></a>
# **providersSamlUsedByList**
> List&lt;UsedBy&gt; providersSamlUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SAML Provider.
    try {
      List<UsedBy> result = apiInstance.providersSamlUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersSamlUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this SAML Provider. | |

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

<a id="providersScimCreate"></a>
# **providersScimCreate**
> SCIMProvider providersScimCreate(scIMProviderRequest)



SCIMProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    SCIMProviderRequest scIMProviderRequest = new SCIMProviderRequest(); // SCIMProviderRequest | 
    try {
      SCIMProvider result = apiInstance.providersScimCreate(scIMProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimCreate");
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
| **scIMProviderRequest** | [**SCIMProviderRequest**](SCIMProviderRequest.md)|  | |

### Return type

[**SCIMProvider**](SCIMProvider.md)

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

<a id="providersScimDestroy"></a>
# **providersScimDestroy**
> providersScimDestroy(id)



SCIMProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SCIM Provider.
    try {
      apiInstance.providersScimDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimDestroy");
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
| **id** | **Integer**| A unique integer value identifying this SCIM Provider. | |

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

<a id="providersScimGroupsCreate"></a>
# **providersScimGroupsCreate**
> SCIMProviderGroup providersScimGroupsCreate(scIMProviderGroupRequest)



SCIMProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    SCIMProviderGroupRequest scIMProviderGroupRequest = new SCIMProviderGroupRequest(); // SCIMProviderGroupRequest | 
    try {
      SCIMProviderGroup result = apiInstance.providersScimGroupsCreate(scIMProviderGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimGroupsCreate");
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
| **scIMProviderGroupRequest** | [**SCIMProviderGroupRequest**](SCIMProviderGroupRequest.md)|  | |

### Return type

[**SCIMProviderGroup**](SCIMProviderGroup.md)

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

<a id="providersScimGroupsDestroy"></a>
# **providersScimGroupsDestroy**
> providersScimGroupsDestroy(id)



SCIMProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this scim provider group.
    try {
      apiInstance.providersScimGroupsDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimGroupsDestroy");
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
| **id** | **UUID**| A UUID string identifying this scim provider group. | |

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

<a id="providersScimGroupsList"></a>
# **providersScimGroupsList**
> PaginatedSCIMProviderGroupList providersScimGroupsList(groupGroupUuid, groupName, ordering, page, pageSize, providerId, search)



SCIMProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID groupGroupUuid = UUID.randomUUID(); // UUID | 
    String groupName = "groupName_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer providerId = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedSCIMProviderGroupList result = apiInstance.providersScimGroupsList(groupGroupUuid, groupName, ordering, page, pageSize, providerId, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimGroupsList");
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
| **groupGroupUuid** | **UUID**|  | [optional] |
| **groupName** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **providerId** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedSCIMProviderGroupList**](PaginatedSCIMProviderGroupList.md)

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

<a id="providersScimGroupsRetrieve"></a>
# **providersScimGroupsRetrieve**
> SCIMProviderGroup providersScimGroupsRetrieve(id)



SCIMProviderGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this scim provider group.
    try {
      SCIMProviderGroup result = apiInstance.providersScimGroupsRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimGroupsRetrieve");
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
| **id** | **UUID**| A UUID string identifying this scim provider group. | |

### Return type

[**SCIMProviderGroup**](SCIMProviderGroup.md)

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

<a id="providersScimGroupsUsedByList"></a>
# **providersScimGroupsUsedByList**
> List&lt;UsedBy&gt; providersScimGroupsUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this scim provider group.
    try {
      List<UsedBy> result = apiInstance.providersScimGroupsUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimGroupsUsedByList");
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
| **id** | **UUID**| A UUID string identifying this scim provider group. | |

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

<a id="providersScimList"></a>
# **providersScimList**
> PaginatedSCIMProviderList providersScimList(excludeUsersServiceAccount, filterGroup, name, ordering, page, pageSize, search, url)



SCIMProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Boolean excludeUsersServiceAccount = true; // Boolean | 
    UUID filterGroup = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String url = "url_example"; // String | 
    try {
      PaginatedSCIMProviderList result = apiInstance.providersScimList(excludeUsersServiceAccount, filterGroup, name, ordering, page, pageSize, search, url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimList");
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
| **excludeUsersServiceAccount** | **Boolean**|  | [optional] |
| **filterGroup** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **url** | **String**|  | [optional] |

### Return type

[**PaginatedSCIMProviderList**](PaginatedSCIMProviderList.md)

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

<a id="providersScimPartialUpdate"></a>
# **providersScimPartialUpdate**
> SCIMProvider providersScimPartialUpdate(id, patchedSCIMProviderRequest)



SCIMProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SCIM Provider.
    PatchedSCIMProviderRequest patchedSCIMProviderRequest = new PatchedSCIMProviderRequest(); // PatchedSCIMProviderRequest | 
    try {
      SCIMProvider result = apiInstance.providersScimPartialUpdate(id, patchedSCIMProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this SCIM Provider. | |
| **patchedSCIMProviderRequest** | [**PatchedSCIMProviderRequest**](PatchedSCIMProviderRequest.md)|  | [optional] |

### Return type

[**SCIMProvider**](SCIMProvider.md)

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

<a id="providersScimRetrieve"></a>
# **providersScimRetrieve**
> SCIMProvider providersScimRetrieve(id)



SCIMProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SCIM Provider.
    try {
      SCIMProvider result = apiInstance.providersScimRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this SCIM Provider. | |

### Return type

[**SCIMProvider**](SCIMProvider.md)

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

<a id="providersScimSyncStatusRetrieve"></a>
# **providersScimSyncStatusRetrieve**
> SyncStatus providersScimSyncStatusRetrieve(id)



Get provider&#39;s sync status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SCIM Provider.
    try {
      SyncStatus result = apiInstance.providersScimSyncStatusRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimSyncStatusRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this SCIM Provider. | |

### Return type

[**SyncStatus**](SyncStatus.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **404** | Task not found |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="providersScimUpdate"></a>
# **providersScimUpdate**
> SCIMProvider providersScimUpdate(id, scIMProviderRequest)



SCIMProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SCIM Provider.
    SCIMProviderRequest scIMProviderRequest = new SCIMProviderRequest(); // SCIMProviderRequest | 
    try {
      SCIMProvider result = apiInstance.providersScimUpdate(id, scIMProviderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimUpdate");
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
| **id** | **Integer**| A unique integer value identifying this SCIM Provider. | |
| **scIMProviderRequest** | [**SCIMProviderRequest**](SCIMProviderRequest.md)|  | |

### Return type

[**SCIMProvider**](SCIMProvider.md)

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

<a id="providersScimUsedByList"></a>
# **providersScimUsedByList**
> List&lt;UsedBy&gt; providersScimUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SCIM Provider.
    try {
      List<UsedBy> result = apiInstance.providersScimUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this SCIM Provider. | |

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

<a id="providersScimUsersCreate"></a>
# **providersScimUsersCreate**
> SCIMProviderUser providersScimUsersCreate(scIMProviderUserRequest)



SCIMProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    SCIMProviderUserRequest scIMProviderUserRequest = new SCIMProviderUserRequest(); // SCIMProviderUserRequest | 
    try {
      SCIMProviderUser result = apiInstance.providersScimUsersCreate(scIMProviderUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimUsersCreate");
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
| **scIMProviderUserRequest** | [**SCIMProviderUserRequest**](SCIMProviderUserRequest.md)|  | |

### Return type

[**SCIMProviderUser**](SCIMProviderUser.md)

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

<a id="providersScimUsersDestroy"></a>
# **providersScimUsersDestroy**
> providersScimUsersDestroy(id)



SCIMProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this scim provider user.
    try {
      apiInstance.providersScimUsersDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimUsersDestroy");
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
| **id** | **UUID**| A UUID string identifying this scim provider user. | |

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

<a id="providersScimUsersList"></a>
# **providersScimUsersList**
> PaginatedSCIMProviderUserList providersScimUsersList(ordering, page, pageSize, providerId, search, userId, userUsername)



SCIMProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer providerId = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    Integer userId = 56; // Integer | 
    String userUsername = "userUsername_example"; // String | 
    try {
      PaginatedSCIMProviderUserList result = apiInstance.providersScimUsersList(ordering, page, pageSize, providerId, search, userId, userUsername);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimUsersList");
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
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **providerId** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **userId** | **Integer**|  | [optional] |
| **userUsername** | **String**|  | [optional] |

### Return type

[**PaginatedSCIMProviderUserList**](PaginatedSCIMProviderUserList.md)

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

<a id="providersScimUsersRetrieve"></a>
# **providersScimUsersRetrieve**
> SCIMProviderUser providersScimUsersRetrieve(id)



SCIMProviderUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this scim provider user.
    try {
      SCIMProviderUser result = apiInstance.providersScimUsersRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimUsersRetrieve");
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
| **id** | **UUID**| A UUID string identifying this scim provider user. | |

### Return type

[**SCIMProviderUser**](SCIMProviderUser.md)

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

<a id="providersScimUsersUsedByList"></a>
# **providersScimUsersUsedByList**
> List&lt;UsedBy&gt; providersScimUsersUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ProvidersApi apiInstance = new ProvidersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this scim provider user.
    try {
      List<UsedBy> result = apiInstance.providersScimUsersUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvidersApi#providersScimUsersUsedByList");
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
| **id** | **UUID**| A UUID string identifying this scim provider user. | |

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

