import java.util.*;
public class to_my_critics{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int sum=a+b+c;
      if(a+b>=10 || b+c>=10 || c+a>=10)
      System.out.println("Yes");
      else System.out.println("No");
    }
  }
}