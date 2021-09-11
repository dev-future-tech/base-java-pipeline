#!/usr/bin/env groovy
import org.tw.build.java.JavaBuild

def call(String name = 'human') {
    echo "Today I want to welcome you."
    echo "Message is: ${JavaBuild.message}"
}