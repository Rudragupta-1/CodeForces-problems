import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int h = Integer.parseInt(s.substring(0, 2));
            String res;
            String m = "AM";
            if (h >= 12) {
                m = "PM";
                if (h > 12) {
                    h -= 12;
                }
            } else if (h == 0) {
                h = 12;
            }
            String minutes = s.substring(3, 5);
            res = String.format("%02d:%s %s", h, minutes, m);
            System.out.println(res);
        }
    }
}