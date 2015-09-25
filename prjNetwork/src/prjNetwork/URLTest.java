package prjNetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*
 * 프로토콜명://호스트명:포트번호/파일명#섹션명
 * -------------------------------------
 * http://www.naver.com:80/index.html
 */
public class URLTest {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("접속할 url입력 : ");
		String strUrl = scan.next();
		
		URL myUrl = new URL(strUrl);
		
		BufferedReader br = 
			new BufferedReader(
				new InputStreamReader(myUrl.openStream(), "utf-8"));
		
		/*
		String data = br.readLine();
		while(data != null){
			System.out.println(data);
			data = br.readLine();
		}
		*/
		
		String data;
		while((data = br.readLine()) != null){
			System.out.println(data);
		}
	}
}
