package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) throws IOException {
		// TODO PrintWriter 예제
		/*
		PrintWriter pw = 
				new PrintWriter(
					new BufferedWriter(
						new FileWriter("d:\\netsong7\\sungjuk.txt")));
		*/
		
		PrintWriter pw = new PrintWriter("d:\\netsong7\\sungjuk.txt");
		pw.println("*******************성적표*******************");
		pw.println("-----------------------------------------------");
		pw.printf("%3s : %-5d %5d %5.1f %n","홍길동", 98, 67, (float)((98+67)/2));
		pw.printf("%3s : %5d %5d %5.1f %n","임꺽정", 88, 79, (float)((88+79)/2));
		pw.printf("%3s : %5d %5d %5.1f %n","신돌석", 100, 89, (float)((100+89)/2));
		
		pw.close();
		
		// 파일에 있는 내용을 읽어서 출력
	}
}







