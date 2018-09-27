package cn.test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class test22 {
    static int count = 0;
	public static void main(String[] args) throws UnknownHostException, IOException {
            new test22().fun(9);
            
            System.out.println(count);
		
	}
	
	int fun(int i) {
		count += 1;
		if(i <= 3) return 1;
		else {
			return fun(i-2) + fun(i - 6) + 1;
		}
	}
	
}
