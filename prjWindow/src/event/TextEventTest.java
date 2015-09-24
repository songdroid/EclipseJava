package event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextEventTest extends Frame implements TextListener, KeyListener{
	Button b;
	TextArea area;
	TextField field;

	public TextEventTest() {
		addWindowListener(new WindowClose());
		b = new Button("OK");
		area = new TextArea();
		field = new TextField();
		
		add("North", b);
		add("Center", area);
		add("South", field);
		
		field.addTextListener(this);
		field.addKeyListener(this);
	}
	
	@Override
	public void textValueChanged(TextEvent e) {
		//area.setText(area.getText() + "내용이 바뀌었어요. : " +
		//	field.getText() + "\n");		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//area.setText(area.getText() + field.getText() + "\n");
		area.setText(area.getText() + e.getKeyChar() + "\n");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		TextEventTest test = new TextEventTest();
		test.setSize(300, 400);
		test.setVisible(true);
	}
}
