
import java.util.*;

import javax.swing.plaf.synth.SynthCheckBoxUI;
class Main
{
    static ArrayList<Admin> storage  = new ArrayList<>() ; // store the person deaitls who looged in as admin
    static HashMap<String, String> adventure = new HashMap<>(); // store the advaneture names
    static HashMap<String , Integer > uniqueid  = new HashMap<>() ; // store the ids
    static HashMap<String , String> animallist = new HashMap<>() ; // store animals
    static HashMap<String  , String> feedback = new HashMap<>() ; // view feedback
    static ArrayList<Person> visitors  = new ArrayList<>() ; // for the visitors who have taken tickets
    static HashMap<String, Integer> adventurepopularity  = new HashMap<>(); // this has to be made
    static HashMap<String , Integer> animalTypes  = new HashMap<>() ; // for the count of amphibian , mammal and replitels
    static ArrayList<Person>registered = new ArrayList<>() ; // this is for the registered memebers / Person
    static ArrayList<Discount> discounts = new  ArrayList<>() ; // this is for the discounts  ;
    static HashMap<String , String>animalvoice  = new HashMap<>() ; // animal voices
    static HashMap<String , String>animalhistory  = new HashMap<>() ; // for te history of animal
    static ArrayList<Adventure> storeZooAdventures = new ArrayList<>() ; // for the schedules event ,prices
    static HashMap<String , Integer >cashpayment = new HashMap<>() ;
    static ArrayList<SpecialDeals> specialdeal = new ArrayList<>() ;
    static ArrayList<String> amphibians = new ArrayList<>();
    static ArrayList<String> mammals = new ArrayList<>();
    static ArrayList<String> reptiles = new ArrayList<>();
    static int counterxd = 0;
    static class SpecialDeals // this is a dummy class
    {
        private  String code ;
        private  int tickets ;
        private int discountedoff  ;
        public String getCode() {
            return code;
        }
        public void setCode(String code) {
            this.code = code;
        }
        public int getTickets() {
            return tickets;
        }
        public void setTickets(int tickets) {
            this.tickets = tickets;
        }
        public int getDiscountedoff() {
            return discountedoff;
        }
        public void setDiscountedoff(int discountedoff) {
            this.discountedoff = discountedoff;
        }
    }
    static class Discount // Made this explicity for reson to show descriprtion in the discount copuns \
    {
        private String name ;
        private String description  ;
        private int agelower ;
        private int ageupper ;
        private int amount ;
        public int getAgelower()
        {
            return agelower;
        }
        public void setAgelower(int agelower) {
            this.agelower = agelower;
        }
        public int getAgeupper() {
            return ageupper;
        }
        public void setAgeupper(int ageupper) {
            this.ageupper = ageupper;
        }
        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getDescription()
        {
            return description;
        }

        public void setDescription(String description)
        {
            this.description = description;
        }
        public void setAmount(int amount)
        {
            this.amount  = amount  ;
        }
        public int getAmount()
        {
            return this.amount ;
        }

    }
    public static class Person // visitor
    {
        private String name ;
        private int  age ;
        private long phone ;
        private int balance  ;
        private String email;
        private String passcode ;
        private String ticketype ;
        private String status ;
        private int numberoftickets ;
        private int totalsum ;
        private HashMap<Adventure ,Integer> mytickets;
        private  boolean discountspecial1  = false ;
        private boolean discountchoiceflag ;
        private boolean applied  = false ;
        public Person(String name ,  int age , long phone , int balance  , String email  , String passcode)
        {
            this.name =  name ;
            this.age  = age ;
            this.phone  = phone ;
            this.balance  = balance ;
            this.email  = email  ;
            this.passcode  = passcode ;
            mytickets  = new HashMap<>() ;

        }
        public Person(Person person)
        {
            this.name =  person.name ;
            this.age  = person.age ;
            this.phone  = person.phone ;
            this.balance  = person.balance ;
            this.email  = person.email  ;
            this.passcode  = person.passcode ;

        }

        public boolean isApplied()
        {
            return applied;
        }
        public void setApplied(boolean applied)
        {
            this.applied = applied;
        }
        public boolean isDiscount()
        {
            return discountchoiceflag;
        }

        public void setDiscount(boolean discount)
        {
            this.discountchoiceflag = discount;
        }
        public void setFlag(boolean discountspecial1)
        {
            this.discountspecial1 = true  ;

        }
        public boolean getFlag()
        {
            return discountspecial1 ;
        }

        public  HashMap<Adventure , Integer> getMytickets()
        {
            return this.mytickets ;
        }
        public void printMyList() {
            for (Map.Entry<Adventure, Integer> entry : mytickets.entrySet()) {
                Adventure key = entry.getKey();
                int value = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + value);
            }
        }
        public int getFromMyList(Adventure  key) {
            if (mytickets.containsKey(key)) {
                return mytickets.get(key);
            } else {
               return -1 ;
            }
        }
        public void addMytickets(Adventure key, Integer  value)
        {
            mytickets.put(key, value);
        }
        public void removeMytickets(Adventure key)
        {
            mytickets.remove(key);
        }
        public int myticketsum()
        {
            int sum = 0;
            for (int value : mytickets.values()) {
                sum += value;
            }
            return sum;
        }
        public  int hashsize(HashMap<Adventure, Integer> mytickets)
        {
            return mytickets.size();
        }
        public int getTotalsum() {
            return totalsum;
        }
        public void setTotalsum(int totalsum) {
            this.totalsum = totalsum;
        }
        public int getNumberoftickets() {
            return numberoftickets;
        }
        public void setNumberoftickets(int numberoftickets) {
            this.numberoftickets = numberoftickets;
        }
        public String getName()
        {
            return name;
        }

        public int getAge() {
            return age;
        }

        public long getPhone() {
            return phone;
        }

        public int getBalance() {
            return balance;
        }

        public String getEmail() {
            return email;
        }

        public String getPasscode() {
            return passcode;
        }

        // Setter methods
        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPasscode(String passcode) {
            this.passcode = passcode;
        }
        public String getTicketType()
        {
            return ticketype;
        }

