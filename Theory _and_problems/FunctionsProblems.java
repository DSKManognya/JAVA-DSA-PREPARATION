import java.util.Scanner;
public class FunctionsProblems {
    public static int factorial(int a){
        int f=1;
        for(int i =1;i<=a;i++){
            f*=i;
        }
        return f;
    }
    public static int binomialCoefficient(int n,int r){
        int res = (factorial(n))/(factorial(n-r)*factorial(r));
        return res;
    }
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void rangePrime(int a, int b){
        for(int i =a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int res =factorial(n);
       System.out.println("Factorial:"+res);
       int r = sc.nextInt();
       int binomial = binomialCoefficient(n,r);
        System.out.println(binomial);
        System.out.println(isPrime(n));
        System.out.println(isPrime(r));
        rangePrime(r,n);

    }
    
}
