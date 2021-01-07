package test4.ex6;

import java.net.Socket;

public class Client2 {
    public static void main(String[] args) {
        Socket socket = null;

        try {
            socket = new Socket("127.0.0.1" , 7777);
            Thread th1 = new GuestSend(socket);
            Thread th2 = new GuestReceiver(socket);
            th1.start();
            th2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
