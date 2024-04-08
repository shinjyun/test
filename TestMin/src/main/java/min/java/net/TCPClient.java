package min.java.net;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.0.182", 5484);
			
			InputStream inputStream = socket.getInputStream();
			
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			
			System.out.println(objectInputStream.readObject());
			objectInputStream.close();
			socket.close();
		} catch (Exception e) {
			System.out.println("서버를 먼저 실행시켜야 합니다.");
		}
	}
}
