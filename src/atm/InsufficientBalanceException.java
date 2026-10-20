/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package atm;

/**
 * esta excepcion sale cuando el monto a retirar es mayor al saldo
 *
 * @author Fabian Florez (cod 202614060)
 * @version 1.0
 */
public class InsufficientBalanceException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * constructor de la excepcion
     * @param message mensaje del error
     */
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
