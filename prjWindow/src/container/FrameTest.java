package container;

import java.awt.Button;
import java.awt.Frame;

public class FrameTest {
	Button b;
	Frame f;
	
	FrameTest(){
		f = new Frame();
		b = new Button("눌러 주세요");
		
		f.add(b);
		f.setSize(200, 300);
		f.setVisible(true);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		f.dispose();
	}

	public static void main(String[] args) {
		// TODO Frame컨테이너 예제
		new FrameTest();
	}
}
