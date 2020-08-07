package Pack1;

import java.io.File;
import java.io.FileInputStream;

public class Class2 {

	public static void main(String[] args) throws Exception 
	{
	Class1 c1=new Class1();
	Class3 c3=new Class3("C:\\Users\\ACCER\\Desktop\\Data.xlsx");
	for(int i=0;i<4;i++)
	{
		String str=c3.getData(0,i,0);
		if(str.equalsIgnoreCase("OpenBrowser"))
		{
		 c1.OpenBrowser();
		}
		else if(str.equalsIgnoreCase("SendKeys1"))
		{
		 c1.SendKeys1();
		}
		else if(str.equalsIgnoreCase("SendKeys2"))
		{
		  c1.SendKeys2();
		}
		else if(str.equalsIgnoreCase("LoginClick"))
		{
			c1.LoginClick();
		}
	}

	}

}
