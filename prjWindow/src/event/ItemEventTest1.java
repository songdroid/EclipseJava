package event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventTest1 extends Frame implements ItemListener{
	Panel p;
	Checkbox c1, c2, c3, r1, r2;
	CheckboxGroup cg;
	TextArea area;
	
	public ItemEventTest1() {
		addWindowListener(new WindowClose());
		p = new Panel();
		c1 = new Checkbox("����");
		c2 = new Checkbox("���");
		c3 = new Checkbox("�ʷϻ�");
		cg = new CheckboxGroup();
		r1 = new Checkbox("����", cg, true);
		r2 = new Checkbox("����", cg, false);
		area = new TextArea();
		
		p.add(c1);
		p.add(c2);
		p.add(c3);
		p.add(r1);
		p.add(r2);
		
		add("North", p);
		add("Center", area);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox c = (Checkbox)e.getSource();
		
		/*
		if(c.getLabel().equals("����")){
			if(c.getState() == true){
				area.setText("���Ⱑ ���õǾ����ϴ�.");
			}
			else{
				area.setText("���Ⱑ �����Ǿ����ϴ�.");
			}
		}
		else if(c.getLabel().equals("���")){
			if(c.getState() == true){
				area.setText("����� ���õǾ����ϴ�.");
			}
			else{
				area.setText("����� �����Ǿ����ϴ�.");
			}
		}
		else if(c.getLabel().equals("�ʷϻ�")){
			if(c.getState() == true){
				area.setText("�ʷϻ� ���õǾ����ϴ�.");
			}
			else{
				area.setText("�ʷϻ� �����Ǿ����ϴ�.");
			}
		}
		*/
		
		if(c.getState() == true){
			area.setText( c.getLabel() + "��(��) ���õǾ����ϴ�.");
		}
		else{
			area.setText(c.getLabel() + "��(��) �����Ǿ����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		ItemEventTest1 test = new ItemEventTest1();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
