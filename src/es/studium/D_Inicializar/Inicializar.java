package es.studium.D_Inicializar;

public class Inicializar 
{
	public static void main(String[] args) 
	{
		final int TAM = 3;
		int tabla[]= new int[TAM];
		for(int i=0;i<TAM;i++) 
		{
			tabla[i]=0;
		}
		for(int i=0;i<tabla.length;i++)
		{
			System.out.print(tabla[i]+" ");
		}
	}
}
