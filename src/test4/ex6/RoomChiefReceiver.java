package test4.ex6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class RoomChiefReceiver extends Thread {
    private Socket socket;
    private Room room;

    public RoomChiefReceiver(Socket socket , Room room) {
        this.socket = socket;
        this.room = room;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            while (true) {
                String msg = reader.readLine();
                if (msg == null) {
                    break;
                }

                System.out.println("수신 : " + msg);
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
