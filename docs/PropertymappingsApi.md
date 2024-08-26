# PropertymappingsApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**propertymappingsAllDestroy**](PropertymappingsApi.md#propertymappingsAllDestroy) | **DELETE** /propertymappings/all/{pm_uuid}/ |  |
| [**propertymappingsAllList**](PropertymappingsApi.md#propertymappingsAllList) | **GET** /propertymappings/all/ |  |
| [**propertymappingsAllRetrieve**](PropertymappingsApi.md#propertymappingsAllRetrieve) | **GET** /propertymappings/all/{pm_uuid}/ |  |
| [**propertymappingsAllTestCreate**](PropertymappingsApi.md#propertymappingsAllTestCreate) | **POST** /propertymappings/all/{pm_uuid}/test/ |  |
| [**propertymappingsAllTypesList**](PropertymappingsApi.md#propertymappingsAllTypesList) | **GET** /propertymappings/all/types/ |  |
| [**propertymappingsAllUsedByList**](PropertymappingsApi.md#propertymappingsAllUsedByList) | **GET** /propertymappings/all/{pm_uuid}/used_by/ |  |
| [**propertymappingsLdapCreate**](PropertymappingsApi.md#propertymappingsLdapCreate) | **POST** /propertymappings/ldap/ |  |
| [**propertymappingsLdapDestroy**](PropertymappingsApi.md#propertymappingsLdapDestroy) | **DELETE** /propertymappings/ldap/{pm_uuid}/ |  |
| [**propertymappingsLdapList**](PropertymappingsApi.md#propertymappingsLdapList) | **GET** /propertymappings/ldap/ |  |
| [**propertymappingsLdapPartialUpdate**](PropertymappingsApi.md#propertymappingsLdapPartialUpdate) | **PATCH** /propertymappings/ldap/{pm_uuid}/ |  |
| [**propertymappingsLdapRetrieve**](PropertymappingsApi.md#propertymappingsLdapRetrieve) | **GET** /propertymappings/ldap/{pm_uuid}/ |  |
| [**propertymappingsLdapUpdate**](PropertymappingsApi.md#propertymappingsLdapUpdate) | **PUT** /propertymappings/ldap/{pm_uuid}/ |  |
| [**propertymappingsLdapUsedByList**](PropertymappingsApi.md#propertymappingsLdapUsedByList) | **GET** /propertymappings/ldap/{pm_uuid}/used_by/ |  |
| [**propertymappingsNotificationCreate**](PropertymappingsApi.md#propertymappingsNotificationCreate) | **POST** /propertymappings/notification/ |  |
| [**propertymappingsNotificationDestroy**](PropertymappingsApi.md#propertymappingsNotificationDestroy) | **DELETE** /propertymappings/notification/{pm_uuid}/ |  |
| [**propertymappingsNotificationList**](PropertymappingsApi.md#propertymappingsNotificationList) | **GET** /propertymappings/notification/ |  |
| [**propertymappingsNotificationPartialUpdate**](PropertymappingsApi.md#propertymappingsNotificationPartialUpdate) | **PATCH** /propertymappings/notification/{pm_uuid}/ |  |
| [**propertymappingsNotificationRetrieve**](PropertymappingsApi.md#propertymappingsNotificationRetrieve) | **GET** /propertymappings/notification/{pm_uuid}/ |  |
| [**propertymappingsNotificationUpdate**](PropertymappingsApi.md#propertymappingsNotificationUpdate) | **PUT** /propertymappings/notification/{pm_uuid}/ |  |
| [**propertymappingsNotificationUsedByList**](PropertymappingsApi.md#propertymappingsNotificationUsedByList) | **GET** /propertymappings/notification/{pm_uuid}/used_by/ |  |
| [**propertymappingsProviderGoogleWorkspaceCreate**](PropertymappingsApi.md#propertymappingsProviderGoogleWorkspaceCreate) | **POST** /propertymappings/provider/google_workspace/ |  |
| [**propertymappingsProviderGoogleWorkspaceDestroy**](PropertymappingsApi.md#propertymappingsProviderGoogleWorkspaceDestroy) | **DELETE** /propertymappings/provider/google_workspace/{pm_uuid}/ |  |
| [**propertymappingsProviderGoogleWorkspaceList**](PropertymappingsApi.md#propertymappingsProviderGoogleWorkspaceList) | **GET** /propertymappings/provider/google_workspace/ |  |
| [**propertymappingsProviderGoogleWorkspacePartialUpdate**](PropertymappingsApi.md#propertymappingsProviderGoogleWorkspacePartialUpdate) | **PATCH** /propertymappings/provider/google_workspace/{pm_uuid}/ |  |
| [**propertymappingsProviderGoogleWorkspaceRetrieve**](PropertymappingsApi.md#propertymappingsProviderGoogleWorkspaceRetrieve) | **GET** /propertymappings/provider/google_workspace/{pm_uuid}/ |  |
| [**propertymappingsProviderGoogleWorkspaceUpdate**](PropertymappingsApi.md#propertymappingsProviderGoogleWorkspaceUpdate) | **PUT** /propertymappings/provider/google_workspace/{pm_uuid}/ |  |
| [**propertymappingsProviderGoogleWorkspaceUsedByList**](PropertymappingsApi.md#propertymappingsProviderGoogleWorkspaceUsedByList) | **GET** /propertymappings/provider/google_workspace/{pm_uuid}/used_by/ |  |
| [**propertymappingsProviderMicrosoftEntraCreate**](PropertymappingsApi.md#propertymappingsProviderMicrosoftEntraCreate) | **POST** /propertymappings/provider/microsoft_entra/ |  |
| [**propertymappingsProviderMicrosoftEntraDestroy**](PropertymappingsApi.md#propertymappingsProviderMicrosoftEntraDestroy) | **DELETE** /propertymappings/provider/microsoft_entra/{pm_uuid}/ |  |
| [**propertymappingsProviderMicrosoftEntraList**](PropertymappingsApi.md#propertymappingsProviderMicrosoftEntraList) | **GET** /propertymappings/provider/microsoft_entra/ |  |
| [**propertymappingsProviderMicrosoftEntraPartialUpdate**](PropertymappingsApi.md#propertymappingsProviderMicrosoftEntraPartialUpdate) | **PATCH** /propertymappings/provider/microsoft_entra/{pm_uuid}/ |  |
| [**propertymappingsProviderMicrosoftEntraRetrieve**](PropertymappingsApi.md#propertymappingsProviderMicrosoftEntraRetrieve) | **GET** /propertymappings/provider/microsoft_entra/{pm_uuid}/ |  |
| [**propertymappingsProviderMicrosoftEntraUpdate**](PropertymappingsApi.md#propertymappingsProviderMicrosoftEntraUpdate) | **PUT** /propertymappings/provider/microsoft_entra/{pm_uuid}/ |  |
| [**propertymappingsProviderMicrosoftEntraUsedByList**](PropertymappingsApi.md#propertymappingsProviderMicrosoftEntraUsedByList) | **GET** /propertymappings/provider/microsoft_entra/{pm_uuid}/used_by/ |  |
| [**propertymappingsRacCreate**](PropertymappingsApi.md#propertymappingsRacCreate) | **POST** /propertymappings/rac/ |  |
| [**propertymappingsRacDestroy**](PropertymappingsApi.md#propertymappingsRacDestroy) | **DELETE** /propertymappings/rac/{pm_uuid}/ |  |
| [**propertymappingsRacList**](PropertymappingsApi.md#propertymappingsRacList) | **GET** /propertymappings/rac/ |  |
| [**propertymappingsRacPartialUpdate**](PropertymappingsApi.md#propertymappingsRacPartialUpdate) | **PATCH** /propertymappings/rac/{pm_uuid}/ |  |
| [**propertymappingsRacRetrieve**](PropertymappingsApi.md#propertymappingsRacRetrieve) | **GET** /propertymappings/rac/{pm_uuid}/ |  |
| [**propertymappingsRacUpdate**](PropertymappingsApi.md#propertymappingsRacUpdate) | **PUT** /propertymappings/rac/{pm_uuid}/ |  |
| [**propertymappingsRacUsedByList**](PropertymappingsApi.md#propertymappingsRacUsedByList) | **GET** /propertymappings/rac/{pm_uuid}/used_by/ |  |
| [**propertymappingsSamlCreate**](PropertymappingsApi.md#propertymappingsSamlCreate) | **POST** /propertymappings/saml/ |  |
| [**propertymappingsSamlDestroy**](PropertymappingsApi.md#propertymappingsSamlDestroy) | **DELETE** /propertymappings/saml/{pm_uuid}/ |  |
| [**propertymappingsSamlList**](PropertymappingsApi.md#propertymappingsSamlList) | **GET** /propertymappings/saml/ |  |
| [**propertymappingsSamlPartialUpdate**](PropertymappingsApi.md#propertymappingsSamlPartialUpdate) | **PATCH** /propertymappings/saml/{pm_uuid}/ |  |
| [**propertymappingsSamlRetrieve**](PropertymappingsApi.md#propertymappingsSamlRetrieve) | **GET** /propertymappings/saml/{pm_uuid}/ |  |
| [**propertymappingsSamlUpdate**](PropertymappingsApi.md#propertymappingsSamlUpdate) | **PUT** /propertymappings/saml/{pm_uuid}/ |  |
| [**propertymappingsSamlUsedByList**](PropertymappingsApi.md#propertymappingsSamlUsedByList) | **GET** /propertymappings/saml/{pm_uuid}/used_by/ |  |
| [**propertymappingsScimCreate**](PropertymappingsApi.md#propertymappingsScimCreate) | **POST** /propertymappings/scim/ |  |
| [**propertymappingsScimDestroy**](PropertymappingsApi.md#propertymappingsScimDestroy) | **DELETE** /propertymappings/scim/{pm_uuid}/ |  |
| [**propertymappingsScimList**](PropertymappingsApi.md#propertymappingsScimList) | **GET** /propertymappings/scim/ |  |
| [**propertymappingsScimPartialUpdate**](PropertymappingsApi.md#propertymappingsScimPartialUpdate) | **PATCH** /propertymappings/scim/{pm_uuid}/ |  |
| [**propertymappingsScimRetrieve**](PropertymappingsApi.md#propertymappingsScimRetrieve) | **GET** /propertymappings/scim/{pm_uuid}/ |  |
| [**propertymappingsScimUpdate**](PropertymappingsApi.md#propertymappingsScimUpdate) | **PUT** /propertymappings/scim/{pm_uuid}/ |  |
| [**propertymappingsScimUsedByList**](PropertymappingsApi.md#propertymappingsScimUsedByList) | **GET** /propertymappings/scim/{pm_uuid}/used_by/ |  |
| [**propertymappingsScopeCreate**](PropertymappingsApi.md#propertymappingsScopeCreate) | **POST** /propertymappings/scope/ |  |
| [**propertymappingsScopeDestroy**](PropertymappingsApi.md#propertymappingsScopeDestroy) | **DELETE** /propertymappings/scope/{pm_uuid}/ |  |
| [**propertymappingsScopeList**](PropertymappingsApi.md#propertymappingsScopeList) | **GET** /propertymappings/scope/ |  |
| [**propertymappingsScopePartialUpdate**](PropertymappingsApi.md#propertymappingsScopePartialUpdate) | **PATCH** /propertymappings/scope/{pm_uuid}/ |  |
| [**propertymappingsScopeRetrieve**](PropertymappingsApi.md#propertymappingsScopeRetrieve) | **GET** /propertymappings/scope/{pm_uuid}/ |  |
| [**propertymappingsScopeUpdate**](PropertymappingsApi.md#propertymappingsScopeUpdate) | **PUT** /propertymappings/scope/{pm_uuid}/ |  |
| [**propertymappingsScopeUsedByList**](PropertymappingsApi.md#propertymappingsScopeUsedByList) | **GET** /propertymappings/scope/{pm_uuid}/used_by/ |  |


<a id="propertymappingsAllDestroy"></a>
# **propertymappingsAllDestroy**
> propertymappingsAllDestroy(pmUuid)



PropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Property Mapping.
    try {
      apiInstance.propertymappingsAllDestroy(pmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsAllDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Property Mapping. | |

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

<a id="propertymappingsAllList"></a>
# **propertymappingsAllList**
> PaginatedPropertyMappingList propertymappingsAllList(managedIsnull, ordering, page, pageSize, search)



PropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    Boolean managedIsnull = true; // Boolean | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedPropertyMappingList result = apiInstance.propertymappingsAllList(managedIsnull, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsAllList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **managedIsnull** | **Boolean**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedPropertyMappingList**](PaginatedPropertyMappingList.md)

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

<a id="propertymappingsAllRetrieve"></a>
# **propertymappingsAllRetrieve**
> PropertyMapping propertymappingsAllRetrieve(pmUuid)



PropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Property Mapping.
    try {
      PropertyMapping result = apiInstance.propertymappingsAllRetrieve(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsAllRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Property Mapping. | |

### Return type

[**PropertyMapping**](PropertyMapping.md)

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

<a id="propertymappingsAllTestCreate"></a>
# **propertymappingsAllTestCreate**
> PropertyMappingTestResult propertymappingsAllTestCreate(pmUuid, formatResult, propertyMappingTestRequest)



Test Property Mapping

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Property Mapping.
    Boolean formatResult = true; // Boolean | 
    PropertyMappingTestRequest propertyMappingTestRequest = new PropertyMappingTestRequest(); // PropertyMappingTestRequest | 
    try {
      PropertyMappingTestResult result = apiInstance.propertymappingsAllTestCreate(pmUuid, formatResult, propertyMappingTestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsAllTestCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Property Mapping. | |
| **formatResult** | **Boolean**|  | [optional] |
| **propertyMappingTestRequest** | [**PropertyMappingTestRequest**](PropertyMappingTestRequest.md)|  | [optional] |

### Return type

[**PropertyMappingTestResult**](PropertyMappingTestResult.md)

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

<a id="propertymappingsAllTypesList"></a>
# **propertymappingsAllTypesList**
> List&lt;TypeCreate&gt; propertymappingsAllTypesList()



Get all creatable types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    try {
      List<TypeCreate> result = apiInstance.propertymappingsAllTypesList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsAllTypesList");
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

<a id="propertymappingsAllUsedByList"></a>
# **propertymappingsAllUsedByList**
> List&lt;UsedBy&gt; propertymappingsAllUsedByList(pmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Property Mapping.
    try {
      List<UsedBy> result = apiInstance.propertymappingsAllUsedByList(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsAllUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Property Mapping. | |

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

<a id="propertymappingsLdapCreate"></a>
# **propertymappingsLdapCreate**
> LDAPPropertyMapping propertymappingsLdapCreate(ldAPPropertyMappingRequest)



LDAP PropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    LDAPPropertyMappingRequest ldAPPropertyMappingRequest = new LDAPPropertyMappingRequest(); // LDAPPropertyMappingRequest | 
    try {
      LDAPPropertyMapping result = apiInstance.propertymappingsLdapCreate(ldAPPropertyMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsLdapCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ldAPPropertyMappingRequest** | [**LDAPPropertyMappingRequest**](LDAPPropertyMappingRequest.md)|  | |

### Return type

[**LDAPPropertyMapping**](LDAPPropertyMapping.md)

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

<a id="propertymappingsLdapDestroy"></a>
# **propertymappingsLdapDestroy**
> propertymappingsLdapDestroy(pmUuid)



LDAP PropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this LDAP Property Mapping.
    try {
      apiInstance.propertymappingsLdapDestroy(pmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsLdapDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this LDAP Property Mapping. | |

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

<a id="propertymappingsLdapList"></a>
# **propertymappingsLdapList**
> PaginatedLDAPPropertyMappingList propertymappingsLdapList(expression, managed, name, objectField, ordering, page, pageSize, pmUuid, search)



LDAP PropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    String expression = "expression_example"; // String | 
    List<String> managed = Arrays.asList(); // List<String> | 
    String name = "name_example"; // String | 
    String objectField = "objectField_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID pmUuid = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedLDAPPropertyMappingList result = apiInstance.propertymappingsLdapList(expression, managed, name, objectField, ordering, page, pageSize, pmUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsLdapList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expression** | **String**|  | [optional] |
| **managed** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **objectField** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **pmUuid** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedLDAPPropertyMappingList**](PaginatedLDAPPropertyMappingList.md)

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

<a id="propertymappingsLdapPartialUpdate"></a>
# **propertymappingsLdapPartialUpdate**
> LDAPPropertyMapping propertymappingsLdapPartialUpdate(pmUuid, patchedLDAPPropertyMappingRequest)



LDAP PropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this LDAP Property Mapping.
    PatchedLDAPPropertyMappingRequest patchedLDAPPropertyMappingRequest = new PatchedLDAPPropertyMappingRequest(); // PatchedLDAPPropertyMappingRequest | 
    try {
      LDAPPropertyMapping result = apiInstance.propertymappingsLdapPartialUpdate(pmUuid, patchedLDAPPropertyMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsLdapPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this LDAP Property Mapping. | |
| **patchedLDAPPropertyMappingRequest** | [**PatchedLDAPPropertyMappingRequest**](PatchedLDAPPropertyMappingRequest.md)|  | [optional] |

### Return type

[**LDAPPropertyMapping**](LDAPPropertyMapping.md)

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

<a id="propertymappingsLdapRetrieve"></a>
# **propertymappingsLdapRetrieve**
> LDAPPropertyMapping propertymappingsLdapRetrieve(pmUuid)



LDAP PropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this LDAP Property Mapping.
    try {
      LDAPPropertyMapping result = apiInstance.propertymappingsLdapRetrieve(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsLdapRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this LDAP Property Mapping. | |

### Return type

[**LDAPPropertyMapping**](LDAPPropertyMapping.md)

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

<a id="propertymappingsLdapUpdate"></a>
# **propertymappingsLdapUpdate**
> LDAPPropertyMapping propertymappingsLdapUpdate(pmUuid, ldAPPropertyMappingRequest)



LDAP PropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this LDAP Property Mapping.
    LDAPPropertyMappingRequest ldAPPropertyMappingRequest = new LDAPPropertyMappingRequest(); // LDAPPropertyMappingRequest | 
    try {
      LDAPPropertyMapping result = apiInstance.propertymappingsLdapUpdate(pmUuid, ldAPPropertyMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsLdapUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this LDAP Property Mapping. | |
| **ldAPPropertyMappingRequest** | [**LDAPPropertyMappingRequest**](LDAPPropertyMappingRequest.md)|  | |

### Return type

[**LDAPPropertyMapping**](LDAPPropertyMapping.md)

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

<a id="propertymappingsLdapUsedByList"></a>
# **propertymappingsLdapUsedByList**
> List&lt;UsedBy&gt; propertymappingsLdapUsedByList(pmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this LDAP Property Mapping.
    try {
      List<UsedBy> result = apiInstance.propertymappingsLdapUsedByList(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsLdapUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this LDAP Property Mapping. | |

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

<a id="propertymappingsNotificationCreate"></a>
# **propertymappingsNotificationCreate**
> NotificationWebhookMapping propertymappingsNotificationCreate(notificationWebhookMappingRequest)



NotificationWebhookMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    NotificationWebhookMappingRequest notificationWebhookMappingRequest = new NotificationWebhookMappingRequest(); // NotificationWebhookMappingRequest | 
    try {
      NotificationWebhookMapping result = apiInstance.propertymappingsNotificationCreate(notificationWebhookMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsNotificationCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationWebhookMappingRequest** | [**NotificationWebhookMappingRequest**](NotificationWebhookMappingRequest.md)|  | |

### Return type

[**NotificationWebhookMapping**](NotificationWebhookMapping.md)

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

<a id="propertymappingsNotificationDestroy"></a>
# **propertymappingsNotificationDestroy**
> propertymappingsNotificationDestroy(pmUuid)



NotificationWebhookMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Webhook Mapping.
    try {
      apiInstance.propertymappingsNotificationDestroy(pmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsNotificationDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Webhook Mapping. | |

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

<a id="propertymappingsNotificationList"></a>
# **propertymappingsNotificationList**
> PaginatedNotificationWebhookMappingList propertymappingsNotificationList(name, ordering, page, pageSize, search)



NotificationWebhookMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedNotificationWebhookMappingList result = apiInstance.propertymappingsNotificationList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsNotificationList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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

[**PaginatedNotificationWebhookMappingList**](PaginatedNotificationWebhookMappingList.md)

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

<a id="propertymappingsNotificationPartialUpdate"></a>
# **propertymappingsNotificationPartialUpdate**
> NotificationWebhookMapping propertymappingsNotificationPartialUpdate(pmUuid, patchedNotificationWebhookMappingRequest)



NotificationWebhookMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Webhook Mapping.
    PatchedNotificationWebhookMappingRequest patchedNotificationWebhookMappingRequest = new PatchedNotificationWebhookMappingRequest(); // PatchedNotificationWebhookMappingRequest | 
    try {
      NotificationWebhookMapping result = apiInstance.propertymappingsNotificationPartialUpdate(pmUuid, patchedNotificationWebhookMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsNotificationPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Webhook Mapping. | |
| **patchedNotificationWebhookMappingRequest** | [**PatchedNotificationWebhookMappingRequest**](PatchedNotificationWebhookMappingRequest.md)|  | [optional] |

### Return type

[**NotificationWebhookMapping**](NotificationWebhookMapping.md)

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

<a id="propertymappingsNotificationRetrieve"></a>
# **propertymappingsNotificationRetrieve**
> NotificationWebhookMapping propertymappingsNotificationRetrieve(pmUuid)



NotificationWebhookMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Webhook Mapping.
    try {
      NotificationWebhookMapping result = apiInstance.propertymappingsNotificationRetrieve(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsNotificationRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Webhook Mapping. | |

### Return type

[**NotificationWebhookMapping**](NotificationWebhookMapping.md)

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

<a id="propertymappingsNotificationUpdate"></a>
# **propertymappingsNotificationUpdate**
> NotificationWebhookMapping propertymappingsNotificationUpdate(pmUuid, notificationWebhookMappingRequest)



NotificationWebhookMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Webhook Mapping.
    NotificationWebhookMappingRequest notificationWebhookMappingRequest = new NotificationWebhookMappingRequest(); // NotificationWebhookMappingRequest | 
    try {
      NotificationWebhookMapping result = apiInstance.propertymappingsNotificationUpdate(pmUuid, notificationWebhookMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsNotificationUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Webhook Mapping. | |
| **notificationWebhookMappingRequest** | [**NotificationWebhookMappingRequest**](NotificationWebhookMappingRequest.md)|  | |

### Return type

[**NotificationWebhookMapping**](NotificationWebhookMapping.md)

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

<a id="propertymappingsNotificationUsedByList"></a>
# **propertymappingsNotificationUsedByList**
> List&lt;UsedBy&gt; propertymappingsNotificationUsedByList(pmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Webhook Mapping.
    try {
      List<UsedBy> result = apiInstance.propertymappingsNotificationUsedByList(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsNotificationUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Webhook Mapping. | |

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

<a id="propertymappingsProviderGoogleWorkspaceCreate"></a>
# **propertymappingsProviderGoogleWorkspaceCreate**
> GoogleWorkspaceProviderMapping propertymappingsProviderGoogleWorkspaceCreate(googleWorkspaceProviderMappingRequest)



GoogleWorkspaceProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    GoogleWorkspaceProviderMappingRequest googleWorkspaceProviderMappingRequest = new GoogleWorkspaceProviderMappingRequest(); // GoogleWorkspaceProviderMappingRequest | 
    try {
      GoogleWorkspaceProviderMapping result = apiInstance.propertymappingsProviderGoogleWorkspaceCreate(googleWorkspaceProviderMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderGoogleWorkspaceCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **googleWorkspaceProviderMappingRequest** | [**GoogleWorkspaceProviderMappingRequest**](GoogleWorkspaceProviderMappingRequest.md)|  | |

### Return type

[**GoogleWorkspaceProviderMapping**](GoogleWorkspaceProviderMapping.md)

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

<a id="propertymappingsProviderGoogleWorkspaceDestroy"></a>
# **propertymappingsProviderGoogleWorkspaceDestroy**
> propertymappingsProviderGoogleWorkspaceDestroy(pmUuid)



GoogleWorkspaceProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider Mapping.
    try {
      apiInstance.propertymappingsProviderGoogleWorkspaceDestroy(pmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderGoogleWorkspaceDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Google Workspace Provider Mapping. | |

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

<a id="propertymappingsProviderGoogleWorkspaceList"></a>
# **propertymappingsProviderGoogleWorkspaceList**
> PaginatedGoogleWorkspaceProviderMappingList propertymappingsProviderGoogleWorkspaceList(expression, managed, name, ordering, page, pageSize, pmUuid, search)



GoogleWorkspaceProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    String expression = "expression_example"; // String | 
    List<String> managed = Arrays.asList(); // List<String> | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID pmUuid = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedGoogleWorkspaceProviderMappingList result = apiInstance.propertymappingsProviderGoogleWorkspaceList(expression, managed, name, ordering, page, pageSize, pmUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderGoogleWorkspaceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expression** | **String**|  | [optional] |
| **managed** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **pmUuid** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedGoogleWorkspaceProviderMappingList**](PaginatedGoogleWorkspaceProviderMappingList.md)

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

<a id="propertymappingsProviderGoogleWorkspacePartialUpdate"></a>
# **propertymappingsProviderGoogleWorkspacePartialUpdate**
> GoogleWorkspaceProviderMapping propertymappingsProviderGoogleWorkspacePartialUpdate(pmUuid, patchedGoogleWorkspaceProviderMappingRequest)



GoogleWorkspaceProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider Mapping.
    PatchedGoogleWorkspaceProviderMappingRequest patchedGoogleWorkspaceProviderMappingRequest = new PatchedGoogleWorkspaceProviderMappingRequest(); // PatchedGoogleWorkspaceProviderMappingRequest | 
    try {
      GoogleWorkspaceProviderMapping result = apiInstance.propertymappingsProviderGoogleWorkspacePartialUpdate(pmUuid, patchedGoogleWorkspaceProviderMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderGoogleWorkspacePartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Google Workspace Provider Mapping. | |
| **patchedGoogleWorkspaceProviderMappingRequest** | [**PatchedGoogleWorkspaceProviderMappingRequest**](PatchedGoogleWorkspaceProviderMappingRequest.md)|  | [optional] |

### Return type

[**GoogleWorkspaceProviderMapping**](GoogleWorkspaceProviderMapping.md)

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

<a id="propertymappingsProviderGoogleWorkspaceRetrieve"></a>
# **propertymappingsProviderGoogleWorkspaceRetrieve**
> GoogleWorkspaceProviderMapping propertymappingsProviderGoogleWorkspaceRetrieve(pmUuid)



GoogleWorkspaceProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider Mapping.
    try {
      GoogleWorkspaceProviderMapping result = apiInstance.propertymappingsProviderGoogleWorkspaceRetrieve(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderGoogleWorkspaceRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Google Workspace Provider Mapping. | |

### Return type

[**GoogleWorkspaceProviderMapping**](GoogleWorkspaceProviderMapping.md)

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

<a id="propertymappingsProviderGoogleWorkspaceUpdate"></a>
# **propertymappingsProviderGoogleWorkspaceUpdate**
> GoogleWorkspaceProviderMapping propertymappingsProviderGoogleWorkspaceUpdate(pmUuid, googleWorkspaceProviderMappingRequest)



GoogleWorkspaceProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider Mapping.
    GoogleWorkspaceProviderMappingRequest googleWorkspaceProviderMappingRequest = new GoogleWorkspaceProviderMappingRequest(); // GoogleWorkspaceProviderMappingRequest | 
    try {
      GoogleWorkspaceProviderMapping result = apiInstance.propertymappingsProviderGoogleWorkspaceUpdate(pmUuid, googleWorkspaceProviderMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderGoogleWorkspaceUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Google Workspace Provider Mapping. | |
| **googleWorkspaceProviderMappingRequest** | [**GoogleWorkspaceProviderMappingRequest**](GoogleWorkspaceProviderMappingRequest.md)|  | |

### Return type

[**GoogleWorkspaceProviderMapping**](GoogleWorkspaceProviderMapping.md)

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

<a id="propertymappingsProviderGoogleWorkspaceUsedByList"></a>
# **propertymappingsProviderGoogleWorkspaceUsedByList**
> List&lt;UsedBy&gt; propertymappingsProviderGoogleWorkspaceUsedByList(pmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Google Workspace Provider Mapping.
    try {
      List<UsedBy> result = apiInstance.propertymappingsProviderGoogleWorkspaceUsedByList(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderGoogleWorkspaceUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Google Workspace Provider Mapping. | |

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

<a id="propertymappingsProviderMicrosoftEntraCreate"></a>
# **propertymappingsProviderMicrosoftEntraCreate**
> MicrosoftEntraProviderMapping propertymappingsProviderMicrosoftEntraCreate(microsoftEntraProviderMappingRequest)



MicrosoftEntraProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    MicrosoftEntraProviderMappingRequest microsoftEntraProviderMappingRequest = new MicrosoftEntraProviderMappingRequest(); // MicrosoftEntraProviderMappingRequest | 
    try {
      MicrosoftEntraProviderMapping result = apiInstance.propertymappingsProviderMicrosoftEntraCreate(microsoftEntraProviderMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderMicrosoftEntraCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **microsoftEntraProviderMappingRequest** | [**MicrosoftEntraProviderMappingRequest**](MicrosoftEntraProviderMappingRequest.md)|  | |

### Return type

[**MicrosoftEntraProviderMapping**](MicrosoftEntraProviderMapping.md)

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

<a id="propertymappingsProviderMicrosoftEntraDestroy"></a>
# **propertymappingsProviderMicrosoftEntraDestroy**
> propertymappingsProviderMicrosoftEntraDestroy(pmUuid)



MicrosoftEntraProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider Mapping.
    try {
      apiInstance.propertymappingsProviderMicrosoftEntraDestroy(pmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderMicrosoftEntraDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Microsoft Entra Provider Mapping. | |

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

<a id="propertymappingsProviderMicrosoftEntraList"></a>
# **propertymappingsProviderMicrosoftEntraList**
> PaginatedMicrosoftEntraProviderMappingList propertymappingsProviderMicrosoftEntraList(expression, managed, name, ordering, page, pageSize, pmUuid, search)



MicrosoftEntraProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    String expression = "expression_example"; // String | 
    List<String> managed = Arrays.asList(); // List<String> | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID pmUuid = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedMicrosoftEntraProviderMappingList result = apiInstance.propertymappingsProviderMicrosoftEntraList(expression, managed, name, ordering, page, pageSize, pmUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderMicrosoftEntraList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expression** | **String**|  | [optional] |
| **managed** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **pmUuid** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedMicrosoftEntraProviderMappingList**](PaginatedMicrosoftEntraProviderMappingList.md)

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

<a id="propertymappingsProviderMicrosoftEntraPartialUpdate"></a>
# **propertymappingsProviderMicrosoftEntraPartialUpdate**
> MicrosoftEntraProviderMapping propertymappingsProviderMicrosoftEntraPartialUpdate(pmUuid, patchedMicrosoftEntraProviderMappingRequest)



MicrosoftEntraProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider Mapping.
    PatchedMicrosoftEntraProviderMappingRequest patchedMicrosoftEntraProviderMappingRequest = new PatchedMicrosoftEntraProviderMappingRequest(); // PatchedMicrosoftEntraProviderMappingRequest | 
    try {
      MicrosoftEntraProviderMapping result = apiInstance.propertymappingsProviderMicrosoftEntraPartialUpdate(pmUuid, patchedMicrosoftEntraProviderMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderMicrosoftEntraPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Microsoft Entra Provider Mapping. | |
| **patchedMicrosoftEntraProviderMappingRequest** | [**PatchedMicrosoftEntraProviderMappingRequest**](PatchedMicrosoftEntraProviderMappingRequest.md)|  | [optional] |

### Return type

[**MicrosoftEntraProviderMapping**](MicrosoftEntraProviderMapping.md)

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

<a id="propertymappingsProviderMicrosoftEntraRetrieve"></a>
# **propertymappingsProviderMicrosoftEntraRetrieve**
> MicrosoftEntraProviderMapping propertymappingsProviderMicrosoftEntraRetrieve(pmUuid)



MicrosoftEntraProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider Mapping.
    try {
      MicrosoftEntraProviderMapping result = apiInstance.propertymappingsProviderMicrosoftEntraRetrieve(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderMicrosoftEntraRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Microsoft Entra Provider Mapping. | |

### Return type

[**MicrosoftEntraProviderMapping**](MicrosoftEntraProviderMapping.md)

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

<a id="propertymappingsProviderMicrosoftEntraUpdate"></a>
# **propertymappingsProviderMicrosoftEntraUpdate**
> MicrosoftEntraProviderMapping propertymappingsProviderMicrosoftEntraUpdate(pmUuid, microsoftEntraProviderMappingRequest)



MicrosoftEntraProviderMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider Mapping.
    MicrosoftEntraProviderMappingRequest microsoftEntraProviderMappingRequest = new MicrosoftEntraProviderMappingRequest(); // MicrosoftEntraProviderMappingRequest | 
    try {
      MicrosoftEntraProviderMapping result = apiInstance.propertymappingsProviderMicrosoftEntraUpdate(pmUuid, microsoftEntraProviderMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderMicrosoftEntraUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Microsoft Entra Provider Mapping. | |
| **microsoftEntraProviderMappingRequest** | [**MicrosoftEntraProviderMappingRequest**](MicrosoftEntraProviderMappingRequest.md)|  | |

### Return type

[**MicrosoftEntraProviderMapping**](MicrosoftEntraProviderMapping.md)

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

<a id="propertymappingsProviderMicrosoftEntraUsedByList"></a>
# **propertymappingsProviderMicrosoftEntraUsedByList**
> List&lt;UsedBy&gt; propertymappingsProviderMicrosoftEntraUsedByList(pmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Microsoft Entra Provider Mapping.
    try {
      List<UsedBy> result = apiInstance.propertymappingsProviderMicrosoftEntraUsedByList(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsProviderMicrosoftEntraUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Microsoft Entra Provider Mapping. | |

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

<a id="propertymappingsRacCreate"></a>
# **propertymappingsRacCreate**
> RACPropertyMapping propertymappingsRacCreate(raCPropertyMappingRequest)



RACPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    RACPropertyMappingRequest raCPropertyMappingRequest = new RACPropertyMappingRequest(); // RACPropertyMappingRequest | 
    try {
      RACPropertyMapping result = apiInstance.propertymappingsRacCreate(raCPropertyMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsRacCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **raCPropertyMappingRequest** | [**RACPropertyMappingRequest**](RACPropertyMappingRequest.md)|  | |

### Return type

[**RACPropertyMapping**](RACPropertyMapping.md)

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

<a id="propertymappingsRacDestroy"></a>
# **propertymappingsRacDestroy**
> propertymappingsRacDestroy(pmUuid)



RACPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Property Mapping.
    try {
      apiInstance.propertymappingsRacDestroy(pmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsRacDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this RAC Property Mapping. | |

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

<a id="propertymappingsRacList"></a>
# **propertymappingsRacList**
> PaginatedRACPropertyMappingList propertymappingsRacList(managed, name, ordering, page, pageSize, search)



RACPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    List<String> managed = Arrays.asList(); // List<String> | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedRACPropertyMappingList result = apiInstance.propertymappingsRacList(managed, name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsRacList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **managed** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedRACPropertyMappingList**](PaginatedRACPropertyMappingList.md)

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

<a id="propertymappingsRacPartialUpdate"></a>
# **propertymappingsRacPartialUpdate**
> RACPropertyMapping propertymappingsRacPartialUpdate(pmUuid, patchedRACPropertyMappingRequest)



RACPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Property Mapping.
    PatchedRACPropertyMappingRequest patchedRACPropertyMappingRequest = new PatchedRACPropertyMappingRequest(); // PatchedRACPropertyMappingRequest | 
    try {
      RACPropertyMapping result = apiInstance.propertymappingsRacPartialUpdate(pmUuid, patchedRACPropertyMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsRacPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this RAC Property Mapping. | |
| **patchedRACPropertyMappingRequest** | [**PatchedRACPropertyMappingRequest**](PatchedRACPropertyMappingRequest.md)|  | [optional] |

### Return type

[**RACPropertyMapping**](RACPropertyMapping.md)

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

<a id="propertymappingsRacRetrieve"></a>
# **propertymappingsRacRetrieve**
> RACPropertyMapping propertymappingsRacRetrieve(pmUuid)



RACPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Property Mapping.
    try {
      RACPropertyMapping result = apiInstance.propertymappingsRacRetrieve(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsRacRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this RAC Property Mapping. | |

### Return type

[**RACPropertyMapping**](RACPropertyMapping.md)

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

<a id="propertymappingsRacUpdate"></a>
# **propertymappingsRacUpdate**
> RACPropertyMapping propertymappingsRacUpdate(pmUuid, raCPropertyMappingRequest)



RACPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Property Mapping.
    RACPropertyMappingRequest raCPropertyMappingRequest = new RACPropertyMappingRequest(); // RACPropertyMappingRequest | 
    try {
      RACPropertyMapping result = apiInstance.propertymappingsRacUpdate(pmUuid, raCPropertyMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsRacUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this RAC Property Mapping. | |
| **raCPropertyMappingRequest** | [**RACPropertyMappingRequest**](RACPropertyMappingRequest.md)|  | |

### Return type

[**RACPropertyMapping**](RACPropertyMapping.md)

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

<a id="propertymappingsRacUsedByList"></a>
# **propertymappingsRacUsedByList**
> List&lt;UsedBy&gt; propertymappingsRacUsedByList(pmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this RAC Property Mapping.
    try {
      List<UsedBy> result = apiInstance.propertymappingsRacUsedByList(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsRacUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this RAC Property Mapping. | |

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

<a id="propertymappingsSamlCreate"></a>
# **propertymappingsSamlCreate**
> SAMLPropertyMapping propertymappingsSamlCreate(saMLPropertyMappingRequest)



SAMLPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    SAMLPropertyMappingRequest saMLPropertyMappingRequest = new SAMLPropertyMappingRequest(); // SAMLPropertyMappingRequest | 
    try {
      SAMLPropertyMapping result = apiInstance.propertymappingsSamlCreate(saMLPropertyMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsSamlCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **saMLPropertyMappingRequest** | [**SAMLPropertyMappingRequest**](SAMLPropertyMappingRequest.md)|  | |

### Return type

[**SAMLPropertyMapping**](SAMLPropertyMapping.md)

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

<a id="propertymappingsSamlDestroy"></a>
# **propertymappingsSamlDestroy**
> propertymappingsSamlDestroy(pmUuid)



SAMLPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SAML Property Mapping.
    try {
      apiInstance.propertymappingsSamlDestroy(pmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsSamlDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SAML Property Mapping. | |

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

<a id="propertymappingsSamlList"></a>
# **propertymappingsSamlList**
> PaginatedSAMLPropertyMappingList propertymappingsSamlList(expression, friendlyName, managed, name, ordering, page, pageSize, pmUuid, samlName, search)



SAMLPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    String expression = "expression_example"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    List<String> managed = Arrays.asList(); // List<String> | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID pmUuid = UUID.randomUUID(); // UUID | 
    String samlName = "samlName_example"; // String | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedSAMLPropertyMappingList result = apiInstance.propertymappingsSamlList(expression, friendlyName, managed, name, ordering, page, pageSize, pmUuid, samlName, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsSamlList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expression** | **String**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **managed** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **pmUuid** | **UUID**|  | [optional] |
| **samlName** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedSAMLPropertyMappingList**](PaginatedSAMLPropertyMappingList.md)

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

<a id="propertymappingsSamlPartialUpdate"></a>
# **propertymappingsSamlPartialUpdate**
> SAMLPropertyMapping propertymappingsSamlPartialUpdate(pmUuid, patchedSAMLPropertyMappingRequest)



SAMLPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SAML Property Mapping.
    PatchedSAMLPropertyMappingRequest patchedSAMLPropertyMappingRequest = new PatchedSAMLPropertyMappingRequest(); // PatchedSAMLPropertyMappingRequest | 
    try {
      SAMLPropertyMapping result = apiInstance.propertymappingsSamlPartialUpdate(pmUuid, patchedSAMLPropertyMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsSamlPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SAML Property Mapping. | |
| **patchedSAMLPropertyMappingRequest** | [**PatchedSAMLPropertyMappingRequest**](PatchedSAMLPropertyMappingRequest.md)|  | [optional] |

### Return type

[**SAMLPropertyMapping**](SAMLPropertyMapping.md)

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

<a id="propertymappingsSamlRetrieve"></a>
# **propertymappingsSamlRetrieve**
> SAMLPropertyMapping propertymappingsSamlRetrieve(pmUuid)



SAMLPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SAML Property Mapping.
    try {
      SAMLPropertyMapping result = apiInstance.propertymappingsSamlRetrieve(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsSamlRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SAML Property Mapping. | |

### Return type

[**SAMLPropertyMapping**](SAMLPropertyMapping.md)

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

<a id="propertymappingsSamlUpdate"></a>
# **propertymappingsSamlUpdate**
> SAMLPropertyMapping propertymappingsSamlUpdate(pmUuid, saMLPropertyMappingRequest)



SAMLPropertyMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SAML Property Mapping.
    SAMLPropertyMappingRequest saMLPropertyMappingRequest = new SAMLPropertyMappingRequest(); // SAMLPropertyMappingRequest | 
    try {
      SAMLPropertyMapping result = apiInstance.propertymappingsSamlUpdate(pmUuid, saMLPropertyMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsSamlUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SAML Property Mapping. | |
| **saMLPropertyMappingRequest** | [**SAMLPropertyMappingRequest**](SAMLPropertyMappingRequest.md)|  | |

### Return type

[**SAMLPropertyMapping**](SAMLPropertyMapping.md)

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

<a id="propertymappingsSamlUsedByList"></a>
# **propertymappingsSamlUsedByList**
> List&lt;UsedBy&gt; propertymappingsSamlUsedByList(pmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SAML Property Mapping.
    try {
      List<UsedBy> result = apiInstance.propertymappingsSamlUsedByList(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsSamlUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SAML Property Mapping. | |

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

<a id="propertymappingsScimCreate"></a>
# **propertymappingsScimCreate**
> SCIMMapping propertymappingsScimCreate(scIMMappingRequest)



SCIMMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    SCIMMappingRequest scIMMappingRequest = new SCIMMappingRequest(); // SCIMMappingRequest | 
    try {
      SCIMMapping result = apiInstance.propertymappingsScimCreate(scIMMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScimCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scIMMappingRequest** | [**SCIMMappingRequest**](SCIMMappingRequest.md)|  | |

### Return type

[**SCIMMapping**](SCIMMapping.md)

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

<a id="propertymappingsScimDestroy"></a>
# **propertymappingsScimDestroy**
> propertymappingsScimDestroy(pmUuid)



SCIMMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SCIM Mapping.
    try {
      apiInstance.propertymappingsScimDestroy(pmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScimDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SCIM Mapping. | |

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

<a id="propertymappingsScimList"></a>
# **propertymappingsScimList**
> PaginatedSCIMMappingList propertymappingsScimList(expression, managed, name, ordering, page, pageSize, pmUuid, search)



SCIMMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    String expression = "expression_example"; // String | 
    List<String> managed = Arrays.asList(); // List<String> | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID pmUuid = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedSCIMMappingList result = apiInstance.propertymappingsScimList(expression, managed, name, ordering, page, pageSize, pmUuid, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScimList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expression** | **String**|  | [optional] |
| **managed** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **pmUuid** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedSCIMMappingList**](PaginatedSCIMMappingList.md)

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

<a id="propertymappingsScimPartialUpdate"></a>
# **propertymappingsScimPartialUpdate**
> SCIMMapping propertymappingsScimPartialUpdate(pmUuid, patchedSCIMMappingRequest)



SCIMMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SCIM Mapping.
    PatchedSCIMMappingRequest patchedSCIMMappingRequest = new PatchedSCIMMappingRequest(); // PatchedSCIMMappingRequest | 
    try {
      SCIMMapping result = apiInstance.propertymappingsScimPartialUpdate(pmUuid, patchedSCIMMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScimPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SCIM Mapping. | |
| **patchedSCIMMappingRequest** | [**PatchedSCIMMappingRequest**](PatchedSCIMMappingRequest.md)|  | [optional] |

### Return type

[**SCIMMapping**](SCIMMapping.md)

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

<a id="propertymappingsScimRetrieve"></a>
# **propertymappingsScimRetrieve**
> SCIMMapping propertymappingsScimRetrieve(pmUuid)



SCIMMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SCIM Mapping.
    try {
      SCIMMapping result = apiInstance.propertymappingsScimRetrieve(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScimRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SCIM Mapping. | |

### Return type

[**SCIMMapping**](SCIMMapping.md)

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

<a id="propertymappingsScimUpdate"></a>
# **propertymappingsScimUpdate**
> SCIMMapping propertymappingsScimUpdate(pmUuid, scIMMappingRequest)



SCIMMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SCIM Mapping.
    SCIMMappingRequest scIMMappingRequest = new SCIMMappingRequest(); // SCIMMappingRequest | 
    try {
      SCIMMapping result = apiInstance.propertymappingsScimUpdate(pmUuid, scIMMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScimUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SCIM Mapping. | |
| **scIMMappingRequest** | [**SCIMMappingRequest**](SCIMMappingRequest.md)|  | |

### Return type

[**SCIMMapping**](SCIMMapping.md)

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

<a id="propertymappingsScimUsedByList"></a>
# **propertymappingsScimUsedByList**
> List&lt;UsedBy&gt; propertymappingsScimUsedByList(pmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SCIM Mapping.
    try {
      List<UsedBy> result = apiInstance.propertymappingsScimUsedByList(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScimUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this SCIM Mapping. | |

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

<a id="propertymappingsScopeCreate"></a>
# **propertymappingsScopeCreate**
> ScopeMapping propertymappingsScopeCreate(scopeMappingRequest)



ScopeMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    ScopeMappingRequest scopeMappingRequest = new ScopeMappingRequest(); // ScopeMappingRequest | 
    try {
      ScopeMapping result = apiInstance.propertymappingsScopeCreate(scopeMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScopeCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scopeMappingRequest** | [**ScopeMappingRequest**](ScopeMappingRequest.md)|  | |

### Return type

[**ScopeMapping**](ScopeMapping.md)

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

<a id="propertymappingsScopeDestroy"></a>
# **propertymappingsScopeDestroy**
> propertymappingsScopeDestroy(pmUuid)



ScopeMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Scope Mapping.
    try {
      apiInstance.propertymappingsScopeDestroy(pmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScopeDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Scope Mapping. | |

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

<a id="propertymappingsScopeList"></a>
# **propertymappingsScopeList**
> PaginatedScopeMappingList propertymappingsScopeList(managed, name, ordering, page, pageSize, scopeName, search)



ScopeMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    List<String> managed = Arrays.asList(); // List<String> | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String scopeName = "scopeName_example"; // String | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedScopeMappingList result = apiInstance.propertymappingsScopeList(managed, name, ordering, page, pageSize, scopeName, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScopeList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **managed** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **scopeName** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedScopeMappingList**](PaginatedScopeMappingList.md)

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

<a id="propertymappingsScopePartialUpdate"></a>
# **propertymappingsScopePartialUpdate**
> ScopeMapping propertymappingsScopePartialUpdate(pmUuid, patchedScopeMappingRequest)



ScopeMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Scope Mapping.
    PatchedScopeMappingRequest patchedScopeMappingRequest = new PatchedScopeMappingRequest(); // PatchedScopeMappingRequest | 
    try {
      ScopeMapping result = apiInstance.propertymappingsScopePartialUpdate(pmUuid, patchedScopeMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScopePartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Scope Mapping. | |
| **patchedScopeMappingRequest** | [**PatchedScopeMappingRequest**](PatchedScopeMappingRequest.md)|  | [optional] |

### Return type

[**ScopeMapping**](ScopeMapping.md)

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

<a id="propertymappingsScopeRetrieve"></a>
# **propertymappingsScopeRetrieve**
> ScopeMapping propertymappingsScopeRetrieve(pmUuid)



ScopeMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Scope Mapping.
    try {
      ScopeMapping result = apiInstance.propertymappingsScopeRetrieve(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScopeRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Scope Mapping. | |

### Return type

[**ScopeMapping**](ScopeMapping.md)

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

<a id="propertymappingsScopeUpdate"></a>
# **propertymappingsScopeUpdate**
> ScopeMapping propertymappingsScopeUpdate(pmUuid, scopeMappingRequest)



ScopeMapping Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Scope Mapping.
    ScopeMappingRequest scopeMappingRequest = new ScopeMappingRequest(); // ScopeMappingRequest | 
    try {
      ScopeMapping result = apiInstance.propertymappingsScopeUpdate(pmUuid, scopeMappingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScopeUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Scope Mapping. | |
| **scopeMappingRequest** | [**ScopeMappingRequest**](ScopeMappingRequest.md)|  | |

### Return type

[**ScopeMapping**](ScopeMapping.md)

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

<a id="propertymappingsScopeUsedByList"></a>
# **propertymappingsScopeUsedByList**
> List&lt;UsedBy&gt; propertymappingsScopeUsedByList(pmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PropertymappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    PropertymappingsApi apiInstance = new PropertymappingsApi(defaultClient);
    UUID pmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Scope Mapping.
    try {
      List<UsedBy> result = apiInstance.propertymappingsScopeUsedByList(pmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PropertymappingsApi#propertymappingsScopeUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pmUuid** | **UUID**| A UUID string identifying this Scope Mapping. | |

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

