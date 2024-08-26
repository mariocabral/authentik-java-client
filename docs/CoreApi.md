# CoreApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**coreApplicationsCheckAccessRetrieve**](CoreApi.md#coreApplicationsCheckAccessRetrieve) | **GET** /core/applications/{slug}/check_access/ |  |
| [**coreApplicationsCreate**](CoreApi.md#coreApplicationsCreate) | **POST** /core/applications/ |  |
| [**coreApplicationsDestroy**](CoreApi.md#coreApplicationsDestroy) | **DELETE** /core/applications/{slug}/ |  |
| [**coreApplicationsList**](CoreApi.md#coreApplicationsList) | **GET** /core/applications/ |  |
| [**coreApplicationsMetricsList**](CoreApi.md#coreApplicationsMetricsList) | **GET** /core/applications/{slug}/metrics/ |  |
| [**coreApplicationsPartialUpdate**](CoreApi.md#coreApplicationsPartialUpdate) | **PATCH** /core/applications/{slug}/ |  |
| [**coreApplicationsRetrieve**](CoreApi.md#coreApplicationsRetrieve) | **GET** /core/applications/{slug}/ |  |
| [**coreApplicationsSetIconCreate**](CoreApi.md#coreApplicationsSetIconCreate) | **POST** /core/applications/{slug}/set_icon/ |  |
| [**coreApplicationsSetIconUrlCreate**](CoreApi.md#coreApplicationsSetIconUrlCreate) | **POST** /core/applications/{slug}/set_icon_url/ |  |
| [**coreApplicationsUpdate**](CoreApi.md#coreApplicationsUpdate) | **PUT** /core/applications/{slug}/ |  |
| [**coreApplicationsUsedByList**](CoreApi.md#coreApplicationsUsedByList) | **GET** /core/applications/{slug}/used_by/ |  |
| [**coreAuthenticatedSessionsDestroy**](CoreApi.md#coreAuthenticatedSessionsDestroy) | **DELETE** /core/authenticated_sessions/{uuid}/ |  |
| [**coreAuthenticatedSessionsList**](CoreApi.md#coreAuthenticatedSessionsList) | **GET** /core/authenticated_sessions/ |  |
| [**coreAuthenticatedSessionsRetrieve**](CoreApi.md#coreAuthenticatedSessionsRetrieve) | **GET** /core/authenticated_sessions/{uuid}/ |  |
| [**coreAuthenticatedSessionsUsedByList**](CoreApi.md#coreAuthenticatedSessionsUsedByList) | **GET** /core/authenticated_sessions/{uuid}/used_by/ |  |
| [**coreBrandsCreate**](CoreApi.md#coreBrandsCreate) | **POST** /core/brands/ |  |
| [**coreBrandsCurrentRetrieve**](CoreApi.md#coreBrandsCurrentRetrieve) | **GET** /core/brands/current/ |  |
| [**coreBrandsDestroy**](CoreApi.md#coreBrandsDestroy) | **DELETE** /core/brands/{brand_uuid}/ |  |
| [**coreBrandsList**](CoreApi.md#coreBrandsList) | **GET** /core/brands/ |  |
| [**coreBrandsPartialUpdate**](CoreApi.md#coreBrandsPartialUpdate) | **PATCH** /core/brands/{brand_uuid}/ |  |
| [**coreBrandsRetrieve**](CoreApi.md#coreBrandsRetrieve) | **GET** /core/brands/{brand_uuid}/ |  |
| [**coreBrandsUpdate**](CoreApi.md#coreBrandsUpdate) | **PUT** /core/brands/{brand_uuid}/ |  |
| [**coreBrandsUsedByList**](CoreApi.md#coreBrandsUsedByList) | **GET** /core/brands/{brand_uuid}/used_by/ |  |
| [**coreGroupsAddUserCreate**](CoreApi.md#coreGroupsAddUserCreate) | **POST** /core/groups/{group_uuid}/add_user/ |  |
| [**coreGroupsCreate**](CoreApi.md#coreGroupsCreate) | **POST** /core/groups/ |  |
| [**coreGroupsDestroy**](CoreApi.md#coreGroupsDestroy) | **DELETE** /core/groups/{group_uuid}/ |  |
| [**coreGroupsList**](CoreApi.md#coreGroupsList) | **GET** /core/groups/ |  |
| [**coreGroupsPartialUpdate**](CoreApi.md#coreGroupsPartialUpdate) | **PATCH** /core/groups/{group_uuid}/ |  |
| [**coreGroupsRemoveUserCreate**](CoreApi.md#coreGroupsRemoveUserCreate) | **POST** /core/groups/{group_uuid}/remove_user/ |  |
| [**coreGroupsRetrieve**](CoreApi.md#coreGroupsRetrieve) | **GET** /core/groups/{group_uuid}/ |  |
| [**coreGroupsUpdate**](CoreApi.md#coreGroupsUpdate) | **PUT** /core/groups/{group_uuid}/ |  |
| [**coreGroupsUsedByList**](CoreApi.md#coreGroupsUsedByList) | **GET** /core/groups/{group_uuid}/used_by/ |  |
| [**coreTokensCreate**](CoreApi.md#coreTokensCreate) | **POST** /core/tokens/ |  |
| [**coreTokensDestroy**](CoreApi.md#coreTokensDestroy) | **DELETE** /core/tokens/{identifier}/ |  |
| [**coreTokensList**](CoreApi.md#coreTokensList) | **GET** /core/tokens/ |  |
| [**coreTokensPartialUpdate**](CoreApi.md#coreTokensPartialUpdate) | **PATCH** /core/tokens/{identifier}/ |  |
| [**coreTokensRetrieve**](CoreApi.md#coreTokensRetrieve) | **GET** /core/tokens/{identifier}/ |  |
| [**coreTokensSetKeyCreate**](CoreApi.md#coreTokensSetKeyCreate) | **POST** /core/tokens/{identifier}/set_key/ |  |
| [**coreTokensUpdate**](CoreApi.md#coreTokensUpdate) | **PUT** /core/tokens/{identifier}/ |  |
| [**coreTokensUsedByList**](CoreApi.md#coreTokensUsedByList) | **GET** /core/tokens/{identifier}/used_by/ |  |
| [**coreTokensViewKeyRetrieve**](CoreApi.md#coreTokensViewKeyRetrieve) | **GET** /core/tokens/{identifier}/view_key/ |  |
| [**coreTransactionalApplicationsUpdate**](CoreApi.md#coreTransactionalApplicationsUpdate) | **PUT** /core/transactional/applications/ |  |
| [**coreUserConsentDestroy**](CoreApi.md#coreUserConsentDestroy) | **DELETE** /core/user_consent/{id}/ |  |
| [**coreUserConsentList**](CoreApi.md#coreUserConsentList) | **GET** /core/user_consent/ |  |
| [**coreUserConsentRetrieve**](CoreApi.md#coreUserConsentRetrieve) | **GET** /core/user_consent/{id}/ |  |
| [**coreUserConsentUsedByList**](CoreApi.md#coreUserConsentUsedByList) | **GET** /core/user_consent/{id}/used_by/ |  |
| [**coreUsersCreate**](CoreApi.md#coreUsersCreate) | **POST** /core/users/ |  |
| [**coreUsersDestroy**](CoreApi.md#coreUsersDestroy) | **DELETE** /core/users/{id}/ |  |
| [**coreUsersImpersonateCreate**](CoreApi.md#coreUsersImpersonateCreate) | **POST** /core/users/{id}/impersonate/ |  |
| [**coreUsersImpersonateEndRetrieve**](CoreApi.md#coreUsersImpersonateEndRetrieve) | **GET** /core/users/impersonate_end/ |  |
| [**coreUsersList**](CoreApi.md#coreUsersList) | **GET** /core/users/ |  |
| [**coreUsersMeRetrieve**](CoreApi.md#coreUsersMeRetrieve) | **GET** /core/users/me/ |  |
| [**coreUsersMetricsRetrieve**](CoreApi.md#coreUsersMetricsRetrieve) | **GET** /core/users/{id}/metrics/ |  |
| [**coreUsersPartialUpdate**](CoreApi.md#coreUsersPartialUpdate) | **PATCH** /core/users/{id}/ |  |
| [**coreUsersPathsRetrieve**](CoreApi.md#coreUsersPathsRetrieve) | **GET** /core/users/paths/ |  |
| [**coreUsersRecoveryCreate**](CoreApi.md#coreUsersRecoveryCreate) | **POST** /core/users/{id}/recovery/ |  |
| [**coreUsersRecoveryEmailCreate**](CoreApi.md#coreUsersRecoveryEmailCreate) | **POST** /core/users/{id}/recovery_email/ |  |
| [**coreUsersRetrieve**](CoreApi.md#coreUsersRetrieve) | **GET** /core/users/{id}/ |  |
| [**coreUsersServiceAccountCreate**](CoreApi.md#coreUsersServiceAccountCreate) | **POST** /core/users/service_account/ |  |
| [**coreUsersSetPasswordCreate**](CoreApi.md#coreUsersSetPasswordCreate) | **POST** /core/users/{id}/set_password/ |  |
| [**coreUsersUpdate**](CoreApi.md#coreUsersUpdate) | **PUT** /core/users/{id}/ |  |
| [**coreUsersUsedByList**](CoreApi.md#coreUsersUsedByList) | **GET** /core/users/{id}/used_by/ |  |


<a id="coreApplicationsCheckAccessRetrieve"></a>
# **coreApplicationsCheckAccessRetrieve**
> PolicyTestResult coreApplicationsCheckAccessRetrieve(slug, forUser)



Check access to a single application by slug

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String slug = "slug_example"; // String | 
    Integer forUser = 56; // Integer | 
    try {
      PolicyTestResult result = apiInstance.coreApplicationsCheckAccessRetrieve(slug, forUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsCheckAccessRetrieve");
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
| **forUser** | **Integer**|  | [optional] |

### Return type

[**PolicyTestResult**](PolicyTestResult.md)

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

<a id="coreApplicationsCreate"></a>
# **coreApplicationsCreate**
> Application coreApplicationsCreate(applicationRequest)



Application Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    ApplicationRequest applicationRequest = new ApplicationRequest(); // ApplicationRequest | 
    try {
      Application result = apiInstance.coreApplicationsCreate(applicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsCreate");
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
| **applicationRequest** | [**ApplicationRequest**](ApplicationRequest.md)|  | |

### Return type

[**Application**](Application.md)

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

<a id="coreApplicationsDestroy"></a>
# **coreApplicationsDestroy**
> coreApplicationsDestroy(slug)



Application Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      apiInstance.coreApplicationsDestroy(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsDestroy");
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

<a id="coreApplicationsList"></a>
# **coreApplicationsList**
> PaginatedApplicationList coreApplicationsList(forUser, group, metaDescription, metaLaunchUrl, metaPublisher, name, ordering, page, pageSize, search, slug, superuserFullList)



Custom list method that checks Policy based access instead of guardian

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer forUser = 56; // Integer | 
    String group = "group_example"; // String | 
    String metaDescription = "metaDescription_example"; // String | 
    String metaLaunchUrl = "metaLaunchUrl_example"; // String | 
    String metaPublisher = "metaPublisher_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String slug = "slug_example"; // String | 
    Boolean superuserFullList = true; // Boolean | 
    try {
      PaginatedApplicationList result = apiInstance.coreApplicationsList(forUser, group, metaDescription, metaLaunchUrl, metaPublisher, name, ordering, page, pageSize, search, slug, superuserFullList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsList");
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
| **forUser** | **Integer**|  | [optional] |
| **group** | **String**|  | [optional] |
| **metaDescription** | **String**|  | [optional] |
| **metaLaunchUrl** | **String**|  | [optional] |
| **metaPublisher** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **slug** | **String**|  | [optional] |
| **superuserFullList** | **Boolean**|  | [optional] |

### Return type

[**PaginatedApplicationList**](PaginatedApplicationList.md)

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

<a id="coreApplicationsMetricsList"></a>
# **coreApplicationsMetricsList**
> List&lt;Coordinate&gt; coreApplicationsMetricsList(slug)



Metrics for application logins

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      List<Coordinate> result = apiInstance.coreApplicationsMetricsList(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsMetricsList");
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

[**List&lt;Coordinate&gt;**](Coordinate.md)

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

<a id="coreApplicationsPartialUpdate"></a>
# **coreApplicationsPartialUpdate**
> Application coreApplicationsPartialUpdate(slug, patchedApplicationRequest)



Application Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String slug = "slug_example"; // String | 
    PatchedApplicationRequest patchedApplicationRequest = new PatchedApplicationRequest(); // PatchedApplicationRequest | 
    try {
      Application result = apiInstance.coreApplicationsPartialUpdate(slug, patchedApplicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsPartialUpdate");
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
| **patchedApplicationRequest** | [**PatchedApplicationRequest**](PatchedApplicationRequest.md)|  | [optional] |

### Return type

[**Application**](Application.md)

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

<a id="coreApplicationsRetrieve"></a>
# **coreApplicationsRetrieve**
> Application coreApplicationsRetrieve(slug)



Application Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      Application result = apiInstance.coreApplicationsRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsRetrieve");
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

[**Application**](Application.md)

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

<a id="coreApplicationsSetIconCreate"></a>
# **coreApplicationsSetIconCreate**
> coreApplicationsSetIconCreate(slug, _file, clear)



Set application icon

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String slug = "slug_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    Boolean clear = false; // Boolean | 
    try {
      apiInstance.coreApplicationsSetIconCreate(slug, _file, clear);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsSetIconCreate");
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

<a id="coreApplicationsSetIconUrlCreate"></a>
# **coreApplicationsSetIconUrlCreate**
> coreApplicationsSetIconUrlCreate(slug, filePathRequest)



Set application icon (as URL)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String slug = "slug_example"; // String | 
    FilePathRequest filePathRequest = new FilePathRequest(); // FilePathRequest | 
    try {
      apiInstance.coreApplicationsSetIconUrlCreate(slug, filePathRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsSetIconUrlCreate");
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

<a id="coreApplicationsUpdate"></a>
# **coreApplicationsUpdate**
> Application coreApplicationsUpdate(slug, applicationRequest)



Application Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String slug = "slug_example"; // String | 
    ApplicationRequest applicationRequest = new ApplicationRequest(); // ApplicationRequest | 
    try {
      Application result = apiInstance.coreApplicationsUpdate(slug, applicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsUpdate");
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
| **applicationRequest** | [**ApplicationRequest**](ApplicationRequest.md)|  | |

### Return type

[**Application**](Application.md)

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

<a id="coreApplicationsUsedByList"></a>
# **coreApplicationsUsedByList**
> List&lt;UsedBy&gt; coreApplicationsUsedByList(slug)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      List<UsedBy> result = apiInstance.coreApplicationsUsedByList(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreApplicationsUsedByList");
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

<a id="coreAuthenticatedSessionsDestroy"></a>
# **coreAuthenticatedSessionsDestroy**
> coreAuthenticatedSessionsDestroy(uuid)



AuthenticatedSession Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Authenticated Session.
    try {
      apiInstance.coreAuthenticatedSessionsDestroy(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreAuthenticatedSessionsDestroy");
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
| **uuid** | **UUID**| A UUID string identifying this Authenticated Session. | |

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

<a id="coreAuthenticatedSessionsList"></a>
# **coreAuthenticatedSessionsList**
> PaginatedAuthenticatedSessionList coreAuthenticatedSessionsList(lastIp, lastUserAgent, ordering, page, pageSize, search, userUsername)



AuthenticatedSession Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String lastIp = "lastIp_example"; // String | 
    String lastUserAgent = "lastUserAgent_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String userUsername = "userUsername_example"; // String | 
    try {
      PaginatedAuthenticatedSessionList result = apiInstance.coreAuthenticatedSessionsList(lastIp, lastUserAgent, ordering, page, pageSize, search, userUsername);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreAuthenticatedSessionsList");
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
| **lastIp** | **String**|  | [optional] |
| **lastUserAgent** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **userUsername** | **String**|  | [optional] |

### Return type

[**PaginatedAuthenticatedSessionList**](PaginatedAuthenticatedSessionList.md)

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

<a id="coreAuthenticatedSessionsRetrieve"></a>
# **coreAuthenticatedSessionsRetrieve**
> AuthenticatedSession coreAuthenticatedSessionsRetrieve(uuid)



AuthenticatedSession Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Authenticated Session.
    try {
      AuthenticatedSession result = apiInstance.coreAuthenticatedSessionsRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreAuthenticatedSessionsRetrieve");
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
| **uuid** | **UUID**| A UUID string identifying this Authenticated Session. | |

### Return type

[**AuthenticatedSession**](AuthenticatedSession.md)

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

<a id="coreAuthenticatedSessionsUsedByList"></a>
# **coreAuthenticatedSessionsUsedByList**
> List&lt;UsedBy&gt; coreAuthenticatedSessionsUsedByList(uuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Authenticated Session.
    try {
      List<UsedBy> result = apiInstance.coreAuthenticatedSessionsUsedByList(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreAuthenticatedSessionsUsedByList");
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
| **uuid** | **UUID**| A UUID string identifying this Authenticated Session. | |

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

<a id="coreBrandsCreate"></a>
# **coreBrandsCreate**
> Brand coreBrandsCreate(brandRequest)



Brand Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    BrandRequest brandRequest = new BrandRequest(); // BrandRequest | 
    try {
      Brand result = apiInstance.coreBrandsCreate(brandRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreBrandsCreate");
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
| **brandRequest** | [**BrandRequest**](BrandRequest.md)|  | |

### Return type

[**Brand**](Brand.md)

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

<a id="coreBrandsCurrentRetrieve"></a>
# **coreBrandsCurrentRetrieve**
> CurrentBrand coreBrandsCurrentRetrieve()



Get current brand

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    try {
      CurrentBrand result = apiInstance.coreBrandsCurrentRetrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreBrandsCurrentRetrieve");
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

[**CurrentBrand**](CurrentBrand.md)

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

<a id="coreBrandsDestroy"></a>
# **coreBrandsDestroy**
> coreBrandsDestroy(brandUuid)



Brand Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID brandUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Brand.
    try {
      apiInstance.coreBrandsDestroy(brandUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreBrandsDestroy");
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
| **brandUuid** | **UUID**| A UUID string identifying this Brand. | |

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

<a id="coreBrandsList"></a>
# **coreBrandsList**
> PaginatedBrandList coreBrandsList(brandUuid, brandingFavicon, brandingLogo, brandingTitle, _default, domain, flowAuthentication, flowDeviceCode, flowInvalidation, flowRecovery, flowUnenrollment, flowUserSettings, ordering, page, pageSize, search, webCertificate)



Brand Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID brandUuid = UUID.randomUUID(); // UUID | 
    String brandingFavicon = "brandingFavicon_example"; // String | 
    String brandingLogo = "brandingLogo_example"; // String | 
    String brandingTitle = "brandingTitle_example"; // String | 
    Boolean _default = true; // Boolean | 
    String domain = "domain_example"; // String | 
    UUID flowAuthentication = UUID.randomUUID(); // UUID | 
    UUID flowDeviceCode = UUID.randomUUID(); // UUID | 
    UUID flowInvalidation = UUID.randomUUID(); // UUID | 
    UUID flowRecovery = UUID.randomUUID(); // UUID | 
    UUID flowUnenrollment = UUID.randomUUID(); // UUID | 
    UUID flowUserSettings = UUID.randomUUID(); // UUID | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID webCertificate = UUID.randomUUID(); // UUID | 
    try {
      PaginatedBrandList result = apiInstance.coreBrandsList(brandUuid, brandingFavicon, brandingLogo, brandingTitle, _default, domain, flowAuthentication, flowDeviceCode, flowInvalidation, flowRecovery, flowUnenrollment, flowUserSettings, ordering, page, pageSize, search, webCertificate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreBrandsList");
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
| **brandUuid** | **UUID**|  | [optional] |
| **brandingFavicon** | **String**|  | [optional] |
| **brandingLogo** | **String**|  | [optional] |
| **brandingTitle** | **String**|  | [optional] |
| **_default** | **Boolean**|  | [optional] |
| **domain** | **String**|  | [optional] |
| **flowAuthentication** | **UUID**|  | [optional] |
| **flowDeviceCode** | **UUID**|  | [optional] |
| **flowInvalidation** | **UUID**|  | [optional] |
| **flowRecovery** | **UUID**|  | [optional] |
| **flowUnenrollment** | **UUID**|  | [optional] |
| **flowUserSettings** | **UUID**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **webCertificate** | **UUID**|  | [optional] |

### Return type

[**PaginatedBrandList**](PaginatedBrandList.md)

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

<a id="coreBrandsPartialUpdate"></a>
# **coreBrandsPartialUpdate**
> Brand coreBrandsPartialUpdate(brandUuid, patchedBrandRequest)



Brand Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID brandUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Brand.
    PatchedBrandRequest patchedBrandRequest = new PatchedBrandRequest(); // PatchedBrandRequest | 
    try {
      Brand result = apiInstance.coreBrandsPartialUpdate(brandUuid, patchedBrandRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreBrandsPartialUpdate");
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
| **brandUuid** | **UUID**| A UUID string identifying this Brand. | |
| **patchedBrandRequest** | [**PatchedBrandRequest**](PatchedBrandRequest.md)|  | [optional] |

### Return type

[**Brand**](Brand.md)

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

<a id="coreBrandsRetrieve"></a>
# **coreBrandsRetrieve**
> Brand coreBrandsRetrieve(brandUuid)



Brand Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID brandUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Brand.
    try {
      Brand result = apiInstance.coreBrandsRetrieve(brandUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreBrandsRetrieve");
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
| **brandUuid** | **UUID**| A UUID string identifying this Brand. | |

### Return type

[**Brand**](Brand.md)

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

<a id="coreBrandsUpdate"></a>
# **coreBrandsUpdate**
> Brand coreBrandsUpdate(brandUuid, brandRequest)



Brand Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID brandUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Brand.
    BrandRequest brandRequest = new BrandRequest(); // BrandRequest | 
    try {
      Brand result = apiInstance.coreBrandsUpdate(brandUuid, brandRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreBrandsUpdate");
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
| **brandUuid** | **UUID**| A UUID string identifying this Brand. | |
| **brandRequest** | [**BrandRequest**](BrandRequest.md)|  | |

### Return type

[**Brand**](Brand.md)

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

<a id="coreBrandsUsedByList"></a>
# **coreBrandsUsedByList**
> List&lt;UsedBy&gt; coreBrandsUsedByList(brandUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID brandUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Brand.
    try {
      List<UsedBy> result = apiInstance.coreBrandsUsedByList(brandUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreBrandsUsedByList");
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
| **brandUuid** | **UUID**| A UUID string identifying this Brand. | |

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

<a id="coreGroupsAddUserCreate"></a>
# **coreGroupsAddUserCreate**
> coreGroupsAddUserCreate(groupUuid, userAccountRequest)



Add user to group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID groupUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Group.
    UserAccountRequest userAccountRequest = new UserAccountRequest(); // UserAccountRequest | 
    try {
      apiInstance.coreGroupsAddUserCreate(groupUuid, userAccountRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreGroupsAddUserCreate");
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
| **groupUuid** | **UUID**| A UUID string identifying this Group. | |
| **userAccountRequest** | [**UserAccountRequest**](UserAccountRequest.md)|  | |

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
| **204** | User added |  -  |
| **404** | User not found |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="coreGroupsCreate"></a>
# **coreGroupsCreate**
> Group coreGroupsCreate(groupRequest)



Group Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    GroupRequest groupRequest = new GroupRequest(); // GroupRequest | 
    try {
      Group result = apiInstance.coreGroupsCreate(groupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreGroupsCreate");
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
| **groupRequest** | [**GroupRequest**](GroupRequest.md)|  | |

### Return type

[**Group**](Group.md)

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

<a id="coreGroupsDestroy"></a>
# **coreGroupsDestroy**
> coreGroupsDestroy(groupUuid)



Group Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID groupUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Group.
    try {
      apiInstance.coreGroupsDestroy(groupUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreGroupsDestroy");
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
| **groupUuid** | **UUID**| A UUID string identifying this Group. | |

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

<a id="coreGroupsList"></a>
# **coreGroupsList**
> PaginatedGroupList coreGroupsList(attributes, includeUsers, isSuperuser, membersByPk, membersByUsername, name, ordering, page, pageSize, search)



Group Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String attributes = "attributes_example"; // String | Attributes
    Boolean includeUsers = true; // Boolean | 
    Boolean isSuperuser = true; // Boolean | 
    List<Integer> membersByPk = Arrays.asList(); // List<Integer> | 
    List<String> membersByUsername = Arrays.asList(); // List<String> | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only.
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedGroupList result = apiInstance.coreGroupsList(attributes, includeUsers, isSuperuser, membersByPk, membersByUsername, name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreGroupsList");
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
| **attributes** | **String**| Attributes | [optional] |
| **includeUsers** | **Boolean**|  | [optional] [default to true] |
| **isSuperuser** | **Boolean**|  | [optional] |
| **membersByPk** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **membersByUsername** | [**List&lt;String&gt;**](String.md)| Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedGroupList**](PaginatedGroupList.md)

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

<a id="coreGroupsPartialUpdate"></a>
# **coreGroupsPartialUpdate**
> Group coreGroupsPartialUpdate(groupUuid, patchedGroupRequest)



Group Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID groupUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Group.
    PatchedGroupRequest patchedGroupRequest = new PatchedGroupRequest(); // PatchedGroupRequest | 
    try {
      Group result = apiInstance.coreGroupsPartialUpdate(groupUuid, patchedGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreGroupsPartialUpdate");
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
| **groupUuid** | **UUID**| A UUID string identifying this Group. | |
| **patchedGroupRequest** | [**PatchedGroupRequest**](PatchedGroupRequest.md)|  | [optional] |

### Return type

[**Group**](Group.md)

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

<a id="coreGroupsRemoveUserCreate"></a>
# **coreGroupsRemoveUserCreate**
> coreGroupsRemoveUserCreate(groupUuid, userAccountRequest)



Add user to group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID groupUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Group.
    UserAccountRequest userAccountRequest = new UserAccountRequest(); // UserAccountRequest | 
    try {
      apiInstance.coreGroupsRemoveUserCreate(groupUuid, userAccountRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreGroupsRemoveUserCreate");
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
| **groupUuid** | **UUID**| A UUID string identifying this Group. | |
| **userAccountRequest** | [**UserAccountRequest**](UserAccountRequest.md)|  | |

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
| **204** | User added |  -  |
| **404** | User not found |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="coreGroupsRetrieve"></a>
# **coreGroupsRetrieve**
> Group coreGroupsRetrieve(groupUuid, includeUsers)



Group Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID groupUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Group.
    Boolean includeUsers = true; // Boolean | 
    try {
      Group result = apiInstance.coreGroupsRetrieve(groupUuid, includeUsers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreGroupsRetrieve");
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
| **groupUuid** | **UUID**| A UUID string identifying this Group. | |
| **includeUsers** | **Boolean**|  | [optional] [default to true] |

### Return type

[**Group**](Group.md)

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

<a id="coreGroupsUpdate"></a>
# **coreGroupsUpdate**
> Group coreGroupsUpdate(groupUuid, groupRequest)



Group Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID groupUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Group.
    GroupRequest groupRequest = new GroupRequest(); // GroupRequest | 
    try {
      Group result = apiInstance.coreGroupsUpdate(groupUuid, groupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreGroupsUpdate");
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
| **groupUuid** | **UUID**| A UUID string identifying this Group. | |
| **groupRequest** | [**GroupRequest**](GroupRequest.md)|  | |

### Return type

[**Group**](Group.md)

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

<a id="coreGroupsUsedByList"></a>
# **coreGroupsUsedByList**
> List&lt;UsedBy&gt; coreGroupsUsedByList(groupUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID groupUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Group.
    try {
      List<UsedBy> result = apiInstance.coreGroupsUsedByList(groupUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreGroupsUsedByList");
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
| **groupUuid** | **UUID**| A UUID string identifying this Group. | |

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

<a id="coreTokensCreate"></a>
# **coreTokensCreate**
> Token coreTokensCreate(tokenRequest)



Token Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    TokenRequest tokenRequest = new TokenRequest(); // TokenRequest | 
    try {
      Token result = apiInstance.coreTokensCreate(tokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTokensCreate");
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
| **tokenRequest** | [**TokenRequest**](TokenRequest.md)|  | |

### Return type

[**Token**](Token.md)

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

<a id="coreTokensDestroy"></a>
# **coreTokensDestroy**
> coreTokensDestroy(identifier)



Token Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      apiInstance.coreTokensDestroy(identifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTokensDestroy");
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
| **identifier** | **String**|  | |

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

<a id="coreTokensList"></a>
# **coreTokensList**
> PaginatedTokenList coreTokensList(description, expires, expiring, identifier, intent, managed, ordering, page, pageSize, search, userUsername)



Token Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String description = "description_example"; // String | 
    OffsetDateTime expires = OffsetDateTime.now(); // OffsetDateTime | 
    Boolean expiring = true; // Boolean | 
    String identifier = "identifier_example"; // String | 
    String intent = "api"; // String | 
    String managed = "managed_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String userUsername = "userUsername_example"; // String | 
    try {
      PaginatedTokenList result = apiInstance.coreTokensList(description, expires, expiring, identifier, intent, managed, ordering, page, pageSize, search, userUsername);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTokensList");
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
| **description** | **String**|  | [optional] |
| **expires** | **OffsetDateTime**|  | [optional] |
| **expiring** | **Boolean**|  | [optional] |
| **identifier** | **String**|  | [optional] |
| **intent** | **String**|  | [optional] [enum: api, app_password, recovery, verification] |
| **managed** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **userUsername** | **String**|  | [optional] |

### Return type

[**PaginatedTokenList**](PaginatedTokenList.md)

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

<a id="coreTokensPartialUpdate"></a>
# **coreTokensPartialUpdate**
> Token coreTokensPartialUpdate(identifier, patchedTokenRequest)



Token Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    PatchedTokenRequest patchedTokenRequest = new PatchedTokenRequest(); // PatchedTokenRequest | 
    try {
      Token result = apiInstance.coreTokensPartialUpdate(identifier, patchedTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTokensPartialUpdate");
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
| **identifier** | **String**|  | |
| **patchedTokenRequest** | [**PatchedTokenRequest**](PatchedTokenRequest.md)|  | [optional] |

### Return type

[**Token**](Token.md)

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

<a id="coreTokensRetrieve"></a>
# **coreTokensRetrieve**
> Token coreTokensRetrieve(identifier)



Token Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      Token result = apiInstance.coreTokensRetrieve(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTokensRetrieve");
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
| **identifier** | **String**|  | |

### Return type

[**Token**](Token.md)

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

<a id="coreTokensSetKeyCreate"></a>
# **coreTokensSetKeyCreate**
> coreTokensSetKeyCreate(identifier, tokenSetKeyRequest)



Set token key. Action is logged as event. &#x60;authentik_core.set_token_key&#x60; permission is required.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    TokenSetKeyRequest tokenSetKeyRequest = new TokenSetKeyRequest(); // TokenSetKeyRequest | 
    try {
      apiInstance.coreTokensSetKeyCreate(identifier, tokenSetKeyRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTokensSetKeyCreate");
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
| **identifier** | **String**|  | |
| **tokenSetKeyRequest** | [**TokenSetKeyRequest**](TokenSetKeyRequest.md)|  | |

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
| **204** | Successfully changed key |  -  |
| **400** | Missing key |  -  |
| **404** | Token not found or expired |  -  |
| **403** |  |  -  |

<a id="coreTokensUpdate"></a>
# **coreTokensUpdate**
> Token coreTokensUpdate(identifier, tokenRequest)



Token Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    TokenRequest tokenRequest = new TokenRequest(); // TokenRequest | 
    try {
      Token result = apiInstance.coreTokensUpdate(identifier, tokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTokensUpdate");
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
| **identifier** | **String**|  | |
| **tokenRequest** | [**TokenRequest**](TokenRequest.md)|  | |

### Return type

[**Token**](Token.md)

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

<a id="coreTokensUsedByList"></a>
# **coreTokensUsedByList**
> List&lt;UsedBy&gt; coreTokensUsedByList(identifier)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      List<UsedBy> result = apiInstance.coreTokensUsedByList(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTokensUsedByList");
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
| **identifier** | **String**|  | |

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

<a id="coreTokensViewKeyRetrieve"></a>
# **coreTokensViewKeyRetrieve**
> TokenView coreTokensViewKeyRetrieve(identifier)



Return token key and log access

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    try {
      TokenView result = apiInstance.coreTokensViewKeyRetrieve(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTokensViewKeyRetrieve");
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
| **identifier** | **String**|  | |

### Return type

[**TokenView**](TokenView.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **404** | Token not found or expired |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="coreTransactionalApplicationsUpdate"></a>
# **coreTransactionalApplicationsUpdate**
> TransactionApplicationResponse coreTransactionalApplicationsUpdate(transactionApplicationRequest)



Convert data into a blueprint, validate it and apply it

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    TransactionApplicationRequest transactionApplicationRequest = new TransactionApplicationRequest(); // TransactionApplicationRequest | 
    try {
      TransactionApplicationResponse result = apiInstance.coreTransactionalApplicationsUpdate(transactionApplicationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreTransactionalApplicationsUpdate");
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
| **transactionApplicationRequest** | [**TransactionApplicationRequest**](TransactionApplicationRequest.md)|  | |

### Return type

[**TransactionApplicationResponse**](TransactionApplicationResponse.md)

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

<a id="coreUserConsentDestroy"></a>
# **coreUserConsentDestroy**
> coreUserConsentDestroy(id)



UserConsent Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User Consent.
    try {
      apiInstance.coreUserConsentDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUserConsentDestroy");
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
| **id** | **Integer**| A unique integer value identifying this User Consent. | |

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

<a id="coreUserConsentList"></a>
# **coreUserConsentList**
> PaginatedUserConsentList coreUserConsentList(application, ordering, page, pageSize, search, user)



UserConsent Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UUID application = UUID.randomUUID(); // UUID | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    Integer user = 56; // Integer | 
    try {
      PaginatedUserConsentList result = apiInstance.coreUserConsentList(application, ordering, page, pageSize, search, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUserConsentList");
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
| **application** | **UUID**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **user** | **Integer**|  | [optional] |

### Return type

[**PaginatedUserConsentList**](PaginatedUserConsentList.md)

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

<a id="coreUserConsentRetrieve"></a>
# **coreUserConsentRetrieve**
> UserConsent coreUserConsentRetrieve(id)



UserConsent Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User Consent.
    try {
      UserConsent result = apiInstance.coreUserConsentRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUserConsentRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this User Consent. | |

### Return type

[**UserConsent**](UserConsent.md)

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

<a id="coreUserConsentUsedByList"></a>
# **coreUserConsentUsedByList**
> List&lt;UsedBy&gt; coreUserConsentUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User Consent.
    try {
      List<UsedBy> result = apiInstance.coreUserConsentUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUserConsentUsedByList");
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
| **id** | **Integer**| A unique integer value identifying this User Consent. | |

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

<a id="coreUsersCreate"></a>
# **coreUsersCreate**
> User coreUsersCreate(userRequest)



User Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UserRequest userRequest = new UserRequest(); // UserRequest | 
    try {
      User result = apiInstance.coreUsersCreate(userRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersCreate");
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
| **userRequest** | [**UserRequest**](UserRequest.md)|  | |

### Return type

[**User**](User.md)

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

<a id="coreUsersDestroy"></a>
# **coreUsersDestroy**
> coreUsersDestroy(id)



User Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    try {
      apiInstance.coreUsersDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersDestroy");
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

<a id="coreUsersImpersonateCreate"></a>
# **coreUsersImpersonateCreate**
> coreUsersImpersonateCreate(id)



Impersonate a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    try {
      apiInstance.coreUsersImpersonateCreate(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersImpersonateCreate");
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
| **204** | Successfully started impersonation |  -  |
| **401** | Access denied |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="coreUsersImpersonateEndRetrieve"></a>
# **coreUsersImpersonateEndRetrieve**
> coreUsersImpersonateEndRetrieve()



End Impersonation a user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    try {
      apiInstance.coreUsersImpersonateEndRetrieve();
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersImpersonateEndRetrieve");
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

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully started impersonation |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="coreUsersList"></a>
# **coreUsersList**
> PaginatedUserList coreUsersList(attributes, email, groupsByName, groupsByPk, includeGroups, isActive, isSuperuser, name, ordering, page, pageSize, path, pathStartswith, search, type, username, uuid)



User Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String attributes = "attributes_example"; // String | Attributes
    String email = "email_example"; // String | 
    List<String> groupsByName = Arrays.asList(); // List<String> | 
    List<UUID> groupsByPk = Arrays.asList(); // List<UUID> | 
    Boolean includeGroups = true; // Boolean | 
    Boolean isActive = true; // Boolean | 
    Boolean isSuperuser = true; // Boolean | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String path = "path_example"; // String | 
    String pathStartswith = "pathStartswith_example"; // String | 
    String search = "search_example"; // String | A search term.
    List<String> type = Arrays.asList(); // List<String> | 
    String username = "username_example"; // String | 
    UUID uuid = UUID.randomUUID(); // UUID | 
    try {
      PaginatedUserList result = apiInstance.coreUsersList(attributes, email, groupsByName, groupsByPk, includeGroups, isActive, isSuperuser, name, ordering, page, pageSize, path, pathStartswith, search, type, username, uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersList");
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
| **attributes** | **String**| Attributes | [optional] |
| **email** | **String**|  | [optional] |
| **groupsByName** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **groupsByPk** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **includeGroups** | **Boolean**|  | [optional] [default to true] |
| **isActive** | **Boolean**|  | [optional] |
| **isSuperuser** | **Boolean**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **path** | **String**|  | [optional] |
| **pathStartswith** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **type** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: external, internal, internal_service_account, service_account] |
| **username** | **String**|  | [optional] |
| **uuid** | **UUID**|  | [optional] |

### Return type

[**PaginatedUserList**](PaginatedUserList.md)

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

<a id="coreUsersMeRetrieve"></a>
# **coreUsersMeRetrieve**
> SessionUser coreUsersMeRetrieve()



Get information about current user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    try {
      SessionUser result = apiInstance.coreUsersMeRetrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersMeRetrieve");
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

[**SessionUser**](SessionUser.md)

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

<a id="coreUsersMetricsRetrieve"></a>
# **coreUsersMetricsRetrieve**
> UserMetrics coreUsersMetricsRetrieve(id)



User metrics per 1h

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    try {
      UserMetrics result = apiInstance.coreUsersMetricsRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersMetricsRetrieve");
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

### Return type

[**UserMetrics**](UserMetrics.md)

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

<a id="coreUsersPartialUpdate"></a>
# **coreUsersPartialUpdate**
> User coreUsersPartialUpdate(id, patchedUserRequest)



User Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    PatchedUserRequest patchedUserRequest = new PatchedUserRequest(); // PatchedUserRequest | 
    try {
      User result = apiInstance.coreUsersPartialUpdate(id, patchedUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersPartialUpdate");
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
| **patchedUserRequest** | [**PatchedUserRequest**](PatchedUserRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

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

<a id="coreUsersPathsRetrieve"></a>
# **coreUsersPathsRetrieve**
> UserPath coreUsersPathsRetrieve(search)



Get all user paths

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String search = "search_example"; // String | 
    try {
      UserPath result = apiInstance.coreUsersPathsRetrieve(search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersPathsRetrieve");
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
| **search** | **String**|  | [optional] |

### Return type

[**UserPath**](UserPath.md)

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

<a id="coreUsersRecoveryCreate"></a>
# **coreUsersRecoveryCreate**
> Link coreUsersRecoveryCreate(id)



Create a temporary link that a user can use to recover their accounts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    try {
      Link result = apiInstance.coreUsersRecoveryCreate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersRecoveryCreate");
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

### Return type

[**Link**](Link.md)

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

<a id="coreUsersRecoveryEmailCreate"></a>
# **coreUsersRecoveryEmailCreate**
> coreUsersRecoveryEmailCreate(emailStage, id)



Create a temporary link that a user can use to recover their accounts

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String emailStage = "emailStage_example"; // String | 
    Integer id = 56; // Integer | A unique integer value identifying this User.
    try {
      apiInstance.coreUsersRecoveryEmailCreate(emailStage, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersRecoveryEmailCreate");
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
| **emailStage** | **String**|  | |
| **id** | **Integer**| A unique integer value identifying this User. | |

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
| **204** | Successfully sent recover email |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="coreUsersRetrieve"></a>
# **coreUsersRetrieve**
> User coreUsersRetrieve(id)



User Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    try {
      User result = apiInstance.coreUsersRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersRetrieve");
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

### Return type

[**User**](User.md)

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

<a id="coreUsersServiceAccountCreate"></a>
# **coreUsersServiceAccountCreate**
> UserServiceAccountResponse coreUsersServiceAccountCreate(userServiceAccountRequest)



Create a new user account that is marked as a service account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    UserServiceAccountRequest userServiceAccountRequest = new UserServiceAccountRequest(); // UserServiceAccountRequest | 
    try {
      UserServiceAccountResponse result = apiInstance.coreUsersServiceAccountCreate(userServiceAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersServiceAccountCreate");
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
| **userServiceAccountRequest** | [**UserServiceAccountRequest**](UserServiceAccountRequest.md)|  | |

### Return type

[**UserServiceAccountResponse**](UserServiceAccountResponse.md)

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

<a id="coreUsersSetPasswordCreate"></a>
# **coreUsersSetPasswordCreate**
> coreUsersSetPasswordCreate(id, userPasswordSetRequest)



Set password for user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    UserPasswordSetRequest userPasswordSetRequest = new UserPasswordSetRequest(); // UserPasswordSetRequest | 
    try {
      apiInstance.coreUsersSetPasswordCreate(id, userPasswordSetRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersSetPasswordCreate");
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
| **userPasswordSetRequest** | [**UserPasswordSetRequest**](UserPasswordSetRequest.md)|  | |

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
| **204** | Successfully changed password |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="coreUsersUpdate"></a>
# **coreUsersUpdate**
> User coreUsersUpdate(id, userRequest)



User Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    UserRequest userRequest = new UserRequest(); // UserRequest | 
    try {
      User result = apiInstance.coreUsersUpdate(id, userRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersUpdate");
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
| **userRequest** | [**UserRequest**](UserRequest.md)|  | |

### Return type

[**User**](User.md)

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

<a id="coreUsersUsedByList"></a>
# **coreUsersUsedByList**
> List&lt;UsedBy&gt; coreUsersUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this User.
    try {
      List<UsedBy> result = apiInstance.coreUsersUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#coreUsersUsedByList");
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

