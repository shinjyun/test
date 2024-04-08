package min.java.net;

import java.net.MalformedURLException;
import java.net.URL;

public class InformationURL {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://www.naver.com/test.html");
		
		System.out.println("프로토콜 : " + url.getProtocol());
		
		System.out.println("호스트 : " + url.getHost());
		
		System.out.println("디폴트 포트 : " + url.getDefaultPort());
		
		System.out.println("기본 파일명 : " + url.getFile());
	}
}
