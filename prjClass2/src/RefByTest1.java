/*
public class RefByTest1 {
	public void swap(int num1, int num2){
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("결과 : " + num1 + ", " + num2);
	}
	
	public static void main(String[] args) {
		// TODO 반드시 참조에 의한 전달을 사용해야 하는 경우
		
		int num1=10, num2=5;
		
		System.out.println("두 수의 교환");
		
		RefByTest1 ref = new RefByTest1();
		ref.swap(num1, num2);
	}
}
*/

public class RefByTest1 {
	public void swap(int[] num){
		int temp = num[0];
		num[0] = num[1];
		num[1] = temp;
	}
	
	public static void main(String[] args) {
		// TODO 반드시 참조에 의한 전달을 사용해야 하는 경우
		
		int [] num = {10, 5};
		
		System.out.println("두 수의 교환");
		
		RefByTest1 ref = new RefByTest1();
		ref.swap(num);
		System.out.println("결과 : " + num[0] + ", " + num[1]);
	}
}