package com.github.markPolia.view.impl;

import com.github.markPolia.view.ViewFacade;
import org.springframework.stereotype.Component;

@Component("viewFacade")
public class ViewFacadeImpl implements ViewFacade {
    @Override
    public void logIndex() {
        println("欢迎光临！");
    }

    @Override
    public void hi() {
    }

    public static void println(String str) {
        System.out.println(str);
    }

    public static void println() {
        System.out.println();
    }

    public static void print(String str) {
        System.out.print(str);
    }

    public static void error(String str) {
        System.err.print(str);
    }
}
