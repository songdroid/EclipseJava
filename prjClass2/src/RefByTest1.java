/*
public class RefByTest1 {
	public void swap(int num1, int num2){
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("��� : " + num1 + ", " + num2);
	}
	
	public static void main(String[] args) {
		// TODO �ݵ�� ������ ���� ������ ����ؾ� �ϴ� ���
		
		int num1=10, num2=5;
		
		System.out.println("�� ���� ��ȯ");
		
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
		// TODO �ݵ�� ������ ���� ������ ����ؾ� �ϴ� ���
		
		int [] num = {10, 5};
		
		System.out.println("�� ���� ��ȯ");
		
		RefByTest1 ref = new RefByTest1();
		ref.swap(num);
		System.out.println("��� : " + num[0] + ", " + num[1]);
	}
}