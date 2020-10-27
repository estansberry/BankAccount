public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double balance, int accountID){
    balance = balance;
    accountID = accountID;
  }
  public Boolean deposit(double amount){
    if (amount >= 0){
      balance += amount;
      return(true);
    }else{
      return(false);
    }
  }
  public Boolean withdraw(double amount){
    if (amount < 0 || balance - amount < 0){
      return(false);
    }else{
      balance = balance - amount;
      return(true);
    }
  }
  public String toString(){
    String newstr = "";
    newstr = accountID + "\t" + balance;
    return(newstr);
  }
  
  public double getBalance(){
    return(balance);
  }
  public int getAccountID(){
    return(accountID);
  }
  public void setPassword(String newpass){
    password = newpass;
  }
}
