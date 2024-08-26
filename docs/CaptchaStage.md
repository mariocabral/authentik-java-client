

# CaptchaStage

CaptchaStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**component** | **String** | Get object type so that we know how to edit the object |  [readonly] |
|**verboseName** | **String** | Return object&#39;s verbose_name |  [readonly] |
|**verboseNamePlural** | **String** | Return object&#39;s plural verbose_name |  [readonly] |
|**metaModelName** | **String** | Return internal model name |  [readonly] |
|**flowSet** | [**List&lt;FlowSet&gt;**](FlowSet.md) |  |  [optional] |
|**publicKey** | **String** | Public key, acquired your captcha Provider. |  |
|**jsUrl** | **String** |  |  [optional] |
|**apiUrl** | **String** |  |  [optional] |
|**scoreMinThreshold** | **Double** |  |  [optional] |
|**scoreMaxThreshold** | **Double** |  |  [optional] |
|**errorOnInvalidScore** | **Boolean** | When enabled and the received captcha score is outside of the given threshold, the stage will show an error message. When not enabled, the flow will continue, but the data from the captcha will be available in the context for policy decisions |  [optional] |



