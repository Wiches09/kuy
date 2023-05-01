package Communicator;

import com.mycompany.ub.client.UBClient;
import java.net.URI;
import org.json.JSONObject;

public class MessageSender extends UBClient {

//    WebSocketContainer container = ContainerProvider.getWebSocketContainer();
//    Session session;
    public MessageSender() throws Exception {
        URI uri = new URI("ws://localhost:6000");
        UBClient container = new UBClient(uri);

//        this.session = container.connectToServer(MessageSender.class, new URI("ws://localhost:6000"));
    }

    public void sendMsg(String message) throws Exception {
        JSONObject jobj = new JSONObject(message);
        String handler_msg = null;

        System.out.println("JSON Object: " + jobj);

        handler_msg = jobj.getString("handler");

        switch (handler_msg) {
            case "ready" ->
                session.getBasicRemote().sendText(message);
            case "hit" ->
                session.getBasicRemote().sendText(message);
            case "stand" ->
                session.getBasicRemote().sendText(message);
            default ->
                session.getBasicRemote().sendText(message);
        }

    }
}
