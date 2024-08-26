

# PatchedUserLoginStageRequest

UserLoginStage Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**flowSet** | [**List&lt;FlowSetRequest&gt;**](FlowSetRequest.md) |  |  [optional] |
|**sessionDuration** | **String** | Determines how long a session lasts. Default of 0 means that the sessions lasts until the browser is closed. (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3) |  [optional] |
|**terminateOtherSessions** | **Boolean** | Terminate all other sessions of the user logging in. |  [optional] |
|**rememberMeOffset** | **String** | Offset the session will be extended by when the user picks the remember me option. Default of 0 means that the remember me option will not be shown. (Format: hours&#x3D;-1;minutes&#x3D;-2;seconds&#x3D;-3) |  [optional] |
|**networkBinding** | **NetworkBindingEnum** | Bind sessions created by this stage to the configured network |  [optional] |
|**geoipBinding** | **GeoipBindingEnum** | Bind sessions created by this stage to the configured GeoIP location |  [optional] |



