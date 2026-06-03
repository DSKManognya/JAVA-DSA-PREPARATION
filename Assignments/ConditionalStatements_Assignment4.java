package Assignments;
import java.util.Scanner;
public class ConditionalStatements_Assignment4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Question 1: to check if the number is positive or negative
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("0 is neither positive nor negative");
        }
        // Question 2 : if t4emp >100 print fever
        double temp = 103.5;
        if(temp>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You dont have a fever");
        }
        // Question 3: name of the day with switch
        System.out.println("Enter the number of teh day of the week:");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("only 7 days");
        }
        // Questio 4: values of x and y
        int a = 63, b = 36;

        boolean x = (a < b) ? true : false;// here x is false

        int y= (a > b ) ? a : b;// y is 63
        // Question 5: Leap year
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        if((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}

