#!/usr/bin/env groovy

def call() {
    emailext (
      subject: "Welcome to GridCI",
      body: "GridCI is open for business!!!",
      recipients: ['anthony.ikeda@thoughtworks.com']
    )
}

