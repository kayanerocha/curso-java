package application;

import java.util.Scanner;

public class ProgramaMatrices {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] numbers = new int[m][n];
		
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		int number = sc.nextInt();
		
		int left = -1;
		int right = -1;
		int up = -1;
		int down = -1;
		for (int i=0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				if (numbers[i][j] == number) {
					System.out.println("Position " + i + "," + j + ":");
					left = j-1;
					right = j+1;
					up = i-1;
					down = i+1;
					
					if (left >= 0 & left <= numbers[i].length) {
						System.out.println("Left: " + numbers[i][left]);
					}
					if (right < numbers[i].length & right >= 0) {
						System.out.println("Right: " + numbers[i][right]);
					}
					if (up >= 0 & up <= numbers.length) {
						System.out.println("Up: " + numbers[i-1][j]);
					}
					if (down < numbers.length & down >= 0) {
						System.out.println("Down: " + numbers[i+1][j]);
					}
				}				
			}
		}
		
		sc.close();

	}

}
