package prjNetwork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
	private DatagramSocket socket;
	private DatagramPacket packet;
	private static String serverIp = "127.0.0.1";
	
	public static void main(String[] args) {
		UdpClient client = new UdpClient();
		try{
			client.socket = new DatagramSocket();
			
			byte[] buf = new byte[512];
			InetAddress addr = InetAddress.getByName(serverIp);
			client.packet = new DatagramPacket(buf, buf.length, addr, 10000);
			client.socket.send(client.packet);
			
			client.packet = new DatagramPacket(buf, buf.length);
			client.socket.receive(client.packet);
			
			System.out.println("¿À´ÃÀÇ ¿î¼¼ : " + 
						new String(client.packet.getData()));
			
			client.socket.close();
		}
		catch(Exception err){ err.printStackTrace(); }
	}
}
