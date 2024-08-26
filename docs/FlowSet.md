

# FlowSet

Stripped down flow serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**policybindingmodelPtrId** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**slug** | **String** | Visible in the URL. |  |
|**title** | **String** | Shown as the Title in Flow pages. |  |
|**designation** | **FlowDesignationEnum** | Decides what this Flow is used for. For example, the Authentication flow is redirect to when an un-authenticated user visits authentik. |  |
|**background** | **String** | Get the URL to the background image. If the name is /static or starts with http it is returned as-is |  [readonly] |
|**policyEngineMode** | **PolicyEngineMode** |  |  [optional] |
|**compatibilityMode** | **Boolean** | Enable compatibility mode, increases compatibility with password managers on mobile devices. |  [optional] |
|**exportUrl** | **String** | Get export URL for flow |  [readonly] |
|**layout** | **FlowLayoutEnum** |  |  [optional] |
|**deniedAction** | **DeniedActionEnum** | Configure what should happen when a flow denies access to a user. |  [optional] |



