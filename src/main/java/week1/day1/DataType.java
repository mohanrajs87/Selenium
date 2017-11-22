package week1.day1;

import java.io.PrintStream;
import java.util.Scanner;

public class DataType {

       public static void main(String[] args) {
              // TODO Auto-generated method stub
              
              Scanner s1 = new Scanner(System.in);
           System.out.println("Enter integer");
           int n = s1.nextInt();
           System.out.println("Enter double");
           double db = s1.nextDouble();
           System.out.println("Enter Float");
           float f = s1.nextFloat();
           System.out.println("Enter Long");
           long l = s1.nextLong();
           System.out.println("Enter Short");
           short s = s1.nextShort();
           System.out.println("Enter String");
           String str = s1.next();
           System.out.println("Enter Boolean");
           Boolean b = s1.nextBoolean();
           
           System.out.println("Integer :" + n);
           System.out.println("Double :" + db);
           System.out.println("Float :" + f);
           System.out.println("Long :" + l);
           System.out.println("Short :" + s);
           System.out.println("String :" + str);
           System.out.println("Boolean :" + b);
            
           
           
           
              }

}

