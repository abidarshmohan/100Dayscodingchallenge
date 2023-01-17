import java.util.*;
public class demo
{
	public static void main(String[] args)
	 {
	
		Scanner sc= new Scanner(System.in);     
		System.out.print("Enter the character : ");  
		char c = sc.next().charAt(0);    

	    if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
	    {
	        System.out.println("vowel");
	    }	
	    else if(c>='1' && c<='9')
		{
			System.out.println("invalid");
		}
		else {
			System.out.println("consonant");
		}
	    
	}
}