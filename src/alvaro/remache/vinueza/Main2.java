package alvaro.remache.vinueza;

import java.util.Scanner;

public class Main2 {
	/*Crear un programa que solicite ingresar un n�mero (solo positivos), y as� seguir� solicitando 
	ingresar un n�mero hasta que se ingrese el n�mero (-1), cuando se ingrese el numero -1, ya no 
	solicitar� m�s n�meros y en ese momento el programa debe imprimir la suma solo de los 
	n�meros pares ingresados y el promedio solo de los n�meros impares ingresados hasta ese momento*/
	
	public static void main(String[] args) {
		int N = 0;
		float S = 0;
		float Si = 0;
		float Ci = 0;
		float Pi = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 1; i != -1; i++) {
			System.out.print("Ingrese un numero: ");
			N = sc.nextInt();
			if (N == -1) {
				i = -2;
			} else {
				if (N % 2 == 0) {
					S = S + N;
				} else {
					Si = Si + N;
					Ci = Ci + 1;
					Pi = Si / Ci;
				}
			}
		}
		System.out.println("LA SUMA DE LOS PARES ES " + S);
		System.out.println("EL PROMEDIO DE LOS IMPARES " + Pi);
	}
}
