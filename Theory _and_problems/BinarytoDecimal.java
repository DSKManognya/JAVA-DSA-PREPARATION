import java.util.Scanner;
public class BinarytoDecimal {
    public static int BitoDec(int n){
        int count =0;
        int res =0;
        while(n>0){
            int digit = n%10;
            // res= res*10+digit *(int)Math.pow(2,count); this is wrong because unlike in decimal system we dont need to multiply with 10 here in binary system
            
            res = res + digit *(int)Math.pow(2,count);
            n/=10;
            count++;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = BitoDec(n);
        System.out.println(res);
    }
    
}
