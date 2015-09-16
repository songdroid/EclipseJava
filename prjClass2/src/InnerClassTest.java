public class InnerClassTest {
	public static void main(String[] args) {
		// TODO OuterClass안에 있는 InnerClass의 innerMethod를 호출하시오.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.innerMethod();
	}
}
