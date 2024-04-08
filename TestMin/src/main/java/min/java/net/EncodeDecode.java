package min.java.net;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeDecode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "홍 길동(hong)";
		
		String encodeString = URLEncoder.encode(string, "EUC-KR");
		
		String decodeString = URLDecoder.decode(encodeString, "UTF-8");
		System.out.println("문자열 인코딩 : " + encodeString);
		System.out.println("문자열 디코딩 : " + decodeString);
	}
}
