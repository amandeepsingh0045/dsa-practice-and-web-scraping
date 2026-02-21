package com.practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends Base {


    @BeforeSuite
    public void setUp(){
        startBrowser();
    }

    @AfterSuite
    public void tearDown(){
        stopBrowser();

    }
}
