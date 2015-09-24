package swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class SwingTest2 extends JFrame{
	JButton b;
	JLabel lab;
	ImageIcon icon1;
	
	SwingTest2(){
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		icon1 = new ImageIcon(getClass().getResource("/resource/duke_hips.gif"));
		b = new JButton("버튼");
		lab = new JLabel("스윙 라벨입니다", icon1, JLabel.LEFT);
		
		lab.setBorder(new EtchedBorder(Color.RED, Color.GRAY));
		b.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		add(b);
		add(lab);
	}
	
	public static void main(String[] args) {
		SwingTest2 test = new SwingTest2();
		//test.setSize(300, 400);
		test.pack();
		test.setVisible(true);
	}
}
