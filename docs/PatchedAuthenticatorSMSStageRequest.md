

# PatchedAuthenticatorSMSStageRequest

AuthenticatorSMSStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**flowSet** | [**List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional] |
|**configureFlow** | **UUID** | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional] |
|**friendlyName** | **String** |  |  [optional] |
|**provider** | **ProviderEnum** |  |  [optional] |
|**fromNumber** | **String** |  |  [optional] |
|**accountSid** | **String** |  |  [optional] |
|**auth** | **String** |  |  [optional] |
|**authPassword** | **String** |  |  [optional] |
|**authType** | **AuthTypeEnum** |  |  [optional] |
|**verifyOnly** | **Boolean** | When enabled, the Phone number is only used during enrollment to verify the users authenticity. Only a hash of the phone number is saved to ensure it is not reused in the future. |  [optional] |
|**mapping** | **UUID** | Optionally modify the payload being sent to custom providers. |  [optional] |



