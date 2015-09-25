package prjNetwork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Random;

class Fortune{
	private static final String[] today = {
		"�ֹ濡 ���� ��� ��", "�������� ���� ��", "�б����� ��ĥ ��",
		"������ ������ ��", "�������� �� ����", "���ӹ氡�� ���� ���� ��",
		"0�ں��� ��¥ ���� ��", "�籸�尡�� ��ĥ ��", "��Ӹ����� ���� ��",
		"�����ϸ� �а������� ��"
	};
	
	public static String choice(){
		int num = new Random().nextInt(10);
		return today[num];
	}
}

public class UdpServer {
	DatagramSocket socket;
	private final int PORT = 10000;
	DatagramPacket packet;
	
	UdpServer(){
		try{
			socket = new DatagramSocket(PORT);
			while(true){
				byte[] buf = new byte[512];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				
				String reply = Fortune.choice();
				buf = reply.getBytes();
				packet = new DatagramPacket(buf, buf.length, 
										packet.getAddress(), packet.getPort());
				socket.send(packet);
			}
		}
		catch(Exception err){
			System.out.println("�������� ���� : " + err);
		}
	}
	
	public static void main(String[] args) {
		new UdpServer();
	}
}
