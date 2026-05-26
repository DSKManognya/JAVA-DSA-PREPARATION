import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        // In Java, we can take input from the user using the Scanner class which is part of the java.util package.
        // To use the Scanner class, we need to import it at the beginning of our program.
        // The Scanner class provides various methods to read different types of input from the user.

        // Here is an example of how to use the Scanner class to take input from the user:

        // Importing the Scanner class
        //import java.util.Scanner;

        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        //using next
        System.out.println("Enter a word");
        String word = sc.next();
        System.out.println(word);
        //here we will face a problem if we use nextLine after next, because next does not consume the newline character, so when we use nextLine after next, it will read the newline character and will not wait for the user to input anything, so we need to consume the newline character before using nextLine
        sc.nextLine(); // consuming the newline character
        //using nextLine
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println(name);
        //using nextInt
        System.out.println("Enter your age");
        int age = sc.nextInt(); 
        System.out.println(age);
        //using nextByte
        System.out.println("Enter your height in cm");
        byte height = sc.nextByte(); 
        System.out.println(height);
        //using nextFloat
        System.out.println("Enter your weight in kg");
        float weight = sc.nextFloat();
        System.out.println(weight);
        // using nextDouble
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        System.out.println(salary);
        //using nextBoolean
        System.out.println("Are you a student? (true/false)"); 
        boolean isStudent = sc.nextBoolean();
        System.out.println(isStudent);
        //using nextShort
        System.out.println("Enter your grade");
        short grade = sc.nextShort();
        System.out.println(grade);
        //using nextLong
        System.out.println("Enter your phone number");
        long phoneNumber = sc.nextLong();
        System.out.println(phoneNumber);


        // Closing the scanner object
        sc.close();
    }
}
