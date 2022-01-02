package testNGFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTestINTestNG {
	
	@Test(dataProvider="testdata")
	public void getData(Object name, Object id, Object sal) {
		System.out.println(name +"    "+ id+"   "+ sal);
	}
	@DataProvider(name="testdata")
	public Object[][] testData() {
		
	Object[][] data = new Object[2][3];
	data[0][0] ="Vasant";
	data[0][1] =123;
	data[0][2] =4500.45f;
	
	data[1][0] ="Raman";
	data[1][1] =131;
	data[1][2] =4555.45f;
	
	return data;
	}
		
	@Test(dataProvider="prepareTestData")
	public void createTest(String name1, String name2, String name3) {
		System.out.println(name1+"  "+name2+"  "+name3);
	}
	@DataProvider
	public Object[][] prepareTestData() {
		Object[][] data = {{"vasant","Raman","Ravi"},{"vikas", "Rahul","Mukesh"}};
		
		return data;
	}

}
