

# Token

Token Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**managed** | **String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [optional] |
|**identifier** | **String** |  |  |
|**intent** | **IntentEnum** |  |  [optional] |
|**user** | **Integer** |  |  [optional] |
|**userObj** | [**User**](User.md) |  |  [readonly] |
|**description** | **String** |  |  [optional] |
|**expires** | **OffsetDateTime** |  |  [optional] |
|**expiring** | **Boolean** |  |  [optional] |



