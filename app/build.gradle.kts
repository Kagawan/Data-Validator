plugins {
    java
    checkstyle
    jacoco
    id("com.github.mrsarm.jshell.plugin") version "1.2.1"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}


tasks.jacocoTestReport { reports { xml.required.set(true) } }