package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class SwingTest5 extends JFrame implements ActionListener{
	JTable table;
	JButton btn;
	JScrollPane scroll;
	String[] title = {"�̸�", "����", "����"};
	Object data[][] = {	{"ȫ�浿", 24, "��"}, 
						{"������", 22, "��"},
						{"������", 25, "��"},
						{"������", 25, "��"},
						{"�Ż��Ӵ�", 25, "��"}};
	
	SwingTest5(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table = new JTable(data, title);
		scroll = new JScrollPane(table);
		btn = new JButton("���");
		
		add("Center", scroll);
		add("South", btn);
		
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TableModel model = table.getModel();
		
		for(int i=0; i<model.getColumnCount(); i++){
			System.out.print(model.getColumnName(i) + "\t");
		}
		
		System.out.println("\n-----------------------------------------");
		
		for(int i=0; i<model.getRowCount(); i++){
			for(int j=0; j<model.getColumnCount(); j++){
				System.out.print(model.getValueAt(i, j) + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		SwingTest5 test = new SwingTest5();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
