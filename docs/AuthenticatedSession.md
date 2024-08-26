

# AuthenticatedSession

AuthenticatedSession Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** |  |  [optional] |
|**current** | **Boolean** | Check if session is currently active session |  [readonly] |
|**userAgent** | [**AuthenticatedSessionUserAgent**](AuthenticatedSessionUserAgent.md) |  |  |
|**geoIp** | [**AuthenticatedSessionGeoIp**](AuthenticatedSessionGeoIp.md) |  |  |
|**asn** | [**AuthenticatedSessionAsn**](AuthenticatedSessionAsn.md) |  |  |
|**user** | **Integer** |  |  |
|**lastIp** | **String** |  |  |
|**lastUserAgent** | **String** |  |  [optional] |
|**lastUsed** | **OffsetDateTime** |  |  [readonly] |
|**expires** | **OffsetDateTime** |  |  [optional] |



