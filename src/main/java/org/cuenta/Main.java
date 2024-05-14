package org.cuenta;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner tx = new Scanner(System.in);

        /*Ingresar datos para la cuenta de ahorros*/
        System.out.println("Ingrese el saldo inicial de la cuenta de ahorros:");
        float saldo1 = tx.nextFloat();
        System.out.println("Ingrese la tasaanual de la cuenta de ahorros:");
        float tasa1 = tx.nextFloat();
        /*Crear cuenta de ahorros con los datos ingresados*/
        CuentaAhorros cuentaAhorros = new CuentaAhorros(saldo1, tasa1);
        /*Ingresar datos para la cuenta corriente*/
        System.out.println("Ingrese el saldo inicial de la cuenta corriente:");
        float saldo2 = tx.nextFloat();
        System.out.println("Ingrese la tasaanual de la cuenta corriente:");
        float tasa2 = tx.nextFloat();
        /*Crear cuenta corriente con los datos ingresados*/
        CuentaCorriente cuentaCorriente = new CuentaCorriente(saldo2, tasa2);
        /*Utilizar el tipo boolean para seleccionar con el programa*/
        boolean seleccione = true;
        /*Utilizar el while para que el programa cree una variedad de opciones y se pueda escoger la opcion*/
        while (seleccione) {
            System.out.println("---------------SELECCIONE---------------:");
            System.out.println("1. Depsitar en la cuenta de ahorros");
            System.out.println("2. Retirar dinero de la cuenta de ahorros");
            System.out.println("3. Depositar en una cuenta corriente");
            System.out.println("4. Retirar de una cuenta corriente");
            /*Para que funcione el while se debe poner un int para poder escoger un numero*/
            int opcion = tx.nextInt();

            if (opcion == 1) {
                System.out.println("INGRESE LA CANTIDAD A DEPOSITO EN LA CUENTA AHORROS:");
                float depositoAhorros = tx.nextFloat();
                cuentaAhorros.depositar(depositoAhorros);
                cuentaAhorros.extractoMensual();
                cuentaAhorros.imprimir();
            } else if (opcion == 2) {
                System.out.println("INGRESE LA CANTIDAD A RETIRAR EN LA CUENTA AHORROS:");
                float retiroAhorros = tx.nextFloat();
                cuentaAhorros.extractoMensual();
                cuentaAhorros.imprimir();
                cuentaAhorros.retirar(retiroAhorros);
            } else if (opcion == 3) {
                System.out.println("INGRESE LA CANTIDAD A DEPOSITO EN LA CUENTA CORRIENTE:");
                float depositoCorriente = tx.nextFloat();
                cuentaCorriente.depositar(depositoCorriente);
                cuentaCorriente.extractoMensual();
                cuentaCorriente.imprimir();
            } else if (opcion == 4) {
                System.out.println("INGRESE LA CANTIDAD A RETIRAR EN LA CUENTA CORRIENTE:");
                float retiroCorriente = tx.nextFloat();
                cuentaCorriente.extractoMensual();
                cuentaCorriente.imprimir();
                cuentaCorriente.retirar(retiroCorriente);
            } else{
                System.out.println("SALIR");

            }
        }
    }
}

