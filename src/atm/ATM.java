/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 * cajero que usa la cuenta para operar es el presentador
 *
 * @author Fabian Florez (cod 202614060)
 * @version 1.0
 */
public class ATM {

    private BankAccount account;
    private ATMView view;

    /**
     * arma el cajero con su cuenta y su vista
     * @param account cuenta que va a usar
     * @param view vista para mostrar
     */
    public ATM(BankAccount account, ATMView view) {
        this.account = account;
        this.view = view;
    }

    /**
     * deposita plata
     * @param amount monto a depositar
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void deposit(double amount) {
        account.deposit(amount);
        view.showMessage("Deposito exitoso. Saldo actual: " + account.getBalance());
    }

    /**
     * retira plata
     * @param amount monto a retirar
     * @param passwordEntered clave que metio el usuario
     * @throws InsufficientBalanceException si no alcanza el saldo
     * @throws IncorrectKeyException si la clave no coincide
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void withdraw(double amount, String passwordEntered)
            throws InsufficientBalanceException, IncorrectKeyException {
        account.withdraw(amount, passwordEntered);
        view.showMessage("Retiro exitoso. Saldo actual: " + account.getBalance());
    }
}
