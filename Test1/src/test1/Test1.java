/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

/**
 *
 * @author helld
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        MyWebSocketClient client = new MyWebSocketClient();
        client.connect("ws://localhost:8080");
    }
    
}
