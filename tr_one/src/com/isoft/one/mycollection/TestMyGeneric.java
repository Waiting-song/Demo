package com.isoft.one.mycollection;

public class TestMyGeneric {

	public static void main(String[] args)
	{
		// 8种基本数据类型 int short byte long double float boolean char
		// Integer 包装类型
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
