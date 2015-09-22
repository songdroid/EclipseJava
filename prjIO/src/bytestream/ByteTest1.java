package bytestream;

import java.io.IOException;

public class ByteTest1 {
	public static void main(String[] args) throws IOException {
		// TODO Byte Stream 예제1
		System.out.print("문자열 입력(10문자까지) : ");
		byte data[] = new byte[10];
		
		System.in.read(data);
		
		for(int i=0; i<data.length; i++){
			System.out.print((char)data[i]);
		}
	}
}
