import java.util.*;

public class MoveNegPos{
	public static void moveNegPos(int[] arr,int n){
		int l=0,r=n-1;
		while(l<r){
			if(arr[l]>-1 && arr[r]>-1){
               r--;
               continue;
			}
			if(arr[r]<0 && arr[l]<0){
				l++;
				continue;
			}
			if(arr[l]<0 && arr[r]>=0){
				l++;r--;
				continue;
			}
            if(arr[l]>-1){
            	int temp=arr[r];
            	arr[r]=arr[l];
            	arr[l]=temp;
            	l++;
            }
            else{
            	int temp=arr[l];
            	arr[l]=arr[r];
            	arr[r]=temp;
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