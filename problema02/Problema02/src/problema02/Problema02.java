/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del propietario: ");
        String propietario = scanner.nextLine();

        System.out.print("Ingrese el tipo de vehículo (1-4): ");
        int tipoVehiculo = scanner.nextInt();

        System.out.print("Ingrese el valor del vehículo: $");
        double valorVehiculo = scanner.nextDouble();

        double peaje = calcularPeaje(tipoVehiculo, valorVehiculo);

        System.out.println("Peaje \"Buena vía\" Propietario: " + propietario
                + " Tipo: vehículo " + tipoVehiculo + " Valor: $" + valorVehiculo
                + " Peaje: $" + peaje);
    }

    public static double calcularPeaje(int tipoVehiculo, double valorVehiculo) {
        double porcentaje;
        double peaje;

        switch (tipoVehiculo) {
            case 1:
                porcentaje = 0.01;
                peaje = porcentaje * valorVehiculo + 2;
                break;
            case 2:
                porcentaje = 0.02;
                peaje = porcentaje * valorVehiculo + 2.5;
                break;
            case 3:
                porcentaje = 0.04;
                peaje = porcentaje * valorVehiculo + 1.5;
                break;
            case 4:
                porcentaje = 0.05;
                peaje = porcentaje * valorVehiculo + 2.2;
                break;
            default:
                System.out.println("Tipo de vehículo no válido");
                return 0;
        }

        return peaje;
    }
}
