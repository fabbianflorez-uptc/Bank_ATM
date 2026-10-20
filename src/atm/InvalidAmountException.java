/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package atm;

/**
 * esta excepcion sale cuando el monto es menor o igual a cero
 *
 * @author Fabian Florez (cod 202614060)
 * @version 1.0
 */
public class InvalidAmountException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * constructor de la excepcion
     * @param message mensaje del error
     */
    public InvalidAmountException(String message) {
        super(message);
    }
}
