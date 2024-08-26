

# PatchedAuthenticatorWebAuthnStageRequest

AuthenticatorWebAuthnStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**flowSet** | [**List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional] |
|**configureFlow** | **UUID** | Flow used by an authenticated user to configure this Stage. If empty, user will not be able to configure this stage. |  [optional] |
|**friendlyName** | **String** |  |  [optional] |
|**userVerification** | **UserVerificationEnum** |  |  [optional] |
|**authenticatorAttachment** | **AuthenticatorAttachmentEnum** |  |  [optional] |
|**residentKeyRequirement** | **ResidentKeyRequirementEnum** |  |  [optional] |
|**deviceTypeRestrictions** | **List&lt;UUID&gt;** |  |  [optional] |



