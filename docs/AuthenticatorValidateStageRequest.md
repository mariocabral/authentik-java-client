

# AuthenticatorValidateStageRequest

AuthenticatorValidateStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**flowSet** | [**List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional] |
|**notConfiguredAction** | **NotConfiguredActionEnum** |  |  [optional] |
|**deviceClasses** | **List&lt;DeviceClassesEnum&gt;** | Device classes which can be used to authenticate |  [optional] |
|**configurationStages** | **List&lt;UUID&gt;** | Stages used to configure Authenticator when user doesn&#39;t have any compatible devices. After this configuration Stage passes, the user is not prompted again. |  [optional] |
|**lastAuthThreshold** | **String** | If any of the user&#39;s device has been used within this threshold, this stage will be skipped |  [optional] |
|**webauthnUserVerification** | **UserVerificationEnum** | Enforce user verification for WebAuthn devices. |  [optional] |
|**webauthnAllowedDeviceTypes** | **List&lt;UUID&gt;** |  |  [optional] |



