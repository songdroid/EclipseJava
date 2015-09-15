public class BubbleSort {
	public static void main(String[] args) {
		// TODO 버블 정렬
		int data[] = {8, 7, 9, 2, 3, 6};
		
		for(int i=0; i<(data.length-1); i++){
			for(int j=0; j<(data.length-1); j++){
				if(data[j] > data[j+1]){
					// swap
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + "\t");
	}
}
