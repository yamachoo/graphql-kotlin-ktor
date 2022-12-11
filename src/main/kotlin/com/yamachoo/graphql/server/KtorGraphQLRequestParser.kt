package com.yamachoo.graphql.server

import com.expediagroup.graphql.server.execution.GraphQLRequestParser
import com.expediagroup.graphql.server.types.GraphQLServerRequest
import com.fasterxml.jackson.databind.ObjectMapper
import io.ktor.server.request.*
import java.io.IOException

class KtorGraphQLRequestParser(
    private val mapper: ObjectMapper
): GraphQLRequestParser<ApplicationRequest> {
    override suspend fun parseRequest(request: ApplicationRequest): GraphQLServerRequest? {
        try {
            val rawRequest = request.call.receiveText()
            return mapper.readValue(rawRequest, GraphQLServerRequest::class.java)
        } catch (e: IOException) {
            throw IOException("Unable to parse GraphQL payload.")
        }
    }
}
