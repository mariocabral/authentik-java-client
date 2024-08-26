

# GoogleWorkspaceProvider

GoogleWorkspaceProvider Serializer

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
|**delegatedSubject** | **String** |  |  |
|**credentials** | **Object** |  |  |
|**scopes** | **String** |  |  [optional] |
|**excludeUsersServiceAccount** | **Boolean** |  |  [optional] |
|**filterGroup** | **UUID** |  |  [optional] |
|**userDeleteAction** | **OutgoingSyncDeleteAction** |  |  [optional] |
|**groupDeleteAction** | **OutgoingSyncDeleteAction** |  |  [optional] |
|**defaultGroupEmailDomain** | **String** |  |  |



