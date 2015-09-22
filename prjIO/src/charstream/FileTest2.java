package charstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력받아 파일로 출력(저장)하는 기능
		// stop 문자열을 입력하면 종료
		FileWriter fout = 
				new FileWriter("D:\\netsong7\\test6.txt");		
		String input;
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			input = br.readLine();
			
			if(input.equals("stop"))
				break;
			
			input += "\r\n";
			fout.write(input);
		}
		
		fout.close();
		br.close();
	}
}
/*
 * 1. 성적표 v4 - 파일 처리(키보드로부터 입력받아 파일과 모니터로 출력)
 * 
 * 2. copy프로그램 - 파일로부터 입력받아 파일로 출력하는 프로그램
 * 		java jCopy a.txt b.txt
 * 		(a파일을 읽어들여 b파일로 복사한다)
 */







