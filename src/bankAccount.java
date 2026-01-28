public class bankAccount {

    public String name;
    public String Birthday;
    public String address;
    public String accountNumber;
    public String accountType;
    public int balance;

    public bankAccount(String name, String Birthday, String address,String accountNumber,String accountType){

        this.name =name;
        this.Birthday = Birthday;
        this.address = address;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance= 0;
    }

    public void cashDeposit(int amount){
        this.balance += amount;
        System.out.println("Cash deposit is Successful!, Your balance is "+ getBalance());
    }

    public void cashWithdrawl(int amount){
        if(this.balance>amount){
            this.balance -= amount;
            System.out.println("Cash withdrawal is successful, Your balance is "+ getBalance());
        }
        else{
            System.out.println("Insufficient account balance, Your balance is "+ getBalance());
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
}
