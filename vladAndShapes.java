/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		 while(t-->0)
    {
      int n=sc.nextInt();
      int arr[][]=new int[n][n];
      for(int i=0;i<n;i++)
      {
          String s=sc.next();
          for(int j=0;j<n;j++)
          {
              arr[i][j]=s.charAt(j)-'0';
          }
      }
      int prev=0;
     
      for(int i=0;i<n;i++)
      {
          int curr=0;
          for(int j=0;j<n;j++)
          {
              curr+=arr[i][j];
          }
          if(prev!=0)
          {
              if(prev==curr){
              System.out.println("SQUARE");break;}
              else {System.out.println("TRIANGLE");break;}
          }
          prev=curr;
      }
    }
	}
}
