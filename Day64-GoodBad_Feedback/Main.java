import java.util.*;


class Main {
    public static void main(String[] args) {
    

      Scanner sc =new Scanner (System.in);
      int T =sc.nextInt();
      String str1 = "101";
      String str2 = "010";
      for(int i=0;i<T;i++)
      {
        String txt=sc.next();
        
        boolean result = txt.contains(str1);
      boolean result1 = txt.contains(str2);
      if(result) {
        System.out.println( "Good");
      }
      else  if(result1) {
        System.out.println("Good");
      }
      else {
        System.out.println( "Bad");
      }

      }


      
     
  
      // check if name is present in txt
      // using contains()
      
    }
  }