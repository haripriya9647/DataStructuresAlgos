import java.util.Arrays;

class bubblesort{
	public void sort(int nums[]){
		for(int i=0;i<nums.length-1;i++) 
			for(int j=0;j<nums.length-i-1;j++) 
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;

				}
	}
	public static void main(String args[]) {
		bubblesort aobj = new bubblesort();
		int nums[] = {7, -5, 3, 6, 1, 0, 45};
		System.out.println(Arrays.toString(nums));
		aobj.sort(nums);
		System.out.println(Arrays.toString(nums));


	}
}