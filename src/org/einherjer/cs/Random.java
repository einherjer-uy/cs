package org.einherjer.cs;

public class Random {

	//si preciso un nro random que este en un rango (0 a x-1) para implementar shuffling
	//puedo usar new Random.nextInt(x) o Math.random*1000%x (*1000 es para correr la coma, podria ser * otra cosa,
	// 								es porque si no el Math.random me da un nro menor a 0 y % cualquier entero da cero)
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)
		{
			double rand = Math.random();
			System.out.println(Math.floor(rand * 100) % 25);
		}
		System.out.println("------------------");
		java.util.Random rand = new java.util.Random();
		for (int i = 0; i < 10; i++)
		{
			System.out.println(rand.nextInt(25));
		}
	}
}
