package charstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ByteTest2 {
	public static void main(String[] args) throws IOException {
		// TODO byteStream 방식을 Character Stream방식으로 변환
		streamTest(System.in);
	}
	
	public static void streamTest(InputStream is) throws IOException{
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		//int input = 0;
		String input = null;
		while(true){
			//input = isr.read();
			input = br.readLine();
			
			//if(input == -1)
			if(input == null)
				break;
			
			//System.out.print((char)input);
			System.out.print(input);
		}
		
		isr.close();
		br.close();
	}
}






