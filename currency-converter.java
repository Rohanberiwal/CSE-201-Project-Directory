import java.util.*;
class Main 
{
    public static class Currency
    {
        String name  ;
        Double  value  ; 
        public  String  getName()
        {
            return name  ;
        }
        public Double getValue()
        {
            return value  ;
        }
        public void setName(String name)
        {
            this.name = name ;
        }
        public void setValue(Double value)
        {
            this.value  = value ;
        }
        


    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Weclome to my currency converter ");
        System.out.println("enter the name of your currency ") ;
        String currency1 = sc.nextLine() ;
         System.out.println("enter the name of currancy you want to convert it to ") ;
        String currency2 = sc.nextLine() ;
        Currency c1 = new Currency() ;
        c1.setName(currency1) ;
        Currency c2 = new Currency();
        c2.setName(currency2) ;
        if(c1.getName()==c2.getName())
        {
            System.out.println("Cannot do the conversion") ;
        }
        else if(c1.getName()=="Rupee" && c2.getName() =="Dollar")
        {
            c1.setValue(1.00) ;
            c2.setValue(81.56) ;
            System.out.println(" rupee is 81.56 times weaker than a dollar") ;
        }
        else if(c1.getName() ==" euro" && c2.getName()=="Dollar")
        {
            c1.setValue(1.00) ;
            c2.setValue(0.81) ;
            System.out.println("Euro is a strong currency ");
        }
        

    }
}
