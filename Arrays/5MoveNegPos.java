import java.util.*;

public class MoveNegPos{
       //using two pointer technique time complexity O(n) and space is O(1)
	public static void moveNegPos(int[] arr,int n){
		int l=0,r=n-1;
		//if left element is negative than increment in left pointer
		// if right element is positive than decrement in right pointer
		//if left element is positive and right element is negative than swap it and increment in left pointer and decrement in right pointer
		//repeat this step until left pointer is less than right pointer
		while(l<r){
			if(arr[l]<0){
               			l++;
			}
			if(arr[r]>=0){
				r--;
			}
          	 	if(arr[l]>-1 && arr[r]<0){
            			int temp=arr[r];
            			arr[r]=arr[l];
            			arr[l]=temp;
            			l++;
            			r--;
            		}           
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		moveNegPos(arr,n);
		System.out.println(Arrays.toString(arr));
	}
}
