

# UserSelf

User Serializer for information a user can retrieve about themselves

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **Integer** |  |  [readonly] |
|**username** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  |
|**name** | **String** | User&#39;s display name. |  |
|**isActive** | **Boolean** | Designates whether this user should be treated as active. Unselect this instead of deleting accounts. |  [readonly] |
|**isSuperuser** | **Boolean** |  |  [readonly] |
|**groups** | [**List&lt;UserSelfGroups&gt;**](UserSelfGroups.md) |  |  [readonly] |
|**email** | **String** |  |  [optional] |
|**avatar** | **String** | User&#39;s avatar, either a http/https URL or a data URI |  [readonly] |
|**uid** | **String** |  |  [readonly] |
|**settings** | **Map&lt;String, Object&gt;** | Get user settings with brand and group settings applied |  [readonly] |
|**type** | **UserTypeEnum** |  |  [optional] |
|**systemPermissions** | **List&lt;String&gt;** | Get all system permissions assigned to the user |  [readonly] |



