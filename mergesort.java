import java.util.Arrays;

class mergesort{
	public void mergearray(int[] nums, int p, int q, int r) {
		int n1 = q-p+1;
		int n2= r-q;
		int L[] = new int[n1];
		int M[]= new int[n2];
		
		for(int i=0;i< n1;i++)
			L[i] = nums[p+i];
		for(int j=0;j<n2;j++)
			M[j]= nums[q+1+j];
		
		int i=0,j=0,k=p;
		
		while(i<n1 && j<n2) {
			if(L[i]<=M[j]) {
				nums[k]= L[i];
						i++;
			}
			else {
				nums[k]=M[j];
				j++;
			}
			k++;
		}
			while(i<n1) {
				nums[k]=L[i];
				i++;
				k++;
			}
			while(j<n2) {
				nums[k]=M[j];
				k++;
				j++;
			}
		
		
	}
	
	
	
	
	void breakarray(int nums[],int low,int high) {
		if(low<high) {
		int mid =  (high+low)/2;
		breakarray(nums,low,mid);
		breakarray(nums,mid+1,high);
		mergearray(nums,low,mid,high);
		}
	}
	
	
	
	
	public static void main(String args[]) {
		mergesort aobj = new mergesort();
		int [] num = {2,3,1,5,4,6};
		aobj.breakarray(num,0,num.length-1);
		System.out.print(Arrays.toString(num));
		
	}
}