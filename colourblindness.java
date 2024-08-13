import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            String s=sc.next();
            String ss=sc.next();
            int flag=1;
            for(int i=0;i<n;i++){
                if((s.charAt(i)=='R' && ss.charAt(i)=='G') || (s.charAt(i)=='G' && ss.charAt(i)=='R') || (s.charAt(i)=='R' && ss.charAt(i)=='B') || (s.charAt(i)=='B' && ss.charAt(i)=='R')){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}