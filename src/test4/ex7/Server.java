package test4.ex7;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8080)){
            while(true) {
                // 요청이 들어올때까지 대기, 클라이언트의 연결요청이 들어오면 클라이언트소켓과 통신할 소켓을 반환
                Socket socket = serverSocket.accept();

                // 출력스트림
                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("Message from server");

                dos.close();
            }
        }catch(IOException e) {
        }

    }

}
