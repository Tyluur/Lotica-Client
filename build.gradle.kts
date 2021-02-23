import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    application
    kotlin("jvm") version "1.4.20"
    id("com.github.johnrengelman.shadow") version "5.1.0"
}

val launcherClass = "Loader"

application {
    mainClassName = "Loader"
}

repositories {
    mavenCentral()
}

dependencies {
    // Jvm
    implementation(kotlin("stdlib-jdk8"))

    //Utilities
    implementation("commons-codec:commons-codec:1.9")

    // Logging
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("com.michael-bull.kotlin-inline-logger", "kotlin-inline-logger-jvm", "1.0.2")
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("app")
        mergeServiceFiles()
        manifest {
            attributes(mapOf("Main-Class" to "Loader"))
        }
    }
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}