/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class problema01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

      
        if (num1 > num2) {
           
            System.out.print("Ingrese la operación a realizar (Suma, Resta, Multiplicacion, Division): ");
            String operacion = scanner.next();

            double resultado = realizarOperacion(operacion, num1, num2);

           
            System.out.println("El resultado de " + operacion + " entre " + num1 + " y " + num2 + " es: " + resultado);
        } else {
            System.out.println("Error: El primer número debe ser mayor al segundo.");
        }
    }


    public static double realizarOperacion(String operacion, double num1, double num2) {
        switch (operacion) {
            case "suma":
                return num1 + num2;
            case "resta":
                return num1 - num2;
            case "multiplicacion":
                return num1 * num2;
            case "division":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: No es posible dividir por cero.");
                    return 0;
                }
            default:
                System.out.println("Operación no válida.");
                return 0;
        }
    }
}