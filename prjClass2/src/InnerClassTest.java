public class InnerClassTest {
	public static void main(String[] args) {
		// TODO OuterClass�ȿ� �ִ� InnerClass�� innerMethod�� ȣ���Ͻÿ�.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		inner.innerMethod();
	}
}
