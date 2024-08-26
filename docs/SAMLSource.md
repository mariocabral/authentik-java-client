

# SAMLSource

SAMLSource Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** | Source&#39;s display Name. |  |
|**slug** | **String** | Internal source name, used in URLs. |  |
|**enabled** | **Boolean** |  |  [optional] |
|**authenticationFlow** | **UUID** | Flow to use when authenticating existing users. |  [optional] |
|**enrollmentFlow** | **UUID** | Flow to use when enrolling new users. |  [optional] |
|**component** | **String** | Get object component so that we know how to edit the object |  [readonly] |
|**verboseName** | **String** | Return object&#39;s verbose_name |  [readonly] |
|**verboseNamePlural** | **String** | Return object&#39;s plural verbose_name |  [readonly] |
|**metaModelName** | **String** | Return internal model name |  [readonly] |
|**policyEngineMode** | **PolicyEngineMode** |  |  [optional] |
|**userMatchingMode** | **UserMatchingModeEnum** | How the source determines if an existing user should be authenticated or a new user enrolled. |  [optional] |
|**managed** | **String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [readonly] |
|**userPathTemplate** | **String** |  |  [optional] |
|**icon** | **String** |  |  [readonly] |
|**preAuthenticationFlow** | **UUID** | Flow used before authentication. |  |
|**issuer** | **String** | Also known as Entity ID. Defaults the Metadata URL. |  [optional] |
|**ssoUrl** | **URI** | URL that the initial Login request is sent to. |  |
|**sloUrl** | **URI** | Optional URL if your IDP supports Single-Logout. |  [optional] |
|**allowIdpInitiated** | **Boolean** | Allows authentication flows initiated by the IdP. This can be a security risk, as no validation of the request ID is done. |  [optional] |
|**nameIdPolicy** | **NameIdPolicyEnum** | NameID Policy sent to the IdP. Can be unset, in which case no Policy is sent. |  [optional] |
|**bindingType** | **BindingTypeEnum** |  |  [optional] |
|**verificationKp** | **UUID** | When selected, incoming assertion&#39;s Signatures will be validated against this certificate. To allow unsigned Requests, leave on default. |  [optional] |
|**signingKp** | **UUID** | Keypair used to sign outgoing Responses going to the Identity Provider. |  [optional] |
|**digestAlgorithm** | **DigestAlgorithmEnum** |  |  [optional] |
|**signatureAlgorithm** | **SignatureAlgorithmEnum** |  |  [optional] |
|**temporaryUserDeleteAfter** | **String** | Time offset when temporary users should be deleted. This only applies if your IDP uses the NameID Format &#39;transient&#39;, and the user doesn&#39;t log out manually. (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |



