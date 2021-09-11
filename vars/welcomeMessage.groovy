#!/usr/bin/env groovy


def call(String name = 'human') {
    echo "Today I want to welcome you."
    echo "Message is: ${JavaBuild.message}"
}