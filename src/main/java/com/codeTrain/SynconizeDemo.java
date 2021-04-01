package com.codeTrain;

import org.openjdk.jol.info.ClassLayout;

public class SynconizeDemo {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized ()
    }
}
