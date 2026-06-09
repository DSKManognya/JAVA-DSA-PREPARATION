import java.util.Scanner;
public class DecimaltoBinary {
    public static int DectoBin(int n){
        int res = 0;
        int count =0;
        while(n>0){
            int rem = n%2;
            res = res+rem*(int)Math.pow(10,count);
            n/=2;
            count++;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(DectoBin(n));
    }
    
}
