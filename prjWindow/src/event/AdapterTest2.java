package event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AdapterTest2 extends Frame {
	public AdapterTest2() {
		addWindowListener(new WindowClose());
	}
	
	public static void main(String[] args) {
		AdapterTest2 test = new AdapterTest2();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
