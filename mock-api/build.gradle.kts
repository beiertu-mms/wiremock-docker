plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.20"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.http4k:http4k-bom:6.7.0.0"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k:http4k-client-apache")

    implementation("org.wiremock:wiremock:3.13.0")
    implementation("io.github.oshai:kotlin-logging-jvm:7.0.7")
    implementation("org.slf4j:slf4j-simple:2.0.17")
}

application {
    mainClass.set("de.beiertu.wiremock.docker.AppKt")
}
