package es.studium.I_DosDimensiones;

import java.util.Scanner;

public class DosDimensiones 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String[][] tabla = new String [3][4];
		for (int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++) 
			{
				System.out.println("Indique un carácter " + i + ", " + j);
				tabla[i][j] = teclado.nextLine();
			}
		}
		for (int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++) 
			{
				System.out.println(" " + tabla[i][j]);
			}
			System.out.println("");
		}
		teclado.close();
	}
}
