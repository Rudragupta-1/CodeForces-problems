import java.util.*;
 
public class Main {
    
    static void solve(int a ,int b,int c) {
        int sum=b+c;
        a-=2;
        sum-=1;
        int layers=3;
        while(sum-->0 && a-->0){
            layers+=2;
        }
        System.out.println(layers);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=sc.nextInt();
            solve(a,b,c);
        }
    }
 
}