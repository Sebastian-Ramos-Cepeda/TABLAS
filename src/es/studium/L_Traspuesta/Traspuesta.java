package es.studium.L_Traspuesta;

import java.util.Scanner;

public class Traspuesta 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[][] = new int [3][3];
		int traspuesta[][] = new int [3][3];
		int i,j;
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++) 
			{
				System.out.println("Valor de "+i+" "+j);
				tabla[i][j]=teclado.nextInt();
			}
		}
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++) 
			{
				traspuesta[i][j] = tabla[j][i];
			}	
		}
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++) 
			{
				System.out.print(traspuesta[i][j]+" ");
			}
			System.out.println();
		}
		teclado.close();
	}
}
