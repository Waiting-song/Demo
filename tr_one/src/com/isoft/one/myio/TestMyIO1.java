package com.isoft.one.myio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class TestMyIO1 {

	@org.junit.Test
	public void basicFile()
	{
		// 转义字符   
				File myDir = new File("e:\\oraclexe");
				File myFile = new File("e:\\oraclexe"+File.separator+"daruan.txt");
				System.out.println("文件是否存在"+myFile.exists());
				System.out.println("是否是 文件"+myFile.isFile());
				System.out.println("是否是 目录"+myFile.isDirectory());
				System.out.println("文件名："+myFile.getName());
				System.out.println("绝对路径："+myFile.getAbsolutePath());
				System.out.println("文件大小length："+myFile.length());
	}
	
	@Test
	public void readFile() throws IOException
	{
		File myFile = new File("e:\\myword.txt");
		FileInputStream fis = new  FileInputStream(myFile);
		for(int i=0;i<myFile.length();i++)
		{
			char mychar = (char)fis.read();
			System.out.println(mychar);
		}
		
		fis.close();
	}
	
	@Test
	public void readFileString() throws IOException
	{
		File myFile = new File("e:\\StormMedia"+File.separator+"daruan.txt");
		FileInputStream fis = new  FileInputStream(myFile);
	    byte[] myByteArray = new byte[(int)myFile.length()];
		
	    fis.read(myByteArray);
	    String mystr = new String(myByteArray);
	    System.out.println(mystr);
		fis.close();
	}
	
	@Test
	public void writeFile() throws IOException
	{
		File myFile = new File("e:\\StormMedia"+File.separator+"daruan.txt");
		String mytemp = "hello";
		FileOutputStream fops = new FileOutputStream(myFile);
		
		for(int i=0;i<mytemp.length();i++)
		{
			fops.write(mytemp.charAt(i));
		}
		
		fops.close();
		
	}
	
	@Test
	public void writeCNFile() throws IOException
	{
		File myFile = new File("e:\\StormMedia"+File.separator+"daruan.txt");
		String mytemp = "中国大地";
		FileOutputStream fops = new FileOutputStream(myFile);
		
		byte[] mybyte = mytemp.getBytes();
		fops.write(mybyte);
		fops.close();
		
	}
	
	@Test
	public void copyFile() throws IOException
	{
		//源文件 
		File myDestinatoinFile = new File("e:\\StormMedia"+File.separator+"daruan.txt");
		// 1.把硬盘文件 读取到 内存
		FileInputStream fis = new FileInputStream(myDestinatoinFile);
	
		// 2. 准备 把读进来的文件 输出到硬盘  相当于复制
		File myNewFile = new File("e:\\StormMedia"+File.separator+"daruanmyCopy.txt");
		if(!myNewFile.exists())
		{
			myNewFile.createNewFile();
		}
		// 输出的某一个文件中
		FileOutputStream fops = new FileOutputStream(myNewFile);
		byte[] mybyte = new byte[(int)myDestinatoinFile.length()];
	    
		// 3. 把源文件 写入到缓冲区
		//fis.read(mybyte) 把源文件 读进 byte 数组 如果返回 -1 代表 读完了
		while(fis.read(mybyte)!=-1)
		{
			fops.write(mybyte);
		}
		
		fis.close();
		fops.close();
		
	}
	
	@Test
	public void bufferedReader() throws IOException
	{
		File myDestinatoinFile = new File("e:\\StormMedia"+File.separator+"daruan.txt");
		FileReader reader = new FileReader(myDestinatoinFile);
		BufferedReader bufferReader = new BufferedReader(reader);
		
		String temp;
		while((temp=bufferReader.readLine())!=null)
		{
			System.out.println(temp);
		}
		
	}
	
	@Test
	public void systemIN() throws IOException
	{
		
	   InputStreamReader isr = new InputStreamReader(System.in);	
	   BufferedReader bufferReader = new BufferedReader(isr);
	   System.out.println("请输入姓名:");
	   String userName = bufferReader.readLine();
	   
	   System.out.println("请输入年龄:");
	   int  sage = Integer.parseInt(bufferReader.readLine());
	   System.out.println(userName+"----"+sage);
	   bufferReader.close();
	   isr.close();
	   
	}

}
