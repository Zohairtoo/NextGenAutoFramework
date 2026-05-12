package xohairtoo.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import xohairtoo.TestRetry;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestRetryListener implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass,
                          Constructor testConstructor, Method testMethod) {
        // This automatically attaches the retry logic to EVERY @Test method
        annotation.setRetryAnalyzer(TestRetry.class);
        // would not work directly with cucumber tests.
    }
}
