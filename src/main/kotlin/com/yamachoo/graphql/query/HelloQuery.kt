package com.yamachoo.graphql.query

import com.expediagroup.graphql.server.operations.Query

object HelloQuery : Query {
    fun hello() = "Hello World!"
}
