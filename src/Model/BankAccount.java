package Model;

public class BankAccount {
    private String ownerName;
    private Float balanceAccount;

    public BankAccount(String ownerName, Float balanceAccount) {
        this.ownerName = ownerName;
        this.balanceAccount = balanceAccount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Float getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(Float balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public void add(Float moneyAdd){
        Float totalMoneyToAdd = getBalanceAccount() + moneyAdd;
        setBalanceAccount(totalMoneyToAdd);
    }

    public void withdraw(Float withdrawMoney){
        Float totalMoneyToWithdraw = getBalanceAccount() - withdrawMoney;
        setBalanceAccount(totalMoneyToWithdraw);
    }
}
