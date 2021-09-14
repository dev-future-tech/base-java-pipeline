package com.foo.utils

public void dockerTemplate(body) {
  podTemplate(containers: [containerTemplate(name: 'docker', image: 'docker', command: 'sleep', args: '99d')],
    volumes: [hostPathVolume(hostPath: '/var/run/docker.sock', mountPath: '/var/run/docker.sock')]) {
      body.call()
    }
  }

public void mavenTemplate(body) {
  podTemplate(containers: [containerTemplate(name: 'maven', image: 'maven', command: 'sleep', args: '99d')],
    volumes: [secretVolume(secretName: 'maven-settings', mountPath: '/root/.m2'),
    persistentVolumeClaim(claimName: 'maven-local-repo', mountPath: '/root/.m2repo')]) {
      body.call()
    }
}

public void javaTemplate(body) {
  podTemplate (
    containers: [
        containerTemplate(name: 'java', image: 'openjdk:11-oracle', command: 'sleep', args: '99d'),
        containerTemplate(name: 'terraform', image: 'hashicorp/terraform:1.0.6', command: 'sleep', args: '99d')
    ]) {
      body.call()
    }
}

return this