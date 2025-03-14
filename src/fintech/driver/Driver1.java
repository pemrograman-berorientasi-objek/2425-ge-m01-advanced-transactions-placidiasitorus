package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.util.*;

/**
 * @author 12S23022 P. Santa Hillary Sitorus
 * @author 12S23034 Pariama Valentino Sihombing
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) 
                break;
            
            String[] parts = input.split("#");
            
            if (parts[0].equals("create-account")) {
                String owner = parts[1];
                String accountName = parts[2];
                Account newAccount = new Account(owner, accountName);
                accounts.add(newAccount);
                System.out.println(owner + "|" + accountName + "|0.0");
            } else if (parts[0].equals("create-transaction")) {
                String transactionUsername = parts[1];
                double amount = Double.parseDouble(parts[2]);
                String postedAt = parts[3];
                String note = parts[4];
                Transaction newTransaction = new Transaction(transactionUsername, amount, postedAt, note);
                transactions.add(newTransaction);
                System.out.println(transactions.size() + "|" + transactionUsername + "|" + amount + "|" + postedAt + "|" + note + "|" + amount);
            }
        }
        
        scanner.close();
    }
}