package listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestLoggerSetup extends TestListenerAdapter {

    private static final Logger fail = LoggerFactory.getLogger("fail");
    private static final Logger warning = LoggerFactory.getLogger("warning");
    private static final Logger info = LoggerFactory.getLogger("info");


    @Override
    public void onTestFailure(ITestResult tr) {
        fail.error(tr.getName() + " - Test failed ");
        info.error(tr.getName() + " - Test failed ");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        warning.warn(tr.getName() + " - Test skipped ");
        info.warn(tr.getName() + " - Test skipped ");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        info.info(tr.getName() + " - Test method success\n");
    }
}