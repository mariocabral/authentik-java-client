

# DummyPolicy

Dummy Policy Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**executionLogging** | **Boolean** | When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged. |  [optional] |
|**component** | **String** | Get object component so that we know how to edit the object |  [readonly] |
|**verboseName** | **String** | Return object&#39;s verbose_name |  [readonly] |
|**verboseNamePlural** | **String** | Return object&#39;s plural verbose_name |  [readonly] |
|**metaModelName** | **String** | Return internal model name |  [readonly] |
|**boundTo** | **Integer** | Return objects policy is bound to |  [readonly] |
|**result** | **Boolean** |  |  [optional] |
|**waitMin** | **Integer** |  |  [optional] |
|**waitMax** | **Integer** |  |  [optional] |



