package CollectionsPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx2 {
	public static void main(String[] args)
	{
	Integer[] arr = {52,12,12,2,72,4}; // used Integer[] instead of int as collections
	Arrays.sort(arr, Collections.reverseOrder()); // reverseorder() for descending order
	System.out.printf("Sorted arr[] = %s",
	Arrays.toString(arr));
	}
}

