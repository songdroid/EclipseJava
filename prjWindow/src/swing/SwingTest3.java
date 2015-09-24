package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class SwingTest3 extends JFrame{
	JTextField field;
	JButton btn;
	JLabel lab;
	
	SwingTest3(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		field = new JTextField(30);
		btn = new JButton("Ȯ��");
		lab = new JLabel("�ȳ��ϼ���.....");
		
		add("Center", field);
		add("East", btn);
		add("South", lab);
		
		field.addKeyListener(new KeyHandler());
	}
	
	class KeyHandler extends KeyAdapter{
		@Override
		public void keyTyped(KeyEvent e) {
			if(field.getText().isEmpty()){
				//JOptionPane.showMessageDialog(null, "�ݵ�� ������ �Է�");
				//JOptionPane.showConfirmDialog(null, "��/�ƴϿ� �߿��� ����", "��/�ƴϿ�", JOptionPane.YES_NO_OPTION);
				JOptionPane.showInputDialog("������ �Է�");
			}
			
			if(e.getKeyChar() == KeyEvent.VK_ENTER){
				lab.setText(field.getText());
			}
		}
	}
	
	public static void main(String[] args) {
		SwingTest3 test = new SwingTest3();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
