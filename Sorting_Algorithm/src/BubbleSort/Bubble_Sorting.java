package BubbleSort;

import java.util.Arrays;

public class Bubble_Sorting {
	public static void main(String[] args) {
		int[] arr = {25,15,29,11,1};
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
