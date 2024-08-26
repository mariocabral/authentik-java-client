

# ProxyProviderRequest

ProxyProvider Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**authenticationFlow** | **UUID** | Flow used for authentication when the associated application is accessed by an un-authenticated user. |  [optional] |
|**authorizationFlow** | **UUID** | Flow used when authorizing this provider. |  |
|**propertyMappings** | **List&lt;UUID&gt;** |  |  [optional] |
|**internalHost** | **URI** |  |  [optional] |
|**externalHost** | **URI** |  |  |
|**internalHostSslValidation** | **Boolean** | Validate SSL Certificates of upstream servers |  [optional] |
|**certificate** | **UUID** |  |  [optional] |
|**skipPathRegex** | **String** | Regular expressions for which authentication is not required. Each new line is interpreted as a new Regular Expression. |  [optional] |
|**basicAuthEnabled** | **Boolean** | Set a custom HTTP-Basic Authentication header based on values from authentik. |  [optional] |
|**basicAuthPasswordAttribute** | **String** | User/Group Attribute used for the password part of the HTTP-Basic Header. |  [optional] |
|**basicAuthUserAttribute** | **String** | User/Group Attribute used for the user part of the HTTP-Basic Header. If not set, the user&#39;s Email address is used. |  [optional] |
|**mode** | **ProxyMode** | Enable support for forwardAuth in traefik and nginx auth_request. Exclusive with internal_host. |  [optional] |
|**interceptHeaderAuth** | **Boolean** | When enabled, this provider will intercept the authorization header and authenticate requests based on its value. |  [optional] |
|**cookieDomain** | **String** |  |  [optional] |
|**jwksSources** | **List&lt;UUID&gt;** |  |  [optional] |
|**accessTokenValidity** | **String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |
|**refreshTokenValidity** | **String** | Tokens not valid on or after current time + this value (Format: hours&#x3D;1;minutes&#x3D;2;seconds&#x3D;3). |  [optional] |



