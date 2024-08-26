

# KubernetesServiceConnection

KubernetesServiceConnection Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pk** | **UUID** |  |  [readonly] |
|**name** | **String** |  |  |
|**local** | **Boolean** | If enabled, use the local connection. Required Docker socket/Kubernetes Integration |  [optional] |
|**component** | **String** |  |  [readonly] |
|**verboseName** | **String** | Return object&#39;s verbose_name |  [readonly] |
|**verboseNamePlural** | **String** | Return object&#39;s plural verbose_name |  [readonly] |
|**metaModelName** | **String** | Return internal model name |  [readonly] |
|**kubeconfig** | **Object** | Paste your kubeconfig here. authentik will automatically use the currently selected context. |  [optional] |
|**verifySsl** | **Boolean** | Verify SSL Certificates of the Kubernetes API endpoint |  [optional] |



