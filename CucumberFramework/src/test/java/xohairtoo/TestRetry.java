package xohairtoo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestRetry implements IRetryAnalyzer {
    private int count = 0;
    private static final int MAX_RETRY = 1;

    @Override
    public boolean retry(ITestResult result) {
        if (count < MAX_RETRY) {
            count++;
            System.out.println("Retrying test: " + result.getName() + " [Attempt " + count + "]");
            return true; // Tells TestNG to run the test again
        }
        return false; // No more retries
    }
}
