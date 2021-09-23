#!/usr/bin/env groovy

import org.tw.build.java.Terraformer;

Terraformer former = new Terraformer();

def call() {
    pipeline {
        agent {
            kubernetes {
                yaml former.getInfraBuild()
            }
        }
        stages {
            stage ("init infra") {
                steps {
                    container('terraform') {
                        sh 'terraform init'
                    }
                }
            }
        }
    }
}