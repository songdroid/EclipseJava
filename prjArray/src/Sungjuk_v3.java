class Student{
	String name;
	int no;
	int kor;
	int eng;
	int tot;
	int avg;
	int rank;
	char grade;
	
	Student(){}
	Student(String name, int no, int kor, int eng){
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
	}
}

public class Sungjuk_v3 {
	public static void main(String[] args) {
		// TODO 클래스를 이용한 성적표 예제
		
		Student[] student = new Student[3];
		student[0] = new Student("홍길동", 1, 98, 90);
		student[1] = new Student("임꺽정", 2, 76, 55);
		student[2] = new Student("신사임당", 3, 85, 73);
		
		// 총점, 평균, 학점, 등수 구하기
		for(int i=0; i<student.length; i++){
			student[i].tot = student[i].kor + student[i].eng;
		}
		
		for(int i=0; i<student.length; i++){
			student[i].avg = student[i].tot / 2;
		}
		
		for(int i=0; i<student.length; i++){
			if(student[i].avg >= 90)
				student[i].grade = 'A';
			else if(student[i].avg >= 80)
				student[i].grade = 'B';
			else if(student[i].avg >= 70)
				student[i].grade = 'C';
			else if(student[i].avg >= 60)
				student[i].grade = 'D';
			else 
				student[i].grade = 'F';
		}
		
		
		for(int i=0; i<student.length; i++){
			student[i].rank = 1;
			for(int j=0; j<student.length; j++){
				if(student[i].avg < student[j].avg)
					student[i].rank++;
			}
		}
		
		// 출력 
		System.out.println("이름\t학번\t국어\t영어\t총점\t평균\t학점\t순위");
		System.out.println("***************************************************");
		for(int i=0; i<student.length; i++){
			System.out.println(student[i].name + "\t" + student[i].no + "\t" + 
				student[i].kor + "\t" + student[i].eng + "\t" + 
				student[i].tot + "\t" + student[i].avg + "\t" + 
				student[i].grade + "\t" + student[i].rank);
		}
		
		// 정렬(성적순으로 내림차순)
		for(int i=0; i<student.length-1; i++){
			for(int j=i+1; j<student.length; j++){
				if(student[i].avg < student[j].avg){
					Student temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
		
		System.out.println("이름\t학번\t국어\t영어\t총점\t평균\t학점\t순위");
		System.out.println("***************************************************");
		for(int i=0; i<student.length; i++){
			System.out.println(student[i].name + "\t" + student[i].no + "\t" + 
				student[i].kor + "\t" + student[i].eng + "\t" + 
				student[i].tot + "\t" + student[i].avg + "\t" + 
				student[i].grade + "\t" + student[i].rank);
		}
	}
}






