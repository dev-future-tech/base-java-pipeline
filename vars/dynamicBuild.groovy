#!/usr/bin/env groovy

import org.tw.build.java.DynamicBuilder
import org.tw.build.model.ContainerConfig

def call() {
    def builder = new DynamicBuilder()

    def java = new ContainerConfig(name: 'java', image: 'openjdk:11-oracle', command: 'sleep', args: '99d')

    build.pods([java])
}