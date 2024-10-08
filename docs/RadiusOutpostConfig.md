

# RadiusOutpostConfig

RadiusProvider Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **Integer** |  |  [readonly] |
|**name** | **String** |  |  |
|**applicationSlug** | **String** |  |  |
|**authFlowSlug** | **String** |  |  |
|**clientNetworks** | **String** | List of CIDRs (comma-separated) that clients can connect from. A more specific CIDR will match before a looser one. Clients connecting from a non-specified CIDR will be dropped. |  [optional] |
|**sharedSecret** | **String** | Shared secret between clients and server to hash packets. |  [optional] |
|**mfaSupport** | **Boolean** | When enabled, code-based multi-factor authentication can be used by appending a semicolon and the TOTP code to the password. This should only be enabled if all users that will bind to this provider have a TOTP device configured, as otherwise a password may incorrectly be rejected if it contains a semicolon. |  [optional] |



