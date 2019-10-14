package com.exercise07arrays.app;

import java.util.Random;
public class PrimosArray {

	public static void main(String[] args) {
		// constant declaration
		final int ELEMENTS_ARRAY=10;
		//VARIABLE
		byte primeNumbers=0;
		boolean isPrime =true;
		//array declaration
		byte []vector = new byte [ELEMENTS_ARRAY];
		
		//Object declaration
		Random randomNumbers = new Random(System.nanoTime());

		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			vector [i]= (byte)randomNumbers.nextInt(14);
		}
		/*for (int i=0;i<ELEMENTS_ARRAY;i++)
		{ solo hace el recorrido
			System.out.println();
		}*/
		for (int i=0;i<ELEMENTS_ARRAY;i++)
		{
			isPrime=true;
			for(int j=2;j<vector[i];j++)
			{
				if (vector[i]%j==0)
				{
					isPrime=false;
					break;
				}
			}
		if(isPrime)
		{
			primeNumbers++;
		}
		}
		System.out.println("Quantify of prime numbers is: "+primeNumbers);
	}

}
