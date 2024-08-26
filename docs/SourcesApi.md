# SourcesApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sourcesAllDestroy**](SourcesApi.md#sourcesAllDestroy) | **DELETE** /sources/all/{slug}/ |  |
| [**sourcesAllList**](SourcesApi.md#sourcesAllList) | **GET** /sources/all/ |  |
| [**sourcesAllRetrieve**](SourcesApi.md#sourcesAllRetrieve) | **GET** /sources/all/{slug}/ |  |
| [**sourcesAllSetIconCreate**](SourcesApi.md#sourcesAllSetIconCreate) | **POST** /sources/all/{slug}/set_icon/ |  |
| [**sourcesAllSetIconUrlCreate**](SourcesApi.md#sourcesAllSetIconUrlCreate) | **POST** /sources/all/{slug}/set_icon_url/ |  |
| [**sourcesAllTypesList**](SourcesApi.md#sourcesAllTypesList) | **GET** /sources/all/types/ |  |
| [**sourcesAllUsedByList**](SourcesApi.md#sourcesAllUsedByList) | **GET** /sources/all/{slug}/used_by/ |  |
| [**sourcesAllUserSettingsList**](SourcesApi.md#sourcesAllUserSettingsList) | **GET** /sources/all/user_settings/ |  |
| [**sourcesLdapCreate**](SourcesApi.md#sourcesLdapCreate) | **POST** /sources/ldap/ |  |
| [**sourcesLdapDebugRetrieve**](SourcesApi.md#sourcesLdapDebugRetrieve) | **GET** /sources/ldap/{slug}/debug/ |  |
| [**sourcesLdapDestroy**](SourcesApi.md#sourcesLdapDestroy) | **DELETE** /sources/ldap/{slug}/ |  |
| [**sourcesLdapList**](SourcesApi.md#sourcesLdapList) | **GET** /sources/ldap/ |  |
| [**sourcesLdapPartialUpdate**](SourcesApi.md#sourcesLdapPartialUpdate) | **PATCH** /sources/ldap/{slug}/ |  |
| [**sourcesLdapRetrieve**](SourcesApi.md#sourcesLdapRetrieve) | **GET** /sources/ldap/{slug}/ |  |
| [**sourcesLdapSyncStatusRetrieve**](SourcesApi.md#sourcesLdapSyncStatusRetrieve) | **GET** /sources/ldap/{slug}/sync/status/ |  |
| [**sourcesLdapUpdate**](SourcesApi.md#sourcesLdapUpdate) | **PUT** /sources/ldap/{slug}/ |  |
| [**sourcesLdapUsedByList**](SourcesApi.md#sourcesLdapUsedByList) | **GET** /sources/ldap/{slug}/used_by/ |  |
| [**sourcesOauthCreate**](SourcesApi.md#sourcesOauthCreate) | **POST** /sources/oauth/ |  |
| [**sourcesOauthDestroy**](SourcesApi.md#sourcesOauthDestroy) | **DELETE** /sources/oauth/{slug}/ |  |
| [**sourcesOauthList**](SourcesApi.md#sourcesOauthList) | **GET** /sources/oauth/ |  |
| [**sourcesOauthPartialUpdate**](SourcesApi.md#sourcesOauthPartialUpdate) | **PATCH** /sources/oauth/{slug}/ |  |
| [**sourcesOauthRetrieve**](SourcesApi.md#sourcesOauthRetrieve) | **GET** /sources/oauth/{slug}/ |  |
| [**sourcesOauthSourceTypesList**](SourcesApi.md#sourcesOauthSourceTypesList) | **GET** /sources/oauth/source_types/ |  |
| [**sourcesOauthUpdate**](SourcesApi.md#sourcesOauthUpdate) | **PUT** /sources/oauth/{slug}/ |  |
| [**sourcesOauthUsedByList**](SourcesApi.md#sourcesOauthUsedByList) | **GET** /sources/oauth/{slug}/used_by/ |  |
| [**sourcesPlexCreate**](SourcesApi.md#sourcesPlexCreate) | **POST** /sources/plex/ |  |
| [**sourcesPlexDestroy**](SourcesApi.md#sourcesPlexDestroy) | **DELETE** /sources/plex/{slug}/ |  |
| [**sourcesPlexList**](SourcesApi.md#sourcesPlexList) | **GET** /sources/plex/ |  |
| [**sourcesPlexPartialUpdate**](SourcesApi.md#sourcesPlexPartialUpdate) | **PATCH** /sources/plex/{slug}/ |  |
| [**sourcesPlexRedeemTokenAuthenticatedCreate**](SourcesApi.md#sourcesPlexRedeemTokenAuthenticatedCreate) | **POST** /sources/plex/redeem_token_authenticated/ |  |
| [**sourcesPlexRedeemTokenCreate**](SourcesApi.md#sourcesPlexRedeemTokenCreate) | **POST** /sources/plex/redeem_token/ |  |
| [**sourcesPlexRetrieve**](SourcesApi.md#sourcesPlexRetrieve) | **GET** /sources/plex/{slug}/ |  |
| [**sourcesPlexUpdate**](SourcesApi.md#sourcesPlexUpdate) | **PUT** /sources/plex/{slug}/ |  |
| [**sourcesPlexUsedByList**](SourcesApi.md#sourcesPlexUsedByList) | **GET** /sources/plex/{slug}/used_by/ |  |
| [**sourcesSamlCreate**](SourcesApi.md#sourcesSamlCreate) | **POST** /sources/saml/ |  |
| [**sourcesSamlDestroy**](SourcesApi.md#sourcesSamlDestroy) | **DELETE** /sources/saml/{slug}/ |  |
| [**sourcesSamlList**](SourcesApi.md#sourcesSamlList) | **GET** /sources/saml/ |  |
| [**sourcesSamlMetadataRetrieve**](SourcesApi.md#sourcesSamlMetadataRetrieve) | **GET** /sources/saml/{slug}/metadata/ |  |
| [**sourcesSamlPartialUpdate**](SourcesApi.md#sourcesSamlPartialUpdate) | **PATCH** /sources/saml/{slug}/ |  |
| [**sourcesSamlRetrieve**](SourcesApi.md#sourcesSamlRetrieve) | **GET** /sources/saml/{slug}/ |  |
| [**sourcesSamlUpdate**](SourcesApi.md#sourcesSamlUpdate) | **PUT** /sources/saml/{slug}/ |  |
| [**sourcesSamlUsedByList**](SourcesApi.md#sourcesSamlUsedByList) | **GET** /sources/saml/{slug}/used_by/ |  |
| [**sourcesScimCreate**](SourcesApi.md#sourcesScimCreate) | **POST** /sources/scim/ |  |
| [**sourcesScimDestroy**](SourcesApi.md#sourcesScimDestroy) | **DELETE** /sources/scim/{slug}/ |  |
| [**sourcesScimGroupsCreate**](SourcesApi.md#sourcesScimGroupsCreate) | **POST** /sources/scim_groups/ |  |
| [**sourcesScimGroupsDestroy**](SourcesApi.md#sourcesScimGroupsDestroy) | **DELETE** /sources/scim_groups/{id}/ |  |
| [**sourcesScimGroupsList**](SourcesApi.md#sourcesScimGroupsList) | **GET** /sources/scim_groups/ |  |
| [**sourcesScimGroupsPartialUpdate**](SourcesApi.md#sourcesScimGroupsPartialUpdate) | **PATCH** /sources/scim_groups/{id}/ |  |
| [**sourcesScimGroupsRetrieve**](SourcesApi.md#sourcesScimGroupsRetrieve) | **GET** /sources/scim_groups/{id}/ |  |
| [**sourcesScimGroupsUpdate**](SourcesApi.md#sourcesScimGroupsUpdate) | **PUT** /sources/scim_groups/{id}/ |  |
| [**sourcesScimGroupsUsedByList**](SourcesApi.md#sourcesScimGroupsUsedByList) | **GET** /sources/scim_groups/{id}/used_by/ |  |
| [**sourcesScimList**](SourcesApi.md#sourcesScimList) | **GET** /sources/scim/ |  |
| [**sourcesScimPartialUpdate**](SourcesApi.md#sourcesScimPartialUpdate) | **PATCH** /sources/scim/{slug}/ |  |
| [**sourcesScimRetrieve**](SourcesApi.md#sourcesScimRetrieve) | **GET** /sources/scim/{slug}/ |  |
| [**sourcesScimUpdate**](SourcesApi.md#sourcesScimUpdate) | **PUT** /sources/scim/{slug}/ |  |
| [**sourcesScimUsedByList**](SourcesApi.md#sourcesScimUsedByList) | **GET** /sources/scim/{slug}/used_by/ |  |
| [**sourcesScimUsersCreate**](SourcesApi.md#sourcesScimUsersCreate) | **POST** /sources/scim_users/ |  |
| [**sourcesScimUsersDestroy**](SourcesApi.md#sourcesScimUsersDestroy) | **DELETE** /sources/scim_users/{id}/ |  |
| [**sourcesScimUsersList**](SourcesApi.md#sourcesScimUsersList) | **GET** /sources/scim_users/ |  |
| [**sourcesScimUsersPartialUpdate**](SourcesApi.md#sourcesScimUsersPartialUpdate) | **PATCH** /sources/scim_users/{id}/ |  |
| [**sourcesScimUsersRetrieve**](SourcesApi.md#sourcesScimUsersRetrieve) | **GET** /sources/scim_users/{id}/ |  |
| [**sourcesScimUsersUpdate**](SourcesApi.md#sourcesScimUsersUpdate) | **PUT** /sources/scim_users/{id}/ |  |
| [**sourcesScimUsersUsedByList**](SourcesApi.md#sourcesScimUsersUsedByList) | **GET** /sources/scim_users/{id}/used_by/ |  |
| [**sourcesUserConnectionsAllDestroy**](SourcesApi.md#sourcesUserConnectionsAllDestroy) | **DELETE** /sources/user_connections/all/{id}/ |  |
| [**sourcesUserConnectionsAllList**](SourcesApi.md#sourcesUserConnectionsAllList) | **GET** /sources/user_connections/all/ |  |
| [**sourcesUserConnectionsAllPartialUpdate**](SourcesApi.md#sourcesUserConnectionsAllPartialUpdate) | **PATCH** /sources/user_connections/all/{id}/ |  |
| [**sourcesUserConnectionsAllRetrieve**](SourcesApi.md#sourcesUserConnectionsAllRetrieve) | **GET** /sources/user_connections/all/{id}/ |  |
| [**sourcesUserConnectionsAllUpdate**](SourcesApi.md#sourcesUserConnectionsAllUpdate) | **PUT** /sources/user_connections/all/{id}/ |  |
| [**sourcesUserConnectionsAllUsedByList**](SourcesApi.md#sourcesUserConnectionsAllUsedByList) | **GET** /sources/user_connections/all/{id}/used_by/ |  |
| [**sourcesUserConnectionsOauthCreate**](SourcesApi.md#sourcesUserConnectionsOauthCreate) | **POST** /sources/user_connections/oauth/ |  |
| [**sourcesUserConnectionsOauthDestroy**](SourcesApi.md#sourcesUserConnectionsOauthDestroy) | **DELETE** /sources/user_connections/oauth/{id}/ |  |
| [**sourcesUserConnectionsOauthList**](SourcesApi.md#sourcesUserConnectionsOauthList) | **GET** /sources/user_connections/oauth/ |  |
| [**sourcesUserConnectionsOauthPartialUpdate**](SourcesApi.md#sourcesUserConnectionsOauthPartialUpdate) | **PATCH** /sources/user_connections/oauth/{id}/ |  |
| [**sourcesUserConnectionsOauthRetrieve**](SourcesApi.md#sourcesUserConnectionsOauthRetrieve) | **GET** /sources/user_connections/oauth/{id}/ |  |
| [**sourcesUserConnectionsOauthUpdate**](SourcesApi.md#sourcesUserConnectionsOauthUpdate) | **PUT** /sources/user_connections/oauth/{id}/ |  |
| [**sourcesUserConnectionsOauthUsedByList**](SourcesApi.md#sourcesUserConnectionsOauthUsedByList) | **GET** /sources/user_connections/oauth/{id}/used_by/ |  |
| [**sourcesUserConnectionsPlexCreate**](SourcesApi.md#sourcesUserConnectionsPlexCreate) | **POST** /sources/user_connections/plex/ |  |
| [**sourcesUserConnectionsPlexDestroy**](SourcesApi.md#sourcesUserConnectionsPlexDestroy) | **DELETE** /sources/user_connections/plex/{id}/ |  |
| [**sourcesUserConnectionsPlexList**](SourcesApi.md#sourcesUserConnectionsPlexList) | **GET** /sources/user_connections/plex/ |  |
| [**sourcesUserConnectionsPlexPartialUpdate**](SourcesApi.md#sourcesUserConnectionsPlexPartialUpdate) | **PATCH** /sources/user_connections/plex/{id}/ |  |
| [**sourcesUserConnectionsPlexRetrieve**](SourcesApi.md#sourcesUserConnectionsPlexRetrieve) | **GET** /sources/user_connections/plex/{id}/ |  |
| [**sourcesUserConnectionsPlexUpdate**](SourcesApi.md#sourcesUserConnectionsPlexUpdate) | **PUT** /sources/user_connections/plex/{id}/ |  |
| [**sourcesUserConnectionsPlexUsedByList**](SourcesApi.md#sourcesUserConnectionsPlexUsedByList) | **GET** /sources/user_connections/plex/{id}/used_by/ |  |
| [**sourcesUserConnectionsSamlCreate**](SourcesApi.md#sourcesUserConnectionsSamlCreate) | **POST** /sources/user_connections/saml/ |  |
| [**sourcesUserConnectionsSamlDestroy**](SourcesApi.md#sourcesUserConnectionsSamlDestroy) | **DELETE** /sources/user_connections/saml/{id}/ |  |
| [**sourcesUserConnectionsSamlList**](SourcesApi.md#sourcesUserConnectionsSamlList) | **GET** /sources/user_connections/saml/ |  |
| [**sourcesUserConnectionsSamlPartialUpdate**](SourcesApi.md#sourcesUserConnectionsSamlPartialUpdate) | **PATCH** /sources/user_connections/saml/{id}/ |  |
| [**sourcesUserConnectionsSamlRetrieve**](SourcesApi.md#sourcesUserConnectionsSamlRetrieve) | **GET** /sources/user_connections/saml/{id}/ |  |
| [**sourcesUserConnectionsSamlUpdate**](SourcesApi.md#sourcesUserConnectionsSamlUpdate) | **PUT** /sources/user_connections/saml/{id}/ |  |
| [**sourcesUserConnectionsSamlUsedByList**](SourcesApi.md#sourcesUserConnectionsSamlUsedByList) | **GET** /sources/user_connections/saml/{id}/used_by/ |  |


<a id="sourcesAllDestroy"></a>
# **sourcesAllDestroy**
> sourcesAllDestroy(slug)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      apiInstance.sourcesAllDestroy(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesAllDestroy");
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
| **slug** | **String**|  | |

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

<a id="sourcesAllList"></a>
# **sourcesAllList**
> PaginatedSourceList sourcesAllList(managed, name, ordering, page, pageSize, search, slug)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String managed = "managed_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String slug = "slug_example"; // String | 
    try {
      PaginatedSourceList result = apiInstance.sourcesAllList(managed, name, ordering, page, pageSize, search, slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesAllList");
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
| **managed** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **slug** | **String**|  | [optional] |

### Return type

[**PaginatedSourceList**](PaginatedSourceList.md)

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

<a id="sourcesAllRetrieve"></a>
# **sourcesAllRetrieve**
> Source sourcesAllRetrieve(slug)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      Source result = apiInstance.sourcesAllRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesAllRetrieve");
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
| **slug** | **String**|  | |

### Return type

[**Source**](Source.md)

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

<a id="sourcesAllSetIconCreate"></a>
# **sourcesAllSetIconCreate**
> sourcesAllSetIconCreate(slug, _file, clear)



Set source icon

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    Boolean clear = false; // Boolean | 
    try {
      apiInstance.sourcesAllSetIconCreate(slug, _file, clear);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesAllSetIconCreate");
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
| **slug** | **String**|  | |
| **_file** | **File**|  | [optional] |
| **clear** | **Boolean**|  | [optional] [default to false] |

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
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="sourcesAllSetIconUrlCreate"></a>
# **sourcesAllSetIconUrlCreate**
> sourcesAllSetIconUrlCreate(slug, filePathRequest)



Set source icon (as URL)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    FilePathRequest filePathRequest = new FilePathRequest(); // FilePathRequest | 
    try {
      apiInstance.sourcesAllSetIconUrlCreate(slug, filePathRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesAllSetIconUrlCreate");
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
| **slug** | **String**|  | |
| **filePathRequest** | [**FilePathRequest**](FilePathRequest.md)|  | |

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
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="sourcesAllTypesList"></a>
# **sourcesAllTypesList**
> List&lt;TypeCreate&gt; sourcesAllTypesList()



Get all creatable types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    try {
      List<TypeCreate> result = apiInstance.sourcesAllTypesList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesAllTypesList");
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

<a id="sourcesAllUsedByList"></a>
# **sourcesAllUsedByList**
> List&lt;UsedBy&gt; sourcesAllUsedByList(slug)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      List<UsedBy> result = apiInstance.sourcesAllUsedByList(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesAllUsedByList");
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
| **slug** | **String**|  | |

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

<a id="sourcesAllUserSettingsList"></a>
# **sourcesAllUserSettingsList**
> List&lt;UserSetting&gt; sourcesAllUserSettingsList()



Get all sources the user can configure

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    try {
      List<UserSetting> result = apiInstance.sourcesAllUserSettingsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesAllUserSettingsList");
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

[**List&lt;UserSetting&gt;**](UserSetting.md)

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

<a id="sourcesLdapCreate"></a>
# **sourcesLdapCreate**
> LDAPSource sourcesLdapCreate(ldAPSourceRequest)



LDAP Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    LDAPSourceRequest ldAPSourceRequest = new LDAPSourceRequest(); // LDAPSourceRequest | 
    try {
      LDAPSource result = apiInstance.sourcesLdapCreate(ldAPSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesLdapCreate");
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
| **ldAPSourceRequest** | [**LDAPSourceRequest**](LDAPSourceRequest.md)|  | |

### Return type

[**LDAPSource**](LDAPSource.md)

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

<a id="sourcesLdapDebugRetrieve"></a>
# **sourcesLdapDebugRetrieve**
> LDAPDebug sourcesLdapDebugRetrieve(slug)



Get raw LDAP data to debug

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      LDAPDebug result = apiInstance.sourcesLdapDebugRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesLdapDebugRetrieve");
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
| **slug** | **String**|  | |

### Return type

[**LDAPDebug**](LDAPDebug.md)

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

<a id="sourcesLdapDestroy"></a>
# **sourcesLdapDestroy**
> sourcesLdapDestroy(slug)



LDAP Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      apiInstance.sourcesLdapDestroy(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesLdapDestroy");
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
| **slug** | **String**|  | |

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

<a id="sourcesLdapList"></a>
# **sourcesLdapList**
> PaginatedLDAPSourceList sourcesLdapList(additionalGroupDn, additionalUserDn, baseDn, bindCn, clientCertificate, enabled, groupMembershipField, groupObjectFilter, name, objectUniquenessField, ordering, page, pageSize, passwordLoginUpdateInternalPassword, peerCertificate, propertyMappings, propertyMappingsGroup, search, serverUri, slug, sni, startTls, syncGroups, syncParentGroup, syncUsers, syncUsersPassword, userObjectFilter)



LDAP Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String additionalGroupDn = "additionalGroupDn_example"; // String | 
    String additionalUserDn = "additionalUserDn_example"; // String | 
    String baseDn = "baseDn_example"; // String | 
    String bindCn = "bindCn_example"; // String | 
    UUID clientCertificate = UUID.randomUUID(); // UUID | 
    Boolean enabled = true; // Boolean | 
    String groupMembershipField = "groupMembershipField_example"; // String | 
    String groupObjectFilter = "groupObjectFilter_example"; // String | 
    String name = "name_example"; // String | 
    String objectUniquenessField = "objectUniquenessField_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Boolean passwordLoginUpdateInternalPassword = true; // Boolean | 
    UUID peerCertificate = UUID.randomUUID(); // UUID | 
    List<UUID> propertyMappings = Arrays.asList(); // List<UUID> | 
    List<UUID> propertyMappingsGroup = Arrays.asList(); // List<UUID> | 
    String search = "search_example"; // String | A search term.
    String serverUri = "serverUri_example"; // String | 
    String slug = "slug_example"; // String | 
    Boolean sni = true; // Boolean | 
    Boolean startTls = true; // Boolean | 
    Boolean syncGroups = true; // Boolean | 
    UUID syncParentGroup = UUID.randomUUID(); // UUID | 
    Boolean syncUsers = true; // Boolean | 
    Boolean syncUsersPassword = true; // Boolean | 
    String userObjectFilter = "userObjectFilter_example"; // String | 
    try {
      PaginatedLDAPSourceList result = apiInstance.sourcesLdapList(additionalGroupDn, additionalUserDn, baseDn, bindCn, clientCertificate, enabled, groupMembershipField, groupObjectFilter, name, objectUniquenessField, ordering, page, pageSize, passwordLoginUpdateInternalPassword, peerCertificate, propertyMappings, propertyMappingsGroup, search, serverUri, slug, sni, startTls, syncGroups, syncParentGroup, syncUsers, syncUsersPassword, userObjectFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesLdapList");
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
| **additionalGroupDn** | **String**|  | [optional] |
| **additionalUserDn** | **String**|  | [optional] |
| **baseDn** | **String**|  | [optional] |
| **bindCn** | **String**|  | [optional] |
| **clientCertificate** | **UUID**|  | [optional] |
| **enabled** | **Boolean**|  | [optional] |
| **groupMembershipField** | **String**|  | [optional] |
| **groupObjectFilter** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **objectUniquenessField** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **passwordLoginUpdateInternalPassword** | **Boolean**|  | [optional] |
| **peerCertificate** | **UUID**|  | [optional] |
| **propertyMappings** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **propertyMappingsGroup** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **serverUri** | **String**|  | [optional] |
| **slug** | **String**|  | [optional] |
| **sni** | **Boolean**|  | [optional] |
| **startTls** | **Boolean**|  | [optional] |
| **syncGroups** | **Boolean**|  | [optional] |
| **syncParentGroup** | **UUID**|  | [optional] |
| **syncUsers** | **Boolean**|  | [optional] |
| **syncUsersPassword** | **Boolean**|  | [optional] |
| **userObjectFilter** | **String**|  | [optional] |

### Return type

[**PaginatedLDAPSourceList**](PaginatedLDAPSourceList.md)

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

<a id="sourcesLdapPartialUpdate"></a>
# **sourcesLdapPartialUpdate**
> LDAPSource sourcesLdapPartialUpdate(slug, patchedLDAPSourceRequest)



LDAP Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    PatchedLDAPSourceRequest patchedLDAPSourceRequest = new PatchedLDAPSourceRequest(); // PatchedLDAPSourceRequest | 
    try {
      LDAPSource result = apiInstance.sourcesLdapPartialUpdate(slug, patchedLDAPSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesLdapPartialUpdate");
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
| **slug** | **String**|  | |
| **patchedLDAPSourceRequest** | [**PatchedLDAPSourceRequest**](PatchedLDAPSourceRequest.md)|  | [optional] |

### Return type

[**LDAPSource**](LDAPSource.md)

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

<a id="sourcesLdapRetrieve"></a>
# **sourcesLdapRetrieve**
> LDAPSource sourcesLdapRetrieve(slug)



LDAP Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      LDAPSource result = apiInstance.sourcesLdapRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesLdapRetrieve");
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
| **slug** | **String**|  | |

### Return type

[**LDAPSource**](LDAPSource.md)

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

<a id="sourcesLdapSyncStatusRetrieve"></a>
# **sourcesLdapSyncStatusRetrieve**
> SyncStatus sourcesLdapSyncStatusRetrieve(slug)



Get source&#39;s sync status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      SyncStatus result = apiInstance.sourcesLdapSyncStatusRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesLdapSyncStatusRetrieve");
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
| **slug** | **String**|  | |

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
| **400** |  |  -  |
| **403** |  |  -  |

<a id="sourcesLdapUpdate"></a>
# **sourcesLdapUpdate**
> LDAPSource sourcesLdapUpdate(slug, ldAPSourceRequest)



LDAP Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    LDAPSourceRequest ldAPSourceRequest = new LDAPSourceRequest(); // LDAPSourceRequest | 
    try {
      LDAPSource result = apiInstance.sourcesLdapUpdate(slug, ldAPSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesLdapUpdate");
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
| **slug** | **String**|  | |
| **ldAPSourceRequest** | [**LDAPSourceRequest**](LDAPSourceRequest.md)|  | |

### Return type

[**LDAPSource**](LDAPSource.md)

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

<a id="sourcesLdapUsedByList"></a>
# **sourcesLdapUsedByList**
> List&lt;UsedBy&gt; sourcesLdapUsedByList(slug)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      List<UsedBy> result = apiInstance.sourcesLdapUsedByList(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesLdapUsedByList");
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
| **slug** | **String**|  | |

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

<a id="sourcesOauthCreate"></a>
# **sourcesOauthCreate**
> OAuthSource sourcesOauthCreate(oauthSourceRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    OAuthSourceRequest oauthSourceRequest = new OAuthSourceRequest(); // OAuthSourceRequest | 
    try {
      OAuthSource result = apiInstance.sourcesOauthCreate(oauthSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesOauthCreate");
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
| **oauthSourceRequest** | [**OAuthSourceRequest**](OAuthSourceRequest.md)|  | |

### Return type

[**OAuthSource**](OAuthSource.md)

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

<a id="sourcesOauthDestroy"></a>
# **sourcesOauthDestroy**
> sourcesOauthDestroy(slug)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      apiInstance.sourcesOauthDestroy(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesOauthDestroy");
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
| **slug** | **String**|  | |

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

<a id="sourcesOauthList"></a>
# **sourcesOauthList**
> PaginatedOAuthSourceList sourcesOauthList(accessTokenUrl, additionalScopes, authenticationFlow, authorizationUrl, consumerKey, enabled, enrollmentFlow, hasJwks, name, ordering, page, pageSize, policyEngineMode, profileUrl, providerType, requestTokenUrl, search, slug, userMatchingMode)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String accessTokenUrl = "accessTokenUrl_example"; // String | 
    String additionalScopes = "additionalScopes_example"; // String | 
    UUID authenticationFlow = UUID.randomUUID(); // UUID | 
    String authorizationUrl = "authorizationUrl_example"; // String | 
    String consumerKey = "consumerKey_example"; // String | 
    Boolean enabled = true; // Boolean | 
    UUID enrollmentFlow = UUID.randomUUID(); // UUID | 
    Boolean hasJwks = true; // Boolean | Only return sources with JWKS data
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String policyEngineMode = "all"; // String | 
    String profileUrl = "profileUrl_example"; // String | 
    String providerType = "providerType_example"; // String | 
    String requestTokenUrl = "requestTokenUrl_example"; // String | 
    String search = "search_example"; // String | A search term.
    String slug = "slug_example"; // String | 
    String userMatchingMode = "email_deny"; // String | How the source determines if an existing user should be authenticated or a new user enrolled.  
    try {
      PaginatedOAuthSourceList result = apiInstance.sourcesOauthList(accessTokenUrl, additionalScopes, authenticationFlow, authorizationUrl, consumerKey, enabled, enrollmentFlow, hasJwks, name, ordering, page, pageSize, policyEngineMode, profileUrl, providerType, requestTokenUrl, search, slug, userMatchingMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesOauthList");
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
| **accessTokenUrl** | **String**|  | [optional] |
| **additionalScopes** | **String**|  | [optional] |
| **authenticationFlow** | **UUID**|  | [optional] |
| **authorizationUrl** | **String**|  | [optional] |
| **consumerKey** | **String**|  | [optional] |
| **enabled** | **Boolean**|  | [optional] |
| **enrollmentFlow** | **UUID**|  | [optional] |
| **hasJwks** | **Boolean**| Only return sources with JWKS data | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **policyEngineMode** | **String**|  | [optional] [enum: all, any] |
| **profileUrl** | **String**|  | [optional] |
| **providerType** | **String**|  | [optional] |
| **requestTokenUrl** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **slug** | **String**|  | [optional] |
| **userMatchingMode** | **String**| How the source determines if an existing user should be authenticated or a new user enrolled.   | [optional] [enum: email_deny, email_link, identifier, username_deny, username_link] |

### Return type

[**PaginatedOAuthSourceList**](PaginatedOAuthSourceList.md)

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

<a id="sourcesOauthPartialUpdate"></a>
# **sourcesOauthPartialUpdate**
> OAuthSource sourcesOauthPartialUpdate(slug, patchedOAuthSourceRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    PatchedOAuthSourceRequest patchedOAuthSourceRequest = new PatchedOAuthSourceRequest(); // PatchedOAuthSourceRequest | 
    try {
      OAuthSource result = apiInstance.sourcesOauthPartialUpdate(slug, patchedOAuthSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesOauthPartialUpdate");
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
| **slug** | **String**|  | |
| **patchedOAuthSourceRequest** | [**PatchedOAuthSourceRequest**](PatchedOAuthSourceRequest.md)|  | [optional] |

### Return type

[**OAuthSource**](OAuthSource.md)

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

<a id="sourcesOauthRetrieve"></a>
# **sourcesOauthRetrieve**
> OAuthSource sourcesOauthRetrieve(slug)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      OAuthSource result = apiInstance.sourcesOauthRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesOauthRetrieve");
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
| **slug** | **String**|  | |

### Return type

[**OAuthSource**](OAuthSource.md)

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

<a id="sourcesOauthSourceTypesList"></a>
# **sourcesOauthSourceTypesList**
> List&lt;SourceType&gt; sourcesOauthSourceTypesList(name)



Get all creatable source types. If ?name is set, only returns the type for &lt;name&gt;. If &lt;name&gt; isn&#39;t found, returns the default type.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      List<SourceType> result = apiInstance.sourcesOauthSourceTypesList(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesOauthSourceTypesList");
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
| **name** | **String**|  | [optional] |

### Return type

[**List&lt;SourceType&gt;**](SourceType.md)

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

<a id="sourcesOauthUpdate"></a>
# **sourcesOauthUpdate**
> OAuthSource sourcesOauthUpdate(slug, oauthSourceRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    OAuthSourceRequest oauthSourceRequest = new OAuthSourceRequest(); // OAuthSourceRequest | 
    try {
      OAuthSource result = apiInstance.sourcesOauthUpdate(slug, oauthSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesOauthUpdate");
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
| **slug** | **String**|  | |
| **oauthSourceRequest** | [**OAuthSourceRequest**](OAuthSourceRequest.md)|  | |

### Return type

[**OAuthSource**](OAuthSource.md)

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

<a id="sourcesOauthUsedByList"></a>
# **sourcesOauthUsedByList**
> List&lt;UsedBy&gt; sourcesOauthUsedByList(slug)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      List<UsedBy> result = apiInstance.sourcesOauthUsedByList(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesOauthUsedByList");
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
| **slug** | **String**|  | |

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

<a id="sourcesPlexCreate"></a>
# **sourcesPlexCreate**
> PlexSource sourcesPlexCreate(plexSourceRequest)



Plex source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    PlexSourceRequest plexSourceRequest = new PlexSourceRequest(); // PlexSourceRequest | 
    try {
      PlexSource result = apiInstance.sourcesPlexCreate(plexSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesPlexCreate");
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
| **plexSourceRequest** | [**PlexSourceRequest**](PlexSourceRequest.md)|  | |

### Return type

[**PlexSource**](PlexSource.md)

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

<a id="sourcesPlexDestroy"></a>
# **sourcesPlexDestroy**
> sourcesPlexDestroy(slug)



Plex source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      apiInstance.sourcesPlexDestroy(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesPlexDestroy");
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
| **slug** | **String**|  | |

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

<a id="sourcesPlexList"></a>
# **sourcesPlexList**
> PaginatedPlexSourceList sourcesPlexList(allowFriends, authenticationFlow, clientId, enabled, enrollmentFlow, name, ordering, page, pageSize, policyEngineMode, search, slug, userMatchingMode)



Plex source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Boolean allowFriends = true; // Boolean | 
    UUID authenticationFlow = UUID.randomUUID(); // UUID | 
    String clientId = "clientId_example"; // String | 
    Boolean enabled = true; // Boolean | 
    UUID enrollmentFlow = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String policyEngineMode = "all"; // String | 
    String search = "search_example"; // String | A search term.
    String slug = "slug_example"; // String | 
    String userMatchingMode = "email_deny"; // String | How the source determines if an existing user should be authenticated or a new user enrolled.  
    try {
      PaginatedPlexSourceList result = apiInstance.sourcesPlexList(allowFriends, authenticationFlow, clientId, enabled, enrollmentFlow, name, ordering, page, pageSize, policyEngineMode, search, slug, userMatchingMode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesPlexList");
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
| **allowFriends** | **Boolean**|  | [optional] |
| **authenticationFlow** | **UUID**|  | [optional] |
| **clientId** | **String**|  | [optional] |
| **enabled** | **Boolean**|  | [optional] |
| **enrollmentFlow** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **policyEngineMode** | **String**|  | [optional] [enum: all, any] |
| **search** | **String**| A search term. | [optional] |
| **slug** | **String**|  | [optional] |
| **userMatchingMode** | **String**| How the source determines if an existing user should be authenticated or a new user enrolled.   | [optional] [enum: email_deny, email_link, identifier, username_deny, username_link] |

### Return type

[**PaginatedPlexSourceList**](PaginatedPlexSourceList.md)

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

<a id="sourcesPlexPartialUpdate"></a>
# **sourcesPlexPartialUpdate**
> PlexSource sourcesPlexPartialUpdate(slug, patchedPlexSourceRequest)



Plex source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    PatchedPlexSourceRequest patchedPlexSourceRequest = new PatchedPlexSourceRequest(); // PatchedPlexSourceRequest | 
    try {
      PlexSource result = apiInstance.sourcesPlexPartialUpdate(slug, patchedPlexSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesPlexPartialUpdate");
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
| **slug** | **String**|  | |
| **patchedPlexSourceRequest** | [**PatchedPlexSourceRequest**](PatchedPlexSourceRequest.md)|  | [optional] |

### Return type

[**PlexSource**](PlexSource.md)

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

<a id="sourcesPlexRedeemTokenAuthenticatedCreate"></a>
# **sourcesPlexRedeemTokenAuthenticatedCreate**
> sourcesPlexRedeemTokenAuthenticatedCreate(plexTokenRedeemRequest, slug)



Redeem a plex token for an authenticated user, creating a connection

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    PlexTokenRedeemRequest plexTokenRedeemRequest = new PlexTokenRedeemRequest(); // PlexTokenRedeemRequest | 
    String slug = "slug_example"; // String | 
    try {
      apiInstance.sourcesPlexRedeemTokenAuthenticatedCreate(plexTokenRedeemRequest, slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesPlexRedeemTokenAuthenticatedCreate");
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
| **plexTokenRedeemRequest** | [**PlexTokenRedeemRequest**](PlexTokenRedeemRequest.md)|  | |
| **slug** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** | Token not found |  -  |
| **403** | Access denied |  -  |

<a id="sourcesPlexRedeemTokenCreate"></a>
# **sourcesPlexRedeemTokenCreate**
> RedirectChallenge sourcesPlexRedeemTokenCreate(plexTokenRedeemRequest, slug)



Redeem a plex token, check it&#39;s access to resources against what&#39;s allowed for the source, and redirect to an authentication/enrollment flow.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    PlexTokenRedeemRequest plexTokenRedeemRequest = new PlexTokenRedeemRequest(); // PlexTokenRedeemRequest | 
    String slug = "slug_example"; // String | 
    try {
      RedirectChallenge result = apiInstance.sourcesPlexRedeemTokenCreate(plexTokenRedeemRequest, slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesPlexRedeemTokenCreate");
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
| **plexTokenRedeemRequest** | [**PlexTokenRedeemRequest**](PlexTokenRedeemRequest.md)|  | |
| **slug** | **String**|  | [optional] |

### Return type

[**RedirectChallenge**](RedirectChallenge.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Token not found |  -  |
| **403** | Access denied |  -  |

<a id="sourcesPlexRetrieve"></a>
# **sourcesPlexRetrieve**
> PlexSource sourcesPlexRetrieve(slug)



Plex source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      PlexSource result = apiInstance.sourcesPlexRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesPlexRetrieve");
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
| **slug** | **String**|  | |

### Return type

[**PlexSource**](PlexSource.md)

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

<a id="sourcesPlexUpdate"></a>
# **sourcesPlexUpdate**
> PlexSource sourcesPlexUpdate(slug, plexSourceRequest)



Plex source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    PlexSourceRequest plexSourceRequest = new PlexSourceRequest(); // PlexSourceRequest | 
    try {
      PlexSource result = apiInstance.sourcesPlexUpdate(slug, plexSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesPlexUpdate");
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
| **slug** | **String**|  | |
| **plexSourceRequest** | [**PlexSourceRequest**](PlexSourceRequest.md)|  | |

### Return type

[**PlexSource**](PlexSource.md)

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

<a id="sourcesPlexUsedByList"></a>
# **sourcesPlexUsedByList**
> List&lt;UsedBy&gt; sourcesPlexUsedByList(slug)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      List<UsedBy> result = apiInstance.sourcesPlexUsedByList(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesPlexUsedByList");
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
| **slug** | **String**|  | |

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

<a id="sourcesSamlCreate"></a>
# **sourcesSamlCreate**
> SAMLSource sourcesSamlCreate(saMLSourceRequest)



SAMLSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    SAMLSourceRequest saMLSourceRequest = new SAMLSourceRequest(); // SAMLSourceRequest | 
    try {
      SAMLSource result = apiInstance.sourcesSamlCreate(saMLSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesSamlCreate");
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
| **saMLSourceRequest** | [**SAMLSourceRequest**](SAMLSourceRequest.md)|  | |

### Return type

[**SAMLSource**](SAMLSource.md)

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

<a id="sourcesSamlDestroy"></a>
# **sourcesSamlDestroy**
> sourcesSamlDestroy(slug)



SAMLSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      apiInstance.sourcesSamlDestroy(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesSamlDestroy");
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
| **slug** | **String**|  | |

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

<a id="sourcesSamlList"></a>
# **sourcesSamlList**
> PaginatedSAMLSourceList sourcesSamlList(allowIdpInitiated, authenticationFlow, bindingType, digestAlgorithm, enabled, enrollmentFlow, issuer, managed, name, nameIdPolicy, ordering, page, pageSize, policyEngineMode, preAuthenticationFlow, search, signatureAlgorithm, signingKp, sloUrl, slug, ssoUrl, temporaryUserDeleteAfter, userMatchingMode, verificationKp)



SAMLSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Boolean allowIdpInitiated = true; // Boolean | 
    UUID authenticationFlow = UUID.randomUUID(); // UUID | 
    String bindingType = "POST"; // String | 
    String digestAlgorithm = "http://www.w3.org/2000/09/xmldsig#sha1"; // String | 
    Boolean enabled = true; // Boolean | 
    UUID enrollmentFlow = UUID.randomUUID(); // UUID | 
    String issuer = "issuer_example"; // String | 
    String managed = "managed_example"; // String | 
    String name = "name_example"; // String | 
    String nameIdPolicy = "urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress"; // String | NameID Policy sent to the IdP. Can be unset, in which case no Policy is sent.  
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String policyEngineMode = "all"; // String | 
    UUID preAuthenticationFlow = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    String signatureAlgorithm = "http://www.w3.org/2000/09/xmldsig#dsa-sha1"; // String | 
    UUID signingKp = UUID.randomUUID(); // UUID | 
    String sloUrl = "sloUrl_example"; // String | 
    String slug = "slug_example"; // String | 
    String ssoUrl = "ssoUrl_example"; // String | 
    String temporaryUserDeleteAfter = "temporaryUserDeleteAfter_example"; // String | 
    String userMatchingMode = "email_deny"; // String | How the source determines if an existing user should be authenticated or a new user enrolled.  
    UUID verificationKp = UUID.randomUUID(); // UUID | 
    try {
      PaginatedSAMLSourceList result = apiInstance.sourcesSamlList(allowIdpInitiated, authenticationFlow, bindingType, digestAlgorithm, enabled, enrollmentFlow, issuer, managed, name, nameIdPolicy, ordering, page, pageSize, policyEngineMode, preAuthenticationFlow, search, signatureAlgorithm, signingKp, sloUrl, slug, ssoUrl, temporaryUserDeleteAfter, userMatchingMode, verificationKp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesSamlList");
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
| **allowIdpInitiated** | **Boolean**|  | [optional] |
| **authenticationFlow** | **UUID**|  | [optional] |
| **bindingType** | **String**|  | [optional] [enum: POST, POST_AUTO, REDIRECT] |
| **digestAlgorithm** | **String**|  | [optional] [enum: http://www.w3.org/2000/09/xmldsig#sha1, http://www.w3.org/2001/04/xmldsig-more#sha384, http://www.w3.org/2001/04/xmlenc#sha256, http://www.w3.org/2001/04/xmlenc#sha512] |
| **enabled** | **Boolean**|  | [optional] |
| **enrollmentFlow** | **UUID**|  | [optional] |
| **issuer** | **String**|  | [optional] |
| **managed** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **nameIdPolicy** | **String**| NameID Policy sent to the IdP. Can be unset, in which case no Policy is sent.   | [optional] [enum: urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress, urn:oasis:names:tc:SAML:2.0:nameid-format:WindowsDomainQualifiedName, urn:oasis:names:tc:SAML:2.0:nameid-format:X509SubjectName, urn:oasis:names:tc:SAML:2.0:nameid-format:persistent, urn:oasis:names:tc:SAML:2.0:nameid-format:transient] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **policyEngineMode** | **String**|  | [optional] [enum: all, any] |
| **preAuthenticationFlow** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **signatureAlgorithm** | **String**|  | [optional] [enum: http://www.w3.org/2000/09/xmldsig#dsa-sha1, http://www.w3.org/2000/09/xmldsig#rsa-sha1, http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1, http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256, http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384, http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512, http://www.w3.org/2001/04/xmldsig-more#rsa-sha256, http://www.w3.org/2001/04/xmldsig-more#rsa-sha384, http://www.w3.org/2001/04/xmldsig-more#rsa-sha512] |
| **signingKp** | **UUID**|  | [optional] |
| **sloUrl** | **String**|  | [optional] |
| **slug** | **String**|  | [optional] |
| **ssoUrl** | **String**|  | [optional] |
| **temporaryUserDeleteAfter** | **String**|  | [optional] |
| **userMatchingMode** | **String**| How the source determines if an existing user should be authenticated or a new user enrolled.   | [optional] [enum: email_deny, email_link, identifier, username_deny, username_link] |
| **verificationKp** | **UUID**|  | [optional] |

### Return type

[**PaginatedSAMLSourceList**](PaginatedSAMLSourceList.md)

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

<a id="sourcesSamlMetadataRetrieve"></a>
# **sourcesSamlMetadataRetrieve**
> SAMLMetadata sourcesSamlMetadataRetrieve(slug)



Return metadata as XML string

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      SAMLMetadata result = apiInstance.sourcesSamlMetadataRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesSamlMetadataRetrieve");
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
| **slug** | **String**|  | |

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
| **400** |  |  -  |
| **403** |  |  -  |

<a id="sourcesSamlPartialUpdate"></a>
# **sourcesSamlPartialUpdate**
> SAMLSource sourcesSamlPartialUpdate(slug, patchedSAMLSourceRequest)



SAMLSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    PatchedSAMLSourceRequest patchedSAMLSourceRequest = new PatchedSAMLSourceRequest(); // PatchedSAMLSourceRequest | 
    try {
      SAMLSource result = apiInstance.sourcesSamlPartialUpdate(slug, patchedSAMLSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesSamlPartialUpdate");
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
| **slug** | **String**|  | |
| **patchedSAMLSourceRequest** | [**PatchedSAMLSourceRequest**](PatchedSAMLSourceRequest.md)|  | [optional] |

### Return type

[**SAMLSource**](SAMLSource.md)

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

<a id="sourcesSamlRetrieve"></a>
# **sourcesSamlRetrieve**
> SAMLSource sourcesSamlRetrieve(slug)



SAMLSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      SAMLSource result = apiInstance.sourcesSamlRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesSamlRetrieve");
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
| **slug** | **String**|  | |

### Return type

[**SAMLSource**](SAMLSource.md)

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

<a id="sourcesSamlUpdate"></a>
# **sourcesSamlUpdate**
> SAMLSource sourcesSamlUpdate(slug, saMLSourceRequest)



SAMLSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    SAMLSourceRequest saMLSourceRequest = new SAMLSourceRequest(); // SAMLSourceRequest | 
    try {
      SAMLSource result = apiInstance.sourcesSamlUpdate(slug, saMLSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesSamlUpdate");
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
| **slug** | **String**|  | |
| **saMLSourceRequest** | [**SAMLSourceRequest**](SAMLSourceRequest.md)|  | |

### Return type

[**SAMLSource**](SAMLSource.md)

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

<a id="sourcesSamlUsedByList"></a>
# **sourcesSamlUsedByList**
> List&lt;UsedBy&gt; sourcesSamlUsedByList(slug)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      List<UsedBy> result = apiInstance.sourcesSamlUsedByList(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesSamlUsedByList");
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
| **slug** | **String**|  | |

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

<a id="sourcesScimCreate"></a>
# **sourcesScimCreate**
> SCIMSource sourcesScimCreate(scIMSourceRequest)



SCIMSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    SCIMSourceRequest scIMSourceRequest = new SCIMSourceRequest(); // SCIMSourceRequest | 
    try {
      SCIMSource result = apiInstance.sourcesScimCreate(scIMSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimCreate");
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
| **scIMSourceRequest** | [**SCIMSourceRequest**](SCIMSourceRequest.md)|  | |

### Return type

[**SCIMSource**](SCIMSource.md)

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

<a id="sourcesScimDestroy"></a>
# **sourcesScimDestroy**
> sourcesScimDestroy(slug)



SCIMSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      apiInstance.sourcesScimDestroy(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimDestroy");
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
| **slug** | **String**|  | |

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

<a id="sourcesScimGroupsCreate"></a>
# **sourcesScimGroupsCreate**
> SCIMSourceGroup sourcesScimGroupsCreate(scIMSourceGroupRequest)



SCIMSourceGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    SCIMSourceGroupRequest scIMSourceGroupRequest = new SCIMSourceGroupRequest(); // SCIMSourceGroupRequest | 
    try {
      SCIMSourceGroup result = apiInstance.sourcesScimGroupsCreate(scIMSourceGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimGroupsCreate");
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
| **scIMSourceGroupRequest** | [**SCIMSourceGroupRequest**](SCIMSourceGroupRequest.md)|  | |

### Return type

[**SCIMSourceGroup**](SCIMSourceGroup.md)

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

<a id="sourcesScimGroupsDestroy"></a>
# **sourcesScimGroupsDestroy**
> sourcesScimGroupsDestroy(id)



SCIMSourceGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source group.
    try {
      apiInstance.sourcesScimGroupsDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimGroupsDestroy");
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
| **id** | **String**| A unique value identifying this scim source group. | |

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

<a id="sourcesScimGroupsList"></a>
# **sourcesScimGroupsList**
> PaginatedSCIMSourceGroupList sourcesScimGroupsList(groupGroupUuid, groupName, ordering, page, pageSize, search, sourceSlug)



SCIMSourceGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    UUID groupGroupUuid = UUID.randomUUID(); // UUID | 
    String groupName = "groupName_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String sourceSlug = "sourceSlug_example"; // String | 
    try {
      PaginatedSCIMSourceGroupList result = apiInstance.sourcesScimGroupsList(groupGroupUuid, groupName, ordering, page, pageSize, search, sourceSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimGroupsList");
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
| **search** | **String**| A search term. | [optional] |
| **sourceSlug** | **String**|  | [optional] |

### Return type

[**PaginatedSCIMSourceGroupList**](PaginatedSCIMSourceGroupList.md)

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

<a id="sourcesScimGroupsPartialUpdate"></a>
# **sourcesScimGroupsPartialUpdate**
> SCIMSourceGroup sourcesScimGroupsPartialUpdate(id, patchedSCIMSourceGroupRequest)



SCIMSourceGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source group.
    PatchedSCIMSourceGroupRequest patchedSCIMSourceGroupRequest = new PatchedSCIMSourceGroupRequest(); // PatchedSCIMSourceGroupRequest | 
    try {
      SCIMSourceGroup result = apiInstance.sourcesScimGroupsPartialUpdate(id, patchedSCIMSourceGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimGroupsPartialUpdate");
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
| **id** | **String**| A unique value identifying this scim source group. | |
| **patchedSCIMSourceGroupRequest** | [**PatchedSCIMSourceGroupRequest**](PatchedSCIMSourceGroupRequest.md)|  | [optional] |

### Return type

[**SCIMSourceGroup**](SCIMSourceGroup.md)

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

<a id="sourcesScimGroupsRetrieve"></a>
# **sourcesScimGroupsRetrieve**
> SCIMSourceGroup sourcesScimGroupsRetrieve(id)



SCIMSourceGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source group.
    try {
      SCIMSourceGroup result = apiInstance.sourcesScimGroupsRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimGroupsRetrieve");
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
| **id** | **String**| A unique value identifying this scim source group. | |

### Return type

[**SCIMSourceGroup**](SCIMSourceGroup.md)

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

<a id="sourcesScimGroupsUpdate"></a>
# **sourcesScimGroupsUpdate**
> SCIMSourceGroup sourcesScimGroupsUpdate(id, scIMSourceGroupRequest)



SCIMSourceGroup Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source group.
    SCIMSourceGroupRequest scIMSourceGroupRequest = new SCIMSourceGroupRequest(); // SCIMSourceGroupRequest | 
    try {
      SCIMSourceGroup result = apiInstance.sourcesScimGroupsUpdate(id, scIMSourceGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimGroupsUpdate");
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
| **id** | **String**| A unique value identifying this scim source group. | |
| **scIMSourceGroupRequest** | [**SCIMSourceGroupRequest**](SCIMSourceGroupRequest.md)|  | |

### Return type

[**SCIMSourceGroup**](SCIMSourceGroup.md)

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

<a id="sourcesScimGroupsUsedByList"></a>
# **sourcesScimGroupsUsedByList**
> List&lt;UsedBy&gt; sourcesScimGroupsUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source group.
    try {
      List<UsedBy> result = apiInstance.sourcesScimGroupsUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimGroupsUsedByList");
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
| **id** | **String**| A unique value identifying this scim source group. | |

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

<a id="sourcesScimList"></a>
# **sourcesScimList**
> PaginatedSCIMSourceList sourcesScimList(name, ordering, page, pageSize, search, slug)



SCIMSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String slug = "slug_example"; // String | 
    try {
      PaginatedSCIMSourceList result = apiInstance.sourcesScimList(name, ordering, page, pageSize, search, slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimList");
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
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **slug** | **String**|  | [optional] |

### Return type

[**PaginatedSCIMSourceList**](PaginatedSCIMSourceList.md)

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

<a id="sourcesScimPartialUpdate"></a>
# **sourcesScimPartialUpdate**
> SCIMSource sourcesScimPartialUpdate(slug, patchedSCIMSourceRequest)



SCIMSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    PatchedSCIMSourceRequest patchedSCIMSourceRequest = new PatchedSCIMSourceRequest(); // PatchedSCIMSourceRequest | 
    try {
      SCIMSource result = apiInstance.sourcesScimPartialUpdate(slug, patchedSCIMSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimPartialUpdate");
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
| **slug** | **String**|  | |
| **patchedSCIMSourceRequest** | [**PatchedSCIMSourceRequest**](PatchedSCIMSourceRequest.md)|  | [optional] |

### Return type

[**SCIMSource**](SCIMSource.md)

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

<a id="sourcesScimRetrieve"></a>
# **sourcesScimRetrieve**
> SCIMSource sourcesScimRetrieve(slug)



SCIMSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      SCIMSource result = apiInstance.sourcesScimRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimRetrieve");
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
| **slug** | **String**|  | |

### Return type

[**SCIMSource**](SCIMSource.md)

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

<a id="sourcesScimUpdate"></a>
# **sourcesScimUpdate**
> SCIMSource sourcesScimUpdate(slug, scIMSourceRequest)



SCIMSource Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    SCIMSourceRequest scIMSourceRequest = new SCIMSourceRequest(); // SCIMSourceRequest | 
    try {
      SCIMSource result = apiInstance.sourcesScimUpdate(slug, scIMSourceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimUpdate");
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
| **slug** | **String**|  | |
| **scIMSourceRequest** | [**SCIMSourceRequest**](SCIMSourceRequest.md)|  | |

### Return type

[**SCIMSource**](SCIMSource.md)

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

<a id="sourcesScimUsedByList"></a>
# **sourcesScimUsedByList**
> List&lt;UsedBy&gt; sourcesScimUsedByList(slug)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      List<UsedBy> result = apiInstance.sourcesScimUsedByList(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimUsedByList");
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
| **slug** | **String**|  | |

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

<a id="sourcesScimUsersCreate"></a>
# **sourcesScimUsersCreate**
> SCIMSourceUser sourcesScimUsersCreate(scIMSourceUserRequest)



SCIMSourceUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    SCIMSourceUserRequest scIMSourceUserRequest = new SCIMSourceUserRequest(); // SCIMSourceUserRequest | 
    try {
      SCIMSourceUser result = apiInstance.sourcesScimUsersCreate(scIMSourceUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimUsersCreate");
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
| **scIMSourceUserRequest** | [**SCIMSourceUserRequest**](SCIMSourceUserRequest.md)|  | |

### Return type

[**SCIMSourceUser**](SCIMSourceUser.md)

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

<a id="sourcesScimUsersDestroy"></a>
# **sourcesScimUsersDestroy**
> sourcesScimUsersDestroy(id)



SCIMSourceUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source user.
    try {
      apiInstance.sourcesScimUsersDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimUsersDestroy");
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
| **id** | **String**| A unique value identifying this scim source user. | |

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

<a id="sourcesScimUsersList"></a>
# **sourcesScimUsersList**
> PaginatedSCIMSourceUserList sourcesScimUsersList(ordering, page, pageSize, search, sourceSlug, userId, userUsername)



SCIMSourceUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String sourceSlug = "sourceSlug_example"; // String | 
    Integer userId = 56; // Integer | 
    String userUsername = "userUsername_example"; // String | 
    try {
      PaginatedSCIMSourceUserList result = apiInstance.sourcesScimUsersList(ordering, page, pageSize, search, sourceSlug, userId, userUsername);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimUsersList");
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
| **search** | **String**| A search term. | [optional] |
| **sourceSlug** | **String**|  | [optional] |
| **userId** | **Integer**|  | [optional] |
| **userUsername** | **String**|  | [optional] |

### Return type

[**PaginatedSCIMSourceUserList**](PaginatedSCIMSourceUserList.md)

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

<a id="sourcesScimUsersPartialUpdate"></a>
# **sourcesScimUsersPartialUpdate**
> SCIMSourceUser sourcesScimUsersPartialUpdate(id, patchedSCIMSourceUserRequest)



SCIMSourceUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source user.
    PatchedSCIMSourceUserRequest patchedSCIMSourceUserRequest = new PatchedSCIMSourceUserRequest(); // PatchedSCIMSourceUserRequest | 
    try {
      SCIMSourceUser result = apiInstance.sourcesScimUsersPartialUpdate(id, patchedSCIMSourceUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimUsersPartialUpdate");
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
| **id** | **String**| A unique value identifying this scim source user. | |
| **patchedSCIMSourceUserRequest** | [**PatchedSCIMSourceUserRequest**](PatchedSCIMSourceUserRequest.md)|  | [optional] |

### Return type

[**SCIMSourceUser**](SCIMSourceUser.md)

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

<a id="sourcesScimUsersRetrieve"></a>
# **sourcesScimUsersRetrieve**
> SCIMSourceUser sourcesScimUsersRetrieve(id)



SCIMSourceUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source user.
    try {
      SCIMSourceUser result = apiInstance.sourcesScimUsersRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimUsersRetrieve");
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
| **id** | **String**| A unique value identifying this scim source user. | |

### Return type

[**SCIMSourceUser**](SCIMSourceUser.md)

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

<a id="sourcesScimUsersUpdate"></a>
# **sourcesScimUsersUpdate**
> SCIMSourceUser sourcesScimUsersUpdate(id, scIMSourceUserRequest)



SCIMSourceUser Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source user.
    SCIMSourceUserRequest scIMSourceUserRequest = new SCIMSourceUserRequest(); // SCIMSourceUserRequest | 
    try {
      SCIMSourceUser result = apiInstance.sourcesScimUsersUpdate(id, scIMSourceUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimUsersUpdate");
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
| **id** | **String**| A unique value identifying this scim source user. | |
| **scIMSourceUserRequest** | [**SCIMSourceUserRequest**](SCIMSourceUserRequest.md)|  | |

### Return type

[**SCIMSourceUser**](SCIMSourceUser.md)

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

<a id="sourcesScimUsersUsedByList"></a>
# **sourcesScimUsersUsedByList**
> List&lt;UsedBy&gt; sourcesScimUsersUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String id = "id_example"; // String | A unique value identifying this scim source user.
    try {
      List<UsedBy> result = apiInstance.sourcesScimUsersUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesScimUsersUsedByList");
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
| **id** | **String**| A unique value identifying this scim source user. | |

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

<a id="sourcesUserConnectionsAllDestroy"></a>
# **sourcesUserConnectionsAllDestroy**
> sourcesUserConnectionsAllDestroy(id)



User-source connection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this user source connection.
    try {
      apiInstance.sourcesUserConnectionsAllDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsAllDestroy");
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
| **id** | **Integer**| A unique integer value identifying this user source connection. | |

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

<a id="sourcesUserConnectionsAllList"></a>
# **sourcesUserConnectionsAllList**
> PaginatedUserSourceConnectionList sourcesUserConnectionsAllList(ordering, page, pageSize, search, user)



User-source connection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    Integer user = 56; // Integer | 
    try {
      PaginatedUserSourceConnectionList result = apiInstance.sourcesUserConnectionsAllList(ordering, page, pageSize, search, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsAllList");
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
| **search** | **String**| A search term. | [optional] |
| **user** | **Integer**|  | [optional] |

### Return type

[**PaginatedUserSourceConnectionList**](PaginatedUserSourceConnectionList.md)

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

<a id="sourcesUserConnectionsAllPartialUpdate"></a>
# **sourcesUserConnectionsAllPartialUpdate**
> UserSourceConnection sourcesUserConnectionsAllPartialUpdate(id)



User-source connection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this user source connection.
    try {
      UserSourceConnection result = apiInstance.sourcesUserConnectionsAllPartialUpdate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsAllPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this user source connection. | |

### Return type

[**UserSourceConnection**](UserSourceConnection.md)

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

<a id="sourcesUserConnectionsAllRetrieve"></a>
# **sourcesUserConnectionsAllRetrieve**
> UserSourceConnection sourcesUserConnectionsAllRetrieve(id)



User-source connection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this user source connection.
    try {
      UserSourceConnection result = apiInstance.sourcesUserConnectionsAllRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsAllRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this user source connection. | |

### Return type

[**UserSourceConnection**](UserSourceConnection.md)

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

<a id="sourcesUserConnectionsAllUpdate"></a>
# **sourcesUserConnectionsAllUpdate**
> UserSourceConnection sourcesUserConnectionsAllUpdate(id)



User-source connection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this user source connection.
    try {
      UserSourceConnection result = apiInstance.sourcesUserConnectionsAllUpdate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsAllUpdate");
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
| **id** | **Integer**| A unique integer value identifying this user source connection. | |

### Return type

[**UserSourceConnection**](UserSourceConnection.md)

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

<a id="sourcesUserConnectionsAllUsedByList"></a>
# **sourcesUserConnectionsAllUsedByList**
> List&lt;UsedBy&gt; sourcesUserConnectionsAllUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this user source connection.
    try {
      List<UsedBy> result = apiInstance.sourcesUserConnectionsAllUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsAllUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this user source connection. | |

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

<a id="sourcesUserConnectionsOauthCreate"></a>
# **sourcesUserConnectionsOauthCreate**
> UserOAuthSourceConnection sourcesUserConnectionsOauthCreate(userOAuthSourceConnectionRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    UserOAuthSourceConnectionRequest userOAuthSourceConnectionRequest = new UserOAuthSourceConnectionRequest(); // UserOAuthSourceConnectionRequest | 
    try {
      UserOAuthSourceConnection result = apiInstance.sourcesUserConnectionsOauthCreate(userOAuthSourceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsOauthCreate");
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
| **userOAuthSourceConnectionRequest** | [**UserOAuthSourceConnectionRequest**](UserOAuthSourceConnectionRequest.md)|  | |

### Return type

[**UserOAuthSourceConnection**](UserOAuthSourceConnection.md)

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

<a id="sourcesUserConnectionsOauthDestroy"></a>
# **sourcesUserConnectionsOauthDestroy**
> sourcesUserConnectionsOauthDestroy(id)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User OAuth Source Connection.
    try {
      apiInstance.sourcesUserConnectionsOauthDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsOauthDestroy");
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
| **id** | **Integer**| A unique integer value identifying this User OAuth Source Connection. | |

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

<a id="sourcesUserConnectionsOauthList"></a>
# **sourcesUserConnectionsOauthList**
> PaginatedUserOAuthSourceConnectionList sourcesUserConnectionsOauthList(ordering, page, pageSize, search, sourceSlug)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String sourceSlug = "sourceSlug_example"; // String | 
    try {
      PaginatedUserOAuthSourceConnectionList result = apiInstance.sourcesUserConnectionsOauthList(ordering, page, pageSize, search, sourceSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsOauthList");
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
| **search** | **String**| A search term. | [optional] |
| **sourceSlug** | **String**|  | [optional] |

### Return type

[**PaginatedUserOAuthSourceConnectionList**](PaginatedUserOAuthSourceConnectionList.md)

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

<a id="sourcesUserConnectionsOauthPartialUpdate"></a>
# **sourcesUserConnectionsOauthPartialUpdate**
> UserOAuthSourceConnection sourcesUserConnectionsOauthPartialUpdate(id, patchedUserOAuthSourceConnectionRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User OAuth Source Connection.
    PatchedUserOAuthSourceConnectionRequest patchedUserOAuthSourceConnectionRequest = new PatchedUserOAuthSourceConnectionRequest(); // PatchedUserOAuthSourceConnectionRequest | 
    try {
      UserOAuthSourceConnection result = apiInstance.sourcesUserConnectionsOauthPartialUpdate(id, patchedUserOAuthSourceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsOauthPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this User OAuth Source Connection. | |
| **patchedUserOAuthSourceConnectionRequest** | [**PatchedUserOAuthSourceConnectionRequest**](PatchedUserOAuthSourceConnectionRequest.md)|  | [optional] |

### Return type

[**UserOAuthSourceConnection**](UserOAuthSourceConnection.md)

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

<a id="sourcesUserConnectionsOauthRetrieve"></a>
# **sourcesUserConnectionsOauthRetrieve**
> UserOAuthSourceConnection sourcesUserConnectionsOauthRetrieve(id)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User OAuth Source Connection.
    try {
      UserOAuthSourceConnection result = apiInstance.sourcesUserConnectionsOauthRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsOauthRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this User OAuth Source Connection. | |

### Return type

[**UserOAuthSourceConnection**](UserOAuthSourceConnection.md)

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

<a id="sourcesUserConnectionsOauthUpdate"></a>
# **sourcesUserConnectionsOauthUpdate**
> UserOAuthSourceConnection sourcesUserConnectionsOauthUpdate(id, userOAuthSourceConnectionRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User OAuth Source Connection.
    UserOAuthSourceConnectionRequest userOAuthSourceConnectionRequest = new UserOAuthSourceConnectionRequest(); // UserOAuthSourceConnectionRequest | 
    try {
      UserOAuthSourceConnection result = apiInstance.sourcesUserConnectionsOauthUpdate(id, userOAuthSourceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsOauthUpdate");
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
| **id** | **Integer**| A unique integer value identifying this User OAuth Source Connection. | |
| **userOAuthSourceConnectionRequest** | [**UserOAuthSourceConnectionRequest**](UserOAuthSourceConnectionRequest.md)|  | |

### Return type

[**UserOAuthSourceConnection**](UserOAuthSourceConnection.md)

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

<a id="sourcesUserConnectionsOauthUsedByList"></a>
# **sourcesUserConnectionsOauthUsedByList**
> List&lt;UsedBy&gt; sourcesUserConnectionsOauthUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User OAuth Source Connection.
    try {
      List<UsedBy> result = apiInstance.sourcesUserConnectionsOauthUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsOauthUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this User OAuth Source Connection. | |

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

<a id="sourcesUserConnectionsPlexCreate"></a>
# **sourcesUserConnectionsPlexCreate**
> PlexSourceConnection sourcesUserConnectionsPlexCreate(plexSourceConnectionRequest)



Plex Source connection Serializer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    PlexSourceConnectionRequest plexSourceConnectionRequest = new PlexSourceConnectionRequest(); // PlexSourceConnectionRequest | 
    try {
      PlexSourceConnection result = apiInstance.sourcesUserConnectionsPlexCreate(plexSourceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsPlexCreate");
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
| **plexSourceConnectionRequest** | [**PlexSourceConnectionRequest**](PlexSourceConnectionRequest.md)|  | |

### Return type

[**PlexSourceConnection**](PlexSourceConnection.md)

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

<a id="sourcesUserConnectionsPlexDestroy"></a>
# **sourcesUserConnectionsPlexDestroy**
> sourcesUserConnectionsPlexDestroy(id)



Plex Source connection Serializer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User Plex Source Connection.
    try {
      apiInstance.sourcesUserConnectionsPlexDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsPlexDestroy");
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
| **id** | **Integer**| A unique integer value identifying this User Plex Source Connection. | |

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

<a id="sourcesUserConnectionsPlexList"></a>
# **sourcesUserConnectionsPlexList**
> PaginatedPlexSourceConnectionList sourcesUserConnectionsPlexList(ordering, page, pageSize, search, sourceSlug)



Plex Source connection Serializer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String sourceSlug = "sourceSlug_example"; // String | 
    try {
      PaginatedPlexSourceConnectionList result = apiInstance.sourcesUserConnectionsPlexList(ordering, page, pageSize, search, sourceSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsPlexList");
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
| **search** | **String**| A search term. | [optional] |
| **sourceSlug** | **String**|  | [optional] |

### Return type

[**PaginatedPlexSourceConnectionList**](PaginatedPlexSourceConnectionList.md)

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

<a id="sourcesUserConnectionsPlexPartialUpdate"></a>
# **sourcesUserConnectionsPlexPartialUpdate**
> PlexSourceConnection sourcesUserConnectionsPlexPartialUpdate(id, patchedPlexSourceConnectionRequest)



Plex Source connection Serializer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User Plex Source Connection.
    PatchedPlexSourceConnectionRequest patchedPlexSourceConnectionRequest = new PatchedPlexSourceConnectionRequest(); // PatchedPlexSourceConnectionRequest | 
    try {
      PlexSourceConnection result = apiInstance.sourcesUserConnectionsPlexPartialUpdate(id, patchedPlexSourceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsPlexPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this User Plex Source Connection. | |
| **patchedPlexSourceConnectionRequest** | [**PatchedPlexSourceConnectionRequest**](PatchedPlexSourceConnectionRequest.md)|  | [optional] |

### Return type

[**PlexSourceConnection**](PlexSourceConnection.md)

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

<a id="sourcesUserConnectionsPlexRetrieve"></a>
# **sourcesUserConnectionsPlexRetrieve**
> PlexSourceConnection sourcesUserConnectionsPlexRetrieve(id)



Plex Source connection Serializer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User Plex Source Connection.
    try {
      PlexSourceConnection result = apiInstance.sourcesUserConnectionsPlexRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsPlexRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this User Plex Source Connection. | |

### Return type

[**PlexSourceConnection**](PlexSourceConnection.md)

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

<a id="sourcesUserConnectionsPlexUpdate"></a>
# **sourcesUserConnectionsPlexUpdate**
> PlexSourceConnection sourcesUserConnectionsPlexUpdate(id, plexSourceConnectionRequest)



Plex Source connection Serializer

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User Plex Source Connection.
    PlexSourceConnectionRequest plexSourceConnectionRequest = new PlexSourceConnectionRequest(); // PlexSourceConnectionRequest | 
    try {
      PlexSourceConnection result = apiInstance.sourcesUserConnectionsPlexUpdate(id, plexSourceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsPlexUpdate");
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
| **id** | **Integer**| A unique integer value identifying this User Plex Source Connection. | |
| **plexSourceConnectionRequest** | [**PlexSourceConnectionRequest**](PlexSourceConnectionRequest.md)|  | |

### Return type

[**PlexSourceConnection**](PlexSourceConnection.md)

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

<a id="sourcesUserConnectionsPlexUsedByList"></a>
# **sourcesUserConnectionsPlexUsedByList**
> List&lt;UsedBy&gt; sourcesUserConnectionsPlexUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User Plex Source Connection.
    try {
      List<UsedBy> result = apiInstance.sourcesUserConnectionsPlexUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsPlexUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this User Plex Source Connection. | |

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

<a id="sourcesUserConnectionsSamlCreate"></a>
# **sourcesUserConnectionsSamlCreate**
> UserSAMLSourceConnection sourcesUserConnectionsSamlCreate(userSAMLSourceConnectionRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    UserSAMLSourceConnectionRequest userSAMLSourceConnectionRequest = new UserSAMLSourceConnectionRequest(); // UserSAMLSourceConnectionRequest | 
    try {
      UserSAMLSourceConnection result = apiInstance.sourcesUserConnectionsSamlCreate(userSAMLSourceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsSamlCreate");
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
| **userSAMLSourceConnectionRequest** | [**UserSAMLSourceConnectionRequest**](UserSAMLSourceConnectionRequest.md)|  | |

### Return type

[**UserSAMLSourceConnection**](UserSAMLSourceConnection.md)

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

<a id="sourcesUserConnectionsSamlDestroy"></a>
# **sourcesUserConnectionsSamlDestroy**
> sourcesUserConnectionsSamlDestroy(id)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User SAML Source Connection.
    try {
      apiInstance.sourcesUserConnectionsSamlDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsSamlDestroy");
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
| **id** | **Integer**| A unique integer value identifying this User SAML Source Connection. | |

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

<a id="sourcesUserConnectionsSamlList"></a>
# **sourcesUserConnectionsSamlList**
> PaginatedUserSAMLSourceConnectionList sourcesUserConnectionsSamlList(ordering, page, pageSize, search, sourceSlug)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String sourceSlug = "sourceSlug_example"; // String | 
    try {
      PaginatedUserSAMLSourceConnectionList result = apiInstance.sourcesUserConnectionsSamlList(ordering, page, pageSize, search, sourceSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsSamlList");
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
| **search** | **String**| A search term. | [optional] |
| **sourceSlug** | **String**|  | [optional] |

### Return type

[**PaginatedUserSAMLSourceConnectionList**](PaginatedUserSAMLSourceConnectionList.md)

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

<a id="sourcesUserConnectionsSamlPartialUpdate"></a>
# **sourcesUserConnectionsSamlPartialUpdate**
> UserSAMLSourceConnection sourcesUserConnectionsSamlPartialUpdate(id, patchedUserSAMLSourceConnectionRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User SAML Source Connection.
    PatchedUserSAMLSourceConnectionRequest patchedUserSAMLSourceConnectionRequest = new PatchedUserSAMLSourceConnectionRequest(); // PatchedUserSAMLSourceConnectionRequest | 
    try {
      UserSAMLSourceConnection result = apiInstance.sourcesUserConnectionsSamlPartialUpdate(id, patchedUserSAMLSourceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsSamlPartialUpdate");
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
| **id** | **Integer**| A unique integer value identifying this User SAML Source Connection. | |
| **patchedUserSAMLSourceConnectionRequest** | [**PatchedUserSAMLSourceConnectionRequest**](PatchedUserSAMLSourceConnectionRequest.md)|  | [optional] |

### Return type

[**UserSAMLSourceConnection**](UserSAMLSourceConnection.md)

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

<a id="sourcesUserConnectionsSamlRetrieve"></a>
# **sourcesUserConnectionsSamlRetrieve**
> UserSAMLSourceConnection sourcesUserConnectionsSamlRetrieve(id)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User SAML Source Connection.
    try {
      UserSAMLSourceConnection result = apiInstance.sourcesUserConnectionsSamlRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsSamlRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this User SAML Source Connection. | |

### Return type

[**UserSAMLSourceConnection**](UserSAMLSourceConnection.md)

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

<a id="sourcesUserConnectionsSamlUpdate"></a>
# **sourcesUserConnectionsSamlUpdate**
> UserSAMLSourceConnection sourcesUserConnectionsSamlUpdate(id, userSAMLSourceConnectionRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User SAML Source Connection.
    UserSAMLSourceConnectionRequest userSAMLSourceConnectionRequest = new UserSAMLSourceConnectionRequest(); // UserSAMLSourceConnectionRequest | 
    try {
      UserSAMLSourceConnection result = apiInstance.sourcesUserConnectionsSamlUpdate(id, userSAMLSourceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsSamlUpdate");
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
| **id** | **Integer**| A unique integer value identifying this User SAML Source Connection. | |
| **userSAMLSourceConnectionRequest** | [**UserSAMLSourceConnectionRequest**](UserSAMLSourceConnectionRequest.md)|  | |

### Return type

[**UserSAMLSourceConnection**](UserSAMLSourceConnection.md)

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

<a id="sourcesUserConnectionsSamlUsedByList"></a>
# **sourcesUserConnectionsSamlUsedByList**
> List&lt;UsedBy&gt; sourcesUserConnectionsSamlUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    SourcesApi apiInstance = new SourcesApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User SAML Source Connection.
    try {
      List<UsedBy> result = apiInstance.sourcesUserConnectionsSamlUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcesApi#sourcesUserConnectionsSamlUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this User SAML Source Connection. | |

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

