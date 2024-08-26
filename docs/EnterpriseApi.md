# EnterpriseApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**enterpriseLicenseCreate**](EnterpriseApi.md#enterpriseLicenseCreate) | **POST** /enterprise/license/ |  |
| [**enterpriseLicenseDestroy**](EnterpriseApi.md#enterpriseLicenseDestroy) | **DELETE** /enterprise/license/{license_uuid}/ |  |
| [**enterpriseLicenseForecastRetrieve**](EnterpriseApi.md#enterpriseLicenseForecastRetrieve) | **GET** /enterprise/license/forecast/ |  |
| [**enterpriseLicenseGetInstallIdRetrieve**](EnterpriseApi.md#enterpriseLicenseGetInstallIdRetrieve) | **GET** /enterprise/license/get_install_id/ |  |
| [**enterpriseLicenseList**](EnterpriseApi.md#enterpriseLicenseList) | **GET** /enterprise/license/ |  |
| [**enterpriseLicensePartialUpdate**](EnterpriseApi.md#enterpriseLicensePartialUpdate) | **PATCH** /enterprise/license/{license_uuid}/ |  |
| [**enterpriseLicenseRetrieve**](EnterpriseApi.md#enterpriseLicenseRetrieve) | **GET** /enterprise/license/{license_uuid}/ |  |
| [**enterpriseLicenseSummaryRetrieve**](EnterpriseApi.md#enterpriseLicenseSummaryRetrieve) | **GET** /enterprise/license/summary/ |  |
| [**enterpriseLicenseUpdate**](EnterpriseApi.md#enterpriseLicenseUpdate) | **PUT** /enterprise/license/{license_uuid}/ |  |
| [**enterpriseLicenseUsedByList**](EnterpriseApi.md#enterpriseLicenseUsedByList) | **GET** /enterprise/license/{license_uuid}/used_by/ |  |


<a id="enterpriseLicenseCreate"></a>
# **enterpriseLicenseCreate**
> License enterpriseLicenseCreate(licenseRequest)



License Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    LicenseRequest licenseRequest = new LicenseRequest(); // LicenseRequest | 
    try {
      License result = apiInstance.enterpriseLicenseCreate(licenseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicenseCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseRequest** | [**LicenseRequest**](LicenseRequest.md)|  | |

### Return type

[**License**](License.md)

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

<a id="enterpriseLicenseDestroy"></a>
# **enterpriseLicenseDestroy**
> enterpriseLicenseDestroy(licenseUuid)



License Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    UUID licenseUuid = UUID.randomUUID(); // UUID | A UUID string identifying this License.
    try {
      apiInstance.enterpriseLicenseDestroy(licenseUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicenseDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseUuid** | **UUID**| A UUID string identifying this License. | |

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

<a id="enterpriseLicenseForecastRetrieve"></a>
# **enterpriseLicenseForecastRetrieve**
> LicenseForecast enterpriseLicenseForecastRetrieve()



Forecast how many users will be required in a year

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    try {
      LicenseForecast result = apiInstance.enterpriseLicenseForecastRetrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicenseForecastRetrieve");
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

[**LicenseForecast**](LicenseForecast.md)

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

<a id="enterpriseLicenseGetInstallIdRetrieve"></a>
# **enterpriseLicenseGetInstallIdRetrieve**
> InstallID enterpriseLicenseGetInstallIdRetrieve()



Get install_id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    try {
      InstallID result = apiInstance.enterpriseLicenseGetInstallIdRetrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicenseGetInstallIdRetrieve");
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

[**InstallID**](InstallID.md)

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

<a id="enterpriseLicenseList"></a>
# **enterpriseLicenseList**
> PaginatedLicenseList enterpriseLicenseList(name, ordering, page, pageSize, search)



License Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedLicenseList result = apiInstance.enterpriseLicenseList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicenseList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedLicenseList**](PaginatedLicenseList.md)

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

<a id="enterpriseLicensePartialUpdate"></a>
# **enterpriseLicensePartialUpdate**
> License enterpriseLicensePartialUpdate(licenseUuid, patchedLicenseRequest)



License Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    UUID licenseUuid = UUID.randomUUID(); // UUID | A UUID string identifying this License.
    PatchedLicenseRequest patchedLicenseRequest = new PatchedLicenseRequest(); // PatchedLicenseRequest | 
    try {
      License result = apiInstance.enterpriseLicensePartialUpdate(licenseUuid, patchedLicenseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicensePartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseUuid** | **UUID**| A UUID string identifying this License. | |
| **patchedLicenseRequest** | [**PatchedLicenseRequest**](PatchedLicenseRequest.md)|  | [optional] |

### Return type

[**License**](License.md)

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

<a id="enterpriseLicenseRetrieve"></a>
# **enterpriseLicenseRetrieve**
> License enterpriseLicenseRetrieve(licenseUuid)



License Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    UUID licenseUuid = UUID.randomUUID(); // UUID | A UUID string identifying this License.
    try {
      License result = apiInstance.enterpriseLicenseRetrieve(licenseUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicenseRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseUuid** | **UUID**| A UUID string identifying this License. | |

### Return type

[**License**](License.md)

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

<a id="enterpriseLicenseSummaryRetrieve"></a>
# **enterpriseLicenseSummaryRetrieve**
> LicenseSummary enterpriseLicenseSummaryRetrieve()



Get the total license status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    try {
      LicenseSummary result = apiInstance.enterpriseLicenseSummaryRetrieve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicenseSummaryRetrieve");
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

[**LicenseSummary**](LicenseSummary.md)

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

<a id="enterpriseLicenseUpdate"></a>
# **enterpriseLicenseUpdate**
> License enterpriseLicenseUpdate(licenseUuid, licenseRequest)



License Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    UUID licenseUuid = UUID.randomUUID(); // UUID | A UUID string identifying this License.
    LicenseRequest licenseRequest = new LicenseRequest(); // LicenseRequest | 
    try {
      License result = apiInstance.enterpriseLicenseUpdate(licenseUuid, licenseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicenseUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseUuid** | **UUID**| A UUID string identifying this License. | |
| **licenseRequest** | [**LicenseRequest**](LicenseRequest.md)|  | |

### Return type

[**License**](License.md)

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

<a id="enterpriseLicenseUsedByList"></a>
# **enterpriseLicenseUsedByList**
> List&lt;UsedBy&gt; enterpriseLicenseUsedByList(licenseUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnterpriseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EnterpriseApi apiInstance = new EnterpriseApi(defaultClient);
    UUID licenseUuid = UUID.randomUUID(); // UUID | A UUID string identifying this License.
    try {
      List<UsedBy> result = apiInstance.enterpriseLicenseUsedByList(licenseUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnterpriseApi#enterpriseLicenseUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **licenseUuid** | **UUID**| A UUID string identifying this License. | |

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

