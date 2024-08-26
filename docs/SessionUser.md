

# SessionUser

Response for the /user/me endpoint, returns the currently active user (as `user` property) and, if this user is being impersonated, the original user in the `original` property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**user** | [**UserSelf**](UserSelf.md) |  |  |
|**original** | [**UserSelf**](UserSelf.md) |  |  [optional] |



