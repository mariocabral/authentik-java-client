

# LDAPProvider

LDAPProvider Serializer

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
|**baseDn** | **String** | DN under which objects are accessible. |  [optional] |
|**searchGroup** | **UUID** | Users in this group can do search queries. If not set, every user can execute search queries. |  [optional] |
|**certificate** | **UUID** |  |  [optional] |
|**tlsServerName** | **String** |  |  [optional] |
|**uidStartNumber** | **Integer** | The start for uidNumbers, this number is added to the user.pk to make sure that the numbers aren&#39;t too low for POSIX users. Default is 2000 to ensure that we don&#39;t collide with local users uidNumber |  [optional] |
|**gidStartNumber** | **Integer** | The start for gidNumbers, this number is added to a number generated from the group.pk to make sure that the numbers aren&#39;t too low for POSIX groups. Default is 4000 to ensure that we don&#39;t collide with local groups or users primary groups gidNumber |  [optional] |
|**outpostSet** | **List&lt;String&gt;** |  |  [readonly] |
|**searchMode** | **LDAPAPIAccessMode** |  |  [optional] |
|**bindMode** | **LDAPAPIAccessMode** |  |  [optional] |
|**mfaSupport** | **Boolean** | When enabled, code-based multi-factor authentication can be used by appending a semicolon and the TOTP code to the password. This should only be enabled if all users that will bind to this provider have a TOTP device configured, as otherwise a password may incorrectly be rejected if it contains a semicolon. |  [optional] |



