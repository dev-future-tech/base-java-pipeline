package org.tw.build.java

import org.tw.build.model.ContainerConfig

def pods(ContainerConfig[] imageNames) {

    for(image : imageNames) {
        containerTemplate(name: image.getName(), image: image.getImage(), command: image.getCommand(), args: image.getArgs())
    }

}

return this