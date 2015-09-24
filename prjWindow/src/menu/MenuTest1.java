package menu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import event.WindowClose;

public class MenuTest1 extends Frame implements ActionListener{
	MenuBar bar;
	Menu file, edit, file_open;
	MenuItem file_save, file_exit;
	MenuItem edit_copy, edit_paste, edit_cut;
	
	public MenuTest1() {
		addWindowListener(new WindowClose());
		
		bar = new MenuBar();
		file = new Menu("����");
		edit = new Menu("����");
		file_open = new Menu("���� ����");
		file_save = new MenuItem("���� ����");
		file_exit = new MenuItem("����");
		edit_copy = new MenuItem("�����ϱ�");
		edit_paste = new MenuItem("�ٿ��ֱ�");
		edit_cut = new MenuItem("�߶󳻱�");
		
		MenuItem file_open_text = new MenuItem("�ؽ�Ʈ ����");
		MenuItem file_open_image = new MenuItem("�̹��� ����");
		file_open.add(file_open_text);
		file_open.add(file_open_image);
		
		file.add(file_open);
		file.add(file_save);
		file.addSeparator();
		file.add(file_exit);
		edit.add(edit_copy);
		edit.add(edit_cut);
		edit.add(edit_paste);
		
		bar.add(file);
		bar.add(edit);
		
		setMenuBar(bar);
		
		file_exit.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		MenuTest1 test = new MenuTest1();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
