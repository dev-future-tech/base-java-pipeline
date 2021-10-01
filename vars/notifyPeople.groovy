#!/usr/bin/env groovy

def sendNotification(Map params) {
    echo "Sending to ${params.recipient}"
    emailext body: params.body,
        subject: params.subject,
        to: params.recipient
}
def call(subject = 'The real subject', body = 'Empty default body', recipient='anthony.ikeda@thoughtworks.com') {
    sendNotification([recipient: recipient, subject: subject, body: body])
}

