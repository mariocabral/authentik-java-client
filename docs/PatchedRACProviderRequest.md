

# PatchedRACProviderRequest

RACProvider Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**authenticationFlow** | **UUID** | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional] |
|**authorizationFlow** | **UUID** | Flow used when authorizing this provider. |  [optional] |
|**propertyMappings** | **List&lt;UUID&gt;** |  |  [optional] |
|**settings** | **Object** |  |  [optional] |
|**connectionExpiry** | **String** | Determines how long a session lasts. Default of 0 means that the sessions lasts until the browser is closed. (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3) |  [optional] |
|**deleteTokenOnDisconnect** | **Boolean** | When set to true, connection tokens will be deleted upon disconnect. |  [optional] |



