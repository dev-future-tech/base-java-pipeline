#!/usr/bin/env groovy

import org.tw.build.java.Terraformer;


def call(String project) {
    former = new Terraformer();
    echo "Building project ${project}"
    echo former.getInfraBuild();

    pipeline {
        agent {
            kubernetes {
                yaml former.getInfraBuild()
            }
        }
        stages {
            stage ("init infra") {
                steps {
                    container('dotnet') {
                        sh 'dotnet restore'
                        sh 'dotnet build'
                    }
                    container('terraform') {
                        sh 'terraform init'
                        sh 'terraform plan'
                        sh 'terraform apply -auto-approve'
                    }
                }
            }
        }
    }
}