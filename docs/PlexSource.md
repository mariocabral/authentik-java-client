

# PlexSource

Plex Source Serializer

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
|**clientId** | **String** | Client identifier used to talk to Plex. |  [optional] |
|**allowedServers** | **List&lt;String&gt;** | Which servers a user has to be a member of to be granted access. Empty list allows every server. |  [optional] |
|**allowFriends** | **Boolean** | Allow friends to authenticate, even if you don&#39;t share a server. |  [optional] |
|**plexToken** | **String** | Plex token used to check friends |  |



