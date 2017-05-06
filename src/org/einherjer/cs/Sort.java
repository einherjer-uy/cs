package org.einherjer.cs;

public class Sort {

	public static void main(String[] args) {
		int[] a = { -2, 5, 4, -1, -2, 1, -3, -3 };
		bubble(a);
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}

	public static void bubble(int[] a) {
		boolean swap;
		do {
			swap = false;
			for (int i = 0; i <= a.length - 2; i++) {
				if (a[i] > a[i + 1]) {
					int aux = a[i];
					a[i] = a[i + 1];
					a[i + 1] = aux;
					swap = true;
				}
			}
		} while (swap);
	}

	public static void select(int[] a) {
		for (int i = 0; i <= a.length - 1; i++) {
			int min = i;
			for (int j = i; j <= a.length - 1; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int aux = a[i];
			a[i] = a[min];
			a[min] = aux;
		}
	}

	public static void insert(int[] a) {
		for (int i = 0; i <= a.length - 1; i++) {
			int curr = a[i];
			int j;
			for (j = i; j > 0 && a[j - 1] > curr; j--) { // importante que la condicion del for sea un && porque si pones adentro
														//del for el chequeo de a[j-1]>curr lo q te pasa es que el j siempre se
														//decrementa a 0 (porque queda eso como unica condicion para cortar el for,
														//la otra opcion seria hacer un break; en el else del if(a[j-1]>curr)
														//y dp cuando hace a[j]=curr la caga
				a[j] = a[j - 1];
			}
			a[j] = curr;
		}
	}

}
