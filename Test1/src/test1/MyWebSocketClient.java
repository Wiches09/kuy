import javax.websocket.*;
import java.net.URI;

@ClientEndpoint
public class MyWebSocketClient {

    @OnOpen
    public void onOpen(Session session) {
        // called when the WebSocket connection is opened
    }

    @OnMessage
    public void onMessage(String message) {
        // called when a message is received from the servers
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        // called when the WebSocket connection is closed
    }

    public void connect(String uri) throws Exception {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        container.connectToServer(this, new URI(uri));
    }
}