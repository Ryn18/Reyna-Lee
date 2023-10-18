package ambot;
import java.util.Scanner;
public class Ambot {
public static void out(String var){
    System.out.println(var);
}

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
  
while(true){
        out(" ALGORITHM \n");
        out("1. Quijano");
        out("2. Lee\n");
        out("Choose a Number");
        int num = scan.nextInt();
        
        switch(num){
             
            case 1:
                out("Quijano Algorithm");
                out("How to add two numbers\n ");
                out("[ First ] input two numbers");
                out(" First number ");
                int number1 = scan.nextInt();
                out(" Second number ");
                int number2 = scan.nextInt();
                out("[ Second ] add the two number which is " + number1 + " and " + number2 );
                int result = number1 + number2;
                out("which will give us " + number1 + " + " + number2 + " = " + result);
                break;
                
            case 2:
                 out("lee Algorithm");
                out("How to multiply two numbers\n ");
                out("[ First ] input two numbers");
                out(" First number ");
                int number3 = scan.nextInt();
                out(" Second number ");
                int number4 = scan.nextInt();
                out("[ Second ] add the two number which is " + number3 + " and " + number4 );
                int result1 = number3 + number4;
                out("which will give us " + number3 + " + " + number4 + " = " + result1);
                break;
                
            default:    
                out("Invalid input try again");
        
                break;
           
        }
}
    }
  
    
    
}
