package menu;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import event.WindowClose;

public class MenuTest2 extends Frame implements ActionListener{
	MenuBar bar;
	Menu file;
	MenuItem file_open, file_save, file_exit;
	TextArea area;
	FileDialog fopen, fsave;
	
	public MenuTest2() {
		addWindowListener(new WindowClose());
		bar = new MenuBar();
		file = new Menu("파일");
		file_open = new MenuItem("파일 열기");
		file_save = new MenuItem("파일 저장");
		file_exit = new MenuItem("종료");
		area = new TextArea();
		fopen = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		fsave = new FileDialog(this, "파일 저장", FileDialog.SAVE);
		
		file.add(file_open);
		file.add(file_save);
		file.addSeparator();
		file.add(file_exit);
		
		bar.add(file);
		setMenuBar(bar);
		add("Center", area);
		
		file_exit.addActionListener(this);
		file_open.addActionListener(this);
		file_save.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("종료")){
			System.exit(0);
		}
		else if(e.getActionCommand().equals("파일 열기")){
			try{
				fopen.setVisible(true);
				String filename = fopen.getDirectory() + "\\" + fopen.getFile();
				BufferedReader br = 
						new BufferedReader(new FileReader(filename));
				
				String str;
				while((str=br.readLine()) != null){
					area.append(str + "\n");
				}
				br.close();
			}
			catch(Exception err){}
		}
		else{
			fsave.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		MenuTest2 test = new MenuTest2();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
