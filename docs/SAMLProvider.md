

# SAMLProvider

SAMLProvider Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **Integer** |  |  [readonly] |
|**name** | **String** |  |  |
|**authenticationFlow** | **UUID** | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional] |
|**authorizationFlow** | **UUID** | Flow used when authorizing this provider. |  |
|**propertyMappings** | **List&lt;UUID&gt;** |  |  [optional] |
|**component** | **String** | Get object component so that we know how to edit the object |  [readonly] |
|**assignedApplicationSlug** | **String** | Internal application name, used in URLs. |  [readonly] |
|**assignedApplicationName** | **String** | Application&#39;s display Name. |  [readonly] |
|**assignedBackchannelApplicationSlug** | **String** | Internal application name, used in URLs. |  [readonly] |
|**assignedBackchannelApplicationName** | **String** | Application&#39;s display Name. |  [readonly] |
|**verboseName** | **String** | Return object&#39;s verbose_name |  [readonly] |
|**verboseNamePlural** | **String** | Return object&#39;s plural verbose_name |  [readonly] |
|**metaModelName** | **String** | Return internal model name |  [readonly] |
|**acsUrl** | **URI** |  |  |
|**audience** | **String** | Value of the audience restriction field of the assertion. When left empty, no audience restriction will be added. |  [optional] |
|**issuer** | **String** | Also known as EntityID |  [optional] |
|**assertionValidNotBefore** | **String** | Assertion valid not before current time + this value (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3). |  [optional] |
|**assertionValidNotOnOrAfter** | **String** | Assertion not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |
|**sessionValidNotOnOrAfter** | **String** | Session not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |
|**nameIdMapping** | **UUID** | Configure how the NameID value will be created. When left empty, the NameIDPolicy of the incoming request will be considered |  [optional] |
|**digestAlgorithm** | **DigestAlgorithmEnum** |  |  [optional] |
|**signatureAlgorithm** | **SignatureAlgorithmEnum** |  |  [optional] |
|**signingKp** | **UUID** | Keypair used to sign outgoing Responses going to the Service Provider. |  [optional] |
|**verificationKp** | **UUID** | When selected, incoming assertion&#39;s Signatures will be validated against this certificate. To allow unsigned Requests, leave on default. |  [optional] |
|**spBinding** | **SpBindingEnum** | This determines how authentik sends the response back to the Service Provider. |  [optional] |
|**defaultRelayState** | **String** | Default relay_state value for IDP-initiated logins |  [optional] |
|**urlDownloadMetadata** | **String** | Get metadata download URL |  [readonly] |
|**urlSsoPost** | **String** | Get SSO Post URL |  [readonly] |
|**urlSsoRedirect** | **String** | Get SSO Redirect URL |  [readonly] |
|**urlSsoInit** | **String** | Get SSO IDP-Initiated URL |  [readonly] |
|**urlSloPost** | **String** | Get SLO POST URL |  [readonly] |
|**urlSloRedirect** | **String** | Get SLO redirect URL |  [readonly] |



