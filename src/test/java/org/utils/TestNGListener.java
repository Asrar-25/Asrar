package org.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestNGListener implements ITestListener{

    ExtentReports extentrep;
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
    String resultFolder;
    String reportpath = System.getProperty("user.dir")  + "\\test-output\\HtmlReport\\ExtentReport.html";

    @Override
    public void onStart(ITestContext context) {
        ExtentSparkReporter sparkrep = new ExtentSparkReporter(reportpath);
        sparkrep.config().setReportName("Test Report");
        sparkrep.config().setTheme(Theme.DARK);
        extentrep = new ExtentReports();
        extentrep.attachReporter(sparkrep);
    }

    @Override
    public void onTestStart(ITestResult result) {
        test.set(extentrep.createTest(result.getMethod().getMethodName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Passed : " + result.getMethod().getMethodName());
        System.out.println("Test Passed : " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, "Test Failed : " + result.getMethod().getMethodName());
        System.out.println("Test Failed : " + result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {
        copyreports();
        extentrep.flush();
    }

    private void copyreports() {
        resultFolder = System.getProperty("user.dir") + "\\test-output\\HtmlReport\\ExtentReport" + new SimpleDateFormat("ddMMhhmmss").format(new Date()) + ".html";
        File source = new File(reportpath);
        File dest = new File(resultFolder);
        try {
            FileUtils.copyFile(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
