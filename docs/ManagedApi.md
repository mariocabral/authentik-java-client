# ManagedApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**managedBlueprintsApplyCreate**](ManagedApi.md#managedBlueprintsApplyCreate) | **POST** /managed/blueprints/{instance_uuid}/apply/ |  |
| [**managedBlueprintsAvailableList**](ManagedApi.md#managedBlueprintsAvailableList) | **GET** /managed/blueprints/available/ |  |
| [**managedBlueprintsCreate**](ManagedApi.md#managedBlueprintsCreate) | **POST** /managed/blueprints/ |  |
| [**managedBlueprintsDestroy**](ManagedApi.md#managedBlueprintsDestroy) | **DELETE** /managed/blueprints/{instance_uuid}/ |  |
| [**managedBlueprintsList**](ManagedApi.md#managedBlueprintsList) | **GET** /managed/blueprints/ |  |
| [**managedBlueprintsPartialUpdate**](ManagedApi.md#managedBlueprintsPartialUpdate) | **PATCH** /managed/blueprints/{instance_uuid}/ |  |
| [**managedBlueprintsRetrieve**](ManagedApi.md#managedBlueprintsRetrieve) | **GET** /managed/blueprints/{instance_uuid}/ |  |
| [**managedBlueprintsUpdate**](ManagedApi.md#managedBlueprintsUpdate) | **PUT** /managed/blueprints/{instance_uuid}/ |  |
| [**managedBlueprintsUsedByList**](ManagedApi.md#managedBlueprintsUsedByList) | **GET** /managed/blueprints/{instance_uuid}/used_by/ |  |


<a id="managedBlueprintsApplyCreate"></a>
# **managedBlueprintsApplyCreate**
> BlueprintInstance managedBlueprintsApplyCreate(instanceUuid)



Apply a blueprint

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ManagedApi apiInstance = new ManagedApi(defaultClient);
    UUID instanceUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Blueprint Instance.
    try {
      BlueprintInstance result = apiInstance.managedBlueprintsApplyCreate(instanceUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedApi#managedBlueprintsApplyCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceUuid** | **UUID**| A UUID string identifying this Blueprint Instance. | |

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

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

<a id="managedBlueprintsAvailableList"></a>
# **managedBlueprintsAvailableList**
> List&lt;BlueprintFile&gt; managedBlueprintsAvailableList()



Get blueprints

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ManagedApi apiInstance = new ManagedApi(defaultClient);
    try {
      List<BlueprintFile> result = apiInstance.managedBlueprintsAvailableList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedApi#managedBlueprintsAvailableList");
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

[**List&lt;BlueprintFile&gt;**](BlueprintFile.md)

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

<a id="managedBlueprintsCreate"></a>
# **managedBlueprintsCreate**
> BlueprintInstance managedBlueprintsCreate(blueprintInstanceRequest)



Blueprint instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ManagedApi apiInstance = new ManagedApi(defaultClient);
    BlueprintInstanceRequest blueprintInstanceRequest = new BlueprintInstanceRequest(); // BlueprintInstanceRequest | 
    try {
      BlueprintInstance result = apiInstance.managedBlueprintsCreate(blueprintInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedApi#managedBlueprintsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blueprintInstanceRequest** | [**BlueprintInstanceRequest**](BlueprintInstanceRequest.md)|  | |

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

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

<a id="managedBlueprintsDestroy"></a>
# **managedBlueprintsDestroy**
> managedBlueprintsDestroy(instanceUuid)



Blueprint instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ManagedApi apiInstance = new ManagedApi(defaultClient);
    UUID instanceUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Blueprint Instance.
    try {
      apiInstance.managedBlueprintsDestroy(instanceUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedApi#managedBlueprintsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceUuid** | **UUID**| A UUID string identifying this Blueprint Instance. | |

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

<a id="managedBlueprintsList"></a>
# **managedBlueprintsList**
> PaginatedBlueprintInstanceList managedBlueprintsList(name, ordering, page, pageSize, path, search)



Blueprint instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ManagedApi apiInstance = new ManagedApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String path = "path_example"; // String | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedBlueprintInstanceList result = apiInstance.managedBlueprintsList(name, ordering, page, pageSize, path, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedApi#managedBlueprintsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **path** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedBlueprintInstanceList**](PaginatedBlueprintInstanceList.md)

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

<a id="managedBlueprintsPartialUpdate"></a>
# **managedBlueprintsPartialUpdate**
> BlueprintInstance managedBlueprintsPartialUpdate(instanceUuid, patchedBlueprintInstanceRequest)



Blueprint instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ManagedApi apiInstance = new ManagedApi(defaultClient);
    UUID instanceUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Blueprint Instance.
    PatchedBlueprintInstanceRequest patchedBlueprintInstanceRequest = new PatchedBlueprintInstanceRequest(); // PatchedBlueprintInstanceRequest | 
    try {
      BlueprintInstance result = apiInstance.managedBlueprintsPartialUpdate(instanceUuid, patchedBlueprintInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedApi#managedBlueprintsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceUuid** | **UUID**| A UUID string identifying this Blueprint Instance. | |
| **patchedBlueprintInstanceRequest** | [**PatchedBlueprintInstanceRequest**](PatchedBlueprintInstanceRequest.md)|  | [optional] |

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

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

<a id="managedBlueprintsRetrieve"></a>
# **managedBlueprintsRetrieve**
> BlueprintInstance managedBlueprintsRetrieve(instanceUuid)



Blueprint instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ManagedApi apiInstance = new ManagedApi(defaultClient);
    UUID instanceUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Blueprint Instance.
    try {
      BlueprintInstance result = apiInstance.managedBlueprintsRetrieve(instanceUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedApi#managedBlueprintsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceUuid** | **UUID**| A UUID string identifying this Blueprint Instance. | |

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

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

<a id="managedBlueprintsUpdate"></a>
# **managedBlueprintsUpdate**
> BlueprintInstance managedBlueprintsUpdate(instanceUuid, blueprintInstanceRequest)



Blueprint instances

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ManagedApi apiInstance = new ManagedApi(defaultClient);
    UUID instanceUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Blueprint Instance.
    BlueprintInstanceRequest blueprintInstanceRequest = new BlueprintInstanceRequest(); // BlueprintInstanceRequest | 
    try {
      BlueprintInstance result = apiInstance.managedBlueprintsUpdate(instanceUuid, blueprintInstanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedApi#managedBlueprintsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceUuid** | **UUID**| A UUID string identifying this Blueprint Instance. | |
| **blueprintInstanceRequest** | [**BlueprintInstanceRequest**](BlueprintInstanceRequest.md)|  | |

### Return type

[**BlueprintInstance**](BlueprintInstance.md)

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

<a id="managedBlueprintsUsedByList"></a>
# **managedBlueprintsUsedByList**
> List&lt;UsedBy&gt; managedBlueprintsUsedByList(instanceUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ManagedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    ManagedApi apiInstance = new ManagedApi(defaultClient);
    UUID instanceUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Blueprint Instance.
    try {
      List<UsedBy> result = apiInstance.managedBlueprintsUsedByList(instanceUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedApi#managedBlueprintsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **instanceUuid** | **UUID**| A UUID string identifying this Blueprint Instance. | |

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

