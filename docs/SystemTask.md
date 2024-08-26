

# SystemTask

Serialize TaskInfo and TaskResult

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**fullName** | **String** | Get full name with UID |  [readonly] |
|**uid** | **String** |  |  [optional] |
|**description** | **String** |  |  |
|**startTimestamp** | **OffsetDateTime** |  |  [readonly] |
|**finishTimestamp** | **OffsetDateTime** |  |  [readonly] |
|**duration** | **Double** |  |  [readonly] |
|**status** | **SystemTaskStatusEnum** |  |  |
|**messages** | [**List&lt;LogEvent&gt;**](LogEvent.md) |  |  |
|**expires** | **OffsetDateTime** |  |  [optional] |
|**expiring** | **Boolean** |  |  [optional] |



