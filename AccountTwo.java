public class AccountTwo{
       private String name;
       private int accountNumber;
       private String accountType;
       private boolean active;


    public AccountTwo(){
       System.out.println("name");
    }

    public AccountTwo(String accountType){
         this.accountType = accountType;
    }

    public String getAccountType(){
             return accountType;
    }

    public int getAccountNumber(){
             return accountNumber;

    }


}