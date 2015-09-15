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
		// TODO Ŭ������ �̿��� ����ǥ ����
		
		Student[] student = new Student[3];
		student[0] = new Student("ȫ�浿", 1, 98, 90);
		student[1] = new Student("�Ӳ���", 2, 76, 55);
		student[2] = new Student("�Ż��Ӵ�", 3, 85, 73);
		
		// ����, ���, ����, ��� ���ϱ�
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
		
		// ��� 
		System.out.println("�̸�\t�й�\t����\t����\t����\t���\t����\t����");
		System.out.println("***************************************************");
		for(int i=0; i<student.length; i++){
			System.out.println(student[i].name + "\t" + student[i].no + "\t" + 
				student[i].kor + "\t" + student[i].eng + "\t" + 
				student[i].tot + "\t" + student[i].avg + "\t" + 
				student[i].grade + "\t" + student[i].rank);
		}
		
		// ����(���������� ��������)
		for(int i=0; i<student.length-1; i++){
			for(int j=i+1; j<student.length; j++){
				if(student[i].avg < student[j].avg){
					Student temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
		}
		
		System.out.println("�̸�\t�й�\t����\t����\t����\t���\t����\t����");
		System.out.println("***************************************************");
		for(int i=0; i<student.length; i++){
			System.out.println(student[i].name + "\t" + student[i].no + "\t" + 
				student[i].kor + "\t" + student[i].eng + "\t" + 
				student[i].tot + "\t" + student[i].avg + "\t" + 
				student[i].grade + "\t" + student[i].rank);
		}
	}
}






