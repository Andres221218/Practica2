package org.cuenta;


/*Esta clase denominada cuentaahorros modela una cuenta de ahorros que es una subclase de cuenta. Tiene un nuevo
* atributo:activa.*/

public class Cuentaahorros extends cuenta {

    /*Atributo que identifica si una cuenta esta activa; la cuenta est activa si su saldo es superior o mayor a 10*/
    private boolean estado;

    /*Constructor de la clase cuenta ahorros los parametros que va a rcibir es paramero que define el saldo de l acuenta ahorros
    * parametro tasa parametro que define ñl atasa anual de interes de la cuenta ahorros*/
    public Cuentaahorros(float saldo, float tasa){
        super(saldo,tasa);
        /*Realizamos una condicional para saber si la cuenta esta activa o no*/
        if (saldo<=10){
            //Se desaciva la cuenta
            estado=false;
        }
        else{
            estado=true;
        }

        /*Metodo que recibe una cantidad de dinero a retirar y actualizar el saldo de la cuenta
        * parametro que define la cantidad da retirar de una cuenta de ahorros*/

    }

    @Override
    public void retirar(float cantidad){
        //Si la cuenta esta activa se realiza el retiro
        if (estado) {
            //Invocamos el metodo retirar de la clase padre
            super.retirar(cantidad);
        }
    }
}
