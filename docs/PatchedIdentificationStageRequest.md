

# PatchedIdentificationStageRequest

IdentificationStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**flowSet** | [**List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional] |
|**userFields** | **List&lt;UserFieldsEnum&gt;** | Fields of the user object to match against. (Hold shift to select multiple options) |  [optional] |
|**passwordStage** | **UUID** | When set, shows a password field, instead of showing the password field as seaprate step. |  [optional] |
|**caseInsensitiveMatching** | **Boolean** | When enabled, user fields are matched regardless of their casing. |  [optional] |
|**showMatchedUser** | **Boolean** | When a valid username/email has been entered, and this option is enabled, the user&#39;s username and avatar will be shown. Otherwise, the text that the user entered will be shown |  [optional] |
|**enrollmentFlow** | **UUID** | Optional enrollment flow, which is linked at the bottom of the page. |  [optional] |
|**recoveryFlow** | **UUID** | Optional recovery flow, which is linked at the bottom of the page. |  [optional] |
|**passwordlessFlow** | **UUID** | Optional passwordless flow, which is linked at the bottom of the page. |  [optional] |
|**sources** | **List&lt;UUID&gt;** | Specify which sources should be shown. |  [optional] |
|**showSourceLabels** | **Boolean** |  |  [optional] |
|**pretendUserExists** | **Boolean** | When enabled, the stage will succeed and continue even when incorrect user info is entered. |  [optional] |



