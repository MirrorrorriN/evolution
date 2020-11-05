package com.mirror.evolution.applet.socket.tcp;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建同一连接
        Socket s = new Socket("127.0.0.1",6666);
        s.setKeepAlive(true);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("hello,I'm Alice！");
    }
}
