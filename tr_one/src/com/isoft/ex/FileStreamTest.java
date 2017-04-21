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
		    File file = new File("e:\\test.txt");  //创建文件对象
		    //通过文件对象创建文件输出流对象
		    //附加第二个参数true，指定进行文件追加，默认为不追加
		    FileOutputStream fos = new FileOutputStream(file, true);
		    
		    //逐个将字符写入到文件中
		    for (int i = 0; i < str.length(); i++)
		    {
		      fos.write(str.charAt(i));
		    }
		    fos.close();    //关闭流


		 
		 
		  }
}