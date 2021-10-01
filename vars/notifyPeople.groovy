#!/usr/bin/env groovy
import org.tw.build.java.Notifier

def call(subject = "${JOB_NAME} - ${BUILD_NUMBER}", body = "Notifying for job ${JOB_NAME} at build ${BUILD_NUMBER}", recipients='User <no-reply@natonalgrid.com>') {
    def notifier = new Notifier();
    notifier.sendNotification([recipient: recipients, subject: subject, body: body])
}

