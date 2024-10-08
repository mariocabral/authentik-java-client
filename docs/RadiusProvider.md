

# RadiusProvider

RadiusProvider Serializer

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
|**clientNetworks** | **String** | List of CIDRs (comma-separated) that clients can connect from. A more specific CIDR will match before a looser one. Clients connecting from a non-specified CIDR will be dropped. |  [optional] |
|**sharedSecret** | **String** | Shared secret between clients and server to hash packets. |  [optional] |
|**outpostSet** | **List&lt;String&gt;** |  |  [readonly] |
|**mfaSupport** | **Boolean** | When enabled, code-based multi-factor authentication can be used by appending a semicolon and the TOTP code to the password. This should only be enabled if all users that will bind to this provider have a TOTP device configured, as otherwise a password may incorrectly be rejected if it contains a semicolon. |  [optional] |



