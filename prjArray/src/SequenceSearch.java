public class SequenceSearch {
	public static void main(String[] args) throws java.io.IOException{
		//TODO 순차 검색 예제
		char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		System.out.print("내가 찾는 데이터 : ");
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
			System.out.println("찾았다. : " + (cnt+1) + "번째 있다.");
		else
			System.out.println("못찾았다.");
	}
}
