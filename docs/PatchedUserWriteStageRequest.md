

# PatchedUserWriteStageRequest

UserWriteStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**flowSet** | [**List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional] |
|**userCreationMode** | **UserCreationModeEnum** |  |  [optional] |
|**createUsersAsInactive** | **Boolean** | When set, newly created users are inactive and cannot login. |  [optional] |
|**createUsersGroup** | **UUID** | Optionally add newly created users to this group. |  [optional] |
|**userType** | **UserTypeEnum** |  |  [optional] |
|**userPathTemplate** | **String** |  |  [optional] |



