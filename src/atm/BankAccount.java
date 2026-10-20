/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 * cuenta del cajero con numero clave y saldo es el modelo
 *
 * @author Fabian Florez (cod 202614060)
 * @version 1.0
 */
public class BankAccount {

    private String accountNumber;
    private String password;
    private double balance;

    /**
     * crea la cuenta
     * @param accountNumber numero de la cuenta
     * @param password clave de la cuenta
     * @param balance saldo inicial
     */
    public BankAccount(String accountNumber, String password, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    /**
     * devuelve el numero
     * @return numero de la cuenta
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * devuelve el saldo
     * @return saldo actual
     */
    public double getBalance() {
        return balance;
    }

    /**
     * mete plata a la cuenta
     * @param amount monto a depositar
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("El monto debe ser mayor a cero");
        }
        balance += amount;
    }

    /**
     * saca plata de la cuenta
     * @param amount monto a retirar
     * @param passwordEntered clave que metio el usuario
     * @throws IncorrectKeyException si la clave no coincide
     * @throws InsufficientBalanceException si no alcanza el saldo
     * @throws InvalidAmountException si el monto es menor o igual a cero
     */
    public void withdraw(double amount, String passwordEntered)
            throws IncorrectKeyException, InsufficientBalanceException {
        if (!password.equals(passwordEntered)) {
            throw new IncorrectKeyException("Clave incorrecta");
        }
        if (amount <= 0) {
            throw new InvalidAmountException("El monto debe ser mayor a cero");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Saldo insuficiente");
        }
        balance -= amount;
    }
}
