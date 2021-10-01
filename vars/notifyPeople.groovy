#!/usr/bin/env groovy

def sendNotification(Map params) {
    echo "Sending to ${params.recipient}"
    emailext body: params.body,
        subject: params.subject,
        to: params.recipient
}
def call(subject = 'The real subject', body = "Notifying for job ${JOB_NAME} at build ${BUILD_NUMBER}", recipients='anthony.ikeda@thoughtworks.com') {
    echo body
    sendNotification([recipient: recipients, subject: subject, body: body])
}

