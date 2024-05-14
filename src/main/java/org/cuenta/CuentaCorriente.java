package org.cuenta;

public class CuentaCorriente extends cuenta{

    /*Creamos un atibuto que s ellame sobregiro*/
    private float sobregiro;

    /*Se creara un constructor de la cuenta corriente
     * @Parametros saldo, parametro que define el saldo de la cuenta corriente
     * @Parametros tasaanual parametro que define la tasa anual de la cuenta corriente*/
    public CuentaCorriente(float saldo, float tasaAnual){
        super(saldo,tasaAnual);
        this.sobregiro=0;
    }
    /*Se creara un metodo que nos permita retirar el dinero el cual se lo denominaracomo sobregiro*/
    /*@Parametros saldo, parametro que define la cantidad a retirar de una cuenta corriente*/

    public void retirar(float cantidad, float saldo, float numeroderetiro) {
        /*Se utiliza un if para ver si es verdadera la cantidad, nos reflejara */
        if (cantidad>=saldo+sobregiro) {
            if (saldo>=cantidad) {
                saldo-=cantidad;
            } else {
                sobregiro-=(cantidad-saldo);
                saldo=0;
            }
            numeroderetiro=numeroderetiro+1;
        }
    }

    /*Se creara un metodo que nos permita depositar el dinero el cual se lo denominaracomo sobregiro*/
    /*@Parametros cantidad, parametro que define la cantidad a retirar de una cuenta corriente*/
    public void depositar(float cantidad) {
        super.depositar(cantidad);
        if (sobregiro<5) {
            if (cantidad>=sobregiro) {
                sobregiro=cantidad+sobregiro;
            } else {
                sobregiro=0;
            }
        }
        else {
            sobregiro=0;
        }
    }
    /*Imprimir los datos y resultados con los parametros
     * sobregiro representando si se encuentra activo o inactivo*/
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de sobregiro: " + sobregiro);
    }
}
