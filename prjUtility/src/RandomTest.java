import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// TODO RandomŬ����, Math.Random()
		
		Random r = new Random();
		
		/*
		for(int i=0; i<5; i++){
			System.out.println(r.nextInt());
		}
		*/
		
		// (�ִ밪-�ּҰ�+1)+�ּҰ�
		for(int i=0; i<5; i++){
			System.out.println(r.nextInt(10)+1);
			// r.nextInt(10-1+1)+1
		}
		
		// 48 ~ 72������ ������ ���Ͻÿ�.
		for(int i=0; i<5; i++){
			System.out.println(r.nextInt(72-48+1)+48);
		}
	}
}

/*
 * 1. ���� ���� �� ����
 * 2. ���� �߱� ����
 * 		- �ɸ� �ð�
 * 		- �õ� Ƚ��
 * 		- ����
 * 		- ���̵�
 */

















