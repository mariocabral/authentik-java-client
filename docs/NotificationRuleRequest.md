

# NotificationRuleRequest

NotificationRule Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**transports** | **List&lt;UUID&gt;** | Select which transports should be used to notify the user. If none are selected, the notification will only be shown in the authentik UI. |  [optional] |
|**severity** | **SeverityEnum** | Controls which severity level the created notifications will have. |  [optional] |
|**group** | **UUID** | Define which group of users this notification should be sent and shown to. If left empty, Notification won&#39;t ben sent. |  [optional] |



