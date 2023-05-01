package com.mycompany.test123.backclass;

import org.json.JSONObject;

/**
 *
 * @author helld
 */
public class HandlerCheck {

    public HandlerCheck(String message) {
        // create object to turn json to string
        JSONObject jobj = new JSONObject(message);
        JSONObject n_content = null; // to use if content is a object

        System.out.println("JSON Object: " + jobj);

        Object checker = jobj.get("content"); // to check if content is a object

        // convert to string
        String handler = jobj.getString("handler");
        String status = jobj.getString("status");
        String error = jobj.getString("error");
        String description = jobj.getString("description");

        // check content
        if (checker instanceof JSONObject) {
            System.out.println("c_Obj");
            n_content = jobj.getJSONObject("content");
            System.out.println("new content: " + n_content);
        } else {
            System.out.println("c_Word");
        }

        System.out.println(handler);
        System.out.println();

        // doing case stuff
        if (status.equals("OK")) {
            switch (handler) {
                case "CONNECTION_AUTHROIZED" -> {
                    Player user = new Player(n_content.getString("username"), n_content.getString("connectionId"));
                    System.out.println(user.toString());
                }
                case "READY_STATE" -> {
                    System.out.println("test1234567");
                }
                case "UPDATE_CARDS" -> {

                }
                case "HIT_EVENT" -> {

                }
                default -> {

                }
            }
        } else {
            System.out.println("else");
        }
    }

}
