public class typeCasting {
    public static void main(String[] args){
        int a = 12;
        float b = a;// this is called implici type casting or widening type conversion. since we are converting a smaller data type to a larger datatype, java does it automatically.
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        char c = 'a';
        int m = c;// this is also an example of implicit type casting. since char is a smaller data type than int, java automatically converts it to int.
        System.out.println("The value of c is: " + c);  
        System.out.println("The value of m is: " + m);
        //explicit type casting or narrowing type conversion
        double d = 12.34;   
        int n = (int)d;// this is called explicit type casting or narrowing type conversion. since we are converting a larger data type to a smaller data type, we need to explicitly tell java to do the conversion.
        System.out.println("The value of d is: " + d);
        System.out.println("The value of n is: " + n);
        
    }
}
