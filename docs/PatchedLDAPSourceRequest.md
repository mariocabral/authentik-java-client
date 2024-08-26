

# PatchedLDAPSourceRequest

LDAP Source Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Source&#39;s display Name. |  [optional] |
|**slug** | **String** | Internal source name, used in URLs. |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**authenticationFlow** | **UUID** | Flow to use when authenticating existing users. |  [optional] |
|**enrollmentFlow** | **UUID** | Flow to use when enrolling new users. |  [optional] |
|**policyEngineMode** | **PolicyEngineMode** |  |  [optional] |
|**userMatchingMode** | **UserMatchingModeEnum** | How the source determines if an existing user should be authenticated or a new user enrolled. |  [optional] |
|**userPathTemplate** | **String** |  |  [optional] |
|**serverUri** | **URI** |  |  [optional] |
|**peerCertificate** | **UUID** | Optionally verify the LDAP Server&#39;s Certificate against the CA Chain in this keypair. |  [optional] |
|**clientCertificate** | **UUID** | Client certificate to authenticate against the LDAP Server&#39;s Certificate. |  [optional] |
|**bindCn** | **String** |  |  [optional] |
|**bindPassword** | **String** |  |  [optional] |
|**startTls** | **Boolean** |  |  [optional] |
|**sni** | **Boolean** |  |  [optional] |
|**baseDn** | **String** |  |  [optional] |
|**additionalUserDn** | **String** | Prepended to Base DN for User-queries. |  [optional] |
|**additionalGroupDn** | **String** | Prepended to Base DN for Group-queries. |  [optional] |
|**userObjectFilter** | **String** | Consider Objects matching this filter to be Users. |  [optional] |
|**groupObjectFilter** | **String** | Consider Objects matching this filter to be Groups. |  [optional] |
|**groupMembershipField** | **String** | Field which contains members of a group. |  [optional] |
|**objectUniquenessField** | **String** | Field which contains a unique Identifier. |  [optional] |
|**passwordLoginUpdateInternalPassword** | **Boolean** | Update internal authentik password when login succeeds with LDAP |  [optional] |
|**syncUsers** | **Boolean** |  |  [optional] |
|**syncUsersPassword** | **Boolean** | When a user changes their password, sync it back to LDAP. This can only be enabled on a single LDAP source. |  [optional] |
|**syncGroups** | **Boolean** |  |  [optional] |
|**syncParentGroup** | **UUID** |  |  [optional] |
|**propertyMappings** | **List&lt;UUID&gt;** |  |  [optional] |
|**propertyMappingsGroup** | **List&lt;UUID&gt;** | Property mappings used for group creation/updating. |  [optional] |



