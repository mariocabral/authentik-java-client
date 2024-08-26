

# PatchedKubernetesServiceConnectionRequest

KubernetesServiceConnection Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**local** | **Boolean** | If enabled, use the local connection. Required Docker socket/Kubernetes Integration |  [optional] |
|**kubeconfig** | **Object** | Paste your kubeconfig here. authentik will automatically use the currently selected context. |  [optional] |
|**verifySsl** | **Boolean** | Verify SSL Certificates of the Kubernetes API endpoint |  [optional] |



