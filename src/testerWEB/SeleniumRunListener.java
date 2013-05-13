package testerWEB;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
 
public class SeleniumRunListener extends RunListener {
    /**
     * ���������� ����� �������� ���� ������.
     * @param description �������� ������, ������� ����� �������
     */
    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("Before tests run: " + description);
    }
 
    /**
     * ���������� ����� ��� ����� ���������
     * @param result ��������� ���������� ������
     */
    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("Result of the test run:");
        System.out.println("Run time: " + result.getRunTime() + " ms");
        System.out.println("Run count: " + result.getRunCount());
        System.out.println("Failure count: " + result.getFailureCount());
        System.out.println("Ignored count: " + result.getIgnoreCount());
    }
 
    /**
     * ���������� ����� �������� ������� �����.
     * @param description �������� �����, ������� ���������� �����������
     * (������ ��� ������ � ������)
     */
    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("Test starts: " + description);
    }
 
    /**
     * ���������� ����� ���������� ������� �����,
     * �������� �� ��������� ����������.
     * @param description �������� �����, ������� ����������
     */
    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Test finished: " + description);
        System.out.println("--------------------------------------");
    }
 
    /** 
     * ���������� ����� ���� ����������� ��������.
     * @param failure ��������� ����, ������� ���������� �������
     * � ���������� ����������.
     */
    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("Test failed with: "
                        + failure.getException());
    }
 
    /**
     * ���������� ����� �� ����������� ������� � ������ Assume
     * 
     * @param failure ��������� ����, ������� �� ��� ��������
     * � ���������� {@link AssumptionViolatedException} 
     */
    @Override
    public void testAssumptionFailure(Failure failure) {
        System.out.println("Test assumes: " + failure.getException());
    }
 
    /**
     * ���������� ����� ���� �� ����� �������, 
     * � �������� ������ ��� ����� ��������� @Ignore
     * 
     * @param description �������� ����� ������� �� ����� �������
     */
    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("Test ignored: " + description);
        System.out.println("--------------------------------------");   
    }
}
