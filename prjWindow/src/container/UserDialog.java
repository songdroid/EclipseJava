package container;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MessageDialog extends Dialog implements ActionListener{
	String message;
	Button btnClose;
	
	public MessageDialog(Frame f, String msg) {
		super(f, "�޽��� ��ȭ����", true);
		message = msg;
		
		btnClose = new Button("����");
		btnClose.addActionListener(this);
	}
	
	public void dialogUI(){
		Label lab = new Label(message);
		add("North", lab);
		add(btnClose);
		
		setBackground(Color.LIGHT_GRAY);
		setSize(300, 150);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();		
	}
}

public class UserDialog extends Frame implements ActionListener{
	Panel p;
	Button btnOpen, btnClose;
	
	public UserDialog() {
		p = new Panel();
		btnOpen = new Button("���̾�α� ����");
		btnClose = new Button("����");
		
		p.add(btnOpen);
		p.add(btnClose);
		
		add(p);
		
		btnOpen.addActionListener(this);
		btnClose.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("���̾�α� ����")){
			MessageDialog md = new MessageDialog(this, "�̰��� �׽�Ʈ �Դϴ�.");
			md.dialogUI();
		}
		else{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		UserDialog user = new UserDialog();
		user.setSize(500, 600);
		user.setVisible(true);
	}
}
