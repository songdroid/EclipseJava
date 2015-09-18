import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// TODO Random클래스, Math.Random()
		
		Random r = new Random();
		
		/*
		for(int i=0; i<5; i++){
			System.out.println(r.nextInt());
		}
		*/
		
		// (최대값-최소값+1)+최소값
		for(int i=0; i<5; i++){
			System.out.println(r.nextInt(10)+1);
			// r.nextInt(10-1+1)+1
		}
		
		// 48 ~ 72사이의 난수를 구하시오.
		for(int i=0; i<5; i++){
			System.out.println(r.nextInt(72-48+1)+48);
		}
	}
}

/*
 * 1. 가위 바위 보 게임
 * 2. 숫자 야구 게임
 * 		- 걸린 시간
 * 		- 시도 횟수
 * 		- 전적
 * 		- 난이도
 */

















