abstract class TwoDShape{
	private double width;
	private double height;
	private String name;
	
	TwoDShape(){}
	TwoDShape(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	public double getWidth() {	return width;	}
	public double getHeight() {	return height;	}
	public String getName() {	return name;	}
	
	/*
	double getArea(){
		return 0.0;
	}
	*/
	
	abstract double getArea();
}

class Triangle extends TwoDShape{
	Triangle(double width, double height, String name){
		super(width, height, name);
	}
	
	double getArea(){
		return getWidth() * getHeight() / 2;
	}
}

class Rectangle extends TwoDShape{
	Rectangle(double width, double height, String name){
		super(width, height, name);
	}
	
	double getArea(){
		return getWidth() * getHeight();
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		// TODO 2차원 도형을 테스트하기 위한 예제(참조관계, 추상클래스)
		
		//TwoDShape t1 = new TwoDShape(8.0, 7.5, "General");
		Rectangle r1 = new Rectangle(5.0, 5.0, "정사각형");
		Rectangle r2 = new Rectangle(8.0, 5.0, "직사각형");
		Triangle tr1 = new Triangle(7.5, 7.5, "정삼각형");
		Triangle tr2 = new Triangle(8.5, 9.5, "삼각형");
		
		TwoDShape[] t = {r1, r2, tr1, tr2, 
				new Rectangle(10.5, 3.4, "사각형")};
		
		for(int i=0; i<t.length; i++){
			System.out.println(t[i].getName() + " : " + t[i].getArea());
		}
	}
}







