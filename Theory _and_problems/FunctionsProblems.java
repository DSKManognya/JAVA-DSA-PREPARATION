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
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int res =factorial(n);
       System.out.println("Factorial:"+res);
       int r = sc.nextInt();
       int binomial = binomialCoefficient(8,3);
        System.out.println(binomial);

    }
    
}
