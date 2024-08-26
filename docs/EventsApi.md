# EventsApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventsEventsActionsList**](EventsApi.md#eventsEventsActionsList) | **GET** /events/events/actions/ |  |
| [**eventsEventsCreate**](EventsApi.md#eventsEventsCreate) | **POST** /events/events/ |  |
| [**eventsEventsDestroy**](EventsApi.md#eventsEventsDestroy) | **DELETE** /events/events/{event_uuid}/ |  |
| [**eventsEventsList**](EventsApi.md#eventsEventsList) | **GET** /events/events/ |  |
| [**eventsEventsPartialUpdate**](EventsApi.md#eventsEventsPartialUpdate) | **PATCH** /events/events/{event_uuid}/ |  |
| [**eventsEventsPerMonthList**](EventsApi.md#eventsEventsPerMonthList) | **GET** /events/events/per_month/ |  |
| [**eventsEventsRetrieve**](EventsApi.md#eventsEventsRetrieve) | **GET** /events/events/{event_uuid}/ |  |
| [**eventsEventsTopPerUserList**](EventsApi.md#eventsEventsTopPerUserList) | **GET** /events/events/top_per_user/ |  |
| [**eventsEventsUpdate**](EventsApi.md#eventsEventsUpdate) | **PUT** /events/events/{event_uuid}/ |  |
| [**eventsEventsVolumeList**](EventsApi.md#eventsEventsVolumeList) | **GET** /events/events/volume/ |  |
| [**eventsNotificationsDestroy**](EventsApi.md#eventsNotificationsDestroy) | **DELETE** /events/notifications/{uuid}/ |  |
| [**eventsNotificationsList**](EventsApi.md#eventsNotificationsList) | **GET** /events/notifications/ |  |
| [**eventsNotificationsMarkAllSeenCreate**](EventsApi.md#eventsNotificationsMarkAllSeenCreate) | **POST** /events/notifications/mark_all_seen/ |  |
| [**eventsNotificationsPartialUpdate**](EventsApi.md#eventsNotificationsPartialUpdate) | **PATCH** /events/notifications/{uuid}/ |  |
| [**eventsNotificationsRetrieve**](EventsApi.md#eventsNotificationsRetrieve) | **GET** /events/notifications/{uuid}/ |  |
| [**eventsNotificationsUpdate**](EventsApi.md#eventsNotificationsUpdate) | **PUT** /events/notifications/{uuid}/ |  |
| [**eventsNotificationsUsedByList**](EventsApi.md#eventsNotificationsUsedByList) | **GET** /events/notifications/{uuid}/used_by/ |  |
| [**eventsRulesCreate**](EventsApi.md#eventsRulesCreate) | **POST** /events/rules/ |  |
| [**eventsRulesDestroy**](EventsApi.md#eventsRulesDestroy) | **DELETE** /events/rules/{pbm_uuid}/ |  |
| [**eventsRulesList**](EventsApi.md#eventsRulesList) | **GET** /events/rules/ |  |
| [**eventsRulesPartialUpdate**](EventsApi.md#eventsRulesPartialUpdate) | **PATCH** /events/rules/{pbm_uuid}/ |  |
| [**eventsRulesRetrieve**](EventsApi.md#eventsRulesRetrieve) | **GET** /events/rules/{pbm_uuid}/ |  |
| [**eventsRulesUpdate**](EventsApi.md#eventsRulesUpdate) | **PUT** /events/rules/{pbm_uuid}/ |  |
| [**eventsRulesUsedByList**](EventsApi.md#eventsRulesUsedByList) | **GET** /events/rules/{pbm_uuid}/used_by/ |  |
| [**eventsSystemTasksList**](EventsApi.md#eventsSystemTasksList) | **GET** /events/system_tasks/ |  |
| [**eventsSystemTasksRetrieve**](EventsApi.md#eventsSystemTasksRetrieve) | **GET** /events/system_tasks/{uuid}/ |  |
| [**eventsSystemTasksRunCreate**](EventsApi.md#eventsSystemTasksRunCreate) | **POST** /events/system_tasks/{uuid}/run/ |  |
| [**eventsTransportsCreate**](EventsApi.md#eventsTransportsCreate) | **POST** /events/transports/ |  |
| [**eventsTransportsDestroy**](EventsApi.md#eventsTransportsDestroy) | **DELETE** /events/transports/{uuid}/ |  |
| [**eventsTransportsList**](EventsApi.md#eventsTransportsList) | **GET** /events/transports/ |  |
| [**eventsTransportsPartialUpdate**](EventsApi.md#eventsTransportsPartialUpdate) | **PATCH** /events/transports/{uuid}/ |  |
| [**eventsTransportsRetrieve**](EventsApi.md#eventsTransportsRetrieve) | **GET** /events/transports/{uuid}/ |  |
| [**eventsTransportsTestCreate**](EventsApi.md#eventsTransportsTestCreate) | **POST** /events/transports/{uuid}/test/ |  |
| [**eventsTransportsUpdate**](EventsApi.md#eventsTransportsUpdate) | **PUT** /events/transports/{uuid}/ |  |
| [**eventsTransportsUsedByList**](EventsApi.md#eventsTransportsUsedByList) | **GET** /events/transports/{uuid}/used_by/ |  |


<a id="eventsEventsActionsList"></a>
# **eventsEventsActionsList**
> List&lt;TypeCreate&gt; eventsEventsActionsList()



Get all actions

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    try {
      List<TypeCreate> result = apiInstance.eventsEventsActionsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsActionsList");
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

<a id="eventsEventsCreate"></a>
# **eventsEventsCreate**
> Event eventsEventsCreate(eventRequest)



Event Read-Only Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    EventRequest eventRequest = new EventRequest(); // EventRequest | 
    try {
      Event result = apiInstance.eventsEventsCreate(eventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **eventRequest** | [**EventRequest**](EventRequest.md)|  | |

### Return type

[**Event**](Event.md)

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

<a id="eventsEventsDestroy"></a>
# **eventsEventsDestroy**
> eventsEventsDestroy(eventUuid)



Event Read-Only Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID eventUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Event.
    try {
      apiInstance.eventsEventsDestroy(eventUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **eventUuid** | **UUID**| A UUID string identifying this Event. | |

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

<a id="eventsEventsList"></a>
# **eventsEventsList**
> PaginatedEventList eventsEventsList(action, brandName, clientIp, contextAuthorizedApp, contextModelApp, contextModelName, contextModelPk, ordering, page, pageSize, search, username)



Event Read-Only Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String action = "action_example"; // String | 
    String brandName = "brandName_example"; // String | Brand name
    String clientIp = "clientIp_example"; // String | 
    String contextAuthorizedApp = "contextAuthorizedApp_example"; // String | Context Authorized application
    String contextModelApp = "contextModelApp_example"; // String | Context Model App
    String contextModelName = "contextModelName_example"; // String | Context Model Name
    String contextModelPk = "contextModelPk_example"; // String | Context Model Primary Key
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String username = "username_example"; // String | Username
    try {
      PaginatedEventList result = apiInstance.eventsEventsList(action, brandName, clientIp, contextAuthorizedApp, contextModelApp, contextModelName, contextModelPk, ordering, page, pageSize, search, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [optional] |
| **brandName** | **String**| Brand name | [optional] |
| **clientIp** | **String**|  | [optional] |
| **contextAuthorizedApp** | **String**| Context Authorized application | [optional] |
| **contextModelApp** | **String**| Context Model App | [optional] |
| **contextModelName** | **String**| Context Model Name | [optional] |
| **contextModelPk** | **String**| Context Model Primary Key | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **username** | **String**| Username | [optional] |

### Return type

[**PaginatedEventList**](PaginatedEventList.md)

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

<a id="eventsEventsPartialUpdate"></a>
# **eventsEventsPartialUpdate**
> Event eventsEventsPartialUpdate(eventUuid, patchedEventRequest)



Event Read-Only Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID eventUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Event.
    PatchedEventRequest patchedEventRequest = new PatchedEventRequest(); // PatchedEventRequest | 
    try {
      Event result = apiInstance.eventsEventsPartialUpdate(eventUuid, patchedEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **eventUuid** | **UUID**| A UUID string identifying this Event. | |
| **patchedEventRequest** | [**PatchedEventRequest**](PatchedEventRequest.md)|  | [optional] |

### Return type

[**Event**](Event.md)

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

<a id="eventsEventsPerMonthList"></a>
# **eventsEventsPerMonthList**
> List&lt;Coordinate&gt; eventsEventsPerMonthList(action, query)



Get the count of events per month

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String action = "action_example"; // String | 
    String query = "query_example"; // String | 
    try {
      List<Coordinate> result = apiInstance.eventsEventsPerMonthList(action, query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsPerMonthList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [optional] |
| **query** | **String**|  | [optional] |

### Return type

[**List&lt;Coordinate&gt;**](Coordinate.md)

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

<a id="eventsEventsRetrieve"></a>
# **eventsEventsRetrieve**
> Event eventsEventsRetrieve(eventUuid)



Event Read-Only Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID eventUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Event.
    try {
      Event result = apiInstance.eventsEventsRetrieve(eventUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **eventUuid** | **UUID**| A UUID string identifying this Event. | |

### Return type

[**Event**](Event.md)

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

<a id="eventsEventsTopPerUserList"></a>
# **eventsEventsTopPerUserList**
> List&lt;EventTopPerUser&gt; eventsEventsTopPerUserList(action, topN)



Get the top_n events grouped by user count

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String action = "action_example"; // String | 
    Integer topN = 56; // Integer | 
    try {
      List<EventTopPerUser> result = apiInstance.eventsEventsTopPerUserList(action, topN);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsTopPerUserList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [optional] |
| **topN** | **Integer**|  | [optional] |

### Return type

[**List&lt;EventTopPerUser&gt;**](EventTopPerUser.md)

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

<a id="eventsEventsUpdate"></a>
# **eventsEventsUpdate**
> Event eventsEventsUpdate(eventUuid, eventRequest)



Event Read-Only Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID eventUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Event.
    EventRequest eventRequest = new EventRequest(); // EventRequest | 
    try {
      Event result = apiInstance.eventsEventsUpdate(eventUuid, eventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **eventUuid** | **UUID**| A UUID string identifying this Event. | |
| **eventRequest** | [**EventRequest**](EventRequest.md)|  | |

### Return type

[**Event**](Event.md)

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

<a id="eventsEventsVolumeList"></a>
# **eventsEventsVolumeList**
> List&lt;Coordinate&gt; eventsEventsVolumeList(action, brandName, clientIp, contextAuthorizedApp, contextModelApp, contextModelName, contextModelPk, ordering, search, username)



Get event volume for specified filters and timeframe

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String action = "action_example"; // String | 
    String brandName = "brandName_example"; // String | Brand name
    String clientIp = "clientIp_example"; // String | 
    String contextAuthorizedApp = "contextAuthorizedApp_example"; // String | Context Authorized application
    String contextModelApp = "contextModelApp_example"; // String | Context Model App
    String contextModelName = "contextModelName_example"; // String | Context Model Name
    String contextModelPk = "contextModelPk_example"; // String | Context Model Primary Key
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    String search = "search_example"; // String | A search term.
    String username = "username_example"; // String | Username
    try {
      List<Coordinate> result = apiInstance.eventsEventsVolumeList(action, brandName, clientIp, contextAuthorizedApp, contextModelApp, contextModelName, contextModelPk, ordering, search, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsEventsVolumeList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [optional] |
| **brandName** | **String**| Brand name | [optional] |
| **clientIp** | **String**|  | [optional] |
| **contextAuthorizedApp** | **String**| Context Authorized application | [optional] |
| **contextModelApp** | **String**| Context Model App | [optional] |
| **contextModelName** | **String**| Context Model Name | [optional] |
| **contextModelPk** | **String**| Context Model Primary Key | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **username** | **String**| Username | [optional] |

### Return type

[**List&lt;Coordinate&gt;**](Coordinate.md)

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

<a id="eventsNotificationsDestroy"></a>
# **eventsNotificationsDestroy**
> eventsNotificationsDestroy(uuid)



Notification Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification.
    try {
      apiInstance.eventsNotificationsDestroy(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsNotificationsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification. | |

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

<a id="eventsNotificationsList"></a>
# **eventsNotificationsList**
> PaginatedNotificationList eventsNotificationsList(body, created, event, ordering, page, pageSize, search, seen, severity, user)



Notification Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String body = "body_example"; // String | 
    OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | 
    UUID event = UUID.randomUUID(); // UUID | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    Boolean seen = true; // Boolean | 
    String severity = "alert"; // String | 
    Integer user = 56; // Integer | 
    try {
      PaginatedNotificationList result = apiInstance.eventsNotificationsList(body, created, event, ordering, page, pageSize, search, seen, severity, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsNotificationsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**|  | [optional] |
| **created** | **OffsetDateTime**|  | [optional] |
| **event** | **UUID**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **seen** | **Boolean**|  | [optional] |
| **severity** | **String**|  | [optional] [enum: alert, notice, warning] |
| **user** | **Integer**|  | [optional] |

### Return type

[**PaginatedNotificationList**](PaginatedNotificationList.md)

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

<a id="eventsNotificationsMarkAllSeenCreate"></a>
# **eventsNotificationsMarkAllSeenCreate**
> eventsNotificationsMarkAllSeenCreate()



Mark all the user&#39;s notifications as seen

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    try {
      apiInstance.eventsNotificationsMarkAllSeenCreate();
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsNotificationsMarkAllSeenCreate");
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
| **204** | Marked tasks as read successfully. |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="eventsNotificationsPartialUpdate"></a>
# **eventsNotificationsPartialUpdate**
> Notification eventsNotificationsPartialUpdate(uuid, patchedNotificationRequest)



Notification Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification.
    PatchedNotificationRequest patchedNotificationRequest = new PatchedNotificationRequest(); // PatchedNotificationRequest | 
    try {
      Notification result = apiInstance.eventsNotificationsPartialUpdate(uuid, patchedNotificationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsNotificationsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification. | |
| **patchedNotificationRequest** | [**PatchedNotificationRequest**](PatchedNotificationRequest.md)|  | [optional] |

### Return type

[**Notification**](Notification.md)

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

<a id="eventsNotificationsRetrieve"></a>
# **eventsNotificationsRetrieve**
> Notification eventsNotificationsRetrieve(uuid)



Notification Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification.
    try {
      Notification result = apiInstance.eventsNotificationsRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsNotificationsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification. | |

### Return type

[**Notification**](Notification.md)

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

<a id="eventsNotificationsUpdate"></a>
# **eventsNotificationsUpdate**
> Notification eventsNotificationsUpdate(uuid, notificationRequest)



Notification Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification.
    NotificationRequest notificationRequest = new NotificationRequest(); // NotificationRequest | 
    try {
      Notification result = apiInstance.eventsNotificationsUpdate(uuid, notificationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsNotificationsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification. | |
| **notificationRequest** | [**NotificationRequest**](NotificationRequest.md)|  | [optional] |

### Return type

[**Notification**](Notification.md)

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

<a id="eventsNotificationsUsedByList"></a>
# **eventsNotificationsUsedByList**
> List&lt;UsedBy&gt; eventsNotificationsUsedByList(uuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification.
    try {
      List<UsedBy> result = apiInstance.eventsNotificationsUsedByList(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsNotificationsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification. | |

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

<a id="eventsRulesCreate"></a>
# **eventsRulesCreate**
> NotificationRule eventsRulesCreate(notificationRuleRequest)



NotificationRule Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    NotificationRuleRequest notificationRuleRequest = new NotificationRuleRequest(); // NotificationRuleRequest | 
    try {
      NotificationRule result = apiInstance.eventsRulesCreate(notificationRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsRulesCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationRuleRequest** | [**NotificationRuleRequest**](NotificationRuleRequest.md)|  | |

### Return type

[**NotificationRule**](NotificationRule.md)

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

<a id="eventsRulesDestroy"></a>
# **eventsRulesDestroy**
> eventsRulesDestroy(pbmUuid)



NotificationRule Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Rule.
    try {
      apiInstance.eventsRulesDestroy(pbmUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsRulesDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this Notification Rule. | |

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

<a id="eventsRulesList"></a>
# **eventsRulesList**
> PaginatedNotificationRuleList eventsRulesList(groupName, name, ordering, page, pageSize, search, severity)



NotificationRule Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String groupName = "groupName_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String severity = "alert"; // String | Controls which severity level the created notifications will have.  
    try {
      PaginatedNotificationRuleList result = apiInstance.eventsRulesList(groupName, name, ordering, page, pageSize, search, severity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsRulesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **groupName** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **severity** | **String**| Controls which severity level the created notifications will have.   | [optional] [enum: alert, notice, warning] |

### Return type

[**PaginatedNotificationRuleList**](PaginatedNotificationRuleList.md)

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

<a id="eventsRulesPartialUpdate"></a>
# **eventsRulesPartialUpdate**
> NotificationRule eventsRulesPartialUpdate(pbmUuid, patchedNotificationRuleRequest)



NotificationRule Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Rule.
    PatchedNotificationRuleRequest patchedNotificationRuleRequest = new PatchedNotificationRuleRequest(); // PatchedNotificationRuleRequest | 
    try {
      NotificationRule result = apiInstance.eventsRulesPartialUpdate(pbmUuid, patchedNotificationRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsRulesPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this Notification Rule. | |
| **patchedNotificationRuleRequest** | [**PatchedNotificationRuleRequest**](PatchedNotificationRuleRequest.md)|  | [optional] |

### Return type

[**NotificationRule**](NotificationRule.md)

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

<a id="eventsRulesRetrieve"></a>
# **eventsRulesRetrieve**
> NotificationRule eventsRulesRetrieve(pbmUuid)



NotificationRule Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Rule.
    try {
      NotificationRule result = apiInstance.eventsRulesRetrieve(pbmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsRulesRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this Notification Rule. | |

### Return type

[**NotificationRule**](NotificationRule.md)

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

<a id="eventsRulesUpdate"></a>
# **eventsRulesUpdate**
> NotificationRule eventsRulesUpdate(pbmUuid, notificationRuleRequest)



NotificationRule Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Rule.
    NotificationRuleRequest notificationRuleRequest = new NotificationRuleRequest(); // NotificationRuleRequest | 
    try {
      NotificationRule result = apiInstance.eventsRulesUpdate(pbmUuid, notificationRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsRulesUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this Notification Rule. | |
| **notificationRuleRequest** | [**NotificationRuleRequest**](NotificationRuleRequest.md)|  | |

### Return type

[**NotificationRule**](NotificationRule.md)

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

<a id="eventsRulesUsedByList"></a>
# **eventsRulesUsedByList**
> List&lt;UsedBy&gt; eventsRulesUsedByList(pbmUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID pbmUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Rule.
    try {
      List<UsedBy> result = apiInstance.eventsRulesUsedByList(pbmUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsRulesUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pbmUuid** | **UUID**| A UUID string identifying this Notification Rule. | |

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

<a id="eventsSystemTasksList"></a>
# **eventsSystemTasksList**
> PaginatedSystemTaskList eventsSystemTasksList(name, ordering, page, pageSize, search, status, uid)



Read-only view set that returns all background tasks

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    String status = "error"; // String | 
    String uid = "uid_example"; // String | 
    try {
      PaginatedSystemTaskList result = apiInstance.eventsSystemTasksList(name, ordering, page, pageSize, search, status, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsSystemTasksList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
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
| **status** | **String**|  | [optional] [enum: error, successful, unknown, warning] |
| **uid** | **String**|  | [optional] |

### Return type

[**PaginatedSystemTaskList**](PaginatedSystemTaskList.md)

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

<a id="eventsSystemTasksRetrieve"></a>
# **eventsSystemTasksRetrieve**
> SystemTask eventsSystemTasksRetrieve(uuid)



Read-only view set that returns all background tasks

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this System Task.
    try {
      SystemTask result = apiInstance.eventsSystemTasksRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsSystemTasksRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this System Task. | |

### Return type

[**SystemTask**](SystemTask.md)

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

<a id="eventsSystemTasksRunCreate"></a>
# **eventsSystemTasksRunCreate**
> eventsSystemTasksRunCreate(uuid)



Run task

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this System Task.
    try {
      apiInstance.eventsSystemTasksRunCreate(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsSystemTasksRunCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this System Task. | |

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
| **204** | Task retried successfully |  -  |
| **404** | Task not found |  -  |
| **500** | Failed to retry task |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="eventsTransportsCreate"></a>
# **eventsTransportsCreate**
> NotificationTransport eventsTransportsCreate(notificationTransportRequest)



NotificationTransport Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    NotificationTransportRequest notificationTransportRequest = new NotificationTransportRequest(); // NotificationTransportRequest | 
    try {
      NotificationTransport result = apiInstance.eventsTransportsCreate(notificationTransportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsTransportsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationTransportRequest** | [**NotificationTransportRequest**](NotificationTransportRequest.md)|  | |

### Return type

[**NotificationTransport**](NotificationTransport.md)

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

<a id="eventsTransportsDestroy"></a>
# **eventsTransportsDestroy**
> eventsTransportsDestroy(uuid)



NotificationTransport Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Transport.
    try {
      apiInstance.eventsTransportsDestroy(uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsTransportsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification Transport. | |

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

<a id="eventsTransportsList"></a>
# **eventsTransportsList**
> PaginatedNotificationTransportList eventsTransportsList(mode, name, ordering, page, pageSize, search, sendOnce, webhookUrl)



NotificationTransport Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String mode = "email"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    Boolean sendOnce = true; // Boolean | 
    String webhookUrl = "webhookUrl_example"; // String | 
    try {
      PaginatedNotificationTransportList result = apiInstance.eventsTransportsList(mode, name, ordering, page, pageSize, search, sendOnce, webhookUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsTransportsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **mode** | **String**|  | [optional] [enum: email, local, webhook, webhook_slack] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **sendOnce** | **Boolean**|  | [optional] |
| **webhookUrl** | **String**|  | [optional] |

### Return type

[**PaginatedNotificationTransportList**](PaginatedNotificationTransportList.md)

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

<a id="eventsTransportsPartialUpdate"></a>
# **eventsTransportsPartialUpdate**
> NotificationTransport eventsTransportsPartialUpdate(uuid, patchedNotificationTransportRequest)



NotificationTransport Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Transport.
    PatchedNotificationTransportRequest patchedNotificationTransportRequest = new PatchedNotificationTransportRequest(); // PatchedNotificationTransportRequest | 
    try {
      NotificationTransport result = apiInstance.eventsTransportsPartialUpdate(uuid, patchedNotificationTransportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsTransportsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification Transport. | |
| **patchedNotificationTransportRequest** | [**PatchedNotificationTransportRequest**](PatchedNotificationTransportRequest.md)|  | [optional] |

### Return type

[**NotificationTransport**](NotificationTransport.md)

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

<a id="eventsTransportsRetrieve"></a>
# **eventsTransportsRetrieve**
> NotificationTransport eventsTransportsRetrieve(uuid)



NotificationTransport Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Transport.
    try {
      NotificationTransport result = apiInstance.eventsTransportsRetrieve(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsTransportsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification Transport. | |

### Return type

[**NotificationTransport**](NotificationTransport.md)

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

<a id="eventsTransportsTestCreate"></a>
# **eventsTransportsTestCreate**
> NotificationTransportTest eventsTransportsTestCreate(uuid)



Send example notification using selected transport. Requires Modify permissions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Transport.
    try {
      NotificationTransportTest result = apiInstance.eventsTransportsTestCreate(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsTransportsTestCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification Transport. | |

### Return type

[**NotificationTransportTest**](NotificationTransportTest.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **500** | Failed to test transport |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="eventsTransportsUpdate"></a>
# **eventsTransportsUpdate**
> NotificationTransport eventsTransportsUpdate(uuid, notificationTransportRequest)



NotificationTransport Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Transport.
    NotificationTransportRequest notificationTransportRequest = new NotificationTransportRequest(); // NotificationTransportRequest | 
    try {
      NotificationTransport result = apiInstance.eventsTransportsUpdate(uuid, notificationTransportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsTransportsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification Transport. | |
| **notificationTransportRequest** | [**NotificationTransportRequest**](NotificationTransportRequest.md)|  | |

### Return type

[**NotificationTransport**](NotificationTransport.md)

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

<a id="eventsTransportsUsedByList"></a>
# **eventsTransportsUsedByList**
> List&lt;UsedBy&gt; eventsTransportsUsedByList(uuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    EventsApi apiInstance = new EventsApi(defaultClient);
    UUID uuid = UUID.randomUUID(); // UUID | A UUID string identifying this Notification Transport.
    try {
      List<UsedBy> result = apiInstance.eventsTransportsUsedByList(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#eventsTransportsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **UUID**| A UUID string identifying this Notification Transport. | |

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

