package test4.ex6;

import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

public class Room implements Serializable {
    private String password;
    private boolean isSecretRoom;

    public Room() {
        isSecretRoom = false;
    }

    public Room(String password) {
        this.password = password;
        this.isSecretRoom = true;
    }

    public boolean isSecretRoom() {
        return isSecretRoom;
    }

    public String getPassword() {
        return password;
    }

    public void run() {
        Socket socket = null;

        try (ServerSocket server_socket = new ServerSocket(7777)) {
            socket = server_socket.accept();
            Thread th1 = new RoomChiefSend(socket , this);
            Thread th2 = new RoomChiefReceiver(socket , this);
            th1.start();
            th2.start();
        }catch(Exception e) {
            e.printStackTrace();
        };
    }
}
