package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingTest4 extends JFrame{
	JLabel lab;
	JTree tree;
	
	SwingTest4(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultMutableTreeNode root = 
				new DefaultMutableTreeNode("Ŀ��");
		DefaultMutableTreeNode step1 = 
				new DefaultMutableTreeNode("�ڹ� Ŀ��");
		DefaultMutableTreeNode step2 = 
				new DefaultMutableTreeNode("���� Ŀ��");
		DefaultMutableTreeNode step2_1 = 
				new DefaultMutableTreeNode("�Ƹ޸�ī��");
		DefaultMutableTreeNode step2_2 = 
				new DefaultMutableTreeNode("�������");
		DefaultMutableTreeNode step2_3 = 
				new DefaultMutableTreeNode("��");
		
		root.add(step1);
		root.add(step2);
		step2.add(step2_1);
		step2.add(step2_2);
		step2.add(step2_3);
		
		tree = new JTree(root);
		JScrollPane scroll = new JScrollPane(tree);
		add(scroll);
		
		lab = new JLabel("���⿡ ������ �׸��� ��Ÿ���ϴ�.");
		add("South", lab);
	}
	
	public static void main(String[] args) {
		SwingTest4 test = new SwingTest4();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
