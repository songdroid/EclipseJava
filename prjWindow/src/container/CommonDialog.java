package container;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonDialog extends Frame implements ActionListener{
	FileDialog fopen, fsave;
	Panel p;
	Button btnOpen, btnSave;
	
	public CommonDialog() {
		p = new Panel();
		btnOpen = new Button("���� ����");
		btnSave = new Button("���� ����");
		fopen = new FileDialog(this, "���� ����", FileDialog.LOAD);
		fsave = new FileDialog(this, "���� ����", FileDialog.SAVE);
		
		p.add(btnOpen);
		p.add(btnSave);
		
		add(p);
		
		btnOpen.addActionListener(this);
		btnSave.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("���� ����")){
			fopen.setVisible(true);
			System.out.println(fopen.getDirectory());
			System.out.println(fopen.getFile());
		}
		else{
			fsave.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		// TODO FileDialog ����
		CommonDialog common = new CommonDialog();
		common.setSize(300, 400);
		common.setVisible(true);
	}
}
