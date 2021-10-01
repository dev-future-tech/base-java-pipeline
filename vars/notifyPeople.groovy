#!/usr/bin/env groovy

def sendNotification(Map params) {
    echo "Sending to ${recipient}"
    emailext body: params.body,
        subject: params.subject,
        to: params.recipient
}
def call(recipient='anthony.ikeda@thoughtworks.com', subject = 'The real subject', body = 'Empty default body') {
    sendNotification([recipient: recipient, subject: subject, body: body])
}

