

# PatchedInvitationRequest

Invitation Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**expires** | **OffsetDateTime** |  |  [optional] |
|**fixedData** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**singleUse** | **Boolean** | When enabled, the invitation will be deleted after usage. |  [optional] |
|**flow** | **UUID** | When set, only the configured flow can use this invitation. |  [optional] |



