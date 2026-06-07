package Assignments;
import java.util.Scanner;
public class Loops_Assignment5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            System.out.println("Hello");
            i+=2;// here hello will be printed 2 times
        }
        // Question 2: write a program that reads a set of integers and then prints the sum of the even and odd integers
        System.out.println("Enter the number of integers which will be entered:");
        int count = sc.nextInt();
        int esum =0;
        int osum = 0;
        for(int i =0;i<count;i++){
            int num = sc.nextInt();
            if(num%2==0){
                esum+=num;
            }
            else{
                osum+=num;
            }
        }
        System.out.println(esum+" "+osum);
     // Question 3 : write a program to find the factorial of any number entered by the user
     System.out.println("Enter the number which you want factorial for:");
     int fac = sc.nextInt();
     int res = 1;
     for(int i =1;i<=fac;i++){
        res*=i;
     } 
     System.out.println(res);
     // Question 4 write a program to print he multiplication table of a number n entered by the user
     System.out.println("Enter the number which you want a table for:");
     int table = sc.nextInt();
     for(int i =1;i<=10;i++){
        System.out.println(table+" * "+i+" ="+table*i);
        
     }  

    }
}
