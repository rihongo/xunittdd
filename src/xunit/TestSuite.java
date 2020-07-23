package xunit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSuite implements Test {
    List<Test> tests = new ArrayList<>();

    public TestSuite(Class<? extends Test> testClass) {
        Arrays.stream(testClass.getMethods())
                .filter(method -> method.getAnnotation(xunit.annotation.Test.class) != null)
                .forEach(method ->
                {
                    try {
                        add(testClass.getConstructor(String.class).newInstance(method.getName()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }

    public TestSuite() {

    }

    public void add(Test test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        tests.forEach( t -> {
            t.run(result);
        });
    }
}
