public class SequenceSearch {
	public static void main(String[] args) throws java.io.IOException{
		//TODO ���� �˻� ����
		char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		System.out.print("���� ã�� ������ : ");
		char search = (char)System.in.read();
		
		boolean flag = false;
		int cnt;
		for(cnt=0; cnt<data.length; cnt++){
			if(data[cnt] == search){
				flag = true;
				break;
			}
			else{
				flag = false;
			}
		}
		
		if(flag == true)
			System.out.println("ã�Ҵ�. : " + (cnt+1) + "��° �ִ�.");
		else
			System.out.println("��ã�Ҵ�.");
	}
}
