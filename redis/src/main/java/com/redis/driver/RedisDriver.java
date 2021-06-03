package com.redis.driver;

import com.laven.database.driver.Driver;

/**
 * @author WangWenlong 2021/6/3
 */
public class RedisDriver implements Driver{
    @Override
    public void init() {
        System.out.println("This is Redis Driver");
    }
}
