

# TokenModel

Serializer for BaseGrantModel and RefreshToken

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **Integer** |  |  [readonly] |
|**provider** | [**OAuth2Provider**](OAuth2Provider.md) |  |  |
|**user** | [**User**](User.md) |  |  |
|**isExpired** | **Boolean** | Check if token is expired yet. |  [readonly] |
|**expires** | **OffsetDateTime** |  |  [optional] |
|**scope** | **List&lt;String&gt;** |  |  |
|**idToken** | **String** | Get the token&#39;s id_token as JSON String |  [readonly] |
|**revoked** | **Boolean** |  |  [optional] |



