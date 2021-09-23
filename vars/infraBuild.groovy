#!/usr/bin/env groovy

import org.tw.build.java.Terraformer;


def call() {
    former = new Terraformer();

    pipeline {
        agent {
            kubernetes {
                yaml "\"" + former.getInfraBuild() + "\""
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