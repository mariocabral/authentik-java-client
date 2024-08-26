

# PatchedOutpostRequest

Outpost Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**type** | **OutpostTypeEnum** |  |  [optional] |
|**providers** | **List&lt;Integer&gt;** |  |  [optional] |
|**serviceConnection** | **UUID** | Select Service-Connection authentik should use to manage this outpost. Leave empty if authentik should not handle the deployment. |  [optional] |
|**config** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**managed** | **String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [optional] |



