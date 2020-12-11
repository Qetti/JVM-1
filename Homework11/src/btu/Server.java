package btu;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread {
    Socket socket;
    ObjectInputStream inputStream;
    String text;
    ObjectOutputStream outputStream;

    public void run(){
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            while (true) {
                socket = serverSocket.accept();
                inputStream = new ObjectInputStream(socket.getInputStream());
                text = inputStream.readObject().toString();
                System.out.println("Client -> " + text);
                Scanner scanner = new Scanner(System.in);
                text = scanner.nextLine();
                outputStream = new ObjectOutputStream(socket.getOutputStream());
                outputStream.writeObject(text);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
