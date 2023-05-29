package Cuentas;

import Cuentas.CCuenta;

/*Clase Main que ejecuta una operativa básica en una cuenta bancaria*/
public class Main {

/*Método principal que crea una cuenta bancaria y realiza una operativa en ella*/
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 2200);
    }

/*Método que realiza una operativa en una cuenta bancaria
@param cuenta cuenta bancaria sobre la que se realizará la operativa
@param cantidad cantidad con la que se realizará la operativa
*/
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
            
        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

