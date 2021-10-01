#!/usr/bin/env groovy

def call(String recipient = 'anthony.ikeda@thoughtworks.com', 
            String subject = 'Welcome to GridCI',
            String body = 'GridCI is open for business!!!') {
    emailext body: body,
        subject: subject,
        to: recipient
}

