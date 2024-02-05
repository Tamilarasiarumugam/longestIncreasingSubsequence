package assignments;

public class LongestIncreasingSubsequence {
	
	public static int subsequence(int[] arr,int n)
	{
	   int temp[]=new int[n];
	   int i,j,max=0;
	   for(i=0;i<n;i++)
		   temp[i]=1;
	   for(i=1;i<n;i++)
	   {
		   for(j=0;j<=i;j++)
		   {
			   if(arr[i]>arr[j] && temp[i]<temp[j]+1)
			   {
				   temp[i]=temp[j]+1;
			   }
		   }
	   }
	   for(i=0;i<n;i++)
	   {
		   if(max<temp[i])
		   {
			   max=temp[i];
		   }
	   }
	   return max;
	    
		
	}
	
	public static void main(String[] args)
	{
		int arr[]= {10,22,9,33,21,50,41};
		int n=arr.length;
		System.out.println("length of the longest increasing sequence :"+subsequence(arr,n));
		
	}

}

