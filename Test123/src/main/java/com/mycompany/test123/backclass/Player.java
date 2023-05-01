/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test123.backclass;

/**
 *
 * @author helld
 */
public class Player {
    private String username;
    private String connectionID;
    
    public Player(String username, String connectionID){
        this.username = username;
        this.connectionID = connectionID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getConnectionID() {
        return connectionID;
    }

    public void setConnectionID(String connectionID) {
        this.connectionID = connectionID;
    }

    @Override
    public String toString() {
        return "Player{" + "username=" + username + ", connectionID=" + connectionID + '}';
    }
    
    
}
