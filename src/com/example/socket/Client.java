package com.example.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by zw on 2017/11/16.
 */
public class Client {

    public static void main(String[] args) {
        try {
            //创建一个客户
            Socket client = new Socket("127.0.0.1", 8888);
            //客户端接收消息
            InputStream in = client.getInputStream();
            byte[] b = new byte[1024];
            int len = 0;
            while((len=in.read(b)) != -1){
                String s = new String(b,0,len);
                System.out.println("我是客户："+s);
            }
            in.close();
//			client.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
