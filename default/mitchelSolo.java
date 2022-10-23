import java.util.Scanner;  

public class mitchelSolo
{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String name;
        double noHours;
        double ratePerHr;
        double sss;
        double pi;
        double ph;
        double tax = 0.2; 
        
       System.out.println("Enter Your Name: Mitchelle Gariles");
        name = input.nextLine();
       System.out.println("Number of Hours Worked");
       noHours = input.nextDouble();
       System.out.println("Rate Per Hour");
       ratePerHr = input.nextDouble();
       System.out.println("SSS Amount");
       sss =  input.nextDouble();
       System.out.println("Pag-ibig Amount");
       pi= input.nextDouble();
       System.out.println("PhilHealth Amount");
       ph = input.nextDouble();
       input.close();
    
      System.out.println("Name " +name);   
       System.out.println("No. of hours worked" +noHours);
       System.out.println("Rate per hour" + ratePerHr);
       System.out.println("SSS" +sss);
       System.out.println("Pag-ibig" +pi);
       System.out.println("PhilHealth" +ph);
       System.out.println("Tax "+tax+" % of the gross pay");
       
       double grossPay = noHours*ratePerHr;
       System.out.println("Gross Salary" +grossPay);
       double deduct = sss+pi+ph+tax;
       System.out.println("Total Deductions" +deduct);
       double netPay = grossPay - deduct;
       System.out.println("Net Salary" +netPay);
       
    
     }  
}