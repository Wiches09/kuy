/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Communicator;

import org.json.JSONObject;

/**
 *
 * @author helld
 */
public class Handler {

    public Handler(String message) {
        // create object to turn json to string
        JSONObject jobj = new JSONObject(message);
        JSONObject n_content = null; // to use if content is a object
        Object checker = null;
        String handler = null;

        System.out.println("JSON Object: " + jobj);

        if (jobj.has("content")) {
            checker = jobj.get("content"); // to check if content is a object
            // check content
            if (checker instanceof JSONObject) {
                System.out.println("c_Obj");
                n_content = jobj.getJSONObject("content");
                System.out.println("new content: " + n_content);
            } else {
                String content = jobj.getString("content");
                System.out.println("c_Word");
                System.out.println(content);
            }

            // convert to string
            if (jobj.has("handler")) {
                handler = jobj.getString("handler");
            }
            String status = jobj.getString("status");

            System.out.println(handler);
            System.out.println();

            // doing case stuff
            if (status.equals("OK")) {
                System.out.println(status);
                switch (handler) {
                    case "CONNECTION_AUTHROIZED" -> {
                        UserCollector user = new UserCollector(n_content.getString("username"), n_content.getString("connectionId"));
                        System.out.println(user.toString());
                    }
                    case "READY_STATE" -> {
                        System.out.println("test123");
                    }
                    case "UPDATE_CARDS" -> {
                        System.out.println("test12345");
                    }
                    case "HIT_EVENT" -> {
                        System.out.println("test1234567");
                    }
                    case "HEALTH_CHECK" -> {
                        System.out.println("test123456789");
                    }
                    default -> {
                        System.out.println("default asdfbnm,");
                    }
                }
            } else {
                JSONObject error = jobj.getJSONObject("error");
                String error_case = error.getString("error");
                String description = error.getString("description");
                System.out.println(error);
                System.out.println("Error waht? :" + error_case);
                System.out.println("Why?: " + description);
            }

        }

    }

//    public setConnectID2Player(Player p){
//        p.setConnectID()
//    }
}
