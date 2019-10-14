package com.exercise07arrays.app;
import java.util.Random;

public class RamdomNumbers 
{
	public static void main(String[]args) {
//constant declaration
	final int ELEMENTS_ARRAY=10;
	//variables declaration
	double generatedNumber=0;
	int generatedNumberInt=0;
	byte generatedNumberByte=0;
	
	byte evenValues=0;
	byte oddValues=0;
	byte zeroValues=0;
	byte positiveValues=0;
	byte negativeValues=0;
	//ARRAYS DECLARATION
	byte[] miArray1 = new byte[ELEMENTS_ARRAY];
	byte[] miArray2 = new byte[ELEMENTS_ARRAY];		
	//array pseudo ramdom numbers
	//
	Random  randomNumber= new Random(System.nanoTime());
	System.out.println(randomNumber);
	
	for (int i=0; i<miArray1.length;i++)
	{
		generatedNumber = randomNumber.nextDouble();
		System.out.println(generatedNumber);
	}
	
	for (int i=0; i<miArray1.length;i++)
	{
		generatedNumberInt = randomNumber.nextInt(50)+50;
		System.out.println(generatedNumberInt);
	}
	//2da way by means of math class
	for (int i=0;i<ELEMENTS_ARRAY;i++)
	{
		generatedNumberInt= (int)(Math.random()*50+50);
		System.out.println(generatedNumberInt);
	}
	//pas1 1 inicializacion (recorre todo el arreglo)
	for (int i=0; i<miArray2.length;i++)
	{
		miArray2[i] = (byte)randomNumber.nextInt(101);
		System.out.println(miArray2[i]);
	}

	//paso2 proceso
	for (int i=0; i<ELEMENTS_ARRAY;i++)
	{
		if(miArray2[i]==0) 
		{
			zeroValues++;
		}
		else if(miArray2[i]%2==0) 
		{
			evenValues++;
		}
		else if(miArray2[i]%2 !=0) 
		{
			oddValues++;
		}
	    if(miArray2[i]>0) 
		{
			positiveValues++;
		}
		else if(miArray2[i]<0) 
		{
			negativeValues++;
		}
		
		
	}
	//paso 3 visualizacion
	System.out.println("Zero Quantify: "+ zeroValues);
	System.out.println("Odd Quantify: "+ oddValues);
	System.out.println("Even Quantify: "+ evenValues);
	System.out.println("Positive Quantify: "+ positiveValues);
	System.out.println("Negative Quantify: "+ negativeValues);
	}
}
	

