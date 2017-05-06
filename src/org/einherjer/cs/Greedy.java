package org.einherjer.cs;

public class Greedy {

	public static void main(String[] args) {
		int[] coins = { 50, 20, 10, 5, 2, 1 };
		System.out.println(giveChange(coins, 112));
	}

	public static String giveChange(int[] coins, int v) {
		String result = "";
		for(int i = 0; i<=coins.length - 1; i++) {
			while (v>=coins[i]) {
				result += (result.isEmpty()?"":",");
				result += coins[i];
				v -= coins[i];
			}
		}
		return result;
	}


}
