#!/usr/bin/env groovy

def sendNotification(recipient = 'anthony.ikeda@thoughtworks.com', subject = 'The real subject', body = 'Empty default body') {
    echo "Sending to ${recipient}"
    emailext body: body,
        subject: subject,
        to: recipient
}
def call(Map params) {
    sendNotification(params.recipient, params.subject, params.recipient)
}

