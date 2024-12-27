package co.brianarmstrong

import jakarta.inject.Singleton

@Singleton
class DemoEndpoint : DemoServiceGrpcKt.DemoServiceCoroutineImplBase() {
    override suspend fun send(request: DemoRequest): DemoReply =
        demoReply {
            message = "Hi there, ${request.name}!"
        }
}