package com.isoft.one.mycollection;

public class TestMyGeneric {

	public static void main(String[] args)
	{
		// 8�ֻ����������� int short byte long double float boolean char
		// Integer ��װ����
		Integer temp = new Integer(0);
		int mm = 0;
		
		Integer [] myIntArray = {1,2,3};
		Double [] myDoubleArray = {1.45,2.87,3.98};
		printArray(myDoubleArray);
		
	}
	
	public static <T>  void printArray(T[] myArray){
		
		for(T myitem : myArray)
		{
			System.out.println(myitem);
		}
	}
}
