package Assignments;
import java.util.Scanner;
public class Variables_Datatypes_Assignment2 {
    public static void main(String[] args){
        // Question 1:In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1:Average of 3 subject marks");
        System.out.println("Enter the marks A, B and C: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int avg = (A+B+C)/3;
        System.out.println("The average of A, B and C is :"+avg);

        //Question 2: In a program, input the side of a square. You have to output the area of the square.
        System.out.println("Q2:Area of a Square");
        System.out.println("Enter the side of the square:");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("The area of the square of side "+side+" cm is "+area);

        //Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
        System.out.println("Q3:Total cost of 3 items with GST");
        System.out.println("Enter the cost of the pencil:");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of the pen:");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of the eraser:");
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        float tax= total*0.18f;
        float bill = total+tax;
        System.out.println("The total cost without tax is:"+total);
        System.out.println("The bill amount with 18% tax is:"+bill);

        //Question 4: to find the datatype of the result
        // the answer is double
        // Question 5: to find if the statement will give an error
        // int $ = 24. this will not give any error as variable names should not contain any aymbols other than'_' and '$' and should not start with a number. So this is a valid variable name.

    }
    
}
