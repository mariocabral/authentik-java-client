

# Outpost

Outpost Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**type** | **OutpostTypeEnum** |  |  |
|**providers** | **List&lt;Integer&gt;** |  |  |
|**providersObj** | [**List&lt;Provider&gt;**](Provider.md) |  |  [readonly] |
|**serviceConnection** | **UUID** | Select Service-Connection authentik should use to manage this outpost. Leave empty if authentik should not handle the deployment. |  [optional] |
|**serviceConnectionObj** | [**ServiceConnection**](ServiceConnection.md) |  |  [readonly] |
|**refreshIntervalS** | **Integer** |  |  [readonly] |
|**tokenIdentifier** | **String** | Get Token identifier |  [readonly] |
|**config** | **Map&lt;String, Object&gt;** |  |  |
|**managed** | **String** | Objects that are managed by authentik. These objects are created and updated automatically. This flag only indicates that an object can be overwritten by migrations. You can still modify the objects via the API, but expect changes to be overwritten in a later update. |  [optional] |



