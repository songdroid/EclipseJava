package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) throws IOException {
		// TODO PrintWriter ����
		/*
		PrintWriter pw = 
				new PrintWriter(
					new BufferedWriter(
						new FileWriter("d:\\netsong7\\sungjuk.txt")));
		*/
		
		PrintWriter pw = new PrintWriter("d:\\netsong7\\sungjuk.txt");
		pw.println("*******************����ǥ*******************");
		pw.println("-----------------------------------------------");
		pw.printf("%3s : %-5d %5d %5.1f %n","ȫ�浿", 98, 67, (float)((98+67)/2));
		pw.printf("%3s : %5d %5d %5.1f %n","�Ӳ���", 88, 79, (float)((88+79)/2));
		pw.printf("%3s : %5d %5d %5.1f %n","�ŵ���", 100, 89, (float)((100+89)/2));
		
		pw.close();
		
		// ���Ͽ� �ִ� ������ �о ���
	}
}







