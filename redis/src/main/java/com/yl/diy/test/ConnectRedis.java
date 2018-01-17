package com.yl.diy.test;

import redis.clients.jedis.Jedis;

public class ConnectRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.207.128", 6379);//192.168.207.128
        System.out.println(jedis.ping());
    }

}
