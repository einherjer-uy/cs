package org.einherjer.cs;

public class MaxDistance {

	public static void main(String[] args)
	{
		int[] a =
		{ -2, 5, 4, -1, -2, 1, -3, -3 };
		maxDistanceFindingMaxAndMin(a);
	}
	
	static int maxDistance(int[] a)
	{
		int start, end, maxSoFar;
		start = end = -1;
		maxSoFar = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++) //misma recorrida q en el de MaxSubArraySum
			{
				int distance = Math.abs(a[j] - a[i]);
				if (distance > maxSoFar)
				{
					maxSoFar = distance;
					start = i;
					end = j;
				}
			}
		}
		System.out.printf("Maximum distance is %d between %d and %d", maxSoFar, start, end);
		return maxSoFar;
	}
	
	static void maxDistanceFindingMaxAndMin(int[] a)
	{
		int max = Integer.MIN_VALUE;
		int minPos, maxPos;
		minPos = maxPos = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i] > max) {
				max=a[i];
				maxPos = i;
			}
			if(a[i] < min){
				min=a[i];
				minPos = i;
			}
		}
		System.out.printf("Maximum distance is %d between %d and %d", Math.abs(min-max), maxPos, minPos);
	}
	
//	maxima diferencia entre elementos (such that larger element appears after the smaller number)
//	http://www.geeksforgeeks.org/maximum-difference-between-two-elements/
	static void maxDistanceIfSmallerIsBeforeLarger(int[] a) {
		int maxSoFar = a[1] - a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) 
        {
            if (a[i] - min > maxSoFar)
            	maxSoFar = a[i] - min;
            if (a[i] < min)
                min = a[i];
        }
		System.out.printf("Maximum distance is %d", maxSoFar);
		
	}
}
