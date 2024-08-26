# PoliciesApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**policiesAllCacheClearCreate**](PoliciesApi.md#policiesAllCacheClearCreate) | **POST** /policies/all/cache_clear/ |  |
| [**policiesAllCacheInfoRetrieve**](PoliciesApi.md#policiesAllCacheInfoRetrieve) | **GET** /policies/all/cache_info/ |  |
| [**policiesAllDestroy**](PoliciesApi.md#policiesAllDestroy) | **DELETE** /policies/all/{policy_uuid}/ |  |
| [**policiesAllList**](PoliciesApi.md#policiesAllList) | **GET** /policies/all/ |  |
| [**policiesAllRetrieve**](PoliciesApi.md#policiesAllRetrieve) | **GET** /policies/all/{policy_uuid}/ |  |
| [**policiesAllTestCreate**](PoliciesApi.md#policiesAllTestCreate) | **POST** /policies/all/{policy_uuid}/test/ |  |
| [**policiesAllTypesList**](PoliciesApi.md#policiesAllTypesList) | **GET** /policies/all/types/ |  |
| [**policiesAllUsedByList**](PoliciesApi.md#policiesAllUsedByList) | **GET** /policies/all/{policy_uuid}/used_by/ |  |
| [**policiesBindingsCreate**](PoliciesApi.md#policiesBindingsCreate) | **POST** /policies/bindings/ |  |
| [**policiesBindingsDestroy**](PoliciesApi.md#policiesBindingsDestroy) | **DELETE** /policies/bindings/{policy_binding_uuid}/ |  |
| [**policiesBindingsList**](PoliciesApi.md#policiesBindingsList) | **GET** /policies/bindings/ |  |
| [**policiesBindingsPartialUpdate**](PoliciesApi.md#policiesBindingsPartialUpdate) | **PATCH** /policies/bindings/{policy_binding_uuid}/ |  |
| [**policiesBindingsRetrieve**](PoliciesApi.md#policiesBindingsRetrieve) | **GET** /policies/bindings/{policy_binding_uuid}/ |  |
| [**policiesBindingsUpdate**](PoliciesApi.md#policiesBindingsUpdate) | **PUT** /policies/bindings/{policy_binding_uuid}/ |  |
| [**policiesBindingsUsedByList**](PoliciesApi.md#policiesBindingsUsedByList) | **GET** /policies/bindings/{policy_binding_uuid}/used_by/ |  |
| [**policiesDummyCreate**](PoliciesApi.md#policiesDummyCreate) | **POST** /policies/dummy/ |  |
| [**policiesDummyDestroy**](PoliciesApi.md#policiesDummyDestroy) | **DELETE** /policies/dummy/{policy_uuid}/ |  |
| [**policiesDummyList**](PoliciesApi.md#policiesDummyList) | **GET** /policies/dummy/ |  |
| [**policiesDummyPartialUpdate**](PoliciesApi.md#policiesDummyPartialUpdate) | **PATCH** /policies/dummy/{policy_uuid}/ |  |
| [**policiesDummyRetrieve**](PoliciesApi.md#policiesDummyRetrieve) | **GET** /policies/dummy/{policy_uuid}/ |  |
| [**policiesDummyUpdate**](PoliciesApi.md#policiesDummyUpdate) | **PUT** /policies/dummy/{policy_uuid}/ |  |
| [**policiesDummyUsedByList**](PoliciesApi.md#policiesDummyUsedByList) | **GET** /policies/dummy/{policy_uuid}/used_by/ |  |
| [**policiesEventMatcherCreate**](PoliciesApi.md#policiesEventMatcherCreate) | **POST** /policies/event_matcher/ |  |
| [**policiesEventMatcherDestroy**](PoliciesApi.md#policiesEventMatcherDestroy) | **DELETE** /policies/event_matcher/{policy_uuid}/ |  |
| [**policiesEventMatcherList**](PoliciesApi.md#policiesEventMatcherList) | **GET** /policies/event_matcher/ |  |
| [**policiesEventMatcherPartialUpdate**](PoliciesApi.md#policiesEventMatcherPartialUpdate) | **PATCH** /policies/event_matcher/{policy_uuid}/ |  |
| [**policiesEventMatcherRetrieve**](PoliciesApi.md#policiesEventMatcherRetrieve) | **GET** /policies/event_matcher/{policy_uuid}/ |  |
| [**policiesEventMatcherUpdate**](PoliciesApi.md#policiesEventMatcherUpdate) | **PUT** /policies/event_matcher/{policy_uuid}/ |  |
| [**policiesEventMatcherUsedByList**](PoliciesApi.md#policiesEventMatcherUsedByList) | **GET** /policies/event_matcher/{policy_uuid}/used_by/ |  |
| [**policiesExpressionCreate**](PoliciesApi.md#policiesExpressionCreate) | **POST** /policies/expression/ |  |
| [**policiesExpressionDestroy**](PoliciesApi.md#policiesExpressionDestroy) | **DELETE** /policies/expression/{policy_uuid}/ |  |
| [**policiesExpressionList**](PoliciesApi.md#policiesExpressionList) | **GET** /policies/expression/ |  |
| [**policiesExpressionPartialUpdate**](PoliciesApi.md#policiesExpressionPartialUpdate) | **PATCH** /policies/expression/{policy_uuid}/ |  |
| [**policiesExpressionRetrieve**](PoliciesApi.md#policiesExpressionRetrieve) | **GET** /policies/expression/{policy_uuid}/ |  |
| [**policiesExpressionUpdate**](PoliciesApi.md#policiesExpressionUpdate) | **PUT** /policies/expression/{policy_uuid}/ |  |
| [**policiesExpressionUsedByList**](PoliciesApi.md#policiesExpressionUsedByList) | **GET** /policies/expression/{policy_uuid}/used_by/ |  |
| [**policiesPasswordCreate**](PoliciesApi.md#policiesPasswordCreate) | **POST** /policies/password/ |  |
| [**policiesPasswordDestroy**](PoliciesApi.md#policiesPasswordDestroy) | **DELETE** /policies/password/{policy_uuid}/ |  |
| [**policiesPasswordExpiryCreate**](PoliciesApi.md#policiesPasswordExpiryCreate) | **POST** /policies/password_expiry/ |  |
| [**policiesPasswordExpiryDestroy**](PoliciesApi.md#policiesPasswordExpiryDestroy) | **DELETE** /policies/password_expiry/{policy_uuid}/ |  |
| [**policiesPasswordExpiryList**](PoliciesApi.md#policiesPasswordExpiryList) | **GET** /policies/password_expiry/ |  |
| [**policiesPasswordExpiryPartialUpdate**](PoliciesApi.md#policiesPasswordExpiryPartialUpdate) | **PATCH** /policies/password_expiry/{policy_uuid}/ |  |
| [**policiesPasswordExpiryRetrieve**](PoliciesApi.md#policiesPasswordExpiryRetrieve) | **GET** /policies/password_expiry/{policy_uuid}/ |  |
| [**policiesPasswordExpiryUpdate**](PoliciesApi.md#policiesPasswordExpiryUpdate) | **PUT** /policies/password_expiry/{policy_uuid}/ |  |
| [**policiesPasswordExpiryUsedByList**](PoliciesApi.md#policiesPasswordExpiryUsedByList) | **GET** /policies/password_expiry/{policy_uuid}/used_by/ |  |
| [**policiesPasswordList**](PoliciesApi.md#policiesPasswordList) | **GET** /policies/password/ |  |
| [**policiesPasswordPartialUpdate**](PoliciesApi.md#policiesPasswordPartialUpdate) | **PATCH** /policies/password/{policy_uuid}/ |  |
| [**policiesPasswordRetrieve**](PoliciesApi.md#policiesPasswordRetrieve) | **GET** /policies/password/{policy_uuid}/ |  |
| [**policiesPasswordUpdate**](PoliciesApi.md#policiesPasswordUpdate) | **PUT** /policies/password/{policy_uuid}/ |  |
| [**policiesPasswordUsedByList**](PoliciesApi.md#policiesPasswordUsedByList) | **GET** /policies/password/{policy_uuid}/used_by/ |  |
| [**policiesReputationCreate**](PoliciesApi.md#policiesReputationCreate) | **POST** /policies/reputation/ |  |
| [**policiesReputationDestroy**](PoliciesApi.md#policiesReputationDestroy) | **DELETE** /policies/reputation/{policy_uuid}/ |  |
| [**policiesReputationList**](PoliciesApi.md#policiesReputationList) | **GET** /policies/reputation/ |  |
| [**policiesReputationPartialUpdate**](PoliciesApi.md#policiesReputationPartialUpdate) | **PATCH** /policies/reputation/{policy_uuid}/ |  |
| [**policiesReputationRetrieve**](PoliciesApi.md#policiesReputationRetrieve) | **GET** /policies/reputation/{policy_uuid}/ |  |
| [**policiesReputationScoresDestroy**](PoliciesApi.md#policiesReputationScoresDestroy) | **DELETE** /policies/reputation/scores/{reputation_uuid}/ |  |
| [**policiesReputationScoresList**](PoliciesApi.md#policiesReputationScoresList) | **GET** /policies/reputation/scores/ |  |
| [**policiesReputationScoresRetrieve**](PoliciesApi.md#policiesReputationScoresRetrieve) | **GET** /policies/reputation/scores/{reputation_uuid}/ |  |
| [**policiesReputationScoresUsedByList**](PoliciesApi.md#policiesReputationScoresUsedByList) | **GET** /policies/reputation/scores/{reputation_uuid}/used_by/ |  |
| [**policiesReputationUpdate**](PoliciesApi.md#policiesReputationUpdate) | **PUT** /policies/reputation/{policy_uuid}/ |  |
| [**policiesReputationUsedByList**](PoliciesApi.md#policiesReputationUsedByList) | **GET** /policies/reputation/{policy_uuid}/used_by/ |  |


<a id="policiesAllCacheClearCreate"></a>
# **policiesAllCacheClearCreate**
> policiesAllCacheClearCreate()



Clear policy cache

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    try {
      apiInstance.policiesAllCacheClearCreate();
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesAllCacheClearCreate");
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
| **204** | Successfully cleared cache |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="policiesAllCacheInfoRetrieve"></a>
# **policiesAllCacheInfoRetrieve**
> Cache policiesAllCacheInfoRetrieve()



Info about cached policies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    try {
      Cache result = apiInstance.policiesAllCacheInfoRetrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesAllCacheInfoRetrieve");
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

[**Cache**](Cache.md)

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

<a id="policiesAllDestroy"></a>
# **policiesAllDestroy**
> policiesAllDestroy(policyUuid)



Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Policy.
    try {
      apiInstance.policiesAllDestroy(policyUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesAllDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Policy. | |

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

<a id="policiesAllList"></a>
# **policiesAllList**
> PaginatedPolicyList policiesAllList(bindingsIsnull, ordering, page, pageSize, promptstageIsnull, search)



Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    Boolean bindingsIsnull = true; // Boolean | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Boolean promptstageIsnull = true; // Boolean | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedPolicyList result = apiInstance.policiesAllList(bindingsIsnull, ordering, page, pageSize, promptstageIsnull, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesAllList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bindingsIsnull** | **Boolean**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **promptstageIsnull** | **Boolean**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedPolicyList**](PaginatedPolicyList.md)

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

<a id="policiesAllRetrieve"></a>
# **policiesAllRetrieve**
> Policy policiesAllRetrieve(policyUuid)



Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Policy.
    try {
      Policy result = apiInstance.policiesAllRetrieve(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesAllRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Policy. | |

### Return type

[**Policy**](Policy.md)

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

<a id="policiesAllTestCreate"></a>
# **policiesAllTestCreate**
> PolicyTestResult policiesAllTestCreate(policyUuid, policyTestRequest)



Test policy

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Policy.
    PolicyTestRequest policyTestRequest = new PolicyTestRequest(); // PolicyTestRequest | 
    try {
      PolicyTestResult result = apiInstance.policiesAllTestCreate(policyUuid, policyTestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesAllTestCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Policy. | |
| **policyTestRequest** | [**PolicyTestRequest**](PolicyTestRequest.md)|  | |

### Return type

[**PolicyTestResult**](PolicyTestResult.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Invalid parameters |  -  |
| **403** |  |  -  |

<a id="policiesAllTypesList"></a>
# **policiesAllTypesList**
> List&lt;TypeCreate&gt; policiesAllTypesList()



Get all creatable types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    try {
      List<TypeCreate> result = apiInstance.policiesAllTypesList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesAllTypesList");
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

<a id="policiesAllUsedByList"></a>
# **policiesAllUsedByList**
> List&lt;UsedBy&gt; policiesAllUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Policy.
    try {
      List<UsedBy> result = apiInstance.policiesAllUsedByList(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesAllUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Policy. | |

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

<a id="policiesBindingsCreate"></a>
# **policiesBindingsCreate**
> PolicyBinding policiesBindingsCreate(policyBindingRequest)



PolicyBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    PolicyBindingRequest policyBindingRequest = new PolicyBindingRequest(); // PolicyBindingRequest | 
    try {
      PolicyBinding result = apiInstance.policiesBindingsCreate(policyBindingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesBindingsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyBindingRequest** | [**PolicyBindingRequest**](PolicyBindingRequest.md)|  | |

### Return type

[**PolicyBinding**](PolicyBinding.md)

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

<a id="policiesBindingsDestroy"></a>
# **policiesBindingsDestroy**
> policiesBindingsDestroy(policyBindingUuid)



PolicyBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyBindingUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Policy Binding.
    try {
      apiInstance.policiesBindingsDestroy(policyBindingUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesBindingsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyBindingUuid** | **UUID**| A UUID string identifying this Policy Binding. | |

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

<a id="policiesBindingsList"></a>
# **policiesBindingsList**
> PaginatedPolicyBindingList policiesBindingsList(enabled, order, ordering, page, pageSize, policy, policyIsnull, search, target, targetIn, timeout)



PolicyBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    Boolean enabled = true; // Boolean | 
    Integer order = 56; // Integer | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID policy = UUID.randomUUID(); // UUID | 
    Boolean policyIsnull = true; // Boolean | 
    String search = "search_example"; // String | A search term.
    UUID target = UUID.randomUUID(); // UUID | 
    List<UUID> targetIn = Arrays.asList(); // List<UUID> | 
    Integer timeout = 56; // Integer | 
    try {
      PaginatedPolicyBindingList result = apiInstance.policiesBindingsList(enabled, order, ordering, page, pageSize, policy, policyIsnull, search, target, targetIn, timeout);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesBindingsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **enabled** | **Boolean**|  | [optional] |
| **order** | **Integer**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **policy** | **UUID**|  | [optional] |
| **policyIsnull** | **Boolean**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **target** | **UUID**|  | [optional] |
| **targetIn** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **timeout** | **Integer**|  | [optional] |

### Return type

[**PaginatedPolicyBindingList**](PaginatedPolicyBindingList.md)

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

<a id="policiesBindingsPartialUpdate"></a>
# **policiesBindingsPartialUpdate**
> PolicyBinding policiesBindingsPartialUpdate(policyBindingUuid, patchedPolicyBindingRequest)



PolicyBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyBindingUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Policy Binding.
    PatchedPolicyBindingRequest patchedPolicyBindingRequest = new PatchedPolicyBindingRequest(); // PatchedPolicyBindingRequest | 
    try {
      PolicyBinding result = apiInstance.policiesBindingsPartialUpdate(policyBindingUuid, patchedPolicyBindingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesBindingsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyBindingUuid** | **UUID**| A UUID string identifying this Policy Binding. | |
| **patchedPolicyBindingRequest** | [**PatchedPolicyBindingRequest**](PatchedPolicyBindingRequest.md)|  | [optional] |

### Return type

[**PolicyBinding**](PolicyBinding.md)

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

<a id="policiesBindingsRetrieve"></a>
# **policiesBindingsRetrieve**
> PolicyBinding policiesBindingsRetrieve(policyBindingUuid)



PolicyBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyBindingUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Policy Binding.
    try {
      PolicyBinding result = apiInstance.policiesBindingsRetrieve(policyBindingUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesBindingsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyBindingUuid** | **UUID**| A UUID string identifying this Policy Binding. | |

### Return type

[**PolicyBinding**](PolicyBinding.md)

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

<a id="policiesBindingsUpdate"></a>
# **policiesBindingsUpdate**
> PolicyBinding policiesBindingsUpdate(policyBindingUuid, policyBindingRequest)



PolicyBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyBindingUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Policy Binding.
    PolicyBindingRequest policyBindingRequest = new PolicyBindingRequest(); // PolicyBindingRequest | 
    try {
      PolicyBinding result = apiInstance.policiesBindingsUpdate(policyBindingUuid, policyBindingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesBindingsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyBindingUuid** | **UUID**| A UUID string identifying this Policy Binding. | |
| **policyBindingRequest** | [**PolicyBindingRequest**](PolicyBindingRequest.md)|  | |

### Return type

[**PolicyBinding**](PolicyBinding.md)

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

<a id="policiesBindingsUsedByList"></a>
# **policiesBindingsUsedByList**
> List&lt;UsedBy&gt; policiesBindingsUsedByList(policyBindingUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyBindingUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Policy Binding.
    try {
      List<UsedBy> result = apiInstance.policiesBindingsUsedByList(policyBindingUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesBindingsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyBindingUuid** | **UUID**| A UUID string identifying this Policy Binding. | |

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

<a id="policiesDummyCreate"></a>
# **policiesDummyCreate**
> DummyPolicy policiesDummyCreate(dummyPolicyRequest)



Dummy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    DummyPolicyRequest dummyPolicyRequest = new DummyPolicyRequest(); // DummyPolicyRequest | 
    try {
      DummyPolicy result = apiInstance.policiesDummyCreate(dummyPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesDummyCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dummyPolicyRequest** | [**DummyPolicyRequest**](DummyPolicyRequest.md)|  | |

### Return type

[**DummyPolicy**](DummyPolicy.md)

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

<a id="policiesDummyDestroy"></a>
# **policiesDummyDestroy**
> policiesDummyDestroy(policyUuid)



Dummy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Policy.
    try {
      apiInstance.policiesDummyDestroy(policyUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesDummyDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Dummy Policy. | |

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

<a id="policiesDummyList"></a>
# **policiesDummyList**
> PaginatedDummyPolicyList policiesDummyList(created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, result, search, waitMax, waitMin)



Dummy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | 
    Boolean executionLogging = true; // Boolean | 
    OffsetDateTime lastUpdated = OffsetDateTime.now(); // OffsetDateTime | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID policyUuid = UUID.randomUUID(); // UUID | 
    Boolean result = true; // Boolean | 
    String search = "search_example"; // String | A search term.
    Integer waitMax = 56; // Integer | 
    Integer waitMin = 56; // Integer | 
    try {
      PaginatedDummyPolicyList result = apiInstance.policiesDummyList(created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, result, search, waitMax, waitMin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesDummyList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **created** | **OffsetDateTime**|  | [optional] |
| **executionLogging** | **Boolean**|  | [optional] |
| **lastUpdated** | **OffsetDateTime**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **policyUuid** | **UUID**|  | [optional] |
| **result** | **Boolean**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **waitMax** | **Integer**|  | [optional] |
| **waitMin** | **Integer**|  | [optional] |

### Return type

[**PaginatedDummyPolicyList**](PaginatedDummyPolicyList.md)

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

<a id="policiesDummyPartialUpdate"></a>
# **policiesDummyPartialUpdate**
> DummyPolicy policiesDummyPartialUpdate(policyUuid, patchedDummyPolicyRequest)



Dummy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Policy.
    PatchedDummyPolicyRequest patchedDummyPolicyRequest = new PatchedDummyPolicyRequest(); // PatchedDummyPolicyRequest | 
    try {
      DummyPolicy result = apiInstance.policiesDummyPartialUpdate(policyUuid, patchedDummyPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesDummyPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Dummy Policy. | |
| **patchedDummyPolicyRequest** | [**PatchedDummyPolicyRequest**](PatchedDummyPolicyRequest.md)|  | [optional] |

### Return type

[**DummyPolicy**](DummyPolicy.md)

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

<a id="policiesDummyRetrieve"></a>
# **policiesDummyRetrieve**
> DummyPolicy policiesDummyRetrieve(policyUuid)



Dummy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Policy.
    try {
      DummyPolicy result = apiInstance.policiesDummyRetrieve(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesDummyRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Dummy Policy. | |

### Return type

[**DummyPolicy**](DummyPolicy.md)

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

<a id="policiesDummyUpdate"></a>
# **policiesDummyUpdate**
> DummyPolicy policiesDummyUpdate(policyUuid, dummyPolicyRequest)



Dummy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Policy.
    DummyPolicyRequest dummyPolicyRequest = new DummyPolicyRequest(); // DummyPolicyRequest | 
    try {
      DummyPolicy result = apiInstance.policiesDummyUpdate(policyUuid, dummyPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesDummyUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Dummy Policy. | |
| **dummyPolicyRequest** | [**DummyPolicyRequest**](DummyPolicyRequest.md)|  | |

### Return type

[**DummyPolicy**](DummyPolicy.md)

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

<a id="policiesDummyUsedByList"></a>
# **policiesDummyUsedByList**
> List&lt;UsedBy&gt; policiesDummyUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Policy.
    try {
      List<UsedBy> result = apiInstance.policiesDummyUsedByList(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesDummyUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Dummy Policy. | |

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

<a id="policiesEventMatcherCreate"></a>
# **policiesEventMatcherCreate**
> EventMatcherPolicy policiesEventMatcherCreate(eventMatcherPolicyRequest)



Event Matcher Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    EventMatcherPolicyRequest eventMatcherPolicyRequest = new EventMatcherPolicyRequest(); // EventMatcherPolicyRequest | 
    try {
      EventMatcherPolicy result = apiInstance.policiesEventMatcherCreate(eventMatcherPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesEventMatcherCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **eventMatcherPolicyRequest** | [**EventMatcherPolicyRequest**](EventMatcherPolicyRequest.md)|  | |

### Return type

[**EventMatcherPolicy**](EventMatcherPolicy.md)

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

<a id="policiesEventMatcherDestroy"></a>
# **policiesEventMatcherDestroy**
> policiesEventMatcherDestroy(policyUuid)



Event Matcher Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Event Matcher Policy.
    try {
      apiInstance.policiesEventMatcherDestroy(policyUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesEventMatcherDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Event Matcher Policy. | |

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

<a id="policiesEventMatcherList"></a>
# **policiesEventMatcherList**
> PaginatedEventMatcherPolicyList policiesEventMatcherList(action, app, clientIp, created, executionLogging, lastUpdated, model, name, ordering, page, pageSize, policyUuid, search)



Event Matcher Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String action = "authorize_application"; // String | Match created events with this action type. When left empty, all action types will be matched.  
    String app = "app_example"; // String | 
    String clientIp = "clientIp_example"; // String | 
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | 
    Boolean executionLogging = true; // Boolean | 
    OffsetDateTime lastUpdated = OffsetDateTime.now(); // OffsetDateTime | 
    String model = "model_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID policyUuid = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedEventMatcherPolicyList result = apiInstance.policiesEventMatcherList(action, app, clientIp, created, executionLogging, lastUpdated, model, name, ordering, page, pageSize, policyUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesEventMatcherList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**| Match created events with this action type. When left empty, all action types will be matched.   | [optional] [enum: authorize_application, configuration_error, custom_, email_sent, flow_execution, impersonation_ended, impersonation_started, invitation_used, login, login_failed, logout, model_created, model_deleted, model_updated, password_set, policy_exception, policy_execution, property_mapping_exception, secret_rotate, secret_view, source_linked, suspicious_request, system_exception, system_task_exception, system_task_execution, update_available, user_write] |
| **app** | **String**|  | [optional] |
| **clientIp** | **String**|  | [optional] |
| **created** | **OffsetDateTime**|  | [optional] |
| **executionLogging** | **Boolean**|  | [optional] |
| **lastUpdated** | **OffsetDateTime**|  | [optional] |
| **model** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **policyUuid** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedEventMatcherPolicyList**](PaginatedEventMatcherPolicyList.md)

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

<a id="policiesEventMatcherPartialUpdate"></a>
# **policiesEventMatcherPartialUpdate**
> EventMatcherPolicy policiesEventMatcherPartialUpdate(policyUuid, patchedEventMatcherPolicyRequest)



Event Matcher Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Event Matcher Policy.
    PatchedEventMatcherPolicyRequest patchedEventMatcherPolicyRequest = new PatchedEventMatcherPolicyRequest(); // PatchedEventMatcherPolicyRequest | 
    try {
      EventMatcherPolicy result = apiInstance.policiesEventMatcherPartialUpdate(policyUuid, patchedEventMatcherPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesEventMatcherPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Event Matcher Policy. | |
| **patchedEventMatcherPolicyRequest** | [**PatchedEventMatcherPolicyRequest**](PatchedEventMatcherPolicyRequest.md)|  | [optional] |

### Return type

[**EventMatcherPolicy**](EventMatcherPolicy.md)

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

<a id="policiesEventMatcherRetrieve"></a>
# **policiesEventMatcherRetrieve**
> EventMatcherPolicy policiesEventMatcherRetrieve(policyUuid)



Event Matcher Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Event Matcher Policy.
    try {
      EventMatcherPolicy result = apiInstance.policiesEventMatcherRetrieve(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesEventMatcherRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Event Matcher Policy. | |

### Return type

[**EventMatcherPolicy**](EventMatcherPolicy.md)

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

<a id="policiesEventMatcherUpdate"></a>
# **policiesEventMatcherUpdate**
> EventMatcherPolicy policiesEventMatcherUpdate(policyUuid, eventMatcherPolicyRequest)



Event Matcher Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Event Matcher Policy.
    EventMatcherPolicyRequest eventMatcherPolicyRequest = new EventMatcherPolicyRequest(); // EventMatcherPolicyRequest | 
    try {
      EventMatcherPolicy result = apiInstance.policiesEventMatcherUpdate(policyUuid, eventMatcherPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesEventMatcherUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Event Matcher Policy. | |
| **eventMatcherPolicyRequest** | [**EventMatcherPolicyRequest**](EventMatcherPolicyRequest.md)|  | |

### Return type

[**EventMatcherPolicy**](EventMatcherPolicy.md)

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

<a id="policiesEventMatcherUsedByList"></a>
# **policiesEventMatcherUsedByList**
> List&lt;UsedBy&gt; policiesEventMatcherUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Event Matcher Policy.
    try {
      List<UsedBy> result = apiInstance.policiesEventMatcherUsedByList(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesEventMatcherUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Event Matcher Policy. | |

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

<a id="policiesExpressionCreate"></a>
# **policiesExpressionCreate**
> ExpressionPolicy policiesExpressionCreate(expressionPolicyRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    ExpressionPolicyRequest expressionPolicyRequest = new ExpressionPolicyRequest(); // ExpressionPolicyRequest | 
    try {
      ExpressionPolicy result = apiInstance.policiesExpressionCreate(expressionPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesExpressionCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expressionPolicyRequest** | [**ExpressionPolicyRequest**](ExpressionPolicyRequest.md)|  | |

### Return type

[**ExpressionPolicy**](ExpressionPolicy.md)

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

<a id="policiesExpressionDestroy"></a>
# **policiesExpressionDestroy**
> policiesExpressionDestroy(policyUuid)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Expression Policy.
    try {
      apiInstance.policiesExpressionDestroy(policyUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesExpressionDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Expression Policy. | |

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

<a id="policiesExpressionList"></a>
# **policiesExpressionList**
> PaginatedExpressionPolicyList policiesExpressionList(created, executionLogging, expression, lastUpdated, name, ordering, page, pageSize, policyUuid, search)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | 
    Boolean executionLogging = true; // Boolean | 
    String expression = "expression_example"; // String | 
    OffsetDateTime lastUpdated = OffsetDateTime.now(); // OffsetDateTime | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID policyUuid = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedExpressionPolicyList result = apiInstance.policiesExpressionList(created, executionLogging, expression, lastUpdated, name, ordering, page, pageSize, policyUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesExpressionList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **created** | **OffsetDateTime**|  | [optional] |
| **executionLogging** | **Boolean**|  | [optional] |
| **expression** | **String**|  | [optional] |
| **lastUpdated** | **OffsetDateTime**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **policyUuid** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedExpressionPolicyList**](PaginatedExpressionPolicyList.md)

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

<a id="policiesExpressionPartialUpdate"></a>
# **policiesExpressionPartialUpdate**
> ExpressionPolicy policiesExpressionPartialUpdate(policyUuid, patchedExpressionPolicyRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Expression Policy.
    PatchedExpressionPolicyRequest patchedExpressionPolicyRequest = new PatchedExpressionPolicyRequest(); // PatchedExpressionPolicyRequest | 
    try {
      ExpressionPolicy result = apiInstance.policiesExpressionPartialUpdate(policyUuid, patchedExpressionPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesExpressionPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Expression Policy. | |
| **patchedExpressionPolicyRequest** | [**PatchedExpressionPolicyRequest**](PatchedExpressionPolicyRequest.md)|  | [optional] |

### Return type

[**ExpressionPolicy**](ExpressionPolicy.md)

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

<a id="policiesExpressionRetrieve"></a>
# **policiesExpressionRetrieve**
> ExpressionPolicy policiesExpressionRetrieve(policyUuid)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Expression Policy.
    try {
      ExpressionPolicy result = apiInstance.policiesExpressionRetrieve(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesExpressionRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Expression Policy. | |

### Return type

[**ExpressionPolicy**](ExpressionPolicy.md)

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

<a id="policiesExpressionUpdate"></a>
# **policiesExpressionUpdate**
> ExpressionPolicy policiesExpressionUpdate(policyUuid, expressionPolicyRequest)



Source Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Expression Policy.
    ExpressionPolicyRequest expressionPolicyRequest = new ExpressionPolicyRequest(); // ExpressionPolicyRequest | 
    try {
      ExpressionPolicy result = apiInstance.policiesExpressionUpdate(policyUuid, expressionPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesExpressionUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Expression Policy. | |
| **expressionPolicyRequest** | [**ExpressionPolicyRequest**](ExpressionPolicyRequest.md)|  | |

### Return type

[**ExpressionPolicy**](ExpressionPolicy.md)

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

<a id="policiesExpressionUsedByList"></a>
# **policiesExpressionUsedByList**
> List&lt;UsedBy&gt; policiesExpressionUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Expression Policy.
    try {
      List<UsedBy> result = apiInstance.policiesExpressionUsedByList(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesExpressionUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Expression Policy. | |

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

<a id="policiesPasswordCreate"></a>
# **policiesPasswordCreate**
> PasswordPolicy policiesPasswordCreate(passwordPolicyRequest)



Password Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    PasswordPolicyRequest passwordPolicyRequest = new PasswordPolicyRequest(); // PasswordPolicyRequest | 
    try {
      PasswordPolicy result = apiInstance.policiesPasswordCreate(passwordPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **passwordPolicyRequest** | [**PasswordPolicyRequest**](PasswordPolicyRequest.md)|  | |

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

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

<a id="policiesPasswordDestroy"></a>
# **policiesPasswordDestroy**
> policiesPasswordDestroy(policyUuid)



Password Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Policy.
    try {
      apiInstance.policiesPasswordDestroy(policyUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Policy. | |

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

<a id="policiesPasswordExpiryCreate"></a>
# **policiesPasswordExpiryCreate**
> PasswordExpiryPolicy policiesPasswordExpiryCreate(passwordExpiryPolicyRequest)



Password Expiry Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    PasswordExpiryPolicyRequest passwordExpiryPolicyRequest = new PasswordExpiryPolicyRequest(); // PasswordExpiryPolicyRequest | 
    try {
      PasswordExpiryPolicy result = apiInstance.policiesPasswordExpiryCreate(passwordExpiryPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordExpiryCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **passwordExpiryPolicyRequest** | [**PasswordExpiryPolicyRequest**](PasswordExpiryPolicyRequest.md)|  | |

### Return type

[**PasswordExpiryPolicy**](PasswordExpiryPolicy.md)

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

<a id="policiesPasswordExpiryDestroy"></a>
# **policiesPasswordExpiryDestroy**
> policiesPasswordExpiryDestroy(policyUuid)



Password Expiry Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Expiry Policy.
    try {
      apiInstance.policiesPasswordExpiryDestroy(policyUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordExpiryDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Expiry Policy. | |

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

<a id="policiesPasswordExpiryList"></a>
# **policiesPasswordExpiryList**
> PaginatedPasswordExpiryPolicyList policiesPasswordExpiryList(created, days, denyOnly, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search)



Password Expiry Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | 
    Integer days = 56; // Integer | 
    Boolean denyOnly = true; // Boolean | 
    Boolean executionLogging = true; // Boolean | 
    OffsetDateTime lastUpdated = OffsetDateTime.now(); // OffsetDateTime | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID policyUuid = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedPasswordExpiryPolicyList result = apiInstance.policiesPasswordExpiryList(created, days, denyOnly, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordExpiryList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **created** | **OffsetDateTime**|  | [optional] |
| **days** | **Integer**|  | [optional] |
| **denyOnly** | **Boolean**|  | [optional] |
| **executionLogging** | **Boolean**|  | [optional] |
| **lastUpdated** | **OffsetDateTime**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **policyUuid** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedPasswordExpiryPolicyList**](PaginatedPasswordExpiryPolicyList.md)

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

<a id="policiesPasswordExpiryPartialUpdate"></a>
# **policiesPasswordExpiryPartialUpdate**
> PasswordExpiryPolicy policiesPasswordExpiryPartialUpdate(policyUuid, patchedPasswordExpiryPolicyRequest)



Password Expiry Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Expiry Policy.
    PatchedPasswordExpiryPolicyRequest patchedPasswordExpiryPolicyRequest = new PatchedPasswordExpiryPolicyRequest(); // PatchedPasswordExpiryPolicyRequest | 
    try {
      PasswordExpiryPolicy result = apiInstance.policiesPasswordExpiryPartialUpdate(policyUuid, patchedPasswordExpiryPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordExpiryPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Expiry Policy. | |
| **patchedPasswordExpiryPolicyRequest** | [**PatchedPasswordExpiryPolicyRequest**](PatchedPasswordExpiryPolicyRequest.md)|  | [optional] |

### Return type

[**PasswordExpiryPolicy**](PasswordExpiryPolicy.md)

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

<a id="policiesPasswordExpiryRetrieve"></a>
# **policiesPasswordExpiryRetrieve**
> PasswordExpiryPolicy policiesPasswordExpiryRetrieve(policyUuid)



Password Expiry Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Expiry Policy.
    try {
      PasswordExpiryPolicy result = apiInstance.policiesPasswordExpiryRetrieve(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordExpiryRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Expiry Policy. | |

### Return type

[**PasswordExpiryPolicy**](PasswordExpiryPolicy.md)

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

<a id="policiesPasswordExpiryUpdate"></a>
# **policiesPasswordExpiryUpdate**
> PasswordExpiryPolicy policiesPasswordExpiryUpdate(policyUuid, passwordExpiryPolicyRequest)



Password Expiry Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Expiry Policy.
    PasswordExpiryPolicyRequest passwordExpiryPolicyRequest = new PasswordExpiryPolicyRequest(); // PasswordExpiryPolicyRequest | 
    try {
      PasswordExpiryPolicy result = apiInstance.policiesPasswordExpiryUpdate(policyUuid, passwordExpiryPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordExpiryUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Expiry Policy. | |
| **passwordExpiryPolicyRequest** | [**PasswordExpiryPolicyRequest**](PasswordExpiryPolicyRequest.md)|  | |

### Return type

[**PasswordExpiryPolicy**](PasswordExpiryPolicy.md)

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

<a id="policiesPasswordExpiryUsedByList"></a>
# **policiesPasswordExpiryUsedByList**
> List&lt;UsedBy&gt; policiesPasswordExpiryUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Expiry Policy.
    try {
      List<UsedBy> result = apiInstance.policiesPasswordExpiryUsedByList(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordExpiryUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Expiry Policy. | |

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

<a id="policiesPasswordList"></a>
# **policiesPasswordList**
> PaginatedPasswordPolicyList policiesPasswordList(amountDigits, amountLowercase, amountSymbols, amountUppercase, checkHaveIBeenPwned, checkStaticRules, checkZxcvbn, created, errorMessage, executionLogging, hibpAllowedCount, lastUpdated, lengthMin, name, ordering, page, pageSize, passwordField, policyUuid, search, symbolCharset, zxcvbnScoreThreshold)



Password Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    Integer amountDigits = 56; // Integer | 
    Integer amountLowercase = 56; // Integer | 
    Integer amountSymbols = 56; // Integer | 
    Integer amountUppercase = 56; // Integer | 
    Boolean checkHaveIBeenPwned = true; // Boolean | 
    Boolean checkStaticRules = true; // Boolean | 
    Boolean checkZxcvbn = true; // Boolean | 
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | 
    String errorMessage = "errorMessage_example"; // String | 
    Boolean executionLogging = true; // Boolean | 
    Integer hibpAllowedCount = 56; // Integer | 
    OffsetDateTime lastUpdated = OffsetDateTime.now(); // OffsetDateTime | 
    Integer lengthMin = 56; // Integer | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String passwordField = "passwordField_example"; // String | 
    UUID policyUuid = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    String symbolCharset = "symbolCharset_example"; // String | 
    Integer zxcvbnScoreThreshold = 56; // Integer | 
    try {
      PaginatedPasswordPolicyList result = apiInstance.policiesPasswordList(amountDigits, amountLowercase, amountSymbols, amountUppercase, checkHaveIBeenPwned, checkStaticRules, checkZxcvbn, created, errorMessage, executionLogging, hibpAllowedCount, lastUpdated, lengthMin, name, ordering, page, pageSize, passwordField, policyUuid, search, symbolCharset, zxcvbnScoreThreshold);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **amountDigits** | **Integer**|  | [optional] |
| **amountLowercase** | **Integer**|  | [optional] |
| **amountSymbols** | **Integer**|  | [optional] |
| **amountUppercase** | **Integer**|  | [optional] |
| **checkHaveIBeenPwned** | **Boolean**|  | [optional] |
| **checkStaticRules** | **Boolean**|  | [optional] |
| **checkZxcvbn** | **Boolean**|  | [optional] |
| **created** | **OffsetDateTime**|  | [optional] |
| **errorMessage** | **String**|  | [optional] |
| **executionLogging** | **Boolean**|  | [optional] |
| **hibpAllowedCount** | **Integer**|  | [optional] |
| **lastUpdated** | **OffsetDateTime**|  | [optional] |
| **lengthMin** | **Integer**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **passwordField** | **String**|  | [optional] |
| **policyUuid** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **symbolCharset** | **String**|  | [optional] |
| **zxcvbnScoreThreshold** | **Integer**|  | [optional] |

### Return type

[**PaginatedPasswordPolicyList**](PaginatedPasswordPolicyList.md)

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

<a id="policiesPasswordPartialUpdate"></a>
# **policiesPasswordPartialUpdate**
> PasswordPolicy policiesPasswordPartialUpdate(policyUuid, patchedPasswordPolicyRequest)



Password Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Policy.
    PatchedPasswordPolicyRequest patchedPasswordPolicyRequest = new PatchedPasswordPolicyRequest(); // PatchedPasswordPolicyRequest | 
    try {
      PasswordPolicy result = apiInstance.policiesPasswordPartialUpdate(policyUuid, patchedPasswordPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Policy. | |
| **patchedPasswordPolicyRequest** | [**PatchedPasswordPolicyRequest**](PatchedPasswordPolicyRequest.md)|  | [optional] |

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

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

<a id="policiesPasswordRetrieve"></a>
# **policiesPasswordRetrieve**
> PasswordPolicy policiesPasswordRetrieve(policyUuid)



Password Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Policy.
    try {
      PasswordPolicy result = apiInstance.policiesPasswordRetrieve(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Policy. | |

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

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

<a id="policiesPasswordUpdate"></a>
# **policiesPasswordUpdate**
> PasswordPolicy policiesPasswordUpdate(policyUuid, passwordPolicyRequest)



Password Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Policy.
    PasswordPolicyRequest passwordPolicyRequest = new PasswordPolicyRequest(); // PasswordPolicyRequest | 
    try {
      PasswordPolicy result = apiInstance.policiesPasswordUpdate(policyUuid, passwordPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Policy. | |
| **passwordPolicyRequest** | [**PasswordPolicyRequest**](PasswordPolicyRequest.md)|  | |

### Return type

[**PasswordPolicy**](PasswordPolicy.md)

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

<a id="policiesPasswordUsedByList"></a>
# **policiesPasswordUsedByList**
> List&lt;UsedBy&gt; policiesPasswordUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Policy.
    try {
      List<UsedBy> result = apiInstance.policiesPasswordUsedByList(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesPasswordUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Password Policy. | |

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

<a id="policiesReputationCreate"></a>
# **policiesReputationCreate**
> ReputationPolicy policiesReputationCreate(reputationPolicyRequest)



Reputation Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    ReputationPolicyRequest reputationPolicyRequest = new ReputationPolicyRequest(); // ReputationPolicyRequest | 
    try {
      ReputationPolicy result = apiInstance.policiesReputationCreate(reputationPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reputationPolicyRequest** | [**ReputationPolicyRequest**](ReputationPolicyRequest.md)|  | |

### Return type

[**ReputationPolicy**](ReputationPolicy.md)

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

<a id="policiesReputationDestroy"></a>
# **policiesReputationDestroy**
> policiesReputationDestroy(policyUuid)



Reputation Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Reputation Policy.
    try {
      apiInstance.policiesReputationDestroy(policyUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Reputation Policy. | |

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

<a id="policiesReputationList"></a>
# **policiesReputationList**
> PaginatedReputationPolicyList policiesReputationList(checkIp, checkUsername, created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search, threshold)



Reputation Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    Boolean checkIp = true; // Boolean | 
    Boolean checkUsername = true; // Boolean | 
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | 
    Boolean executionLogging = true; // Boolean | 
    OffsetDateTime lastUpdated = OffsetDateTime.now(); // OffsetDateTime | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID policyUuid = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    Integer threshold = 56; // Integer | 
    try {
      PaginatedReputationPolicyList result = apiInstance.policiesReputationList(checkIp, checkUsername, created, executionLogging, lastUpdated, name, ordering, page, pageSize, policyUuid, search, threshold);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **checkIp** | **Boolean**|  | [optional] |
| **checkUsername** | **Boolean**|  | [optional] |
| **created** | **OffsetDateTime**|  | [optional] |
| **executionLogging** | **Boolean**|  | [optional] |
| **lastUpdated** | **OffsetDateTime**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **policyUuid** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **threshold** | **Integer**|  | [optional] |

### Return type

[**PaginatedReputationPolicyList**](PaginatedReputationPolicyList.md)

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

<a id="policiesReputationPartialUpdate"></a>
# **policiesReputationPartialUpdate**
> ReputationPolicy policiesReputationPartialUpdate(policyUuid, patchedReputationPolicyRequest)



Reputation Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Reputation Policy.
    PatchedReputationPolicyRequest patchedReputationPolicyRequest = new PatchedReputationPolicyRequest(); // PatchedReputationPolicyRequest | 
    try {
      ReputationPolicy result = apiInstance.policiesReputationPartialUpdate(policyUuid, patchedReputationPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Reputation Policy. | |
| **patchedReputationPolicyRequest** | [**PatchedReputationPolicyRequest**](PatchedReputationPolicyRequest.md)|  | [optional] |

### Return type

[**ReputationPolicy**](ReputationPolicy.md)

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

<a id="policiesReputationRetrieve"></a>
# **policiesReputationRetrieve**
> ReputationPolicy policiesReputationRetrieve(policyUuid)



Reputation Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Reputation Policy.
    try {
      ReputationPolicy result = apiInstance.policiesReputationRetrieve(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Reputation Policy. | |

### Return type

[**ReputationPolicy**](ReputationPolicy.md)

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

<a id="policiesReputationScoresDestroy"></a>
# **policiesReputationScoresDestroy**
> policiesReputationScoresDestroy(reputationUuid)



Reputation Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID reputationUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Reputation Score.
    try {
      apiInstance.policiesReputationScoresDestroy(reputationUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationScoresDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reputationUuid** | **UUID**| A UUID string identifying this Reputation Score. | |

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

<a id="policiesReputationScoresList"></a>
# **policiesReputationScoresList**
> PaginatedReputationList policiesReputationScoresList(identifier, identifierIn, ip, ordering, page, pageSize, score, search)



Reputation Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    String identifier = "identifier_example"; // String | 
    List<String> identifierIn = Arrays.asList(); // List<String> | Multiple values may be separated by commas.
    String ip = "ip_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer score = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedReputationList result = apiInstance.policiesReputationScoresList(identifier, identifierIn, ip, ordering, page, pageSize, score, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationScoresList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identifier** | **String**|  | [optional] |
| **identifierIn** | [**List&lt;String&gt;**](String.md)| Multiple values may be separated by commas. | [optional] |
| **ip** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **score** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedReputationList**](PaginatedReputationList.md)

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

<a id="policiesReputationScoresRetrieve"></a>
# **policiesReputationScoresRetrieve**
> Reputation policiesReputationScoresRetrieve(reputationUuid)



Reputation Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID reputationUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Reputation Score.
    try {
      Reputation result = apiInstance.policiesReputationScoresRetrieve(reputationUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationScoresRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reputationUuid** | **UUID**| A UUID string identifying this Reputation Score. | |

### Return type

[**Reputation**](Reputation.md)

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

<a id="policiesReputationScoresUsedByList"></a>
# **policiesReputationScoresUsedByList**
> List&lt;UsedBy&gt; policiesReputationScoresUsedByList(reputationUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID reputationUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Reputation Score.
    try {
      List<UsedBy> result = apiInstance.policiesReputationScoresUsedByList(reputationUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationScoresUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reputationUuid** | **UUID**| A UUID string identifying this Reputation Score. | |

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

<a id="policiesReputationUpdate"></a>
# **policiesReputationUpdate**
> ReputationPolicy policiesReputationUpdate(policyUuid, reputationPolicyRequest)



Reputation Policy Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Reputation Policy.
    ReputationPolicyRequest reputationPolicyRequest = new ReputationPolicyRequest(); // ReputationPolicyRequest | 
    try {
      ReputationPolicy result = apiInstance.policiesReputationUpdate(policyUuid, reputationPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Reputation Policy. | |
| **reputationPolicyRequest** | [**ReputationPolicyRequest**](ReputationPolicyRequest.md)|  | |

### Return type

[**ReputationPolicy**](ReputationPolicy.md)

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

<a id="policiesReputationUsedByList"></a>
# **policiesReputationUsedByList**
> List&lt;UsedBy&gt; policiesReputationUsedByList(policyUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PoliciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PoliciesApi apiInstance = new PoliciesApi(defaultClient);
    UUID policyUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Reputation Policy.
    try {
      List<UsedBy> result = apiInstance.policiesReputationUsedByList(policyUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PoliciesApi#policiesReputationUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **policyUuid** | **UUID**| A UUID string identifying this Reputation Policy. | |

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

