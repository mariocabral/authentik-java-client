

# UserGroup

Simplified Group Serializer for user's groups

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**numPk** | **Integer** | Get a numerical, int32 ID for the group |  [readonly] |
|**name** | **String** |  |  |
|**isSuperuser** | **Boolean** | Users added to this group will be superusers. |  [optional] |
|**parent** | **UUID** |  |  [optional] |
|**parentName** | **String** |  |  [readonly] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |



