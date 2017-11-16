package com.example.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by zw on 2017/11/16.
 */
public class Server {

    public static void main(String[] args) {
        try {
            //第一步：先初始化一个服务器
            ServerSocket server = new ServerSocket(8888);
            //第二步：通过Accept方法接收用户的请求，同时进入阻塞
            System.err.println("等待接收用户的链接");
            Socket client = server.accept();

            // 第三步：服务器发消息(返回消息I/O)
            OutputStream out = client.getOutputStream();
            out.write("Hello".getBytes());
            out.close();
            System.err.println("Over......");
//			server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
