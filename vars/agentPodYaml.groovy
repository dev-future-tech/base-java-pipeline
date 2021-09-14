#!/usr/bin/env groovy

import org.tw.build.java.YamlBuild

def getWithContainers(String... name = ['human']) {
    containers.each{ containerName -> 
        echo "This container is ${containerName}"
        podYaml += YamlBuild.getHeader(containerName)
    }
    return podYaml
}
