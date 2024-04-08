plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.23"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.http4k:http4k-bom:5.14.4.0"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k:http4k-client-apache")

    implementation("org.wiremock:wiremock:3.5.2")
    implementation("io.github.oshai:kotlin-logging-jvm:6.0.4")
    implementation("org.slf4j:slf4j-simple:2.0.12")
}

application {
    mainClass.set("de.beiertu.wiremock.docker.AppKt")
}
