#!/usr/bin/env groovy

import org.tw.build.java.YamlBuild

def getWithContainers(String... containers = ['human']) {
    podYaml += ''
    containers.each{ containerName -> 
        echo "This container is ${containerName}"
        podYaml += YamlBuild.getHeader(containerName)
    }
    return podYaml
}
