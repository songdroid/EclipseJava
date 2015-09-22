package bytestream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		// TODO 임의 접근 가능한 클래스
		
		int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		RandomAccessFile raf = 
			new RandomAccessFile("d:\\netsong7\\test5.txt", "rw");
		
		for(int i=0; i<data.length; i++){
			raf.writeInt(data[i]);
		}
		
		raf.seek(8);
		int search = raf.readInt();
		System.out.println(search);
		
		raf.seek(4 * 3);
		search = raf.readInt();
		System.out.println(search);
	}
}






