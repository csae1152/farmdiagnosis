package com.agricol.main;

import io.vertx.core.AbstractVerticle;

/**
 * @author Helmut Steiner
 * @see AbstractVerticle
 */
public class HtmlEchoServer extends AbstractVerticle {
    /**
     * Starts the main verticle
     *
     * @throws Exception
     */
    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> req.response().end("farmdiagnosis"))
                .listen(
                        Integer.getInteger("http.port"), System.getProperty("http.address", "0.0.0.0"));
    }
}
