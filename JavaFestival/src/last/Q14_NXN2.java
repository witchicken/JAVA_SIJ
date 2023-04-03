package last;

import java.util.Scanner;

public class Q14_NXN2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 : ");
		int n = sc.nextInt();
		
		int[][] arr = new int [n][n];
		
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==0 || i%2 == 0){
					arr[i][j] = num++;
				}else {
					arr[i][arr.length - 1 -j] = num++;
				}
				
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
