package org.vtsukur.graphql.demo.cart.conf

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.web.client.RestTemplate
import org.vtsukur.graphql.demo.cart.deps.ProductServiceRestClient

@Configuration
class RestClientsConfiguration {

    @Bean
    fun productServiceRestClient() = ProductServiceRestClient("http://localhost:9090")

}
