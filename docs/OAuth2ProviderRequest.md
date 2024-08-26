

# OAuth2ProviderRequest

OAuth2Provider Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**authenticationFlow** | **UUID** | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional] |
|**authorizationFlow** | **UUID** | Flow used when authorizing this provider. |  |
|**propertyMappings** | **List&lt;UUID&gt;** |  |  [optional] |
|**clientType** | **ClientTypeEnum** | Confidential clients are capable of maintaining the confidentiality of their credentials. Public clients are incapable |  [optional] |
|**clientId** | **String** |  |  [optional] |
|**clientSecret** | **String** |  |  [optional] |
|**accessCodeValidity** | **String** | Access codes not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |
|**accessTokenValidity** | **String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |
|**refreshTokenValidity** | **String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |
|**includeClaimsInIdToken** | **Boolean** | Include User claims from scopes in the id_token, for applications that don&#39;t access the userinfo endpoint. |  [optional] |
|**signingKey** | **UUID** | Key used to sign the tokens. Only required when JWT Algorithm is set to RS256. |  [optional] |
|**redirectUris** | **String** | Enter each URI on a new line. |  [optional] |
|**subMode** | **SubModeEnum** | Configure what data should be used as unique User Identifier. For most cases, the default should be fine. |  [optional] |
|**issuerMode** | **IssuerModeEnum** | Configure how the issuer field of the ID Token should be filled. |  [optional] |
|**jwksSources** | **List&lt;UUID&gt;** |  |  [optional] |



