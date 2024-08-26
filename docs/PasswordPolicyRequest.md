

# PasswordPolicyRequest

Password Policy Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**executionLogging** | **Boolean** | When this option is enabled, all executions of this policy will be logged. By default, only execution errors are logged. |  [optional] |
|**passwordField** | **String** | Field key to check, field keys defined in Prompt stages are available. |  [optional] |
|**amountDigits** | **Integer** |  |  [optional] |
|**amountUppercase** | **Integer** |  |  [optional] |
|**amountLowercase** | **Integer** |  |  [optional] |
|**amountSymbols** | **Integer** |  |  [optional] |
|**lengthMin** | **Integer** |  |  [optional] |
|**symbolCharset** | **String** |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**checkStaticRules** | **Boolean** |  |  [optional] |
|**checkHaveIBeenPwned** | **Boolean** |  |  [optional] |
|**checkZxcvbn** | **Boolean** |  |  [optional] |
|**hibpAllowedCount** | **Integer** | How many times the password hash is allowed to be on haveibeenpwned |  [optional] |
|**zxcvbnScoreThreshold** | **Integer** | If the zxcvbn score is equal or less than this value, the policy will fail. |  [optional] |



