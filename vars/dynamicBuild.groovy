#!/usr/bin/env groovy

import org.tw.build.java.DynamicBuild
import org.tw.build.model.ContainerConfig

def call() {
    def builder = new DynamicBuild()

    def java = new ContainerConfig(name: 'java', image: 'openjdk:11-oracle', command: 'sleep', args: '99d')

    build.pods([java])
}