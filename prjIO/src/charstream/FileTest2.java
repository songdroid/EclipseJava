package charstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		// TODO Ű����κ��� �Է¹޾� ���Ϸ� ���(����)�ϴ� ���
		// stop ���ڿ��� �Է��ϸ� ����
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
 * 1. ����ǥ v4 - ���� ó��(Ű����κ��� �Է¹޾� ���ϰ� ����ͷ� ���)
 * 
 * 2. copy���α׷� - ���Ϸκ��� �Է¹޾� ���Ϸ� ����ϴ� ���α׷�
 * 		java jCopy a.txt b.txt
 * 		(a������ �о�鿩 b���Ϸ� �����Ѵ�)
 */







