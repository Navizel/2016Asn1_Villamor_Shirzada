
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
       Welcome();
       PassengerType();   
    }
    

      public static boolean DateChecker (int year, int day, int month) 
    {
        
        
       if (year < Calendar.YEAR )
          {
              System.out.println(" Please enter Valid year! " );
              return false; 
          }
       if (day < Calendar.DATE )
          {
              System.out.println(" Please enter Valid day! " );
              return false; 
          }
       if (month < Calendar.MONTH )
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
            input.nextLine(); //avoid skip
            switch(userYesOrNo) {
                case "Y": 
                    passenger = freqFlyer;
                    UserInfo();
                    FrequentFlyerInfo();
                    freqFlyer.PrintTicket();
                    System.out.println("**************************************");
                    yesOrNo = false;
                    break;            
                case "N":
                    UserInfo();
                    passenger.PrintTicket();
                    System.out.println("**************************************");
                    yesOrNo = false;
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
        int day, month, year;
        
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
        
        boolean keepGoing = true;
        while(keepGoing)
        {
            System.out.print("Please enter Year Date! " );
            year = input.nextInt();


            System.out.print("Please enter Month Date! " );
            month = input.nextInt();


            System.out.print("Please enter Day Date! " );
            day = input.nextInt();

           if(DateChecker(year, day, month))
           {
               passenger.year = year;
               passenger.day = day;
               passenger.month = month;
               
               keepGoing = false;

           }
           else
           {
               keepGoing = true;
           } 
        }

            
    }
  
    public static void FrequentFlyerInfo() {
        String sfreqNum, smiles;
        boolean checkFreqNum = true, checkMiles = true;
        int freqNum;
        double miles;
        
        while (checkFreqNum) {
            try {            
                System.out.print("Enter your Frequent Flyer Number: ");
                sfreqNum = input.nextLine();
                freqNum = Integer.parseInt(sfreqNum);
                freqFlyer.setFrequentFlyingNumber(freqNum);
                checkFreqNum = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid Frequent Flyer Number. Try again.");
            }
        }
        
        while (checkMiles) {
            try {
                System.out.print("Enter your Total Miles: ");
                smiles = input.nextLine();
                miles = Double.parseDouble(smiles);
                freqFlyer.setMilesCollected(miles);
                checkMiles = false;
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid value of miles. Try again.");
            }
        }
    }
}
