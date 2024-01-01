plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.22"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.http4k:http4k-bom:5.11.1.0"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k:http4k-client-apache")

    implementation("org.wiremock:wiremock:3.3.1")
    implementation("io.github.oshai:kotlin-logging-jvm:6.0.1")
    implementation("org.slf4j:slf4j-simple:2.0.10")
}

application {
    mainClass.set("de.beiertu.wiremock.docker.AppKt")
}
