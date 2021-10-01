package org.tw.build.java

public class Notifier {
    public void sendNotification(Map params) {
        emailext body: params.body,
            subject: params.subject,
            to: params.recipient
    }
}