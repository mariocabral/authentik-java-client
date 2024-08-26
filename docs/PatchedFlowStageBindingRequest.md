

# PatchedFlowStageBindingRequest

FlowStageBinding Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **UUID** |  |  [optional] |
|**stage** | **UUID** |  |  [optional] |
|**evaluateOnPlan** | **Boolean** | Evaluate policies during the Flow planning process. |  [optional] |
|**reEvaluatePolicies** | **Boolean** | Evaluate policies when the Stage is present to the user. |  [optional] |
|**order** | **Integer** |  |  [optional] |
|**policyEngineMode** | **PolicyEngineMode** |  |  [optional] |
|**invalidResponseAction** | **InvalidResponseActionEnum** | Configure how the flow executor should handle an invalid response to a challenge. RETRY returns the error message and a similar challenge to the executor. RESTART restarts the flow from the beginning, and RESTART_WITH_CONTEXT restarts the flow while keeping the current context. |  [optional] |



