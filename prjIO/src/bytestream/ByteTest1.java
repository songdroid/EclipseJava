package bytestream;

import java.io.IOException;

public class ByteTest1 {
	public static void main(String[] args) throws IOException {
		// TODO Byte Stream ����1
		System.out.print("���ڿ� �Է�(10���ڱ���) : ");
		byte data[] = new byte[10];
		
		System.in.read(data);
		
		for(int i=0; i<data.length; i++){
			System.out.print((char)data[i]);
		}
	}
}
