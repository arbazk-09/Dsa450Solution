import java.util.*;

class Solution{
	//Time complexity O(n) and Space Complexity O(1)
	public static void findLargestSum(int[] arr,int n){
		int max=Integer.MIN_VALUE,sum=0;
		//kadane's Algorithm
		for(int i=0;i<n;i++){
            sum=sum+arr[i];
            max=Math.max(max,sum);
            if(sum<0){
            	sum=0;
            }
        }
		System.out.println("using kadane's algo "+max);
	}

	//using Dynamic Programmin time complexity -> O(n) and Space Complexity -> O(n)
	public static void findLarSum(int[] arr,int n){
		int[] dp=new int[n];
		dp[0]=arr[0];
		int max=dp[0];
		for(int i=1;i<n;i++){
            dp[i]=Math.max(arr[i],dp[i-1]+arr[i]);
			max=Math.max(max,dp[i]);
		}
		System.out.println("using dp "+max);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		findLargestSum(arr,n);
		findLarSum(arr,n);
	}
}
