

# CaptchaStageRequest

CaptchaStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**flowSet** | [**List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional] |
|**publicKey** | **String** | Public key, acquired your captcha Provider. |  |
|**privateKey** | **String** | Private key, acquired your captcha Provider. |  |
|**jsUrl** | **String** |  |  [optional] |
|**apiUrl** | **String** |  |  [optional] |
|**scoreMinThreshold** | **Double** |  |  [optional] |
|**scoreMaxThreshold** | **Double** |  |  [optional] |
|**errorOnInvalidScore** | **Boolean** | When enabled and the received captcha score is outside of the given threshold, the stage will show an error message. When not enabled, the flow will continue, but the data from the captcha will be available in the context for policy decisions |  [optional] |



