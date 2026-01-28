import java.util.Scanner;
import java.util.ArrayList;
public class bankAccount {

    public accountHolder AccountHolder;
    public String accountNumber;
    public String accountType;
    public int balance;
    public ArrayList<Integer> deposists = new ArrayList<>();
    public ArrayList<Integer> withrawals = new ArrayList<>();

    public bankAccount(accountHolder AccountHolder,String accountNumber,String accountType){

        this.AccountHolder = AccountHolder;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance= 0;
    }

    public void cashDeposit(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        int amount = sc.nextInt();

        this.balance += amount;
        this.deposists.add(amount);
        System.out.println("Cash deposit is Successful!, Your balance is "+ getBalance());
    }

    public void cashWithdrawl(){
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount to be withdrawn: ");
            int amount = sc.nextInt();

            if(this.balance>amount){
                this.balance -= amount;
                this.withrawals.add(amount);
                System.out.println("Cash withdrawal is successful, Your balance is "+ getBalance());
                break;
            }
            else{
                System.out.println("Insufficient account balance, Your balance is "+ getBalance());
            }
            }catch(Exception e){
                System.out.println("Invalid input, Please enter a valid amount to withdraw: ");
            }

        }
    }

    public int getBalance(){
        return this.balance;
    }

    public double getTotalAfterInterestForPeriod(int periodinyears){
        if (this.accountType.equals("sa")){
            if (periodinyears>=0){
                double totalval = this.balance + this.balance *0.02 * periodinyears;
                return totalval;
            }else{
                System.out.println("Invalid period");
                return this.balance;
            }
        }    
            
        else if(this.accountType.equals("FD")){
            if (periodinyears<0){
                System.out.println("Invalid period");
                return this.balance;
            }
            else if (periodinyears<=2){
               double totalval = this.balance + this.balance *0.125 * periodinyears;
               return totalval;
            }
            else if (periodinyears<=5){
                double totalval = this.balance + this.balance *0.165 * periodinyears;
                return totalval;
            }
            else{
                double totalval = this.balance + this.balance *0.2 * periodinyears;
                return totalval;
            }

        }
        return this.balance;
        
    }

    public void getWithdrawalHistory(){
        System.out.println("Withdrawal History: ");
        for (Integer oneTransaction : this.withrawals){
            System.out.println(oneTransaction);
        }
    }
}
