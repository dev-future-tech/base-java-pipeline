#!/usr/bin/env groovy

def call(subject = "${JOB_NAME} - ${BUILD_NUMBER}", body = "Notifying for job ${JOB_NAME} at build ${BUILD_NUMBER}", recipients='User <no-reply@natonalgrid.com>') {
    def notifier = new org.tw.build.java.Notifier();
    notifier.sendNotification([recipient: recipients, subject: subject, body: body])
}

