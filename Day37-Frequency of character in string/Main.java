import java.util.Scanner; 
public class Main  
{  
     public static void main(String[] args) {  
        System.out.println("enter the word\n ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int[] freq = new int[str.length()];  
        int i, j;  
          
         
        char string[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies\n");  
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println("The frequency of "+string[i] + " is " + freq[i]);  
        }  
    }  
}  