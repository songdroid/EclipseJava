package charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		// TODO 파일로부터 입력받아 모니터로 출력
		FileReader fin = new FileReader("D:\\netsong7\\test1.txt");
		
		String input = null;
		BufferedReader br = new BufferedReader(fin);
		
		while(true){
			input = br.readLine();
			
			if(input == null)
				break;
			
			System.out.print(input);
		}
		
		fin.close();
		br.close();
	} 
}
