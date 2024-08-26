

# PolicyBindingRequest

PolicyBinding Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**policy** | **UUID** |  |  [optional] |
|**group** | **UUID** |  |  [optional] |
|**user** | **Integer** |  |  [optional] |
|**target** | **UUID** |  |  |
|**negate** | **Boolean** | Negates the outcome of the policy. Messages are unaffected. |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**order** | **Integer** |  |  |
|**timeout** | **Integer** | Timeout after which Policy execution is terminated. |  [optional] |
|**failureResult** | **Boolean** | Result if the Policy execution fails. |  [optional] |



