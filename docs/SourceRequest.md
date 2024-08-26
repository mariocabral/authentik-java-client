

# SourceRequest

Source Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Source&#39;s display Name. |  |
|**slug** | **String** | Internal source name, used in URLs. |  |
|**enabled** | **Boolean** |  |  [optional] |
|**authenticationFlow** | **UUID** | Flow to use when authenticating existing users. |  [optional] |
|**enrollmentFlow** | **UUID** | Flow to use when enrolling new users. |  [optional] |
|**policyEngineMode** | **PolicyEngineMode** |  |  [optional] |
|**userMatchingMode** | **UserMatchingModeEnum** | How the source determines if an existing user should be authenticated or a new user enrolled. |  [optional] |
|**userPathTemplate** | **String** |  |  [optional] |



