package fintech.model;

/**
 * @author 12S23022 P. Santa Hillary Sitorus
 * @author 12S23034 Pariama Valentino Sihombing
 */
public class Transaction {

    private static int counter = 1;
    private int id;
    private String accountName;
    private double amount;
    private String postedAt;
    private String note;

    public Transaction(String accountName, double amount, String postedAt, String note) {
        this.id = counter++;
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = note;
    
    } 

    public int getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAmount() {
        return amount;
    }
    
    public String getPostedAt() {
        return postedAt;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return id + " | " + accountName + " | " + amount + " | " + postedAt + " | " + note;
        
    }
}