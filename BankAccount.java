abstract class Account{
    abstract void CalculateYearlyInterest();
}
class BankAccount extends Account {
    int accountNumber;
    double Balance;
    public BankAccount(int accountNumber , double Balance){
        this.accountNumber = accountNumber;
        this.Balance = Balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance(){
        return Balance;
    }

    double deposit(double amount){
        Balance = Balance + amount;
        return Balance;
    }
    
    double withdraw(double amount){

        if (Balance < amount){
            System.out.println("Insufficient Balance!!!");
            return Balance;
        } 
        Balance = Balance - amount;
        return Balance;
    }
    @Override
    void CalculateYearlyInterest(){
        System.out.println("No specific interest calculation for generic BankAccount.");
    }
}

class SavingsAccount extends BankAccount{
    double interest;
    SavingsAccount(int accountNumber ,double Balance , double interest){
        super(accountNumber , Balance);
        this.interest = interest;
    }
    @Override
    double withdraw(double amount){
        if (Balance < amount){
            System.out.println("Insufficient Balance!!!");
            return Balance;
        }else{
            Balance = Balance - amount;
            return Balance;
        } 
    }

    void addInterest(){
         Balance += Balance * interest;
        System.out.println("Interest added. New Balance: " + Balance);
    }
    @Override
    void CalculateYearlyInterest(){
        double YearlyInterest = Balance * interest;
        Balance = Balance + YearlyInterest;
        System.out.println(Balance);
    }
}

class CurrentAccount extends BankAccount{
    double overDraftLimit;

    CurrentAccount(int accountNumber , double Balance , double overDraftLimit){
        super(accountNumber, Balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    double withdraw(double amount){
        if (Balance + overDraftLimit < amount){
            System.out.println("Overdraft limit exceeded!!!");
            return Balance;
        }else{
            Balance -= amount;
            return Balance;
        }
    }

    @Override
    void CalculateYearlyInterest(){
        System.out.println("No specific interest calculation for generic BankAccount.");
    }
}