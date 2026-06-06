import java.util.Scanner;
public class breakKeywordquestion{
   public static void main(String args[]){
    // keep enterning numbers till user enters a multiple of 10
    Scanner sc = new Scanner(System.in);
    while(true){
        int num = sc.nextInt();
        if(num%10==0){
            System.out.println("You have entered a multiple of 10.");
            break;
        }
        System.out.println(num);
    }
   } 
    
}