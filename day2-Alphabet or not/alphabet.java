import java.util.*;

public class alphabet
{
	public static void main(String[] args)
	 {
	
		Scanner sc= new Scanner(System.in);     
		System.out.print("Enter the character : ");  
		char c = sc.next().charAt(0);  

		 if(c>='A' && c<='Z'|| c>='a' && c<='z')
		{
			System.out.println("Alphabet");
		}
		else{
			System.out.println("Not an alphabet");
		}
	}
}