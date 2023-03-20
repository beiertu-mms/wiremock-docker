plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.10"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.http4k:http4k-bom:4.41.0.0"))
    implementation("org.http4k:http4k-core")
    implementation("org.http4k:http4k-client-apache")

    implementation("com.github.tomakehurst:wiremock-jre8:2.35.0")
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")
    implementation("ch.qos.logback:logback-classic:1.4.6")
}

application {
    mainClass.set("de.beiertu.wiremock.docker.AppKt")
}
