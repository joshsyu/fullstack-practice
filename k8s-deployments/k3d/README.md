# K3D
k3d is a docker verion to run k3s which is smallest k8s cluster

## Prerequisite
- Docker (docker desktop) with kubectl enabled
- k3d image
    * rancher/k3d-proxy:4.4.8
    * rancher/k3d-tools:4.4.8
    * rancher/k3s:v1.21.3-k3s1
    * registry:2 (for local image)

## Use local docker image
```sh
k3d registry create registry.localhost --port 5000
```
Remeber to add k3d-registry.localhost into /etc/hosts to resolve this hostname

## Create a k8s cluster
k3d cluster create name
```sh
k3d cluster create k8s --config k3d-deployment.yaml
```
## Networking
There are three ways to access service inside k8s cluster:
- NodePort (expose a node's port to map the service), without HA(single node) and may have secure issue should only used in dev
- Ingress (Route the request into service)
- LoadBalancer (Service should implement)
k3d support ingress and nodePort by use docker's port mapping when creating cluster 
[k3d expose port in runtime](https://github.com/rancher/k3d/issues/89)

## Useful k3d command
```sh
k3d cluster create clusterName
k3d cluster delete clusterName
k3d registry create registryName
k3d registry delete registryName
```

# Reference
- [k3d github](https://github.com/rancher/k3d)
- [k3d offical](https://k3d.io/v4.4.8/)
- [k3d local registry](https://k3d.io/v4.4.8/usage/guides/registries/)
