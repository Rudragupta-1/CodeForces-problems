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
	    int n=sc.nextInt();
		 while(n-->0)
    {
      int ca=0;
      int cb=0;
      String s=sc.next();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='A') ca++;
        else cb++;
      }
      if(ca>cb) System.out.println('A');
      else System.out.println('B');
    }
	}
}
