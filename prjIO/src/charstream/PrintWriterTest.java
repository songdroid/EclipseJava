package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String[] args) throws IOException {
		// TODO PrintWriter ����
		PrintWriter pw = 
				new PrintWriter(
					new BufferedWriter(
						new FileWriter("d:\\netsong7\\sungjuk.txt")));
		
		pw.println("**************����ǥ***************");
		pw.println("-----------------------------------------------");
		
		
		pw.close();
	}
}







