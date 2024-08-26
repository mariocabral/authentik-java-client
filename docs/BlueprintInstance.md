

# BlueprintInstance

Info about a single blueprint instance file

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**path** | **String** |  |  [optional] |
|**context** | **Object** |  |  [optional] |
|**lastApplied** | **OffsetDateTime** |  |  [readonly] |
|**lastAppliedHash** | **String** |  |  [readonly] |
|**status** | **BlueprintInstanceStatusEnum** |  |  [readonly] |
|**enabled** | **Boolean** |  |  [optional] |
|**managedModels** | **List&lt;String&gt;** |  |  [readonly] |
|**metadata** | **Object** |  |  [readonly] |
|**content** | **String** |  |  [optional] |



