# AuthenticatorsApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticatorsAdminAllList**](AuthenticatorsApi.md#authenticatorsAdminAllList) | **GET** /authenticators/admin/all/ |  |
| [**authenticatorsAdminDuoCreate**](AuthenticatorsApi.md#authenticatorsAdminDuoCreate) | **POST** /authenticators/admin/duo/ |  |
| [**authenticatorsAdminDuoDestroy**](AuthenticatorsApi.md#authenticatorsAdminDuoDestroy) | **DELETE** /authenticators/admin/duo/{id}/ |  |
| [**authenticatorsAdminDuoList**](AuthenticatorsApi.md#authenticatorsAdminDuoList) | **GET** /authenticators/admin/duo/ |  |
| [**authenticatorsAdminDuoPartialUpdate**](AuthenticatorsApi.md#authenticatorsAdminDuoPartialUpdate) | **PATCH** /authenticators/admin/duo/{id}/ |  |
| [**authenticatorsAdminDuoRetrieve**](AuthenticatorsApi.md#authenticatorsAdminDuoRetrieve) | **GET** /authenticators/admin/duo/{id}/ |  |
| [**authenticatorsAdminDuoUpdate**](AuthenticatorsApi.md#authenticatorsAdminDuoUpdate) | **PUT** /authenticators/admin/duo/{id}/ |  |
| [**authenticatorsAdminSmsCreate**](AuthenticatorsApi.md#authenticatorsAdminSmsCreate) | **POST** /authenticators/admin/sms/ |  |
| [**authenticatorsAdminSmsDestroy**](AuthenticatorsApi.md#authenticatorsAdminSmsDestroy) | **DELETE** /authenticators/admin/sms/{id}/ |  |
| [**authenticatorsAdminSmsList**](AuthenticatorsApi.md#authenticatorsAdminSmsList) | **GET** /authenticators/admin/sms/ |  |
| [**authenticatorsAdminSmsPartialUpdate**](AuthenticatorsApi.md#authenticatorsAdminSmsPartialUpdate) | **PATCH** /authenticators/admin/sms/{id}/ |  |
| [**authenticatorsAdminSmsRetrieve**](AuthenticatorsApi.md#authenticatorsAdminSmsRetrieve) | **GET** /authenticators/admin/sms/{id}/ |  |
| [**authenticatorsAdminSmsUpdate**](AuthenticatorsApi.md#authenticatorsAdminSmsUpdate) | **PUT** /authenticators/admin/sms/{id}/ |  |
| [**authenticatorsAdminStaticCreate**](AuthenticatorsApi.md#authenticatorsAdminStaticCreate) | **POST** /authenticators/admin/static/ |  |
| [**authenticatorsAdminStaticDestroy**](AuthenticatorsApi.md#authenticatorsAdminStaticDestroy) | **DELETE** /authenticators/admin/static/{id}/ |  |
| [**authenticatorsAdminStaticList**](AuthenticatorsApi.md#authenticatorsAdminStaticList) | **GET** /authenticators/admin/static/ |  |
| [**authenticatorsAdminStaticPartialUpdate**](AuthenticatorsApi.md#authenticatorsAdminStaticPartialUpdate) | **PATCH** /authenticators/admin/static/{id}/ |  |
| [**authenticatorsAdminStaticRetrieve**](AuthenticatorsApi.md#authenticatorsAdminStaticRetrieve) | **GET** /authenticators/admin/static/{id}/ |  |
| [**authenticatorsAdminStaticUpdate**](AuthenticatorsApi.md#authenticatorsAdminStaticUpdate) | **PUT** /authenticators/admin/static/{id}/ |  |
| [**authenticatorsAdminTotpCreate**](AuthenticatorsApi.md#authenticatorsAdminTotpCreate) | **POST** /authenticators/admin/totp/ |  |
| [**authenticatorsAdminTotpDestroy**](AuthenticatorsApi.md#authenticatorsAdminTotpDestroy) | **DELETE** /authenticators/admin/totp/{id}/ |  |
| [**authenticatorsAdminTotpList**](AuthenticatorsApi.md#authenticatorsAdminTotpList) | **GET** /authenticators/admin/totp/ |  |
| [**authenticatorsAdminTotpPartialUpdate**](AuthenticatorsApi.md#authenticatorsAdminTotpPartialUpdate) | **PATCH** /authenticators/admin/totp/{id}/ |  |
| [**authenticatorsAdminTotpRetrieve**](AuthenticatorsApi.md#authenticatorsAdminTotpRetrieve) | **GET** /authenticators/admin/totp/{id}/ |  |
| [**authenticatorsAdminTotpUpdate**](AuthenticatorsApi.md#authenticatorsAdminTotpUpdate) | **PUT** /authenticators/admin/totp/{id}/ |  |
| [**authenticatorsAdminWebauthnCreate**](AuthenticatorsApi.md#authenticatorsAdminWebauthnCreate) | **POST** /authenticators/admin/webauthn/ |  |
| [**authenticatorsAdminWebauthnDestroy**](AuthenticatorsApi.md#authenticatorsAdminWebauthnDestroy) | **DELETE** /authenticators/admin/webauthn/{id}/ |  |
| [**authenticatorsAdminWebauthnList**](AuthenticatorsApi.md#authenticatorsAdminWebauthnList) | **GET** /authenticators/admin/webauthn/ |  |
| [**authenticatorsAdminWebauthnPartialUpdate**](AuthenticatorsApi.md#authenticatorsAdminWebauthnPartialUpdate) | **PATCH** /authenticators/admin/webauthn/{id}/ |  |
| [**authenticatorsAdminWebauthnRetrieve**](AuthenticatorsApi.md#authenticatorsAdminWebauthnRetrieve) | **GET** /authenticators/admin/webauthn/{id}/ |  |
| [**authenticatorsAdminWebauthnUpdate**](AuthenticatorsApi.md#authenticatorsAdminWebauthnUpdate) | **PUT** /authenticators/admin/webauthn/{id}/ |  |
| [**authenticatorsAllList**](AuthenticatorsApi.md#authenticatorsAllList) | **GET** /authenticators/all/ |  |
| [**authenticatorsDuoDestroy**](AuthenticatorsApi.md#authenticatorsDuoDestroy) | **DELETE** /authenticators/duo/{id}/ |  |
| [**authenticatorsDuoList**](AuthenticatorsApi.md#authenticatorsDuoList) | **GET** /authenticators/duo/ |  |
| [**authenticatorsDuoPartialUpdate**](AuthenticatorsApi.md#authenticatorsDuoPartialUpdate) | **PATCH** /authenticators/duo/{id}/ |  |
| [**authenticatorsDuoRetrieve**](AuthenticatorsApi.md#authenticatorsDuoRetrieve) | **GET** /authenticators/duo/{id}/ |  |
| [**authenticatorsDuoUpdate**](AuthenticatorsApi.md#authenticatorsDuoUpdate) | **PUT** /authenticators/duo/{id}/ |  |
| [**authenticatorsDuoUsedByList**](AuthenticatorsApi.md#authenticatorsDuoUsedByList) | **GET** /authenticators/duo/{id}/used_by/ |  |
| [**authenticatorsSmsDestroy**](AuthenticatorsApi.md#authenticatorsSmsDestroy) | **DELETE** /authenticators/sms/{id}/ |  |
| [**authenticatorsSmsList**](AuthenticatorsApi.md#authenticatorsSmsList) | **GET** /authenticators/sms/ |  |
| [**authenticatorsSmsPartialUpdate**](AuthenticatorsApi.md#authenticatorsSmsPartialUpdate) | **PATCH** /authenticators/sms/{id}/ |  |
| [**authenticatorsSmsRetrieve**](AuthenticatorsApi.md#authenticatorsSmsRetrieve) | **GET** /authenticators/sms/{id}/ |  |
| [**authenticatorsSmsUpdate**](AuthenticatorsApi.md#authenticatorsSmsUpdate) | **PUT** /authenticators/sms/{id}/ |  |
| [**authenticatorsSmsUsedByList**](AuthenticatorsApi.md#authenticatorsSmsUsedByList) | **GET** /authenticators/sms/{id}/used_by/ |  |
| [**authenticatorsStaticDestroy**](AuthenticatorsApi.md#authenticatorsStaticDestroy) | **DELETE** /authenticators/static/{id}/ |  |
| [**authenticatorsStaticList**](AuthenticatorsApi.md#authenticatorsStaticList) | **GET** /authenticators/static/ |  |
| [**authenticatorsStaticPartialUpdate**](AuthenticatorsApi.md#authenticatorsStaticPartialUpdate) | **PATCH** /authenticators/static/{id}/ |  |
| [**authenticatorsStaticRetrieve**](AuthenticatorsApi.md#authenticatorsStaticRetrieve) | **GET** /authenticators/static/{id}/ |  |
| [**authenticatorsStaticUpdate**](AuthenticatorsApi.md#authenticatorsStaticUpdate) | **PUT** /authenticators/static/{id}/ |  |
| [**authenticatorsStaticUsedByList**](AuthenticatorsApi.md#authenticatorsStaticUsedByList) | **GET** /authenticators/static/{id}/used_by/ |  |
| [**authenticatorsTotpDestroy**](AuthenticatorsApi.md#authenticatorsTotpDestroy) | **DELETE** /authenticators/totp/{id}/ |  |
| [**authenticatorsTotpList**](AuthenticatorsApi.md#authenticatorsTotpList) | **GET** /authenticators/totp/ |  |
| [**authenticatorsTotpPartialUpdate**](AuthenticatorsApi.md#authenticatorsTotpPartialUpdate) | **PATCH** /authenticators/totp/{id}/ |  |
| [**authenticatorsTotpRetrieve**](AuthenticatorsApi.md#authenticatorsTotpRetrieve) | **GET** /authenticators/totp/{id}/ |  |
| [**authenticatorsTotpUpdate**](AuthenticatorsApi.md#authenticatorsTotpUpdate) | **PUT** /authenticators/totp/{id}/ |  |
| [**authenticatorsTotpUsedByList**](AuthenticatorsApi.md#authenticatorsTotpUsedByList) | **GET** /authenticators/totp/{id}/used_by/ |  |
| [**authenticatorsWebauthnDestroy**](AuthenticatorsApi.md#authenticatorsWebauthnDestroy) | **DELETE** /authenticators/webauthn/{id}/ |  |
| [**authenticatorsWebauthnList**](AuthenticatorsApi.md#authenticatorsWebauthnList) | **GET** /authenticators/webauthn/ |  |
| [**authenticatorsWebauthnPartialUpdate**](AuthenticatorsApi.md#authenticatorsWebauthnPartialUpdate) | **PATCH** /authenticators/webauthn/{id}/ |  |
| [**authenticatorsWebauthnRetrieve**](AuthenticatorsApi.md#authenticatorsWebauthnRetrieve) | **GET** /authenticators/webauthn/{id}/ |  |
| [**authenticatorsWebauthnUpdate**](AuthenticatorsApi.md#authenticatorsWebauthnUpdate) | **PUT** /authenticators/webauthn/{id}/ |  |
| [**authenticatorsWebauthnUsedByList**](AuthenticatorsApi.md#authenticatorsWebauthnUsedByList) | **GET** /authenticators/webauthn/{id}/used_by/ |  |


<a id="authenticatorsAdminAllList"></a>
# **authenticatorsAdminAllList**
> List&lt;Device&gt; authenticatorsAdminAllList(user)



Get all devices for current user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer user = 56; // Integer | 
    try {
      List<Device> result = apiInstance.authenticatorsAdminAllList(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminAllList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **user** | **Integer**|  | [optional] |

### Return type

[**List&lt;Device&gt;**](Device.md)

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

<a id="authenticatorsAdminDuoCreate"></a>
# **authenticatorsAdminDuoCreate**
> DuoDevice authenticatorsAdminDuoCreate(duoDeviceRequest)



Viewset for Duo authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    DuoDeviceRequest duoDeviceRequest = new DuoDeviceRequest(); // DuoDeviceRequest | 
    try {
      DuoDevice result = apiInstance.authenticatorsAdminDuoCreate(duoDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminDuoCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **duoDeviceRequest** | [**DuoDeviceRequest**](DuoDeviceRequest.md)|  | |

### Return type

[**DuoDevice**](DuoDevice.md)

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

<a id="authenticatorsAdminDuoDestroy"></a>
# **authenticatorsAdminDuoDestroy**
> authenticatorsAdminDuoDestroy(id)



Viewset for Duo authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Duo Device.
    try {
      apiInstance.authenticatorsAdminDuoDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminDuoDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Duo Device. | |

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

<a id="authenticatorsAdminDuoList"></a>
# **authenticatorsAdminDuoList**
> PaginatedDuoDeviceList authenticatorsAdminDuoList(name, ordering, page, pageSize, search)



Viewset for Duo authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedDuoDeviceList result = apiInstance.authenticatorsAdminDuoList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminDuoList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedDuoDeviceList**](PaginatedDuoDeviceList.md)

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

<a id="authenticatorsAdminDuoPartialUpdate"></a>
# **authenticatorsAdminDuoPartialUpdate**
> DuoDevice authenticatorsAdminDuoPartialUpdate(id, patchedDuoDeviceRequest)



Viewset for Duo authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Duo Device.
    PatchedDuoDeviceRequest patchedDuoDeviceRequest = new PatchedDuoDeviceRequest(); // PatchedDuoDeviceRequest | 
    try {
      DuoDevice result = apiInstance.authenticatorsAdminDuoPartialUpdate(id, patchedDuoDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminDuoPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Duo Device. | |
| **patchedDuoDeviceRequest** | [**PatchedDuoDeviceRequest**](PatchedDuoDeviceRequest.md)|  | [optional] |

### Return type

[**DuoDevice**](DuoDevice.md)

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

<a id="authenticatorsAdminDuoRetrieve"></a>
# **authenticatorsAdminDuoRetrieve**
> DuoDevice authenticatorsAdminDuoRetrieve(id)



Viewset for Duo authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Duo Device.
    try {
      DuoDevice result = apiInstance.authenticatorsAdminDuoRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminDuoRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Duo Device. | |

### Return type

[**DuoDevice**](DuoDevice.md)

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

<a id="authenticatorsAdminDuoUpdate"></a>
# **authenticatorsAdminDuoUpdate**
> DuoDevice authenticatorsAdminDuoUpdate(id, duoDeviceRequest)



Viewset for Duo authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Duo Device.
    DuoDeviceRequest duoDeviceRequest = new DuoDeviceRequest(); // DuoDeviceRequest | 
    try {
      DuoDevice result = apiInstance.authenticatorsAdminDuoUpdate(id, duoDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminDuoUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Duo Device. | |
| **duoDeviceRequest** | [**DuoDeviceRequest**](DuoDeviceRequest.md)|  | |

### Return type

[**DuoDevice**](DuoDevice.md)

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

<a id="authenticatorsAdminSmsCreate"></a>
# **authenticatorsAdminSmsCreate**
> SMSDevice authenticatorsAdminSmsCreate(smSDeviceRequest)



Viewset for sms authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    SMSDeviceRequest smSDeviceRequest = new SMSDeviceRequest(); // SMSDeviceRequest | 
    try {
      SMSDevice result = apiInstance.authenticatorsAdminSmsCreate(smSDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminSmsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **smSDeviceRequest** | [**SMSDeviceRequest**](SMSDeviceRequest.md)|  | |

### Return type

[**SMSDevice**](SMSDevice.md)

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

<a id="authenticatorsAdminSmsDestroy"></a>
# **authenticatorsAdminSmsDestroy**
> authenticatorsAdminSmsDestroy(id)



Viewset for sms authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SMS Device.
    try {
      apiInstance.authenticatorsAdminSmsDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminSmsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this SMS Device. | |

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

<a id="authenticatorsAdminSmsList"></a>
# **authenticatorsAdminSmsList**
> PaginatedSMSDeviceList authenticatorsAdminSmsList(name, ordering, page, pageSize, search)



Viewset for sms authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedSMSDeviceList result = apiInstance.authenticatorsAdminSmsList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminSmsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedSMSDeviceList**](PaginatedSMSDeviceList.md)

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

<a id="authenticatorsAdminSmsPartialUpdate"></a>
# **authenticatorsAdminSmsPartialUpdate**
> SMSDevice authenticatorsAdminSmsPartialUpdate(id, patchedSMSDeviceRequest)



Viewset for sms authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SMS Device.
    PatchedSMSDeviceRequest patchedSMSDeviceRequest = new PatchedSMSDeviceRequest(); // PatchedSMSDeviceRequest | 
    try {
      SMSDevice result = apiInstance.authenticatorsAdminSmsPartialUpdate(id, patchedSMSDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminSmsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this SMS Device. | |
| **patchedSMSDeviceRequest** | [**PatchedSMSDeviceRequest**](PatchedSMSDeviceRequest.md)|  | [optional] |

### Return type

[**SMSDevice**](SMSDevice.md)

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

<a id="authenticatorsAdminSmsRetrieve"></a>
# **authenticatorsAdminSmsRetrieve**
> SMSDevice authenticatorsAdminSmsRetrieve(id)



Viewset for sms authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SMS Device.
    try {
      SMSDevice result = apiInstance.authenticatorsAdminSmsRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminSmsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this SMS Device. | |

### Return type

[**SMSDevice**](SMSDevice.md)

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

<a id="authenticatorsAdminSmsUpdate"></a>
# **authenticatorsAdminSmsUpdate**
> SMSDevice authenticatorsAdminSmsUpdate(id, smSDeviceRequest)



Viewset for sms authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SMS Device.
    SMSDeviceRequest smSDeviceRequest = new SMSDeviceRequest(); // SMSDeviceRequest | 
    try {
      SMSDevice result = apiInstance.authenticatorsAdminSmsUpdate(id, smSDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminSmsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this SMS Device. | |
| **smSDeviceRequest** | [**SMSDeviceRequest**](SMSDeviceRequest.md)|  | |

### Return type

[**SMSDevice**](SMSDevice.md)

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

<a id="authenticatorsAdminStaticCreate"></a>
# **authenticatorsAdminStaticCreate**
> StaticDevice authenticatorsAdminStaticCreate(staticDeviceRequest)



Viewset for static authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    StaticDeviceRequest staticDeviceRequest = new StaticDeviceRequest(); // StaticDeviceRequest | 
    try {
      StaticDevice result = apiInstance.authenticatorsAdminStaticCreate(staticDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminStaticCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **staticDeviceRequest** | [**StaticDeviceRequest**](StaticDeviceRequest.md)|  | |

### Return type

[**StaticDevice**](StaticDevice.md)

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

<a id="authenticatorsAdminStaticDestroy"></a>
# **authenticatorsAdminStaticDestroy**
> authenticatorsAdminStaticDestroy(id)



Viewset for static authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Static Device.
    try {
      apiInstance.authenticatorsAdminStaticDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminStaticDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Static Device. | |

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

<a id="authenticatorsAdminStaticList"></a>
# **authenticatorsAdminStaticList**
> PaginatedStaticDeviceList authenticatorsAdminStaticList(name, ordering, page, pageSize, search)



Viewset for static authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedStaticDeviceList result = apiInstance.authenticatorsAdminStaticList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminStaticList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedStaticDeviceList**](PaginatedStaticDeviceList.md)

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

<a id="authenticatorsAdminStaticPartialUpdate"></a>
# **authenticatorsAdminStaticPartialUpdate**
> StaticDevice authenticatorsAdminStaticPartialUpdate(id, patchedStaticDeviceRequest)



Viewset for static authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Static Device.
    PatchedStaticDeviceRequest patchedStaticDeviceRequest = new PatchedStaticDeviceRequest(); // PatchedStaticDeviceRequest | 
    try {
      StaticDevice result = apiInstance.authenticatorsAdminStaticPartialUpdate(id, patchedStaticDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminStaticPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Static Device. | |
| **patchedStaticDeviceRequest** | [**PatchedStaticDeviceRequest**](PatchedStaticDeviceRequest.md)|  | [optional] |

### Return type

[**StaticDevice**](StaticDevice.md)

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

<a id="authenticatorsAdminStaticRetrieve"></a>
# **authenticatorsAdminStaticRetrieve**
> StaticDevice authenticatorsAdminStaticRetrieve(id)



Viewset for static authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Static Device.
    try {
      StaticDevice result = apiInstance.authenticatorsAdminStaticRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminStaticRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Static Device. | |

### Return type

[**StaticDevice**](StaticDevice.md)

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

<a id="authenticatorsAdminStaticUpdate"></a>
# **authenticatorsAdminStaticUpdate**
> StaticDevice authenticatorsAdminStaticUpdate(id, staticDeviceRequest)



Viewset for static authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Static Device.
    StaticDeviceRequest staticDeviceRequest = new StaticDeviceRequest(); // StaticDeviceRequest | 
    try {
      StaticDevice result = apiInstance.authenticatorsAdminStaticUpdate(id, staticDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminStaticUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Static Device. | |
| **staticDeviceRequest** | [**StaticDeviceRequest**](StaticDeviceRequest.md)|  | |

### Return type

[**StaticDevice**](StaticDevice.md)

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

<a id="authenticatorsAdminTotpCreate"></a>
# **authenticatorsAdminTotpCreate**
> TOTPDevice authenticatorsAdminTotpCreate(toTPDeviceRequest)



Viewset for totp authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    TOTPDeviceRequest toTPDeviceRequest = new TOTPDeviceRequest(); // TOTPDeviceRequest | 
    try {
      TOTPDevice result = apiInstance.authenticatorsAdminTotpCreate(toTPDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminTotpCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toTPDeviceRequest** | [**TOTPDeviceRequest**](TOTPDeviceRequest.md)|  | |

### Return type

[**TOTPDevice**](TOTPDevice.md)

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

<a id="authenticatorsAdminTotpDestroy"></a>
# **authenticatorsAdminTotpDestroy**
> authenticatorsAdminTotpDestroy(id)



Viewset for totp authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this TOTP Device.
    try {
      apiInstance.authenticatorsAdminTotpDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminTotpDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this TOTP Device. | |

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

<a id="authenticatorsAdminTotpList"></a>
# **authenticatorsAdminTotpList**
> PaginatedTOTPDeviceList authenticatorsAdminTotpList(name, ordering, page, pageSize, search)



Viewset for totp authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedTOTPDeviceList result = apiInstance.authenticatorsAdminTotpList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminTotpList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedTOTPDeviceList**](PaginatedTOTPDeviceList.md)

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

<a id="authenticatorsAdminTotpPartialUpdate"></a>
# **authenticatorsAdminTotpPartialUpdate**
> TOTPDevice authenticatorsAdminTotpPartialUpdate(id, patchedTOTPDeviceRequest)



Viewset for totp authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this TOTP Device.
    PatchedTOTPDeviceRequest patchedTOTPDeviceRequest = new PatchedTOTPDeviceRequest(); // PatchedTOTPDeviceRequest | 
    try {
      TOTPDevice result = apiInstance.authenticatorsAdminTotpPartialUpdate(id, patchedTOTPDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminTotpPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this TOTP Device. | |
| **patchedTOTPDeviceRequest** | [**PatchedTOTPDeviceRequest**](PatchedTOTPDeviceRequest.md)|  | [optional] |

### Return type

[**TOTPDevice**](TOTPDevice.md)

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

<a id="authenticatorsAdminTotpRetrieve"></a>
# **authenticatorsAdminTotpRetrieve**
> TOTPDevice authenticatorsAdminTotpRetrieve(id)



Viewset for totp authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this TOTP Device.
    try {
      TOTPDevice result = apiInstance.authenticatorsAdminTotpRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminTotpRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this TOTP Device. | |

### Return type

[**TOTPDevice**](TOTPDevice.md)

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

<a id="authenticatorsAdminTotpUpdate"></a>
# **authenticatorsAdminTotpUpdate**
> TOTPDevice authenticatorsAdminTotpUpdate(id, toTPDeviceRequest)



Viewset for totp authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this TOTP Device.
    TOTPDeviceRequest toTPDeviceRequest = new TOTPDeviceRequest(); // TOTPDeviceRequest | 
    try {
      TOTPDevice result = apiInstance.authenticatorsAdminTotpUpdate(id, toTPDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminTotpUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this TOTP Device. | |
| **toTPDeviceRequest** | [**TOTPDeviceRequest**](TOTPDeviceRequest.md)|  | |

### Return type

[**TOTPDevice**](TOTPDevice.md)

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

<a id="authenticatorsAdminWebauthnCreate"></a>
# **authenticatorsAdminWebauthnCreate**
> WebAuthnDevice authenticatorsAdminWebauthnCreate(webAuthnDeviceRequest)



Viewset for WebAuthn authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    WebAuthnDeviceRequest webAuthnDeviceRequest = new WebAuthnDeviceRequest(); // WebAuthnDeviceRequest | 
    try {
      WebAuthnDevice result = apiInstance.authenticatorsAdminWebauthnCreate(webAuthnDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminWebauthnCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webAuthnDeviceRequest** | [**WebAuthnDeviceRequest**](WebAuthnDeviceRequest.md)|  | |

### Return type

[**WebAuthnDevice**](WebAuthnDevice.md)

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

<a id="authenticatorsAdminWebauthnDestroy"></a>
# **authenticatorsAdminWebauthnDestroy**
> authenticatorsAdminWebauthnDestroy(id)



Viewset for WebAuthn authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this WebAuthn Device.
    try {
      apiInstance.authenticatorsAdminWebauthnDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminWebauthnDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this WebAuthn Device. | |

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

<a id="authenticatorsAdminWebauthnList"></a>
# **authenticatorsAdminWebauthnList**
> PaginatedWebAuthnDeviceList authenticatorsAdminWebauthnList(name, ordering, page, pageSize, search)



Viewset for WebAuthn authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedWebAuthnDeviceList result = apiInstance.authenticatorsAdminWebauthnList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminWebauthnList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedWebAuthnDeviceList**](PaginatedWebAuthnDeviceList.md)

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

<a id="authenticatorsAdminWebauthnPartialUpdate"></a>
# **authenticatorsAdminWebauthnPartialUpdate**
> WebAuthnDevice authenticatorsAdminWebauthnPartialUpdate(id, patchedWebAuthnDeviceRequest)



Viewset for WebAuthn authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this WebAuthn Device.
    PatchedWebAuthnDeviceRequest patchedWebAuthnDeviceRequest = new PatchedWebAuthnDeviceRequest(); // PatchedWebAuthnDeviceRequest | 
    try {
      WebAuthnDevice result = apiInstance.authenticatorsAdminWebauthnPartialUpdate(id, patchedWebAuthnDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminWebauthnPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this WebAuthn Device. | |
| **patchedWebAuthnDeviceRequest** | [**PatchedWebAuthnDeviceRequest**](PatchedWebAuthnDeviceRequest.md)|  | [optional] |

### Return type

[**WebAuthnDevice**](WebAuthnDevice.md)

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

<a id="authenticatorsAdminWebauthnRetrieve"></a>
# **authenticatorsAdminWebauthnRetrieve**
> WebAuthnDevice authenticatorsAdminWebauthnRetrieve(id)



Viewset for WebAuthn authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this WebAuthn Device.
    try {
      WebAuthnDevice result = apiInstance.authenticatorsAdminWebauthnRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminWebauthnRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this WebAuthn Device. | |

### Return type

[**WebAuthnDevice**](WebAuthnDevice.md)

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

<a id="authenticatorsAdminWebauthnUpdate"></a>
# **authenticatorsAdminWebauthnUpdate**
> WebAuthnDevice authenticatorsAdminWebauthnUpdate(id, webAuthnDeviceRequest)



Viewset for WebAuthn authenticator devices (for admins)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this WebAuthn Device.
    WebAuthnDeviceRequest webAuthnDeviceRequest = new WebAuthnDeviceRequest(); // WebAuthnDeviceRequest | 
    try {
      WebAuthnDevice result = apiInstance.authenticatorsAdminWebauthnUpdate(id, webAuthnDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAdminWebauthnUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this WebAuthn Device. | |
| **webAuthnDeviceRequest** | [**WebAuthnDeviceRequest**](WebAuthnDeviceRequest.md)|  | |

### Return type

[**WebAuthnDevice**](WebAuthnDevice.md)

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

<a id="authenticatorsAllList"></a>
# **authenticatorsAllList**
> List&lt;Device&gt; authenticatorsAllList()



Get all devices for current user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    try {
      List<Device> result = apiInstance.authenticatorsAllList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsAllList");
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

[**List&lt;Device&gt;**](Device.md)

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

<a id="authenticatorsDuoDestroy"></a>
# **authenticatorsDuoDestroy**
> authenticatorsDuoDestroy(id)



Viewset for Duo authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Duo Device.
    try {
      apiInstance.authenticatorsDuoDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsDuoDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Duo Device. | |

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

<a id="authenticatorsDuoList"></a>
# **authenticatorsDuoList**
> PaginatedDuoDeviceList authenticatorsDuoList(name, ordering, page, pageSize, search)



Viewset for Duo authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedDuoDeviceList result = apiInstance.authenticatorsDuoList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsDuoList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedDuoDeviceList**](PaginatedDuoDeviceList.md)

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

<a id="authenticatorsDuoPartialUpdate"></a>
# **authenticatorsDuoPartialUpdate**
> DuoDevice authenticatorsDuoPartialUpdate(id, patchedDuoDeviceRequest)



Viewset for Duo authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Duo Device.
    PatchedDuoDeviceRequest patchedDuoDeviceRequest = new PatchedDuoDeviceRequest(); // PatchedDuoDeviceRequest | 
    try {
      DuoDevice result = apiInstance.authenticatorsDuoPartialUpdate(id, patchedDuoDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsDuoPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Duo Device. | |
| **patchedDuoDeviceRequest** | [**PatchedDuoDeviceRequest**](PatchedDuoDeviceRequest.md)|  | [optional] |

### Return type

[**DuoDevice**](DuoDevice.md)

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

<a id="authenticatorsDuoRetrieve"></a>
# **authenticatorsDuoRetrieve**
> DuoDevice authenticatorsDuoRetrieve(id)



Viewset for Duo authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Duo Device.
    try {
      DuoDevice result = apiInstance.authenticatorsDuoRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsDuoRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Duo Device. | |

### Return type

[**DuoDevice**](DuoDevice.md)

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

<a id="authenticatorsDuoUpdate"></a>
# **authenticatorsDuoUpdate**
> DuoDevice authenticatorsDuoUpdate(id, duoDeviceRequest)



Viewset for Duo authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Duo Device.
    DuoDeviceRequest duoDeviceRequest = new DuoDeviceRequest(); // DuoDeviceRequest | 
    try {
      DuoDevice result = apiInstance.authenticatorsDuoUpdate(id, duoDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsDuoUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Duo Device. | |
| **duoDeviceRequest** | [**DuoDeviceRequest**](DuoDeviceRequest.md)|  | |

### Return type

[**DuoDevice**](DuoDevice.md)

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

<a id="authenticatorsDuoUsedByList"></a>
# **authenticatorsDuoUsedByList**
> List&lt;UsedBy&gt; authenticatorsDuoUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Duo Device.
    try {
      List<UsedBy> result = apiInstance.authenticatorsDuoUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsDuoUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Duo Device. | |

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

<a id="authenticatorsSmsDestroy"></a>
# **authenticatorsSmsDestroy**
> authenticatorsSmsDestroy(id)



Viewset for sms authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SMS Device.
    try {
      apiInstance.authenticatorsSmsDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsSmsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this SMS Device. | |

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

<a id="authenticatorsSmsList"></a>
# **authenticatorsSmsList**
> PaginatedSMSDeviceList authenticatorsSmsList(name, ordering, page, pageSize, search)



Viewset for sms authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedSMSDeviceList result = apiInstance.authenticatorsSmsList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsSmsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedSMSDeviceList**](PaginatedSMSDeviceList.md)

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

<a id="authenticatorsSmsPartialUpdate"></a>
# **authenticatorsSmsPartialUpdate**
> SMSDevice authenticatorsSmsPartialUpdate(id, patchedSMSDeviceRequest)



Viewset for sms authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SMS Device.
    PatchedSMSDeviceRequest patchedSMSDeviceRequest = new PatchedSMSDeviceRequest(); // PatchedSMSDeviceRequest | 
    try {
      SMSDevice result = apiInstance.authenticatorsSmsPartialUpdate(id, patchedSMSDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsSmsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this SMS Device. | |
| **patchedSMSDeviceRequest** | [**PatchedSMSDeviceRequest**](PatchedSMSDeviceRequest.md)|  | [optional] |

### Return type

[**SMSDevice**](SMSDevice.md)

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

<a id="authenticatorsSmsRetrieve"></a>
# **authenticatorsSmsRetrieve**
> SMSDevice authenticatorsSmsRetrieve(id)



Viewset for sms authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SMS Device.
    try {
      SMSDevice result = apiInstance.authenticatorsSmsRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsSmsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this SMS Device. | |

### Return type

[**SMSDevice**](SMSDevice.md)

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

<a id="authenticatorsSmsUpdate"></a>
# **authenticatorsSmsUpdate**
> SMSDevice authenticatorsSmsUpdate(id, smSDeviceRequest)



Viewset for sms authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SMS Device.
    SMSDeviceRequest smSDeviceRequest = new SMSDeviceRequest(); // SMSDeviceRequest | 
    try {
      SMSDevice result = apiInstance.authenticatorsSmsUpdate(id, smSDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsSmsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this SMS Device. | |
| **smSDeviceRequest** | [**SMSDeviceRequest**](SMSDeviceRequest.md)|  | |

### Return type

[**SMSDevice**](SMSDevice.md)

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

<a id="authenticatorsSmsUsedByList"></a>
# **authenticatorsSmsUsedByList**
> List&lt;UsedBy&gt; authenticatorsSmsUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this SMS Device.
    try {
      List<UsedBy> result = apiInstance.authenticatorsSmsUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsSmsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this SMS Device. | |

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

<a id="authenticatorsStaticDestroy"></a>
# **authenticatorsStaticDestroy**
> authenticatorsStaticDestroy(id)



Viewset for static authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Static Device.
    try {
      apiInstance.authenticatorsStaticDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsStaticDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Static Device. | |

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

<a id="authenticatorsStaticList"></a>
# **authenticatorsStaticList**
> PaginatedStaticDeviceList authenticatorsStaticList(name, ordering, page, pageSize, search)



Viewset for static authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedStaticDeviceList result = apiInstance.authenticatorsStaticList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsStaticList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedStaticDeviceList**](PaginatedStaticDeviceList.md)

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

<a id="authenticatorsStaticPartialUpdate"></a>
# **authenticatorsStaticPartialUpdate**
> StaticDevice authenticatorsStaticPartialUpdate(id, patchedStaticDeviceRequest)



Viewset for static authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Static Device.
    PatchedStaticDeviceRequest patchedStaticDeviceRequest = new PatchedStaticDeviceRequest(); // PatchedStaticDeviceRequest | 
    try {
      StaticDevice result = apiInstance.authenticatorsStaticPartialUpdate(id, patchedStaticDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsStaticPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Static Device. | |
| **patchedStaticDeviceRequest** | [**PatchedStaticDeviceRequest**](PatchedStaticDeviceRequest.md)|  | [optional] |

### Return type

[**StaticDevice**](StaticDevice.md)

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

<a id="authenticatorsStaticRetrieve"></a>
# **authenticatorsStaticRetrieve**
> StaticDevice authenticatorsStaticRetrieve(id)



Viewset for static authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Static Device.
    try {
      StaticDevice result = apiInstance.authenticatorsStaticRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsStaticRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Static Device. | |

### Return type

[**StaticDevice**](StaticDevice.md)

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

<a id="authenticatorsStaticUpdate"></a>
# **authenticatorsStaticUpdate**
> StaticDevice authenticatorsStaticUpdate(id, staticDeviceRequest)



Viewset for static authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Static Device.
    StaticDeviceRequest staticDeviceRequest = new StaticDeviceRequest(); // StaticDeviceRequest | 
    try {
      StaticDevice result = apiInstance.authenticatorsStaticUpdate(id, staticDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsStaticUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Static Device. | |
| **staticDeviceRequest** | [**StaticDeviceRequest**](StaticDeviceRequest.md)|  | |

### Return type

[**StaticDevice**](StaticDevice.md)

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

<a id="authenticatorsStaticUsedByList"></a>
# **authenticatorsStaticUsedByList**
> List&lt;UsedBy&gt; authenticatorsStaticUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Static Device.
    try {
      List<UsedBy> result = apiInstance.authenticatorsStaticUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsStaticUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Static Device. | |

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

<a id="authenticatorsTotpDestroy"></a>
# **authenticatorsTotpDestroy**
> authenticatorsTotpDestroy(id)



Viewset for totp authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this TOTP Device.
    try {
      apiInstance.authenticatorsTotpDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsTotpDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this TOTP Device. | |

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

<a id="authenticatorsTotpList"></a>
# **authenticatorsTotpList**
> PaginatedTOTPDeviceList authenticatorsTotpList(name, ordering, page, pageSize, search)



Viewset for totp authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedTOTPDeviceList result = apiInstance.authenticatorsTotpList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsTotpList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedTOTPDeviceList**](PaginatedTOTPDeviceList.md)

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

<a id="authenticatorsTotpPartialUpdate"></a>
# **authenticatorsTotpPartialUpdate**
> TOTPDevice authenticatorsTotpPartialUpdate(id, patchedTOTPDeviceRequest)



Viewset for totp authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this TOTP Device.
    PatchedTOTPDeviceRequest patchedTOTPDeviceRequest = new PatchedTOTPDeviceRequest(); // PatchedTOTPDeviceRequest | 
    try {
      TOTPDevice result = apiInstance.authenticatorsTotpPartialUpdate(id, patchedTOTPDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsTotpPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this TOTP Device. | |
| **patchedTOTPDeviceRequest** | [**PatchedTOTPDeviceRequest**](PatchedTOTPDeviceRequest.md)|  | [optional] |

### Return type

[**TOTPDevice**](TOTPDevice.md)

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

<a id="authenticatorsTotpRetrieve"></a>
# **authenticatorsTotpRetrieve**
> TOTPDevice authenticatorsTotpRetrieve(id)



Viewset for totp authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this TOTP Device.
    try {
      TOTPDevice result = apiInstance.authenticatorsTotpRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsTotpRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this TOTP Device. | |

### Return type

[**TOTPDevice**](TOTPDevice.md)

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

<a id="authenticatorsTotpUpdate"></a>
# **authenticatorsTotpUpdate**
> TOTPDevice authenticatorsTotpUpdate(id, toTPDeviceRequest)



Viewset for totp authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this TOTP Device.
    TOTPDeviceRequest toTPDeviceRequest = new TOTPDeviceRequest(); // TOTPDeviceRequest | 
    try {
      TOTPDevice result = apiInstance.authenticatorsTotpUpdate(id, toTPDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsTotpUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this TOTP Device. | |
| **toTPDeviceRequest** | [**TOTPDeviceRequest**](TOTPDeviceRequest.md)|  | |

### Return type

[**TOTPDevice**](TOTPDevice.md)

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

<a id="authenticatorsTotpUsedByList"></a>
# **authenticatorsTotpUsedByList**
> List&lt;UsedBy&gt; authenticatorsTotpUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this TOTP Device.
    try {
      List<UsedBy> result = apiInstance.authenticatorsTotpUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsTotpUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this TOTP Device. | |

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

<a id="authenticatorsWebauthnDestroy"></a>
# **authenticatorsWebauthnDestroy**
> authenticatorsWebauthnDestroy(id)



Viewset for WebAuthn authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this WebAuthn Device.
    try {
      apiInstance.authenticatorsWebauthnDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsWebauthnDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this WebAuthn Device. | |

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

<a id="authenticatorsWebauthnList"></a>
# **authenticatorsWebauthnList**
> PaginatedWebAuthnDeviceList authenticatorsWebauthnList(name, ordering, page, pageSize, search)



Viewset for WebAuthn authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedWebAuthnDeviceList result = apiInstance.authenticatorsWebauthnList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsWebauthnList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedWebAuthnDeviceList**](PaginatedWebAuthnDeviceList.md)

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

<a id="authenticatorsWebauthnPartialUpdate"></a>
# **authenticatorsWebauthnPartialUpdate**
> WebAuthnDevice authenticatorsWebauthnPartialUpdate(id, patchedWebAuthnDeviceRequest)



Viewset for WebAuthn authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this WebAuthn Device.
    PatchedWebAuthnDeviceRequest patchedWebAuthnDeviceRequest = new PatchedWebAuthnDeviceRequest(); // PatchedWebAuthnDeviceRequest | 
    try {
      WebAuthnDevice result = apiInstance.authenticatorsWebauthnPartialUpdate(id, patchedWebAuthnDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsWebauthnPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this WebAuthn Device. | |
| **patchedWebAuthnDeviceRequest** | [**PatchedWebAuthnDeviceRequest**](PatchedWebAuthnDeviceRequest.md)|  | [optional] |

### Return type

[**WebAuthnDevice**](WebAuthnDevice.md)

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

<a id="authenticatorsWebauthnRetrieve"></a>
# **authenticatorsWebauthnRetrieve**
> WebAuthnDevice authenticatorsWebauthnRetrieve(id)



Viewset for WebAuthn authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this WebAuthn Device.
    try {
      WebAuthnDevice result = apiInstance.authenticatorsWebauthnRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsWebauthnRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this WebAuthn Device. | |

### Return type

[**WebAuthnDevice**](WebAuthnDevice.md)

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

<a id="authenticatorsWebauthnUpdate"></a>
# **authenticatorsWebauthnUpdate**
> WebAuthnDevice authenticatorsWebauthnUpdate(id, webAuthnDeviceRequest)



Viewset for WebAuthn authenticator devices

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this WebAuthn Device.
    WebAuthnDeviceRequest webAuthnDeviceRequest = new WebAuthnDeviceRequest(); // WebAuthnDeviceRequest | 
    try {
      WebAuthnDevice result = apiInstance.authenticatorsWebauthnUpdate(id, webAuthnDeviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsWebauthnUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this WebAuthn Device. | |
| **webAuthnDeviceRequest** | [**WebAuthnDeviceRequest**](WebAuthnDeviceRequest.md)|  | |

### Return type

[**WebAuthnDevice**](WebAuthnDevice.md)

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

<a id="authenticatorsWebauthnUsedByList"></a>
# **authenticatorsWebauthnUsedByList**
> List&lt;UsedBy&gt; authenticatorsWebauthnUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    AuthenticatorsApi apiInstance = new AuthenticatorsApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this WebAuthn Device.
    try {
      List<UsedBy> result = apiInstance.authenticatorsWebauthnUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticatorsApi#authenticatorsWebauthnUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this WebAuthn Device. | |

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

