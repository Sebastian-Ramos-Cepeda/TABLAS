package es.studium.H_PosiciónMáximo;

import java.util.Scanner;

public class PosiciónMáximo 
{
	public static void main(String[] args) 
	{
		int i;
		int maximo;
		int tabla[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for(i=0;i<10;i++)
		{
		System.out.println("Ingrese el valor de la posición: "+i+":");
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
		System.out.println("El número máxnimo de los indicados es: " + maximo);
		for (i=0;i<10;i++)
		{
			if(tabla[i]==maximo)
			{
				System.out.println("En la posición: " + i);
			}
		}
		teclado.close();
	}
}
