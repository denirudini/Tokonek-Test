package com.tokonek.listener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportListener implements ITestListener {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    
    // Objek WebDriver harus bisa diakses secara global di Listener
    public static WebDriver driver;

    // Metode ini dijalankan sebelum suite tes dimulai
    @Override
    public void onStart(ITestContext context) {
        String reportPath = System.getProperty("user.dir") + "/target/ExtentReport.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        System.out.println("ExtentReports dimulai...");
    }

    // Metode ini dijalankan setelah suite tes selesai
    @Override
    public void onFinish(ITestContext context) {
        if (extent != null) {
            extent.flush();
            System.out.println("ExtentReports selesai. Laporan ada di: " + System.getProperty("user.dir") + "/target/ExtentReport.html");
        }
    }
    
    // Metode ini dijalankan sebelum setiap tes (@Test) dimulai
    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest currentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(currentTest);
        System.out.println("Test dimulai: " + result.getMethod().getMethodName());
    }

    // Metode ini dijalankan ketika tes berhasil
    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test berhasil.");
        System.out.println("Test berhasil: " + result.getMethod().getMethodName());
    }
    
    // Metode ini dijalankan ketika tes gagal
    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, "Test gagal: " + result.getThrowable());
        
        // LOGIC PENGAMBILAN SCREENSHOT
        if (driver != null) {
            String screenshotPath = getScreenshot(driver, result.getMethod().getMethodName());
            test.get().fail("Screenshot Kegagalan").addScreenCaptureFromPath(screenshotPath);
        }
        System.out.println("Test gagal: " + result.getMethod().getMethodName());
    }

    // Metode ini dijalankan ketika tes di-skip
    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test di-skip: " + result.getThrowable());
        System.out.println("Test di-skip: " + result.getMethod().getMethodName());
    }

    // Helper method untuk mengambil screenshot
    private String getScreenshot(WebDriver driver, String screenshotName) {
        String path = null;
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            
            // Format timestamp untuk nama file yang unik
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File screenshotsDir = new File(System.getProperty("user.dir") + "/target/screenshots");
            if (!screenshotsDir.exists()) {
                screenshotsDir.mkdirs();
            }
            
            path = screenshotsDir.getAbsolutePath() + "/" + screenshotName + "_" + timestamp + ".png";
            File destination = new File(path);
            FileHandler.copy(source, destination);

        } catch (IOException e) {
            System.err.println("Gagal mengambil screenshot: " + e.getMessage());
        }
        // Mengembalikan path relatif untuk laporan HTML
        return "./screenshots/" + new File(path).getName();
    }
}

