import java.util.Scanner;
public class areaCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();
        double area = Math.PI*r*r;
        System.out.println("The area of the circle is: " + area);
        sc.close();

    }
    
}
