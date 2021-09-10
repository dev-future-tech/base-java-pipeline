#!/usr/bin/env groovy

def welcome() {
    echo "Today I want to welcome you. ${WelcomeMessage.message}"
}

def call() {
    welcome()
}