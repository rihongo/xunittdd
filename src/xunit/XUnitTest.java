package xunit;

public class XUnitTest {
    public static void main(String[] args) {
        TestSuite suite = TestCaseTest.suite();

        TestResult testResult = new TestResult();
        suite.run(testResult);
        System.out.println(testResult.getSummary());

//        TestSuite suite2 = new TestSuite();
//        suite2.add(new TestCaseTest("testTemplateMethod"));
//        suite.add(suite);
//
//        TestResult testResult2 = new TestResult();
//        suite2.run(testResult2);
//        System.out.println(testResult2.getSummary());
    }
}
