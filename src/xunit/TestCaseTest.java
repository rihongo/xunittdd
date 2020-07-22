package xunit;

public class TestCaseTest extends TestCase {
    public TestCaseTest(String name) {
        super(name);
    }

    WasRun wasRun;

    @Override
    public void setUp() {
        wasRun = new WasRun("testMethod");

    }
    public void testRunning() {
        Assert.assertEqual(false, wasRun.wasRun);
        wasRun.run();
        Assert.assertEqual(true, wasRun.wasRun);
    }

    public void testSetup() {
        Assert.assertEqual(false, wasRun.wasSetUp);
        wasRun.run();
        Assert.assertEqual(true, wasRun.wasSetUp);
    }

}
