

# GroupMember

Stripped down user serializer to show relevant users for groups

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **Integer** |  |  [readonly] |
|**username** | **String** | Required. 150 characters or fewer. Letters, digits and @/./+/-/_ only. |  |
|**name** | **String** | User&#39;s display name. |  |
|**isActive** | **Boolean** | Designates whether this user should be treated as active. Unselect this instead of deleting accounts. |  [optional] |
|**lastLogin** | **OffsetDateTime** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**uid** | **String** |  |  [readonly] |



