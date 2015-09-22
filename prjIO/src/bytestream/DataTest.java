package bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTest {
	public static void main(String[] args) throws IOException {
		// TODO DataInputStream °ú DataOutputStream
		
		FileOutputStream  fout = new FileOutputStream("d:\\netsong7\\test4.txt");
		
		DataOutputStream dout = new DataOutputStream(fout);
		dout.writeChar('°¡');
		dout.writeDouble(3.14);
		dout.writeInt(100);
		dout.writeBoolean(true);
		
		dout.close();
		fout.close();
		
		FileInputStream  fin = new FileInputStream("d:\\netsong7\\test4.txt");
		
		DataInputStream din = new DataInputStream(fin);
		System.out.println(din.readChar());
		System.out.println(din.readDouble());
		System.out.println(din.readInt());
		System.out.println(din.readBoolean());
		
		din.close();
		fin.close();
	}
}









