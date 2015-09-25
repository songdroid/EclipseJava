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
	String[] title = {"이름", "나이", "성별"};
	JTextField tName, tAge, tGender;
	JPanel panel;
	
	SwingTest6(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DefaultTableModel model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		scroll = new JScrollPane(table);
		btnAdd = new JButton("추가");
		btnDel = new JButton("삭제");
		tName = new JTextField("이름", 6);
		tAge = new JTextField("나이", 3);
		tGender = new JTextField("성별", 2);
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
		if(e.getActionCommand().equals("추가")){
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
				JOptionPane.showMessageDialog(null, "반드시 선택해야 합니다.");
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
