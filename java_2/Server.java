import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server dang cho ket noi den tu khach hang...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("da ket noi");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in));
            Thread clientListener = new Thread(() -> {
                String message;
                try {
                    while ((message = in.readLine()) != null) {
                        System.out.println("Client: " + message);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            clientListener.start();          
            String serverMessage;
            while ((serverMessage = serverInput.readLine()) != null) {
                out.println("Server: " + serverMessage);
            }
            in.close();
            out.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
