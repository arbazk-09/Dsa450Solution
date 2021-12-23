import java.util.*;

class Solution{
    //Time Complexity O(n)
	public static void rotateByOne(int[] cyclicRotation,int n){
       int temp=cyclicRotation[n-1];
       for(int i=n-1;i>0;i--){
       	//replace ith element to i-1th element
       	cyclicRotation[i]=cyclicRotation[i-1];
       }
       cyclicRotation[0]=temp;
       System.out.println(Arrays.toString(cyclicRotation));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Size of Array
		int n=sc.nextInt();
		int[] cyclicRotation=new int[n];
		for(int i=0;i<n;i++){
			cyclicRotation[i]=sc.nextInt();
		}
		rotateByOne(cyclicRotation,n);
	}
}
