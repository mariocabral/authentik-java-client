

# EmailStageRequest

EmailStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**flowSet** | [**List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional] |
|**useGlobalSettings** | **Boolean** | When enabled, global Email connection settings will be used and connection settings below will be ignored. |  [optional] |
|**host** | **String** |  |  [optional] |
|**port** | **Integer** |  |  [optional] |
|**username** | **String** |  |  [optional] |
|**password** | **String** |  |  [optional] |
|**useTls** | **Boolean** |  |  [optional] |
|**useSsl** | **Boolean** |  |  [optional] |
|**timeout** | **Integer** |  |  [optional] |
|**fromAddress** | **String** |  |  [optional] |
|**tokenExpiry** | **Integer** | Time in minutes the token sent is valid. |  [optional] |
|**subject** | **String** |  |  [optional] |
|**template** | **String** |  |  [optional] |
|**activateUserOnSuccess** | **Boolean** | Activate users upon completion of stage. |  [optional] |



