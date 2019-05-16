package com.feipeng.javaCore;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

import redis.clients.jedis.Jedis;

public class Ma {

    public static void main1(String[] args) {
        Map<String, Object> map = Maps.newHashMap();
        //        map.put("brandId", 10029L);
        //        System.out.println(MVEL.eval("brandId%16L-----", map));

        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.set("runoobkey2", "www.runoob.com");
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: " + jedis.get("runoobkey"));

    }

    public static void main(String[] args) {
        Map<String, Object> map = Maps.newHashMap();
        //        map.put("brandId", 10029L);
        //        System.out.println(MVEL.eval("brandId%16L-----", map));
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //设置 redis 字符串数据
        jedis.lpush("list1", "DB0");
        jedis.lpush("list1", "DB1");
        jedis.lpush("list1", "DB2");
        jedis.lpush("list1", "DB3");
        List<String> list = jedis.lrange("list1", 0, 20);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("列表项为: " + list.get(i));
        }
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: " + jedis.get("runoobkey"));
    }

}
