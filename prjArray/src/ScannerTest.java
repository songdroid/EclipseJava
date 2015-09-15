public class ScannerTest {
	public static void main(String[] args) {
		// TODO Scanner클래스 사용법
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.print("당신의 이름은?");
		String name = scan.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		System.out.print("당신의 나이는?");
		int age = scan.nextInt();
		System.out.println("당신은 " + age + "살입니다.");
		
		System.out.print("당신의 점수는?");
		double point = scan.nextDouble();
		System.out.println("당신의 점수는 " + point + "입니다.");
	}
}
