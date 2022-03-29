import Model.BankAccount;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******* Account Balance APP!! *******");
        System.out.print("Please enter owner name: ");
        String ownerName = scanner.next();
        System.out.print("Please enter Balance Account: ");
        float accountBalance;
        try{
            accountBalance = scanner.nextFloat();
        }catch (InputMismatchException e){
            System.out.println("Please input a number");
            return;
        }
        BankAccount bankAccount = new BankAccount(ownerName, accountBalance);
        String input = "";
        while (!input.equals("q")){
            System.out.println("""
                    Enter\s
                     (A) to add an amount  to your account\s
                     (R) to remove an amount for your account\s
                     (S) for check you current account Balance or\s
                     (Q) to Exit""");
            System.out.print("->> ");
            input = scanner.next().toLowerCase();
            if(input.equals("a")){
                try{
                    System.out.println("Enter the amount of money you want to add");
                    System.out.print("->> ");
                    input = scanner.next();
                    Float moneyToAdd = Float.parseFloat(input);
                    bankAccount.add(moneyToAdd);
                }catch (NumberFormatException e){
                    System.out.println("Please enter a valid number \n");
                }
            }
            if(input.equals("r")){
                try{
                    System.out.println("Enter the amount of money you want to withdraw");
                    System.out.print("->> ");
                    input = scanner.next();
                    Float moneyToRemove = Float.parseFloat(input);
                    if(bankAccount.getBalanceAccount() > moneyToRemove){
                        bankAccount.withdraw(moneyToRemove);
                    }else {
                        System.out.println("Not enough founds to commit the action \n");
                    }

                }catch (NumberFormatException e){
                    System.out.println("Please enter a valid number \n");
                }
            }
            if(input.equals("s")){
                System.out.println("Your Current Balance: $ " + bankAccount.getBalanceAccount() +"\n");
            }

        }

    }
}
