/*
public class CallByTest1 {
	public void display(int a, int b, int c, int d, int e){
		System.out.println(a + ", " + b + ", " + c);
	}
	
	public static void main(String[] args) {
		// TODO 값에 의한 전달 방식
		
		int a=10, b=7, c=2, d=6, e=9;
		
		CallByTest1 test1 = new CallByTest1();
		test1.display(a, b, c, d, e);
	}
}
*/

/*
public class CallByTest1 {
	public void display(int[] arr){
		System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
	}
	
	public static void main(String[] args) {
		// TODO 참조에 의한 전달 방식
		
		int arr[] = {10, 7, 2, 6, 9};
		
		CallByTest1 test1 = new CallByTest1();
		test1.display(arr);
	}
}
*/

/*
public class CallByTest1 {
	int arr[] = {10, 7, 2, 6, 9};
	
	public void display(){
		System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
	}
	
	public static void main(String[] args) {
		// TODO 참조에 의한 전달 방식
		
		CallByTest1 test1 = new CallByTest1();
		test1.display();
	}
}
*/

class Data{
	int a = 10;
	double b = 3.14;
	char c = '가';
	boolean d = true;
	String e = "문자열";
}

public class CallByTest1 {
	public void display(Data data){
		System.out.println(data.a + ", " + data.b + ", " + data.c + ", " + data.d);
	}
	
	public static void main(String[] args) {
		// TODO 값에 의한 전달 방식
		
		Data data = new Data();
		CallByTest1 test1 = new CallByTest1();
		test1.display(data);
	}
}
