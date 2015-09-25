package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SwingTest6 extends JFrame implements ActionListener{
	JTable table;
	JButton btnAdd, btnDel;
	JScrollPane scroll;
	String[] title = {"�̸�", "����", "����"};
	JTextField tName, tAge, tGender;
	JPanel panel;
	
	SwingTest6(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DefaultTableModel model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		scroll = new JScrollPane(table);
		btnAdd = new JButton("�߰�");
		btnDel = new JButton("����");
		tName = new JTextField("�̸�", 6);
		tAge = new JTextField("����", 3);
		tGender = new JTextField("����", 2);
		panel = new JPanel();
		
		add("Center", scroll);
		panel.add(tName);
		panel.add(tAge);
		panel.add(tGender);
		panel.add(btnAdd);
		panel.add(btnDel);
		add("South", panel);
		
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("�߰�")){
			String[] data = new String[3];
			data[0] = tName.getText();
			data[1] = tAge.getText();
			data[2] = tGender.getText();
			
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.addRow(data);
		}
		else{
			int idx = table.getSelectedRow();
			
			if(idx == -1){
				JOptionPane.showMessageDialog(null, "�ݵ�� �����ؾ� �մϴ�.");
				return;
			}
			
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.removeRow(idx);
		}
	}
	
	public static void main(String[] args) {
		SwingTest6 test = new SwingTest6();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
