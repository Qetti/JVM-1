package btu;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread{
    Socket socket;
    ObjectOutputStream outputStream;
    String text;
    ObjectInputStream inputStream;

    public void run(){
        try {
            while (true) {
                socket = new Socket(InetAddress.getByName("localhost"), 8080);
                outputStream = new ObjectOutputStream(socket.getOutputStream());
                Scanner scanner = new Scanner(System.in);
                text = scanner.nextLine();
                outputStream.writeObject(text);
                inputStream = new ObjectInputStream(socket.getInputStream());
                text = inputStream.readObject().toString();
                System.out.println("Server -> " + text);
                if(text.equals("--")){
                    socket.close();
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
