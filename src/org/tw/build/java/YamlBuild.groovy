#!/usr/bin/env groovy

package org.tw.build.java

class YamlBuild {
    def getHeader(String name = '') {
        return '''apiVersion: v1
kind: Pod
metadata:
  name: ''' + name + '''
'''
    }
}
