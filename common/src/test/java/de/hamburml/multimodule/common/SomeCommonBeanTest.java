package de.hamburml.multimodule.common;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;


@QuarkusTest
public class SomeCommonBeanTest {

    @Inject
    SomeCommonBean someCommonBean;

    @Test
    public void someCommonBeanTest() {
        someCommonBean.doSomething();
    }
}
