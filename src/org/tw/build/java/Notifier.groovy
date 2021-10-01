#!/usr/bin/env groovy
package org.tx.build.java

def sendNotification(Map params) {
    emailext ( body: params.body,
        subject: params.subject,
        to: params.recipient)
}
return this