package test4.ex7;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String serverIp = "127.0.0.1";
        try(Socket socket = new Socket(serverIp, 8080)){

            // 입력스트림
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);


            dis.close();
        }catch(IOException e) {
        }
    }
}
