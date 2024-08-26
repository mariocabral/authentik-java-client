

# OAuthSourceRequest

OAuth Source Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Source&#39;s display Name. |  |
|**slug** | **String** | Internal source name, used in URLs. |  |
|**enabled** | **Boolean** |  |  [optional] |
|**authenticationFlow** | **UUID** | Flow to use when authenticating existing users. |  [optional] |
|**enrollmentFlow** | **UUID** | Flow to use when enrolling new users. |  [optional] |
|**policyEngineMode** | **PolicyEngineMode** |  |  [optional] |
|**userMatchingMode** | **UserMatchingModeEnum** | How the source determines if an existing user should be authenticated or a new user enrolled. |  [optional] |
|**userPathTemplate** | **String** |  |  [optional] |
|**providerType** | **ProviderTypeEnum** |  |  |
|**requestTokenUrl** | **String** | URL used to request the initial token. This URL is only required for OAuth 1. |  [optional] |
|**authorizationUrl** | **String** | URL the user is redirect to to conest the flow. |  [optional] |
|**accessTokenUrl** | **String** | URL used by authentik to retrieve tokens. |  [optional] |
|**profileUrl** | **String** | URL used by authentik to get user information. |  [optional] |
|**consumerKey** | **String** |  |  |
|**consumerSecret** | **String** |  |  |
|**additionalScopes** | **String** |  |  [optional] |
|**oidcWellKnownUrl** | **String** |  |  [optional] |
|**oidcJwksUrl** | **String** |  |  [optional] |
|**oidcJwks** | **Object** |  |  [optional] |



