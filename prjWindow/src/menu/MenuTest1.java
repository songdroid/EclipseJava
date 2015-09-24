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
		file = new Menu("파일");
		edit = new Menu("편집");
		file_open = new Menu("파일 열기");
		file_save = new MenuItem("파일 저장");
		file_exit = new MenuItem("종료");
		edit_copy = new MenuItem("복사하기");
		edit_paste = new MenuItem("붙여넣기");
		edit_cut = new MenuItem("잘라내기");
		
		MenuItem file_open_text = new MenuItem("텍스트 파일");
		MenuItem file_open_image = new MenuItem("이미지 파일");
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
