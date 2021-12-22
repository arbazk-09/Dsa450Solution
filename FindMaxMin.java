import java.util.Scanner;

public class FindMaxMin{
	public static void findMaxMin(int[] arr,int n){
		int max=arr[0],min=arr[0];
		for(int i=1;i<n;i++){
			if(max<arr[i]){
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Min: "+min+" Max: "+max);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		findMaxMin(arr,n);
	}
}