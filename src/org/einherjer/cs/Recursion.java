package org.einherjer.cs;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(factorial(40));
	}

	static int factorial(int n) {
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}

	// muy ineficiente porq al calcular fib(n-1) vuelve a calcular fib(n-2). Con
	// un array para guardar lo que ya se calculo mejora mucho
	static int fibonacci(int n) {
		if (n <= 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// con programacion dinamica
	static int fibo2(int n) {
		if (n <= 1)
			return 1;

		int last = 1;
		int nextToLast = 1;
		int answer = 1;

		for (int i = 2; i <= n; i++) {
			answer = last + nextToLast;
			nextToLast = last;
			last = answer;
		}
		return answer;
	}

	static long pow(long x, int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return n;
		if (isEven(n))
			return pow(x * x, Math.round(x/2)); // notar Math.round es la forma de convertir float/double a int
		else
			return pow(x * x, Math.round(x/2)) * x;
	}

	static boolean isEven(int n) {
		return n % 2 == 0;
	}

	// maximo comun denominador
	public static long gcd(long m, long n) {
		while (n != 0) {
			long rem = m % n;
			m = n;
			n = rem;
		}
		return m;
	}

}
