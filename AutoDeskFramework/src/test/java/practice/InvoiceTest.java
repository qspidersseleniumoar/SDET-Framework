package practice;

import java.io.File;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.autodest.genericUtils.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class InvoiceTest extends BaseClass{
	
	
	@Test
	public void createInvoiceTest() {
			  
		ExtentTest logger = reports.createTest("createInvoiceTest");
		
		logger.log(Status.INFO, "execute login to APP");
		logger.log(Status.INFO, "navigate to Invoice Page");
		logger.log(Status.INFO, "click on invoice btn");
		logger.log(Status.INFO, "create invoice");
		if("HDFC".equals("HDFC")) {
			logger.log(Status.PASS, " invoice is verified");
		}else{
			logger.log(Status.FAIL, " invoice is verified");
		}
		if("Banglore".equals("Banglore")) {
			logger.log(Status.PASS, " add is verified");
		}else{
			logger.log(Status.WARNING, " add is not verified");
		}

	}
	
	@Test
	public void modifyInvoice() {
		
           
			  
		ExtentTest logger = reports.createTest("modifyInvoice");
		
		logger.log(Status.INFO, "execute login to APP");
		logger.log(Status.INFO, "navigate to Invoice Page");
		logger.log(Status.INFO, "click on invoice btn");
		logger.log(Status.INFO, "create invoice");
		if("HDFC".equals("HDF")) {
			logger.log(Status.PASS, " invoice is verified");
		}else{
			logger.log(Status.FAIL, " invoice is verified");
		}
		if("Banglore".equals("Banglore")) {
			logger.log(Status.PASS, " add is verified");
		}else{
			logger.log(Status.WARNING, " add is not verified");
		}
	
	}
	
	@Test
	public void deleteInvoice() {
		

		ExtentTest logger = reports.createTest("deleteInvoice");
		
		logger.log(Status.INFO, "execute login to APP");
		logger.log(Status.INFO, "navigate to Invoice Page");
		logger.log(Status.INFO, "click on invoice btn");
		logger.log(Status.INFO, "create invoice");
		if("HDFC".equals("HDFC")) {
			logger.log(Status.PASS, " invoice is verified");
		}else{
			logger.log(Status.FAIL, " invoice is verified");
		}
		if("Banglore".equals("Banglore")) {
			logger.log(Status.PASS, " add is verified");
		}else{
			logger.log(Status.WARNING, " add is not verified");
		}
	
	}
	
	
	


}
