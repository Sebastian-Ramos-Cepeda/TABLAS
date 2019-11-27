package es.studium.A_RellenarTabla;

public class RellenarTabla 
{
	public static void main(String[] args) 
	{
		int tabla[] = new int[20];
		int i;
		// Recorrido para rellenar la tabla
		for(i=0;i<20;i++)
		{
		System.out.println("Ingrese el valor de la posición: "+i+":");
		tabla[i] = i*2;
		}
		// Recorrido para mostrar los valores de la tabla
		for(i=0;i<20;i++)
		{
		System.out.println("Tabla["+i+"]="+tabla[i]);
		}
	}
}
