package bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		// TODO ���Ϸκ��� �Է¹޾� ����ͷ� ���
		FileInputStream fin = 
				new FileInputStream("D:\\netsong7\\test1.txt");
		
		int input = 0;
		OutputStream os = System.out;
		while(true){
			input = fin.read();
			
			if(input == -1)
				break;
			
			//System.out.print((char)input);
			os.write((char)input);
			os.flush();
		}
		
		fin.close();
	} 
}
