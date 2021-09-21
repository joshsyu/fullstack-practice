# Helm Chart

## Create a helm chart
1. Use command to create a template
```sh
helm create demo
```
2. Modify yaml files in folder template/ to add sections you needed, for example auto scaling in deployment.yaml
3. Modify values.yaml to set application's information such as, replicaCount, image tag.
4. helm install (the path starts from where Chart.yaml stored)
helm install releaseName HelmChartPath
```sh
helm install fullstack-demo .
```
### Useful helm chart command
```sh
helm install releaseName HelmChartPath
helm uninstall releaseName # uninstall helm chart
helm pull repo/name # get helm chart with tar file
```
