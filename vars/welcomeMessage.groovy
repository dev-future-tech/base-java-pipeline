#!/usr/bin/env groovy
import org.tw.build.java.JavaBuild

def call() {
    echo "Today I want to welcome you."
    echo "Message is: ${JavaBuild.message}"
}