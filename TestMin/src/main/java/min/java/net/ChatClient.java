package min.java.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Thread{
	private static Socket socket;
	public static void main(String[] args) throws Exception {
		socket = new Socket("192.168.0.182", 5484);
		InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
		BufferedReader sendRead = new BufferedReader(inputStreamReader1);
		
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream);
		
		InputStream inputStream = socket.getInputStream();
		InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream);
		BufferedReader receiveRead = new BufferedReader(inputStreamReader2);
		System.out.println("대화를 입력한 후 Enter 키를 누르십시오.");
		String receiveMessage = "";
		String sendMessage = "";
		while (true) {
			sendMessage = sendRead.readLine();
			printWriter.println(sendMessage);
			
			printWriter.flush();
			if ((receiveMessage = receiveRead.readLine()) != null) {
				System.out.println(receiveMessage);
			}
		}
	}
}
