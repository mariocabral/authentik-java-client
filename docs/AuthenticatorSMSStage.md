

# AuthenticatorSMSStage

AuthenticatorSMSStage Serializer

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
|**configureFlow** | **UUID** | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional] |
|**friendlyName** | **String** |  |  [optional] |
|**provider** | **ProviderEnum** |  |  |
|**fromNumber** | **String** |  |  |
|**accountSid** | **String** |  |  |
|**auth** | **String** |  |  |
|**authPassword** | **String** |  |  [optional] |
|**authType** | **AuthTypeEnum** |  |  [optional] |
|**verifyOnly** | **Boolean** | When enabled, the Phone number is only used during enrollment to verify the users authenticity. Only a hash of the phone number is saved to ensure it is not reused in the future. |  [optional] |
|**mapping** | **UUID** | Optionally modify the payload being sent to custom providers. |  [optional] |



