

# EmailStage

EmailStage Serializer

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
|**useGlobalSettings** | **Boolean** | When enabled, global Email connection settings will be used and connection settings below will be ignored. |  [optional] |
|**host** | **String** |  |  [optional] |
|**port** | **Integer** |  |  [optional] |
|**username** | **String** |  |  [optional] |
|**useTls** | **Boolean** |  |  [optional] |
|**useSsl** | **Boolean** |  |  [optional] |
|**timeout** | **Integer** |  |  [optional] |
|**fromAddress** | **String** |  |  [optional] |
|**tokenExpiry** | **Integer** | Time in minutes the token sent is valid. |  [optional] |
|**subject** | **String** |  |  [optional] |
|**template** | **String** |  |  [optional] |
|**activateUserOnSuccess** | **Boolean** | Activate users upon completion of stage. |  [optional] |



