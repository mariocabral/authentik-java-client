# OutpostsApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**outpostsInstancesCreate**](OutpostsApi.md#outpostsInstancesCreate) | **POST** /outposts/instances/ |  |
| [**outpostsInstancesDefaultSettingsRetrieve**](OutpostsApi.md#outpostsInstancesDefaultSettingsRetrieve) | **GET** /outposts/instances/default_settings/ |  |
| [**outpostsInstancesDestroy**](OutpostsApi.md#outpostsInstancesDestroy) | **DELETE** /outposts/instances/{uuid}/ |  |
| [**outpostsInstancesHealthList**](OutpostsApi.md#outpostsInstancesHealthList) | **GET** /outposts/instances/{uuid}/health/ |  |
| [**outpostsInstancesList**](OutpostsApi.md#outpostsInstancesList) | **GET** /outposts/instances/ |  |
| [**outpostsInstancesPartialUpdate**](OutpostsApi.md#outpostsInstancesPartialUpdate) | **PATCH** /outposts/instances/{uuid}/ |  |
| [**outpostsInstancesRetrieve**](OutpostsApi.md#outpostsInstancesRetrieve) | **GET** /outposts/instances/{uuid}/ |  |
| [**outpostsInstancesUpdate**](OutpostsApi.md#outpostsInstancesUpdate) | **PUT** /outposts/instances/{uuid}/ |  |
| [**outpostsInstancesUsedByList**](OutpostsApi.md#outpostsInstancesUsedByList) | **GET** /outposts/instances/{uuid}/used_by/ |  |
| [**outpostsLdapList**](OutpostsApi.md#outpostsLdapList) | **GET** /outposts/ldap/ |  |
| [**outpostsLdapRetrieve**](OutpostsApi.md#outpostsLdapRetrieve) | **GET** /outposts/ldap/{id}/ |  |
| [**outpostsProxyList**](OutpostsApi.md#outpostsProxyList) | **GET** /outposts/proxy/ |  |
| [**outpostsProxyRetrieve**](OutpostsApi.md#outpostsProxyRetrieve) | **GET** /outposts/proxy/{id}/ |  |
| [**outpostsRadiusList**](OutpostsApi.md#outpostsRadiusList) | **GET** /outposts/radius/ |  |
| [**outpostsRadiusRetrieve**](OutpostsApi.md#outpostsRadiusRetrieve) | **GET** /outposts/radius/{id}/ |  |
| [**outpostsServiceConnectionsAllDestroy**](OutpostsApi.md#outpostsServiceConnectionsAllDestroy) | **DELETE** /outposts/service_connections/all/{uuid}/ |  |
| [**outpostsServiceConnectionsAllList**](OutpostsApi.md#outpostsServiceConnectionsAllList) | **GET** /outposts/service_connections/all/ |  |
| [**outpostsServiceConnectionsAllRetrieve**](OutpostsApi.md#outpostsServiceConnectionsAllRetrieve) | **GET** /outposts/service_connections/all/{uuid}/ |  |
| [**outpostsServiceConnectionsAllStateRetrieve**](OutpostsApi.md#outpostsServiceConnectionsAllStateRetrieve) | **GET** /outposts/service_connections/all/{uuid}/state/ |  |
| [**outpostsServiceConnectionsAllTypesList**](OutpostsApi.md#outpostsServiceConnectionsAllTypesList) | **GET** /outposts/service_connections/all/types/ |  |
| [**outpostsServiceConnectionsAllUsedByList**](OutpostsApi.md#outpostsServiceConnectionsAllUsedByList) | **GET** /outposts/service_connections/all/{uuid}/used_by/ |  |
| [**outpostsServiceConnectionsDockerCreate**](OutpostsApi.md#outpostsServiceConnectionsDockerCreate) | **POST** /outposts/service_connections/docker/ |  |
| [**outpostsServiceConnectionsDockerDestroy**](OutpostsApi.md#outpostsServiceConnectionsDockerDestroy) | **DELETE** /outposts/service_connections/docker/{uuid}/ |  |
| [**outpostsServiceConnectionsDockerList**](OutpostsApi.md#outpostsServiceConnectionsDockerList) | **GET** /outposts/service_connections/docker/ |  |
| [**outpostsServiceConnectionsDockerPartialUpdate**](OutpostsApi.md#outpostsServiceConnectionsDockerPartialUpdate) | **PATCH** /outposts/service_connections/docker/{uuid}/ |  |
| [**outpostsServiceConnectionsDockerRetrieve**](OutpostsApi.md#outpostsServiceConnectionsDockerRetrieve) | **GET** /outposts/service_connections/docker/{uuid}/ |  |
| [**outpostsServiceConnectionsDockerUpdate**](OutpostsApi.md#outpostsServiceConnectionsDockerUpdate) | **PUT** /outposts/service_connections/docker/{uuid}/ |  |
| [**outpostsServiceConnectionsDockerUsedByList**](OutpostsApi.md#outpostsServiceConnectionsDockerUsedByList) | **GET** /outposts/service_connections/docker/{uuid}/used_by/ |  |
| [**outpostsServiceConnectionsKubernetesCreate**](OutpostsApi.md#outpostsServiceConnectionsKubernetesCreate) | **POST** /outposts/service_connections/kubernetes/ |  |
| [**outpostsServiceConnectionsKubernetesDestroy**](OutpostsApi.md#outpostsServiceConnectionsKubernetesDestroy) | **DELETE** /outposts/service_connections/kubernetes/{uuid}/ |  |
| [**outpostsServiceConnectionsKubernetesList**](OutpostsApi.md#outpostsServiceConnectionsKubernetesList) | **GET** /outposts/service_connections/kubernetes/ |  |
| [**outpostsServiceConnectionsKubernetesPartialUpdate**](OutpostsApi.md#outpostsServiceConnectionsKubernetesPartialUpdate) | **PATCH** /outposts/service_connections/kubernetes/{uuid}/ |  |
| [**outpostsServiceConnectionsKubernetesRetrieve**](OutpostsApi.md#outpostsServiceConnectionsKubernetesRetrieve) | **GET** /outposts/service_connections/kubernetes/{uuid}/ |  |
| [**outpostsServiceConnectionsKubernetesUpdate**](OutpostsApi.md#outpostsServiceConnectionsKubernetesUpdate) | **PUT** /outposts/service_connections/kubernetes/{uuid}/ |  |
| [**outpostsServiceConnectionsKubernetesUsedByList**](OutpostsApi.md#outpostsServiceConnectionsKubernetesUsedByList) | **GET** /outposts/service_connections/kubernetes/{uuid}/used_by/ |  |


<a id="outpostsInstancesCreate"></a>
# **outpostsInstancesCreate**
> Outpost outpostsInstancesCreate(outpostRequest)



Outpost Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    OutpostRequest outpostRequest = new OutpostRequest(); // OutpostRequest | 
    try {
      Outpost result = apiInstance.outpostsInstancesCreate(outpostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsInstancesCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **outpostRequest** | [**OutpostRequest**](OutpostRequest.md)|  | |

### Return type

[**Outpost**](Outpost.md)

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

<a id="outpostsInstancesDefaultSettingsRetrieve"></a>
# **outpostsInstancesDefaultSettingsRetrieve**
> OutpostDefaultConfig outpostsInstancesDefaultSettingsRetrieve()



Global default outpost config

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    try {
      OutpostDefaultConfig result = apiInstance.outpostsInstancesDefaultSettingsRetrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsInstancesDefaultSettingsRetrieve");
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

[**OutpostDefaultConfig**](OutpostDefaultConfig.md)

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

<a id="outpostsInstancesDestroy"></a>
# **outpostsInstancesDestroy**
> outpostsInstancesDestroy(uuid)



Outpost Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost.
    try {
      apiInstance.outpostsInstancesDestroy(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsInstancesDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost. | |

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

<a id="outpostsInstancesHealthList"></a>
# **outpostsInstancesHealthList**
> List&lt;OutpostHealth&gt; outpostsInstancesHealthList(uuid, managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact)



Get outposts current health

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost.
    String managedIcontains = "managedIcontains_example"; // String | 
    String managedIexact = "managedIexact_example"; // String | 
    String nameIcontains = "nameIcontains_example"; // String | 
    String nameIexact = "nameIexact_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Boolean providersIsnull = true; // Boolean | 
    List<Integer> providersByPk = Arrays.asList(); // List<Integer> | 
    String search = "search_example"; // String | A search term.
    String serviceConnectionNameIcontains = "serviceConnectionNameIcontains_example"; // String | 
    String serviceConnectionNameIexact = "serviceConnectionNameIexact_example"; // String | 
    try {
      List<OutpostHealth> result = apiInstance.outpostsInstancesHealthList(uuid, managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsInstancesHealthList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost. | |
| **managedIcontains** | **String**|  | [optional] |
| **managedIexact** | **String**|  | [optional] |
| **nameIcontains** | **String**|  | [optional] |
| **nameIexact** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **providersIsnull** | **Boolean**|  | [optional] |
| **providersByPk** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **serviceConnectionNameIcontains** | **String**|  | [optional] |
| **serviceConnectionNameIexact** | **String**|  | [optional] |

### Return type

[**List&lt;OutpostHealth&gt;**](OutpostHealth.md)

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

<a id="outpostsInstancesList"></a>
# **outpostsInstancesList**
> PaginatedOutpostList outpostsInstancesList(managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, page, pageSize, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact)



Outpost Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    String managedIcontains = "managedIcontains_example"; // String | 
    String managedIexact = "managedIexact_example"; // String | 
    String nameIcontains = "nameIcontains_example"; // String | 
    String nameIexact = "nameIexact_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Boolean providersIsnull = true; // Boolean | 
    List<Integer> providersByPk = Arrays.asList(); // List<Integer> | 
    String search = "search_example"; // String | A search term.
    String serviceConnectionNameIcontains = "serviceConnectionNameIcontains_example"; // String | 
    String serviceConnectionNameIexact = "serviceConnectionNameIexact_example"; // String | 
    try {
      PaginatedOutpostList result = apiInstance.outpostsInstancesList(managedIcontains, managedIexact, nameIcontains, nameIexact, ordering, page, pageSize, providersIsnull, providersByPk, search, serviceConnectionNameIcontains, serviceConnectionNameIexact);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsInstancesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **managedIcontains** | **String**|  | [optional] |
| **managedIexact** | **String**|  | [optional] |
| **nameIcontains** | **String**|  | [optional] |
| **nameIexact** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **providersIsnull** | **Boolean**|  | [optional] |
| **providersByPk** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **serviceConnectionNameIcontains** | **String**|  | [optional] |
| **serviceConnectionNameIexact** | **String**|  | [optional] |

### Return type

[**PaginatedOutpostList**](PaginatedOutpostList.md)

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

<a id="outpostsInstancesPartialUpdate"></a>
# **outpostsInstancesPartialUpdate**
> Outpost outpostsInstancesPartialUpdate(uuid, patchedOutpostRequest)



Outpost Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost.
    PatchedOutpostRequest patchedOutpostRequest = new PatchedOutpostRequest(); // PatchedOutpostRequest | 
    try {
      Outpost result = apiInstance.outpostsInstancesPartialUpdate(uuid, patchedOutpostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsInstancesPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost. | |
| **patchedOutpostRequest** | [**PatchedOutpostRequest**](PatchedOutpostRequest.md)|  | [optional] |

### Return type

[**Outpost**](Outpost.md)

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

<a id="outpostsInstancesRetrieve"></a>
# **outpostsInstancesRetrieve**
> Outpost outpostsInstancesRetrieve(uuid)



Outpost Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost.
    try {
      Outpost result = apiInstance.outpostsInstancesRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsInstancesRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost. | |

### Return type

[**Outpost**](Outpost.md)

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

<a id="outpostsInstancesUpdate"></a>
# **outpostsInstancesUpdate**
> Outpost outpostsInstancesUpdate(uuid, outpostRequest)



Outpost Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost.
    OutpostRequest outpostRequest = new OutpostRequest(); // OutpostRequest | 
    try {
      Outpost result = apiInstance.outpostsInstancesUpdate(uuid, outpostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsInstancesUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost. | |
| **outpostRequest** | [**OutpostRequest**](OutpostRequest.md)|  | |

### Return type

[**Outpost**](Outpost.md)

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

<a id="outpostsInstancesUsedByList"></a>
# **outpostsInstancesUsedByList**
> List&lt;UsedBy&gt; outpostsInstancesUsedByList(uuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost.
    try {
      List<UsedBy> result = apiInstance.outpostsInstancesUsedByList(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsInstancesUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost. | |

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

<a id="outpostsLdapList"></a>
# **outpostsLdapList**
> PaginatedLDAPOutpostConfigList outpostsLdapList(name, ordering, page, pageSize, search)



LDAPProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedLDAPOutpostConfigList result = apiInstance.outpostsLdapList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsLdapList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

### Return type

[**PaginatedLDAPOutpostConfigList**](PaginatedLDAPOutpostConfigList.md)

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

<a id="outpostsLdapRetrieve"></a>
# **outpostsLdapRetrieve**
> LDAPOutpostConfig outpostsLdapRetrieve(id)



LDAPProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this LDAP Provider.
    try {
      LDAPOutpostConfig result = apiInstance.outpostsLdapRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsLdapRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**LDAPOutpostConfig**](LDAPOutpostConfig.md)

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

<a id="outpostsProxyList"></a>
# **outpostsProxyList**
> PaginatedProxyOutpostConfigList outpostsProxyList(name, ordering, page, pageSize, search)



ProxyProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedProxyOutpostConfigList result = apiInstance.outpostsProxyList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsProxyList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

### Return type

[**PaginatedProxyOutpostConfigList**](PaginatedProxyOutpostConfigList.md)

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

<a id="outpostsProxyRetrieve"></a>
# **outpostsProxyRetrieve**
> ProxyOutpostConfig outpostsProxyRetrieve(id)



ProxyProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Proxy Provider.
    try {
      ProxyOutpostConfig result = apiInstance.outpostsProxyRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsProxyRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**ProxyOutpostConfig**](ProxyOutpostConfig.md)

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

<a id="outpostsRadiusList"></a>
# **outpostsRadiusList**
> PaginatedRadiusOutpostConfigList outpostsRadiusList(name, ordering, page, pageSize, search)



RadiusProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedRadiusOutpostConfigList result = apiInstance.outpostsRadiusList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsRadiusList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

### Return type

[**PaginatedRadiusOutpostConfigList**](PaginatedRadiusOutpostConfigList.md)

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

<a id="outpostsRadiusRetrieve"></a>
# **outpostsRadiusRetrieve**
> RadiusOutpostConfig outpostsRadiusRetrieve(id)



RadiusProvider Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Radius Provider.
    try {
      RadiusOutpostConfig result = apiInstance.outpostsRadiusRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsRadiusRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**RadiusOutpostConfig**](RadiusOutpostConfig.md)

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

<a id="outpostsServiceConnectionsAllDestroy"></a>
# **outpostsServiceConnectionsAllDestroy**
> outpostsServiceConnectionsAllDestroy(uuid)



ServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost Service-Connection.
    try {
      apiInstance.outpostsServiceConnectionsAllDestroy(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsAllDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost Service-Connection. | |

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

<a id="outpostsServiceConnectionsAllList"></a>
# **outpostsServiceConnectionsAllList**
> PaginatedServiceConnectionList outpostsServiceConnectionsAllList(name, ordering, page, pageSize, search)



ServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedServiceConnectionList result = apiInstance.outpostsServiceConnectionsAllList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsAllList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

### Return type

[**PaginatedServiceConnectionList**](PaginatedServiceConnectionList.md)

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

<a id="outpostsServiceConnectionsAllRetrieve"></a>
# **outpostsServiceConnectionsAllRetrieve**
> ServiceConnection outpostsServiceConnectionsAllRetrieve(uuid)



ServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost Service-Connection.
    try {
      ServiceConnection result = apiInstance.outpostsServiceConnectionsAllRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsAllRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost Service-Connection. | |

### Return type

[**ServiceConnection**](ServiceConnection.md)

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

<a id="outpostsServiceConnectionsAllStateRetrieve"></a>
# **outpostsServiceConnectionsAllStateRetrieve**
> ServiceConnectionState outpostsServiceConnectionsAllStateRetrieve(uuid)



Get the service connection&#39;s state

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost Service-Connection.
    try {
      ServiceConnectionState result = apiInstance.outpostsServiceConnectionsAllStateRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsAllStateRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost Service-Connection. | |

### Return type

[**ServiceConnectionState**](ServiceConnectionState.md)

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

<a id="outpostsServiceConnectionsAllTypesList"></a>
# **outpostsServiceConnectionsAllTypesList**
> List&lt;TypeCreate&gt; outpostsServiceConnectionsAllTypesList()



Get all creatable types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    try {
      List<TypeCreate> result = apiInstance.outpostsServiceConnectionsAllTypesList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsAllTypesList");
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

<a id="outpostsServiceConnectionsAllUsedByList"></a>
# **outpostsServiceConnectionsAllUsedByList**
> List&lt;UsedBy&gt; outpostsServiceConnectionsAllUsedByList(uuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Outpost Service-Connection.
    try {
      List<UsedBy> result = apiInstance.outpostsServiceConnectionsAllUsedByList(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsAllUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Outpost Service-Connection. | |

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

<a id="outpostsServiceConnectionsDockerCreate"></a>
# **outpostsServiceConnectionsDockerCreate**
> DockerServiceConnection outpostsServiceConnectionsDockerCreate(dockerServiceConnectionRequest)



DockerServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    DockerServiceConnectionRequest dockerServiceConnectionRequest = new DockerServiceConnectionRequest(); // DockerServiceConnectionRequest | 
    try {
      DockerServiceConnection result = apiInstance.outpostsServiceConnectionsDockerCreate(dockerServiceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsDockerCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dockerServiceConnectionRequest** | [**DockerServiceConnectionRequest**](DockerServiceConnectionRequest.md)|  | |

### Return type

[**DockerServiceConnection**](DockerServiceConnection.md)

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

<a id="outpostsServiceConnectionsDockerDestroy"></a>
# **outpostsServiceConnectionsDockerDestroy**
> outpostsServiceConnectionsDockerDestroy(uuid)



DockerServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Docker Service-Connection.
    try {
      apiInstance.outpostsServiceConnectionsDockerDestroy(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsDockerDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Docker Service-Connection. | |

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

<a id="outpostsServiceConnectionsDockerList"></a>
# **outpostsServiceConnectionsDockerList**
> PaginatedDockerServiceConnectionList outpostsServiceConnectionsDockerList(local, name, ordering, page, pageSize, search, tlsAuthentication, tlsVerification, url)



DockerServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    Boolean local = true; // Boolean | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID tlsAuthentication = UUID.randomUUID(); // UUID | 
    UUID tlsVerification = UUID.randomUUID(); // UUID | 
    String url = "url_example"; // String | 
    try {
      PaginatedDockerServiceConnectionList result = apiInstance.outpostsServiceConnectionsDockerList(local, name, ordering, page, pageSize, search, tlsAuthentication, tlsVerification, url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsDockerList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **local** | **Boolean**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **tlsAuthentication** | **UUID**|  | [optional] |
| **tlsVerification** | **UUID**|  | [optional] |
| **url** | **String**|  | [optional] |

### Return type

[**PaginatedDockerServiceConnectionList**](PaginatedDockerServiceConnectionList.md)

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

<a id="outpostsServiceConnectionsDockerPartialUpdate"></a>
# **outpostsServiceConnectionsDockerPartialUpdate**
> DockerServiceConnection outpostsServiceConnectionsDockerPartialUpdate(uuid, patchedDockerServiceConnectionRequest)



DockerServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Docker Service-Connection.
    PatchedDockerServiceConnectionRequest patchedDockerServiceConnectionRequest = new PatchedDockerServiceConnectionRequest(); // PatchedDockerServiceConnectionRequest | 
    try {
      DockerServiceConnection result = apiInstance.outpostsServiceConnectionsDockerPartialUpdate(uuid, patchedDockerServiceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsDockerPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Docker Service-Connection. | |
| **patchedDockerServiceConnectionRequest** | [**PatchedDockerServiceConnectionRequest**](PatchedDockerServiceConnectionRequest.md)|  | [optional] |

### Return type

[**DockerServiceConnection**](DockerServiceConnection.md)

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

<a id="outpostsServiceConnectionsDockerRetrieve"></a>
# **outpostsServiceConnectionsDockerRetrieve**
> DockerServiceConnection outpostsServiceConnectionsDockerRetrieve(uuid)



DockerServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Docker Service-Connection.
    try {
      DockerServiceConnection result = apiInstance.outpostsServiceConnectionsDockerRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsDockerRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Docker Service-Connection. | |

### Return type

[**DockerServiceConnection**](DockerServiceConnection.md)

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

<a id="outpostsServiceConnectionsDockerUpdate"></a>
# **outpostsServiceConnectionsDockerUpdate**
> DockerServiceConnection outpostsServiceConnectionsDockerUpdate(uuid, dockerServiceConnectionRequest)



DockerServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Docker Service-Connection.
    DockerServiceConnectionRequest dockerServiceConnectionRequest = new DockerServiceConnectionRequest(); // DockerServiceConnectionRequest | 
    try {
      DockerServiceConnection result = apiInstance.outpostsServiceConnectionsDockerUpdate(uuid, dockerServiceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsDockerUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Docker Service-Connection. | |
| **dockerServiceConnectionRequest** | [**DockerServiceConnectionRequest**](DockerServiceConnectionRequest.md)|  | |

### Return type

[**DockerServiceConnection**](DockerServiceConnection.md)

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

<a id="outpostsServiceConnectionsDockerUsedByList"></a>
# **outpostsServiceConnectionsDockerUsedByList**
> List&lt;UsedBy&gt; outpostsServiceConnectionsDockerUsedByList(uuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Docker Service-Connection.
    try {
      List<UsedBy> result = apiInstance.outpostsServiceConnectionsDockerUsedByList(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsDockerUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Docker Service-Connection. | |

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

<a id="outpostsServiceConnectionsKubernetesCreate"></a>
# **outpostsServiceConnectionsKubernetesCreate**
> KubernetesServiceConnection outpostsServiceConnectionsKubernetesCreate(kubernetesServiceConnectionRequest)



KubernetesServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    KubernetesServiceConnectionRequest kubernetesServiceConnectionRequest = new KubernetesServiceConnectionRequest(); // KubernetesServiceConnectionRequest | 
    try {
      KubernetesServiceConnection result = apiInstance.outpostsServiceConnectionsKubernetesCreate(kubernetesServiceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsKubernetesCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **kubernetesServiceConnectionRequest** | [**KubernetesServiceConnectionRequest**](KubernetesServiceConnectionRequest.md)|  | |

### Return type

[**KubernetesServiceConnection**](KubernetesServiceConnection.md)

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

<a id="outpostsServiceConnectionsKubernetesDestroy"></a>
# **outpostsServiceConnectionsKubernetesDestroy**
> outpostsServiceConnectionsKubernetesDestroy(uuid)



KubernetesServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Kubernetes Service-Connection.
    try {
      apiInstance.outpostsServiceConnectionsKubernetesDestroy(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsKubernetesDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Kubernetes Service-Connection. | |

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

<a id="outpostsServiceConnectionsKubernetesList"></a>
# **outpostsServiceConnectionsKubernetesList**
> PaginatedKubernetesServiceConnectionList outpostsServiceConnectionsKubernetesList(local, name, ordering, page, pageSize, search)



KubernetesServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    Boolean local = true; // Boolean | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedKubernetesServiceConnectionList result = apiInstance.outpostsServiceConnectionsKubernetesList(local, name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsKubernetesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **local** | **Boolean**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedKubernetesServiceConnectionList**](PaginatedKubernetesServiceConnectionList.md)

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

<a id="outpostsServiceConnectionsKubernetesPartialUpdate"></a>
# **outpostsServiceConnectionsKubernetesPartialUpdate**
> KubernetesServiceConnection outpostsServiceConnectionsKubernetesPartialUpdate(uuid, patchedKubernetesServiceConnectionRequest)



KubernetesServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Kubernetes Service-Connection.
    PatchedKubernetesServiceConnectionRequest patchedKubernetesServiceConnectionRequest = new PatchedKubernetesServiceConnectionRequest(); // PatchedKubernetesServiceConnectionRequest | 
    try {
      KubernetesServiceConnection result = apiInstance.outpostsServiceConnectionsKubernetesPartialUpdate(uuid, patchedKubernetesServiceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsKubernetesPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Kubernetes Service-Connection. | |
| **patchedKubernetesServiceConnectionRequest** | [**PatchedKubernetesServiceConnectionRequest**](PatchedKubernetesServiceConnectionRequest.md)|  | [optional] |

### Return type

[**KubernetesServiceConnection**](KubernetesServiceConnection.md)

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

<a id="outpostsServiceConnectionsKubernetesRetrieve"></a>
# **outpostsServiceConnectionsKubernetesRetrieve**
> KubernetesServiceConnection outpostsServiceConnectionsKubernetesRetrieve(uuid)



KubernetesServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Kubernetes Service-Connection.
    try {
      KubernetesServiceConnection result = apiInstance.outpostsServiceConnectionsKubernetesRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsKubernetesRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Kubernetes Service-Connection. | |

### Return type

[**KubernetesServiceConnection**](KubernetesServiceConnection.md)

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

<a id="outpostsServiceConnectionsKubernetesUpdate"></a>
# **outpostsServiceConnectionsKubernetesUpdate**
> KubernetesServiceConnection outpostsServiceConnectionsKubernetesUpdate(uuid, kubernetesServiceConnectionRequest)



KubernetesServiceConnection Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Kubernetes Service-Connection.
    KubernetesServiceConnectionRequest kubernetesServiceConnectionRequest = new KubernetesServiceConnectionRequest(); // KubernetesServiceConnectionRequest | 
    try {
      KubernetesServiceConnection result = apiInstance.outpostsServiceConnectionsKubernetesUpdate(uuid, kubernetesServiceConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsKubernetesUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Kubernetes Service-Connection. | |
| **kubernetesServiceConnectionRequest** | [**KubernetesServiceConnectionRequest**](KubernetesServiceConnectionRequest.md)|  | |

### Return type

[**KubernetesServiceConnection**](KubernetesServiceConnection.md)

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

<a id="outpostsServiceConnectionsKubernetesUsedByList"></a>
# **outpostsServiceConnectionsKubernetesUsedByList**
> List&lt;UsedBy&gt; outpostsServiceConnectionsKubernetesUsedByList(uuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OutpostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    OutpostsApi apiInstance = new OutpostsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Kubernetes Service-Connection.
    try {
      List<UsedBy> result = apiInstance.outpostsServiceConnectionsKubernetesUsedByList(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OutpostsApi#outpostsServiceConnectionsKubernetesUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Kubernetes Service-Connection. | |

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

