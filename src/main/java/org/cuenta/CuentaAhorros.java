package org.cuenta;


/*Esta clase denominada cuentaahorros modela una cuenta de ahorros que es una subclase de cuenta. Tiene un nuevo
* atributo:activa.*/

public class CuentaAhorros extends cuenta {

    /*Atributo que identifica si una cuenta esta activa: la cuenta esta activa si su saldo es superior a 10*/
    private boolean estado;

    /*Constructor de la clase cuenta ahorros los parametros que va a rcibir es paramero que define el saldo de l acuenta ahorros
     * parametro tasa parametro que define ñl atasa anual de interes de la cuenta ahorros*/
    public CuentaAhorros(float saldo, float tasaanual){
        super(saldo,tasaanual);
        /*realizamos una condiucion para saber si la cuenta esta activa*/
        if(saldo <=10){
            /*si desactiva la cuenta*/
            estado = false;
        } else {
            /*caso contrario se actuiva la cuenta*/
            estado = true;
        }
    }
    /*Creamos un metodo que que recibe una cantidad de dinero a retirar y actualizar el saldo de la cuenta
    @Param saldo, parametro que define la cantidad a retirar de una cuenta de ahorros*/

    public void depositar(float cantidad) {
        if (estado) {
            super.depositar(cantidad);
        }
        else {
            System.out.println("La cuenmta de ahorros esta inactivada.");
        }
    }

    public void retirar(float cantidad) {

        /*Se utiliza un if para verificar si la cuenta esta activa para realiza el retiro*/
        if (estado) {
            /*invocamos el metodo retirar de la clase padre*/
            super.retirar(cantidad);
        }
        else{
            System.out.println("La cuenmta de ahorros esta inactivada");
        }
    }

    /* Se crea un metodo que nos permita poner una condicion para el numero de retiros
    * y tambien se le define las variables numeroderetiro y comisionmensual*/
    public void extractoMensual() {
        float numeroderetiro=0;
        float comisionmensual=0;
        if (numeroderetiro > 4){
            comisionmensual = comisionmensual+1;
            comisionmensual += (numeroderetiro-4);
        }
        super.extractoMensual();
    }
    /*Imprimir los datos y resultados con los parametros
     * estado representando si se encuentra activo o inactivo*/
    public void imprimir(){
        super.imprimir();
        System.out.println("Su estado de la cuenta es:"+(estado));
    }


}
