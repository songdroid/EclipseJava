package prjNetwork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient1 {
	private static Socket client;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ���� �ּ� : ");
		String serverUrl = scan.next();
		
		try{
			client = new Socket(serverUrl, 9999);
			
			/*
			InputStream istream = client.getInputStream();
			DataInputStream distream = new DataInputStream(istream);
			System.out.println(distream.readUTF());
			
			istream.close();
			distream.close();
			*/
			
			OutputStream ostream = client.getOutputStream();
			DataOutputStream dostream = new DataOutputStream(ostream);
			System.out.print("������ �ϰ� ���� �� : ");
			String reply = scan.next();
			dostream.writeUTF(reply);
			
			ostream.close();
			dostream.close();
			client.close();
		}
		catch(Exception err){}
	}
}
