
package pkg2016asn1_villamor_shirzada;



import java.util.Calendar;

//CRN 14319
//101033956 Villamor Mark Jerome
//101032087 Mansor Shirzada

public class Mark_Mansor_FrequentFlyer extends Mark_Mansor_Passenger {
    public int frequentFlyingNumber;
    public double milesCollected;
    
    public Mark_Mansor_FrequentFlyer() {
        
    }
    
    public Mark_Mansor_FrequentFlyer(String flightNum, String src, String dest, double fare, int freqNum, double miles) {
        super (src, dest);
        this.frequentFlyingNumber = freqNum;
        this.milesCollected = miles;
    }
    
    public Mark_Mansor_FrequentFlyer(String flightNum, String src, String dest, double fare, String fname, String lname, int age, int freqNum, double miles) {
        super (src, dest, fname, lname, age);
        this.frequentFlyingNumber = freqNum;
        this.milesCollected = miles;
    }
    
    public int getFrequentFlyingNumber() {
        return frequentFlyingNumber;
    }
    
    public void setFrequentFlyingNumber(int frequentNum) {
        this.frequentFlyingNumber = frequentNum;
    }
    
    public double getMilesCollected() {
        return milesCollected;
    }
    
    public void setMilesCollected(double miles) {
        this.milesCollected = miles;
    }
   
    
    
    public void PrintTicket() {
        super.PrintTicket();
        System.out.println("*Frequent Flyer Number: " + frequentFlyingNumber);
        System.out.println("*Total Miles: " + milesCollected);
    }
}
