package Feb.Encapsulation;

public class ecap {
    public static void main(String[] args) {
    Bank b=new Bank("Shubham",396588525,100);
    // It is not allowed if encapsulation is done
//        System.out.println(b.balance);
//        b.balance=200;
//        System.out.println(b.balance);

        // After applying encapsulation that is adding getter setter methods and making the Data members/vriables as private/protected
        int bal=b.getBalance();
        System.out.println(bal);
        //b.setBalance(2000,"Shubham");
        b.setBalance(1000,"cashier");
        int bal2=b.getBalance();
        System.out.println(bal2);

        long accNum=b.getAccNumber();
        System.out.println("Your account number is --->>>"+" "+accNum);



        b.setAccNumber(859652852,"admin");
        long updatedAccNumber=b.getAccNumber();

        System.out.println("Your new account number is --->>>"+" "+updatedAccNumber);

    }

}



class Bank{
    String accountHolderName;
     private long accNumber;
     private int balance;

    Bank(String name_c,long accNumber_c, int balance_c){
        this.accountHolderName=name_c;
        this.accNumber=accNumber_c;
        this.balance=balance_c;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance,String name) {
        if(name.equalsIgnoreCase("Cashier")){
            this.balance = balance;
        }
        else{
            System.out.println("It is not allowed to update Balance if not cashier");
        }
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber, String name) {
        if(name.equalsIgnoreCase("Admin")){
            this.accNumber = accNumber;
        }
        else{
            System.out.println("It is not allowed without admin");
        }
    }
}