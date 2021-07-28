package alvaro.remache.vinueza;

import java.util.Scanner;

public class Main {
	/*Crear un programa que solicite ingresar un n�mero (solo positivos), y as� seguir� solicitando 
	ingresar un n�mero hasta que se ingrese el n�mero cero (0), cuando se ingrese el numero -1, 
	ya no solicitar� m�s n�meros y en ese momento el programa debe imprimir la suma solo de 
	los n�meros pares ingresados y el promedio solo de los n�meros impares ingresados hasta ese momento.
	*/

	public static void main(String[] args) {
		int N = 0;
		float S = 0;
		float P = 0;
		int C = 0;
		
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i != 0; i++) {
			System.out.print("Ingrese un numero: ");
			N = sc.nextInt();
			if (N == 0) {
				i = -1;
			} else {
				S = S + N;
				P = S / 2;
				C = C + 1;
			}
		}
		System.out.println("SUMA: " + S);
		System.out.println("PROMEDIO: " + P);
		System.out.println("CANTIDAD: " + C);
	}

}
