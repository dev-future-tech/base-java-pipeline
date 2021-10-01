#!/usr/bin/env groovy
package org.tw.build.java

def sendNotification(Map params) {
    emailext body: params.body,
        subject: params.subject,
        to: params.recipient
}
return this