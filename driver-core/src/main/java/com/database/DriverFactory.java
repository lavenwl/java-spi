package com.database;

import com.laven.database.driver.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author WangWenlong 2021/6/3
 */
public class DriverFactory {
    public void invoker() {
        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = serviceLoader.iterator();
        boolean notFund = true;
        while (iterator.hasNext()) {
            notFund = false;
            Driver driver = iterator.next();
            driver.init();
        }
        if (notFund) {
            throw new RuntimeException("未发现具体实现");
        }
    }
}
