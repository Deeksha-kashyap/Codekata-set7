import java.util.*;
class Sample
{
   public static boolean isBinary(int number) 
   {
      int copyOfInput = number;
      while (copyOfInput != 0) 
      { 
          if (copyOfInput % 10 > 1) 
          {
              return false;
          }
          copyOfInput = copyOfInput / 10;
       }
      return true; 
    }
  
   public static void main(String[] args)
   {
      System.out.printf("%d", isBinary(10011));
      System.out.printf("%d", isBinary(111));
      System.out.printf("%d", isBinary(2121));
   }

}
