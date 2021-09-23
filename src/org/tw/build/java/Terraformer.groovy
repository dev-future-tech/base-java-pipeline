package org.tw.build.java

class Terraformer {
    public String getInfraBuild() {
        return getTerraformHeader() + getContainer("terraform");
    }

    public String getTerraformHeader() {
        return """
apiVersion: v1
kind: Pod
metadata:
  labels:
    build-infra: terraform
spec:
  containers:
  """ + getContainer("terraform") +
        """ """
    }

    public String getContainer (String containerName) {
        switch (containerName) {
            case "terraform" : 
                return """
    - name: terraform
      image: hashicorp/terraform:1.0.6
      command: ['sleep', '99d']
      tty: true
                """;
            case "java" :
                return """
    - name: java
      image: openjdk:11-oracle
      command: ['sleep', '99d']
      tty: true
            """;
            case "dotnet" :
                return """
    - name: dotnet
      image: bitnami/dotnet-sdk:5
      command: ['sleep', '99d']
      tty: true
            """;
            default:
                return "";
        }
    }
}