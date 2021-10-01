#!/usr/bin/env groovy

def call(Map params) {
    emailext body: params.body,
        subject: params.subject,
        to: params.recipient
}

