package es.studium.refactorizacion;

public class CalculoFactorial
{
	public static void main(String[] args)
	{
		int numero = 3;
		String texto = "El factorial de ";
		String mensajeEs = " es ";
		System.out.println(texto + numero + mensajeEs + calcularFactorial(numero));
		numero = 5;
		System.out.println(texto + numero + " es " + calcularFactorial(numero));
	}

	public static int calcularFactorial(int n)
	{
		if (n == 0)
		{
			return 1;
		} else
		{
			int resultado = n * calcularFactorial(n - 1);
			return resultado;
		}
	}

}
