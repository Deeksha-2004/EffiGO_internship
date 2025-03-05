package Mar_05_2025;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportmanager implements ITestListener {
	public ExtentSparkReporter sparkReporter;  //UI of the report
	public ExtentReports extent;  // gives common information on the reports such as name of tester etc
	public ExtentTest test; //creating the test case entries and updating the status of the test
	public void onStart(ITestContext context) {
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");//specify the location
	    sparkReporter.config().setDocumentTitle("Automation report");//title of report
	    sparkReporter.config().setReportName("Functional Testing");//name of report
	    sparkReporter.config().setTheme(Theme.DARK);
	    extent=new ExtentReports();
	    extent.attachReporter(sparkReporter);
	    
	    extent.setSystemInfo("Computer Name", "localhost");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("Tester Name", "Deeksha");
	    extent.setSystemInfo("OS", "Windows 11");
	    extent.setSystemInfo("Browser Name", "Chrome"); 
	  }
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());//create a new entry of report
		test.log(Status.PASS,"Test case passed is:"+result.getName()); 
	  }
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case failed is:"+result.getName());
		test.log(Status.FAIL,"Test case failed cause is:"+result.getThrowable()) ; 
	  }
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,"test case skipped is:" + result.getName());
		  }
	public void onFinish(ITestContext context) {
	    extent.flush();
	  }

	
	
	

}
