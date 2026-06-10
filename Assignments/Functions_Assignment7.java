package Assignments;
import java.util.Scanner;
public class Functions_Assignment7 {
    public static int Averageabc(int a , int b , int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static boolean isEven(int n){
        boolean isEven = true;
        if(n%2!=0){
            isEven = false;
        }
        return isEven;
    }

    public static boolean isPalindrome(int n){
        int num = n;
        int rev = 0;
        boolean isPalindrome = true;
        while(num>0){
            int digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }
        if(n!=rev){
            isPalindrome= false;
        }
        return isPalindrome;
    }
    public static int sumOfDigits(int n){
    int res = 0;
    while(n>0){
        int digit = n%10;
        res+=digit;
        n/=10;
    }
    return res;
}
    
    public static void main(String args[]){
        //Question 1 : Write a java method to compute the average of three numbers
        int avg = Averageabc(2,4,6);
        System.out.println(avg);
        // Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. 
        // Also write a program to test your method.
        System.out.println(isEven(9));
        //Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a
        //palindrome, 321 is not)
        System.out.println(isPalindrome(122));
        // Question 4: Use Math. functions 
        int a = 9;
        int b = 2999;
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a,2));
        System.out.println(Math.abs(a));
        //Question 5 : Write a Java method to compute the sum of the digits in an integer.
        System.out.println(sumOfDigits(b));
    }
}
