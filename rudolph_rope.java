import java.util.*;
public class rudolph_rope{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int c=0;
      int n=sc.nextInt();
      while(n-->0)
      {
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b) c++;
      }
      System.out.println(c);
    }
  }
}