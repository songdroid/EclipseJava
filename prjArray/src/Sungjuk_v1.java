public class Sungjuk_v1 {
	public static void main(String[] args) {
		// TODO 1���� �迭�� �̿��� ����ǥ ����
		String[] names = {"ȫ�浿", "�Ӳ���", "�Ż��Ӵ�"};
		int no[] = {1, 2, 3};
		int kor[] = {98, 76, 85};
		int eng[] = {90, 55, 73};
		//------------------------- ������ �غ� ��
		int tot[] = new int[3];
		int avg[] = new int[3];
		char grade[] = new char[3];
		int rank[] = new int[3];
		
		// ����, ���, ����, ��� ���ϱ�
		for(int i=0; i<no.length; i++){
			tot[i] = kor[i] + eng[i];
		}
		
		for(int i=0; i<no.length; i++){
			avg[i] = tot[i] / 2;
		}
		
		for(int i=0; i<no.length; i++){
			if(avg[i] >= 90)
				grade[i] = 'A';
			else if(avg[i] >= 80)
				grade[i] = 'B';
			else if(avg[i] >= 70)
				grade[i] = 'C';
			else if(avg[i] >= 60)
				grade[i] = 'D';
			else 
				grade[i] = 'F';
		}
		
		
		for(int i=0; i<no.length; i++){
			rank[i] = 1;
			for(int j=i; j<no.length; j++){
				if(avg[i] < avg[j])
					rank[i]++;
			}
		}
		
		// ��� 
		System.out.println("�й�\t����\t����\t����\t���\t����\t����");
		System.out.println("***************************************************");
		for(int i=0; i<no.length; i++){
			System.out.println(no[i] + "\t" + kor[i] + "\t" + eng[i] +
				"\t" + tot[i] + "\t" + avg[i] + "\t" + grade[i] + "\t" +
				rank[i]);
		}
		
		// ����(���������� ��������)
		for(int i=0; i<no.length-1; i++){
			for(int j=i+1; j<no.length; j++){
				if(tot[i] < tot[j]){
					int temp = no[i];
					no[i] = no[j];
					no[j] = temp;
					
					temp = kor[i];
					kor[i] = kor[j];
					kor[j] = temp;
					
					temp = eng[i];
					eng[i] = eng[j];
					eng[j] = temp;
					
					temp = tot[i];
					tot[i] = tot[j];
					tot[j] = temp;
					
					temp = avg[i];
					avg[i] = avg[j];
					avg[j] = temp;
					
					char temp1 = grade[i];
					grade[i] = grade[j];
					grade[j] = temp1;
					
					temp = rank[i];
					rank[i] = rank[j];
					rank[j] = temp;
				}
			}
		}
		
		System.out.println("�й�\t����\t����\t����\t���\t����\t����");
		System.out.println("******************************************************");
		for(int i=0; i<no.length; i++){
			System.out.println(no[i] + "\t" + kor[i] + "\t" + eng[i] +
				"\t" + tot[i] + "\t" + avg[i] + "\t" + grade[i] + "\t" +
				rank[i]);
		}
	}
}






