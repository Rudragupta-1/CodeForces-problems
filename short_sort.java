import java.util.*;
public class short_sort{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0)
    {
      String s =sc.next();
      if(s.equals("abc") || s.equals("acb")|| s.equals("bac") || s.equals("cba"))
      System.out.println("Yes");
      else System.out.println("No");
    }
  }
}