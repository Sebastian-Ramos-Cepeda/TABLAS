package es.studium.H_Posici�nM�ximo;

import java.util.Scanner;

public class Posici�nM�ximo 
{
	public static void main(String[] args) 
	{
		int i;
		int maximo;
		int tabla[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for(i=0;i<10;i++)
		{
		System.out.println("Ingrese el valor de la posici�n: "+i+":");
		tabla[i] = teclado.nextInt();
		}
		maximo = tabla[0];
		for(i=0;i<10;i++)
		{
			if(tabla[i]>maximo)
			{
				maximo=tabla[i];
			}
		}
		System.out.println("El n�mero m�xnimo de los indicados es: " + maximo);
		for (i=0;i<10;i++)
		{
			if(tabla[i]==maximo)
			{
				System.out.println("En la posici�n: " + i);
			}
		}
		teclado.close();
	}
}
