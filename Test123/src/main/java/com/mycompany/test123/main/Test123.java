package com.mycompany.test123.main;

import com.mycompany.test123.backclass.*;
import com.mycompany.test123.backclass.HandlerCheck;
import com.mycompany.test123.backclass.Player;
import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.ContainerProvider;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.WebSocketContainer;
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;

/**
 *
 * @author helld
 */
@ClientEndpoint
public class Test123 {

    private Session session;
    private String username;

    public static void main(String[] args) throws Exception {
        // connect to WS server
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        Session session = container.connectToServer(Test123.class, new URI("ws://localhost:6000"));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }

    @OnOpen
    public void onOpen(Session session) throws Exception {
        // open the game and login
        Player player = null; // do nothing now. just for image if we use it to collect user data
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username.");
        username = sc.nextLine();
        String message = "{\"handler\":\"auth\",\"username\":\"" + username + "\"}";
        session.getBasicRemote().sendText(message); // send message to server

    }

    @OnMessage
    // client and server communicating (when do/request something)
    public void onMessage(String message) throws IOException { // message = message from server
        System.out.println("helloweold");

        HandlerCheck checker = new HandlerCheck(message); // request action to server

    }

    public void connect() throws Exception {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        session = container.connectToServer(this, new URI("ws://localhost:8080/chat"));

    }

    @OnClose
    public void onClose(Session Session) {

    }

}
