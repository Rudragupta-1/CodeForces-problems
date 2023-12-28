import java.util.*;

public class con909_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            int sum = arr[0];
            for(int i=1;i<n;i++)
            {
                if(sum<0) sum=0;
                if((arr[i]-arr[i-1])%2==0) sum=arr[i];
                else sum+=arr[i];
                max=Math.max(max,sum);
            }
            System.out.println(max);
        }
    }
}
