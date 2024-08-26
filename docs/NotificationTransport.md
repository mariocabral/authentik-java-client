

# NotificationTransport

NotificationTransport Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**mode** | **NotificationTransportModeEnum** |  |  [optional] |
|**modeVerbose** | **String** | Return selected mode with a UI Label |  [readonly] |
|**webhookUrl** | **URI** |  |  [optional] |
|**webhookMapping** | **UUID** |  |  [optional] |
|**sendOnce** | **Boolean** | Only send notification once, for example when sending a webhook into a chat channel. |  [optional] |



