package org.einherjer.cs;

public class MaxSubArraySum {

	public static void main(String[] args)
	{
		int[] a = { -2, 5, 4, -1, -2, 1, -3, -3 };
//		System.out.println("Maximum contiguous sum is " +
//				maxSubArraySum(a));
		maxSubArraySum(a);
	}

	/**
	 * Cubic maximum contiguous subsequence sum algorithm.
	 */
	public static int maxSubSum1(int[] a) {
		int maxSum = 0;

		for (int i = 0; i < a.length; i++)
			for (int j = i; j < a.length; j++) { //misma recorrida q en el de MaxDistance
				
				int thisSum = 0;
				for (int k = i; k <= j; k++)
					thisSum += a[k];

				if (thisSum > maxSum)
					maxSum = thisSum;
			}

		return maxSum;
	}
	 
//	subarray de suma maxima
//	http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
//	https://en.wikipedia.org/wiki/Maximum_subarray_problem
	static int maxSubArraySum(int a[])
	{
		int size = a.length;
		int max_so_far = 0, max_ending_here = 0;

		for (int i = 0; i < size; i++)
		{
			max_ending_here = max_ending_here + a[i];
			if (max_ending_here < 0)
				max_ending_here = 0;
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
	}
	
}
