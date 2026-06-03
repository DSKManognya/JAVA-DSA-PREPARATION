import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary:");
        double salary = sc.nextDouble();
        double tax = 0;
        if(salary<500000){
            System.out.println("Tax not applicable");
        }
        else if(salary>=500000 && salary<1000000){
            tax = 0.2*salary;
            System.out.println("20% tax");
            System.out.println("Your tax is: "+tax);
        }
        else{
            tax = 0.3*salary;
            System.out.println("30% tax");
            System.out.println("Your tax is : "+tax);
        }

    }
}
