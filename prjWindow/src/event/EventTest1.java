package event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest1 extends Frame implements ActionListener{
	Button b1, b2;
	TextArea ta;
	
	public EventTest1() {
		b1 = new Button("눌러주세요");
		b2 = new Button("종료");
		ta = new TextArea();
		
		add("North", b1);
		add("Center", ta);
		add("South", b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("눌러주세요")){
			ta.setText(ta.getText() + "버튼이 눌렸어요....\n");
		}
		else{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		// TODO 이벤트소스와 이벤트핸들러가 같은 클래스인 경우
		EventTest1 test = new EventTest1();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
