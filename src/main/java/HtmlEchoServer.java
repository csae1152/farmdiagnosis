import io.vertx.core.AbstractVerticle;

/**
 * @author Helmut Steiner
 */
public class HtmlEchoServer extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(req -> req.response().end("farmdiagnosis"))
                .listen(
                        Integer.getInteger("http.port"), System.getProperty("http.address", "0.0.0.0"));

    }
}
