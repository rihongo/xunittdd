package xunit;

public class TestCaseTest extends TestCase {
    public TestCaseTest(String name) {
        super(name);
    }

    public void testRunning() {
        WasRun wasRun = new WasRun("testMethod");
        Assert.assertEqual(false, wasRun.wasRun);
        wasRun.run();
        Assert.assertEqual(true, wasRun.wasRun);
    }
}
