

# UserRequest

User Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** |  |  |
|**name** | **String** | User&#39;s display name. |  |
|**isActive** | **Boolean** | Designates whether this user should be treated as active. Unselect this instead of deleting accounts. |  [optional] |
|**lastLogin** | **OffsetDateTime** |  |  [optional] |
|**groups** | **List&lt;UUID&gt;** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**path** | **String** |  |  [optional] |
|**type** | **UserTypeEnum** |  |  [optional] |



