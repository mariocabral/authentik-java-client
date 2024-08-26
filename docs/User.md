

# User

User Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **Integer** |  |  [readonly] |
|**username** | **String** |  |  |
|**name** | **String** | User&#39;s display name. |  |
|**isActive** | **Boolean** | Designates whether this user should be treated as active. Unselect this instead of deleting accounts. |  [optional] |
|**lastLogin** | **OffsetDateTime** |  |  [optional] |
|**isSuperuser** | **Boolean** |  |  [readonly] |
|**groups** | **List&lt;UUID&gt;** |  |  [optional] |
|**groupsObj** | [**List&lt;UserGroup&gt;**](UserGroup.md) |  |  [readonly] |
|**email** | **String** |  |  [optional] |
|**avatar** | **String** | User&#39;s avatar, either a http/https URL or a data URI |  [readonly] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**uid** | **String** |  |  [readonly] |
|**path** | **String** |  |  [optional] |
|**type** | **UserTypeEnum** |  |  [optional] |
|**uuid** | **UUID** |  |  [readonly] |



