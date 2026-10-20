import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;

        try (
            Socket socket = new Socket(host, port);
            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(
                socket.getOutputStream(), true);
            BufferedReader keyboard = new BufferedReader(
                new InputStreamReader(System.in))
        ) {
            System.out.println("Connected to server.");

            String welcome = input.readLine();
            System.out.println("Server: " + welcome);

            String message;
            while (true) {
                System.out.print("Enter message: ");
                message = keyboard.readLine();
