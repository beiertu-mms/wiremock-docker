plugins {
    id("org.jetbrains.kotlin.jvm") version "2.0.0"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.http4k:http4k-bom:5.26.1.0"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k:http4k-client-apache")

    implementation("org.wiremock:wiremock:3.9.1")
    implementation("io.github.oshai:kotlin-logging-jvm:7.0.0")
    implementation("org.slf4j:slf4j-simple:2.0.13")
}

application {
    mainClass.set("de.beiertu.wiremock.docker.AppKt")
}
