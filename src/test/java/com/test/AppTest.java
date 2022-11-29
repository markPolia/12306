package com.test;

import com.github.markPolia.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    @Test
    public void testApp() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        annotationConfigApplicationContext.close();
    }
}
