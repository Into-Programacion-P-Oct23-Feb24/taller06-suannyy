/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el nombre por favor ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado por favor ");
        int tipo = entrada.nextInt();
        System.out.println("Ingrese el sueldo por favor");
        double sueldo = entrada.nextDouble();
        double incremento;
        double nuevoSueldo;

        switch (tipo) {
            case 1:
                incremento = (5 * sueldo) / 100;
                nuevoSueldo = incremento + sueldo;
                System.out.printf("%.2f %.2f\n ", incremento, nuevoSueldo);
                break;
            case 2:
                incremento = (7 * sueldo) / 100;
                nuevoSueldo = incremento + sueldo;
                System.out.printf("%.2f %.2f\n", incremento, nuevoSueldo);
                break;
            case 3:
                incremento = (9 * sueldo) / 100;
                nuevoSueldo = incremento + sueldo;
                System.out.printf("%.2f %.2f\n", incremento, nuevoSueldo);
                break;
            case 4:
                incremento = (12 * sueldo) / 100;
                nuevoSueldo = incremento + sueldo;
                System.out.printf("%.2f %.2f\n", incremento, nuevoSueldo);

                break;

            default:

        }

    }

}
