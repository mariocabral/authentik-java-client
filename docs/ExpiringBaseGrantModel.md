

# ExpiringBaseGrantModel

Serializer for BaseGrantModel and ExpiringBaseGrant

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **Integer** |  |  [readonly] |
|**provider** | [**OAuth2Provider**](OAuth2Provider.md) |  |  |
|**user** | [**User**](User.md) |  |  |
|**isExpired** | **Boolean** | Check if token is expired yet. |  [readonly] |
|**expires** | **OffsetDateTime** |  |  [optional] |
|**scope** | **List&lt;String&gt;** |  |  |



