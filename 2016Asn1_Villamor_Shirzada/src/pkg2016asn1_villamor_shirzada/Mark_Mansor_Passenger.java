
package pkg2016asn1_villamor_shirzada;

//CRN 14319
//101033956 Villamor Mark Jerome
//101032087 Mansor Shirzada
import java.text.NumberFormat;
import java.util.Random;

public class Mark_Mansor_Passenger {
    
    public String source, destination, firstName, lastName;
    public double totalCost;
    Random rand = new Random();
    public int age, flightFare, year, month,day;
    public final double tax = 1.13;
    public final int min = 1000, max = 4000;
    
    public Mark_Mansor_Passenger()
    {        
    }
    
    public Mark_Mansor_Passenger(String src, String dest) {
        this.source = src;
        this.destination = dest;
    }
    
    public Mark_Mansor_Passenger(String src, String dest, String fname, String lname, int age) {
        this.source = src;
        this.destination = dest;
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
    }   
    
    public String getSource() {
        return source;
    }
    
    public void setSource(String src) {
        this.source = src;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String dest) {
        this.destination = dest;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String fname) {
        this.firstName = fname;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lname) {
        this.lastName = lname;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    
     public void setYear(int year) {
        this.year = year;
    }
      public void setMonth(int month) {
        this.month = month;
    }
       public void setDay(int day) {
        this.day = day;
    }
    
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    //get date just like those ones^
    //also set date. dont know what type they are so you put them
    
    public String flightNumber() {
        int n = rand.nextInt(10000) + 1;
        
        return "MM" + Integer.toString(n);
    }
    
    public int randFare() {        
        flightFare = rand.nextInt(max - min + 1) + min;
        return flightFare;
    }
    
    public double totalCost() {
        return tax * randFare();
    }
    
    
    public void PrintTicket() {
        NumberFormat cost = NumberFormat.getCurrencyInstance();
        System.out.println("\n**********Ticket information**********");
        System.out.println("Flight Number: " + flightNumber());
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Date: " +  year + ", "  +  month + ", "  +  day);
        System.out.println("Total Amount: " + cost.format(totalCost()));
        
    }
}
