#!/usr/bin/env groovy

def sendNotification(Map params) {
    emailext ( body: params.body,
        subject: params.subject,
        to: params.recipient)
}
return this