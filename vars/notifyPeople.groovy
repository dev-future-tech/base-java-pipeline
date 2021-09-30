#!/usr/bin/env groovy

def call() {
    emailext body: 'GridCI is open for business!!!',
        subject: 'Welcome to GridCI',
        to: 'anthony.ikeda@thoughtworks.com'

}

