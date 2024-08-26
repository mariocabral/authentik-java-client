

# SCIMProviderRequest

SCIMProvider Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**propertyMappings** | **List&lt;UUID&gt;** |  |  [optional] |
|**propertyMappingsGroup** | **List&lt;UUID&gt;** | Property mappings used for group creation/updating. |  [optional] |
|**url** | **String** | Base URL to SCIM requests, usually ends in /v2 |  |
|**token** | **String** | Authentication token |  |
|**excludeUsersServiceAccount** | **Boolean** |  |  [optional] |
|**filterGroup** | **UUID** |  |  [optional] |



