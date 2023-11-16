/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double descuento;
        double total;

        System.out.println("Ingrese el propietario del vehiculo");
        String propietario;
        propietario = entrada.nextLine();

        System.out.println("Ingrese el tipo de vehiculo");
        String vehiculo;
        vehiculo = entrada.nextLine();
        System.out.println("Ingrese el valor de vehiculo");
        double valor;
        valor = entrada.nextDouble();
        vehiculo = vehiculo.toLowerCase();
        switch (vehiculo) {
            case "liviano particular":
            case "liviano":
            case "particular":
                descuento = (valor * 0.01) / 100;
                total = descuento + 2;
                System.out.printf("Peaje Buena via\nPropeitario: %s\n"
                        + "Tipo: %s\nValor vehiculo:%.2f\n"
                        + "Peaje:%.2f", propietario, vehiculo, valor, total);
                break;
            case "pesado particular":
            case "pesado":
            case "grande":
                descuento = (valor * 0.02) / 100;
                total = descuento + 2.50;
                System.out.printf("Peaje Buena via\nPropeitario: %s\n"
                        + "Tipo: %s\nValor vehiculo:%.2f\n"
                        + "Peaje:%.2f", propietario, vehiculo, valor, total);
                break;
            case "taxi":

                descuento = (valor * 0.04) / 100;
                total = descuento + 1.50;
                System.out.printf("Peaje Buena via\nPropeitario: %s\n"
                        + "Tipo: %s\nValor vehiculo:%.2f\n"
                        + "Peaje:%.2f", propietario, vehiculo, valor, total);
                break;
            case "bus urbano":
            case "bus":
            case "urbano":

                descuento = (valor * 0.05) / 100;
                total = descuento + 2.20;
                System.out.printf("Peaje Buena via\nPropeitario: %s\n"
                        + "Tipo: %s\nValor vehiculo:%.2f\n"
                        + "Peaje:%.2f", propietario, vehiculo, valor, total);
                break;
            default:
                System.out.printf("Datos inespecificados");
                break;
        }
    }
}
