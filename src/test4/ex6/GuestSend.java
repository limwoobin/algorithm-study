package test4.ex6;

import sun.tools.jar.CommandLine;

import java.io.*;
import java.net.Socket;

public class GuestSend extends Thread {
    private Socket socket;

    public GuestSend(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(socket.getOutputStream())) {

            while (true) {
                System.out.print("게스트: ");
                String msg = reader.readLine();
                writer.println(msg);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
