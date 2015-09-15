public class ArrayTest2 {
	public static void main(String[] args) {
		// TODO 배열의 기초2(2차원 배열)
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {6, 7, 8, 9, 10};
		int arr3[] = {11, 12, 13, 14, 15};
		/*
		int arr[][] = new int[3][5];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;
		arr[1][4] = 10;
		
		arr[2][0] = 11;
		arr[2][1] = 12;
		arr[2][2] = 13;
		arr[2][3] = 14;
		arr[2][4] = 15;
		*/
		
		int arr[][] = {	{1, 2, 3, 4, 5}, 
						{6, 7, 8, 9, 10}, 
						{11, 12, 13, 14, 15}};
		
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 3차원 배열
		//int dim3[][][] = new int[2][3][5];
		// 1부터 30까지의 데이터를 3차원 배열로 초기화
		int dim3[][][] = {	{	{1, 2, 3, 4, 5}, 
								{6, 7, 8, 9, 10}, 
								{11, 12, 13, 14, 15}},
							{	{16, 17, 18, 19, 20}, 
								{21, 22, 23, 24, 25}, 
								{26, 27, 28, 29, 30}}
						};
		
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<5; k++){
					System.out.print(dim3[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}






