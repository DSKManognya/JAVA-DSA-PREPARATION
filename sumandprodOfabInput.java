import java.util.Scanner;
public class sumandprodOfabInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int sum = a + b;
        int prod = a*b;
        System.out.println("Sum of a and b is: " + sum);
        System.out.println("Product of a and b is: " + prod);
        sc.close();
    }
}
