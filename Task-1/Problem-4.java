import java.io.IOException;
 import java.util.*;
public class MultiplicationTable {
 
    public static void main(String[] args) throws IOException {
  Scanner s=new Scanner(System.in);
        //System.out.print("Enter the number you want to in the multiplication table : ");
        long number=s.nextLong();
       //System.out.println("The multiplication table of "+number+" is : ");
        for(int i=1;i<=12;i++){
          long multiplicatino=number*i;
          System.out.println(number+" "+"X"+" "+i+" "+"="+" "+multiplicatino);
        }  
 
    }
 
}
