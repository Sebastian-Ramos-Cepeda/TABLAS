package es.studium.E_Cuadrados;

import java.util.Scanner;

public class Cuadrados 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		final int TAM=10;
		int tabla[]= new int [TAM];
		int numero;
		System.out.println("Indique un número:");
		numero = teclado.nextInt();
		for(int i=0;i<TAM;i++)
		{
			tabla[i]=i+(numero+1);
		}
		for(int i=0;i<TAM;i++)
		{
			tabla[i]=(int) Math.pow(tabla[i], 2);
		}
		for(int i=0;i<TAM;i++) 
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}
