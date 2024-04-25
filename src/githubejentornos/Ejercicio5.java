package githubejentornos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println("Dame un valor");
		Scanner longradio = new Scanner(System.in);
		double radio = longradio.nextInt();
		double longcir = 2 * Math.PI * radio;
		double area = Math.pow(radio,2)* Math.PI;
		double volumen = (4/3 * Math.PI) * Math.pow(radio, 3);
		System.out.println("La longitud de la circunferencia es " + longcir);
		System.out.println("El area del circulo es: " + area);
		System.out.println("El volumen del circulo es: " + volumen);
	}

}
