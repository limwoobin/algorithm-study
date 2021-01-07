package test4.ex6;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class RoomChiefSend extends Thread {
    private Socket socket;
    private Room room;
    private boolean isFirst = true;

    public RoomChiefSend(Socket socket , Room room) {
        this.socket = socket;
        this.room = room;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(socket.getOutputStream())) {

            System.out.println("바롴ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(room);
            oos.flush();

            if (room.isSecretRoom() && isFirst) {
                String password = reader.readLine();
                if (!room.getPassword().equals(password)) {
                    System.out.println("패스워드가 다릅니다.");
                    socket.close();
                }
                isFirst = false;
            }

            while (true) {
                System.out.print("방장: ");
                String msg = reader.readLine();
                if ("q".equals(msg)) {
                    socket.close();
                }

                writer.println(msg);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
