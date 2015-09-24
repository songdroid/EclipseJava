package event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest2 extends Frame {
	Button b1, b2;
	TextArea ta;
	
	public EventTest2() {
		b1 = new Button("눌러주세요");
		b2 = new Button("종료");
		ta = new TextArea();
		
		add("North", b1);
		add("Center", ta);
		add("South", b2);
		
		EventDemo2 demo = new EventDemo2(ta, this);
		
		b1.addActionListener(demo);
		b2.addActionListener(demo);
	}
	
	class EventDemo2 implements ActionListener{
		private TextArea ta;
		private Frame f;
		
		EventDemo2(TextArea t, Frame f){
			ta = t;
			this.f = f;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("눌러주세요")){
				ta.setText(ta.getText() + "버튼이 눌렸어요....\n");
			}
			else{
				// System.exit(0);
				// dispose()로 처리
				f.dispose();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO 이벤트소스와 이벤트핸들러가 다른 클래스인 경우
		EventTest2 test = new EventTest2();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
