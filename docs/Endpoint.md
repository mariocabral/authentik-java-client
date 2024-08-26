

# Endpoint

Endpoint Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**provider** | **Integer** |  |  |
|**providerObj** | [**RACProvider**](RACProvider.md) |  |  [readonly] |
|**protocol** | **ProtocolEnum** |  |  |
|**host** | **String** |  |  |
|**settings** | **Object** |  |  [optional] |
|**propertyMappings** | **List&lt;UUID&gt;** |  |  [optional] |
|**authMode** | **AuthModeEnum** |  |  |
|**launchUrl** | **String** | Build actual launch URL (the provider itself does not have one, just individual endpoints) |  [readonly] |
|**maximumConnections** | **Integer** |  |  [optional] |



