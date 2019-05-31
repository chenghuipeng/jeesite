package com.feipeng.javaCore;

import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;
import java.util.zip.ZipInputStream;

import org.junit.Test;
import org.springframework.transaction.TransactionDefinition;

/****
 * 
 * TODO 类实现描述 
 * @Company 杭州木瓜科技有限公司
 * @className: Test.java
 * @author  feipeng@dianjia.io
 * @date 2019年4月27日 下午2:01:06
 */

public class Test11 {



    {

        WindowAdapter windowAdapter;
        KeyAdapter keyAdapter;
        MouseAdapter mouseAdapter;

        TransactionDefinition transactionDefinition;
    }



    public static void main(String[] args) {

        String s = File.separator;

        System.out.println(s);
        Map<String, Charset> maps = Charset.availableCharsets();

        for (String str : maps.keySet()) {
            System.out.println(str);
        }
    }

    @Test
    public void zipTest() {

        try {
            ZipInputStream stream = new ZipInputStream(new FileInputStream(""));

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Test
    public void Test1() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("公众号：Java3y：" + sum);
    }

    /****
     * 
     * x=sum(n-1)+n;
     */
    @Test
    public void Test2() {
        int sum = this.sum(100);
        System.out.println("公众号：Java3y：" + sum);
    }

    public int sum(int n) {
        if (n == 2)
            return 3;
        else
            return n + sum(n - 1);
    }
    @Test
    public void Test3()
    {
        Properties properties = new Properties();
        properties.put("key1",11);
        properties.put("key2",22);
        properties.put("key3",33);
        properties.put("key4",44);
        System.out.println(properties);


    }

}






















