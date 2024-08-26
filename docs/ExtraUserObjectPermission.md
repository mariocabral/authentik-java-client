

# ExtraUserObjectPermission

User permission with additional object-related data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**codename** | **String** |  |  [readonly] |
|**model** | **String** |  |  [readonly] |
|**appLabel** | **String** |  |  [readonly] |
|**objectPk** | **String** |  |  [readonly] |
|**name** | **String** |  |  [readonly] |
|**appLabelVerbose** | **String** | Get app label from permission&#39;s model |  [readonly] |
|**modelVerbose** | **String** | Get model label from permission&#39;s model |  [readonly] |
|**objectDescription** | **String** | Get model description from attached model. This operation takes at least one additional query, and the description is only shown if the user/role has the view_ permission on the object |  [readonly] |



