public class Operators {
    public static void main(String[] args){
        int A = 10;
        int B = 5;
        // Arithmetic operators
        int sum = A+B;// this is the addition operator which helps to retuen the sum of the two operands.
        int diff = A-B;// this is the subtraction operator which helps to return the difference of the two operands.
        int product = A*B;// this is the multiplication operator which helps to return the product of the two operands.
        int quotient = A/B;// this is the division operator which helps to return the quotient of the two operands.
        int remainder = A%B;// this is the modulus operator which helps to return the remainder of the division of the two operands.
        System.out.println("The values of A and B are: " + A + " and " + B);
        System.out.println("The sum of A and B is: " + sum);
        System.out.println("The difference of A and B is: " + diff);        
        System.out.println("The product of A and B is: " + product);
        System.out.println("The quotient of A and B is: " + quotient);  
        System.out.println("The remainder of A and B is: " + remainder);
        //Unary operators
        int a = 10;
        int b = ++a;// this is a pre increment operator which increments the value of a by 1 and then assigns it to b.
        System.out.println("The value of a is: " + a);// here the output is 11 since it is incremented and then assigned to b
        System.out.println("The value of b is: " + b);// here the output is also 11 since it is assigned the value of a after it has been incremented.
        int c = a++;// this is a post increment operator which assigns the value of a to c and then increments the value of a by 1.
        System.out.println("The value of a is: " + a);// here the output is 12 since it is assigned to c before it is incremented.
        System.out.println("The value of c is: " + c);// here the output is 11 since it is assigned the value of a before it has been incremented.
        int d = --a;// this is a pre decrement operator which decrements the value of a by 1 and then assigns it to d.
        System.out.println("The value of a is: " + a);// here the output is 11 since it is decremented and then assigned to d.
        System.out.println("The value of d is: " + d);// here the output is also 11 since it is assigned the value of a after it has been decremented.
        int e = a--;// this is a post decrement operator which assigns the value of a to e and then decrements the value of a by 1.
        System.out.println("The value of a is: " + a);// here the output is 10 since it is assigned to e before it is decremented.
        System.out.println("The value of e is: " + e);// here the output is 11 since it is assigned the value of a before it has been decremented.
        //Relational operators
        int x = 10;
        int y = 15;
        int z = 10;
        System.out.println(x==y);// This will return false as the values are not equal to each other.
        System.out.println(x==z);// This will return true as the values are equal to each other.
        System.out.println(x!=y);// This will return true as the values are not equal to each other.
        System.out.println(x>y);// This will return false as the value of x is not greater than the value of y.
        System.out.println(x<y);// This will return true as the value of x is less than the value of y.
        System.out.println(x>=z);// This will return true as the value of x is greater than or equal to the value of z.
        System.out.println(x<=z);// This will return true as the value of x is less than or equal to the value of z. 
        //Logical operators
        System.out.println((x>y) && (x<z));// This will return false as the first condition is false and the second condition is true.
        System.out.println((x>y) || (x<z));// This will return true as the first condition is false and the second condition is true.
        System.out.println(!(x>y));// This will return true as the condition is false and the logical NOT operator negates it to true.
        //Assignment Operators
        int m = 10;
        m += 5;// This is the addition assignment operator which adds the value of 5 to the value of m and assigns the result back to m. So, m becomes 15.
        System.out.println("The value of m after addition assignment is: " + m);
        m -= 3;// This is the subtraction assignment operator which subtracts the value of 3 from the value of m and assigns the result back to m. So, m becomes 12.
        System.out.println("The value of m after subtraction assignment is: " + m);
        m *= 2;// This is the multiplication assignment operator which multiplies the value of m
        // by 2 and assigns the result back to m. So, m becomes 24.
        System.out.println("The value of m after multiplication assignment is: " + m);
        m /= 4;// This is the division assignment operator which divides the value of m by 4 and assigns the result back to m. So, m becomes 6.
        System.out.println("The value of m after division assignment is: " + m);
        m %= 5;// This is the modulus assignment operator which takes the modulus of the value
        // of m by 5 and assigns the result back to m. So, m becomes 1.
        System.out.println("The value of m after modulus assignment is: " + m);
        
            
    }
}
