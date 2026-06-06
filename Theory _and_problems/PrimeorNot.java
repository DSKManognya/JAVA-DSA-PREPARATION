import java.util.Scanner;
public class PrimeorNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which needs to be checked");
        int num = sc.nextInt();
        int i =2;
        boolean isPrime = true;
        while(i*i<=num){
            if(num%i==0){
                isPrime = false;
                break;
            }
            i++;
        }
        if(isPrime){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
    
}
