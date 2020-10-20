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

public class QouteTest extends BaseClass{
	
	
	@Test
	public void createQuote() {
			  
		ExtentTest logger = reports.createTest("createQuote");
		
		logger.log(Status.INFO, "execute login to APP");
		logger.log(Status.INFO, "navigate to Invoice Page");
		logger.log(Status.INFO, "click on invoice btn");
		logger.log(Status.INFO, "create Quote");
		
	}



}
