package swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class SwingTest4 extends JFrame{
	JLabel lab;
	JTree tree;
	
	SwingTest4(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultMutableTreeNode root = 
				new DefaultMutableTreeNode("커피");
		DefaultMutableTreeNode step1 = 
				new DefaultMutableTreeNode("자바 커피");
		DefaultMutableTreeNode step2 = 
				new DefaultMutableTreeNode("원두 커피");
		DefaultMutableTreeNode step2_1 = 
				new DefaultMutableTreeNode("아메리카노");
		DefaultMutableTreeNode step2_2 = 
				new DefaultMutableTreeNode("헤이즐넛");
		DefaultMutableTreeNode step2_3 = 
				new DefaultMutableTreeNode("라떼");
		
		root.add(step1);
		root.add(step2);
		step2.add(step2_1);
		step2.add(step2_2);
		step2.add(step2_3);
		
		tree = new JTree(root);
		JScrollPane scroll = new JScrollPane(tree);
		add(scroll);
		
		lab = new JLabel("여기에 선택한 항목이 나타납니다.");
		add("South", lab);
		
		tree.addMouseListener(new MouseHandler());
	}
	
	class MouseHandler extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			int selRow = tree.getRowForLocation(e.getX(), e.getY());
			TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
			
			if(selRow != -1){
				if(e.getClickCount() == 2){
					lab.setText(selPath.getLastPathComponent().toString());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		SwingTest4 test = new SwingTest4();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
