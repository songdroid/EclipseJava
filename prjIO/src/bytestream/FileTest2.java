package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력받아 파일로 출력(저장)하는 기능
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
 * 1. 성적표 v4 - 파일 처리(키보드로부터 입력받아 파일과 모니터로 출력)
 * 
 * 2. copy프로그램 - 파일로부터 입력받아 파일로 출력하는 프로그램
 * 		java jCopy a.txt b.txt
 * 		(a파일을 읽어들여 b파일로 복사한다)
 */







