package com.test;

import com.github.markPolia.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    @Test
    public void testApp() {
        new AnnotationConfigApplicationContext(SpringConfig.class).close();
    }
}
