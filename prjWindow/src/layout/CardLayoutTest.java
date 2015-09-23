package layout;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTest extends Frame implements ActionListener{
	CardLayout card;
	Panel p1, p2;
	Button btnPrev, btnNext;
	Button b3, b4, b5;
	
	public CardLayoutTest() {
		p1 = new Panel();
		p2 = new Panel();
		btnPrev = new Button("����");
		btnNext = new Button("����");
		card = new CardLayout();
		b3 = new Button("ù��° ȭ��");
		b4 = new Button("�ι�° ȭ��");
		b5 = new Button("����° ȭ��");
		
		p1.add(btnPrev);
		p1.add(btnNext);
		add("North", p1);
		
		p2.setLayout(card);
		p2.add("1", b3);
		p2.add("2", b4);
		p2.add("3", b5);
		add(p2);
		
		btnPrev.addActionListener(this);
		btnNext.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����")){
			card.previous(p2);
		}
		else{
			card.next(p2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardLayoutTest card = new CardLayoutTest();
		card.setSize(300, 400);
		card.setVisible(true);
	}
}
