# Full stack practice
This project is a demo for the fullstack development with following technique
- Angular (front-end)
- Golang (back-end)
- Docker (image)
- K8S (deployment pod)

# Step
1. Build a golang backend service by using echo framework
2. Port backend service into image
3. Port image into K8S
4. Add front-end by using angular framework

# How to use this repo

1. clone the project
```bash
git clone https://github.com/joshsyu/fullstack-practice.git
```
2. checkout the branch which you try to practice, such as angular
```bash
git checkout angular
```
3. checkout the tag (commit) which you try to start, such as lecture1-create-angular-project
```bash
git checkout lecture1-create-angular-project
```
4. checkout to new branch for your own practice, such as my-practice-on-angular
```bash
git checkout -b my-practice-on-angular
```

## Git

### Useful command
- git clone
Download the whole project from remote url (default download from master branch)
```bash
git clone url
git clone https://github.com/joshsyu/fullstack-practice.git
```
- git add
Add changes into staging for commit
```
git add "modified file"
```
- git remove
Remove the git add files
```bash
git remove "added file"
```
- git commit
Commit the changes and give the changes with some reason
```bash
git commit -m "Why I need to do this"
```
- git push
Push(Synchronize) local changes to remote repo, -u means upstream local change with remote branch
```bash
git push -u origin branch
git push -u origin master
git push
```
- git pull
Synchronize changes from remote repo
```
git pull
```
- git remote add
Set up a remote repo for uploading files to code server
```bash
git remote add https://github.com/joshsyu/fullstack-practice.git
```
- git remote set-url
Change a remote repo url
```bash
git remoate set-url origin https://github.com/joshsyu/fullstack-practice.git
```
- git log
Watch the change history (each commit)
```bash
git log
```
- git checkout
With -b able to create a new branch and move to it.
With commit able to move the current repo back to specified commit (un-attached)
Checkout branch is to move the current repo to the other branch or un-attached commit state to newest commit on the branch
```bash
git checkout -b new-branch
git checkout branch
git checkout commit
```
- git reset
Reset the current repo to specified commit (state)
```bash
git reset commit
```
- git branch
Delete unused branch
```bash
git branch -D branchName
```
## Docker
### Useful command
- docker build -t tag .
- docker run image:tag
- docker exec -it container command

## K8S
### Useful command
- kubectl apply -f *.yaml
- kubectl get pods/deployments/statefulsets/svc/pvc
- kubectl describe pods abcd
- kubectl logs pods -c container
- kubectl exec -it pod -- command

## Angular
# Install angular cli
```bash
# Download nodejs
export PATH="$PATH:NODEPATH"
npm install -g @angular/cli@latest
```
### Useful command
- ng new project
- ng new component
- ng build
- ng serve --port 8900
- ng add @angular/material

### Useful package
ag-grid-community ag-grid-angular
@angular/flex-layout

### Angular Upgrade
[Reference](https://update.angular.io/)

### Angular Schematics
[Reference](https://material.angular.io/guide/schematics)

## Golang
### Useful command
- go build
- go run
- go mod init
- go mod download
- go mod tidy
- go get -u url
- go tool test