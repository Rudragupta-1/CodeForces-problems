import java.util.*;
 
public class Main {
    
    static void solve(int c1) {
       if(c1 == 0) {
           System.out.println(0);
       } else if(c1 <= 3 && c1 > 0) {
           System.out.println(1);
       } else {
           System.out.println(2);
       }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int c1 = 0;
            int a = sc.nextInt();
            if (a == 1) c1++;
            int b = sc.nextInt();
            if (b == 1) c1++;
            int c = sc.nextInt();
            if (c == 1) c1++;
            int d = sc.nextInt();
            if (d == 1) c1++;
            solve(c1);
        }
    }
}