package es.studium.N_ProductoMatrizNúmero;

import java.util.Scanner;

public class ProductoMatrizNúmero 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[][] = new int [3][3];
		int producto[][] = new int [3][3];
		int i, j;
		int numero;
		System.out.println("INTRODUCIR LOS VALORES DE LA TABLA");
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++) 
			{
				System.out.println("Valor de "+i+" "+j);
				tabla[i][j]=teclado.nextInt();
			}
		}
		System.out.println("INDICA EL NÚMERO QUE VAMOS A MULTIPLICAR POR LA TABLA");
		numero=teclado.nextInt();
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
			{
				producto[i][j]=numero*tabla[i][j];
			}
		}
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++)
			{
				System.out.print(producto[i][j]+" ");
			}
			System.out.println();
		}
		teclado.close();
	}
}
