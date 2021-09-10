#!/usr/bin/env groovy

def welcome() {
    echo "Today I want to welcome you. ${JavaBuild.message}"
}

def call() {
    welcome
}