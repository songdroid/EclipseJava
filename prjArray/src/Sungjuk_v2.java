public class Sungjuk_v2 {
	public static void main(String[] args) {
		// TODO 2차원 배열을 이용한 성적표 예제
		
		String[] names = {"홍길동", "임꺽정", "신사임당"};
		char grade[] = new char[3];
		// 학번, 국어, 영어, 총점, 평균, 순위
		
		int sungjuk[][] = {	{1, 98, 90, 0, 0, 0}, 
							{2, 76, 55, 0, 0, 0}, 
							{3, 85, 73, 0, 0, 0}
		};
		
		//int sungjuk[][] = new int[5][4];
		
		
		// 총점, 평균, 학점, 등수 구하기
		for(int i=0; i<sungjuk.length; i++){
			sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
		}
		
		for(int i=0; i<sungjuk.length; i++){
			sungjuk[i][4] = sungjuk[i][3] / 2;
		}
		
		for(int i=0; i<sungjuk.length; i++){
			if(sungjuk[i][4] >= 90)
				grade[i] = 'A';
			else if(sungjuk[i][4] >= 80)
				grade[i] = 'B';
			else if(sungjuk[i][4] >= 70)
				grade[i] = 'C';
			else if(sungjuk[i][4] >= 60)
				grade[i] = 'D';
			else 
				grade[i] = 'F';
		}
		
		
		for(int i=0; i<sungjuk.length; i++){
			sungjuk[i][5] = 1;
			for(int j=0; j<sungjuk.length; j++){
				if(sungjuk[i][3] < sungjuk[j][3])
					sungjuk[i][5]++;
			}
		}
		
		// 출력 
		System.out.println("이름\t학번\t국어\t영어\t총점\t평균\t학점\t순위");
		System.out.println("***************************************************");
		for(int i=0; i<sungjuk.length; i++){
			System.out.println(names[i] + "\t" + sungjuk[i][0] + "\t" + sungjuk[i][1] + 
				"\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + 
				sungjuk[i][4] + "\t" + grade[i] + "\t" +
				sungjuk[i][5]);
		}
		
		// 정렬(성적순으로 내림차순)
		for(int i=0; i<sungjuk.length-1; i++){
			for(int j=i+1; j<sungjuk.length; j++){
				if(sungjuk[i][3] < sungjuk[j][3]){
					int[] temp = sungjuk[i];
					sungjuk[i] = sungjuk[j];
					sungjuk[j] = temp;
					
					char temp1 = grade[i];
					grade[i] = grade[j];
					grade[j] = temp1;
					
					String name = names[i];
					names[i] = names[j];
					names[j] = name;
				}
			}
		}
		
		System.out.println("\n\n");
		System.out.println("이름\t학번\t국어\t영어\t총점\t평균\t학점\t순위");
		System.out.println("***********************************************************");
		for(int i=0; i<sungjuk.length; i++){
			System.out.println(names[i] + "\t" + sungjuk[i][0] + "\t" + sungjuk[i][1] + 
				"\t" + sungjuk[i][2] + "\t" + sungjuk[i][3] + "\t" + 
				sungjuk[i][4] + "\t" + grade[i] + "\t" +
				sungjuk[i][5]);
		}
	}
}






