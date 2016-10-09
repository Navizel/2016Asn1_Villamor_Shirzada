
package pkg2016asn1_villamor_shirzada;

//CRN 14319
//101033956 Villamor Mark Jerome
//101032087 Mansor Shirzada
import java.util.Random;

public class Mark_Mansor_Passenger {
    
    public String flightNumber, source, destination, firstName, lastName;
    public double totalCost;
    //double[] flightFare = {1258, 1399, 1300, 1450, 2500, 1437.59, 1764,  };
    public int age, flightFare;
    public final double tax = .13;
    public final int min = 1000, max = 4000;
    
    public Mark_Mansor_Passenger()
    {        
    }
    
    public Mark_Mansor_Passenger(String flightNum, String src, String dest) {
        this.flightNumber = flightNum;
        this.source = src;
        this.destination = dest;
    }
    
    public Mark_Mansor_Passenger(String flightNum, String src, String dest, String fname, String lname, int age) {
        this.flightNumber = flightNum;
        this.source = src;
        this.destination = dest;
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }
    
    public void setFlightNumber(String flightNum) {
        this.flightNumber = flightNum;
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
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    //get date just like those ones^
    //also set date. dont know what type they are so you put them
    
    public double randFare() {
        Random rand = new Random();
        flightFare = rand.nextInt((max - min) + 1) + min;
        return flightFare;
    }
    
    public double totalCost() {
        return flightFare * tax;
    }
    
    
    public void PrintTicket() {
        System.out.println("**********Ticket information**********");
        System.out.println("*Flight Number: " + flightNumber);
        System.out.println("*Source: " + source);
        System.out.println("*Destination: " + destination);
        System.out.println("*Name: " + firstName + " " + lastName);
        System.out.println("*Age: " + age);
        System.out.println("*Total Amount: " + totalCost());
    }
}
