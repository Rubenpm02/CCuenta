package Cuentas;


/**

La clase CCuenta representa una cuenta corriente en un banco.

*/
public class CCuenta {

/* Nombre del titular de la cuenta */
    private String nombre;
    /* Numero de cuenta */
    private String cuenta;
    /* Saldo de la cuenta */
    private double saldo;
    /* Tipo de interés de la cuenta */
    private double tipoInteres;
/**
 * Constructor por defecto
 */
    public CCuenta()
    {
    }
/**
Constructor con parámetros
@param nom Nombre del titular de la cuenta
@param cue Número de cuenta
@param sal Saldo de la cuenta
@param tipo Tipo de interés de la cuenta
*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/*Método para obtener el nombre del titular de la cuenta
*@return Nombre del titular de la cuenta
*/
    public String getNombre() {
    return nombre;
}
/*Método para establecer el nombre del titular de la cuenta
* @param nombre Nombre del titular de la cuenta.
*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/*Método para obtener el número de cuenta
* @return Número de cuenta.
*/
    public String getCuenta() {
        return cuenta;
    }
/*Método para establecer el número de cuenta
*@param cuenta Número de cuent
*/
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
/*Método para obtener el saldo de la cuenta
*@return Saldo de la cuenta
*/
    public double getSaldo() {
        return saldo;
    }
/*Método para establecer el saldo de la cuenta
*@param saldo Saldo de la cuenta
*/
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/*Método para obtener el tipo de interés de la cuenta
*@return Tipo de interés de la cuenta
*/
    public double getTipoInteres() {
        return      tipoInteres;
    }
/*Método para establecer el tipo de interés de la cuenta
*@param tipoInteres Tipo de interés de la cuenta
*/
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
/*Método que permite consultar el saldo actual de la cuenta
@return El saldo actual de la cuenta
*/
    public double estado()
    {
        return saldo;
    }

/*Método que permite ingresar una cantidad en la cuenta
@param cantidad Cantidad a ingresar en la cuenta
@throws Exception si la cantidad a ingresar es negativa
*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

/*Método que permite retirar una cantidad de la cuenta
@param cantidad Cantidad a retirar de la cuenta
@throws Exception si la cantidad a retirar es negativa o si no hay suficiente saldo en la cuenta
*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

