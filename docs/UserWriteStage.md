

# UserWriteStage

UserWriteStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**component** | **String** | Get object type so that we know how to edit the object |  [readonly] |
|**verboseName** | **String** | Return object&#39;s verbose_name |  [readonly] |
|**verboseNamePlural** | **String** | Return object&#39;s plural verbose_name |  [readonly] |
|**metaModelName** | **String** | Return internal model name |  [readonly] |
|**flowSet** | [**List&lt;FlowSet&gt;**](FlowSet.md) |  |  [optional] |
|**userCreationMode** | **UserCreationModeEnum** |  |  [optional] |
|**createUsersAsInactive** | **Boolean** | When set, newly created users are inactive and cannot login. |  [optional] |
|**createUsersGroup** | **UUID** | Optionally add newly created users to this group. |  [optional] |
|**userType** | **UserTypeEnum** |  |  [optional] |
|**userPathTemplate** | **String** |  |  [optional] |



