import java.util.Scanner;
public class Functions{
    // Funtion to print Hello World
public static void HelloWorld(){
    System.out.println("Hello World"); 
}
public static int Sumofab(int a , int b){
    int sum = a+b;
    return sum;
    //System.out.println(sum);
}
public static int Sumofab(int a,int b, int c){
    int sum = a+b+c;
    return sum;
    // this is function overloading with parameters

}
public static float Sumofab(float a , float b){
    float sum = a+b;
    return sum;
    // this si function overloading with datatypes
    
}
public static void swap(int a, int b){
    int temp = a;
    a= b;
    b= temp;
    System.out.println("a="+a);
    System.out.println("b="+b);
    
}
public static int productab(int a , int b ){
    int product = a*b;
    return product;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
        HelloWorld();
        HelloWorld();
        HelloWorld();//function call
        int res =Sumofab(a,b);
        System.out.println(res);
        // swapping a and b 
        // int temp = a;
        // a=b;
        // b= temp;
        // System.out.println(a+" "+b);
        swap(a,b);
        // instead of printing the values in the functionw, if we print them in the main method, 
        // they go back to the original values, since the scope of the cahnge is till the swap function only 
        int product = productab(a, b);
        System.out.println(product);
    }
} 