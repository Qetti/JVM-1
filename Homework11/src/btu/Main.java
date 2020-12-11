package btu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client client = new Client();
        Server server = new Server();
        client.start();
        server.start();
    }
}
