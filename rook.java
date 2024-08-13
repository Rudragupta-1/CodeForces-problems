import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            List<String> l = new ArrayList<>();
            String s = sc.next();
            
            // Horizontal moves (same row, different columns)
            for (char i = 'a'; i <= 'h'; i++) {
                if (i == s.charAt(0)) {
                    continue;
                }
                l.add(String.valueOf(i) + s.charAt(1));
            }
            
            // Vertical moves (same column, different rows)
            for (int i = 1; i <= 8; i++) {
                if (i == Character.getNumericValue(s.charAt(1))) {
                    continue;
                }
                l.add(s.charAt(0) + String.valueOf(i));
            }
            
            // Printing all possible moves
            for (String move : l) {
                System.out.println(move);
            }
        }
    }
}