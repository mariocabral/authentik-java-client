

# Invitation

Invitation Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**expires** | **OffsetDateTime** |  |  [optional] |
|**fixedData** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**createdBy** | [**GroupMember**](GroupMember.md) |  |  [readonly] |
|**singleUse** | **Boolean** | When enabled, the invitation will be deleted after usage. |  [optional] |
|**flow** | **UUID** | When set, only the configured flow can use this invitation. |  [optional] |
|**flowObj** | [**Flow**](Flow.md) |  |  [readonly] |



