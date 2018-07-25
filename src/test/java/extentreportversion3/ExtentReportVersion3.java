package extentreportversion3;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportVersion3 {
	
	
	@Test
	public void verifytitle() throws IOException {
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./screenshotversion3/screenshotforversion31.html");
		System.out.println("login to amazon");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest logger=extent.createTest("loginTest");
		logger.log(Status.INFO,"LOGIN TO AMAZON");
		logger.log(Status.PASS,"TITLE VERIFIED");
		
		extent.flush();
		
		
		ExtentTest logger2=extent.createTest("logoffTest");
		
		logger2.log(Status.FAIL,"TITLE VERIFIED");
		
		logger2.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Vivek Chennupati\\Desktop\\Priya BRP.jpg").build());
		
		logger2.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Vivek Chennupati\\Desktop\\Priya BRP.jpg").build());
		
		extent.flush();
		}
}
