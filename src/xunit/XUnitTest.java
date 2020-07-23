package xunit;

public class XUnitTest {
    public static void main(String[] args) {
        TestSuite suite = new TestSuite();
        suite.add(new TestCaseTest("testTemplateMethod"));
        suite.add(new TestCaseTest("testResult"));
        suite.add(new TestCaseTest("testFailedResultFormatting"));
        suite.add(new TestCaseTest("testFailedResult"));
        suite.add(new TestCaseTest("testSuite"));

        TestResult testResult = new TestResult();
        suite.run(testResult);
        System.out.println(testResult.getSummary());

    }
}
