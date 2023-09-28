package Datarovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DataProviders {
	@DataProvider
	public Object[][] getData(){
		Object[][] a=new Object[3][2];
		a[0][0]="sasi";
		a[0][1] ="kala";
		
		a[1][0]="Hi";
		a[1][1] = "hello";		
	}

}
