import java.util.*;

class Solution{
  
	 //time complexity O(size_A+size_B)
	public static void findUnionIntersection(int[] firstArr,int[] secondArr,int size_A,int size_B){
		int i=0,j=0;
		StringBuilder union=new StringBuilder();
		StringBuilder intersection=new StringBuilder();
		while(true){
			if(i<size_A && j<size_B){			
                if(firstArr[i]==secondArr[j]){
                	intersection.append(secondArr[j++]+" ");
                	union.append(firstArr[i++]+" ");
                }
                else if(firstArr[i]<secondArr[j]){
                	union.append(firstArr[i++]+" ");
                }
                else{
                    union.append(secondArr[j++]+" ");
                }
			}
			else if(i<size_A){
                union.append(firstArr[i++]+" ");
			}
			else if(j<size_B){
 				union.append(secondArr[j++]+" ");
			}
			else{
				break;
			}
		}
		System.out.println("Union : "+union+"\nIntersection : "+intersection);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size_A=sc.nextInt();
		int[] firstArr=new int[size_A];
		for(int i=0;i<size_A;i++){
			firstArr[i]=sc.nextInt();
		}
		int size_B=sc.nextInt();
		int[] secondArr=new int[size_B];
		for(int i=0;i<size_B;i++){
			secondArr[i]=sc.nextInt();
		}
		findUnionIntersection(firstArr,secondArr,size_A,size_B);
	}
}
