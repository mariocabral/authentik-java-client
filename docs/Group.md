

# Group

Group Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**numPk** | **Integer** |  |  [readonly] |
|**name** | **String** |  |  |
|**isSuperuser** | **Boolean** | Users added to this group will be superusers. |  [optional] |
|**parent** | **UUID** |  |  [optional] |
|**parentName** | **String** |  |  [readonly] |
|**users** | **List&lt;Integer&gt;** |  |  [optional] |
|**usersObj** | [**List&lt;GroupMember&gt;**](GroupMember.md) |  |  [readonly] |
|**attributes** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**roles** | **List&lt;UUID&gt;** |  |  [optional] |
|**rolesObj** | [**List&lt;Role&gt;**](Role.md) |  |  [readonly] |



