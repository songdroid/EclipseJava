public class InheritanceTest {
	public static void main(String[] args) {
		// TODO 고객 관리 메인 프로그램
		//CMS kim = new CMS(1, "김유신", 'C', "111-1111");
		//kim.display();
		
		CMSExt hong = new CMSExt(2, "홍길동", 'B', "222-2222", "서울시 종로구");
		hong.print();
	}
}
