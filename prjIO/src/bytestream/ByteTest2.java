package bytestream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteTest2 {
	public static void main(String[] args) throws IOException {
		// TODO ByteStream 방식 예제2
		streamTest(System.in, System.out);
	}
	
	public static void streamTest(InputStream is, OutputStream os) throws IOException{
		int input = 0;
		while(true){
			input = is.read();
			
			if(input == -1)
				break;
			
			//System.out.print((char)input);
			os.write((char)input);
		}
	}
}






