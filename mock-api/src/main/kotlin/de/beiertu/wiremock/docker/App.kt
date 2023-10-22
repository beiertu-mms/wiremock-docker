package de.beiertu.wiremock.docker

import com.github.tomakehurst.wiremock.client.WireMock.aResponse
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMockBuilder
import io.github.oshai.kotlinlogging.KotlinLogging
import org.http4k.client.ApacheClient
import org.http4k.core.Method
import org.http4k.core.Request
import java.net.URI

/*
 * A simple example on how to register requests in WireMock.
 * See https://wiremock.org/docs/request-matching/ for more information.
 */
fun main() {
    val logger = KotlinLogging.logger {}

    // Wiremock url, which is available after it is started with the provided docker-compose file.
    // Adjust the scheme and port if needed.
    val wireMockUri = URI("http://localhost:8080")

    val wireMockClient =
        WireMockBuilder()
            .scheme(wireMockUri.scheme)
            .host(wireMockUri.host)
            .port(wireMockUri.port)
            .build()

    // Register a new GET request
    wireMockClient.register(
        get("/v2/hello")
            .withHeader("accept", equalTo("text/plain"))
            .willReturn(
                aResponse().withStatus(200).withBody("Hello from v2"),
            ),
    )

    // Verify that registered request is working as expected.
    val httpClient = ApacheClient()
    val wireMockResponse =
        httpClient(
            Request(Method.GET, "$wireMockUri/v2/hello")
                .header("accept", "text/plain"),
        )

    logger.info {
        """
            |WireMock responds with:
            |
            |$wireMockResponse
        """.trimMargin()
    }
}
