import java.util.Scanner;
import java.util.Arrays;

public class ReverseTheArray{
	public static void reverseTheArray(int[] arr,int n){
		for(int i=0,j=n-1;i<j;i++,j--){
			if(arr[i]==arr[j])
				continue;
			//swap without using third variable
			arr[i]+=arr[j];         //a=a^b;
			arr[j]=arr[i]-arr[j];   //b=a^b;
			arr[i]=arr[i]-arr[j];   //a=a^b;
		}
	}
	public static void revUsingRec(int[] arr,int s,int e){
		if(s>=e)
			return;
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
		revUsingRec(arr,s+1,e-1);
	}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		//reverseTheArray(arr,n);
		revUsingRec(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
}