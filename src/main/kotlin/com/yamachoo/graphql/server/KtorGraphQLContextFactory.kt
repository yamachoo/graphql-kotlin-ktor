package com.yamachoo.graphql.server

import com.expediagroup.graphql.server.execution.GraphQLContextFactory
import io.ktor.server.request.*

class KtorGraphQLContextFactory : GraphQLContextFactory<ApplicationRequest>
