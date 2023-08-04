import java.util.*;
class Main
{

  public static void  branch(Student rohan)
  {
    Scanner hs = new Scanner(System.in) ;
    String br = hs.nextLine() ;
    rohan.setBranch(br) ;


  }
  public static  void detail(Student rohan)
  {
    System.out.println("name "+rohan.getName()) ;
    System.out.println("Age  "+rohan.getAge()) ;
    System.out.println("roll  "+rohan.getRoll()) ;
    System.out.println("branch  "+rohan.getBranch()) ;
    System.out.println("last roll number  "+rohan.getLatroll()) ;
  }
  public static class Student
  {
    String name ; 
    int age ;
    int roll  ;
    String branch  ;
    int latroll  ;
    public String getName()
    {
      return name ;
    }
    public int getAge()
    {
      return age ;
    }
    public int getRoll()

    {
      return roll ; 
    }
    public String getBranch()
    {
      return branch ;
    }
    public int getLatroll()
    {
      return latroll  ;
    }
    public void setName(String name)
    {
      this.name = name ;
    }
    public void setAge(int age)
    {
      this.age = age ;
    }
    public void setRoll(int roll)
    {
      this.roll = roll  ;
    }
    public void setBranch(String branch)
    {
      this.branch = branch ;
    }
    public void setLatroll(int latroll)
    {
      this.latroll = latroll ;
    }

  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    Student rohan = new Student() ;
    String n= sc.nextLine() ;
    rohan.setName(n);
    int a = sc.nextInt() ;
    rohan.setAge(a);
    int r = sc.nextInt() ;
    rohan.setRoll(r);
    branch(rohan) ;
    //rohan.setBranch(br);
    int lr =sc.nextInt() ;
    rohan.setLatroll(lr);
    detail(rohan) ;

  }
}

