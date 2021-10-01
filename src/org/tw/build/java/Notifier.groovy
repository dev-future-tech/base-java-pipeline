package org.tw.build.java

public class Notifier {
    def sendNotification(Map params) {
        emailext body: params.body,
            subject: params.subject,
            to: params.recipient
    }
}