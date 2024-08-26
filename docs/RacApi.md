# RacApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**racConnectionTokensDestroy**](RacApi.md#racConnectionTokensDestroy) | **DELETE** /rac/connection_tokens/{connection_token_uuid}/ |  |
| [**racConnectionTokensList**](RacApi.md#racConnectionTokensList) | **GET** /rac/connection_tokens/ |  |
| [**racConnectionTokensPartialUpdate**](RacApi.md#racConnectionTokensPartialUpdate) | **PATCH** /rac/connection_tokens/{connection_token_uuid}/ |  |
| [**racConnectionTokensRetrieve**](RacApi.md#racConnectionTokensRetrieve) | **GET** /rac/connection_tokens/{connection_token_uuid}/ |  |
| [**racConnectionTokensUpdate**](RacApi.md#racConnectionTokensUpdate) | **PUT** /rac/connection_tokens/{connection_token_uuid}/ |  |
| [**racConnectionTokensUsedByList**](RacApi.md#racConnectionTokensUsedByList) | **GET** /rac/connection_tokens/{connection_token_uuid}/used_by/ |  |
| [**racEndpointsCreate**](RacApi.md#racEndpointsCreate) | **POST** /rac/endpoints/ |  |
| [**racEndpointsDestroy**](RacApi.md#racEndpointsDestroy) | **DELETE** /rac/endpoints/{pbm_uuid}/ |  |
| [**racEndpointsList**](RacApi.md#racEndpointsList) | **GET** /rac/endpoints/ |  |
| [**racEndpointsPartialUpdate**](RacApi.md#racEndpointsPartialUpdate) | **PATCH** /rac/endpoints/{pbm_uuid}/ |  |
| [**racEndpointsRetrieve**](RacApi.md#racEndpointsRetrieve) | **GET** /rac/endpoints/{pbm_uuid}/ |  |
| [**racEndpointsUpdate**](RacApi.md#racEndpointsUpdate) | **PUT** /rac/endpoints/{pbm_uuid}/ |  |
| [**racEndpointsUsedByList**](RacApi.md#racEndpointsUsedByList) | **GET** /rac/endpoints/{pbm_uuid}/used_by/ |  |


<a id="racConnectionTokensDestroy"></a>
# **racConnectionTokensDestroy**
> racConnectionTokensDestroy(connectionTokenUuid)



ConnectionToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID connectionTokenUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Connection token.
    try {
      apiInstance.racConnectionTokensDestroy(connectionTokenUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racConnectionTokensDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionTokenUuid** | **UUID**| A UUID string identifying this RAC Connection token. | |

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

<a id="racConnectionTokensList"></a>
# **racConnectionTokensList**
> PaginatedConnectionTokenList racConnectionTokensList(endpoint, ordering, page, pageSize, provider, search, sessionUser)



ConnectionToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID endpoint = UUID.randomUUID(); // UUID | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer provider = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    Integer sessionUser = 56; // Integer | 
    try {
      PaginatedConnectionTokenList result = apiInstance.racConnectionTokensList(endpoint, ordering, page, pageSize, provider, search, sessionUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racConnectionTokensList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpoint** | **UUID**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **provider** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **sessionUser** | **Integer**|  | [optional] |

### Return type

[**PaginatedConnectionTokenList**](PaginatedConnectionTokenList.md)

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

<a id="racConnectionTokensPartialUpdate"></a>
# **racConnectionTokensPartialUpdate**
> ConnectionToken racConnectionTokensPartialUpdate(connectionTokenUuid, patchedConnectionTokenRequest)



ConnectionToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID connectionTokenUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Connection token.
    PatchedConnectionTokenRequest patchedConnectionTokenRequest = new PatchedConnectionTokenRequest(); // PatchedConnectionTokenRequest | 
    try {
      ConnectionToken result = apiInstance.racConnectionTokensPartialUpdate(connectionTokenUuid, patchedConnectionTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racConnectionTokensPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionTokenUuid** | **UUID**| A UUID string identifying this RAC Connection token. | |
| **patchedConnectionTokenRequest** | [**PatchedConnectionTokenRequest**](PatchedConnectionTokenRequest.md)|  | [optional] |

### Return type

[**ConnectionToken**](ConnectionToken.md)

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

<a id="racConnectionTokensRetrieve"></a>
# **racConnectionTokensRetrieve**
> ConnectionToken racConnectionTokensRetrieve(connectionTokenUuid)



ConnectionToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID connectionTokenUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Connection token.
    try {
      ConnectionToken result = apiInstance.racConnectionTokensRetrieve(connectionTokenUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racConnectionTokensRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionTokenUuid** | **UUID**| A UUID string identifying this RAC Connection token. | |

### Return type

[**ConnectionToken**](ConnectionToken.md)

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

<a id="racConnectionTokensUpdate"></a>
# **racConnectionTokensUpdate**
> ConnectionToken racConnectionTokensUpdate(connectionTokenUuid, connectionTokenRequest)



ConnectionToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID connectionTokenUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Connection token.
    ConnectionTokenRequest connectionTokenRequest = new ConnectionTokenRequest(); // ConnectionTokenRequest | 
    try {
      ConnectionToken result = apiInstance.racConnectionTokensUpdate(connectionTokenUuid, connectionTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racConnectionTokensUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionTokenUuid** | **UUID**| A UUID string identifying this RAC Connection token. | |
| **connectionTokenRequest** | [**ConnectionTokenRequest**](ConnectionTokenRequest.md)|  | |

### Return type

[**ConnectionToken**](ConnectionToken.md)

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

<a id="racConnectionTokensUsedByList"></a>
# **racConnectionTokensUsedByList**
> List&lt;UsedBy&gt; racConnectionTokensUsedByList(connectionTokenUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID connectionTokenUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Connection token.
    try {
      List<UsedBy> result = apiInstance.racConnectionTokensUsedByList(connectionTokenUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racConnectionTokensUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **connectionTokenUuid** | **UUID**| A UUID string identifying this RAC Connection token. | |

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

<a id="racEndpointsCreate"></a>
# **racEndpointsCreate**
> Endpoint racEndpointsCreate(endpointRequest)



Endpoint Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    EndpointRequest endpointRequest = new EndpointRequest(); // EndpointRequest | 
    try {
      Endpoint result = apiInstance.racEndpointsCreate(endpointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racEndpointsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **endpointRequest** | [**EndpointRequest**](EndpointRequest.md)|  | |

### Return type

[**Endpoint**](Endpoint.md)

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

<a id="racEndpointsDestroy"></a>
# **racEndpointsDestroy**
> racEndpointsDestroy(pbmUuid)



Endpoint Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Endpoint.
    try {
      apiInstance.racEndpointsDestroy(pbmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racEndpointsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this RAC Endpoint. | |

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

<a id="racEndpointsList"></a>
# **racEndpointsList**
> PaginatedEndpointList racEndpointsList(name, ordering, page, pageSize, provider, search, superuserFullList)



List accessible endpoints

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer provider = 56; // Integer | 
    String search = "search_example"; // String | 
    Boolean superuserFullList = true; // Boolean | 
    try {
      PaginatedEndpointList result = apiInstance.racEndpointsList(name, ordering, page, pageSize, provider, search, superuserFullList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racEndpointsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **provider** | **Integer**|  | [optional] |
| **search** | **String**|  | [optional] |
| **superuserFullList** | **Boolean**|  | [optional] |

### Return type

[**PaginatedEndpointList**](PaginatedEndpointList.md)

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

<a id="racEndpointsPartialUpdate"></a>
# **racEndpointsPartialUpdate**
> Endpoint racEndpointsPartialUpdate(pbmUuid, patchedEndpointRequest)



Endpoint Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Endpoint.
    PatchedEndpointRequest patchedEndpointRequest = new PatchedEndpointRequest(); // PatchedEndpointRequest | 
    try {
      Endpoint result = apiInstance.racEndpointsPartialUpdate(pbmUuid, patchedEndpointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racEndpointsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this RAC Endpoint. | |
| **patchedEndpointRequest** | [**PatchedEndpointRequest**](PatchedEndpointRequest.md)|  | [optional] |

### Return type

[**Endpoint**](Endpoint.md)

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

<a id="racEndpointsRetrieve"></a>
# **racEndpointsRetrieve**
> Endpoint racEndpointsRetrieve(pbmUuid)



Endpoint Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Endpoint.
    try {
      Endpoint result = apiInstance.racEndpointsRetrieve(pbmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racEndpointsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this RAC Endpoint. | |

### Return type

[**Endpoint**](Endpoint.md)

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

<a id="racEndpointsUpdate"></a>
# **racEndpointsUpdate**
> Endpoint racEndpointsUpdate(pbmUuid, endpointRequest)



Endpoint Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Endpoint.
    EndpointRequest endpointRequest = new EndpointRequest(); // EndpointRequest | 
    try {
      Endpoint result = apiInstance.racEndpointsUpdate(pbmUuid, endpointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racEndpointsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this RAC Endpoint. | |
| **endpointRequest** | [**EndpointRequest**](EndpointRequest.md)|  | |

### Return type

[**Endpoint**](Endpoint.md)

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

<a id="racEndpointsUsedByList"></a>
# **racEndpointsUsedByList**
> List&lt;UsedBy&gt; racEndpointsUsedByList(pbmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RacApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    RacApi apiInstance = new RacApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Endpoint.
    try {
      List<UsedBy> result = apiInstance.racEndpointsUsedByList(pbmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RacApi#racEndpointsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this RAC Endpoint. | |

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

