import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine()); // Read the number of test cases

        while(t-->0) // Loop through each test case
        {
            int n=Integer.parseInt(br.readLine()); // Read the number of integers in the array
            String s=br.readLine(); // Read the string of integers
            String sr[]=s.split(" "); // Split the string into an array of strings
            int ar[]=new int[n]; // Create an integer array of length n

            for (int i=0;i<n ;i++)
            ar[i]=Integer.parseInt(sr[i]); // Convert the string array to an integer array

            Arrays.sort(ar); // Sort the integer array

            long count=Integer.MIN_VALUE; // Initialize the value of count to the minimum possible value for a long integer
            count=(long)(ar[n-1]-ar[0])*ar[n-2]; // Calculate the value of count
            System.out.println(count); // Print the value of count
        }
    }
}

 