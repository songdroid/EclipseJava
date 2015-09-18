package prjUtility;

import java.util.Random;
import java.util.Scanner;

/*
 * ���� ��Ģ
 * ---------
 * 1. ������ ���� 3���� �غ��Ѵ�.
 * 		�� �ߺ����� �ʴ� ���ڸ� ����(1 ~ 9)�̾�� �Ѵ�.
 */
public class BaseballGame {
	public static void main(String[] args) {
		// TODO ���� �߱� ����
		
		int com[] = new int[3];
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int number = 0; // ����ڰ� �Է��� ����
		int user[] = new int[3]; // ����ڰ� �Է��� ���ڸ� ������ �迭
		int strike=0, ball=0;
		
		// ��ǻ�Ͱ� �ؾ��� �۾�(���� 3�� �غ�)
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
		
		// ����ڰ� �Է��� ���ڿ� ��ǻ���� ���ڸ� ���Ͽ� ó��
		for(;;){
			strike = 0;
			ball = 0;
			
			System.out.print("���� 3�� �Է� : ");
			number = scan.nextInt();
			user[0] = number/100;
			user[1] = (number%100)/10;
			user[2] = (number%100)%10;
			
			for(int i=0; i<3; i++){
				if(com[i] == user[i])
					strike++;
			}
			
			// �ݺ������� �ٲٱ�
			if(com[0] == user[1] || com[0] == user[2])
				ball++;
			
			if(com[1] == user[0] || com[1] == user[2])
				ball++;
			
			if(com[2] == user[0] || com[2] == user[1])
				ball++;
			
			if(strike == 3){
				System.out.println("�����մϴ�~~~");
				break;
			}
			else if(strike==0 && ball==0){
				System.out.println("�ƿ��Դϴ�.:" + user[0] + ", " + 
					user[1] + ", " + user[2]);
			}
			else{
				System.out.println(strike + "��Ʈ����ũ " + ball + 
					"��:" + user[0] + ", " + user[1] + ", " + user[2]);
			}
			System.out.println("----------------------------------");
		}
	}
}








