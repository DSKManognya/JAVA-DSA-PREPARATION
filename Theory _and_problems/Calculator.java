import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator program!!!!");
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the Second number:");
        double num2 = sc.nextDouble();
        System.out.println("Choose the operation that needs to be done");
        System.out.println("1. Addition +");
        System.out.println("2. Subtraction -");
        System.out.println("3. Multiplication *");
        System.out.println("4. Division /");
        System.out.println("5. Modulus %");
        System.out.println("Enter any one of these symbols \"+  - * / %\"");
        char op = sc.next().charAt(0);
        double result = 0;
        switch(op){
            case '+':
                result = num1+num2;
                System.out.println("The result of "+num1+" "+op+" "+num2+" is: "+result);
                break;
            case '-':
                result = num1-num2;
                System.out.println("The result of "+num1+" "+op+" "+num2+" is: "+result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("The result of "+num1+" "+op+" "+num2+" is: "+result);
                break;
            case '/':
                if(num2!=0){
                    result = num1/num2;
                    System.out.println("The result of "+num1+" "+op+" "+num2+" is: "+result);
                }
                else{
                    System.out.println("Division by zero is not allowed");
                }
                break;
            case '%':
                if(num2!=0){
                    result = num1%num2;
                    System.out.println("The result of "+num1+" "+op+" "+num2+" is: "+result);
                }
                else{
                    System.out.println("Modulus by zero is not allowed");
                }
                break;
            
            default:
                System.out.println("Invalid operator");

    }
    
}
}
