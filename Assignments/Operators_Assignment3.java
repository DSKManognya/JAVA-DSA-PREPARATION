package Assignments;

public class Operators_Assignment3 {
    public static void main(String[] args){
      //i
        int x = 2,y = 5;
      int exp1 = (x*y/x); // here the output will be 5 because x*y is calculated and teh result is divided with x
      int exp2 = (x*(y/x));// here the output will be 4 because y/x is calculated first and the result is multiplied with x 
    System.out.println("The value of exp1 is: "+exp1);  
    System.out.println("The value of exp2 is: "+exp2); 
    //ii
    x = 200;
    y=50;
    int z = 100;
    if (x > y && y > z){
        System.out.println ("Hello");
    }

    if(z >y && z<x){
        System.out.println("Java");
    }

    if((y+200) < x && (y+150) < z){
        System.out.println ("Hello Java");
    }
    // here the output will be Java
    // iii
    x = y = z = 2;
    x+=y;// x= x+y so the value of x is 4
    y-=z;// y = y-z so the value becomes 0
    z/=(x+y);// z= z/(x+y) = 2/(4+0)=0.5 so the value is 0
    System.out.println(x+" "+y+" "+z);// here the output will be 4 0 0
    
    // iv
    x = 9; y = 12;
    int a = 2, b = 4, c= 6;
    int exp3 = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y) ;
    //4/3*(9+34)+9*(2+4*6)+(3+12*(2+2))/(2+4*12)
    // 4/3*(43)+9*(2+24)+(3+12*(4))/(2+48)
    //4/3*(43)+9*(26)+(3+48)/(50)
    //4/3*(43)+9*(26)+(51/50)
    //4/3*(43)+9*(26)+1
    //4/3*(43)+234+1
    //int res =4/3*(43)+235;
    //System.out.println("The value of res is: "+res);// here the output will be 290
    System.out.println("The value of exp3 is: "+exp3);// here the output will be 292
    
    //v
    x= 10;
    y = 5;
    exp1 = (y*(x/y+x/y));
    // 5*(2+2)= 5*4 = 20
    exp2 = (y*x/y+y*x/y);
    // 5*10/5 +5*10/5 =10+10 =20
    System.out.println("The value of exp1 is: "+exp1);
    System.out.println("The value of exp2 is: "+exp2);


}
}
