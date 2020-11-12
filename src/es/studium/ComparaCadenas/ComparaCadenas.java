package es.studium.ComparaCadenas;

import java.util.Scanner;

public class ComparaCadenas
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Dame otra cadena");
		cadena2 = teclado.nextLine();
		teclado.close();
		if (cadena1.length() == cadena2.length())
			System.out.println("Las dos cadenas son iguales ");
		else if (cadena1.length() < cadena2.length())
			System.out.println("La cadena 2 es la mas larga");
		else
			System.out.println("la cadena 1 es la mas larga");
	}

}
