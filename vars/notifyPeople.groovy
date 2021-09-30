#!/usr/bin/env groovy

def call() {
    emailext (
      subject: "Welcome to GridCI",
      body: "GridCI is open for business!!!",
      recipientProviders: [recipients: ['anthony.ikeda@thoughtworks.com']]
    )
}

