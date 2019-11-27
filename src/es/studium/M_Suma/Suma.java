package es.studium.M_Suma;

import java.util.Scanner;

public class Suma 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla1[][] = new int [3][3];
		int tabla2[][] = new int [3][3];
		int suma[][] = new int [3][3];
		int i, j;
		System.out.println("INTRODUCIR LOS VALORES DE LA TABLA 1");
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Valor de "+i+" "+j);
				tabla1[i][j]=teclado.nextInt();
			}
		}
		System.out.println("INTRODUCIR LOS VALORES DE LA TABLA 2");
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Valor de "+i+" "+j);
				tabla2[i][j]=teclado.nextInt();
			}
		}
		//SUMA TABLA1 + TABLA2
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
			{
				suma[i][j]= tabla1[i][j] + tabla2[i][j];
			}
		}
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
			{
				System.out.print(suma[i][j]+" ");
			}
			System.out.println();
		}
		teclado.close();
	}
}