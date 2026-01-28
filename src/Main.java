public class Main {

    public static void main(String[] args) {
        accountHolder Jane = new accountHolder( "Jane anderson", "25/06/2025",  "22/4 Colombo");
        bankAccount JanesAccount = new bankAccount("Jane anderson","25/06/2025","22/4 Colombo","2536466","sa");
        JanesAccount.cashDeposit();
        JanesAccount.cashWithdrawl();
        System.out.println(JanesAccount.getBalance());
        System.out.println("Total after interest for 3 years: "+ JanesAccount.getTotalAfterInterestForPeriod(4));
    }
}