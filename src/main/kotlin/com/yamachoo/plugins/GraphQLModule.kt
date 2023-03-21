package com.yamachoo.plugins

import com.expediagroup.graphql.server.ktor.GraphQL
import com.expediagroup.graphql.server.ktor.graphQLPostRoute
import com.expediagroup.graphql.server.ktor.graphiQLRoute
import com.yamachoo.graphql.query.HelloQuery
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.graphQLModule() {
    install(GraphQL) {
        schema {
            packages = listOf("com.yamachoo.graphql")
            queries = listOf(HelloQuery)
        }
    }

    routing {
        graphQLPostRoute()
        graphiQLRoute()
    }
}
