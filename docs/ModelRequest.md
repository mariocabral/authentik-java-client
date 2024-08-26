

# ModelRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**propertyMappings** | **List&lt;UUID&gt;** |  |  [optional] |
|**propertyMappingsGroup** | **List&lt;UUID&gt;** | Property mappings used for group creation/updating. |  [optional] |
|**delegatedSubject** | **String** |  |  |
|**credentials** | **Object** |  |  |
|**scopes** | **String** |  |  [optional] |
|**excludeUsersServiceAccount** | **Boolean** |  |  [optional] |
|**filterGroup** | **UUID** |  |  [optional] |
|**userDeleteAction** | **OutgoingSyncDeleteAction** |  |  [optional] |
|**groupDeleteAction** | **OutgoingSyncDeleteAction** |  |  [optional] |
|**defaultGroupEmailDomain** | **String** |  |  |
|**authenticationFlow** | **UUID** | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional] |
|**authorizationFlow** | **UUID** | Flow used when authorizing this provider. |  |
|**baseDn** | **String** | DN under which objects are accessible. |  [optional] |
|**searchGroup** | **UUID** | Users in this group can do search queries. If not set, every user can execute search queries. |  [optional] |
|**certificate** | **UUID** |  |  [optional] |
|**tlsServerName** | **String** |  |  [optional] |
|**uidStartNumber** | **Integer** | The start for uidNumbers, this number is added to the user.pk to make sure that the numbers aren&#39;t too low for POSIX users. Default is 2000 to ensure that we don&#39;t collide with local users uidNumber |  [optional] |
|**gidStartNumber** | **Integer** | The start for gidNumbers, this number is added to a number generated from the group.pk to make sure that the numbers aren&#39;t too low for POSIX groups. Default is 4000 to ensure that we don&#39;t collide with local groups or users primary groups gidNumber |  [optional] |
|**searchMode** | **LDAPAPIAccessMode** |  |  [optional] |
|**bindMode** | **LDAPAPIAccessMode** |  |  [optional] |
|**mfaSupport** | **Boolean** | When enabled, code-based multi-factor authentication can be used by appending a semicolon and the TOTP code to the password. This should only be enabled if all users that will bind to this provider have a TOTP device configured, as otherwise a password may incorrectly be rejected if it contains a semicolon. |  [optional] |
|**clientId** | **String** |  |  |
|**clientSecret** | **String** |  |  |
|**tenantId** | **String** |  |  |
|**clientType** | **ClientTypeEnum** | Confidential clients are capable of maintaining the confidentiality of their credentials. Public clients are incapable |  [optional] |
|**accessCodeValidity** | **String** | Access codes not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |
|**accessTokenValidity** | **String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |
|**refreshTokenValidity** | **String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |
|**includeClaimsInIdToken** | **Boolean** | Include User claims from scopes in the id_token, for applications that don&#39;t access the userinfo endpoint. |  [optional] |
|**signingKey** | **UUID** | Key used to sign the tokens. Only required when JWT Algorithm is set to RS256. |  [optional] |
|**redirectUris** | **String** | Enter each URI on a new line. |  [optional] |
|**subMode** | **SubModeEnum** | Configure what data should be used as unique User Identifier. For most cases, the default should be fine. |  [optional] |
|**issuerMode** | **IssuerModeEnum** | Configure how the issuer field of the ID Token should be filled. |  [optional] |
|**jwksSources** | **List&lt;UUID&gt;** |  |  [optional] |
|**internalHost** | **URI** |  |  [optional] |
|**externalHost** | **URI** |  |  |
|**internalHostSslValidation** | **Boolean** | Validate SSL Certificates of upstream servers |  [optional] |
|**skipPathRegex** | **String** | Regular expressions for which authentication is not required. Each new line is interpreted as a new Regular Expression. |  [optional] |
|**basicAuthEnabled** | **Boolean** | Set a custom HTTP-Basic Authentication header based on values from authentik. |  [optional] |
|**basicAuthPasswordAttribute** | **String** | User/Group Attribute used for the password part of the HTTP-Basic Header. |  [optional] |
|**basicAuthUserAttribute** | **String** | User/Group Attribute used for the user part of the HTTP-Basic Header. If not set, the user&#39;s Email address is used. |  [optional] |
|**mode** | **ProxyMode** | Enable support for forwardAuth in traefik and nginx auth_request. Exclusive with internal_host. |  [optional] |
|**interceptHeaderAuth** | **Boolean** | When enabled, this provider will intercept the authorization header and authenticate requests based on its value. |  [optional] |
|**cookieDomain** | **String** |  |  [optional] |
|**settings** | **Object** |  |  [optional] |
|**connectionExpiry** | **String** | Determines how long a session lasts. Default of 0 means that the sessions lasts until the browser is closed. (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3) |  [optional] |
|**deleteTokenOnDisconnect** | **Boolean** | When set to true, connection tokens will be deleted upon disconnect. |  [optional] |
|**clientNetworks** | **String** | List of CIDRs (comma-separated) that clients can connect from. A more specific CIDR will match before a looser one. Clients connecting from a non-specified CIDR will be dropped. |  [optional] |
|**sharedSecret** | **String** | Shared secret between clients and server to hash packets. |  [optional] |
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
|**url** | **String** | Base URL to SCIM requests, usually ends in /v2 |  |
|**token** | **String** | Authentication token |  |



