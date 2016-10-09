
package pkg2016asn1_villamor_shirzada;
import java.util.Calendar;
import java.util.Scanner;

public class Mark_Mansor_Main {
    
    
    static Mark_Mansor_FrequentFlyer freqFlyer = new Mark_Mansor_FrequentFlyer();
    static Mark_Mansor_Passenger passenger = new Mark_Mansor_Passenger();
    public int year;
    public int month;
    public int date;
    public static Scanner input = new Scanner(System.in);

    //CRN 14319
    //101033956 Villamor Mark Jerome
    //101032087 Mansor Shirzada
    public static void main(String[] args) {
        check();
       Welcome();
       UserInfo();
       PassengerType();
       UserInfo();
    }
    

    
    public static void getDate () {
        
        boolean keepGoing = true;
        while(keepGoing)
        {
            Scanner user_date = new Scanner (System.in);
        
            int year_data;  
            System.out.println(" Please enter Year Date! " );
            year_data = user_date.nextInt();

            int month_data; 
            System.out.println(" Please enter Month Date! " );
            month_data = user_date.nextInt();

            int day_data; 
            System.out.println(" Please enter Day Date! " );
            day_data = user_date.nextInt();


            boolean isDateValid  = datechecker(month_data, day_data, year_data);

            if(isDateValid)
            {
                keepGoing = false;
            }
            else
            {
                keepGoing = true;

            }
        }
        
                
    }
    
      public static boolean datechecker (int enteredMonth, int enteredDay, int enteredYear) 
    {
       if (enteredYear < Calendar.YEAR )
          {
              System.out.println(" Please enter Valid year! " );
              return false; 
          }
       if (enteredDay < Calendar.DATE )
          {
              System.out.println(" Please enter Valid day! " );
              return false; 
          }
       if (enteredMonth < Calendar.MONTH )
          {
              System.out.println(" Please enter Valid month! " );
              return false; 
          }
          
          return  true; 
    }
    
    
    
    public static void Welcome() {
        System.out.println("##### ##### ##### ##### ##### ##### ##### ##### ##### ##### ##### ");
        System.out.println("                                                                  ");
        System.out.println("#     # #     #       #                                           "); 
        System.out.println("##   ## ##   ##      # #   # #####  #      # #    # ######  ####  ");
        System.out.println("# # # # # # # #     #   #  # #    # #      # ##   # #      #      ");
        System.out.println("#  #  # #  #  #    #     # # #    # #      # # #  # #####   ####  ");
        System.out.println("#     # #     #    ####### # #####  #      # #  # # #           # ");
        System.out.println("#     # #     #    #     # # #   #  #      # #   ## #      #    # ");
        System.out.println("#     # #     #    #     # # #    # ###### # #    # ######  ####  ");
        System.out.println("                                                                  ");
        System.out.println("##### ##### ##### ##### ##### ##### ##### ##### ##### ##### ##### ");
        System.out.println("\nWelcome!");
    }
    
    public static void PassengerType() {
        String userYesOrNo;
        boolean yesOrNo = true;
        while(yesOrNo) {
            System.out.print("Are you a frequent flyer? (y/n): ");
            userYesOrNo = input.next().toUpperCase();
            switch(userYesOrNo) {
                case "Y":                    
                    freqFlyer.PrintTicket();
                    yesOrNo = false;
                    System.out.println("say hi");
                    break;            
                case "N":
                    passenger.PrintTicket();
                    yesOrNo = false;
                    System.out.println("say no");
                    break;            
                default:
                    System.out.println("Not a valid answer. Try again.");
                    break;
            }
        }
    }
    
    public static void UserInfo() {
        String flightNum, src, dest, fname, lname;
        double fare;
        int age;
        
        System.out.print("Enter the flight number: ");
        flightNum = input.nextLine();
        passenger.setFlightNumber(flightNum);
        
        System.out.print("Enter the source: ");
        src = input.nextLine();
        passenger.setSource(src);
        
        System.out.print("Enter the destination: ");
        dest = input.nextLine();
        passenger.setDestination(dest);
        
        System.out.print("Enter your first name: ");
        fname = input.nextLine();
        passenger.setFirstName(fname);
        
        System.out.print("Enter your last name: ");
        lname = input.nextLine();
        passenger.setLastName(lname);
    }
    
    public static void check() {
        boolean checkAge = true;
        String sage;
        while(checkAge) {
            try {                        
                System.out.print("Enter your age: ");
                sage = input.nextLine();
                int age = Integer.parseInt(sage);
                if (age < 117 && age > 0) {
                passenger.setAge(age);
                checkAge = false;
                }
                else {
                    System.out.println("Please enter a valid age. Try again.");
                }
               
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a valid age. Try again.");
            }
        }
        
    }
}
