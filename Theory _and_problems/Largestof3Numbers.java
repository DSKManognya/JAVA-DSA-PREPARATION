import java.util.Scanner;
public class Largestof3Numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers to be compared:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // if(a>b){
        //     if(a>c){
        //         System.out.println(a+" is greater");
            
        //     }
        //     else{
        //         System.out.println(c+" is greater");
        //     }
        // }
        // else if (b>a){
        //     if (b>c){
        //         System.out.println(b+" is greater");
        //     }
        //     else{
        //         System.out.println(c+" is greater");
                
        //     }
        // }
        if((a>=b)&&(a>=c)){
            System.out.println(a+" is greater");
        }
        else if((b>=c)){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+" is greater");    
        }
    }
}
