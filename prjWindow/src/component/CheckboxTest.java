package component;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CheckboxTest extends Frame{
	Checkbox c1, c2, c3;
	Checkbox r1, r2;
	CheckboxGroup g;
	
	public CheckboxTest() {
		c1 = new Checkbox("등산", true);
		c2 = new Checkbox("낚시");
		c3 = new Checkbox("여행");
		
		setLayout(new FlowLayout());
		
		add(c1);
		add(c2);
		add(c3);
		
		g = new CheckboxGroup();
		r1 = new Checkbox("남자", false, g);
		r2 = new Checkbox("여자", false, g);
		
		add(r1);
		add(r2);
	}
	
	public static void main(String[] args) {
		// TODO Checkbox컴퍼넌트 예제
		CheckboxTest test = new CheckboxTest();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
