package generic;

class GenericDemo<T>{
	private T value;
	
	public GenericDemo(T i) {
		value = i;
	}
	
	public T getValue(){
		return value;
	}
}

public class GenericTest2 {
	public static void main(String[] args) {
		// TODO TemplateÀÇ ¿ëµµ
		GenericDemo<Integer> demo1 = new GenericDemo<Integer>(100);
		System.out.println(demo1.getValue());
		
		GenericDemo<Double> demo2 = new GenericDemo<Double>(3.14);
		System.out.println(demo2.getValue());
		
		GenericDemo<String> demo3 = new GenericDemo<String>("generic test...");
		System.out.println(demo3.getValue());
	}
}





