import java.util.*;
class Main 
{
  public static void counter(int count)
    {
      count ++ ;
      System.out.println("count "+count);
    }

  public static void Name(Account a )
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("user-name ") ;
    String n = sc.nextLine() ;
    a.setName(n);


  }
  public static void Address(Account a )
  {
    Scanner se = new Scanner(System.in) ;
    System.out.println("Address of user  ") ;
    String ad = se.nextLine() ;
    a.setAddress(ad);


  }
  public static void  Balance (Account a )
  {
    Scanner sw = new Scanner(System.in) ;
    System.out.println("Balance   ") ;
    int x  = sw.nextInt() ;
    a.setBalance(x);


  }
  public static void  Accountnumber(Account a )
  {
    Scanner sh = new Scanner(System.in) ;
    System.out.println("account number ") ;
    int n = sh.nextInt() ;
    a.setAnumber(n);
  }
  
  public static class Account
  {
    String name ;
    String address ;
    int balance ;
    int anumber ;
    public String getName()
    {
      return name ;
    }
    public String getAddress()
    {
      return address ;
    }
    public int getBalance()
    {
      return balance ;
    }
    public int getAnumber()
    {
      return anumber;
    }
    public void setName(String name)
    {
      this.name = name;
    }
    public void setAddress(String address)
    {
      this.address = address ;
    }
    public void setBalance(int balance)
    {
      this.balance = balance ;
    }
    public void setAnumber(int anumber)
    {
      this.anumber = anumber ;
    }
    

  }
  public  static void details(Account a)
  {
    System.out.println("Summary  ") ;
    System.out.println("Name   "+a.getName()) ;
    System.out.println("Address  "+a.getAddress()) ;
    System.out.println("Balance   "+a.getBalance()) ;
    System.out.println("Account number  "+a.getAnumber()) ;
    System.out.println("Thanks for visting us  ") ;
  }

  public static void main(String args[])
  {
    int count = 0 ;
    Account a = new Account() ;
    Name(a);
    Address(a);
    Balance(a);
    Accountnumber(a);
    if(a.getBalance()<500)
    {
      System.out.println("You have a balance of less than 500 ") ;
      System.out.println("5 rs dedected for voilating the terms and conditions");
      int s = a.getBalance() ;
      s = s-5 ;
      a.setBalance(s); 

    }
    else 
    {
      System.out.println(" your balance is >500 ");
    }
   counter(count) ;
    details(a) ;
    
  }
}
