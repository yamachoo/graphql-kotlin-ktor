package com.yamachoo.plugins

import com.yamachoo.graphql.server.KtorGraphQLServer
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        post("/graphql") {
            KtorGraphQLServer.handle(this.call)
        }
    }
}
