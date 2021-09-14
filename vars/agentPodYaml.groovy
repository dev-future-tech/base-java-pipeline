#!/usr/bin/env groovy

import org.tw.build.java.YamlBuild

def getWithContainers(String... containers = ['human']) {
    def podYaml = ''
    def yamlBuild = new YamlBuild()
    containers.each{ containerName -> 
        echo "This container is ${containerName}"
        podYaml += yamlBuild.getHeader(containerName)
    }
    return podYaml
}
