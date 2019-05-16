package com.feipeng.javaCore;

import org.junit.Test;

public class TestTest {

    /*********
     * 测试带标签
     */

    @Test
    public void testIteration() {

        label1: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {

                System.out.println(i + " " + j);
                if (j == 2) {
                    // break label1;
                    continue label1;

                }

            }
        }
        System.out.println("ttttttttttttt");

    }

}
