package min.java.net;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) throws UnknownHostException {
		String name = "www.google.co.kr";
		InetAddress inetAddress = InetAddress.getByName(name);
		System.out.println(inetAddress);
	}
}
