import java.util.*;

public class ambitious_kid {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
          arr[i]=sc.nextInt();
    }
    int min=Integer.MAX_VALUE;
    for(int x:arr)
    {
      if(Math.abs(x)<min)
      min=Math.abs(x);
    }
    System.out.println(min);

  }
}

