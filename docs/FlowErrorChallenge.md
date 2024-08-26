

# FlowErrorChallenge

Challenge class when an unhandled error occurs during a stage. Normal users are shown an error message, superusers are shown a full stacktrace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** |  |  [optional] |
|**flowInfo** | [**ContextualFlowInfo**](ContextualFlowInfo.md) |  |  [optional] |
|**component** | **String** |  |  [optional] |
|**responseErrors** | **Map&lt;String, List&lt;ErrorDetail&gt;&gt;** |  |  [optional] |
|**requestId** | **String** |  |  |
|**error** | **String** |  |  [optional] |
|**traceback** | **String** |  |  [optional] |



