package com.isoft.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamTest {
	 public static void main(String args[]) throws IOException{
	
		    String str = "Hello world!";
		    File file = new File("e:\\test.txt");  //�����ļ�����
		    //ͨ���ļ����󴴽��ļ����������
		    //���ӵڶ�������true��ָ�������ļ�׷�ӣ�Ĭ��Ϊ��׷��
		    FileOutputStream fos = new FileOutputStream(file, true);
		    
		    //������ַ�д�뵽�ļ���
		    for (int i = 0; i < str.length(); i++)
		    {
		      fos.write(str.charAt(i));
		    }
		    fos.close();    //�ر���


		 
		 
		  }
}