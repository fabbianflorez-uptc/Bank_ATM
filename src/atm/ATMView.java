/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 * vista del cajero que muestra mensajes por consola
 *
 * @author Fabian Florez (cod 202614060)
 * @version 1.0
 */
public class ATMView {

    /**
     * constructor vacio
     */
    public ATMView() {
    }

    /**
     * muestra mensajes
     * @param message mensaje a mostrar
     */
    public void showMessage(String message) {
        System.out.println(message);
    }

    /**
     * muestra el saldo
     * @param balance saldo a mostrar
     */
    public void showBalance(double balance) {
        System.out.println("Saldo actual: " + balance);
    }
}
