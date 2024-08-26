# FlowsApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**flowsBindingsCreate**](FlowsApi.md#flowsBindingsCreate) | **POST** /flows/bindings/ |  |
| [**flowsBindingsDestroy**](FlowsApi.md#flowsBindingsDestroy) | **DELETE** /flows/bindings/{fsb_uuid}/ |  |
| [**flowsBindingsList**](FlowsApi.md#flowsBindingsList) | **GET** /flows/bindings/ |  |
| [**flowsBindingsPartialUpdate**](FlowsApi.md#flowsBindingsPartialUpdate) | **PATCH** /flows/bindings/{fsb_uuid}/ |  |
| [**flowsBindingsRetrieve**](FlowsApi.md#flowsBindingsRetrieve) | **GET** /flows/bindings/{fsb_uuid}/ |  |
| [**flowsBindingsUpdate**](FlowsApi.md#flowsBindingsUpdate) | **PUT** /flows/bindings/{fsb_uuid}/ |  |
| [**flowsBindingsUsedByList**](FlowsApi.md#flowsBindingsUsedByList) | **GET** /flows/bindings/{fsb_uuid}/used_by/ |  |
| [**flowsExecutorGet**](FlowsApi.md#flowsExecutorGet) | **GET** /flows/executor/{flow_slug}/ |  |
| [**flowsExecutorSolve**](FlowsApi.md#flowsExecutorSolve) | **POST** /flows/executor/{flow_slug}/ |  |
| [**flowsInspectorGet**](FlowsApi.md#flowsInspectorGet) | **GET** /flows/inspector/{flow_slug}/ |  |
| [**flowsInstancesCacheClearCreate**](FlowsApi.md#flowsInstancesCacheClearCreate) | **POST** /flows/instances/cache_clear/ |  |
| [**flowsInstancesCacheInfoRetrieve**](FlowsApi.md#flowsInstancesCacheInfoRetrieve) | **GET** /flows/instances/cache_info/ |  |
| [**flowsInstancesCreate**](FlowsApi.md#flowsInstancesCreate) | **POST** /flows/instances/ |  |
| [**flowsInstancesDestroy**](FlowsApi.md#flowsInstancesDestroy) | **DELETE** /flows/instances/{slug}/ |  |
| [**flowsInstancesDiagramRetrieve**](FlowsApi.md#flowsInstancesDiagramRetrieve) | **GET** /flows/instances/{slug}/diagram/ |  |
| [**flowsInstancesExecuteRetrieve**](FlowsApi.md#flowsInstancesExecuteRetrieve) | **GET** /flows/instances/{slug}/execute/ |  |
| [**flowsInstancesExportRetrieve**](FlowsApi.md#flowsInstancesExportRetrieve) | **GET** /flows/instances/{slug}/export/ |  |
| [**flowsInstancesImportCreate**](FlowsApi.md#flowsInstancesImportCreate) | **POST** /flows/instances/import/ |  |
| [**flowsInstancesList**](FlowsApi.md#flowsInstancesList) | **GET** /flows/instances/ |  |
| [**flowsInstancesPartialUpdate**](FlowsApi.md#flowsInstancesPartialUpdate) | **PATCH** /flows/instances/{slug}/ |  |
| [**flowsInstancesRetrieve**](FlowsApi.md#flowsInstancesRetrieve) | **GET** /flows/instances/{slug}/ |  |
| [**flowsInstancesSetBackgroundCreate**](FlowsApi.md#flowsInstancesSetBackgroundCreate) | **POST** /flows/instances/{slug}/set_background/ |  |
| [**flowsInstancesSetBackgroundUrlCreate**](FlowsApi.md#flowsInstancesSetBackgroundUrlCreate) | **POST** /flows/instances/{slug}/set_background_url/ |  |
| [**flowsInstancesUpdate**](FlowsApi.md#flowsInstancesUpdate) | **PUT** /flows/instances/{slug}/ |  |
| [**flowsInstancesUsedByList**](FlowsApi.md#flowsInstancesUsedByList) | **GET** /flows/instances/{slug}/used_by/ |  |


<a id="flowsBindingsCreate"></a>
# **flowsBindingsCreate**
> FlowStageBinding flowsBindingsCreate(flowStageBindingRequest)



FlowStageBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    FlowStageBindingRequest flowStageBindingRequest = new FlowStageBindingRequest(); // FlowStageBindingRequest | 
    try {
      FlowStageBinding result = apiInstance.flowsBindingsCreate(flowStageBindingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsBindingsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **flowStageBindingRequest** | [**FlowStageBindingRequest**](FlowStageBindingRequest.md)|  | |

### Return type

[**FlowStageBinding**](FlowStageBinding.md)

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

<a id="flowsBindingsDestroy"></a>
# **flowsBindingsDestroy**
> flowsBindingsDestroy(fsbUuid)



FlowStageBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    UUID fsbUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Flow Stage Binding.
    try {
      apiInstance.flowsBindingsDestroy(fsbUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsBindingsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fsbUuid** | **UUID**| A UUID string identifying this Flow Stage Binding. | |

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

<a id="flowsBindingsList"></a>
# **flowsBindingsList**
> PaginatedFlowStageBindingList flowsBindingsList(evaluateOnPlan, fsbUuid, invalidResponseAction, order, ordering, page, pageSize, pbmUuid, policies, policyEngineMode, reEvaluatePolicies, search, stage, target)



FlowStageBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    Boolean evaluateOnPlan = true; // Boolean | 
    UUID fsbUuid = UUID.randomUUID(); // UUID | 
    String invalidResponseAction = "restart"; // String | Configure how the flow executor should handle an invalid response to a challenge. RETRY returns the error message and a similar challenge to the executor. RESTART restarts the flow from the beginning, and RESTART_WITH_CONTEXT restarts the flow while keeping the current context.  
    Integer order = 56; // Integer | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID pbmUuid = UUID.randomUUID(); // UUID | 
    List<UUID> policies = Arrays.asList(); // List<UUID> | 
    String policyEngineMode = "all"; // String | 
    Boolean reEvaluatePolicies = true; // Boolean | 
    String search = "search_example"; // String | A search term.
    UUID stage = UUID.randomUUID(); // UUID | 
    UUID target = UUID.randomUUID(); // UUID | 
    try {
      PaginatedFlowStageBindingList result = apiInstance.flowsBindingsList(evaluateOnPlan, fsbUuid, invalidResponseAction, order, ordering, page, pageSize, pbmUuid, policies, policyEngineMode, reEvaluatePolicies, search, stage, target);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsBindingsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **evaluateOnPlan** | **Boolean**|  | [optional] |
| **fsbUuid** | **UUID**|  | [optional] |
| **invalidResponseAction** | **String**| Configure how the flow executor should handle an invalid response to a challenge. RETRY returns the error message and a similar challenge to the executor. RESTART restarts the flow from the beginning, and RESTART_WITH_CONTEXT restarts the flow while keeping the current context.   | [optional] [enum: restart, restart_with_context, retry] |
| **order** | **Integer**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **pbmUuid** | **UUID**|  | [optional] |
| **policies** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **policyEngineMode** | **String**|  | [optional] [enum: all, any] |
| **reEvaluatePolicies** | **Boolean**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stage** | **UUID**|  | [optional] |
| **target** | **UUID**|  | [optional] |

### Return type

[**PaginatedFlowStageBindingList**](PaginatedFlowStageBindingList.md)

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

<a id="flowsBindingsPartialUpdate"></a>
# **flowsBindingsPartialUpdate**
> FlowStageBinding flowsBindingsPartialUpdate(fsbUuid, patchedFlowStageBindingRequest)



FlowStageBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    UUID fsbUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Flow Stage Binding.
    PatchedFlowStageBindingRequest patchedFlowStageBindingRequest = new PatchedFlowStageBindingRequest(); // PatchedFlowStageBindingRequest | 
    try {
      FlowStageBinding result = apiInstance.flowsBindingsPartialUpdate(fsbUuid, patchedFlowStageBindingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsBindingsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fsbUuid** | **UUID**| A UUID string identifying this Flow Stage Binding. | |
| **patchedFlowStageBindingRequest** | [**PatchedFlowStageBindingRequest**](PatchedFlowStageBindingRequest.md)|  | [optional] |

### Return type

[**FlowStageBinding**](FlowStageBinding.md)

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

<a id="flowsBindingsRetrieve"></a>
# **flowsBindingsRetrieve**
> FlowStageBinding flowsBindingsRetrieve(fsbUuid)



FlowStageBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    UUID fsbUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Flow Stage Binding.
    try {
      FlowStageBinding result = apiInstance.flowsBindingsRetrieve(fsbUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsBindingsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fsbUuid** | **UUID**| A UUID string identifying this Flow Stage Binding. | |

### Return type

[**FlowStageBinding**](FlowStageBinding.md)

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

<a id="flowsBindingsUpdate"></a>
# **flowsBindingsUpdate**
> FlowStageBinding flowsBindingsUpdate(fsbUuid, flowStageBindingRequest)



FlowStageBinding Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    UUID fsbUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Flow Stage Binding.
    FlowStageBindingRequest flowStageBindingRequest = new FlowStageBindingRequest(); // FlowStageBindingRequest | 
    try {
      FlowStageBinding result = apiInstance.flowsBindingsUpdate(fsbUuid, flowStageBindingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsBindingsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fsbUuid** | **UUID**| A UUID string identifying this Flow Stage Binding. | |
| **flowStageBindingRequest** | [**FlowStageBindingRequest**](FlowStageBindingRequest.md)|  | |

### Return type

[**FlowStageBinding**](FlowStageBinding.md)

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

<a id="flowsBindingsUsedByList"></a>
# **flowsBindingsUsedByList**
> List&lt;UsedBy&gt; flowsBindingsUsedByList(fsbUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    UUID fsbUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Flow Stage Binding.
    try {
      List<UsedBy> result = apiInstance.flowsBindingsUsedByList(fsbUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsBindingsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fsbUuid** | **UUID**| A UUID string identifying this Flow Stage Binding. | |

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

<a id="flowsExecutorGet"></a>
# **flowsExecutorGet**
> ChallengeTypes flowsExecutorGet(flowSlug, query)



Get the next pending challenge from the currently active flow.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String flowSlug = "flowSlug_example"; // String | 
    String query = "query_example"; // String | Querystring as received
    try {
      ChallengeTypes result = apiInstance.flowsExecutorGet(flowSlug, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsExecutorGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **flowSlug** | **String**|  | |
| **query** | **String**| Querystring as received | |

### Return type

[**ChallengeTypes**](ChallengeTypes.md)

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

<a id="flowsExecutorSolve"></a>
# **flowsExecutorSolve**
> ChallengeTypes flowsExecutorSolve(flowSlug, query, flowChallengeResponseRequest)



Solve the previously retrieved challenge and advanced to the next stage.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String flowSlug = "flowSlug_example"; // String | 
    String query = "query_example"; // String | Querystring as received
    FlowChallengeResponseRequest flowChallengeResponseRequest = new FlowChallengeResponseRequest(); // FlowChallengeResponseRequest | 
    try {
      ChallengeTypes result = apiInstance.flowsExecutorSolve(flowSlug, query, flowChallengeResponseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsExecutorSolve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **flowSlug** | **String**|  | |
| **query** | **String**| Querystring as received | |
| **flowChallengeResponseRequest** | [**FlowChallengeResponseRequest**](FlowChallengeResponseRequest.md)|  | [optional] |

### Return type

[**ChallengeTypes**](ChallengeTypes.md)

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

<a id="flowsInspectorGet"></a>
# **flowsInspectorGet**
> FlowInspection flowsInspectorGet(flowSlug)



Get current flow state and record it

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String flowSlug = "flowSlug_example"; // String | 
    try {
      FlowInspection result = apiInstance.flowsInspectorGet(flowSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInspectorGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **flowSlug** | **String**|  | |

### Return type

[**FlowInspection**](FlowInspection.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | No flow plan in session. |  -  |
| **403** |  |  -  |

<a id="flowsInstancesCacheClearCreate"></a>
# **flowsInstancesCacheClearCreate**
> flowsInstancesCacheClearCreate()



Clear flow cache

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    try {
      apiInstance.flowsInstancesCacheClearCreate();
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesCacheClearCreate");
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

<a id="flowsInstancesCacheInfoRetrieve"></a>
# **flowsInstancesCacheInfoRetrieve**
> Cache flowsInstancesCacheInfoRetrieve()



Info about cached flows

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    try {
      Cache result = apiInstance.flowsInstancesCacheInfoRetrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesCacheInfoRetrieve");
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

<a id="flowsInstancesCreate"></a>
# **flowsInstancesCreate**
> Flow flowsInstancesCreate(flowRequest)



Flow Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    FlowRequest flowRequest = new FlowRequest(); // FlowRequest | 
    try {
      Flow result = apiInstance.flowsInstancesCreate(flowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **flowRequest** | [**FlowRequest**](FlowRequest.md)|  | |

### Return type

[**Flow**](Flow.md)

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

<a id="flowsInstancesDestroy"></a>
# **flowsInstancesDestroy**
> flowsInstancesDestroy(slug)



Flow Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      apiInstance.flowsInstancesDestroy(slug);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a id="flowsInstancesDiagramRetrieve"></a>
# **flowsInstancesDiagramRetrieve**
> FlowDiagram flowsInstancesDiagramRetrieve(slug)



Return diagram for flow with slug &#x60;slug&#x60;, in the format used by flowchart.js

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      FlowDiagram result = apiInstance.flowsInstancesDiagramRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesDiagramRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**FlowDiagram**](FlowDiagram.md)

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

<a id="flowsInstancesExecuteRetrieve"></a>
# **flowsInstancesExecuteRetrieve**
> Link flowsInstancesExecuteRetrieve(slug)



Execute flow for current user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      Link result = apiInstance.flowsInstancesExecuteRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesExecuteRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **400** | Flow not applicable |  -  |
| **403** |  |  -  |

<a id="flowsInstancesExportRetrieve"></a>
# **flowsInstancesExportRetrieve**
> File flowsInstancesExportRetrieve(slug)



Export flow to .yaml file

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      File result = apiInstance.flowsInstancesExportRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesExportRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**File**](File.md)

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

<a id="flowsInstancesImportCreate"></a>
# **flowsInstancesImportCreate**
> FlowImportResult flowsInstancesImportCreate(_file, clear)



Import flow from .yaml file

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    Boolean clear = false; // Boolean | 
    try {
      FlowImportResult result = apiInstance.flowsInstancesImportCreate(_file, clear);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesImportCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File**|  | [optional] |
| **clear** | **Boolean**|  | [optional] [default to false] |

### Return type

[**FlowImportResult**](FlowImportResult.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="flowsInstancesList"></a>
# **flowsInstancesList**
> PaginatedFlowList flowsInstancesList(deniedAction, designation, flowUuid, name, ordering, page, pageSize, search, slug)



Flow Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String deniedAction = "continue"; // String | Configure what should happen when a flow denies access to a user.  
    String designation = "authentication"; // String | Decides what this Flow is used for. For example, the Authentication flow is redirect to when an un-authenticated user visits authentik.  
    UUID flowUuid = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String slug = "slug_example"; // String | 
    try {
      PaginatedFlowList result = apiInstance.flowsInstancesList(deniedAction, designation, flowUuid, name, ordering, page, pageSize, search, slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deniedAction** | **String**| Configure what should happen when a flow denies access to a user.   | [optional] [enum: continue, message, message_continue] |
| **designation** | **String**| Decides what this Flow is used for. For example, the Authentication flow is redirect to when an un-authenticated user visits authentik.   | [optional] [enum: authentication, authorization, enrollment, invalidation, recovery, stage_configuration, unenrollment] |
| **flowUuid** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **slug** | **String**|  | [optional] |

### Return type

[**PaginatedFlowList**](PaginatedFlowList.md)

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

<a id="flowsInstancesPartialUpdate"></a>
# **flowsInstancesPartialUpdate**
> Flow flowsInstancesPartialUpdate(slug, patchedFlowRequest)



Flow Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    PatchedFlowRequest patchedFlowRequest = new PatchedFlowRequest(); // PatchedFlowRequest | 
    try {
      Flow result = apiInstance.flowsInstancesPartialUpdate(slug, patchedFlowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **patchedFlowRequest** | [**PatchedFlowRequest**](PatchedFlowRequest.md)|  | [optional] |

### Return type

[**Flow**](Flow.md)

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

<a id="flowsInstancesRetrieve"></a>
# **flowsInstancesRetrieve**
> Flow flowsInstancesRetrieve(slug)



Flow Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      Flow result = apiInstance.flowsInstancesRetrieve(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**Flow**](Flow.md)

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

<a id="flowsInstancesSetBackgroundCreate"></a>
# **flowsInstancesSetBackgroundCreate**
> flowsInstancesSetBackgroundCreate(slug, _file, clear)



Set Flow background

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    File _file = new File("/path/to/file"); // File | 
    Boolean clear = false; // Boolean | 
    try {
      apiInstance.flowsInstancesSetBackgroundCreate(slug, _file, clear);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesSetBackgroundCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a id="flowsInstancesSetBackgroundUrlCreate"></a>
# **flowsInstancesSetBackgroundUrlCreate**
> flowsInstancesSetBackgroundUrlCreate(slug, filePathRequest)



Set Flow background (as URL)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    FilePathRequest filePathRequest = new FilePathRequest(); // FilePathRequest | 
    try {
      apiInstance.flowsInstancesSetBackgroundUrlCreate(slug, filePathRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesSetBackgroundUrlCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

<a id="flowsInstancesUpdate"></a>
# **flowsInstancesUpdate**
> Flow flowsInstancesUpdate(slug, flowRequest)



Flow Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    FlowRequest flowRequest = new FlowRequest(); // FlowRequest | 
    try {
      Flow result = apiInstance.flowsInstancesUpdate(slug, flowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **flowRequest** | [**FlowRequest**](FlowRequest.md)|  | |

### Return type

[**Flow**](Flow.md)

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

<a id="flowsInstancesUsedByList"></a>
# **flowsInstancesUsedByList**
> List&lt;UsedBy&gt; flowsInstancesUsedByList(slug)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FlowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    FlowsApi apiInstance = new FlowsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      List<UsedBy> result = apiInstance.flowsInstancesUsedByList(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowsApi#flowsInstancesUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

