import java.util.Scanner;
public class continueKeywordquestion {
    public static void main(String args[]){
        // print numbers from 1 to 5 except 3
       Scanner sc = new Scanner(System.in);
        int i =1;
        while(i<=5){
            if(i==3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
            // Display all numbers user has entered except mulitiples of 10
            //Scanner sc = new Scanner(System.in);
            while(true){
                int num = sc.nextInt();
                if(num%10==0){
                    System.out.println("You have entered a multiple of 10");
                    continue;
                }
                System.out.println(num);

            }
        }
    }
    

