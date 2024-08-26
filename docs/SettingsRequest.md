

# SettingsRequest

Settings Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**avatars** | **String** | Configure how authentik should show avatars for users. |  [optional] |
|**defaultUserChangeName** | **Boolean** | Enable the ability for users to change their name. |  [optional] |
|**defaultUserChangeEmail** | **Boolean** | Enable the ability for users to change their email address. |  [optional] |
|**defaultUserChangeUsername** | **Boolean** | Enable the ability for users to change their username. |  [optional] |
|**eventRetention** | **String** | Events will be deleted after this duration.(Format: weeks&#x3D;3;days&#x3D;2;hours&#x3D;3,seconds&#x3D;2). |  [optional] |
|**footerLinks** | **Object** | The option configures the footer links on the flow executor pages. |  [optional] |
|**gdprCompliance** | **Boolean** | When enabled, all the events caused by a user will be deleted upon the user&#39;s deletion. |  [optional] |
|**impersonation** | **Boolean** | Globally enable/disable impersonation. |  [optional] |
|**defaultTokenDuration** | **String** | Default token duration |  [optional] |
|**defaultTokenLength** | **Integer** | Default token length |  [optional] |



