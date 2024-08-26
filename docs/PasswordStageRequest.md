

# PasswordStageRequest

PasswordStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**flowSet** | [**List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional] |
|**backends** | **List&lt;BackendsEnum&gt;** | Selection of backends to test the password against. |  |
|**configureFlow** | **UUID** | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional] |
|**failedAttemptsBeforeCancel** | **Integer** | How many attempts a user has before the flow is canceled. To lock the user out, use a reputation policy and a user_write stage. |  [optional] |



