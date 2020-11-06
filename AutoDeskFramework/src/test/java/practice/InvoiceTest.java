package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.autodest.genericUtils.BaseClass;

public class InvoiceTest extends BaseClass{
	
	
	 @Test(retryAnalyzer = com.autodest.genericUtils.ListenerRetry.class)
	public void createInvoiceTest() {
	   System.out.println("execute createInvoiceTest");
          Assert.assertEquals(true, false);
	}
	
	
	
	
	
	


}
