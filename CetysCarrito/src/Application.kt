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

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(Authentication) {
    }

    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    install(CORS) {
        method(HttpMethod.Put)
        header("MyCustomHeader")
        allowCredentials = true
    }


    val customer = Custumer(
        "John Wayne",
        "jwayne@example.com"
    )

   val product = Product(
       "credencial",
       100,
       "0910102"
   )

   val product2 = Product(
       "Carta Aceptación",
       200,
       "28629293"
   )

   val payment = Payment(
       "12984040963",
       "863",
       "12/09"
   )

   val shoppingCartBehavior = ShoppingCartBehavior(customer.shoppingCart)
   val customerBehavior = CustomerBehavior(customer)

   customerBehavior.addPayment(payment)
   shoppingCartBehavior.addProduct(product,1)
   shoppingCartBehavior.addProduct(product2,4)

    routing {
        get("/") {
            call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
        }

        get("/json/jackson") {
            call.respond(mapOf("hello" to "world"))
        }

        get("/mc/get/custumer") {
            call.respond(mapOf("customer" to customer.name))
        }

        get("/mc/get/product") {
            call.respond(mapOf("product" to customer.shoppingCart.products))
        }

        get("/mc/get/total") {
            call.respond(mapOf("total" to shoppingCartBehavior.getTotal()))
        }

        get("/mc/get/pagos") {
            call.respond(mapOf("pagos" to customer.payments))
        }

    }

}

