

# SCIMProvider

SCIMProvider Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **Integer** |  |  [readonly] |
|**name** | **String** |  |  |
|**propertyMappings** | **List&lt;UUID&gt;** |  |  [optional] |
|**propertyMappingsGroup** | **List&lt;UUID&gt;** | Property mappings used for group creation/updating. |  [optional] |
|**component** | **String** | Get object component so that we know how to edit the object |  [readonly] |
|**assignedBackchannelApplicationSlug** | **String** | Internal application name, used in URLs. |  [readonly] |
|**assignedBackchannelApplicationName** | **String** | Application&#39;s display Name. |  [readonly] |
|**verboseName** | **String** | Return object&#39;s verbose_name |  [readonly] |
|**verboseNamePlural** | **String** | Return object&#39;s plural verbose_name |  [readonly] |
|**metaModelName** | **String** | Return internal model name |  [readonly] |
|**url** | **String** | Base URL to SCIM requests, usually ends in /v2 |  |
|**token** | **String** | Authentication token |  |
|**excludeUsersServiceAccount** | **Boolean** |  |  [optional] |
|**filterGroup** | **UUID** |  |  [optional] |



