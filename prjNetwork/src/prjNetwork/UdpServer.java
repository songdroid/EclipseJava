package prjNetwork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Random;

class Fortune{
	private static final String[] today = {
		"주방에 가면 김샐 수", "기차보면 기찰 수", "학교가면 종칠 수",
		"강보면 물만날 수", "병원가면 피 볼수", "게임방가면 게임 끝날 수",
		"0자보면 공짜 얻을 수", "당구장가면 공칠 수", "대머리보면 빛볼 수",
		"도박하면 패가망신할 수"
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
			System.out.println("서버소켓 실패 : " + err);
		}
	}
	
	public static void main(String[] args) {
		new UdpServer();
	}
}
