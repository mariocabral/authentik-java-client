

# FlowSetRequest

Stripped down flow serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**slug** | **String** | Visible in the URL. |  |
|**title** | **String** | Shown as the Title in Flow pages. |  |
|**designation** | **FlowDesignationEnum** | Decides what this Flow is used for. For example, the Authentication flow is redirect to when an un-authenticated user visits authentik. |  |
|**policyEngineMode** | **PolicyEngineMode** |  |  [optional] |
|**compatibilityMode** | **Boolean** | Enable compatibility mode, increases compatibility with password managers on mobile devices. |  [optional] |
|**layout** | **FlowLayoutEnum** |  |  [optional] |
|**deniedAction** | **DeniedActionEnum** | Configure what should happen when a flow denies access to a user. |  [optional] |



