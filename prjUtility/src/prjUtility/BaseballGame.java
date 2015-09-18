package prjUtility;

import java.util.Random;
import java.util.Scanner;

/*
 * 게임 규칙
 * ---------
 * 1. 임의의 숫자 3개를 준비한다.
 * 		단 중복되지 않는 단자리 숫자(1 ~ 9)이어야 한다.
 */
public class BaseballGame {
	public static void main(String[] args) {
		// TODO 숫자 야구 게임
		
		int com[] = new int[3];
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int number = 0; // 사용자가 입력한 숫자
		int user[] = new int[3]; // 사용자가 입력한 숫자를 저장할 배열
		int strike=0, ball=0;
		
		// 컴퓨터가 해야할 작업(숫자 3개 준비)
		for(int i=0; i<3; i++){
			com[i] = rand.nextInt(9)+1;
			
			if(i == 1){
				if(com[i] == com[i-1])
					i--;
			}
			
			if(i == 2){
				if(com[i] == com[i-1] || com[i] == com[i-2])
					i--;
			}
		}
		
		//System.out.println(com[0] + ", " + com[1] + ", " + com[2]);	
		
		// 사용자가 입력한 숫자와 컴퓨터의 숫자를 비교하여 처리
		for(;;){
			strike = 0;
			ball = 0;
			
			System.out.print("숫자 3개 입력 : ");
			number = scan.nextInt();
			user[0] = number/100;
			user[1] = (number%100)/10;
			user[2] = (number%100)%10;
			
			for(int i=0; i<3; i++){
				if(com[i] == user[i])
					strike++;
			}
			
			// 반복문으로 바꾸기
			if(com[0] == user[1] || com[0] == user[2])
				ball++;
			
			if(com[1] == user[0] || com[1] == user[2])
				ball++;
			
			if(com[2] == user[0] || com[2] == user[1])
				ball++;
			
			if(strike == 3){
				System.out.println("축하합니다~~~");
				break;
			}
			else if(strike==0 && ball==0){
				System.out.println("아웃입니다.:" + user[0] + ", " + 
					user[1] + ", " + user[2]);
			}
			else{
				System.out.println(strike + "스트라이크 " + ball + 
					"볼:" + user[0] + ", " + user[1] + ", " + user[2]);
			}
			System.out.println("----------------------------------");
		}
	}
}








