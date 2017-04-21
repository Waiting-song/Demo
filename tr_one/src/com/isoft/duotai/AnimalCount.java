package com.isoft.duotai;

public class AnimalCount {
	// 静态变量 可以被各个实例 共享 
    public static int piecesOfMeat=0;

	public void eatMeatPlus()
	{
		this.piecesOfMeat++;
	}
	
	public int getPiecesOfMeat()
	{
		return this.piecesOfMeat;
	}
}
