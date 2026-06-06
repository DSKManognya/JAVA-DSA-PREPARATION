package Assignments;
import java.util.Scanner;
public class ExtraProblems {
    public static void main(String args[])
    {
        //Question 1 -FizzBuzz
        // if the number is the multiple of only 3- ptint fizz
        // if the number is the multiple of only 5 - print buzz
        // if teh number is a multipel of 3 and 5 - print FizzBuzz
        // if it is not a multiple of 3 and 5 - print the number itself
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        // if(num%3==0){
        //     if(num%5==0){
        //         System.out.println("FizzBuzz");
        //     }
        //     else{
        //         System.out.println("Fizz");
        //     }
        // }
        // else if(num%5==0){
        //     System.out.println("Buzz");
        // }
        // else{
        //     System.out.println(num);
        // }
        if(num%3==0 && num%5==0){
            System.out.println("FizzBuzz");
        }
        else if(num%3==0){
            System.out.println("Fizz");
        }
        else if(num%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);
        }
        // another way
        // if(num%3==0 && num%5!=0){
        //     System.out.println("Fizz");
        // }
        // else if(num%5==0 && num%3!=0){
        //     System.out.println("Buzz");
        // }
        // else if(num%3==0 && num%5==0){
        //     System.out.println("FizzBuzz");
        // }
        // else{
        //     System.out.println(num);
        // }
        // Question 2 Weekday or Weekend
        int day = sc.nextInt();
        switch(day){
            case 1:
                
            case 2:
               
            case 3:
                
            case 4:
                
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
                
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid"); 
            // case 1, 2, 3, 4, 5: 
                // System.out.print("weekday");
                //break;
            // case 6, 7:
                // System.out.print("Weekend");
                //break;
            // default:
                // System.out.print("Invalid");
        }
        //Question 3: Timezone Converter
        // to convert GMT to IST
        //GMT to IST-> add 5:30
        System.out.println("Enter the date:");
        int date = sc.nextInt();
        System.out.println("Enter the hour:");
        int hour = sc.nextInt();
        System.out.println("Enter the minute:");
        int min = sc.nextInt();
        int idate = date;
        int ihour = hour;
        int imin = min+30;
        ihour+=imin/60;
        imin%=60;
        ihour = hour+5;
        
        idate += ihour/24;
        ihour%=24;
        System.out.println(idate+" "+ihour+" "+imin);
        
    }
    
}
