package SelectionSort;

import java.util.Arrays;

public class Selection_Sort {
//	public static void swap(int x, int y)
//	{
//		int temp = x;
//		x = y;
//		y = temp;
//	}
	
	
	public static void main(String[] args) {
		int[] arr = {10,14,27,33,35,19,42,44};
		
		for(int i = 0; i<arr.length; i++)
		{
			int least = arr[i]; // not required
			int pos = i;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[j] < least)
				{
					least = arr[j]; // not required
					pos = j;
				}
			}
//			swap(arr[i], arr[pos]); 
			
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
