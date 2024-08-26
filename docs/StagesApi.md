# StagesApi

All URIs are relative to *http://localhost/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**stagesAllDestroy**](StagesApi.md#stagesAllDestroy) | **DELETE** /stages/all/{stage_uuid}/ |  |
| [**stagesAllList**](StagesApi.md#stagesAllList) | **GET** /stages/all/ |  |
| [**stagesAllRetrieve**](StagesApi.md#stagesAllRetrieve) | **GET** /stages/all/{stage_uuid}/ |  |
| [**stagesAllTypesList**](StagesApi.md#stagesAllTypesList) | **GET** /stages/all/types/ |  |
| [**stagesAllUsedByList**](StagesApi.md#stagesAllUsedByList) | **GET** /stages/all/{stage_uuid}/used_by/ |  |
| [**stagesAllUserSettingsList**](StagesApi.md#stagesAllUserSettingsList) | **GET** /stages/all/user_settings/ |  |
| [**stagesAuthenticatorDuoCreate**](StagesApi.md#stagesAuthenticatorDuoCreate) | **POST** /stages/authenticator/duo/ |  |
| [**stagesAuthenticatorDuoDestroy**](StagesApi.md#stagesAuthenticatorDuoDestroy) | **DELETE** /stages/authenticator/duo/{stage_uuid}/ |  |
| [**stagesAuthenticatorDuoEnrollmentStatusCreate**](StagesApi.md#stagesAuthenticatorDuoEnrollmentStatusCreate) | **POST** /stages/authenticator/duo/{stage_uuid}/enrollment_status/ |  |
| [**stagesAuthenticatorDuoImportDeviceManualCreate**](StagesApi.md#stagesAuthenticatorDuoImportDeviceManualCreate) | **POST** /stages/authenticator/duo/{stage_uuid}/import_device_manual/ |  |
| [**stagesAuthenticatorDuoImportDevicesAutomaticCreate**](StagesApi.md#stagesAuthenticatorDuoImportDevicesAutomaticCreate) | **POST** /stages/authenticator/duo/{stage_uuid}/import_devices_automatic/ |  |
| [**stagesAuthenticatorDuoList**](StagesApi.md#stagesAuthenticatorDuoList) | **GET** /stages/authenticator/duo/ |  |
| [**stagesAuthenticatorDuoPartialUpdate**](StagesApi.md#stagesAuthenticatorDuoPartialUpdate) | **PATCH** /stages/authenticator/duo/{stage_uuid}/ |  |
| [**stagesAuthenticatorDuoRetrieve**](StagesApi.md#stagesAuthenticatorDuoRetrieve) | **GET** /stages/authenticator/duo/{stage_uuid}/ |  |
| [**stagesAuthenticatorDuoUpdate**](StagesApi.md#stagesAuthenticatorDuoUpdate) | **PUT** /stages/authenticator/duo/{stage_uuid}/ |  |
| [**stagesAuthenticatorDuoUsedByList**](StagesApi.md#stagesAuthenticatorDuoUsedByList) | **GET** /stages/authenticator/duo/{stage_uuid}/used_by/ |  |
| [**stagesAuthenticatorSmsCreate**](StagesApi.md#stagesAuthenticatorSmsCreate) | **POST** /stages/authenticator/sms/ |  |
| [**stagesAuthenticatorSmsDestroy**](StagesApi.md#stagesAuthenticatorSmsDestroy) | **DELETE** /stages/authenticator/sms/{stage_uuid}/ |  |
| [**stagesAuthenticatorSmsList**](StagesApi.md#stagesAuthenticatorSmsList) | **GET** /stages/authenticator/sms/ |  |
| [**stagesAuthenticatorSmsPartialUpdate**](StagesApi.md#stagesAuthenticatorSmsPartialUpdate) | **PATCH** /stages/authenticator/sms/{stage_uuid}/ |  |
| [**stagesAuthenticatorSmsRetrieve**](StagesApi.md#stagesAuthenticatorSmsRetrieve) | **GET** /stages/authenticator/sms/{stage_uuid}/ |  |
| [**stagesAuthenticatorSmsUpdate**](StagesApi.md#stagesAuthenticatorSmsUpdate) | **PUT** /stages/authenticator/sms/{stage_uuid}/ |  |
| [**stagesAuthenticatorSmsUsedByList**](StagesApi.md#stagesAuthenticatorSmsUsedByList) | **GET** /stages/authenticator/sms/{stage_uuid}/used_by/ |  |
| [**stagesAuthenticatorStaticCreate**](StagesApi.md#stagesAuthenticatorStaticCreate) | **POST** /stages/authenticator/static/ |  |
| [**stagesAuthenticatorStaticDestroy**](StagesApi.md#stagesAuthenticatorStaticDestroy) | **DELETE** /stages/authenticator/static/{stage_uuid}/ |  |
| [**stagesAuthenticatorStaticList**](StagesApi.md#stagesAuthenticatorStaticList) | **GET** /stages/authenticator/static/ |  |
| [**stagesAuthenticatorStaticPartialUpdate**](StagesApi.md#stagesAuthenticatorStaticPartialUpdate) | **PATCH** /stages/authenticator/static/{stage_uuid}/ |  |
| [**stagesAuthenticatorStaticRetrieve**](StagesApi.md#stagesAuthenticatorStaticRetrieve) | **GET** /stages/authenticator/static/{stage_uuid}/ |  |
| [**stagesAuthenticatorStaticUpdate**](StagesApi.md#stagesAuthenticatorStaticUpdate) | **PUT** /stages/authenticator/static/{stage_uuid}/ |  |
| [**stagesAuthenticatorStaticUsedByList**](StagesApi.md#stagesAuthenticatorStaticUsedByList) | **GET** /stages/authenticator/static/{stage_uuid}/used_by/ |  |
| [**stagesAuthenticatorTotpCreate**](StagesApi.md#stagesAuthenticatorTotpCreate) | **POST** /stages/authenticator/totp/ |  |
| [**stagesAuthenticatorTotpDestroy**](StagesApi.md#stagesAuthenticatorTotpDestroy) | **DELETE** /stages/authenticator/totp/{stage_uuid}/ |  |
| [**stagesAuthenticatorTotpList**](StagesApi.md#stagesAuthenticatorTotpList) | **GET** /stages/authenticator/totp/ |  |
| [**stagesAuthenticatorTotpPartialUpdate**](StagesApi.md#stagesAuthenticatorTotpPartialUpdate) | **PATCH** /stages/authenticator/totp/{stage_uuid}/ |  |
| [**stagesAuthenticatorTotpRetrieve**](StagesApi.md#stagesAuthenticatorTotpRetrieve) | **GET** /stages/authenticator/totp/{stage_uuid}/ |  |
| [**stagesAuthenticatorTotpUpdate**](StagesApi.md#stagesAuthenticatorTotpUpdate) | **PUT** /stages/authenticator/totp/{stage_uuid}/ |  |
| [**stagesAuthenticatorTotpUsedByList**](StagesApi.md#stagesAuthenticatorTotpUsedByList) | **GET** /stages/authenticator/totp/{stage_uuid}/used_by/ |  |
| [**stagesAuthenticatorValidateCreate**](StagesApi.md#stagesAuthenticatorValidateCreate) | **POST** /stages/authenticator/validate/ |  |
| [**stagesAuthenticatorValidateDestroy**](StagesApi.md#stagesAuthenticatorValidateDestroy) | **DELETE** /stages/authenticator/validate/{stage_uuid}/ |  |
| [**stagesAuthenticatorValidateList**](StagesApi.md#stagesAuthenticatorValidateList) | **GET** /stages/authenticator/validate/ |  |
| [**stagesAuthenticatorValidatePartialUpdate**](StagesApi.md#stagesAuthenticatorValidatePartialUpdate) | **PATCH** /stages/authenticator/validate/{stage_uuid}/ |  |
| [**stagesAuthenticatorValidateRetrieve**](StagesApi.md#stagesAuthenticatorValidateRetrieve) | **GET** /stages/authenticator/validate/{stage_uuid}/ |  |
| [**stagesAuthenticatorValidateUpdate**](StagesApi.md#stagesAuthenticatorValidateUpdate) | **PUT** /stages/authenticator/validate/{stage_uuid}/ |  |
| [**stagesAuthenticatorValidateUsedByList**](StagesApi.md#stagesAuthenticatorValidateUsedByList) | **GET** /stages/authenticator/validate/{stage_uuid}/used_by/ |  |
| [**stagesAuthenticatorWebauthnCreate**](StagesApi.md#stagesAuthenticatorWebauthnCreate) | **POST** /stages/authenticator/webauthn/ |  |
| [**stagesAuthenticatorWebauthnDestroy**](StagesApi.md#stagesAuthenticatorWebauthnDestroy) | **DELETE** /stages/authenticator/webauthn/{stage_uuid}/ |  |
| [**stagesAuthenticatorWebauthnDeviceTypesList**](StagesApi.md#stagesAuthenticatorWebauthnDeviceTypesList) | **GET** /stages/authenticator/webauthn_device_types/ |  |
| [**stagesAuthenticatorWebauthnDeviceTypesRetrieve**](StagesApi.md#stagesAuthenticatorWebauthnDeviceTypesRetrieve) | **GET** /stages/authenticator/webauthn_device_types/{aaguid}/ |  |
| [**stagesAuthenticatorWebauthnList**](StagesApi.md#stagesAuthenticatorWebauthnList) | **GET** /stages/authenticator/webauthn/ |  |
| [**stagesAuthenticatorWebauthnPartialUpdate**](StagesApi.md#stagesAuthenticatorWebauthnPartialUpdate) | **PATCH** /stages/authenticator/webauthn/{stage_uuid}/ |  |
| [**stagesAuthenticatorWebauthnRetrieve**](StagesApi.md#stagesAuthenticatorWebauthnRetrieve) | **GET** /stages/authenticator/webauthn/{stage_uuid}/ |  |
| [**stagesAuthenticatorWebauthnUpdate**](StagesApi.md#stagesAuthenticatorWebauthnUpdate) | **PUT** /stages/authenticator/webauthn/{stage_uuid}/ |  |
| [**stagesAuthenticatorWebauthnUsedByList**](StagesApi.md#stagesAuthenticatorWebauthnUsedByList) | **GET** /stages/authenticator/webauthn/{stage_uuid}/used_by/ |  |
| [**stagesCaptchaCreate**](StagesApi.md#stagesCaptchaCreate) | **POST** /stages/captcha/ |  |
| [**stagesCaptchaDestroy**](StagesApi.md#stagesCaptchaDestroy) | **DELETE** /stages/captcha/{stage_uuid}/ |  |
| [**stagesCaptchaList**](StagesApi.md#stagesCaptchaList) | **GET** /stages/captcha/ |  |
| [**stagesCaptchaPartialUpdate**](StagesApi.md#stagesCaptchaPartialUpdate) | **PATCH** /stages/captcha/{stage_uuid}/ |  |
| [**stagesCaptchaRetrieve**](StagesApi.md#stagesCaptchaRetrieve) | **GET** /stages/captcha/{stage_uuid}/ |  |
| [**stagesCaptchaUpdate**](StagesApi.md#stagesCaptchaUpdate) | **PUT** /stages/captcha/{stage_uuid}/ |  |
| [**stagesCaptchaUsedByList**](StagesApi.md#stagesCaptchaUsedByList) | **GET** /stages/captcha/{stage_uuid}/used_by/ |  |
| [**stagesConsentCreate**](StagesApi.md#stagesConsentCreate) | **POST** /stages/consent/ |  |
| [**stagesConsentDestroy**](StagesApi.md#stagesConsentDestroy) | **DELETE** /stages/consent/{stage_uuid}/ |  |
| [**stagesConsentList**](StagesApi.md#stagesConsentList) | **GET** /stages/consent/ |  |
| [**stagesConsentPartialUpdate**](StagesApi.md#stagesConsentPartialUpdate) | **PATCH** /stages/consent/{stage_uuid}/ |  |
| [**stagesConsentRetrieve**](StagesApi.md#stagesConsentRetrieve) | **GET** /stages/consent/{stage_uuid}/ |  |
| [**stagesConsentUpdate**](StagesApi.md#stagesConsentUpdate) | **PUT** /stages/consent/{stage_uuid}/ |  |
| [**stagesConsentUsedByList**](StagesApi.md#stagesConsentUsedByList) | **GET** /stages/consent/{stage_uuid}/used_by/ |  |
| [**stagesDenyCreate**](StagesApi.md#stagesDenyCreate) | **POST** /stages/deny/ |  |
| [**stagesDenyDestroy**](StagesApi.md#stagesDenyDestroy) | **DELETE** /stages/deny/{stage_uuid}/ |  |
| [**stagesDenyList**](StagesApi.md#stagesDenyList) | **GET** /stages/deny/ |  |
| [**stagesDenyPartialUpdate**](StagesApi.md#stagesDenyPartialUpdate) | **PATCH** /stages/deny/{stage_uuid}/ |  |
| [**stagesDenyRetrieve**](StagesApi.md#stagesDenyRetrieve) | **GET** /stages/deny/{stage_uuid}/ |  |
| [**stagesDenyUpdate**](StagesApi.md#stagesDenyUpdate) | **PUT** /stages/deny/{stage_uuid}/ |  |
| [**stagesDenyUsedByList**](StagesApi.md#stagesDenyUsedByList) | **GET** /stages/deny/{stage_uuid}/used_by/ |  |
| [**stagesDummyCreate**](StagesApi.md#stagesDummyCreate) | **POST** /stages/dummy/ |  |
| [**stagesDummyDestroy**](StagesApi.md#stagesDummyDestroy) | **DELETE** /stages/dummy/{stage_uuid}/ |  |
| [**stagesDummyList**](StagesApi.md#stagesDummyList) | **GET** /stages/dummy/ |  |
| [**stagesDummyPartialUpdate**](StagesApi.md#stagesDummyPartialUpdate) | **PATCH** /stages/dummy/{stage_uuid}/ |  |
| [**stagesDummyRetrieve**](StagesApi.md#stagesDummyRetrieve) | **GET** /stages/dummy/{stage_uuid}/ |  |
| [**stagesDummyUpdate**](StagesApi.md#stagesDummyUpdate) | **PUT** /stages/dummy/{stage_uuid}/ |  |
| [**stagesDummyUsedByList**](StagesApi.md#stagesDummyUsedByList) | **GET** /stages/dummy/{stage_uuid}/used_by/ |  |
| [**stagesEmailCreate**](StagesApi.md#stagesEmailCreate) | **POST** /stages/email/ |  |
| [**stagesEmailDestroy**](StagesApi.md#stagesEmailDestroy) | **DELETE** /stages/email/{stage_uuid}/ |  |
| [**stagesEmailList**](StagesApi.md#stagesEmailList) | **GET** /stages/email/ |  |
| [**stagesEmailPartialUpdate**](StagesApi.md#stagesEmailPartialUpdate) | **PATCH** /stages/email/{stage_uuid}/ |  |
| [**stagesEmailRetrieve**](StagesApi.md#stagesEmailRetrieve) | **GET** /stages/email/{stage_uuid}/ |  |
| [**stagesEmailTemplatesList**](StagesApi.md#stagesEmailTemplatesList) | **GET** /stages/email/templates/ |  |
| [**stagesEmailUpdate**](StagesApi.md#stagesEmailUpdate) | **PUT** /stages/email/{stage_uuid}/ |  |
| [**stagesEmailUsedByList**](StagesApi.md#stagesEmailUsedByList) | **GET** /stages/email/{stage_uuid}/used_by/ |  |
| [**stagesIdentificationCreate**](StagesApi.md#stagesIdentificationCreate) | **POST** /stages/identification/ |  |
| [**stagesIdentificationDestroy**](StagesApi.md#stagesIdentificationDestroy) | **DELETE** /stages/identification/{stage_uuid}/ |  |
| [**stagesIdentificationList**](StagesApi.md#stagesIdentificationList) | **GET** /stages/identification/ |  |
| [**stagesIdentificationPartialUpdate**](StagesApi.md#stagesIdentificationPartialUpdate) | **PATCH** /stages/identification/{stage_uuid}/ |  |
| [**stagesIdentificationRetrieve**](StagesApi.md#stagesIdentificationRetrieve) | **GET** /stages/identification/{stage_uuid}/ |  |
| [**stagesIdentificationUpdate**](StagesApi.md#stagesIdentificationUpdate) | **PUT** /stages/identification/{stage_uuid}/ |  |
| [**stagesIdentificationUsedByList**](StagesApi.md#stagesIdentificationUsedByList) | **GET** /stages/identification/{stage_uuid}/used_by/ |  |
| [**stagesInvitationInvitationsCreate**](StagesApi.md#stagesInvitationInvitationsCreate) | **POST** /stages/invitation/invitations/ |  |
| [**stagesInvitationInvitationsDestroy**](StagesApi.md#stagesInvitationInvitationsDestroy) | **DELETE** /stages/invitation/invitations/{invite_uuid}/ |  |
| [**stagesInvitationInvitationsList**](StagesApi.md#stagesInvitationInvitationsList) | **GET** /stages/invitation/invitations/ |  |
| [**stagesInvitationInvitationsPartialUpdate**](StagesApi.md#stagesInvitationInvitationsPartialUpdate) | **PATCH** /stages/invitation/invitations/{invite_uuid}/ |  |
| [**stagesInvitationInvitationsRetrieve**](StagesApi.md#stagesInvitationInvitationsRetrieve) | **GET** /stages/invitation/invitations/{invite_uuid}/ |  |
| [**stagesInvitationInvitationsUpdate**](StagesApi.md#stagesInvitationInvitationsUpdate) | **PUT** /stages/invitation/invitations/{invite_uuid}/ |  |
| [**stagesInvitationInvitationsUsedByList**](StagesApi.md#stagesInvitationInvitationsUsedByList) | **GET** /stages/invitation/invitations/{invite_uuid}/used_by/ |  |
| [**stagesInvitationStagesCreate**](StagesApi.md#stagesInvitationStagesCreate) | **POST** /stages/invitation/stages/ |  |
| [**stagesInvitationStagesDestroy**](StagesApi.md#stagesInvitationStagesDestroy) | **DELETE** /stages/invitation/stages/{stage_uuid}/ |  |
| [**stagesInvitationStagesList**](StagesApi.md#stagesInvitationStagesList) | **GET** /stages/invitation/stages/ |  |
| [**stagesInvitationStagesPartialUpdate**](StagesApi.md#stagesInvitationStagesPartialUpdate) | **PATCH** /stages/invitation/stages/{stage_uuid}/ |  |
| [**stagesInvitationStagesRetrieve**](StagesApi.md#stagesInvitationStagesRetrieve) | **GET** /stages/invitation/stages/{stage_uuid}/ |  |
| [**stagesInvitationStagesUpdate**](StagesApi.md#stagesInvitationStagesUpdate) | **PUT** /stages/invitation/stages/{stage_uuid}/ |  |
| [**stagesInvitationStagesUsedByList**](StagesApi.md#stagesInvitationStagesUsedByList) | **GET** /stages/invitation/stages/{stage_uuid}/used_by/ |  |
| [**stagesPasswordCreate**](StagesApi.md#stagesPasswordCreate) | **POST** /stages/password/ |  |
| [**stagesPasswordDestroy**](StagesApi.md#stagesPasswordDestroy) | **DELETE** /stages/password/{stage_uuid}/ |  |
| [**stagesPasswordList**](StagesApi.md#stagesPasswordList) | **GET** /stages/password/ |  |
| [**stagesPasswordPartialUpdate**](StagesApi.md#stagesPasswordPartialUpdate) | **PATCH** /stages/password/{stage_uuid}/ |  |
| [**stagesPasswordRetrieve**](StagesApi.md#stagesPasswordRetrieve) | **GET** /stages/password/{stage_uuid}/ |  |
| [**stagesPasswordUpdate**](StagesApi.md#stagesPasswordUpdate) | **PUT** /stages/password/{stage_uuid}/ |  |
| [**stagesPasswordUsedByList**](StagesApi.md#stagesPasswordUsedByList) | **GET** /stages/password/{stage_uuid}/used_by/ |  |
| [**stagesPromptPromptsCreate**](StagesApi.md#stagesPromptPromptsCreate) | **POST** /stages/prompt/prompts/ |  |
| [**stagesPromptPromptsDestroy**](StagesApi.md#stagesPromptPromptsDestroy) | **DELETE** /stages/prompt/prompts/{prompt_uuid}/ |  |
| [**stagesPromptPromptsList**](StagesApi.md#stagesPromptPromptsList) | **GET** /stages/prompt/prompts/ |  |
| [**stagesPromptPromptsPartialUpdate**](StagesApi.md#stagesPromptPromptsPartialUpdate) | **PATCH** /stages/prompt/prompts/{prompt_uuid}/ |  |
| [**stagesPromptPromptsPreviewCreate**](StagesApi.md#stagesPromptPromptsPreviewCreate) | **POST** /stages/prompt/prompts/preview/ |  |
| [**stagesPromptPromptsRetrieve**](StagesApi.md#stagesPromptPromptsRetrieve) | **GET** /stages/prompt/prompts/{prompt_uuid}/ |  |
| [**stagesPromptPromptsUpdate**](StagesApi.md#stagesPromptPromptsUpdate) | **PUT** /stages/prompt/prompts/{prompt_uuid}/ |  |
| [**stagesPromptPromptsUsedByList**](StagesApi.md#stagesPromptPromptsUsedByList) | **GET** /stages/prompt/prompts/{prompt_uuid}/used_by/ |  |
| [**stagesPromptStagesCreate**](StagesApi.md#stagesPromptStagesCreate) | **POST** /stages/prompt/stages/ |  |
| [**stagesPromptStagesDestroy**](StagesApi.md#stagesPromptStagesDestroy) | **DELETE** /stages/prompt/stages/{stage_uuid}/ |  |
| [**stagesPromptStagesList**](StagesApi.md#stagesPromptStagesList) | **GET** /stages/prompt/stages/ |  |
| [**stagesPromptStagesPartialUpdate**](StagesApi.md#stagesPromptStagesPartialUpdate) | **PATCH** /stages/prompt/stages/{stage_uuid}/ |  |
| [**stagesPromptStagesRetrieve**](StagesApi.md#stagesPromptStagesRetrieve) | **GET** /stages/prompt/stages/{stage_uuid}/ |  |
| [**stagesPromptStagesUpdate**](StagesApi.md#stagesPromptStagesUpdate) | **PUT** /stages/prompt/stages/{stage_uuid}/ |  |
| [**stagesPromptStagesUsedByList**](StagesApi.md#stagesPromptStagesUsedByList) | **GET** /stages/prompt/stages/{stage_uuid}/used_by/ |  |
| [**stagesSourceCreate**](StagesApi.md#stagesSourceCreate) | **POST** /stages/source/ |  |
| [**stagesSourceDestroy**](StagesApi.md#stagesSourceDestroy) | **DELETE** /stages/source/{stage_uuid}/ |  |
| [**stagesSourceList**](StagesApi.md#stagesSourceList) | **GET** /stages/source/ |  |
| [**stagesSourcePartialUpdate**](StagesApi.md#stagesSourcePartialUpdate) | **PATCH** /stages/source/{stage_uuid}/ |  |
| [**stagesSourceRetrieve**](StagesApi.md#stagesSourceRetrieve) | **GET** /stages/source/{stage_uuid}/ |  |
| [**stagesSourceUpdate**](StagesApi.md#stagesSourceUpdate) | **PUT** /stages/source/{stage_uuid}/ |  |
| [**stagesSourceUsedByList**](StagesApi.md#stagesSourceUsedByList) | **GET** /stages/source/{stage_uuid}/used_by/ |  |
| [**stagesUserDeleteCreate**](StagesApi.md#stagesUserDeleteCreate) | **POST** /stages/user_delete/ |  |
| [**stagesUserDeleteDestroy**](StagesApi.md#stagesUserDeleteDestroy) | **DELETE** /stages/user_delete/{stage_uuid}/ |  |
| [**stagesUserDeleteList**](StagesApi.md#stagesUserDeleteList) | **GET** /stages/user_delete/ |  |
| [**stagesUserDeletePartialUpdate**](StagesApi.md#stagesUserDeletePartialUpdate) | **PATCH** /stages/user_delete/{stage_uuid}/ |  |
| [**stagesUserDeleteRetrieve**](StagesApi.md#stagesUserDeleteRetrieve) | **GET** /stages/user_delete/{stage_uuid}/ |  |
| [**stagesUserDeleteUpdate**](StagesApi.md#stagesUserDeleteUpdate) | **PUT** /stages/user_delete/{stage_uuid}/ |  |
| [**stagesUserDeleteUsedByList**](StagesApi.md#stagesUserDeleteUsedByList) | **GET** /stages/user_delete/{stage_uuid}/used_by/ |  |
| [**stagesUserLoginCreate**](StagesApi.md#stagesUserLoginCreate) | **POST** /stages/user_login/ |  |
| [**stagesUserLoginDestroy**](StagesApi.md#stagesUserLoginDestroy) | **DELETE** /stages/user_login/{stage_uuid}/ |  |
| [**stagesUserLoginList**](StagesApi.md#stagesUserLoginList) | **GET** /stages/user_login/ |  |
| [**stagesUserLoginPartialUpdate**](StagesApi.md#stagesUserLoginPartialUpdate) | **PATCH** /stages/user_login/{stage_uuid}/ |  |
| [**stagesUserLoginRetrieve**](StagesApi.md#stagesUserLoginRetrieve) | **GET** /stages/user_login/{stage_uuid}/ |  |
| [**stagesUserLoginUpdate**](StagesApi.md#stagesUserLoginUpdate) | **PUT** /stages/user_login/{stage_uuid}/ |  |
| [**stagesUserLoginUsedByList**](StagesApi.md#stagesUserLoginUsedByList) | **GET** /stages/user_login/{stage_uuid}/used_by/ |  |
| [**stagesUserLogoutCreate**](StagesApi.md#stagesUserLogoutCreate) | **POST** /stages/user_logout/ |  |
| [**stagesUserLogoutDestroy**](StagesApi.md#stagesUserLogoutDestroy) | **DELETE** /stages/user_logout/{stage_uuid}/ |  |
| [**stagesUserLogoutList**](StagesApi.md#stagesUserLogoutList) | **GET** /stages/user_logout/ |  |
| [**stagesUserLogoutPartialUpdate**](StagesApi.md#stagesUserLogoutPartialUpdate) | **PATCH** /stages/user_logout/{stage_uuid}/ |  |
| [**stagesUserLogoutRetrieve**](StagesApi.md#stagesUserLogoutRetrieve) | **GET** /stages/user_logout/{stage_uuid}/ |  |
| [**stagesUserLogoutUpdate**](StagesApi.md#stagesUserLogoutUpdate) | **PUT** /stages/user_logout/{stage_uuid}/ |  |
| [**stagesUserLogoutUsedByList**](StagesApi.md#stagesUserLogoutUsedByList) | **GET** /stages/user_logout/{stage_uuid}/used_by/ |  |
| [**stagesUserWriteCreate**](StagesApi.md#stagesUserWriteCreate) | **POST** /stages/user_write/ |  |
| [**stagesUserWriteDestroy**](StagesApi.md#stagesUserWriteDestroy) | **DELETE** /stages/user_write/{stage_uuid}/ |  |
| [**stagesUserWriteList**](StagesApi.md#stagesUserWriteList) | **GET** /stages/user_write/ |  |
| [**stagesUserWritePartialUpdate**](StagesApi.md#stagesUserWritePartialUpdate) | **PATCH** /stages/user_write/{stage_uuid}/ |  |
| [**stagesUserWriteRetrieve**](StagesApi.md#stagesUserWriteRetrieve) | **GET** /stages/user_write/{stage_uuid}/ |  |
| [**stagesUserWriteUpdate**](StagesApi.md#stagesUserWriteUpdate) | **PUT** /stages/user_write/{stage_uuid}/ |  |
| [**stagesUserWriteUsedByList**](StagesApi.md#stagesUserWriteUsedByList) | **GET** /stages/user_write/{stage_uuid}/used_by/ |  |


<a id="stagesAllDestroy"></a>
# **stagesAllDestroy**
> stagesAllDestroy(stageUuid)



Stage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this stage.
    try {
      apiInstance.stagesAllDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAllDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAllList"></a>
# **stagesAllList**
> PaginatedStageList stagesAllList(name, ordering, page, pageSize, search)



Stage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedStageList result = apiInstance.stagesAllList(name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAllList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedStageList**](PaginatedStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAllRetrieve"></a>
# **stagesAllRetrieve**
> Stage stagesAllRetrieve(stageUuid)



Stage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this stage.
    try {
      Stage result = apiInstance.stagesAllRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAllRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this stage. | |

### Return type

[**Stage**](Stage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAllTypesList"></a>
# **stagesAllTypesList**
> List&lt;TypeCreate&gt; stagesAllTypesList()



Get all creatable types

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    try {
      List<TypeCreate> result = apiInstance.stagesAllTypesList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAllTypesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TypeCreate&gt;**](TypeCreate.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAllUsedByList"></a>
# **stagesAllUsedByList**
> List&lt;UsedBy&gt; stagesAllUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this stage.
    try {
      List<UsedBy> result = apiInstance.stagesAllUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAllUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAllUserSettingsList"></a>
# **stagesAllUserSettingsList**
> List&lt;UserSetting&gt; stagesAllUserSettingsList()



Get all stages the user can configure

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    try {
      List<UserSetting> result = apiInstance.stagesAllUserSettingsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAllUserSettingsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserSetting&gt;**](UserSetting.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoCreate"></a>
# **stagesAuthenticatorDuoCreate**
> AuthenticatorDuoStage stagesAuthenticatorDuoCreate(authenticatorDuoStageRequest)



AuthenticatorDuoStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    AuthenticatorDuoStageRequest authenticatorDuoStageRequest = new AuthenticatorDuoStageRequest(); // AuthenticatorDuoStageRequest | 
    try {
      AuthenticatorDuoStage result = apiInstance.stagesAuthenticatorDuoCreate(authenticatorDuoStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticatorDuoStageRequest** | [**AuthenticatorDuoStageRequest**](AuthenticatorDuoStageRequest.md)|  | |

### Return type

[**AuthenticatorDuoStage**](AuthenticatorDuoStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoDestroy"></a>
# **stagesAuthenticatorDuoDestroy**
> stagesAuthenticatorDuoDestroy(stageUuid)



AuthenticatorDuoStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Duo Authenticator Setup Stage.
    try {
      apiInstance.stagesAuthenticatorDuoDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Duo Authenticator Setup Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoEnrollmentStatusCreate"></a>
# **stagesAuthenticatorDuoEnrollmentStatusCreate**
> DuoDeviceEnrollmentStatus stagesAuthenticatorDuoEnrollmentStatusCreate(stageUuid)



Check enrollment status of user details in current session

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Duo Authenticator Setup Stage.
    try {
      DuoDeviceEnrollmentStatus result = apiInstance.stagesAuthenticatorDuoEnrollmentStatusCreate(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoEnrollmentStatusCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Duo Authenticator Setup Stage. | |

### Return type

[**DuoDeviceEnrollmentStatus**](DuoDeviceEnrollmentStatus.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoImportDeviceManualCreate"></a>
# **stagesAuthenticatorDuoImportDeviceManualCreate**
> stagesAuthenticatorDuoImportDeviceManualCreate(stageUuid, authenticatorDuoStageManualDeviceImportRequest)



Import duo devices into authentik

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Duo Authenticator Setup Stage.
    AuthenticatorDuoStageManualDeviceImportRequest authenticatorDuoStageManualDeviceImportRequest = new AuthenticatorDuoStageManualDeviceImportRequest(); // AuthenticatorDuoStageManualDeviceImportRequest | 
    try {
      apiInstance.stagesAuthenticatorDuoImportDeviceManualCreate(stageUuid, authenticatorDuoStageManualDeviceImportRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoImportDeviceManualCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Duo Authenticator Setup Stage. | |
| **authenticatorDuoStageManualDeviceImportRequest** | [**AuthenticatorDuoStageManualDeviceImportRequest**](AuthenticatorDuoStageManualDeviceImportRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Enrollment successful |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoImportDevicesAutomaticCreate"></a>
# **stagesAuthenticatorDuoImportDevicesAutomaticCreate**
> AuthenticatorDuoStageDeviceImportResponse stagesAuthenticatorDuoImportDevicesAutomaticCreate(stageUuid)



Import duo devices into authentik

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Duo Authenticator Setup Stage.
    try {
      AuthenticatorDuoStageDeviceImportResponse result = apiInstance.stagesAuthenticatorDuoImportDevicesAutomaticCreate(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoImportDevicesAutomaticCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Duo Authenticator Setup Stage. | |

### Return type

[**AuthenticatorDuoStageDeviceImportResponse**](AuthenticatorDuoStageDeviceImportResponse.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Bad request |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoList"></a>
# **stagesAuthenticatorDuoList**
> PaginatedAuthenticatorDuoStageList stagesAuthenticatorDuoList(apiHostname, clientId, configureFlow, name, ordering, page, pageSize, search)



AuthenticatorDuoStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String apiHostname = "apiHostname_example"; // String | 
    String clientId = "clientId_example"; // String | 
    UUID configureFlow = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedAuthenticatorDuoStageList result = apiInstance.stagesAuthenticatorDuoList(apiHostname, clientId, configureFlow, name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiHostname** | **String**|  | [optional] |
| **clientId** | **String**|  | [optional] |
| **configureFlow** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedAuthenticatorDuoStageList**](PaginatedAuthenticatorDuoStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoPartialUpdate"></a>
# **stagesAuthenticatorDuoPartialUpdate**
> AuthenticatorDuoStage stagesAuthenticatorDuoPartialUpdate(stageUuid, patchedAuthenticatorDuoStageRequest)



AuthenticatorDuoStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Duo Authenticator Setup Stage.
    PatchedAuthenticatorDuoStageRequest patchedAuthenticatorDuoStageRequest = new PatchedAuthenticatorDuoStageRequest(); // PatchedAuthenticatorDuoStageRequest | 
    try {
      AuthenticatorDuoStage result = apiInstance.stagesAuthenticatorDuoPartialUpdate(stageUuid, patchedAuthenticatorDuoStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Duo Authenticator Setup Stage. | |
| **patchedAuthenticatorDuoStageRequest** | [**PatchedAuthenticatorDuoStageRequest**](PatchedAuthenticatorDuoStageRequest.md)|  | [optional] |

### Return type

[**AuthenticatorDuoStage**](AuthenticatorDuoStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoRetrieve"></a>
# **stagesAuthenticatorDuoRetrieve**
> AuthenticatorDuoStage stagesAuthenticatorDuoRetrieve(stageUuid)



AuthenticatorDuoStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Duo Authenticator Setup Stage.
    try {
      AuthenticatorDuoStage result = apiInstance.stagesAuthenticatorDuoRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Duo Authenticator Setup Stage. | |

### Return type

[**AuthenticatorDuoStage**](AuthenticatorDuoStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoUpdate"></a>
# **stagesAuthenticatorDuoUpdate**
> AuthenticatorDuoStage stagesAuthenticatorDuoUpdate(stageUuid, authenticatorDuoStageRequest)



AuthenticatorDuoStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Duo Authenticator Setup Stage.
    AuthenticatorDuoStageRequest authenticatorDuoStageRequest = new AuthenticatorDuoStageRequest(); // AuthenticatorDuoStageRequest | 
    try {
      AuthenticatorDuoStage result = apiInstance.stagesAuthenticatorDuoUpdate(stageUuid, authenticatorDuoStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Duo Authenticator Setup Stage. | |
| **authenticatorDuoStageRequest** | [**AuthenticatorDuoStageRequest**](AuthenticatorDuoStageRequest.md)|  | |

### Return type

[**AuthenticatorDuoStage**](AuthenticatorDuoStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorDuoUsedByList"></a>
# **stagesAuthenticatorDuoUsedByList**
> List&lt;UsedBy&gt; stagesAuthenticatorDuoUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Duo Authenticator Setup Stage.
    try {
      List<UsedBy> result = apiInstance.stagesAuthenticatorDuoUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorDuoUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Duo Authenticator Setup Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorSmsCreate"></a>
# **stagesAuthenticatorSmsCreate**
> AuthenticatorSMSStage stagesAuthenticatorSmsCreate(authenticatorSMSStageRequest)



AuthenticatorSMSStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    AuthenticatorSMSStageRequest authenticatorSMSStageRequest = new AuthenticatorSMSStageRequest(); // AuthenticatorSMSStageRequest | 
    try {
      AuthenticatorSMSStage result = apiInstance.stagesAuthenticatorSmsCreate(authenticatorSMSStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorSmsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticatorSMSStageRequest** | [**AuthenticatorSMSStageRequest**](AuthenticatorSMSStageRequest.md)|  | |

### Return type

[**AuthenticatorSMSStage**](AuthenticatorSMSStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorSmsDestroy"></a>
# **stagesAuthenticatorSmsDestroy**
> stagesAuthenticatorSmsDestroy(stageUuid)



AuthenticatorSMSStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SMS Authenticator Setup Stage.
    try {
      apiInstance.stagesAuthenticatorSmsDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorSmsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this SMS Authenticator Setup Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorSmsList"></a>
# **stagesAuthenticatorSmsList**
> PaginatedAuthenticatorSMSStageList stagesAuthenticatorSmsList(accountSid, auth, authPassword, authType, configureFlow, friendlyName, fromNumber, mapping, name, ordering, page, pageSize, provider, search, stageUuid, verifyOnly)



AuthenticatorSMSStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String accountSid = "accountSid_example"; // String | 
    String auth = "auth_example"; // String | 
    String authPassword = "authPassword_example"; // String | 
    String authType = "basic"; // String | 
    UUID configureFlow = UUID.randomUUID(); // UUID | 
    String friendlyName = "friendlyName_example"; // String | 
    String fromNumber = "fromNumber_example"; // String | 
    UUID mapping = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String provider = "generic"; // String | 
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    Boolean verifyOnly = true; // Boolean | 
    try {
      PaginatedAuthenticatorSMSStageList result = apiInstance.stagesAuthenticatorSmsList(accountSid, auth, authPassword, authType, configureFlow, friendlyName, fromNumber, mapping, name, ordering, page, pageSize, provider, search, stageUuid, verifyOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorSmsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountSid** | **String**|  | [optional] |
| **auth** | **String**|  | [optional] |
| **authPassword** | **String**|  | [optional] |
| **authType** | **String**|  | [optional] [enum: basic, bearer] |
| **configureFlow** | **UUID**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **fromNumber** | **String**|  | [optional] |
| **mapping** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **provider** | **String**|  | [optional] [enum: generic, twilio] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |
| **verifyOnly** | **Boolean**|  | [optional] |

### Return type

[**PaginatedAuthenticatorSMSStageList**](PaginatedAuthenticatorSMSStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorSmsPartialUpdate"></a>
# **stagesAuthenticatorSmsPartialUpdate**
> AuthenticatorSMSStage stagesAuthenticatorSmsPartialUpdate(stageUuid, patchedAuthenticatorSMSStageRequest)



AuthenticatorSMSStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SMS Authenticator Setup Stage.
    PatchedAuthenticatorSMSStageRequest patchedAuthenticatorSMSStageRequest = new PatchedAuthenticatorSMSStageRequest(); // PatchedAuthenticatorSMSStageRequest | 
    try {
      AuthenticatorSMSStage result = apiInstance.stagesAuthenticatorSmsPartialUpdate(stageUuid, patchedAuthenticatorSMSStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorSmsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this SMS Authenticator Setup Stage. | |
| **patchedAuthenticatorSMSStageRequest** | [**PatchedAuthenticatorSMSStageRequest**](PatchedAuthenticatorSMSStageRequest.md)|  | [optional] |

### Return type

[**AuthenticatorSMSStage**](AuthenticatorSMSStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorSmsRetrieve"></a>
# **stagesAuthenticatorSmsRetrieve**
> AuthenticatorSMSStage stagesAuthenticatorSmsRetrieve(stageUuid)



AuthenticatorSMSStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SMS Authenticator Setup Stage.
    try {
      AuthenticatorSMSStage result = apiInstance.stagesAuthenticatorSmsRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorSmsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this SMS Authenticator Setup Stage. | |

### Return type

[**AuthenticatorSMSStage**](AuthenticatorSMSStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorSmsUpdate"></a>
# **stagesAuthenticatorSmsUpdate**
> AuthenticatorSMSStage stagesAuthenticatorSmsUpdate(stageUuid, authenticatorSMSStageRequest)



AuthenticatorSMSStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SMS Authenticator Setup Stage.
    AuthenticatorSMSStageRequest authenticatorSMSStageRequest = new AuthenticatorSMSStageRequest(); // AuthenticatorSMSStageRequest | 
    try {
      AuthenticatorSMSStage result = apiInstance.stagesAuthenticatorSmsUpdate(stageUuid, authenticatorSMSStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorSmsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this SMS Authenticator Setup Stage. | |
| **authenticatorSMSStageRequest** | [**AuthenticatorSMSStageRequest**](AuthenticatorSMSStageRequest.md)|  | |

### Return type

[**AuthenticatorSMSStage**](AuthenticatorSMSStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorSmsUsedByList"></a>
# **stagesAuthenticatorSmsUsedByList**
> List&lt;UsedBy&gt; stagesAuthenticatorSmsUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this SMS Authenticator Setup Stage.
    try {
      List<UsedBy> result = apiInstance.stagesAuthenticatorSmsUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorSmsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this SMS Authenticator Setup Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorStaticCreate"></a>
# **stagesAuthenticatorStaticCreate**
> AuthenticatorStaticStage stagesAuthenticatorStaticCreate(authenticatorStaticStageRequest)



AuthenticatorStaticStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    AuthenticatorStaticStageRequest authenticatorStaticStageRequest = new AuthenticatorStaticStageRequest(); // AuthenticatorStaticStageRequest | 
    try {
      AuthenticatorStaticStage result = apiInstance.stagesAuthenticatorStaticCreate(authenticatorStaticStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorStaticCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticatorStaticStageRequest** | [**AuthenticatorStaticStageRequest**](AuthenticatorStaticStageRequest.md)|  | |

### Return type

[**AuthenticatorStaticStage**](AuthenticatorStaticStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorStaticDestroy"></a>
# **stagesAuthenticatorStaticDestroy**
> stagesAuthenticatorStaticDestroy(stageUuid)



AuthenticatorStaticStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Static Authenticator Setup Stage.
    try {
      apiInstance.stagesAuthenticatorStaticDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorStaticDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Static Authenticator Setup Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorStaticList"></a>
# **stagesAuthenticatorStaticList**
> PaginatedAuthenticatorStaticStageList stagesAuthenticatorStaticList(configureFlow, friendlyName, name, ordering, page, pageSize, search, stageUuid, tokenCount, tokenLength)



AuthenticatorStaticStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID configureFlow = UUID.randomUUID(); // UUID | 
    String friendlyName = "friendlyName_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    Integer tokenCount = 56; // Integer | 
    Integer tokenLength = 56; // Integer | 
    try {
      PaginatedAuthenticatorStaticStageList result = apiInstance.stagesAuthenticatorStaticList(configureFlow, friendlyName, name, ordering, page, pageSize, search, stageUuid, tokenCount, tokenLength);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorStaticList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configureFlow** | **UUID**|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |
| **tokenCount** | **Integer**|  | [optional] |
| **tokenLength** | **Integer**|  | [optional] |

### Return type

[**PaginatedAuthenticatorStaticStageList**](PaginatedAuthenticatorStaticStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorStaticPartialUpdate"></a>
# **stagesAuthenticatorStaticPartialUpdate**
> AuthenticatorStaticStage stagesAuthenticatorStaticPartialUpdate(stageUuid, patchedAuthenticatorStaticStageRequest)



AuthenticatorStaticStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Static Authenticator Setup Stage.
    PatchedAuthenticatorStaticStageRequest patchedAuthenticatorStaticStageRequest = new PatchedAuthenticatorStaticStageRequest(); // PatchedAuthenticatorStaticStageRequest | 
    try {
      AuthenticatorStaticStage result = apiInstance.stagesAuthenticatorStaticPartialUpdate(stageUuid, patchedAuthenticatorStaticStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorStaticPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Static Authenticator Setup Stage. | |
| **patchedAuthenticatorStaticStageRequest** | [**PatchedAuthenticatorStaticStageRequest**](PatchedAuthenticatorStaticStageRequest.md)|  | [optional] |

### Return type

[**AuthenticatorStaticStage**](AuthenticatorStaticStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorStaticRetrieve"></a>
# **stagesAuthenticatorStaticRetrieve**
> AuthenticatorStaticStage stagesAuthenticatorStaticRetrieve(stageUuid)



AuthenticatorStaticStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Static Authenticator Setup Stage.
    try {
      AuthenticatorStaticStage result = apiInstance.stagesAuthenticatorStaticRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorStaticRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Static Authenticator Setup Stage. | |

### Return type

[**AuthenticatorStaticStage**](AuthenticatorStaticStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorStaticUpdate"></a>
# **stagesAuthenticatorStaticUpdate**
> AuthenticatorStaticStage stagesAuthenticatorStaticUpdate(stageUuid, authenticatorStaticStageRequest)



AuthenticatorStaticStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Static Authenticator Setup Stage.
    AuthenticatorStaticStageRequest authenticatorStaticStageRequest = new AuthenticatorStaticStageRequest(); // AuthenticatorStaticStageRequest | 
    try {
      AuthenticatorStaticStage result = apiInstance.stagesAuthenticatorStaticUpdate(stageUuid, authenticatorStaticStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorStaticUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Static Authenticator Setup Stage. | |
| **authenticatorStaticStageRequest** | [**AuthenticatorStaticStageRequest**](AuthenticatorStaticStageRequest.md)|  | |

### Return type

[**AuthenticatorStaticStage**](AuthenticatorStaticStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorStaticUsedByList"></a>
# **stagesAuthenticatorStaticUsedByList**
> List&lt;UsedBy&gt; stagesAuthenticatorStaticUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Static Authenticator Setup Stage.
    try {
      List<UsedBy> result = apiInstance.stagesAuthenticatorStaticUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorStaticUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Static Authenticator Setup Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorTotpCreate"></a>
# **stagesAuthenticatorTotpCreate**
> AuthenticatorTOTPStage stagesAuthenticatorTotpCreate(authenticatorTOTPStageRequest)



AuthenticatorTOTPStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    AuthenticatorTOTPStageRequest authenticatorTOTPStageRequest = new AuthenticatorTOTPStageRequest(); // AuthenticatorTOTPStageRequest | 
    try {
      AuthenticatorTOTPStage result = apiInstance.stagesAuthenticatorTotpCreate(authenticatorTOTPStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorTotpCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticatorTOTPStageRequest** | [**AuthenticatorTOTPStageRequest**](AuthenticatorTOTPStageRequest.md)|  | |

### Return type

[**AuthenticatorTOTPStage**](AuthenticatorTOTPStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorTotpDestroy"></a>
# **stagesAuthenticatorTotpDestroy**
> stagesAuthenticatorTotpDestroy(stageUuid)



AuthenticatorTOTPStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
    try {
      apiInstance.stagesAuthenticatorTotpDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorTotpDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorTotpList"></a>
# **stagesAuthenticatorTotpList**
> PaginatedAuthenticatorTOTPStageList stagesAuthenticatorTotpList(configureFlow, digits, friendlyName, name, ordering, page, pageSize, search, stageUuid)



AuthenticatorTOTPStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID configureFlow = UUID.randomUUID(); // UUID | 
    String digits = "6"; // String | 
    String friendlyName = "friendlyName_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    try {
      PaginatedAuthenticatorTOTPStageList result = apiInstance.stagesAuthenticatorTotpList(configureFlow, digits, friendlyName, name, ordering, page, pageSize, search, stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorTotpList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configureFlow** | **UUID**|  | [optional] |
| **digits** | **String**|  | [optional] [enum: 6, 8] |
| **friendlyName** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |

### Return type

[**PaginatedAuthenticatorTOTPStageList**](PaginatedAuthenticatorTOTPStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorTotpPartialUpdate"></a>
# **stagesAuthenticatorTotpPartialUpdate**
> AuthenticatorTOTPStage stagesAuthenticatorTotpPartialUpdate(stageUuid, patchedAuthenticatorTOTPStageRequest)



AuthenticatorTOTPStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
    PatchedAuthenticatorTOTPStageRequest patchedAuthenticatorTOTPStageRequest = new PatchedAuthenticatorTOTPStageRequest(); // PatchedAuthenticatorTOTPStageRequest | 
    try {
      AuthenticatorTOTPStage result = apiInstance.stagesAuthenticatorTotpPartialUpdate(stageUuid, patchedAuthenticatorTOTPStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorTotpPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. | |
| **patchedAuthenticatorTOTPStageRequest** | [**PatchedAuthenticatorTOTPStageRequest**](PatchedAuthenticatorTOTPStageRequest.md)|  | [optional] |

### Return type

[**AuthenticatorTOTPStage**](AuthenticatorTOTPStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorTotpRetrieve"></a>
# **stagesAuthenticatorTotpRetrieve**
> AuthenticatorTOTPStage stagesAuthenticatorTotpRetrieve(stageUuid)



AuthenticatorTOTPStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
    try {
      AuthenticatorTOTPStage result = apiInstance.stagesAuthenticatorTotpRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorTotpRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. | |

### Return type

[**AuthenticatorTOTPStage**](AuthenticatorTOTPStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorTotpUpdate"></a>
# **stagesAuthenticatorTotpUpdate**
> AuthenticatorTOTPStage stagesAuthenticatorTotpUpdate(stageUuid, authenticatorTOTPStageRequest)



AuthenticatorTOTPStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
    AuthenticatorTOTPStageRequest authenticatorTOTPStageRequest = new AuthenticatorTOTPStageRequest(); // AuthenticatorTOTPStageRequest | 
    try {
      AuthenticatorTOTPStage result = apiInstance.stagesAuthenticatorTotpUpdate(stageUuid, authenticatorTOTPStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorTotpUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. | |
| **authenticatorTOTPStageRequest** | [**AuthenticatorTOTPStageRequest**](AuthenticatorTOTPStageRequest.md)|  | |

### Return type

[**AuthenticatorTOTPStage**](AuthenticatorTOTPStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorTotpUsedByList"></a>
# **stagesAuthenticatorTotpUsedByList**
> List&lt;UsedBy&gt; stagesAuthenticatorTotpUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this TOTP Authenticator Setup Stage.
    try {
      List<UsedBy> result = apiInstance.stagesAuthenticatorTotpUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorTotpUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this TOTP Authenticator Setup Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorValidateCreate"></a>
# **stagesAuthenticatorValidateCreate**
> AuthenticatorValidateStage stagesAuthenticatorValidateCreate(authenticatorValidateStageRequest)



AuthenticatorValidateStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    AuthenticatorValidateStageRequest authenticatorValidateStageRequest = new AuthenticatorValidateStageRequest(); // AuthenticatorValidateStageRequest | 
    try {
      AuthenticatorValidateStage result = apiInstance.stagesAuthenticatorValidateCreate(authenticatorValidateStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorValidateCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticatorValidateStageRequest** | [**AuthenticatorValidateStageRequest**](AuthenticatorValidateStageRequest.md)|  | |

### Return type

[**AuthenticatorValidateStage**](AuthenticatorValidateStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorValidateDestroy"></a>
# **stagesAuthenticatorValidateDestroy**
> stagesAuthenticatorValidateDestroy(stageUuid)



AuthenticatorValidateStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Authenticator Validation Stage.
    try {
      apiInstance.stagesAuthenticatorValidateDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorValidateDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Authenticator Validation Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorValidateList"></a>
# **stagesAuthenticatorValidateList**
> PaginatedAuthenticatorValidateStageList stagesAuthenticatorValidateList(configurationStages, name, notConfiguredAction, ordering, page, pageSize, search)



AuthenticatorValidateStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    List<UUID> configurationStages = Arrays.asList(); // List<UUID> | 
    String name = "name_example"; // String | 
    String notConfiguredAction = "configure"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedAuthenticatorValidateStageList result = apiInstance.stagesAuthenticatorValidateList(configurationStages, name, notConfiguredAction, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorValidateList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configurationStages** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **notConfiguredAction** | **String**|  | [optional] [enum: configure, deny, skip] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedAuthenticatorValidateStageList**](PaginatedAuthenticatorValidateStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorValidatePartialUpdate"></a>
# **stagesAuthenticatorValidatePartialUpdate**
> AuthenticatorValidateStage stagesAuthenticatorValidatePartialUpdate(stageUuid, patchedAuthenticatorValidateStageRequest)



AuthenticatorValidateStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Authenticator Validation Stage.
    PatchedAuthenticatorValidateStageRequest patchedAuthenticatorValidateStageRequest = new PatchedAuthenticatorValidateStageRequest(); // PatchedAuthenticatorValidateStageRequest | 
    try {
      AuthenticatorValidateStage result = apiInstance.stagesAuthenticatorValidatePartialUpdate(stageUuid, patchedAuthenticatorValidateStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorValidatePartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Authenticator Validation Stage. | |
| **patchedAuthenticatorValidateStageRequest** | [**PatchedAuthenticatorValidateStageRequest**](PatchedAuthenticatorValidateStageRequest.md)|  | [optional] |

### Return type

[**AuthenticatorValidateStage**](AuthenticatorValidateStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorValidateRetrieve"></a>
# **stagesAuthenticatorValidateRetrieve**
> AuthenticatorValidateStage stagesAuthenticatorValidateRetrieve(stageUuid)



AuthenticatorValidateStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Authenticator Validation Stage.
    try {
      AuthenticatorValidateStage result = apiInstance.stagesAuthenticatorValidateRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorValidateRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Authenticator Validation Stage. | |

### Return type

[**AuthenticatorValidateStage**](AuthenticatorValidateStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorValidateUpdate"></a>
# **stagesAuthenticatorValidateUpdate**
> AuthenticatorValidateStage stagesAuthenticatorValidateUpdate(stageUuid, authenticatorValidateStageRequest)



AuthenticatorValidateStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Authenticator Validation Stage.
    AuthenticatorValidateStageRequest authenticatorValidateStageRequest = new AuthenticatorValidateStageRequest(); // AuthenticatorValidateStageRequest | 
    try {
      AuthenticatorValidateStage result = apiInstance.stagesAuthenticatorValidateUpdate(stageUuid, authenticatorValidateStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorValidateUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Authenticator Validation Stage. | |
| **authenticatorValidateStageRequest** | [**AuthenticatorValidateStageRequest**](AuthenticatorValidateStageRequest.md)|  | |

### Return type

[**AuthenticatorValidateStage**](AuthenticatorValidateStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorValidateUsedByList"></a>
# **stagesAuthenticatorValidateUsedByList**
> List&lt;UsedBy&gt; stagesAuthenticatorValidateUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Authenticator Validation Stage.
    try {
      List<UsedBy> result = apiInstance.stagesAuthenticatorValidateUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorValidateUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Authenticator Validation Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorWebauthnCreate"></a>
# **stagesAuthenticatorWebauthnCreate**
> AuthenticatorWebAuthnStage stagesAuthenticatorWebauthnCreate(authenticatorWebAuthnStageRequest)



AuthenticatorWebAuthnStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    AuthenticatorWebAuthnStageRequest authenticatorWebAuthnStageRequest = new AuthenticatorWebAuthnStageRequest(); // AuthenticatorWebAuthnStageRequest | 
    try {
      AuthenticatorWebAuthnStage result = apiInstance.stagesAuthenticatorWebauthnCreate(authenticatorWebAuthnStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorWebauthnCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticatorWebAuthnStageRequest** | [**AuthenticatorWebAuthnStageRequest**](AuthenticatorWebAuthnStageRequest.md)|  | |

### Return type

[**AuthenticatorWebAuthnStage**](AuthenticatorWebAuthnStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorWebauthnDestroy"></a>
# **stagesAuthenticatorWebauthnDestroy**
> stagesAuthenticatorWebauthnDestroy(stageUuid)



AuthenticatorWebAuthnStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
    try {
      apiInstance.stagesAuthenticatorWebauthnDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorWebauthnDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorWebauthnDeviceTypesList"></a>
# **stagesAuthenticatorWebauthnDeviceTypesList**
> PaginatedWebAuthnDeviceTypeList stagesAuthenticatorWebauthnDeviceTypesList(aaguid, description, icon, ordering, page, pageSize, search)



WebAuthnDeviceType Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID aaguid = UUID.randomUUID(); // UUID | 
    String description = "description_example"; // String | 
    String icon = "icon_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedWebAuthnDeviceTypeList result = apiInstance.stagesAuthenticatorWebauthnDeviceTypesList(aaguid, description, icon, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorWebauthnDeviceTypesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aaguid** | **UUID**|  | [optional] |
| **description** | **String**|  | [optional] |
| **icon** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedWebAuthnDeviceTypeList**](PaginatedWebAuthnDeviceTypeList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorWebauthnDeviceTypesRetrieve"></a>
# **stagesAuthenticatorWebauthnDeviceTypesRetrieve**
> WebAuthnDeviceType stagesAuthenticatorWebauthnDeviceTypesRetrieve(aaguid)



WebAuthnDeviceType Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID aaguid = UUID.randomUUID(); // UUID | A UUID string identifying this WebAuthn Device type.
    try {
      WebAuthnDeviceType result = apiInstance.stagesAuthenticatorWebauthnDeviceTypesRetrieve(aaguid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorWebauthnDeviceTypesRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aaguid** | **UUID**| A UUID string identifying this WebAuthn Device type. | |

### Return type

[**WebAuthnDeviceType**](WebAuthnDeviceType.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorWebauthnList"></a>
# **stagesAuthenticatorWebauthnList**
> PaginatedAuthenticatorWebAuthnStageList stagesAuthenticatorWebauthnList(authenticatorAttachment, configureFlow, deviceTypeRestrictions, friendlyName, name, ordering, page, pageSize, residentKeyRequirement, search, stageUuid, userVerification)



AuthenticatorWebAuthnStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String authenticatorAttachment = "cross-platform"; // String | 
    UUID configureFlow = UUID.randomUUID(); // UUID | 
    List<UUID> deviceTypeRestrictions = Arrays.asList(); // List<UUID> | 
    String friendlyName = "friendlyName_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String residentKeyRequirement = "discouraged"; // String | 
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    String userVerification = "discouraged"; // String | 
    try {
      PaginatedAuthenticatorWebAuthnStageList result = apiInstance.stagesAuthenticatorWebauthnList(authenticatorAttachment, configureFlow, deviceTypeRestrictions, friendlyName, name, ordering, page, pageSize, residentKeyRequirement, search, stageUuid, userVerification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorWebauthnList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticatorAttachment** | **String**|  | [optional] [enum: cross-platform, platform] |
| **configureFlow** | **UUID**|  | [optional] |
| **deviceTypeRestrictions** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **friendlyName** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **residentKeyRequirement** | **String**|  | [optional] [enum: discouraged, preferred, required] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |
| **userVerification** | **String**|  | [optional] [enum: discouraged, preferred, required] |

### Return type

[**PaginatedAuthenticatorWebAuthnStageList**](PaginatedAuthenticatorWebAuthnStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorWebauthnPartialUpdate"></a>
# **stagesAuthenticatorWebauthnPartialUpdate**
> AuthenticatorWebAuthnStage stagesAuthenticatorWebauthnPartialUpdate(stageUuid, patchedAuthenticatorWebAuthnStageRequest)



AuthenticatorWebAuthnStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
    PatchedAuthenticatorWebAuthnStageRequest patchedAuthenticatorWebAuthnStageRequest = new PatchedAuthenticatorWebAuthnStageRequest(); // PatchedAuthenticatorWebAuthnStageRequest | 
    try {
      AuthenticatorWebAuthnStage result = apiInstance.stagesAuthenticatorWebauthnPartialUpdate(stageUuid, patchedAuthenticatorWebAuthnStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorWebauthnPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. | |
| **patchedAuthenticatorWebAuthnStageRequest** | [**PatchedAuthenticatorWebAuthnStageRequest**](PatchedAuthenticatorWebAuthnStageRequest.md)|  | [optional] |

### Return type

[**AuthenticatorWebAuthnStage**](AuthenticatorWebAuthnStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorWebauthnRetrieve"></a>
# **stagesAuthenticatorWebauthnRetrieve**
> AuthenticatorWebAuthnStage stagesAuthenticatorWebauthnRetrieve(stageUuid)



AuthenticatorWebAuthnStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
    try {
      AuthenticatorWebAuthnStage result = apiInstance.stagesAuthenticatorWebauthnRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorWebauthnRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. | |

### Return type

[**AuthenticatorWebAuthnStage**](AuthenticatorWebAuthnStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorWebauthnUpdate"></a>
# **stagesAuthenticatorWebauthnUpdate**
> AuthenticatorWebAuthnStage stagesAuthenticatorWebauthnUpdate(stageUuid, authenticatorWebAuthnStageRequest)



AuthenticatorWebAuthnStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
    AuthenticatorWebAuthnStageRequest authenticatorWebAuthnStageRequest = new AuthenticatorWebAuthnStageRequest(); // AuthenticatorWebAuthnStageRequest | 
    try {
      AuthenticatorWebAuthnStage result = apiInstance.stagesAuthenticatorWebauthnUpdate(stageUuid, authenticatorWebAuthnStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorWebauthnUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. | |
| **authenticatorWebAuthnStageRequest** | [**AuthenticatorWebAuthnStageRequest**](AuthenticatorWebAuthnStageRequest.md)|  | |

### Return type

[**AuthenticatorWebAuthnStage**](AuthenticatorWebAuthnStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesAuthenticatorWebauthnUsedByList"></a>
# **stagesAuthenticatorWebauthnUsedByList**
> List&lt;UsedBy&gt; stagesAuthenticatorWebauthnUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this WebAuthn Authenticator Setup Stage.
    try {
      List<UsedBy> result = apiInstance.stagesAuthenticatorWebauthnUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesAuthenticatorWebauthnUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this WebAuthn Authenticator Setup Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesCaptchaCreate"></a>
# **stagesCaptchaCreate**
> CaptchaStage stagesCaptchaCreate(captchaStageRequest)



CaptchaStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    CaptchaStageRequest captchaStageRequest = new CaptchaStageRequest(); // CaptchaStageRequest | 
    try {
      CaptchaStage result = apiInstance.stagesCaptchaCreate(captchaStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesCaptchaCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **captchaStageRequest** | [**CaptchaStageRequest**](CaptchaStageRequest.md)|  | |

### Return type

[**CaptchaStage**](CaptchaStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesCaptchaDestroy"></a>
# **stagesCaptchaDestroy**
> stagesCaptchaDestroy(stageUuid)



CaptchaStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Captcha Stage.
    try {
      apiInstance.stagesCaptchaDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesCaptchaDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Captcha Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesCaptchaList"></a>
# **stagesCaptchaList**
> PaginatedCaptchaStageList stagesCaptchaList(name, ordering, page, pageSize, publicKey, search)



CaptchaStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String publicKey = "publicKey_example"; // String | 
    String search = "search_example"; // String | A search term.
    try {
      PaginatedCaptchaStageList result = apiInstance.stagesCaptchaList(name, ordering, page, pageSize, publicKey, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesCaptchaList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **publicKey** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedCaptchaStageList**](PaginatedCaptchaStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesCaptchaPartialUpdate"></a>
# **stagesCaptchaPartialUpdate**
> CaptchaStage stagesCaptchaPartialUpdate(stageUuid, patchedCaptchaStageRequest)



CaptchaStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Captcha Stage.
    PatchedCaptchaStageRequest patchedCaptchaStageRequest = new PatchedCaptchaStageRequest(); // PatchedCaptchaStageRequest | 
    try {
      CaptchaStage result = apiInstance.stagesCaptchaPartialUpdate(stageUuid, patchedCaptchaStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesCaptchaPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Captcha Stage. | |
| **patchedCaptchaStageRequest** | [**PatchedCaptchaStageRequest**](PatchedCaptchaStageRequest.md)|  | [optional] |

### Return type

[**CaptchaStage**](CaptchaStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesCaptchaRetrieve"></a>
# **stagesCaptchaRetrieve**
> CaptchaStage stagesCaptchaRetrieve(stageUuid)



CaptchaStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Captcha Stage.
    try {
      CaptchaStage result = apiInstance.stagesCaptchaRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesCaptchaRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Captcha Stage. | |

### Return type

[**CaptchaStage**](CaptchaStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesCaptchaUpdate"></a>
# **stagesCaptchaUpdate**
> CaptchaStage stagesCaptchaUpdate(stageUuid, captchaStageRequest)



CaptchaStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Captcha Stage.
    CaptchaStageRequest captchaStageRequest = new CaptchaStageRequest(); // CaptchaStageRequest | 
    try {
      CaptchaStage result = apiInstance.stagesCaptchaUpdate(stageUuid, captchaStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesCaptchaUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Captcha Stage. | |
| **captchaStageRequest** | [**CaptchaStageRequest**](CaptchaStageRequest.md)|  | |

### Return type

[**CaptchaStage**](CaptchaStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesCaptchaUsedByList"></a>
# **stagesCaptchaUsedByList**
> List&lt;UsedBy&gt; stagesCaptchaUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Captcha Stage.
    try {
      List<UsedBy> result = apiInstance.stagesCaptchaUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesCaptchaUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Captcha Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesConsentCreate"></a>
# **stagesConsentCreate**
> ConsentStage stagesConsentCreate(consentStageRequest)



ConsentStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    ConsentStageRequest consentStageRequest = new ConsentStageRequest(); // ConsentStageRequest | 
    try {
      ConsentStage result = apiInstance.stagesConsentCreate(consentStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesConsentCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentStageRequest** | [**ConsentStageRequest**](ConsentStageRequest.md)|  | |

### Return type

[**ConsentStage**](ConsentStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesConsentDestroy"></a>
# **stagesConsentDestroy**
> stagesConsentDestroy(stageUuid)



ConsentStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Consent Stage.
    try {
      apiInstance.stagesConsentDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesConsentDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Consent Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesConsentList"></a>
# **stagesConsentList**
> PaginatedConsentStageList stagesConsentList(consentExpireIn, mode, name, ordering, page, pageSize, search, stageUuid)



ConsentStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String consentExpireIn = "consentExpireIn_example"; // String | 
    String mode = "always_require"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    try {
      PaginatedConsentStageList result = apiInstance.stagesConsentList(consentExpireIn, mode, name, ordering, page, pageSize, search, stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesConsentList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentExpireIn** | **String**|  | [optional] |
| **mode** | **String**|  | [optional] [enum: always_require, expiring, permanent] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |

### Return type

[**PaginatedConsentStageList**](PaginatedConsentStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesConsentPartialUpdate"></a>
# **stagesConsentPartialUpdate**
> ConsentStage stagesConsentPartialUpdate(stageUuid, patchedConsentStageRequest)



ConsentStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Consent Stage.
    PatchedConsentStageRequest patchedConsentStageRequest = new PatchedConsentStageRequest(); // PatchedConsentStageRequest | 
    try {
      ConsentStage result = apiInstance.stagesConsentPartialUpdate(stageUuid, patchedConsentStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesConsentPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Consent Stage. | |
| **patchedConsentStageRequest** | [**PatchedConsentStageRequest**](PatchedConsentStageRequest.md)|  | [optional] |

### Return type

[**ConsentStage**](ConsentStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesConsentRetrieve"></a>
# **stagesConsentRetrieve**
> ConsentStage stagesConsentRetrieve(stageUuid)



ConsentStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Consent Stage.
    try {
      ConsentStage result = apiInstance.stagesConsentRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesConsentRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Consent Stage. | |

### Return type

[**ConsentStage**](ConsentStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesConsentUpdate"></a>
# **stagesConsentUpdate**
> ConsentStage stagesConsentUpdate(stageUuid, consentStageRequest)



ConsentStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Consent Stage.
    ConsentStageRequest consentStageRequest = new ConsentStageRequest(); // ConsentStageRequest | 
    try {
      ConsentStage result = apiInstance.stagesConsentUpdate(stageUuid, consentStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesConsentUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Consent Stage. | |
| **consentStageRequest** | [**ConsentStageRequest**](ConsentStageRequest.md)|  | |

### Return type

[**ConsentStage**](ConsentStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesConsentUsedByList"></a>
# **stagesConsentUsedByList**
> List&lt;UsedBy&gt; stagesConsentUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Consent Stage.
    try {
      List<UsedBy> result = apiInstance.stagesConsentUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesConsentUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Consent Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDenyCreate"></a>
# **stagesDenyCreate**
> DenyStage stagesDenyCreate(denyStageRequest)



DenyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    DenyStageRequest denyStageRequest = new DenyStageRequest(); // DenyStageRequest | 
    try {
      DenyStage result = apiInstance.stagesDenyCreate(denyStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDenyCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **denyStageRequest** | [**DenyStageRequest**](DenyStageRequest.md)|  | |

### Return type

[**DenyStage**](DenyStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDenyDestroy"></a>
# **stagesDenyDestroy**
> stagesDenyDestroy(stageUuid)



DenyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Deny Stage.
    try {
      apiInstance.stagesDenyDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDenyDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Deny Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDenyList"></a>
# **stagesDenyList**
> PaginatedDenyStageList stagesDenyList(denyMessage, name, ordering, page, pageSize, search, stageUuid)



DenyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String denyMessage = "denyMessage_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    try {
      PaginatedDenyStageList result = apiInstance.stagesDenyList(denyMessage, name, ordering, page, pageSize, search, stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDenyList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **denyMessage** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |

### Return type

[**PaginatedDenyStageList**](PaginatedDenyStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDenyPartialUpdate"></a>
# **stagesDenyPartialUpdate**
> DenyStage stagesDenyPartialUpdate(stageUuid, patchedDenyStageRequest)



DenyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Deny Stage.
    PatchedDenyStageRequest patchedDenyStageRequest = new PatchedDenyStageRequest(); // PatchedDenyStageRequest | 
    try {
      DenyStage result = apiInstance.stagesDenyPartialUpdate(stageUuid, patchedDenyStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDenyPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Deny Stage. | |
| **patchedDenyStageRequest** | [**PatchedDenyStageRequest**](PatchedDenyStageRequest.md)|  | [optional] |

### Return type

[**DenyStage**](DenyStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDenyRetrieve"></a>
# **stagesDenyRetrieve**
> DenyStage stagesDenyRetrieve(stageUuid)



DenyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Deny Stage.
    try {
      DenyStage result = apiInstance.stagesDenyRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDenyRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Deny Stage. | |

### Return type

[**DenyStage**](DenyStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDenyUpdate"></a>
# **stagesDenyUpdate**
> DenyStage stagesDenyUpdate(stageUuid, denyStageRequest)



DenyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Deny Stage.
    DenyStageRequest denyStageRequest = new DenyStageRequest(); // DenyStageRequest | 
    try {
      DenyStage result = apiInstance.stagesDenyUpdate(stageUuid, denyStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDenyUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Deny Stage. | |
| **denyStageRequest** | [**DenyStageRequest**](DenyStageRequest.md)|  | |

### Return type

[**DenyStage**](DenyStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDenyUsedByList"></a>
# **stagesDenyUsedByList**
> List&lt;UsedBy&gt; stagesDenyUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Deny Stage.
    try {
      List<UsedBy> result = apiInstance.stagesDenyUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDenyUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Deny Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDummyCreate"></a>
# **stagesDummyCreate**
> DummyStage stagesDummyCreate(dummyStageRequest)



DummyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    DummyStageRequest dummyStageRequest = new DummyStageRequest(); // DummyStageRequest | 
    try {
      DummyStage result = apiInstance.stagesDummyCreate(dummyStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDummyCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dummyStageRequest** | [**DummyStageRequest**](DummyStageRequest.md)|  | |

### Return type

[**DummyStage**](DummyStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDummyDestroy"></a>
# **stagesDummyDestroy**
> stagesDummyDestroy(stageUuid)



DummyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Stage.
    try {
      apiInstance.stagesDummyDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDummyDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Dummy Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDummyList"></a>
# **stagesDummyList**
> PaginatedDummyStageList stagesDummyList(name, ordering, page, pageSize, search, stageUuid, throwError)



DummyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    Boolean throwError = true; // Boolean | 
    try {
      PaginatedDummyStageList result = apiInstance.stagesDummyList(name, ordering, page, pageSize, search, stageUuid, throwError);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDummyList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |
| **throwError** | **Boolean**|  | [optional] |

### Return type

[**PaginatedDummyStageList**](PaginatedDummyStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDummyPartialUpdate"></a>
# **stagesDummyPartialUpdate**
> DummyStage stagesDummyPartialUpdate(stageUuid, patchedDummyStageRequest)



DummyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Stage.
    PatchedDummyStageRequest patchedDummyStageRequest = new PatchedDummyStageRequest(); // PatchedDummyStageRequest | 
    try {
      DummyStage result = apiInstance.stagesDummyPartialUpdate(stageUuid, patchedDummyStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDummyPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Dummy Stage. | |
| **patchedDummyStageRequest** | [**PatchedDummyStageRequest**](PatchedDummyStageRequest.md)|  | [optional] |

### Return type

[**DummyStage**](DummyStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDummyRetrieve"></a>
# **stagesDummyRetrieve**
> DummyStage stagesDummyRetrieve(stageUuid)



DummyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Stage.
    try {
      DummyStage result = apiInstance.stagesDummyRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDummyRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Dummy Stage. | |

### Return type

[**DummyStage**](DummyStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDummyUpdate"></a>
# **stagesDummyUpdate**
> DummyStage stagesDummyUpdate(stageUuid, dummyStageRequest)



DummyStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Stage.
    DummyStageRequest dummyStageRequest = new DummyStageRequest(); // DummyStageRequest | 
    try {
      DummyStage result = apiInstance.stagesDummyUpdate(stageUuid, dummyStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDummyUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Dummy Stage. | |
| **dummyStageRequest** | [**DummyStageRequest**](DummyStageRequest.md)|  | |

### Return type

[**DummyStage**](DummyStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesDummyUsedByList"></a>
# **stagesDummyUsedByList**
> List&lt;UsedBy&gt; stagesDummyUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Dummy Stage.
    try {
      List<UsedBy> result = apiInstance.stagesDummyUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesDummyUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Dummy Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesEmailCreate"></a>
# **stagesEmailCreate**
> EmailStage stagesEmailCreate(emailStageRequest)



EmailStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    EmailStageRequest emailStageRequest = new EmailStageRequest(); // EmailStageRequest | 
    try {
      EmailStage result = apiInstance.stagesEmailCreate(emailStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesEmailCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailStageRequest** | [**EmailStageRequest**](EmailStageRequest.md)|  | |

### Return type

[**EmailStage**](EmailStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesEmailDestroy"></a>
# **stagesEmailDestroy**
> stagesEmailDestroy(stageUuid)



EmailStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Email Stage.
    try {
      apiInstance.stagesEmailDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesEmailDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Email Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesEmailList"></a>
# **stagesEmailList**
> PaginatedEmailStageList stagesEmailList(activateUserOnSuccess, fromAddress, host, name, ordering, page, pageSize, port, search, subject, template, timeout, tokenExpiry, useGlobalSettings, useSsl, useTls, username)



EmailStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    Boolean activateUserOnSuccess = true; // Boolean | 
    String fromAddress = "fromAddress_example"; // String | 
    String host = "host_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    Integer port = 56; // Integer | 
    String search = "search_example"; // String | A search term.
    String subject = "subject_example"; // String | 
    String template = "template_example"; // String | 
    Integer timeout = 56; // Integer | 
    Integer tokenExpiry = 56; // Integer | 
    Boolean useGlobalSettings = true; // Boolean | 
    Boolean useSsl = true; // Boolean | 
    Boolean useTls = true; // Boolean | 
    String username = "username_example"; // String | 
    try {
      PaginatedEmailStageList result = apiInstance.stagesEmailList(activateUserOnSuccess, fromAddress, host, name, ordering, page, pageSize, port, search, subject, template, timeout, tokenExpiry, useGlobalSettings, useSsl, useTls, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesEmailList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **activateUserOnSuccess** | **Boolean**|  | [optional] |
| **fromAddress** | **String**|  | [optional] |
| **host** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **port** | **Integer**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **subject** | **String**|  | [optional] |
| **template** | **String**|  | [optional] |
| **timeout** | **Integer**|  | [optional] |
| **tokenExpiry** | **Integer**|  | [optional] |
| **useGlobalSettings** | **Boolean**|  | [optional] |
| **useSsl** | **Boolean**|  | [optional] |
| **useTls** | **Boolean**|  | [optional] |
| **username** | **String**|  | [optional] |

### Return type

[**PaginatedEmailStageList**](PaginatedEmailStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesEmailPartialUpdate"></a>
# **stagesEmailPartialUpdate**
> EmailStage stagesEmailPartialUpdate(stageUuid, patchedEmailStageRequest)



EmailStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Email Stage.
    PatchedEmailStageRequest patchedEmailStageRequest = new PatchedEmailStageRequest(); // PatchedEmailStageRequest | 
    try {
      EmailStage result = apiInstance.stagesEmailPartialUpdate(stageUuid, patchedEmailStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesEmailPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Email Stage. | |
| **patchedEmailStageRequest** | [**PatchedEmailStageRequest**](PatchedEmailStageRequest.md)|  | [optional] |

### Return type

[**EmailStage**](EmailStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesEmailRetrieve"></a>
# **stagesEmailRetrieve**
> EmailStage stagesEmailRetrieve(stageUuid)



EmailStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Email Stage.
    try {
      EmailStage result = apiInstance.stagesEmailRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesEmailRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Email Stage. | |

### Return type

[**EmailStage**](EmailStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesEmailTemplatesList"></a>
# **stagesEmailTemplatesList**
> List&lt;TypeCreate&gt; stagesEmailTemplatesList()



Get all available templates, including custom templates

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    try {
      List<TypeCreate> result = apiInstance.stagesEmailTemplatesList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesEmailTemplatesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TypeCreate&gt;**](TypeCreate.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesEmailUpdate"></a>
# **stagesEmailUpdate**
> EmailStage stagesEmailUpdate(stageUuid, emailStageRequest)



EmailStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Email Stage.
    EmailStageRequest emailStageRequest = new EmailStageRequest(); // EmailStageRequest | 
    try {
      EmailStage result = apiInstance.stagesEmailUpdate(stageUuid, emailStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesEmailUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Email Stage. | |
| **emailStageRequest** | [**EmailStageRequest**](EmailStageRequest.md)|  | |

### Return type

[**EmailStage**](EmailStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesEmailUsedByList"></a>
# **stagesEmailUsedByList**
> List&lt;UsedBy&gt; stagesEmailUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Email Stage.
    try {
      List<UsedBy> result = apiInstance.stagesEmailUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesEmailUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Email Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesIdentificationCreate"></a>
# **stagesIdentificationCreate**
> IdentificationStage stagesIdentificationCreate(identificationStageRequest)



IdentificationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    IdentificationStageRequest identificationStageRequest = new IdentificationStageRequest(); // IdentificationStageRequest | 
    try {
      IdentificationStage result = apiInstance.stagesIdentificationCreate(identificationStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesIdentificationCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **identificationStageRequest** | [**IdentificationStageRequest**](IdentificationStageRequest.md)|  | |

### Return type

[**IdentificationStage**](IdentificationStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesIdentificationDestroy"></a>
# **stagesIdentificationDestroy**
> stagesIdentificationDestroy(stageUuid)



IdentificationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Identification Stage.
    try {
      apiInstance.stagesIdentificationDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesIdentificationDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Identification Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesIdentificationList"></a>
# **stagesIdentificationList**
> PaginatedIdentificationStageList stagesIdentificationList(caseInsensitiveMatching, enrollmentFlow, name, ordering, page, pageSize, passwordStage, passwordlessFlow, recoveryFlow, search, showMatchedUser, showSourceLabels)



IdentificationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    Boolean caseInsensitiveMatching = true; // Boolean | 
    UUID enrollmentFlow = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    UUID passwordStage = UUID.randomUUID(); // UUID | 
    UUID passwordlessFlow = UUID.randomUUID(); // UUID | 
    UUID recoveryFlow = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | A search term.
    Boolean showMatchedUser = true; // Boolean | 
    Boolean showSourceLabels = true; // Boolean | 
    try {
      PaginatedIdentificationStageList result = apiInstance.stagesIdentificationList(caseInsensitiveMatching, enrollmentFlow, name, ordering, page, pageSize, passwordStage, passwordlessFlow, recoveryFlow, search, showMatchedUser, showSourceLabels);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesIdentificationList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **caseInsensitiveMatching** | **Boolean**|  | [optional] |
| **enrollmentFlow** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **passwordStage** | **UUID**|  | [optional] |
| **passwordlessFlow** | **UUID**|  | [optional] |
| **recoveryFlow** | **UUID**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **showMatchedUser** | **Boolean**|  | [optional] |
| **showSourceLabels** | **Boolean**|  | [optional] |

### Return type

[**PaginatedIdentificationStageList**](PaginatedIdentificationStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesIdentificationPartialUpdate"></a>
# **stagesIdentificationPartialUpdate**
> IdentificationStage stagesIdentificationPartialUpdate(stageUuid, patchedIdentificationStageRequest)



IdentificationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Identification Stage.
    PatchedIdentificationStageRequest patchedIdentificationStageRequest = new PatchedIdentificationStageRequest(); // PatchedIdentificationStageRequest | 
    try {
      IdentificationStage result = apiInstance.stagesIdentificationPartialUpdate(stageUuid, patchedIdentificationStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesIdentificationPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Identification Stage. | |
| **patchedIdentificationStageRequest** | [**PatchedIdentificationStageRequest**](PatchedIdentificationStageRequest.md)|  | [optional] |

### Return type

[**IdentificationStage**](IdentificationStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesIdentificationRetrieve"></a>
# **stagesIdentificationRetrieve**
> IdentificationStage stagesIdentificationRetrieve(stageUuid)



IdentificationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Identification Stage.
    try {
      IdentificationStage result = apiInstance.stagesIdentificationRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesIdentificationRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Identification Stage. | |

### Return type

[**IdentificationStage**](IdentificationStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesIdentificationUpdate"></a>
# **stagesIdentificationUpdate**
> IdentificationStage stagesIdentificationUpdate(stageUuid, identificationStageRequest)



IdentificationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Identification Stage.
    IdentificationStageRequest identificationStageRequest = new IdentificationStageRequest(); // IdentificationStageRequest | 
    try {
      IdentificationStage result = apiInstance.stagesIdentificationUpdate(stageUuid, identificationStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesIdentificationUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Identification Stage. | |
| **identificationStageRequest** | [**IdentificationStageRequest**](IdentificationStageRequest.md)|  | |

### Return type

[**IdentificationStage**](IdentificationStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesIdentificationUsedByList"></a>
# **stagesIdentificationUsedByList**
> List&lt;UsedBy&gt; stagesIdentificationUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Identification Stage.
    try {
      List<UsedBy> result = apiInstance.stagesIdentificationUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesIdentificationUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Identification Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationInvitationsCreate"></a>
# **stagesInvitationInvitationsCreate**
> Invitation stagesInvitationInvitationsCreate(invitationRequest)



Invitation Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    InvitationRequest invitationRequest = new InvitationRequest(); // InvitationRequest | 
    try {
      Invitation result = apiInstance.stagesInvitationInvitationsCreate(invitationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationInvitationsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invitationRequest** | [**InvitationRequest**](InvitationRequest.md)|  | |

### Return type

[**Invitation**](Invitation.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationInvitationsDestroy"></a>
# **stagesInvitationInvitationsDestroy**
> stagesInvitationInvitationsDestroy(inviteUuid)



Invitation Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID inviteUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation.
    try {
      apiInstance.stagesInvitationInvitationsDestroy(inviteUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationInvitationsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteUuid** | **UUID**| A UUID string identifying this Invitation. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationInvitationsList"></a>
# **stagesInvitationInvitationsList**
> PaginatedInvitationList stagesInvitationInvitationsList(createdByUsername, expires, flowSlug, name, ordering, page, pageSize, search)



Invitation Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String createdByUsername = "createdByUsername_example"; // String | 
    OffsetDateTime expires = OffsetDateTime.now(); // OffsetDateTime | 
    String flowSlug = "flowSlug_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedInvitationList result = apiInstance.stagesInvitationInvitationsList(createdByUsername, expires, flowSlug, name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationInvitationsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createdByUsername** | **String**|  | [optional] |
| **expires** | **OffsetDateTime**|  | [optional] |
| **flowSlug** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedInvitationList**](PaginatedInvitationList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationInvitationsPartialUpdate"></a>
# **stagesInvitationInvitationsPartialUpdate**
> Invitation stagesInvitationInvitationsPartialUpdate(inviteUuid, patchedInvitationRequest)



Invitation Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID inviteUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation.
    PatchedInvitationRequest patchedInvitationRequest = new PatchedInvitationRequest(); // PatchedInvitationRequest | 
    try {
      Invitation result = apiInstance.stagesInvitationInvitationsPartialUpdate(inviteUuid, patchedInvitationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationInvitationsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteUuid** | **UUID**| A UUID string identifying this Invitation. | |
| **patchedInvitationRequest** | [**PatchedInvitationRequest**](PatchedInvitationRequest.md)|  | [optional] |

### Return type

[**Invitation**](Invitation.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationInvitationsRetrieve"></a>
# **stagesInvitationInvitationsRetrieve**
> Invitation stagesInvitationInvitationsRetrieve(inviteUuid)



Invitation Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID inviteUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation.
    try {
      Invitation result = apiInstance.stagesInvitationInvitationsRetrieve(inviteUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationInvitationsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteUuid** | **UUID**| A UUID string identifying this Invitation. | |

### Return type

[**Invitation**](Invitation.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationInvitationsUpdate"></a>
# **stagesInvitationInvitationsUpdate**
> Invitation stagesInvitationInvitationsUpdate(inviteUuid, invitationRequest)



Invitation Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID inviteUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation.
    InvitationRequest invitationRequest = new InvitationRequest(); // InvitationRequest | 
    try {
      Invitation result = apiInstance.stagesInvitationInvitationsUpdate(inviteUuid, invitationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationInvitationsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteUuid** | **UUID**| A UUID string identifying this Invitation. | |
| **invitationRequest** | [**InvitationRequest**](InvitationRequest.md)|  | |

### Return type

[**Invitation**](Invitation.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationInvitationsUsedByList"></a>
# **stagesInvitationInvitationsUsedByList**
> List&lt;UsedBy&gt; stagesInvitationInvitationsUsedByList(inviteUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID inviteUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation.
    try {
      List<UsedBy> result = apiInstance.stagesInvitationInvitationsUsedByList(inviteUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationInvitationsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteUuid** | **UUID**| A UUID string identifying this Invitation. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationStagesCreate"></a>
# **stagesInvitationStagesCreate**
> InvitationStage stagesInvitationStagesCreate(invitationStageRequest)



InvitationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    InvitationStageRequest invitationStageRequest = new InvitationStageRequest(); // InvitationStageRequest | 
    try {
      InvitationStage result = apiInstance.stagesInvitationStagesCreate(invitationStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationStagesCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invitationStageRequest** | [**InvitationStageRequest**](InvitationStageRequest.md)|  | |

### Return type

[**InvitationStage**](InvitationStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationStagesDestroy"></a>
# **stagesInvitationStagesDestroy**
> stagesInvitationStagesDestroy(stageUuid)



InvitationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation Stage.
    try {
      apiInstance.stagesInvitationStagesDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationStagesDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Invitation Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationStagesList"></a>
# **stagesInvitationStagesList**
> PaginatedInvitationStageList stagesInvitationStagesList(continueFlowWithoutInvitation, name, noFlows, ordering, page, pageSize, search, stageUuid)



InvitationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    Boolean continueFlowWithoutInvitation = true; // Boolean | 
    String name = "name_example"; // String | 
    Boolean noFlows = true; // Boolean | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    try {
      PaginatedInvitationStageList result = apiInstance.stagesInvitationStagesList(continueFlowWithoutInvitation, name, noFlows, ordering, page, pageSize, search, stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationStagesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **continueFlowWithoutInvitation** | **Boolean**|  | [optional] |
| **name** | **String**|  | [optional] |
| **noFlows** | **Boolean**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |

### Return type

[**PaginatedInvitationStageList**](PaginatedInvitationStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationStagesPartialUpdate"></a>
# **stagesInvitationStagesPartialUpdate**
> InvitationStage stagesInvitationStagesPartialUpdate(stageUuid, patchedInvitationStageRequest)



InvitationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation Stage.
    PatchedInvitationStageRequest patchedInvitationStageRequest = new PatchedInvitationStageRequest(); // PatchedInvitationStageRequest | 
    try {
      InvitationStage result = apiInstance.stagesInvitationStagesPartialUpdate(stageUuid, patchedInvitationStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationStagesPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Invitation Stage. | |
| **patchedInvitationStageRequest** | [**PatchedInvitationStageRequest**](PatchedInvitationStageRequest.md)|  | [optional] |

### Return type

[**InvitationStage**](InvitationStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationStagesRetrieve"></a>
# **stagesInvitationStagesRetrieve**
> InvitationStage stagesInvitationStagesRetrieve(stageUuid)



InvitationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation Stage.
    try {
      InvitationStage result = apiInstance.stagesInvitationStagesRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationStagesRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Invitation Stage. | |

### Return type

[**InvitationStage**](InvitationStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationStagesUpdate"></a>
# **stagesInvitationStagesUpdate**
> InvitationStage stagesInvitationStagesUpdate(stageUuid, invitationStageRequest)



InvitationStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation Stage.
    InvitationStageRequest invitationStageRequest = new InvitationStageRequest(); // InvitationStageRequest | 
    try {
      InvitationStage result = apiInstance.stagesInvitationStagesUpdate(stageUuid, invitationStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationStagesUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Invitation Stage. | |
| **invitationStageRequest** | [**InvitationStageRequest**](InvitationStageRequest.md)|  | |

### Return type

[**InvitationStage**](InvitationStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesInvitationStagesUsedByList"></a>
# **stagesInvitationStagesUsedByList**
> List&lt;UsedBy&gt; stagesInvitationStagesUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Invitation Stage.
    try {
      List<UsedBy> result = apiInstance.stagesInvitationStagesUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesInvitationStagesUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Invitation Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPasswordCreate"></a>
# **stagesPasswordCreate**
> PasswordStage stagesPasswordCreate(passwordStageRequest)



PasswordStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    PasswordStageRequest passwordStageRequest = new PasswordStageRequest(); // PasswordStageRequest | 
    try {
      PasswordStage result = apiInstance.stagesPasswordCreate(passwordStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPasswordCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **passwordStageRequest** | [**PasswordStageRequest**](PasswordStageRequest.md)|  | |

### Return type

[**PasswordStage**](PasswordStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPasswordDestroy"></a>
# **stagesPasswordDestroy**
> stagesPasswordDestroy(stageUuid)



PasswordStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Stage.
    try {
      apiInstance.stagesPasswordDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPasswordDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Password Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPasswordList"></a>
# **stagesPasswordList**
> PaginatedPasswordStageList stagesPasswordList(configureFlow, failedAttemptsBeforeCancel, name, ordering, page, pageSize, search)



PasswordStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID configureFlow = UUID.randomUUID(); // UUID | 
    Integer failedAttemptsBeforeCancel = 56; // Integer | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    try {
      PaginatedPasswordStageList result = apiInstance.stagesPasswordList(configureFlow, failedAttemptsBeforeCancel, name, ordering, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPasswordList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **configureFlow** | **UUID**|  | [optional] |
| **failedAttemptsBeforeCancel** | **Integer**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |

### Return type

[**PaginatedPasswordStageList**](PaginatedPasswordStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPasswordPartialUpdate"></a>
# **stagesPasswordPartialUpdate**
> PasswordStage stagesPasswordPartialUpdate(stageUuid, patchedPasswordStageRequest)



PasswordStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Stage.
    PatchedPasswordStageRequest patchedPasswordStageRequest = new PatchedPasswordStageRequest(); // PatchedPasswordStageRequest | 
    try {
      PasswordStage result = apiInstance.stagesPasswordPartialUpdate(stageUuid, patchedPasswordStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPasswordPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Password Stage. | |
| **patchedPasswordStageRequest** | [**PatchedPasswordStageRequest**](PatchedPasswordStageRequest.md)|  | [optional] |

### Return type

[**PasswordStage**](PasswordStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPasswordRetrieve"></a>
# **stagesPasswordRetrieve**
> PasswordStage stagesPasswordRetrieve(stageUuid)



PasswordStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Stage.
    try {
      PasswordStage result = apiInstance.stagesPasswordRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPasswordRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Password Stage. | |

### Return type

[**PasswordStage**](PasswordStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPasswordUpdate"></a>
# **stagesPasswordUpdate**
> PasswordStage stagesPasswordUpdate(stageUuid, passwordStageRequest)



PasswordStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Stage.
    PasswordStageRequest passwordStageRequest = new PasswordStageRequest(); // PasswordStageRequest | 
    try {
      PasswordStage result = apiInstance.stagesPasswordUpdate(stageUuid, passwordStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPasswordUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Password Stage. | |
| **passwordStageRequest** | [**PasswordStageRequest**](PasswordStageRequest.md)|  | |

### Return type

[**PasswordStage**](PasswordStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPasswordUsedByList"></a>
# **stagesPasswordUsedByList**
> List&lt;UsedBy&gt; stagesPasswordUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Password Stage.
    try {
      List<UsedBy> result = apiInstance.stagesPasswordUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPasswordUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Password Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptPromptsCreate"></a>
# **stagesPromptPromptsCreate**
> Prompt stagesPromptPromptsCreate(promptRequest)



Prompt Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    PromptRequest promptRequest = new PromptRequest(); // PromptRequest | 
    try {
      Prompt result = apiInstance.stagesPromptPromptsCreate(promptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptPromptsCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promptRequest** | [**PromptRequest**](PromptRequest.md)|  | |

### Return type

[**Prompt**](Prompt.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptPromptsDestroy"></a>
# **stagesPromptPromptsDestroy**
> stagesPromptPromptsDestroy(promptUuid)



Prompt Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID promptUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt.
    try {
      apiInstance.stagesPromptPromptsDestroy(promptUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptPromptsDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promptUuid** | **UUID**| A UUID string identifying this Prompt. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptPromptsList"></a>
# **stagesPromptPromptsList**
> PaginatedPromptList stagesPromptPromptsList(fieldKey, label, name, ordering, page, pageSize, placeholder, search, type)



Prompt Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String fieldKey = "fieldKey_example"; // String | 
    String label = "label_example"; // String | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String placeholder = "placeholder_example"; // String | 
    String search = "search_example"; // String | A search term.
    String type = "ak-locale"; // String | 
    try {
      PaginatedPromptList result = apiInstance.stagesPromptPromptsList(fieldKey, label, name, ordering, page, pageSize, placeholder, search, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptPromptsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fieldKey** | **String**|  | [optional] |
| **label** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **placeholder** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **type** | **String**|  | [optional] [enum: ak-locale, checkbox, date, date-time, dropdown, email, file, hidden, number, password, radio-button-group, separator, static, text, text_area, text_area_read_only, text_read_only, username] |

### Return type

[**PaginatedPromptList**](PaginatedPromptList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptPromptsPartialUpdate"></a>
# **stagesPromptPromptsPartialUpdate**
> Prompt stagesPromptPromptsPartialUpdate(promptUuid, patchedPromptRequest)



Prompt Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID promptUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt.
    PatchedPromptRequest patchedPromptRequest = new PatchedPromptRequest(); // PatchedPromptRequest | 
    try {
      Prompt result = apiInstance.stagesPromptPromptsPartialUpdate(promptUuid, patchedPromptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptPromptsPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promptUuid** | **UUID**| A UUID string identifying this Prompt. | |
| **patchedPromptRequest** | [**PatchedPromptRequest**](PatchedPromptRequest.md)|  | [optional] |

### Return type

[**Prompt**](Prompt.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptPromptsPreviewCreate"></a>
# **stagesPromptPromptsPreviewCreate**
> PromptChallenge stagesPromptPromptsPreviewCreate(promptRequest)



Preview a prompt as a challenge, just like a flow would receive

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    PromptRequest promptRequest = new PromptRequest(); // PromptRequest | 
    try {
      PromptChallenge result = apiInstance.stagesPromptPromptsPreviewCreate(promptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptPromptsPreviewCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promptRequest** | [**PromptRequest**](PromptRequest.md)|  | |

### Return type

[**PromptChallenge**](PromptChallenge.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptPromptsRetrieve"></a>
# **stagesPromptPromptsRetrieve**
> Prompt stagesPromptPromptsRetrieve(promptUuid)



Prompt Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID promptUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt.
    try {
      Prompt result = apiInstance.stagesPromptPromptsRetrieve(promptUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptPromptsRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promptUuid** | **UUID**| A UUID string identifying this Prompt. | |

### Return type

[**Prompt**](Prompt.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptPromptsUpdate"></a>
# **stagesPromptPromptsUpdate**
> Prompt stagesPromptPromptsUpdate(promptUuid, promptRequest)



Prompt Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID promptUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt.
    PromptRequest promptRequest = new PromptRequest(); // PromptRequest | 
    try {
      Prompt result = apiInstance.stagesPromptPromptsUpdate(promptUuid, promptRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptPromptsUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promptUuid** | **UUID**| A UUID string identifying this Prompt. | |
| **promptRequest** | [**PromptRequest**](PromptRequest.md)|  | |

### Return type

[**Prompt**](Prompt.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptPromptsUsedByList"></a>
# **stagesPromptPromptsUsedByList**
> List&lt;UsedBy&gt; stagesPromptPromptsUsedByList(promptUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID promptUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt.
    try {
      List<UsedBy> result = apiInstance.stagesPromptPromptsUsedByList(promptUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptPromptsUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promptUuid** | **UUID**| A UUID string identifying this Prompt. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptStagesCreate"></a>
# **stagesPromptStagesCreate**
> PromptStage stagesPromptStagesCreate(promptStageRequest)



PromptStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    PromptStageRequest promptStageRequest = new PromptStageRequest(); // PromptStageRequest | 
    try {
      PromptStage result = apiInstance.stagesPromptStagesCreate(promptStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptStagesCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promptStageRequest** | [**PromptStageRequest**](PromptStageRequest.md)|  | |

### Return type

[**PromptStage**](PromptStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptStagesDestroy"></a>
# **stagesPromptStagesDestroy**
> stagesPromptStagesDestroy(stageUuid)



PromptStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt Stage.
    try {
      apiInstance.stagesPromptStagesDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptStagesDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Prompt Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptStagesList"></a>
# **stagesPromptStagesList**
> PaginatedPromptStageList stagesPromptStagesList(fields, name, ordering, page, pageSize, search, stageUuid, validationPolicies)



PromptStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    List<UUID> fields = Arrays.asList(); // List<UUID> | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    List<UUID> validationPolicies = Arrays.asList(); // List<UUID> | 
    try {
      PaginatedPromptStageList result = apiInstance.stagesPromptStagesList(fields, name, ordering, page, pageSize, search, stageUuid, validationPolicies);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptStagesList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fields** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |
| **validationPolicies** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional] |

### Return type

[**PaginatedPromptStageList**](PaginatedPromptStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptStagesPartialUpdate"></a>
# **stagesPromptStagesPartialUpdate**
> PromptStage stagesPromptStagesPartialUpdate(stageUuid, patchedPromptStageRequest)



PromptStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt Stage.
    PatchedPromptStageRequest patchedPromptStageRequest = new PatchedPromptStageRequest(); // PatchedPromptStageRequest | 
    try {
      PromptStage result = apiInstance.stagesPromptStagesPartialUpdate(stageUuid, patchedPromptStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptStagesPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Prompt Stage. | |
| **patchedPromptStageRequest** | [**PatchedPromptStageRequest**](PatchedPromptStageRequest.md)|  | [optional] |

### Return type

[**PromptStage**](PromptStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptStagesRetrieve"></a>
# **stagesPromptStagesRetrieve**
> PromptStage stagesPromptStagesRetrieve(stageUuid)



PromptStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt Stage.
    try {
      PromptStage result = apiInstance.stagesPromptStagesRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptStagesRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Prompt Stage. | |

### Return type

[**PromptStage**](PromptStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptStagesUpdate"></a>
# **stagesPromptStagesUpdate**
> PromptStage stagesPromptStagesUpdate(stageUuid, promptStageRequest)



PromptStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt Stage.
    PromptStageRequest promptStageRequest = new PromptStageRequest(); // PromptStageRequest | 
    try {
      PromptStage result = apiInstance.stagesPromptStagesUpdate(stageUuid, promptStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptStagesUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Prompt Stage. | |
| **promptStageRequest** | [**PromptStageRequest**](PromptStageRequest.md)|  | |

### Return type

[**PromptStage**](PromptStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesPromptStagesUsedByList"></a>
# **stagesPromptStagesUsedByList**
> List&lt;UsedBy&gt; stagesPromptStagesUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Prompt Stage.
    try {
      List<UsedBy> result = apiInstance.stagesPromptStagesUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesPromptStagesUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Prompt Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesSourceCreate"></a>
# **stagesSourceCreate**
> SourceStage stagesSourceCreate(sourceStageRequest)



SourceStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    SourceStageRequest sourceStageRequest = new SourceStageRequest(); // SourceStageRequest | 
    try {
      SourceStage result = apiInstance.stagesSourceCreate(sourceStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesSourceCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceStageRequest** | [**SourceStageRequest**](SourceStageRequest.md)|  | |

### Return type

[**SourceStage**](SourceStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesSourceDestroy"></a>
# **stagesSourceDestroy**
> stagesSourceDestroy(stageUuid)



SourceStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Source Stage.
    try {
      apiInstance.stagesSourceDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesSourceDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Source Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesSourceList"></a>
# **stagesSourceList**
> PaginatedSourceStageList stagesSourceList(name, ordering, page, pageSize, resumeTimeout, search, source, stageUuid)



SourceStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String resumeTimeout = "resumeTimeout_example"; // String | 
    String search = "search_example"; // String | A search term.
    UUID source = UUID.randomUUID(); // UUID | 
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    try {
      PaginatedSourceStageList result = apiInstance.stagesSourceList(name, ordering, page, pageSize, resumeTimeout, search, source, stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesSourceList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **resumeTimeout** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **source** | **UUID**|  | [optional] |
| **stageUuid** | **UUID**|  | [optional] |

### Return type

[**PaginatedSourceStageList**](PaginatedSourceStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesSourcePartialUpdate"></a>
# **stagesSourcePartialUpdate**
> SourceStage stagesSourcePartialUpdate(stageUuid, patchedSourceStageRequest)



SourceStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Source Stage.
    PatchedSourceStageRequest patchedSourceStageRequest = new PatchedSourceStageRequest(); // PatchedSourceStageRequest | 
    try {
      SourceStage result = apiInstance.stagesSourcePartialUpdate(stageUuid, patchedSourceStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesSourcePartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Source Stage. | |
| **patchedSourceStageRequest** | [**PatchedSourceStageRequest**](PatchedSourceStageRequest.md)|  | [optional] |

### Return type

[**SourceStage**](SourceStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesSourceRetrieve"></a>
# **stagesSourceRetrieve**
> SourceStage stagesSourceRetrieve(stageUuid)



SourceStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Source Stage.
    try {
      SourceStage result = apiInstance.stagesSourceRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesSourceRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Source Stage. | |

### Return type

[**SourceStage**](SourceStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesSourceUpdate"></a>
# **stagesSourceUpdate**
> SourceStage stagesSourceUpdate(stageUuid, sourceStageRequest)



SourceStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Source Stage.
    SourceStageRequest sourceStageRequest = new SourceStageRequest(); // SourceStageRequest | 
    try {
      SourceStage result = apiInstance.stagesSourceUpdate(stageUuid, sourceStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesSourceUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Source Stage. | |
| **sourceStageRequest** | [**SourceStageRequest**](SourceStageRequest.md)|  | |

### Return type

[**SourceStage**](SourceStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesSourceUsedByList"></a>
# **stagesSourceUsedByList**
> List&lt;UsedBy&gt; stagesSourceUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this Source Stage.
    try {
      List<UsedBy> result = apiInstance.stagesSourceUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesSourceUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this Source Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserDeleteCreate"></a>
# **stagesUserDeleteCreate**
> UserDeleteStage stagesUserDeleteCreate(userDeleteStageRequest)



UserDeleteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UserDeleteStageRequest userDeleteStageRequest = new UserDeleteStageRequest(); // UserDeleteStageRequest | 
    try {
      UserDeleteStage result = apiInstance.stagesUserDeleteCreate(userDeleteStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserDeleteCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userDeleteStageRequest** | [**UserDeleteStageRequest**](UserDeleteStageRequest.md)|  | |

### Return type

[**UserDeleteStage**](UserDeleteStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserDeleteDestroy"></a>
# **stagesUserDeleteDestroy**
> stagesUserDeleteDestroy(stageUuid)



UserDeleteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Delete Stage.
    try {
      apiInstance.stagesUserDeleteDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserDeleteDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Delete Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserDeleteList"></a>
# **stagesUserDeleteList**
> PaginatedUserDeleteStageList stagesUserDeleteList(name, ordering, page, pageSize, search, stageUuid)



UserDeleteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    try {
      PaginatedUserDeleteStageList result = apiInstance.stagesUserDeleteList(name, ordering, page, pageSize, search, stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserDeleteList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |

### Return type

[**PaginatedUserDeleteStageList**](PaginatedUserDeleteStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserDeletePartialUpdate"></a>
# **stagesUserDeletePartialUpdate**
> UserDeleteStage stagesUserDeletePartialUpdate(stageUuid, patchedUserDeleteStageRequest)



UserDeleteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Delete Stage.
    PatchedUserDeleteStageRequest patchedUserDeleteStageRequest = new PatchedUserDeleteStageRequest(); // PatchedUserDeleteStageRequest | 
    try {
      UserDeleteStage result = apiInstance.stagesUserDeletePartialUpdate(stageUuid, patchedUserDeleteStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserDeletePartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Delete Stage. | |
| **patchedUserDeleteStageRequest** | [**PatchedUserDeleteStageRequest**](PatchedUserDeleteStageRequest.md)|  | [optional] |

### Return type

[**UserDeleteStage**](UserDeleteStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserDeleteRetrieve"></a>
# **stagesUserDeleteRetrieve**
> UserDeleteStage stagesUserDeleteRetrieve(stageUuid)



UserDeleteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Delete Stage.
    try {
      UserDeleteStage result = apiInstance.stagesUserDeleteRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserDeleteRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Delete Stage. | |

### Return type

[**UserDeleteStage**](UserDeleteStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserDeleteUpdate"></a>
# **stagesUserDeleteUpdate**
> UserDeleteStage stagesUserDeleteUpdate(stageUuid, userDeleteStageRequest)



UserDeleteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Delete Stage.
    UserDeleteStageRequest userDeleteStageRequest = new UserDeleteStageRequest(); // UserDeleteStageRequest | 
    try {
      UserDeleteStage result = apiInstance.stagesUserDeleteUpdate(stageUuid, userDeleteStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserDeleteUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Delete Stage. | |
| **userDeleteStageRequest** | [**UserDeleteStageRequest**](UserDeleteStageRequest.md)|  | |

### Return type

[**UserDeleteStage**](UserDeleteStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserDeleteUsedByList"></a>
# **stagesUserDeleteUsedByList**
> List&lt;UsedBy&gt; stagesUserDeleteUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Delete Stage.
    try {
      List<UsedBy> result = apiInstance.stagesUserDeleteUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserDeleteUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Delete Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLoginCreate"></a>
# **stagesUserLoginCreate**
> UserLoginStage stagesUserLoginCreate(userLoginStageRequest)



UserLoginStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UserLoginStageRequest userLoginStageRequest = new UserLoginStageRequest(); // UserLoginStageRequest | 
    try {
      UserLoginStage result = apiInstance.stagesUserLoginCreate(userLoginStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLoginCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userLoginStageRequest** | [**UserLoginStageRequest**](UserLoginStageRequest.md)|  | |

### Return type

[**UserLoginStage**](UserLoginStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLoginDestroy"></a>
# **stagesUserLoginDestroy**
> stagesUserLoginDestroy(stageUuid)



UserLoginStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Login Stage.
    try {
      apiInstance.stagesUserLoginDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLoginDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Login Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLoginList"></a>
# **stagesUserLoginList**
> PaginatedUserLoginStageList stagesUserLoginList(geoipBinding, name, networkBinding, ordering, page, pageSize, rememberMeOffset, search, sessionDuration, stageUuid, terminateOtherSessions)



UserLoginStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String geoipBinding = "bind_continent"; // String | Bind sessions created by this stage to the configured GeoIP location  
    String name = "name_example"; // String | 
    String networkBinding = "bind_asn"; // String | Bind sessions created by this stage to the configured network  
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String rememberMeOffset = "rememberMeOffset_example"; // String | 
    String search = "search_example"; // String | A search term.
    String sessionDuration = "sessionDuration_example"; // String | 
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    Boolean terminateOtherSessions = true; // Boolean | 
    try {
      PaginatedUserLoginStageList result = apiInstance.stagesUserLoginList(geoipBinding, name, networkBinding, ordering, page, pageSize, rememberMeOffset, search, sessionDuration, stageUuid, terminateOtherSessions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLoginList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **geoipBinding** | **String**| Bind sessions created by this stage to the configured GeoIP location   | [optional] [enum: bind_continent, bind_continent_country, bind_continent_country_city, no_binding] |
| **name** | **String**|  | [optional] |
| **networkBinding** | **String**| Bind sessions created by this stage to the configured network   | [optional] [enum: bind_asn, bind_asn_network, bind_asn_network_ip, no_binding] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **rememberMeOffset** | **String**|  | [optional] |
| **search** | **String**| A search term. | [optional] |
| **sessionDuration** | **String**|  | [optional] |
| **stageUuid** | **UUID**|  | [optional] |
| **terminateOtherSessions** | **Boolean**|  | [optional] |

### Return type

[**PaginatedUserLoginStageList**](PaginatedUserLoginStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLoginPartialUpdate"></a>
# **stagesUserLoginPartialUpdate**
> UserLoginStage stagesUserLoginPartialUpdate(stageUuid, patchedUserLoginStageRequest)



UserLoginStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Login Stage.
    PatchedUserLoginStageRequest patchedUserLoginStageRequest = new PatchedUserLoginStageRequest(); // PatchedUserLoginStageRequest | 
    try {
      UserLoginStage result = apiInstance.stagesUserLoginPartialUpdate(stageUuid, patchedUserLoginStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLoginPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Login Stage. | |
| **patchedUserLoginStageRequest** | [**PatchedUserLoginStageRequest**](PatchedUserLoginStageRequest.md)|  | [optional] |

### Return type

[**UserLoginStage**](UserLoginStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLoginRetrieve"></a>
# **stagesUserLoginRetrieve**
> UserLoginStage stagesUserLoginRetrieve(stageUuid)



UserLoginStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Login Stage.
    try {
      UserLoginStage result = apiInstance.stagesUserLoginRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLoginRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Login Stage. | |

### Return type

[**UserLoginStage**](UserLoginStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLoginUpdate"></a>
# **stagesUserLoginUpdate**
> UserLoginStage stagesUserLoginUpdate(stageUuid, userLoginStageRequest)



UserLoginStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Login Stage.
    UserLoginStageRequest userLoginStageRequest = new UserLoginStageRequest(); // UserLoginStageRequest | 
    try {
      UserLoginStage result = apiInstance.stagesUserLoginUpdate(stageUuid, userLoginStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLoginUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Login Stage. | |
| **userLoginStageRequest** | [**UserLoginStageRequest**](UserLoginStageRequest.md)|  | |

### Return type

[**UserLoginStage**](UserLoginStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLoginUsedByList"></a>
# **stagesUserLoginUsedByList**
> List&lt;UsedBy&gt; stagesUserLoginUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Login Stage.
    try {
      List<UsedBy> result = apiInstance.stagesUserLoginUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLoginUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Login Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLogoutCreate"></a>
# **stagesUserLogoutCreate**
> UserLogoutStage stagesUserLogoutCreate(userLogoutStageRequest)



UserLogoutStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UserLogoutStageRequest userLogoutStageRequest = new UserLogoutStageRequest(); // UserLogoutStageRequest | 
    try {
      UserLogoutStage result = apiInstance.stagesUserLogoutCreate(userLogoutStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLogoutCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userLogoutStageRequest** | [**UserLogoutStageRequest**](UserLogoutStageRequest.md)|  | |

### Return type

[**UserLogoutStage**](UserLogoutStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLogoutDestroy"></a>
# **stagesUserLogoutDestroy**
> stagesUserLogoutDestroy(stageUuid)



UserLogoutStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Logout Stage.
    try {
      apiInstance.stagesUserLogoutDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLogoutDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Logout Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLogoutList"></a>
# **stagesUserLogoutList**
> PaginatedUserLogoutStageList stagesUserLogoutList(name, ordering, page, pageSize, search, stageUuid)



UserLogoutStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    try {
      PaginatedUserLogoutStageList result = apiInstance.stagesUserLogoutList(name, ordering, page, pageSize, search, stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLogoutList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |

### Return type

[**PaginatedUserLogoutStageList**](PaginatedUserLogoutStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLogoutPartialUpdate"></a>
# **stagesUserLogoutPartialUpdate**
> UserLogoutStage stagesUserLogoutPartialUpdate(stageUuid, patchedUserLogoutStageRequest)



UserLogoutStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Logout Stage.
    PatchedUserLogoutStageRequest patchedUserLogoutStageRequest = new PatchedUserLogoutStageRequest(); // PatchedUserLogoutStageRequest | 
    try {
      UserLogoutStage result = apiInstance.stagesUserLogoutPartialUpdate(stageUuid, patchedUserLogoutStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLogoutPartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Logout Stage. | |
| **patchedUserLogoutStageRequest** | [**PatchedUserLogoutStageRequest**](PatchedUserLogoutStageRequest.md)|  | [optional] |

### Return type

[**UserLogoutStage**](UserLogoutStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLogoutRetrieve"></a>
# **stagesUserLogoutRetrieve**
> UserLogoutStage stagesUserLogoutRetrieve(stageUuid)



UserLogoutStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Logout Stage.
    try {
      UserLogoutStage result = apiInstance.stagesUserLogoutRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLogoutRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Logout Stage. | |

### Return type

[**UserLogoutStage**](UserLogoutStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLogoutUpdate"></a>
# **stagesUserLogoutUpdate**
> UserLogoutStage stagesUserLogoutUpdate(stageUuid, userLogoutStageRequest)



UserLogoutStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Logout Stage.
    UserLogoutStageRequest userLogoutStageRequest = new UserLogoutStageRequest(); // UserLogoutStageRequest | 
    try {
      UserLogoutStage result = apiInstance.stagesUserLogoutUpdate(stageUuid, userLogoutStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLogoutUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Logout Stage. | |
| **userLogoutStageRequest** | [**UserLogoutStageRequest**](UserLogoutStageRequest.md)|  | |

### Return type

[**UserLogoutStage**](UserLogoutStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserLogoutUsedByList"></a>
# **stagesUserLogoutUsedByList**
> List&lt;UsedBy&gt; stagesUserLogoutUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Logout Stage.
    try {
      List<UsedBy> result = apiInstance.stagesUserLogoutUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserLogoutUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Logout Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserWriteCreate"></a>
# **stagesUserWriteCreate**
> UserWriteStage stagesUserWriteCreate(userWriteStageRequest)



UserWriteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UserWriteStageRequest userWriteStageRequest = new UserWriteStageRequest(); // UserWriteStageRequest | 
    try {
      UserWriteStage result = apiInstance.stagesUserWriteCreate(userWriteStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserWriteCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userWriteStageRequest** | [**UserWriteStageRequest**](UserWriteStageRequest.md)|  | |

### Return type

[**UserWriteStage**](UserWriteStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserWriteDestroy"></a>
# **stagesUserWriteDestroy**
> stagesUserWriteDestroy(stageUuid)



UserWriteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Write Stage.
    try {
      apiInstance.stagesUserWriteDestroy(stageUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserWriteDestroy");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Write Stage. | |

### Return type

null (empty response body)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserWriteList"></a>
# **stagesUserWriteList**
> PaginatedUserWriteStageList stagesUserWriteList(createUsersAsInactive, createUsersGroup, name, ordering, page, pageSize, search, stageUuid, userCreationMode, userPathTemplate, userType)



UserWriteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    Boolean createUsersAsInactive = true; // Boolean | 
    UUID createUsersGroup = UUID.randomUUID(); // UUID | 
    String name = "name_example"; // String | 
    String ordering = "ordering_example"; // String | Which field to use when ordering the results.
    Integer page = 56; // Integer | A page number within the paginated result set.
    Integer pageSize = 56; // Integer | Number of results to return per page.
    String search = "search_example"; // String | A search term.
    UUID stageUuid = UUID.randomUUID(); // UUID | 
    String userCreationMode = "always_create"; // String | 
    String userPathTemplate = "userPathTemplate_example"; // String | 
    String userType = "external"; // String | 
    try {
      PaginatedUserWriteStageList result = apiInstance.stagesUserWriteList(createUsersAsInactive, createUsersGroup, name, ordering, page, pageSize, search, stageUuid, userCreationMode, userPathTemplate, userType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserWriteList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createUsersAsInactive** | **Boolean**|  | [optional] |
| **createUsersGroup** | **UUID**|  | [optional] |
| **name** | **String**|  | [optional] |
| **ordering** | **String**| Which field to use when ordering the results. | [optional] |
| **page** | **Integer**| A page number within the paginated result set. | [optional] |
| **pageSize** | **Integer**| Number of results to return per page. | [optional] |
| **search** | **String**| A search term. | [optional] |
| **stageUuid** | **UUID**|  | [optional] |
| **userCreationMode** | **String**|  | [optional] [enum: always_create, create_when_required, never_create] |
| **userPathTemplate** | **String**|  | [optional] |
| **userType** | **String**|  | [optional] [enum: external, internal, internal_service_account, service_account] |

### Return type

[**PaginatedUserWriteStageList**](PaginatedUserWriteStageList.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserWritePartialUpdate"></a>
# **stagesUserWritePartialUpdate**
> UserWriteStage stagesUserWritePartialUpdate(stageUuid, patchedUserWriteStageRequest)



UserWriteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Write Stage.
    PatchedUserWriteStageRequest patchedUserWriteStageRequest = new PatchedUserWriteStageRequest(); // PatchedUserWriteStageRequest | 
    try {
      UserWriteStage result = apiInstance.stagesUserWritePartialUpdate(stageUuid, patchedUserWriteStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserWritePartialUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Write Stage. | |
| **patchedUserWriteStageRequest** | [**PatchedUserWriteStageRequest**](PatchedUserWriteStageRequest.md)|  | [optional] |

### Return type

[**UserWriteStage**](UserWriteStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserWriteRetrieve"></a>
# **stagesUserWriteRetrieve**
> UserWriteStage stagesUserWriteRetrieve(stageUuid)



UserWriteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Write Stage.
    try {
      UserWriteStage result = apiInstance.stagesUserWriteRetrieve(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserWriteRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Write Stage. | |

### Return type

[**UserWriteStage**](UserWriteStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserWriteUpdate"></a>
# **stagesUserWriteUpdate**
> UserWriteStage stagesUserWriteUpdate(stageUuid, userWriteStageRequest)



UserWriteStage Viewset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Write Stage.
    UserWriteStageRequest userWriteStageRequest = new UserWriteStageRequest(); // UserWriteStageRequest | 
    try {
      UserWriteStage result = apiInstance.stagesUserWriteUpdate(stageUuid, userWriteStageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserWriteUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Write Stage. | |
| **userWriteStageRequest** | [**UserWriteStageRequest**](UserWriteStageRequest.md)|  | |

### Return type

[**UserWriteStage**](UserWriteStage.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

<a id="stagesUserWriteUsedByList"></a>
# **stagesUserWriteUsedByList**
> List&lt;UsedBy&gt; stagesUserWriteUsedByList(stageUuid)



Get a list of all objects that use this object

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v3");
    
    // Configure HTTP bearer authorization: authentik
    HttpBearerAuth authentik = (HttpBearerAuth) defaultClient.getAuthentication("authentik");
    authentik.setBearerToken("BEARER TOKEN");

    StagesApi apiInstance = new StagesApi(defaultClient);
    UUID stageUuid = UUID.randomUUID(); // UUID | A UUID string identifying this User Write Stage.
    try {
      List<UsedBy> result = apiInstance.stagesUserWriteUsedByList(stageUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StagesApi#stagesUserWriteUsedByList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stageUuid** | **UUID**| A UUID string identifying this User Write Stage. | |

### Return type

[**List&lt;UsedBy&gt;**](UsedBy.md)

### Authorization

[authentik](../README.md#authentik)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

