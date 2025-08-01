package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Read File Path
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//Create Object and load the file
		Properties propertiesObj=new Properties();
		propertiesObj.load(file);
		
		//Read data from properties file
		String url=propertiesObj.getProperty("baseUrl");
		String Platform=propertiesObj.getProperty("browser");
		String userhandle=propertiesObj.getProperty("username");
		String Email=propertiesObj.getProperty("emailid");
		String Password=propertiesObj.getProperty("password");
		
		//Print the values
		System.out.println(url+" "+Platform+" "+userhandle+" "+Email+" "+Password);
		
        //1. Read only Key names from properties file
		Set<String> keys=propertiesObj.stringPropertyNames();
		System.out.println(keys);
		
		//2. Another way to read Key names from properties file
		Set<Object> keyset=propertiesObj.keySet();
		System.out.println(keyset);
		
		//Read Value from the Properties file
		Collection<Object> Values=propertiesObj.values();
		System.out.println(Values);
		
		file.close();
		
	}

}
