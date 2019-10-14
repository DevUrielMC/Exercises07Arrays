package com.exercise07arrays.app;

public class Array1D {

	public static void main(String[] args) {
		//constant declaration
		final int ELEMENTS_ARRAY=10;
		//Arrays declaration
		//ist may
		int[] intArray = new int[ELEMENTS_ARRAY];
		char[] chatArray= new char[ELEMENTS_ARRAY];
		boolean[] boolArray = new boolean[ELEMENTS_ARRAY];
		double[] doubleArray= new double[ELEMENTS_ARRAY];
		String[] strArray = new String[ELEMENTS_ARRAY];
	
		int[] intArray2= {100,200,300,400,500};
		char[] charArray2= {'a','b','c','d'};
		boolean[] boolArray2= {true,false};
		double[] dblArray2= {1.0,2.0,3.0,4.0};
		String[] stgArray2= {"Firsh","secont"};
		
		for(int i=0;i< intArray2.length;i++)
		{
			System.out.println(intArray2[i]);
		}
		for(int i=0;i< charArray2.length;i++)
		{
			System.out.println(charArray2[i]);
		}
		for(int i=0;i< boolArray2.length;i++)
		{
			System.out.println(boolArray2[i]);
		}
		for(int i=0;i< dblArray2.length;i++)
		{
			System.out.println(dblArray2[i]);
		}
		for(int i=0;i< stgArray2.length;i++)
		{
			System.out.println(stgArray2[i]);
		}
	}

}
