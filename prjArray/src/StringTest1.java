public class StringTest1 {
	public static void main(String[] args) {
		// TODO StringŬ���� ����1
		String name1 = new String(); 
		name1 = "ȫ�浿";
		System.out.println(name1);
		
		String name2 = new String("�Ӳ���");
		System.out.println(name2);
		
		String name3 = "������";
		System.out.println(name3);
		
		/*
		char[][] names = new char[3][3];
		names[0][0] = 'ȫ';
		names[0][1] = '��';
		names[0][2] = '��';
		...
		*/
		
		/*
		char[][] names = {	{'ȫ', '��', '��'}, 
							{'��', '��', '��'}, 
							{'��', '��', '��'}};
		
		for(int i=0; i<names.length; i++){
			for(int j=0; j<names.length; j++){
				System.out.print(names[i][j]);
			}
			System.out.println();
		}
		*/
		
		String[] names = {"ȫ�浿", "�Ӳ���", "������"};
		for(int i=0; i<names.length; i++)
			System.out.println(names[i]);
	}
}








