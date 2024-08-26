# Oauth2Api

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oauth2AccessTokensDestroy**](Oauth2Api.md#oauth2AccessTokensDestroy) | **DELETE** /oauth2/access_tokens/{id}/ |  |
| [**oauth2AccessTokensList**](Oauth2Api.md#oauth2AccessTokensList) | **GET** /oauth2/access_tokens/ |  |
| [**oauth2AccessTokensRetrieve**](Oauth2Api.md#oauth2AccessTokensRetrieve) | **GET** /oauth2/access_tokens/{id}/ |  |
| [**oauth2AccessTokensUsedByList**](Oauth2Api.md#oauth2AccessTokensUsedByList) | **GET** /oauth2/access_tokens/{id}/used_by/ |  |
| [**oauth2AuthorizationCodesDestroy**](Oauth2Api.md#oauth2AuthorizationCodesDestroy) | **DELETE** /oauth2/authorization_codes/{id}/ |  |
| [**oauth2AuthorizationCodesList**](Oauth2Api.md#oauth2AuthorizationCodesList) | **GET** /oauth2/authorization_codes/ |  |
| [**oauth2AuthorizationCodesRetrieve**](Oauth2Api.md#oauth2AuthorizationCodesRetrieve) | **GET** /oauth2/authorization_codes/{id}/ |  |
| [**oauth2AuthorizationCodesUsedByList**](Oauth2Api.md#oauth2AuthorizationCodesUsedByList) | **GET** /oauth2/authorization_codes/{id}/used_by/ |  |
| [**oauth2RefreshTokensDestroy**](Oauth2Api.md#oauth2RefreshTokensDestroy) | **DELETE** /oauth2/refresh_tokens/{id}/ |  |
| [**oauth2RefreshTokensList**](Oauth2Api.md#oauth2RefreshTokensList) | **GET** /oauth2/refresh_tokens/ |  |
| [**oauth2RefreshTokensRetrieve**](Oauth2Api.md#oauth2RefreshTokensRetrieve) | **GET** /oauth2/refresh_tokens/{id}/ |  |
| [**oauth2RefreshTokensUsedByList**](Oauth2Api.md#oauth2RefreshTokensUsedByList) | **GET** /oauth2/refresh_tokens/{id}/used_by/ |  |


<a id="oauth2AccessTokensDestroy"></a>
# **oauth2AccessTokensDestroy**
> oauth2AccessTokensDestroy(id)



AccessToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2 Access Token.
    try {
      apiInstance.oauth2AccessTokensDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2AccessTokensDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this OAuth2 Access Token. | |

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

<a id="oauth2AccessTokensList"></a>
# **oauth2AccessTokensList**
> PaginatedTokenModelList oauth2AccessTokensList(ordering, page, pageSize, provider, search, user)



AccessToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer provider = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    Integer user = 56; // Integer | 
    try {
      PaginatedTokenModelList result = apiInstance.oauth2AccessTokensList(ordering, page, pageSize, provider, search, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2AccessTokensList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **provider** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **user** | **Integer**|  | [optional] |

### Return type

[**PaginatedTokenModelList**](PaginatedTokenModelList.md)

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

<a id="oauth2AccessTokensRetrieve"></a>
# **oauth2AccessTokensRetrieve**
> TokenModel oauth2AccessTokensRetrieve(id)



AccessToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2 Access Token.
    try {
      TokenModel result = apiInstance.oauth2AccessTokensRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2AccessTokensRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this OAuth2 Access Token. | |

### Return type

[**TokenModel**](TokenModel.md)

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

<a id="oauth2AccessTokensUsedByList"></a>
# **oauth2AccessTokensUsedByList**
> List&lt;UsedBy&gt; oauth2AccessTokensUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2 Access Token.
    try {
      List<UsedBy> result = apiInstance.oauth2AccessTokensUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2AccessTokensUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this OAuth2 Access Token. | |

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

<a id="oauth2AuthorizationCodesDestroy"></a>
# **oauth2AuthorizationCodesDestroy**
> oauth2AuthorizationCodesDestroy(id)



AuthorizationCode Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Authorization Code.
    try {
      apiInstance.oauth2AuthorizationCodesDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2AuthorizationCodesDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Authorization Code. | |

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

<a id="oauth2AuthorizationCodesList"></a>
# **oauth2AuthorizationCodesList**
> PaginatedExpiringBaseGrantModelList oauth2AuthorizationCodesList(ordering, page, pageSize, provider, search, user)



AuthorizationCode Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer provider = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    Integer user = 56; // Integer | 
    try {
      PaginatedExpiringBaseGrantModelList result = apiInstance.oauth2AuthorizationCodesList(ordering, page, pageSize, provider, search, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2AuthorizationCodesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **provider** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **user** | **Integer**|  | [optional] |

### Return type

[**PaginatedExpiringBaseGrantModelList**](PaginatedExpiringBaseGrantModelList.md)

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

<a id="oauth2AuthorizationCodesRetrieve"></a>
# **oauth2AuthorizationCodesRetrieve**
> ExpiringBaseGrantModel oauth2AuthorizationCodesRetrieve(id)



AuthorizationCode Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Authorization Code.
    try {
      ExpiringBaseGrantModel result = apiInstance.oauth2AuthorizationCodesRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2AuthorizationCodesRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Authorization Code. | |

### Return type

[**ExpiringBaseGrantModel**](ExpiringBaseGrantModel.md)

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

<a id="oauth2AuthorizationCodesUsedByList"></a>
# **oauth2AuthorizationCodesUsedByList**
> List&lt;UsedBy&gt; oauth2AuthorizationCodesUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this Authorization Code.
    try {
      List<UsedBy> result = apiInstance.oauth2AuthorizationCodesUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2AuthorizationCodesUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this Authorization Code. | |

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

<a id="oauth2RefreshTokensDestroy"></a>
# **oauth2RefreshTokensDestroy**
> oauth2RefreshTokensDestroy(id)



RefreshToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2 Refresh Token.
    try {
      apiInstance.oauth2RefreshTokensDestroy(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2RefreshTokensDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this OAuth2 Refresh Token. | |

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

<a id="oauth2RefreshTokensList"></a>
# **oauth2RefreshTokensList**
> PaginatedTokenModelList oauth2RefreshTokensList(ordering, page, pageSize, provider, search, user)



RefreshToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer provider = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    Integer user = 56; // Integer | 
    try {
      PaginatedTokenModelList result = apiInstance.oauth2RefreshTokensList(ordering, page, pageSize, provider, search, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2RefreshTokensList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **provider** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **user** | **Integer**|  | [optional] |

### Return type

[**PaginatedTokenModelList**](PaginatedTokenModelList.md)

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

<a id="oauth2RefreshTokensRetrieve"></a>
# **oauth2RefreshTokensRetrieve**
> TokenModel oauth2RefreshTokensRetrieve(id)



RefreshToken Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2 Refresh Token.
    try {
      TokenModel result = apiInstance.oauth2RefreshTokensRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2RefreshTokensRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this OAuth2 Refresh Token. | |

### Return type

[**TokenModel**](TokenModel.md)

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

<a id="oauth2RefreshTokensUsedByList"></a>
# **oauth2RefreshTokensUsedByList**
> List&lt;UsedBy&gt; oauth2RefreshTokensUsedByList(id)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this OAuth2 Refresh Token.
    try {
      List<UsedBy> result = apiInstance.oauth2RefreshTokensUsedByList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#oauth2RefreshTokensUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**| A unique integer value identifying this OAuth2 Refresh Token. | |

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

