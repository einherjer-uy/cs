package org.einherjer.cs;

public class Prime {

	public static void main(String[] args)
	{
		printPrimes(100);
		System.out.println(checkPrime(17));
		System.out.println(checkPrime(10));
	}
	
//	https://en.wikipedia.org/wiki/Primality_test
//	* se pueden probar divisores pero no hace falta probar los pares (salvo el 2)
//	* se sabe q los divisores tienen q ser menores q n/2, de hecho los divisores mayores a sqrt(n) son multiplos de los menores a sqrt(n)
//	* https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

	private static void printPrimes(int n) {
		boolean[] arr = new boolean[n];
		//initialize
		for(int i=0; i<arr.length; i++){
			arr[i]=true;
		}
		for(int i=2; i<arr.length; i++){
			if(arr[i]){
				for(int j=i+i;j<arr.length;j=j+i){ //i+i dejo al q encontre en true y me paro en el siguiente q esta a una distancia i
													//j=j+i sigo saltando siempre una distancia i
					arr[j]=false;
				}
			}
		}
		//print
		for(int i=0; i<arr.length; i++){
			if(arr[i])
				System.out.println(i);
		}
	}

	private static boolean checkPrime(int n) {
		for (int i = Math.floorDiv(n, 2); i > 1; i--) { // arranco en n/2
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
