

# DockerServiceConnectionRequest

DockerServiceConnection Serializer

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**local** | **Boolean** | If enabled, use the local connection. Required Docker socket/Kubernetes Integration |  [optional] |
|**url** | **String** | Can be in the format of &#39;unix://&lt;path&gt;&#39; when connecting to a local docker daemon, or &#39;https://&lt;hostname&gt;:2376&#39; when connecting to a remote system. |  |
|**tlsVerification** | **UUID** | CA which the endpoint&#39;s Certificate is verified against. Can be left empty for no validation. |  [optional] |
|**tlsAuthentication** | **UUID** | Certificate/Key used for authentication. Can be left empty for no authentication. |  [optional] |



