import java.util.*;
class Airline
{
    public static void detail()
    {
        System.out.print(" Flight is on time");
    }
    public static  class Premium
    {
        String cusname ;
        String airname ;
        public String getCusname()
        {
            return cusname ;
        }
        public  String getAirname()
        {
            return airname ;
        }
        public void setCusname(String yname)
        {
            this.cusname = yname ;
        }
        public void setAirname(String airn )
        {
            this.airname = airn ;

        }
    }
    public static class Baggage
    {
        String companyname ;
        int dim ;
        String colour ;
        public String getCompanyname()
        {
            return companyname ;
        }
        public int getDim()
        {
            return dim ;
        }
        public String getColour()
        {
            return colour ;
        }
        public void setCompanyname(String companyname)
        {
            this.companyname = companyname ;
        }
        public void setDim(int dim)
        {
            this.dim = dim ;
        }
        public void setColour(String colour)
        {
            this.colour = colour ;
        }
    }
    public static  class Current
    {
        String name ;
        String destination ;
        int pnr ;
        public String getName()
        {
            return name ;
        }
        public String getDestination()
        {
            return destination ;
        }
        public int getPnr()
        {
            return pnr ;
        }
        public  void setName(String name)
        {
            this.name = name ;

        }
        public void setDestination(String destination)
        {
            this.destination = destination ;
        }
        public void setPnr(int pnr)
        {
            this.pnr = pnr ;

        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("WELCOME TO AIRLINE SERVICE ") ;
         System.out.println("What would you like to do  ") ;
          System.out.println("1) Current Flight timing ") ;
           System.out.println("2) Baggage claim report ") ;
            System.out.println("3) Premium lounge services ") ;
             System.out.println("4)Contact us  ") ;
        System.out.println("What would you like to do  ") ;
        int choice = sc.nextInt() ;
        if(choice==1)
        {
           Current c = new Current() ;
           System.out.print("enter the name of the airlines") ;
            String n = sc.nextLine() ;
            System.out.print("\n");
            System.out.print("enter the name of destination") ;
            String des = sc.nextLine() ;
            System.out.println("enter pnr ") ;
            int pr = sc.nextInt() ;
            c.setName(n) ;
            c.setDestination(des) ;
            c.setPnr(pr) ;
            if(c.getName()==n)
            {
                System.out.println("flight name located ") ;
            }
            else 
            {
                System.out.println("flight name is invalid ") ;
            }
            if(c.getDestination()==des)
            {
                 System.out.println("flight destination located ") ;
            }
            else 
            {
                System.out.println("flight with destination not found") ;
            }
            if(c.getPnr()==pr)
            {
                System.out.println("pnr number found") ;
            }
            else 
            {
                System.out.println(" pnr number not found !");
            }
            detail() ;
    }
    else if(choice==2)
    {
        System.out.println("Baggage lost community ") ;
        Baggage bg = new Baggage() ;
        System.out.println("enter name please");
        String na = sc.nextLine();
        bg.setCompanyname(na);
        System.out.println("enter dimension ");
        int di = sc.nextInt();
        bg.setDim(di);
        System.out.println("enter colour ");
        String col  = sc.nextLine();
        bg.setColour(col);
        if(bg.getDim()==20 && bg.getColour()=="orange" && bg.getCompanyname()=="aristocrat")
        {
            System.out.println("Yes found on gate 5") ;
        }
        else{
            System.out.println("Sorry not found but your claim has been registered ") ;
        }
    }
    else if(choice==3)
    {
        System.out.println("Premium lounge services ") ;
        Premium p = new Premium() ;
        System.out.println("enter your name please ") ;
        String yname = sc.nextLine() ;
        p.setCusname(yname) ;
        System.out.println("enter airline name  ") ;
        String airn = sc.nextLine() ;
        p.setAirname(airn) ;
        System.out.println("Welcome "+p.getCusname()) ;
        System.out.println("welcome to our premium lounge ") ;
    }
    else 
    {
        Premium pn = new Premium();
        System.out.println("please visit our website "+pn.getAirname()+"@gmail.com") ;
        System.out.println("contactnumber XXXXX ") ;
    }
}
}
