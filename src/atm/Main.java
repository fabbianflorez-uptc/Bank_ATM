/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

/**
 * clase principal que prueba los casos del taller
 *
 * @author Fabian Florez (cod 202614060)
 * @version 1.0
 */
public class Main {

    /**
     * constructor vacio
     */
    private Main() {
    }

    /**
     * metodo principal
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001", "1234", 500);
        ATMView view = new ATMView();
        ATM atm = new ATM(account, view);

        view.showMessage("Saldo inicial: " + account.getBalance());

        // caso 1 clave incorrecta
        try {
            atm.withdraw(100, "0000");
        } catch (IncorrectKeyException e) {
            view.showMessage(e.getMessage());
        } catch (InsufficientBalanceException e) {
            view.showMessage(e.getMessage());
        } catch (InvalidAmountException e) {
            view.showMessage(e.getMessage());
        } finally {
            view.showMessage("Intento procesado");
        }

        // caso 2 monto mayor al saldo
        try {
            atm.withdraw(1000, "1234");
        } catch (IncorrectKeyException e) {
            view.showMessage(e.getMessage());
        } catch (InsufficientBalanceException e) {
            view.showMessage(e.getMessage());
        } catch (InvalidAmountException e) {
            view.showMessage(e.getMessage());
        } finally {
            view.showMessage("Intento procesado");
        }

        // caso 3 monto negativo
        try {
            atm.withdraw(-50, "1234");
        } catch (IncorrectKeyException e) {
            view.showMessage(e.getMessage());
        } catch (InsufficientBalanceException e) {
            view.showMessage(e.getMessage());
        } catch (InvalidAmountException e) {
            view.showMessage(e.getMessage());
        } finally {
            view.showMessage("Intento procesado");
        }

        // caso 4 retiro valido
        try {
            atm.withdraw(200, "1234");
        } catch (IncorrectKeyException e) {
            view.showMessage(e.getMessage());
        } catch (InsufficientBalanceException e) {
            view.showMessage(e.getMessage());
        } catch (InvalidAmountException e) {
            view.showMessage(e.getMessage());
        } finally {
            view.showMessage("Intento procesado");
        }

        view.showMessage("Saldo final: " + account.getBalance());
    }
}
