import java.util.Arrays;

class optibubblesort{
	public void sort(int nums[]){
		for(int i=0;i<nums.length-1;i++) {
			        boolean swapped = false;
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
					swapped = true;

				}
		}
			if(swapped==false)
				break;
		}
	}
	public static void main(String args[]) {
		optibubblesort aobj = new optibubblesort();
		int nums[] = {1,8,9,4,5,6};
		System.out.println(Arrays.toString(nums));
		aobj.sort(nums);
		System.out.println(Arrays.toString(nums));


	}
}