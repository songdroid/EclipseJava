public class SelectionSort {
	public static void main(String[] args) {
		// TODO 선택 정렬
		int data[] = {8, 7, 9, 2, 3, 6};
		
		for(int i=0; i<(data.length-1); i++){
			for(int j=i+1; j<(data.length); j++){
				if(data[i] > data[j]){
					// swap
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
	}
}
