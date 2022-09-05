package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	

	public static String readPropertyFile(String value) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Bhavana\\Eclipse-Bhavana\\workspace-Bhavana-Test\\First-Project\\KitemavenProkectO\\TestData\\config.properties");
		prop.load(file);
		
		return prop.getProperty(value);
	}
	
}
