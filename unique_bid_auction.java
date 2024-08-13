/******************************************************************************
 
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.
 
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        max=Math.max(max,arr[i]);
		    }
		    int[] freq=new int[max+1];
		    for(int i=0;i<n;i++){
		        freq[arr[i]]++;
		    }
		    List<Integer> l=new ArrayList<>();
		    for(int i=0;i<freq.length;i++){
		        if(freq[i]==1){
		            l.add(i);
		        }
		    }int flag=1;
		    Collections.sort(l);
		    if(l.size()==0){
		        System.out.println(-1);
		        flag=0;
		        continue;
		    }
		    int find=l.get(0);
		    int index=-1;
		    for(int i=0;i<n;i++){
		        if(arr[i]==find){
		            index=i;
		        }
		    }
            if(flag==1)
		    System.out.println(index+1);
		}
	}
}