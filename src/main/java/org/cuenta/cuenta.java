package org.cuenta;

public abstract class cuenta {

    private float saldo;
    //Atributo que define el numero de consignaciones realizadas en una cuenta bancaria

    private int numerodeconsignacion=0;
    //Atributo que define el numero de retiros de la cuenta bancaria

    private int numeroderetiro=0;
    //Atributo que define la comision mensual que se cobrara a una cuenta bancaria

    private float tasaanual=0;
    //Atributo que define la comision mensual que se cobra a una cuenta bancaria

    private float comisionmensual=0;

    /*Constructor de la clase Cuenta
    * @parametro saldo que define el saldo de la cuenta
    * @parametro tasaanuela parametro que define la tasaanuel de interes de la cuenta */

    public cuenta(float cantidad, float tasaanual) {
        this.saldo=saldo;
        this.tasaanual=tasaanual;

    }
    /*Metodo que recibe una cantidad de dinero a depositar y actualiza el ssldo de la cuenta,
    este parametro que define el dinero a depositar en la cuenta*/

    public void depositar (float cantidad){
        /*se actualiza el saldo con la cantidad depositada*/

        saldo=saldo+cantidad;

        /*Actualizamos el numero de depositos realizadas a la cuenta*/
        numerodeconsignacion=numerodeconsignacion+1;
    }

    /*metodo que recibe la cantidad del dinero a retirar y actualizar el saldo de la cuenta
     * @parametro saldo es un parametro que define la cantidad de dinero a retiraar de la cuenta*/

    public void retirar(float cantidad){
        float nuevosaldo=saldo-cantidad;

        /*Si la cantidad supera el saldo el retiro no se puede realizar*/

        if (nuevosaldo>=0){
            saldo-=cantidad;
            numeroderetiro=numeroderetiro+1;

        }
        else {
            System.out.println("No se puede retirar el dinero, no cuenta con saldo");

        }

    }
    /*Calculamos el interes mensual con los parametros definidos*/
    public void calcularinteres(){
        /*Convertimos la tasa anual a tasa mensual*/
        float tasamensual=tasaanual/12;

        /*Covertimos a dinero el interes*/
        float interesmensual=saldo*tasamensual;

        /*Actualizamos el saldo aplicando el interes*/
        saldo+=interesmensual;

    }

    /*Metodo que genea un extracto aplicando al saldo actual una comisoon y calculano su interes*/
    public void extractoMensual (){
        saldo-=comisionmensual;
        calcularinteres();
    }

    /*Imprimir los datos y resultados con los parametros
    * saldo representando el saldo de la cuenta
    * comision mensual representando la comision de la cuenta
    * y el numero de transacciones realizadas*/
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionmensual);
        System.out.println("Número de transacciones: " + (numerodeconsignacion + numeroderetiro));
    }

}
