package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

        public WebDriver driver ;

        public void startBrowser(){
            driver = new ChromeDriver();
            driver.get("https://www.techinterviewhandbook.org/grind75/?hours=40&grouping=topics");
        }



        public void stopBrowser(){
            driver.quit();
        }
}
