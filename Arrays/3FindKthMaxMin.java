import java.util.*;

public class FindKthMaxMin{
	public static void findKthMaxMin(PriorityQueue<Integer> pq,int n,int k){
		int min=-1,max=-1,c=0,l=Math.max(k,n-k+1);
		while(!pq.isEmpty()){
			int temp=pq.poll();
			c++;
			if(c==k){
				min=temp;
			}
			if(c==n-k+1){
				max=temp;
			}
			if(c==l){
				break;
			}
		}
		System.out.println(min+" "+max);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<n;i++){
			pq.add(sc.nextInt());
		}
		findKthMaxMin(pq,n,sc.nextInt());
	}
}
