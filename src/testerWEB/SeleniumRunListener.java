package testerWEB;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
 
public class SeleniumRunListener extends RunListener {
    /**
     * ¬ызываетс€ перед запуском всех тестов.
     * @param description описание класса, который будет запущен
     */
    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("Before tests run: " + description);
    }
 
    /**
     * ¬ызываетс€ когда все тесты завершены
     * @param result результат выполнени€ тестов
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
     * ¬ызываетс€ перед запуском каждого теста.
     * @param description описание теста, который собираетс€ запуститьс€
     * (обычно им€ класса и метода)
     */
    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("Test starts: " + description);
    }
 
    /**
     * ¬ызываетс€ после завершени€ каждого теста,
     * несмотр€ на результат выполнени€.
     * @param description описание теста, который завершилс€
     */
    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Test finished: " + description);
        System.out.println("--------------------------------------");
    }
 
    /** 
     * ¬ызываетс€ когда тест завершаетс€ неудачей.
     * @param failure описывает тест, который завершилс€ ошибкой
     * и полученное исключение.
     */
    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("Test failed with: "
                        + failure.getException());
    }
 
    /**
     * ¬ызываетс€ когда не выполн€етс€ условие в классе Assume
     * 
     * @param failure описывает тест, который не был выполнен
     * и исключение {@link AssumptionViolatedException} 
     */
    @Override
    public void testAssumptionFailure(Failure failure) {
        System.out.println("Test assumes: " + failure.getException());
    }
 
    /**
     * ¬ызываетс€ когда тест не будет запущен, 
     * в основном потому что стоит аннотаци€ @Ignore
     * 
     * @param description описание теста который не будет запущен
     */
    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("Test ignored: " + description);
        System.out.println("--------------------------------------");   
    }
}
