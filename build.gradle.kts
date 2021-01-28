plugins {
    application
    kotlin("jvm") version "1.3.72"
}

apply(plugin = "kotlin")
apply(plugin = "idea")
apply(plugin = "org.jetbrains.kotlin.jvm")

group = "dusk-rs"
version = "0.0.1"

java.sourceCompatibility = JavaVersion.toVersion('8')
java.targetCompatibility = JavaVersion.toVersion('8')

repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
    maven(url = "https://repo.maven.apache.org/maven2")
    maven(url = "https://jitpack.io")
    maven(url = "https://dl.bintray.com/michaelbull/maven")
}

application {
    mainClassName = "Loader"
}

dependencies {
    // Java
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
