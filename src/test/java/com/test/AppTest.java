package com.test;

import com.github.markPolia.action.domain.Passby;
import com.github.markPolia.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Comparator;
import java.util.LinkedList;

public class AppTest {
    @Test
    public void testArray() {
        LinkedList<Passby> linkedList = new LinkedList<>();
        Passby e = new Passby();
        e.setStationOrder((byte) 10);
        linkedList.add(e);
        Passby e1 = new Passby();
        e1.setStationOrder((byte) 20);
        linkedList.add(e1);
        linkedList.sort(new Comparator<>() {
            @Override
            public int compare(Passby o1, Passby o2) {
                return o1.getStationOrder() - o2.getStationOrder();
            }
        });
        System.out.println(linkedList);
    }

    @Test
    public void testApp() {
        new AnnotationConfigApplicationContext(SpringConfig.class).close();
    }
}
