public class ScannerTest {
	public static void main(String[] args) {
		// TODO ScannerŬ���� ����
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.print("����� �̸���?");
		String name = scan.next();
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		
		System.out.print("����� ���̴�?");
		int age = scan.nextInt();
		System.out.println("����� " + age + "���Դϴ�.");
		
		System.out.print("����� ������?");
		double point = scan.nextDouble();
		System.out.println("����� ������ " + point + "�Դϴ�.");
	}
}
