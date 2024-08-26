

# PromptRequest

Prompt Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**fieldKey** | **String** | Name of the form field, also used to store the value |  |
|**label** | **String** |  |  |
|**type** | **PromptTypeEnum** |  |  |
|**required** | **Boolean** |  |  [optional] |
|**placeholder** | **String** | Optionally provide a short hint that describes the expected input value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple choices. |  [optional] |
|**initialValue** | **String** | Optionally pre-fill the input with an initial value. When creating a fixed choice field, enable interpreting as expression and return a list to return multiple default choices. |  [optional] |
|**order** | **Integer** |  |  [optional] |
|**promptstageSet** | [**List&lt;StageRequest&gt;**](StageRequest.md) |  |  [optional] |
|**subText** | **String** |  |  [optional] |
|**placeholderExpression** | **Boolean** |  |  [optional] |
|**initialValueExpression** | **Boolean** |  |  [optional] |



