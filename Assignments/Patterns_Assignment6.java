package Assignments;

public class Patterns_Assignment6 {
   public static void main(String args[]){
    int rows = 5;
    // Hollow rectangle pattern
    for(int i =1;i<=rows;i++){
        for(int j =1;j<=rows;j++){
            if(i==1 || i==rows || j==1 || j==rows){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    //Inverted & Rotated Half Pyramid
    for(int i =1;i<=rows;i++){
        for(int j =1;j<=rows;j++){
            if(j<=rows-i){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }

        }
        System.out.println();
    }
    // Inverted Half Pyramid with numbers
    for(int i =rows;i>=0;i--){
        for(int j =1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    // Floyd's Triangle Pattern
    int count =1;
    for(int i =1;i<=rows;i++){
        for(int j =1;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
    //0-1 Triangle pattern
    int res = 1;
    for(int i =1;i<=rows;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(res);
            res = 1-res;
        }
        System.out.println();
    }
   } 
}
