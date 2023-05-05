import java.util.*;

public class HW3 {
 public static void main(String[] args)
 {
    int[] nums = {1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};
	int ctr_even = 0, ctr_odd = 0;
	System.out.println("Original Array: "+Arrays.toString(nums)); 
	    
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 0)
		{         
          ctr_even++;
		}
		else
		   ctr_odd++;	
    }                 
    System.out.printf("\nOdd: %d",ctr_odd);
	System.out.printf("\nEven: %d",ctr_even);
	System.out.printf("\n");	
  }
}
