package com.file;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FileReader{
public static void main(String[] args) {

	try(Scanner s=new Scanner(new File("src/com/file/file.txt"));){
			MyBean bean = MyBean.getInstance();
			bean.setFirstname(s.nextLine());
			bean.setLastname(s.nextLine());
			System.out.println(bean);
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}