package prjNetwork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer1 {
	private ServerSocket server;
	private Socket client;
	private final int PORT = 9999;
	
	public TcpServer1() {
		try{
			server = new ServerSocket(PORT);
			while(true){
				
				client = server.accept();
				System.out.println(client.getInetAddress() + "가 접속했습니다. : " + client.getPort());
				
				OutputStream ostream = client.getOutputStream();
				DataOutputStream dostream = new DataOutputStream(ostream);
				dostream.writeUTF(client.getInetAddress() + 
					"님 접속을 환영합니다.");
				
				ostream.close();
				dostream.close();
				
				InputStream istream = client.getInputStream();
				DataInputStream distream = new DataInputStream(istream);
				System.out.println(distream.readUTF());
				
				istream.close();
				distream.close();
				
				client.close();
			}
		}
		catch(Exception err){
			System.out.println("서버 소켓 생성 실패 : " + err);
		}
	}
	
	public static void main(String[] args) {
		new TcpServer1();
	}
}
