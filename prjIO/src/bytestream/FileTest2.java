package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		// TODO Ű����κ��� �Է¹޾� ���Ϸ� ���(����)�ϴ� ���
		FileOutputStream fout = 
				new FileOutputStream("D:\\netsong7\\test3.txt", true);
		
		int input = 0;
		while(true){
			input = System.in.read();
			
			if(input == -1)
				break;
			
			fout.write((char)input);
		}
		
		fout.close();
	}
}
/*
 * 1. ����ǥ v4 - ���� ó��(Ű����κ��� �Է¹޾� ���ϰ� ����ͷ� ���)
 * 
 * 2. copy���α׷� - ���Ϸκ��� �Է¹޾� ���Ϸ� ����ϴ� ���α׷�
 * 		java jCopy a.txt b.txt
 * 		(a������ �о�鿩 b���Ϸ� �����Ѵ�)
 */







