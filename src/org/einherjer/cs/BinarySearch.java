package org.einherjer.cs;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { -3, -2, -1, 0, 5, 10, 50 }; //debe estar ordenado
		System.out.println(search(a,-2));
		System.out.println(search(a,100));
	}

	public static int search(int[] a, int search) {
		int left = 0;
		int right = a.length-1;
		while(left<=right){
			int middle = (right + left) / 2;
			if (search < a[middle]) {
				right = middle + 1;
			}
			else if (search > a[middle]) {
				left = middle - 1;
			}
			else {
				return middle;
			}
		}
		return -1;
	}


}
