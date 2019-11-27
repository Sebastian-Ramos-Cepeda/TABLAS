package es.studium.G_MáximoMínimoMedia;

import java.util.Scanner;

public class MáximoMínimoMedia 
{
	public static void main(String[] args) 
	{
		int suma=0;
		int maximo;
		int minimo;		
		int tabla[] = new int[10];
		int i;
		Scanner teclado = new Scanner(System.in);
		// Recorrido para rellenar la tabla
		for(i=0;i<10;i++)
		{
		System.out.println("Ingrese el valor de la posición: "+i+":");
		tabla[i] = teclado.nextInt();
		}
		maximo = tabla[0];
		minimo = tabla[0];
		// Recorrido para mostrar los valores de la tabla
		for(i=0;i<10;i++)
		{
			suma = suma + tabla[i];
			if(tabla[i]>maximo)
			{
				maximo=tabla[i];
			}
			if (tabla[i]<minimo)
			System.out.println("Tabla["+i+"]="+tabla[i]);
		}
		System.out.println("El máximo de la tabla es: " + maximo);
		System.out.println("El mínimo de la tabla es: " + minimo);
		System.out.println("La media de la tabla es: " + suma/10);		
		teclado.close();
	}
}
