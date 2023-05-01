/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Communicator;

import java.util.Scanner;

/**
 *
 * @author helld
 */
public class MsgSendTest {
    public static void tester() throws Exception {
        Scanner sc = new Scanner(System.in);
        
        MessageSender send = new MessageSender();
        
        String name = sc.nextLine();
        
        if (name.equals("yumyum")){
            send.sendMsg("{\"handler\":\"hit\"}");
        }
        else if (name.equals("mama")){
            send.sendMsg("{\"handler\":\"stand\"}");
        } 
        else {
            send.sendMsg("{\"handler\":\"debug\"}");
        }
        
        
    }
}
