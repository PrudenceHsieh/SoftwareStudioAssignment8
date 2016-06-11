package com.csclab.hc.socketsample;

/**
 * Created by NTHUCS on 2016/6/11.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server implements Runnable {

    int serverPort=4000;
    ServerSocket serverSocket;
    private BufferedReader reader;
    private PrintWriter writer;

    public static void main(String[] args) throws UnknownHostException {
        Thread calServer;
        calServer = new Thread(new Server());
        calServer.start();
    }

    public void run() {
        try {
            System.out.println("Server: Connecting...");

            serverSocket = new ServerSocket(serverPort);

            while(true){

                Socket socket = this.serverSocket.accept();
                System.out.println("Server: Receiving...");
                //OutputStream out;
                byte buf[] = new byte[1024];
                InputStream inputStream = socket.getInputStream();
                this.reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                this.writer=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                System.out.println("The result from app is: "+inputStream);
            }

        } catch (Exception e) {

            System.out.println("Server: Error");
            e.printStackTrace();

        }
    }
}
