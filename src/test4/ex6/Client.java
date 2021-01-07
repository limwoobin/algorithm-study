package test4.ex6;

import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            Room room = new Room("1234");
            room.run();

//            socket = new Socket("127.0.0.1" , 7777);
//            Thread th1 = new Send(socket);
//            Thread th2 = new Receiver(socket);
//            th1.start();
//            th2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
