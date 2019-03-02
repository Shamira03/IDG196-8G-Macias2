package com.gmail.macias3roa

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.auth.*
import com.fasterxml.jackson.databind.*
import io.ktor.jackson.*
import io.ktor.features.*
import kotlin.test.*
import io.ktor.server.testing.*

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("HELLO WORLD!", response.content)
            }
        }
    }

    @Test
    fun getCustumer(){
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/mc/get/custumer").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun getProduct(){
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/mc/get/product").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun getPayment(){
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/mc/get/pagos").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun getTotal(){
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/mc/get/total").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }
}
