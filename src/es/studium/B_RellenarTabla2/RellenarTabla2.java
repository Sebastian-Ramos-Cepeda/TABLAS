package es.studium.B_RellenarTabla2;

import java.util.Scanner;

public class RellenarTabla2 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[] = new int[4];
		int i;
		// Recorrido para rellenar la tabla
		for(i=0;i<4;i++)//ó i<=3, tambien es válido 
		{
			tabla[i]=0;
		}
		for(i=0;i<4;i++)
		{
			System.out.println("Indicar el valor de la tabla en la posición "+i+ ":");
			tabla[i]=teclado.nextInt();
		}
		for(i=0;i<4;i++)
		{
			System.out.println(tabla[i]);
		}
		teclado.close();
	}
}
