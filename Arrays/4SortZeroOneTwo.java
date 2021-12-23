import java.util.*;
 public class SortZeroOneTwo{
 	public static void sortZeroOneTwo(int[] arr,int n){
 		int l=0,m=0,r=n-1;
         while(m<=r){
         	int temp=arr[m];
         	if(temp==1){
         		m++;
         	}
            else if(temp==0){
            	arr[m]=arr[l];
            	arr[l]=temp;
            	m++;
            	l++;
            }
            else{
            	arr[m]=arr[r];
            	arr[r]=temp;
            	r--;
            }
            //System.out.println(l+" "+m+" "+r+" "+Arrays.toString(arr));
         }
 	}
 	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sortZeroOneTwo(arr,n);
		System.out.println(Arrays.toString(arr));
	}
 }
