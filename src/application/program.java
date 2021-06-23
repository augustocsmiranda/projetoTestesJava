package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println("Teste PUSH Git Hub");
		System.out.println("Teste I");
		//Teste Visual Studio CODE
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe Matrix [M x n]: ");

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matA = new int[m][n];

		System.out.println("Informe Valores da Matrix A ["+m+" x "+n+"]:");
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				matA[i][j] = sc.nextInt();
			}
		}
		int[][] matB = new int[m][n];

		System.out.println("Informe Valores da Matrix B ["+m+" x "+n+"]:");
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				matB[i][j] = sc.nextInt();
			}
		}

		System.out.println("A + B: ");

		int[][] matTotal = new int[m][n];

		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				matTotal[i][j] = matA[i][j] + matB[i][j]; 
				System.out.print(matTotal[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
