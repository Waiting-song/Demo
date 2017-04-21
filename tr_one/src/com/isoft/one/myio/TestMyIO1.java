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
		// ת���ַ�   
				File myDir = new File("e:\\oraclexe");
				File myFile = new File("e:\\oraclexe"+File.separator+"daruan.txt");
				System.out.println("�ļ��Ƿ����"+myFile.exists());
				System.out.println("�Ƿ��� �ļ�"+myFile.isFile());
				System.out.println("�Ƿ��� Ŀ¼"+myFile.isDirectory());
				System.out.println("�ļ�����"+myFile.getName());
				System.out.println("����·����"+myFile.getAbsolutePath());
				System.out.println("�ļ���Сlength��"+myFile.length());
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
		String mytemp = "�й����";
		FileOutputStream fops = new FileOutputStream(myFile);
		
		byte[] mybyte = mytemp.getBytes();
		fops.write(mybyte);
		fops.close();
		
	}
	
	@Test
	public void copyFile() throws IOException
	{
		//Դ�ļ� 
		File myDestinatoinFile = new File("e:\\StormMedia"+File.separator+"daruan.txt");
		// 1.��Ӳ���ļ� ��ȡ�� �ڴ�
		FileInputStream fis = new FileInputStream(myDestinatoinFile);
	
		// 2. ׼�� �Ѷ��������ļ� �����Ӳ��  �൱�ڸ���
		File myNewFile = new File("e:\\StormMedia"+File.separator+"daruanmyCopy.txt");
		if(!myNewFile.exists())
		{
			myNewFile.createNewFile();
		}
		// �����ĳһ���ļ���
		FileOutputStream fops = new FileOutputStream(myNewFile);
		byte[] mybyte = new byte[(int)myDestinatoinFile.length()];
	    
		// 3. ��Դ�ļ� д�뵽������
		//fis.read(mybyte) ��Դ�ļ� ���� byte ���� ������� -1 ���� ������
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
	   System.out.println("����������:");
	   String userName = bufferReader.readLine();
	   
	   System.out.println("����������:");
	   int  sage = Integer.parseInt(bufferReader.readLine());
	   System.out.println(userName+"----"+sage);
	   bufferReader.close();
	   isr.close();
	   
	}

}
