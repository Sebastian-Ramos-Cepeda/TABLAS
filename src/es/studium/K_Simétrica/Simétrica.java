package es.studium.K_Simétrica;

import java.util.Scanner;

public class Simétrica 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int tabla[][] = new int [3][3];
		int i,j;
		boolean simetrica = true;
		for(i=0;i<3;i++) 
		{
			for(j=0;j<3;j++) 
			{
				System.out.println("Valor de "+i+" "+j);
				tabla[i][j]=teclado.nextInt();
			}
		}
		for(i=0;(i<3)&&(simetrica);i++) 
		{
			for(j=0;(j<3)&&(simetrica);j++) 
			{
				if(tabla[i][j]!=tabla[j][i])
				{
					simetrica = false;
				}
			}
		}
		if(simetrica) 
		{
			System.out.println("Es simétrica");
		}
		else 
		{
			System.out.println("No es simétrica");
		}
		teclado.close();
	}
}
