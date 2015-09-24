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
		c1 = new Checkbox("딸기");
		c2 = new Checkbox("사과");
		c3 = new Checkbox("초록색");
		cg = new CheckboxGroup();
		r1 = new Checkbox("남성", cg, true);
		r2 = new Checkbox("여성", cg, false);
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
		if(c.getLabel().equals("딸기")){
			if(c.getState() == true){
				area.setText("딸기가 선택되었습니다.");
			}
			else{
				area.setText("딸기가 해제되었습니다.");
			}
		}
		else if(c.getLabel().equals("사과")){
			if(c.getState() == true){
				area.setText("사과가 선택되었습니다.");
			}
			else{
				area.setText("사과가 해제되었습니다.");
			}
		}
		else if(c.getLabel().equals("초록색")){
			if(c.getState() == true){
				area.setText("초록색 선택되었습니다.");
			}
			else{
				area.setText("초록색 해제되었습니다.");
			}
		}
		*/
		
		if(c.getState() == true){
			area.setText( c.getLabel() + "이(가) 선택되었습니다.");
		}
		else{
			area.setText(c.getLabel() + "이(가) 해제되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		ItemEventTest1 test = new ItemEventTest1();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
