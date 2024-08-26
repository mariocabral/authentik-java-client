

# Application

Application Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** | Application&#39;s display Name. |  |
|**slug** | **String** | Internal application name, used in URLs. |  |
|**provider** | **Integer** |  |  [optional] |
|**providerObj** | [**Provider**](Provider.md) |  |  [readonly] |
|**backchannelProviders** | **List&lt;Integer&gt;** |  |  [optional] |
|**backchannelProvidersObj** | [**List&lt;Provider&gt;**](Provider.md) |  |  [readonly] |
|**launchUrl** | **String** | Allow formatting of launch URL |  [readonly] |
|**openInNewTab** | **Boolean** | Open launch URL in a new browser tab or window. |  [optional] |
|**metaLaunchUrl** | **URI** |  |  [optional] |
|**metaIcon** | **String** | Get the URL to the App Icon image. If the name is /static or starts with http it is returned as-is |  [readonly] |
|**metaDescription** | **String** |  |  [optional] |
|**metaPublisher** | **String** |  |  [optional] |
|**policyEngineMode** | **PolicyEngineMode** |  |  [optional] |
|**group** | **String** |  |  [optional] |



