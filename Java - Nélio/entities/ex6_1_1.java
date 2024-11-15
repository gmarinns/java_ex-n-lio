package entities;

public class ex6_1_1 {

    private int accountNumber;
    private String accountHolderName;
    private double inicialBalance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getInicialBalance() {
        return inicialBalance;
    }

    public void setInicialBalance(double inicialBalance) {
        this.inicialBalance = inicialBalance;
    }

    public void addBalance(double inicialBalance) {
        this.inicialBalance += inicialBalance;
    }

    public void removeBalance(double inicialBalance) {
        this.inicialBalance -= inicialBalance;
    }
}
