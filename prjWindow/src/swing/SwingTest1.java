package swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest1 extends JFrame{
	JButton b;
	ImageIcon icon1, icon2;
	
	SwingTest1(){
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b = new JButton("¹öÆ°");
		icon1 = new ImageIcon(getClass().getResource("/resource/duke_point.gif"));
		icon2 = new ImageIcon(getClass().getResource("/resource/duke_flip.gif"));
		
		b.setIcon(icon1);
		b.setPressedIcon(icon2);
		
		add(b);
	}
	
	public static void main(String[] args) {
		SwingTest1 test = new SwingTest1();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
