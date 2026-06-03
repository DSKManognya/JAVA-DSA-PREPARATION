import java.util.Scanner;

public class ConditionalStatements{

    public static void main(String args[]){
        // if-else statement
        // Syntax: if(condition) {
        //     // code to execute if condition is true
        // } else {
        //     // code to execute if condition is false
        // }
        int age = 14;
        if(age>=18){
            System.out.println("You are an adult. Get a grip!!!");
        }
        if(age> 13 && age<18){
            System.out.println("You are a teenager. Enjoy your teenage years!!!");
        }
        else{
            System.out.println("You are a minor. Enjoy your childhood!!!");
        }
        
        // Question: print the largest of two numbers
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A>B){
            System.out.println("The number A "+A+" is greater");
        }
        else if(B>A){
            System.out.println("The number B "+B+" is greater");
        }
        else{
            System.out.println("Both numbers are equal");
        }
        // Question : print if teh number is even or odd
        int num = sc.nextInt();
        if(num%2 ==0){
            System.out.println("The number "+num+" is even");
        }
        else{
            System.out.println("The number "+num+" is odd");
        }
        // String type = (num%2==0)? "even":"odd";
        // Question : check if a student passes or fails
        System.out.println("Enter the marks of the student:");
        int marks = sc.nextInt();
        String result = (marks>=33)?"Pass":"Fail";
        System.out.println("The student has "+result);
        }

    }


