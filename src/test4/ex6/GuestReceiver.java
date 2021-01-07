package test4.ex6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class GuestReceiver extends Thread {
    private Socket socket;
    private boolean isFirst = true;

    public GuestReceiver(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Room room = (Room) ois.readObject();
            System.out.println("zzzzzzzzzzzzzzzz");

            if (room.isSecretRoom() && isFirst) {
                System.out.print("패스워드 입력: ");
                String msg = reader.readLine();
                writer.println(msg);
                writer.flush();
                isFirst = false;
            }

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
