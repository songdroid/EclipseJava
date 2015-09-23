package container;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTest extends Frame implements ActionListener{
	Panel p1, p2;
	Button b1, b2, b3, b4;
	
	PanelTest(){
		setLayout(new FlowLayout());
		
		p1 = new Panel();
		p2 = new Panel();
		b1 = new Button("패널2 보이기");
		b2 = new Button("패널2 안보이기");
		b3 = new Button("패널1 보이기");
		b4 = new Button("패널1 안보이기");
		
		p1.setBackground(Color.CYAN);
		p2.setBackground(Color.LIGHT_GRAY);
		
		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		add(p1);
		add(p2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setSize(400, 500);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println(e);
		
		//Button b = (Button)e.getSource();
		//String lab = b.getLabel();
		
		String lab = e.getActionCommand();
		
		if(lab.equals("패널2 보이기")){
			p2.setVisible(true);
		}
		else if(lab.equals("패널2 안보이기")){
			p2.setVisible(false);
		}
		else if(lab.equals("패널1 보이기")){
			p1.setVisible(true);
		}
		else{
			p1.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		// TODO Panel 예제
		new PanelTest();
	}
}