        public void setTicketType(String ticketype) {
            this.ticketype = ticketype;
        }
        public String getStatus()
        {
            return status;
        }
        public void setStatus(String status)
        {
            this.status = status;
        }

    }
    public static class Admin  // admin
    {
        private String username ;
        private String password ;
        private  int idnumber ; // This has to be ascessed in the other part as well
        public String getUsername()
        {
            return this.username ;
        }
        public int getId()
        {
            return this.idnumber ;
        }
        public String  getPassword()
        {
            return this.password;
        }
        public void setUsername(String username)
        {
            this.username  = username  ;
        }
        public void setPassword(String password)
        {
            this.password  = password  ;
        }
        public void setId(int idnumber)
        {
            this.idnumber =  idnumber ;
        }

    }
    // exrta class for the activity
    public static class Adventure{
        private int id;
        private String name;
        private String type;
        private String description;
        private String openingTime;
        private String closingTime;
        private double ticketPrice;
        private int visitorCount;

        public  Adventure(int id, String name, String description, String openingTime, String closingTime, double ticketPrice /*int visitorCount*/) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.ticketPrice = ticketPrice;
            //   this.visitorCount = visitorCount;
        }
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getOpeningTime() {
            return openingTime;
        }

        public void setOpeningTime(String openingTime) {
            this.openingTime = openingTime;
        }

        public String getClosingTime() {
            return closingTime;
        }

        public void setClosingTime(String closingTime) {
            this.closingTime = closingTime;
        }

        public double getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(double ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        public int getVisitorCount() {
            return visitorCount;
        }

        public void setVisitorCount(int visitorCount ) {
            this.visitorCount = visitorCount ;
        }

        // You can add more getters and setters if needed.
    }
    public static void printer()
    {
        for (String key : adventure.keySet()) {
            String sentence = adventure.get(key);
            System.out.println("Activity : " + key + ", Description: " + sentence);
        }
    }
    public static  void printerad(Adventure activity)
    {
        System.out.println(activity.id) ;
        System.out.println(activity.name) ;
        System.out.println(activity.description) ;
        System.out.println(activity.openingTime) ;
        System.out.println(activity.closingTime) ;
    }
    public static void idprinter()
    {
        for (String key : uniqueid.keySet()) {
            Integer sentence = uniqueid.get(key);
            System.out.println("Activity : " + key + ", Description: " + sentence);
        }
    }
    public static void infoprinter(Person s)
    {
        System.out.println(s.name) ;
        System.out.println(s.age) ;
        System.out.println(s.balance) ;
        System.out.println(s.phone) ;
        System.out.println(s.email) ;
    }
    public static String namecopy ;
    public static  int  agecopy ;
    public static  long phonecopy ;
    public static  int balancecopy  ;
    public static     String emailcopy;
    public static    String passcodecopy ;
    public static     String ticketype ;
    public static    String statuscopy ;
    public static    int numberoftickets ;


    public static void main(String args[])
    {// main
        animalTypes.put("Mammal", 0);
        animalTypes.put("Amphibian", 0);
        animalTypes.put("Reptile", 0);
        while(true) // infite input taker
        { // while true
            System.out.println("Welcome to ZOOtopia!") ;
            Scanner sc = new Scanner(System.in) ;
            System.out.println("1. Enter as Admin") ;
            System.out.println("2. Enter as a Visitor") ;
            System.out.println("3. View Special Deals") ;
            System.out.println("Enter your choice  : ") ;
            int choice = sc.nextInt() ;

            if(choice==1) // admin login
            {
                System.out.print("Enter Admin Username: ") ;
                String name = sc.next() ;
                System.out.print("Enter Admin Password: ") ;
                String pass = sc.next() ;
                Admin a  = new Admin() ;
                a.setUsername(name);
                a.setPassword(pass);
                a.setId(storage.size());
                storage.add(a) ;
                if(name.equals("admin") && pass.equals("admin123"))
                { // if closer
                    while(true) // for the login menu
                    {
                        System.out.println("Logged in as admin ") ;
                        System.out.println("\n") ;
                        System.out.println("Admin Menu: ") ;
                        System.out.println(
                                "1. Manage Attractions\r\n" +
                                        "2. Manage Animals\r\n" +
                                        "3. Schedule Events\r\n" +
                                        "4. Set Discounts\r\n" +
                                        "5. Set Special Deal\r\n" +
                                        "6. View Visitor Stats\r\n" +
                                        "7. View Feedback"
                        ) ;
                        System.out.println("8. Exit") ;
                        Scanner scanner =  new Scanner(System.in) ;
                        System.out.println("enter your choice ") ;
                        int intchoice  = scanner.nextInt() ;
                        //close(scanner) ;
                        // Manage attractionsc done
                        if (intchoice ==1)
                        {
                            while(true)
                            {
                                System.out.println("Manage Attractions:") ;
                                System.out.println("1. Add Attraction") ;
                                System.out.println("2. View Attractions") ;
                                System.out.println("3. Modify Attraction") ;
                                System.out.println("4. Remove Attraction") ;
                                System.out.println("5. Exit") ;
                                try
                                {
                                    System.out.println("enter your choice ") ;
                                    int newchoice = sc.nextInt() ;
                                    if(newchoice==5)
                                    {
                                        break ;
                                    }
                                    else if(newchoice ==1)
                                    {
                                        System.out.println("Adding Attraction") ;
                                        Scanner adder  = new Scanner(System.in) ;
                                        System.out.println("enter the activity name ");
                                        String adname  = adder.next() ;
                                        System.out.println("enter the description : ");
                                        adder.nextLine();
                                        String addes = adder.nextLine() ;
                                        adventure.put(adname , addes) ;
                                        int size = adventure.size();
                                        uniqueid.put(adname ,size) ;
                                        // printer() ;
                                        //idprinter() ;
                                        System.out.println("The "+adname+ " activity is added with id number "+uniqueid.get(adname)) ;

                                    }
                                    else if(newchoice==2)
                                    {
                                        if(adventure.size()==0)
                                        {
                                            System.out.println("No activity detected ") ;
                                        }
                                        printer() ;
                                    }
                                    else if(newchoice ==3)
                                    {
                                        if(adventure.size()==0)
                                        {
                                            System.out.println("Please add items ") ;
                                        }
                                        else
                                        {
                                            System.out.println("Enter the name you wish to modify : ");
                                            String modiname = sc.next() ;
                                            if (adventure.containsKey(modiname))
                                            {
                                                System.out.println("enter the new description : ") ;
                                                sc.nextLine() ;
                                                String newValue  = sc.nextLine() ;
                                                adventure.put(modiname, newValue);

                                                printer() ;
                                            }
                                            else
                                            {
                                                System.out.println("Activity '" + modiname + "' not found .");
                                            }
                                        }
                                    }
                                    else if(newchoice==4)
                                    {

                                        if(adventure.size()==0)
                                        {
                                            System.out.println("Please add items ") ;
                                        }
                                        else
                                        {
                                            System.out.println("Enter the name of the activity u wish to remove ") ;
                                            String remover  = sc.next() ;
                                            if (adventure.containsKey(remover))
                                            {
                                                adventure.remove(remover);
                                                uniqueid.remove(remover);

                                                System.out.println("Key '" + remover + "' and its description  removed.");
                                            }
                                            else
                                            {
                                                System.out.println("Activity '" + remover + "' not found .");
                                            }
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("This is not a valid choice ") ;
                                    }
                                }
                                catch (InputMismatchException e )
                                {
                                    System.out.println("This is not a valid entry please enter again ") ;
                                }
                            }
                        }
                        else if(intchoice ==2) // Manage Animals
                        {
                            //print(manage animals) ;
                            while(true)
                            {
                                System.out.println("Manage Animals") ;
                                System.out.println("1. Add Animal") ;
                                System.out.println("2. Update Animal Details") ;
                                System.out.println("3. Remove Animal deatils ") ;
                                System.out.println("4. Exit ") ;
                                try
                                {
                                    System.out.println("enter your choice ") ;
                                    int choice1  = sc.nextInt() ;
                                    if(choice1==4)
                                    {
                                        break ;
                                    }

                                    else if(choice1 ==1)
                                    {

                                        System.out.print("enter the name ") ;
                                        String animalname  = sc.next() ;
                                        System.out.println("enter the description(Please enter either of these  Case-Sensetive  : Mammal , Amphibian or Reptile) ")  ;
                                        sc.nextLine() ;
                                        String animaldes = sc.nextLine() ;
                                        System.out.println("enter the animal voice ") ;
                                        String animalvoices  = sc.next() ;
                                        System.out.println("enter a history about the animal ") ;
                                        sc.nextLine() ;
                                        String history  = sc.nextLine() ;
                                        String[] words = animaldes.split("\\s+");
                                        if (words.length > 2) {
                                            System.out.println("The animal belong to more than two class ");
                                        }

                                        else
                                        {
                                            if (animallist.containsKey(animalname) ) {
                                                System.out.println("The animal already exists in zoo.");
                                            }
                                            else
                                            {

                                                if (animalTypes.containsKey(animaldes))
                                                {
                                                    int currentnumerics  = animalTypes.get(animaldes);

                                                    if(currentnumerics<2)
                                                    {
                                                        animallist.put(animalname  , animaldes) ;
                                                        animalvoice.put(animalname , animalvoices ) ;
                                                        animalhistory.put(animalname , history) ;

                                                        int updatedValue =currentnumerics + 1;
                                                        animalTypes.put(animaldes, updatedValue);
                                                        System.out.println("Animal added ") ;


                                                    }

                                                    else if(currentnumerics>=2)
                                                    {
                                                        System.out.println("No more Accmodation possible in  "+animaldes) ;
                                                    }


                                                }


                                            }

                                        }

                                    }



                                    else if(choice1 ==2)
                                    {
                                        System.out.print("enter the name your to update   ") ;
                                        String animalname  = sc.next() ;
                                        if (animallist.containsKey(animalname))
                                        {
                                            System.out.println("enter the new description : ") ;
                                            sc.nextLine() ;
                                            String newValue  = sc.nextLine() ;
                                            animallist.put(animalname, newValue);
                                            System.out.println("Animal "+ animalname+" description Sucessfully Updated ") ;
                                        }
                                        else
                                        {
                                            System.out.println("Animal '" + animalname + "' not found .");
                                        }
                                    }
                                    else if(choice1==3)
                                    {
                                        System.out.print("enter the name your wish to remove  ") ;
                                        String animalname  = sc.next() ;
                                        if (animallist.containsKey(animalname))
                                        {
                                            animallist.remove(animalname) ;
                                            System.out.println("Animal "+animalname+ " Removed sucessfully ") ;
                                        }
                                        else
                                        {
                                            System.out.println("Animal '" + animalname + "' not found .");
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Invalid Choice ") ;
                                    }
                                }
                                catch (InputMismatchException e)
                                {
                                    System.out.println("This not a valid choice ") ;
                                }

                            }
                        }
                        else if(intchoice==5)
                        {
                            System.out.println(" Set Special Deals ") ;
                            if(adventure.size()==0)
                            {
                                System.out.println("Add attraction first , and schdeule the show for special deals ") ;
                            }
                            else
                            {
                                while(true)
                                {
                                    System.out.println("1.Add special  deals ") ;
                                    System.out.println("2.Remove ") ;
                                    System.out.println("3.Exit ") ;
                                    int innerchoice  = sc.nextInt() ;
                                    if(innerchoice ==3){
                                        break  ;
                                    }
                                    else if(innerchoice==2)
                                    {
                                        System.out.println("enter the deal code wish to remove ") ;
                                        String nametoremove  = sc.next();
                                        boolean flagerm = false ;
                                        if(specialdeal.size()==0)
                                        {
                                            System.out.println("No deal avaible ") ;
                                        }
                                        else
                                        {
                                            Iterator<SpecialDeals> iterator = specialdeal.iterator();
                                            while (iterator.hasNext()) {
                                                SpecialDeals deal = iterator.next();
                                                if (deal.getCode().equals(nametoremove)) {
                                                    iterator.remove();
                                                    flagerm = true ;
                                                }
                                                else
                                                {

                                                }
                                            }
                                            if(flagerm==true)
                                            {
                                                System.out.println("Discount is removed ") ;
                                            }
                                            else if (flagerm==false)
                                            {

                                                System.out.println("Discount not found ");
                                            }
                                        }

                                    }
                                    else if(innerchoice==1)
                                    {
                                        int size = specialdeal.size() ;
                                       // System.out.println(size) ;
                                        System.out.println("enter the code for the special discount ")  ;
                                        String addcoder  = sc.next() ;
                                        System.out.println("enter the number of attraction  to avail this offer ") ;
                                        int needtickets  = sc.nextInt() ;
                                        System.out.println("enter the amount that is off ");
                                        int offneeded  = sc.nextInt() ;
                                        SpecialDeals ms  = new SpecialDeals() ;
                                        ms.setCode(addcoder);
                                        ms.setTickets(needtickets) ;
                                        ms.setDiscountedoff(offneeded) ;
                                        if(specialdeal.contains(ms))
                                        {
                                            System.out.println("The deal exists in the discount list .");
                                        }
                                        else
                                        {

                                            specialdeal.add(ms) ;

                                        }

                                    }
                                }

                            }
                        }
                        else if(intchoice ==3)// schdeular the event
                        {
                            if(adventure.size()==0)
                            {
                                System.out.println("Please add items ") ;
                            }
                            else
                            {
                                for (Map.Entry<String, String> entry : adventure.entrySet()) {
                                    String key = entry.getKey();
                                    String value = entry.getValue();
                                    Integer ide = uniqueid.get(key);
                                    System.out.println(" Set the value for Activity: " + key);
                                    System.out.println("enter the opening time ");
                                    sc.nextLine() ;
                                    String open  = sc.nextLine() ;
                                    System.out.println("enter the closing  time ");

                                    String cls  = sc.nextLine() ;
                                    System.out.println("enter the price of ticket ");
                                    // sc.nextLine() ;
                                    double price  = sc.nextDouble() ;
                                    int count = 0 ;
                                    for (Person visitor : visitors) { // made a arraylist for the person ,who visits and the tickent name
                                        if (visitor.ticketype == key) {
                                            count++;
                                        }
                                    }

                                    Adventure  activity  = new Adventure(ide, key , value , open  , cls  , price ) ;
                                    storeZooAdventures.add(activity);
                                    // printerad(activity) ;

                                    //Adventure(int id, String name,  String description, String openingTime, String closingTime, double ticketPrice)
                                }
                            }
                        }
                        else if(intchoice ==4)
                        {
                            while(true)
                            {
                                System.out.println("\n") ;
                                System.out.println("Set discounts ") ;
                                System.out.println("\n") ;
                                System.out.println("1. Add discount ") ;
                                System.out.println("2. Modify Discount ") ;
                                System.out.println("3. Remove Discount ") ;
                                System.out.println("4. Exit ") ;
                                try
                                {
                                    System.out.println("\n") ;
                                    System.out.println("enter the choice ") ;
                                    int extrachoice  = sc.nextInt() ;
                                    if(extrachoice ==4)
                                    {
                                        break ;
                                    }
                                    else if(extrachoice==1)
                                    {
                                        System.out.println("Add discount name : ") ;
                                        String disname  = sc.next() ;
                                        System.out.println("Add a breif decription about the discount ");
                                        sc.nextLine() ;
                                        String desname  = sc.nextLine() ;
                                        System.out.println("enter the lower age limit ") ;
                                        int lowerage  = sc.nextInt() ;
                                        System.out.println("enter the upper age limit ") ;
                                        int upperage  = sc.nextInt() ;
                                        System.out.print("enter the discounted off ") ;
                                        int off = sc.nextInt() ;
                                        if(lowerage<0 || upperage<0  || lowerage > upperage )
                                        {
                                            System.out.println("Age is Invalid form ") ;
                                        }
                                        else
                                        {
                                            System.out.println(" Discount added ") ;
                                            Discount d  = new Discount() ;
                                            d.setName(disname);
                                            d.setDescription(desname);
                                            d.setAmount(off);
                                            d.setAgelower(lowerage);
                                            d.setAgeupper(upperage) ;
                                            discounts.add(d);
                                        }

                                    }
                                    else if (extrachoice == 2)
                                    {
                                        if(discounts.size()==0)
                                        {
                                            System.out.println("No discount Avaible . Please add discount to make modifications") ;
                                        }
                                        else
                                        {
                                            System.out.println("Avaible discount codes ");
                                            for(Discount dsm : discounts)
                                            {
                                                System.out.println("Discount code "+dsm.getName()) ;
                                            }
                                            System.out.println("enter the coupon code ") ;
                                            String   modifyname = sc.next();
                                            for (Discount disaplha : discounts)
                                            {
                                                if (disaplha.getName().equals(modifyname))
                                                {
                                                    while(true)
                                                    {
                                                        // modifiend the discounted code
                                                        System.out.println("1.Discount code ") ;
                                                        System.out.println("2.Lower Age Bound ") ;
                                                        System.out.println("3.Upper Age Bound") ;
                                                        System.out.println("4.Amount ") ;
                                                        System.out.println("5.Exit ") ;
                                                        System.out.println("Enter which attribute you like to modify ") ;
                                                        int modichoice  = sc.nextInt() ;

                                                        if(modichoice==1)
                                                        {
                                                            boolean found = false ;
                                                            for (Discount ds : discounts)
                                                            {
                                                                if (ds.getName().equals(modifyname)) {
                                                                    System.out.println("Enter the new discount code   : ");
                                                                    String  newname = sc.next();
                                                                    ds.setName(newname);

                                                                    found = true;
                                                                    break;
                                                                }
                                                            }

                                                            if(found==true)
                                                            {
                                                                System.out.println("Updated  ");
                                                                break ;
                                                            }
                                                            else
                                                            {
                                                                System.out.println("Discount code is Invalid ");
                                                                break ;
                                                            }


                                                        }
                                                        else if(modichoice==2)
                                                        {

                                                            boolean found = false ;
                                                            for (Discount ds : discounts)
                                                            {
                                                                if (ds.getName().equals(modifyname)) {
                                                                    System.out.println("Enter the new lower age bound   : ");
                                                                    int  newname = sc.nextInt();
                                                                    ds.setAgelower(newname);

                                                                    found = true;
                                                                    break;
                                                                }
                                                            }

                                                            if(found==true)
                                                            {
                                                                System.out.println("Updated ");
                                                                break ;
                                                            }
                                                            else
                                                            {
                                                                System.out.println("Discount code is Invalid ");
                                                                break ;
                                                            }





                                                        }
                                                        else  if(modichoice ==5)
                                                        {
                                                            break ;
                                                        }
                                                        else if(modichoice==3)
                                                        {

                                                            boolean found = false ;
                                                            for (Discount ds : discounts)
                                                            {
                                                                if (ds.getName().equals(modifyname)) {
                                                                    System.out.println("Enter the new upper age bound : ");
                                                                    int  newname = sc.nextInt();
                                                                    ds.setAgeupper(newname);
                                                                    System.out.println("Updated ");

                                                                    found = true;
                                                                    break;
                                                                }
                                                            }

                                                            if(found==true)
                                                            {
                                                                System.out.println("Updated ");
                                                                break ;
                                                            }
                                                            else
                                                            {
                                                                System.out.println("Discount code is Invalid ");
                                                            }


                                                        }
                                                        else if(modichoice==4)
                                                        {

                                                            boolean found = false ;
                                                            for (Discount ds : discounts)
                                                            {
                                                                if (ds.getName().equals(modifyname)) {
                                                                    System.out.println("Enter the new amount    : ");
                                                                    int   newname = sc.nextInt();
                                                                    ds.setAmount(newname);


                                                                    found = true;
                                                                    break;
                                                                }
                                                            }

                                                            if(found==true)
                                                            {
                                                                System.out.println("Updated ");
                                                                break ;
                                                            }
                                                            else
                                                            {
                                                                System.out.println("Discount code is Invalid ");
                                                            }

                                                        }
                                                        else
                                                        {
                                                            System.out.println("Not a valid choice ") ;
                                                        }
                                                    }
                                                }
                                                else
                                                {
                                                    System.out.println("Discount not found ");
                                                }
                                            }

                                        }

                                    }
                                    else if(extrachoice==3)
                                    {
                                        System.out.println("Enter the code you wish to terminate ") ;
                                        String remover = sc.next() ;
                                        boolean flagerx= false ;
                                        Discount diskremove  = null ;
                                        for(Discount ds :  discounts )
                                        {
                                            if(ds.getName().equals(remover))
                                            {
                                                diskremove = ds ;
                                            }
                                        }
                                        discounts.remove(diskremove) ;
                                        if(flagerx==true)
                                        {
                                            System.out.println("Discount removed sucessfully ") ;
                                        }
                                        else if (flagerx==false)
                                        {

                                            System.out.println("Discount not found ");
                                        }


                                    }
                                    else
                                    {
                                        System.out.println("Invalid command ") ;
                                    }


                                }
                                catch(InputMismatchException e )
                                {
                                    System.out.println("This is not a valid choice ") ;
                                }

                            }
                        }
                        else if(intchoice ==6)// for the stats viever
                        {
                            System.out.println("Visitor Statistics:") ;
                            System.out.println("- Total Visitor(This is the number of people who visited the attractions ) "+counterxd);
                            int sumt = 0;
                            for(Person ops : registered)
                            {

                                sumt  = sumt+ ops.getNumberoftickets() ;

                            }

                            int counterx  = 0 ;
                            for(Person s : visitors)
                            {
                                if(s.getStatus().equals("Premium"))
                                {
                                    counterx = counterx+1  ;

                                }
                            }

                            if(counterx==0)
                            {
                                System.out.println("-No of person visited (Ticket sold )"+sumt) ;
                            }
                            else if(sumt==0)
                            {
                                System.out.println("-No of person visited (Ticket sold ) "+ counterx ) ;
                            }
                            else {
                                System.out.println("-No of person visited  (Ticket sold )" + sumt + counterx);
                            }
                            int sums  = 0;
                            if(registered.size()==0)
                            {
                                System.out.println("No member visited ") ;

                            }
                            else
                            {
                                for (Person s  : registered)
                                {
                                    sums  = sums+ s.getTotalsum() ;
                                  //  System.out.println(s.getTotalsum());
                                }
                               System.out.println("- Total Revenue "+sums) ;
                            }

                            int maxTicketsSold = 0; // Initialize with the smallest possible value
                            Adventure adventureWithMaxTickets = null;
                            for(Adventure ask : storeZooAdventures)
                            {

                                int ticketsSold = ask.getVisitorCount();

                                if (ticketsSold > maxTicketsSold)
                                {
                                    maxTicketsSold = ticketsSold;
                                    adventureWithMaxTickets = ask ;

                                }
                            }

                            if(maxTicketsSold>0)
                            {
                                System.out.println("Populated area "+adventureWithMaxTickets.getName()) ;
                            }




                        }
                        else if(intchoice ==7) // view feedback form done
                        {
                            if (feedback.isEmpty())
                            {
                                System.out.println("The feedback form is empty.");
                            } else
                            {
                                for (Map.Entry<String, String> entry : feedback.entrySet()) {
                                    String emailm = entry.getKey();
                                    String Val = entry.getValue();
                                    System.out.println("Email: " + emailm);
                                    System.out.println("Feedback: " + Val);
                                    System.out.println();
                                }
                            }

                        }
                        else if (intchoice==8) // exit done
                        {
                            break ;
                        }
                        else
                        {
                            System.out.println("Invalid choice ") ;
                        }

                    } // while closer
                } // admin menu closer if copndition
                else
                {
                    System.out.println("Invalid credentials") ;
                }
            } //choice if closer
            else if(choice ==2) // enter the zoo as a visitor
            {
                while(true)
                {
                    System.out.println("1.Login") ;
                    System.out.println("2.Register ") ;
                    System.out.println("3.Exit ") ;
                    System.out.println("enter choice ") ;
                    int selectnum  = sc.nextInt() ;
                    if(selectnum==2)
                    {
                        System.out.println("Regsiter Portal ") ;
                        System.out.println("Enter name :  ") ;
                        sc.nextLine() ;
                        String namex = sc.nextLine() ;
                        System.out.println("Enter age  :  ") ;
                        int  agex = sc.nextInt() ;
                        System.out.println("Enter phone number : +91 ") ;
                        long phonex = sc.nextLong() ;
                        System.out.println("Enter balance(in Rs)  :  ") ;
                        int balancex  = sc.nextInt() ;
                        System.out.println("Enter email :  ") ;
                        String emailx = sc.next() ;
                        System.out.println("Enter password  :  ") ;
                        String passcodex = sc.next() ;
                        Person s  = new Person(namex , agex ,  phonex , balancex ,emailx ,passcodex) ;
                        registered.add(s) ;
                        // infoprinter(s) ;
                    }
                    else if(selectnum==1)
                    {
                        System.out.println("Login portal") ;
                        System.out.println("enter the email ") ;
                        String  mailx = sc.next() ;
                        System.out.println("enter password ") ;
                        String passcode  = sc.next() ;
                        boolean flag  = false ;


                        for (Person person : registered)
                        {
                            if (person.getEmail().equals(mailx) && person.getPasscode().equals(passcode))
                            {
                                flag = true ;
                                namecopy =  person.name ;
                                agecopy  = person.age ;
                                phonecopy  = person.phone ;
                                balancecopy  = person.balance ;
                                emailcopy  = person.email  ;
                                passcodecopy   = person.passcode ;
                                ticketype  = person.getTicketType() ;
                                statuscopy  = person.getStatus() ;
                                numberoftickets = person.getNumberoftickets() ;
                                cashpayment.put(person.getName() , 0) ; // saved the payment in registered
                            }
                        }
                        if(flag == true)
                        {
                            System.out.println("Sucessfully logged in ") ;
                            while(true)
                            {
                                System.out.println("Visitor Menu ") ;
                                System.out.println("1. Explore Zoo") ;
                                System.out.println("2.Buy Membership") ;
                                System.out.println("3. Buy Tickets ") ;
                                System.out.println("4. View Discounts") ;
                                System.out.println("5. View Special Deals") ;
                                System.out.println("6.  Visit Animals") ;
                                System.out.println("7. Visit Attractions") ;
                                System.out.println("8.  Leave Feedback") ;
                                System.out.println("9.  Log Out") ;
                                System.out.println("enter the choice ") ;
                                int ichoice  = sc.nextInt() ;
                                if(ichoice==9)
                                {
                                    break ;
                                }
                                else if(ichoice ==8)
                                {
                                    System.out.println("enter the feedback here ") ;
                                    sc.nextLine() ;
                                    String givefeed  = sc.nextLine() ;
                                    feedback.put(mailx,givefeed) ;
                                    System.out.println("Thanks for your Valuable feedback") ;

                                }
                                else if(ichoice ==5 )
                                {
                                    System.out.println(" Special deals ") ;
                                    if(specialdeal.size()==0)
                                    {
                                        System.out.println("No deal avaible")  ;
                                    }
                                    else{
                                        for(SpecialDeals s  : specialdeal)
                                        {

                                            System.out.println("Deal Code "+s.getCode()+" discounted off "+s.getDiscountedoff());
                                        }
                                    }
                                }
                                else if(ichoice==7) // for the attractions
                                {
                                    for(Person person : registered )
                                    {
                                        if(person.getEmail().equals(emailcopy) &&  person.getPasscode().equals(passcodecopy))
                                        {
                                                if(adventure.isEmpty())
                                                {
                                                    System.out.println("The adventure List  is empty.") ;

                                                }
                                                else
                                                {
                                                    while(true)
                                                    {
                                                        int count  = 1;
                                                        System.out.println("Avaible Advnetures ");
                                                        TreeMap<String , Integer> copy  = new TreeMap<>(uniqueid);
                                                        for (Map.Entry<String , Integer> entry : copy.entrySet()) {
                                                            System.out.println(entry.getValue()+ ". " + entry.getKey());
                                                            count ++ ;

                                                        }
                                                        System.out.println(count+". Exit ") ;
                                                        System.out.println("enter the choice ") ;
                                                        int choicex  = sc.nextInt() ;
                                                        if(choicex==count)
                                                        {
                                                            break ;
                                                        }
                                                        Adventure  foundKey = null ;
                                                        String nsm = null ;
                                                        for (Map.Entry<String, Integer> entry : copy.entrySet()) {
                                                            //System.out.println("flow goes 1 ");
                                                            if (entry.getValue() == choicex) {
                                                                nsm = entry.getKey();

                                                                for(Person ps : registered)
                                                                {
                                                                    int matplot= ps.getFromMyList(foundKey) ;
                                                                   // System.out.println(matplot);

                                                                    if(ps.getEmail().equals(emailcopy) && ps.getPasscode().equals(passcodecopy) )
                                                                    {

                                                                        if(ps.getNumberoftickets()==0 && ps.getStatus()!="Premium")
                                                                        {

                                                                            System.out.println("Need to buy tickets first ");
                                                                        }
                                                                        else
                                                                        {
                                                                            if(statuscopy=="Premium")
                                                                            {


                                                                                System.out.println("Hope you enjoyed the attraction") ;
                                                                                counterxd ++ ;
                                                                            }
                                                                            else if(statuscopy =="Basic"  )
                                                                            {

                                                                                System.out.println(" 1 Ticket used . Hope you enjoyed ") ;

                                                                                numberoftickets = numberoftickets -1 ;
                                                                                ps.setNumberoftickets(numberoftickets) ;
                                                                                counterxd ++ ;

                                                                            }
                                                                        }
                                                                    }
                                                                }

                                                            }
                                                        }

                                                    }

                                                }
                                        }
                                    }



                                }
                                else if(ichoice ==6)
                                {
                                    while(true)
                                    {
                                        System.out.println("Animals In zoo  " ) ;
                                        for (Map.Entry<String, String> entry : animallist.entrySet()) {
                                            String animalname = entry.getKey();
                                            System.out.println("Animal Name: " + animalname);
                                            System.out.println();
                                        }
                                        if(animallist.size()==0)
                                        {
                                            System.out.println("Zoo is empty ");
                                            break ;
                                        }

                                        System.out.println("enter which animal you want to visit ") ;
                                        String  choicesel = sc.next() ;
                                        System.out.println("1.visit and feed animal ");
                                        System.out.println("2.Read about animal ");
                                        System.out.println("3.Exit ");
                                        System.out.println();
                                        System.out.println("enter choice  ") ;
                                        int numpy   = sc.nextInt() ;
                                        if(numpy==1)
                                        {
                                            for(Person psk : registered)
                                            {
                                                if(psk.getEmail().equals(emailcopy) && psk.getPasscode().equals(passcodecopy))
                                                {
                                                    if(psk.getNumberoftickets()==0)
                                                    {
                                                        System.out.println("Please Buy tickets ");
                                                    }
                                                    else {
                                                        if (animalvoice.containsKey(choicesel)) {
                                                            String animalvoi = animalvoice.get(choicesel);
                                                            System.out.println("Voice : " + animalvoi);
                                                        } else {
                                                            System.out.println("Animal not found in the ZOO ");
                                                        }
                                                    }
                                                }
                                            }

                                        }
                                        else if (numpy==2)
                                        {
                                            if (animalhistory.containsKey(choicesel)) {
                                                String animalhist  = animalhistory.get(choicesel);
                                                System.out.println("History ") ;
                                                System.out.println() ;
                                                System.out.println("" + animalhist);
                                                System.out.println() ;
                                            }
                                            else
                                            {
                                                System.out.println("No history found  ");
                                            }
                                        }
                                        else if(numpy ==3 )
                                        {
                                            break  ;
                                        }
                                        else
                                        {
                                            System.out.println("Invalid choice ") ;
                                        }
                                    }
                                } // else if choice 6 closed
                                else if(ichoice==1)
                                {
                                    while(true)
                                    {
                                        System.out.println("Explore the Zoo") ;
                                        System.out.println("1.View Attractions ") ;
                                        System.out.println("2.View Animals ") ;
                                        System.out.println("3.Exit") ;
                                        System.out.println("Enter your choice ") ;
                                        int schoice  = sc.nextInt() ;
                                        if(schoice ==3 )
                                        {
                                            break  ;
                                        }
                                        else if(schoice ==2)
                                        {
                                            System.out.println("Animls in Zoo Currently ") ;
                                            if(animallist.size()==0)
                                            {
                                                System.out.println("No Animals  avaible ") ;

                                            }
                                            else
                                            {
                                                int x  = 1  ;
                                                for (Map.Entry<String, String> entry : animallist.entrySet()) {
                                                    System.out.println(x+". " + entry.getKey()+ " Type  :"+entry.getValue());
                                                    x  = x+1 ;

                                                }
                                            }
                                        }
                                        else if(schoice ==1)
                                        {
                                            System.out.println("Avaible Attractions ") ;
                                            if(adventure.size() == 0)
                                            {
                                                System.out.println("There is no attraction avaible") ;

                                            }
                                            else
                                            {
                                                int x  = 1  ;
                                                for (Map.Entry<String, String> entry : adventure.entrySet()) {
                                                    System.out.println(x+". " + entry.getKey()+ " decription  :"+entry.getValue());

                                                }
                                            }

                                        }
                                        else
                                        {
                                            System.out.println("Invalid choice ") ;
                                        }
                                    } // while is gettting close
                                } // else if choice 1 closed
                                else if(ichoice==2) // this is for the buy membership
                                {
                                    System.out.println("Buy MemberShip ") ;
                                    System.out.println("1. Basic Membership (₹20)") ;
                                    System.out.println("2. Premium Membership (₹50)") ;
                                    System.out.println("enter the choice ") ;
                                    int memchoice  = sc.nextInt() ;
                                    for(Person psmk : registered)
                                    {
                                        if(psmk.getEmail().equals(mailx) && psmk.getPasscode().equals(passcode))
                                        {
                                            if(psmk.isApplied()==true)
                                            {
                                                System.out.println("You have already purchased membership") ;
                                            }
                                            else
                                            {

                                                if(memchoice ==1)
                                                {
                                                    System.out.println("Basic MemberShip Applied ") ;
                                                    statuscopy  = "Basic" ;

                                                    for (Person person : registered)
                                                    {
                                                        if (person.getEmail().equals(mailx) && person.getPasscode().equals(passcode))
                                                        {
                                                            if(discounts.size()==0)
                                                            {
                                                                int totalcopy = cashpayment.get(person.getName()) ;
                                                                totalcopy = totalcopy+20 ;
                                                                person.setStatus(statuscopy);
                                                                person.setTotalsum(totalcopy);
                                                                visitors.add(person);
                                                                cashpayment.put(person.getName() ,totalcopy) ;
                                                                person.setDiscount(false)  ;
                                                                psmk.setApplied(true) ;

                                                            }
                                                            else
                                                            {
                                                                for(Discount dsm : discounts)
                                                                {


                                                                    if((person.getAge() > dsm.getAgeupper() || person.getAge() < dsm.getAgelower()) && discounts.size()!=0 && person.getStatus()!="None")
                                                                    {
                                                                        int totalcopy = cashpayment.get(person.getName()) ;
                                                                        totalcopy = totalcopy+20 ;
                                                                        person.setStatus(statuscopy);
                                                                        visitors.add(person);
                                                                        cashpayment.put(person.getName() ,totalcopy) ;
                                                                        person.setDiscount(false)  ;
                                                                        psmk.setApplied(true) ;
                                                                        person.setTotalsum(totalcopy);


                                                                    }
                                                                    else if(person.getAge()<= dsm.getAgeupper() && person.getAge()>=dsm.getAgelower() && discounts.size()!=0)
                                                                    {

                                                                        if(person.isDiscount()==false)
                                                                        {
                                                                            System.out.println("You Comes under the Discounted Category . Do you Wish to Avail discount ?(Yes or No)") ;
                                                                            String choicef = sc.next() ;
                                                                            if(choicef.contains("Yes"))
                                                                            {
                                                                                int maxAmount = Integer.MIN_VALUE;
                                                                                String maxName = null;

                                                                                for (Discount discount : discounts) {
                                                                                    int amount = discount.getAmount();
                                                                                    if (amount > maxAmount) {
                                                                                        maxAmount = amount;
                                                                                        maxName = discount.getName();
                                                                                    }
                                                                                }
                                                                                System.out.println(" discount activated "+maxName) ;
                                                                                int totalcopy = cashpayment.get(person.getName()) ;
                                                                                totalcopy = totalcopy+20 ;
                                                                                int discounted  = totalcopy - ((int)(totalcopy)*(maxAmount))/100 ;
                                                                                person.setStatus(statuscopy);
                                                                                visitors.add(person);
                                                                                cashpayment.put(person.getName() ,discounted) ;
                                                                                person.setDiscount(true)  ;
                                                                                psmk.setApplied(true) ;
                                                                                person.setTotalsum(totalcopy);


                                                                            }
                                                                            else if(choicef.contains("No"))
                                                                            {
                                                                                int totalcopy = cashpayment.get(person.getName()) ;
                                                                                totalcopy = totalcopy+20 ;
                                                                                person.setStatus(statuscopy);
                                                                                visitors.add(person);
                                                                                cashpayment.put(person.getName() ,totalcopy) ;
                                                                                person.setDiscount(false)  ;
                                                                                psmk.setApplied(true) ;
                                                                                person.setTotalsum(totalcopy);
                                                                                break ;
                                                                            }

                                                                        }


                                                                    }


                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if(memchoice ==2)
                                                {
                                                    System.out.println("Premium MemberShip Applied ") ;
                                                    statuscopy  = "Premium" ;

                                                    for (Person person : registered)
                                                    {
                                                        if (person.getEmail().equals(mailx) && person.getPasscode().equals(passcode))
                                                        {

                                                            if(discounts.size()==0)
                                                            {
                                                                int totalcopy = cashpayment.get(person.getName()) ;
                                                                totalcopy = totalcopy+50 ;
                                                                person.setStatus(statuscopy);
                                                                visitors.add(person);
                                                                cashpayment.put(person.getName() ,totalcopy) ;
                                                                person.setDiscount(false)  ;
                                                                psmk.setApplied(true) ;
                                                                person.setTotalsum(totalcopy);
                                                            }
                                                            else
                                                            {
                                                                for(Discount dsm : discounts)
                                                                {

                                                                    if((person.getAge() > dsm.getAgeupper() || person.getAge() < dsm.getAgelower() ) && discounts.size()!=0)
                                                                    {
                                                                        int totalcopy = cashpayment.get(person.getName()) ;
                                                                        totalcopy = totalcopy+50 ;
                                                                        person.setStatus(statuscopy);
                                                                        visitors.add(person);
                                                                        cashpayment.put(person.getName() ,totalcopy) ;
                                                                        person.setDiscount(false)  ;
                                                                        psmk.setApplied(true) ;
                                                                        person.setTotalsum(totalcopy);


                                                                    }
                                                                    else if(person.getAge()<= dsm.getAgeupper() && person.getAge()>=dsm.getAgelower() && discounts.size()!=0)
                                                                    {

                                                                        if(person.isDiscount()==false)
                                                                        {
                                                                            System.out.println("You Comes under the Discounted Category . Do you Wish to Avail discount ?") ;
                                                                            String choicef = sc.next() ;
                                                                            if(choicef.contains("Yes"))
                                                                            {
                                                                                int maxAmount = Integer.MIN_VALUE;
                                                                                String maxName = null;

                                                                                for (Discount discount : discounts) {
                                                                                    int amount = discount.getAmount();
                                                                                    if (amount > maxAmount) {
                                                                                        maxAmount = amount;
                                                                                        maxName = discount.getName();
                                                                                    }
                                                                                }
                                                                                System.out.println(" discount activated "+maxName) ;
                                                                                int totalcopy = cashpayment.get(person.getName()) ;
                                                                                totalcopy = totalcopy+50 ;
                                                                                int discounted  = totalcopy - ((int)(totalcopy)*(maxAmount))/100 ;
                                                                                person.setStatus(statuscopy);
                                                                                visitors.add(person);
                                                                                cashpayment.put(person.getName() ,discounted) ;
                                                                                person.setDiscount(true)  ;
                                                                                psmk.setApplied(true) ;
                                                                                person.setTotalsum(totalcopy);



                                                                            }
                                                                            else if(choicef.contains("No"))
                                                                            {
                                                                                int totalcopy = cashpayment.get(person.getName()) ;
                                                                                totalcopy = totalcopy+50 ;
                                                                                person.setStatus(statuscopy);
                                                                                visitors.add(person);
                                                                                cashpayment.put(person.getName() ,totalcopy) ;
                                                                                person.setDiscount(false)  ;
                                                                                psmk.setApplied(true) ;
                                                                            }

                                                                        }


                                                                    }



                                                                }
                                                            }

                                                        }
                                                    }
                                                }
                                                else if(memchoice>2)
                                                {
                                                    System.out.println("Invalid membership choice ") ;
                                                }
                                                // buy premium done

                                            }

                                        }
                                    }
                                    for(Person sm : registered)
                                    {
                                        if(sm.getEmail().equals(emailcopy) && sm.getPasscode().equals(passcodecopy))
                                        {
                                            for (Map.Entry<String, Integer> entry : cashpayment.entrySet())
                                            {
                                                String key = entry.getKey() ;
                                                Integer value  = entry.getValue() ;




                                                    System.out.println(key+" has to pay(Rounded off) : "+value ) ;



                                            }
                                        }
                                    }
                                    for(Person sm : registered)
                                    {
                                        if(sm.getEmail().equals(emailcopy) && sm.getPasscode().equals(passcodecopy))
                                        {
                                            for (Map.Entry<String, Integer> entry : cashpayment.entrySet())
                                            {
                                                String key = entry.getKey() ;
                                                Integer value  = entry.getValue() ;
                                                if(sm.getBalance()< value )
                                                {


                                                    System.out.println("Warning ! Less money Balance than the due amount ") ;



                                                }
                                            }
                                        }
                                    }

                                }
                                else if(ichoice ==4)//discount viewer
                                {
                                    System.out.println("Avaible discounts ") ;
                                    int x  = 1;
                                    if(discounts.size()==0)
                                    {
                                        System.out.println("No Discount Avaible Rightnow ") ;

                                    }
                                    for(Discount ds : discounts)
                                    {
                                        System.out.println(x+". Code "+ds.getName()) ;
                                        System.out.println("Description "+ds.getDescription()) ;
                                        System.out.println("Discounted Amount(In percentage ) "+ds.getAmount()) ;
                                        System.out.println("\n") ;
                                        x = x+1 ;

                                    }

                                }

                                else if(ichoice ==3) // buy tickets main part

                                {

                                    if(statuscopy==null)
                                    {
                                        System.out.println("You do not have any membership . Please buy a membership") ;

                                    }
                                    else
                                    {
                                        if(storeZooAdventures.size()==0)
                                        {
                                            System.out.println("No adventure scheduled right Now ") ;
                                            break  ;

                                        }
                                        else
                                        {

                                            if(statuscopy.equals("Premium"))
                                            {
                                                System.out.println("Premium Membership customer doesnt need to buy tickets ") ;
                                            }
                                            else if(statuscopy.equals("Basic")) {//else
                                                System.out.println("Buy Tickets ");
                                                System.out.println("Avaible adventures ");
                                                for (Map.Entry<String, Integer> entry : uniqueid.entrySet()) {
                                                    String key = entry.getKey();
                                                    Integer value = entry.getValue();
                                                    System.out.println(value + ". " + key);
                                                }
                                                System.out.println("enter choice  ");
                                                int buyerchoice = sc.nextInt(); // id nmumebr
                                                System.out.println("how many tickets you wish to buy");
                                                int numbertickets = sc.nextInt(); // numerb of ticket fo that ides

                                                // testing
                                                for (Person psz : registered) {
                                                    if (psz.getName().equals(namecopy)) {
                                                        for (Adventure as : storeZooAdventures) {
                                                            if (as.getId()==buyerchoice)
                                                            {
                                                                psz.addMytickets(as, numbertickets);
                                                                int numpys  = as.getVisitorCount() ;
                                                                numpys = numpys + numbertickets;
                                                                as.setVisitorCount(numpys);
                                                            }

                                                            //    System.out.println("Tickets Purchased sucessfully  ") ;
                                                            break;
                                                        }
                                                    }
                                                }


                                                for (Adventure namess : storeZooAdventures) {
                                                    if (namess.getId() == buyerchoice) {
                                                        int tickettotal = namess.getVisitorCount();
                                                        tickettotal = tickettotal + numbertickets;
                                                        namess.setVisitorCount(tickettotal);
                                                    }
                                                }

                                                // testing over
                                                System.out.println("Enter the discount coupon (else type None )");
                                                String discountname = sc.next();
                                                for (Person ps : registered) {
                                                    if (ps.getEmail().equals(emailcopy) & ps.getPasscode().equals(passcodecopy)) {
                                                        for (SpecialDeals sp : specialdeal) {
                                                            if (ps.hashsize(ps.getMytickets()) == sp.getTickets()) {
                                                                ps.setFlag(ps.getFlag()); // for the special discounts

                                                            }
                                                        }
                                                    }
                                                }
                                                if (discountname.equals("None")) {

                                                    for (Map.Entry<String, Integer> entry : uniqueid.entrySet()) {
                                                        String key = entry.getKey();

                                                        if (entry.getValue() == buyerchoice) {
                                                            for (Person person : registered) {
                                                                if (person.getEmail().equals(mailx) && person.getPasscode().equals(passcode)) {
                                                                    for (Adventure a : storeZooAdventures) {

                                                                        if (a.getName().equals(key)) {

                                                                            int totalcopy = cashpayment.get(person.getName());
                                                                            totalcopy = totalcopy + (int) a.getTicketPrice() * (numbertickets);

                                                                                person.setNumberoftickets(numbertickets);
                                                                            cashpayment.put(person.getName(), totalcopy);
                                                                            person.setTotalsum(totalcopy);
                                                                                System.out.println(person.getName()+" has to pay "+totalcopy) ;
                                                                        }
                                                                    }


                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                else if(discountname!="None") {
                                                    boolean discountFound = false;
                                                    for (Discount discount : discounts) {
                                                        for (Adventure smd : storeZooAdventures) {
                                                        if (discount.getName().equals(discountname) && discountname != "None") {
                                                            discountFound = true;
                                                            System.out.println("Discount found.");
                                                            for (Person person : registered) {
                                                           //     System.out.println("flow goesn here ") ;
                                                                if (agecopy <= discount.getAgeupper() && agecopy >= discount.getAgelower()) {
                                                                    System.out.println("Discount code Applied Sucessfully  ");
                                                                    if (person.getEmail().equals(mailx) && person.getPasscode().equals(passcode) && person.getFlag() == false) {
                                                                        //  System.out.println("flow in 1") ;
                                                                        int totalcopy = cashpayment.get(person.getName());
                                                                        totalcopy = totalcopy + (int) ((numbertickets) * (smd.getTicketPrice()));
                                                                        totalcopy = (int) (totalcopy - (totalcopy * (discount.getAmount())) / 100);
                                                                        person.setStatus(statuscopy);
                                                                        person.setTotalsum(totalcopy);
                                                                        person.setNumberoftickets(numbertickets);
                                                                        cashpayment.put(person.getName(), totalcopy * numbertickets);
                                                                        System.out.println(person.getName() + " has to pay " + totalcopy);

                                                                    }
                                                                }
                                                            }
                                                        }
                                                        }

                                                    }

                                                    if (discountFound==false) {
                                                        System.out.println("No discount found.");
                                                    }
                                                    else {

                                                        for (Discount ds : discounts) {

                                                            if (ds.getName().equals(discountname)) {
                                                                for (Adventure smd : storeZooAdventures) {
                                                                    if (buyerchoice == smd.getId()) {
                                                                        if (agecopy <= ds.getAgeupper() && agecopy >= ds.getAgelower()) {

                                                                            for (Person person : registered) {

                                                                                 if (person.getEmail().equals(mailx) && person.getPasscode().equals(passcode) && person.getFlag() == true) {

                                                                                    System.out.println("Special offer Discount Applied enter the special code  ");
                                                                                    String enterchoice = sc.next();
                                                                                    for (SpecialDeals scm : specialdeal) {
                                                                                        if (enterchoice.equals(scm.getCode())) {
                                                                                            int totalcopy = cashpayment.get(person.getName());
                                                                                       //     System.out.println(totalcopy) ;
                                                                                            totalcopy = totalcopy+(int)((numbertickets)*(smd.getTicketPrice())) ;
                                                                                           // System.out.println(totalcopy) ;
                                                                                            totalcopy = (int)(totalcopy - (totalcopy)*(scm.getDiscountedoff()+ds.getAmount())/100) ;
                                                                                          //  System.out.println(totalcopy) ;
                                                                                            person.setTotalsum(totalcopy);
                                                                                            person.setNumberoftickets(numbertickets);
                                                                                            person.setStatus(statuscopy);
                                                                                            cashpayment.put(person.getName(), totalcopy);
                                                                                            System.out.println(person.getName()+" has to pay "+totalcopy) ;
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            System.out.println("discount not found ");
                                                                                        }
                                                                                    }

                                                                                }

                                                                            }

                                                                        } else if (agecopy > ds.getAgeupper()) {
                                                                            System.out.println("Discount applicable for only less " + ds.getAgeupper() + "years old ");
                                                                        }


                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }


                                                }
                                            }//close else
                                        }
                                    }
                                } //closed elif fopr choice 3
                                else
                                {
                                    System.out.println("Invalid choice .") ;
                                }
                            }

                        }
                        else
                        {
                            System.out.println("The memeber is not registered . Please check the credentials ") ;
                        }

                    }
                    else if(selectnum ==3)
                    {
                        break  ;
                    }
                    else
                    {
                        System.out.println("Invalid choice ") ;
                    }
                }

            } // visitor
            else if(choice==3)
            {

                if(specialdeal.size()==0)
                {
                    System.out.println("No speical discount Rightnow ") ;
                }
                else
                {
                    System.out.println("Speical dealas going on ") ;
                    for(SpecialDeals sz  : specialdeal)
                    {
                        System.out.println("Name  "+sz.getCode()) ;
                    }
                }
            }
            else // selection out of 3 option the admin  , visitor , special diescount
            {
                System.out.println("Invalid choice ") ;
            } // for selection of the three option s
        } // out while true closer
    } // public static voidmain closer
} // out main closer
