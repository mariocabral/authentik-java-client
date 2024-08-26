# CryptoApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cryptoCertificatekeypairsCreate**](CryptoApi.md#cryptoCertificatekeypairsCreate) | **POST** /crypto/certificatekeypairs/ |  |
| [**cryptoCertificatekeypairsDestroy**](CryptoApi.md#cryptoCertificatekeypairsDestroy) | **DELETE** /crypto/certificatekeypairs/{kp_uuid}/ |  |
| [**cryptoCertificatekeypairsGenerateCreate**](CryptoApi.md#cryptoCertificatekeypairsGenerateCreate) | **POST** /crypto/certificatekeypairs/generate/ |  |
| [**cryptoCertificatekeypairsList**](CryptoApi.md#cryptoCertificatekeypairsList) | **GET** /crypto/certificatekeypairs/ |  |
| [**cryptoCertificatekeypairsPartialUpdate**](CryptoApi.md#cryptoCertificatekeypairsPartialUpdate) | **PATCH** /crypto/certificatekeypairs/{kp_uuid}/ |  |
| [**cryptoCertificatekeypairsRetrieve**](CryptoApi.md#cryptoCertificatekeypairsRetrieve) | **GET** /crypto/certificatekeypairs/{kp_uuid}/ |  |
| [**cryptoCertificatekeypairsUpdate**](CryptoApi.md#cryptoCertificatekeypairsUpdate) | **PUT** /crypto/certificatekeypairs/{kp_uuid}/ |  |
| [**cryptoCertificatekeypairsUsedByList**](CryptoApi.md#cryptoCertificatekeypairsUsedByList) | **GET** /crypto/certificatekeypairs/{kp_uuid}/used_by/ |  |
| [**cryptoCertificatekeypairsViewCertificateRetrieve**](CryptoApi.md#cryptoCertificatekeypairsViewCertificateRetrieve) | **GET** /crypto/certificatekeypairs/{kp_uuid}/view_certificate/ |  |
| [**cryptoCertificatekeypairsViewPrivateKeyRetrieve**](CryptoApi.md#cryptoCertificatekeypairsViewPrivateKeyRetrieve) | **GET** /crypto/certificatekeypairs/{kp_uuid}/view_private_key/ |  |


<a id="cryptoCertificatekeypairsCreate"></a>
# **cryptoCertificatekeypairsCreate**
> CertificateKeyPair cryptoCertificatekeypairsCreate(certificateKeyPairRequest)



CertificateKeyPair Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    CertificateKeyPairRequest certificateKeyPairRequest = new CertificateKeyPairRequest(); // CertificateKeyPairRequest | 
    try {
      CertificateKeyPair result = apiInstance.cryptoCertificatekeypairsCreate(certificateKeyPairRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **certificateKeyPairRequest** | [**CertificateKeyPairRequest**](CertificateKeyPairRequest.md)|  | |

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

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

<a id="cryptoCertificatekeypairsDestroy"></a>
# **cryptoCertificatekeypairsDestroy**
> cryptoCertificatekeypairsDestroy(kpUuid)



CertificateKeyPair Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    UUID kpUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Certificate-Key Pair.
    try {
      apiInstance.cryptoCertificatekeypairsDestroy(kpUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **kpUuid** | **UUID**| A UUID string identifying this Certificate-Key Pair. | |

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

<a id="cryptoCertificatekeypairsGenerateCreate"></a>
# **cryptoCertificatekeypairsGenerateCreate**
> CertificateKeyPair cryptoCertificatekeypairsGenerateCreate(certificateGenerationRequest)



Generate a new, self-signed certificate-key pair

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    CertificateGenerationRequest certificateGenerationRequest = new CertificateGenerationRequest(); // CertificateGenerationRequest | 
    try {
      CertificateKeyPair result = apiInstance.cryptoCertificatekeypairsGenerateCreate(certificateGenerationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsGenerateCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **certificateGenerationRequest** | [**CertificateGenerationRequest**](CertificateGenerationRequest.md)|  | |

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="cryptoCertificatekeypairsList"></a>
# **cryptoCertificatekeypairsList**
> PaginatedCertificateKeyPairList cryptoCertificatekeypairsList(hasKey, includeDetails, managed, name, ordering, page, pageSize, search)



CertificateKeyPair Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    Boolean hasKey = true; // Boolean | Only return certificate-key pairs with keys
    Boolean includeDetails = true; // Boolean | 
    String managed = "managed_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedCertificateKeyPairList result = apiInstance.cryptoCertificatekeypairsList(hasKey, includeDetails, managed, name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hasKey** | **Boolean**| Only return certificate-key pairs with keys | [optional] |
| **includeDetails** | **Boolean**|  | [optional] [default to true] |
| **managed** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedCertificateKeyPairList**](PaginatedCertificateKeyPairList.md)

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

<a id="cryptoCertificatekeypairsPartialUpdate"></a>
# **cryptoCertificatekeypairsPartialUpdate**
> CertificateKeyPair cryptoCertificatekeypairsPartialUpdate(kpUuid, patchedCertificateKeyPairRequest)



CertificateKeyPair Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    UUID kpUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Certificate-Key Pair.
    PatchedCertificateKeyPairRequest patchedCertificateKeyPairRequest = new PatchedCertificateKeyPairRequest(); // PatchedCertificateKeyPairRequest | 
    try {
      CertificateKeyPair result = apiInstance.cryptoCertificatekeypairsPartialUpdate(kpUuid, patchedCertificateKeyPairRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **kpUuid** | **UUID**| A UUID string identifying this Certificate-Key Pair. | |
| **patchedCertificateKeyPairRequest** | [**PatchedCertificateKeyPairRequest**](PatchedCertificateKeyPairRequest.md)|  | [optional] |

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

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

<a id="cryptoCertificatekeypairsRetrieve"></a>
# **cryptoCertificatekeypairsRetrieve**
> CertificateKeyPair cryptoCertificatekeypairsRetrieve(kpUuid)



CertificateKeyPair Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    UUID kpUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Certificate-Key Pair.
    try {
      CertificateKeyPair result = apiInstance.cryptoCertificatekeypairsRetrieve(kpUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **kpUuid** | **UUID**| A UUID string identifying this Certificate-Key Pair. | |

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

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

<a id="cryptoCertificatekeypairsUpdate"></a>
# **cryptoCertificatekeypairsUpdate**
> CertificateKeyPair cryptoCertificatekeypairsUpdate(kpUuid, certificateKeyPairRequest)



CertificateKeyPair Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    UUID kpUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Certificate-Key Pair.
    CertificateKeyPairRequest certificateKeyPairRequest = new CertificateKeyPairRequest(); // CertificateKeyPairRequest | 
    try {
      CertificateKeyPair result = apiInstance.cryptoCertificatekeypairsUpdate(kpUuid, certificateKeyPairRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **kpUuid** | **UUID**| A UUID string identifying this Certificate-Key Pair. | |
| **certificateKeyPairRequest** | [**CertificateKeyPairRequest**](CertificateKeyPairRequest.md)|  | |

### Return type

[**CertificateKeyPair**](CertificateKeyPair.md)

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

<a id="cryptoCertificatekeypairsUsedByList"></a>
# **cryptoCertificatekeypairsUsedByList**
> List&lt;UsedBy&gt; cryptoCertificatekeypairsUsedByList(kpUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    UUID kpUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Certificate-Key Pair.
    try {
      List<UsedBy> result = apiInstance.cryptoCertificatekeypairsUsedByList(kpUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **kpUuid** | **UUID**| A UUID string identifying this Certificate-Key Pair. | |

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

<a id="cryptoCertificatekeypairsViewCertificateRetrieve"></a>
# **cryptoCertificatekeypairsViewCertificateRetrieve**
> CertificateData cryptoCertificatekeypairsViewCertificateRetrieve(kpUuid, download)



Return certificate-key pairs certificate and log access

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    UUID kpUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Certificate-Key Pair.
    Boolean download = true; // Boolean | 
    try {
      CertificateData result = apiInstance.cryptoCertificatekeypairsViewCertificateRetrieve(kpUuid, download);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsViewCertificateRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **kpUuid** | **UUID**| A UUID string identifying this Certificate-Key Pair. | |
| **download** | **Boolean**|  | [optional] |

### Return type

[**CertificateData**](CertificateData.md)

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

<a id="cryptoCertificatekeypairsViewPrivateKeyRetrieve"></a>
# **cryptoCertificatekeypairsViewPrivateKeyRetrieve**
> CertificateData cryptoCertificatekeypairsViewPrivateKeyRetrieve(kpUuid, download)



Return certificate-key pairs private key and log access

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CryptoApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    CryptoApi apiInstance = new CryptoApi(defaultClient);
    UUID kpUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Certificate-Key Pair.
    Boolean download = true; // Boolean | 
    try {
      CertificateData result = apiInstance.cryptoCertificatekeypairsViewPrivateKeyRetrieve(kpUuid, download);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CryptoApi#cryptoCertificatekeypairsViewPrivateKeyRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **kpUuid** | **UUID**| A UUID string identifying this Certificate-Key Pair. | |
| **download** | **Boolean**|  | [optional] |

### Return type

[**CertificateData**](CertificateData.md)

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

