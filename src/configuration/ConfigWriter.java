package configuration;

import java.io.File;

import java.io.FileOutputStream;
import java.util.Properties;

public class ConfigWriter {

	public static void main(String[] args) throws Exception {

		File fs = new File("./Config/prop.properties");
		Properties prop = new Properties();
		
		prop.setProperty("Firstname", "Vasant");
		prop.setProperty("Lastname", "Chavan");
		prop.setProperty("Location", "@Pune");
		FileOutputStream fout = new FileOutputStream(fs);
		prop.store(fout, "Test Data");
		
		fout.close();
		
	}

}
