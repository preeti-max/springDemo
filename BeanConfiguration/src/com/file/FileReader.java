package com.file;

import java.util.Scanner;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReader{
public static void main(String[] args)  {

	String str="";
	try(Scanner s=new Scanner(new File("src/user_data.xml"));){
			MyBean bean = MyBean.getInstance();
			while(s.hasNextLine()) {
				str+=s.nextLine();
			}
			int fname="<first_name>".length();
			int lname="<last_name>".length();
			int fnsidx=str.indexOf("<first_name>");
			int fneidx=str.indexOf("</first_name>");
			int lnsidx=str.indexOf("<last_name>");
			int lneidx=str.indexOf("</last_name>");
			bean.setFirstname(str.substring(fnsidx+fname,fneidx).trim());
			bean.setLastname(str.substring(lnsidx+lname,lneidx).trim());	
			System.out.println(bean);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		} 
	}
}