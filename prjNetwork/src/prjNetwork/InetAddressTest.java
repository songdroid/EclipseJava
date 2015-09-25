package prjNetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		//String name = args[0];
		
		//System.out.println(InetAddress.getByName(name).getHostAddress());
		
		//InetAddress[] ia = InetAddress.getAllByName(name);
		//for(int i=0; i<ia.length; i++){
		//	System.out.println(ia[i].getHostAddress());
		//}
		
		//System.out.println(InetAddress.getLocalHost().getHostAddress());
		
		System.out.println(InetAddress.getLoopbackAddress().getHostAddress());
	}
}
