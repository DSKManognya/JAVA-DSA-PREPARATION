import java.util.Scanner;
public class Loops {

 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // loops are used to do a task repeatedly until a condition is satisfied
    // Syntax of while loop
    //while(condition){
    //     // code to be executed//
    //}
    int count = 1;
    while(count<=10){
        System.out.println(count+ " Hello World!");
        count++;

    }
    // Question 1: print numbers from 1 to 10
    int num =1;
    while(num<=10){
        System.out.println(num);
        num++;
    }
    // Question : print numbers from 1 to n
    int n = sc.nextInt();
    int i =1;
    while(i<=n){
        System.out.println(i);
        i++;
    }
 }   
}
