package Cod;
import java.util.Scanner;

public class U04EP02 {
	public static MiCo mic;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		mic = new MiCo();
		int pin = 0;
		int contador = 0;
		mic.cls();
		do {
			contador++;
			mic.setCursor(10, 10);
			mic.setColor("CT_GRIS", "CF_NEGRO");
			System.out.print(" " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " ");
			mic.setColor("CT_AZUL", "CF_GRIS");
			System.out.print(" " + " " + " " + " ");
			mic.setCursor(10, 10);
			System.out.print("Teclee el PIN: ");
			mic.setColor("CT_AZUL", "CF_GRIS");
			pin = sc.nextInt();
			sc.nextLine();
			if (pin != 1234) {
				mic.setCursor(15, 16);
				mic.setColor("CT_ROJO", "CF_GRIS");
				System.out.print("El pin es incorrecto. Intento " + contador);
				System.out.println("");
			}
		} while (pin != 1234 && contador < 3);
		if (contador != 3) {
			mic.setColor("CT_BLANCO", "CF_ROJO");
		} else {
			mic.setColor("CT_VERDE_CLARO", "CF_NEGRO");
		}
		mic.cls();
		mic.setCursor(10, 4);
		if (pin == 1234) {
			System.out.print("Acceso concedido");
		} else {
			System.out.print("Sin acceso");
		}
		mic.setCursor(20, 5);
		System.out.print("Pulse enter...");
		String enter = sc.nextLine();
		if (enter.equals("")) {
			mic.setColor("CT_BLANCO", "CF_NEGRO");
			mic.cls();
		}
    }
}
