package com.oracle.driver;

import com.laven.database.driver.Driver;

/**
 * @author WangWenlong 2021/6/3
 */
public class OracleDriver implements Driver {
    @Override
    public void init() {
        System.out.println("This is oracle driver");
    }
}
