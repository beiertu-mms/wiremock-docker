plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.10"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.http4k:http4k-bom:5.46.0.0"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k:http4k-client-apache")

    implementation("org.wiremock:wiremock:3.10.0")
    implementation("io.github.oshai:kotlin-logging-jvm:7.0.3")
    implementation("org.slf4j:slf4j-simple:2.0.16")
}

application {
    mainClass.set("de.beiertu.wiremock.docker.AppKt")
}
