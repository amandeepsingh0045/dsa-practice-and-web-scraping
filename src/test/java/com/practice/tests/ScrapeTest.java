package com.practice.tests;

import com.practice.BaseTest;
import com.practice.page.Scrape;
import org.testng.annotations.Test;

public class ScrapeTest extends BaseTest {

        @Test
        public void testlink() {

            // Create Scrape object with driver
            Scrape scrape = new Scrape(driver);

            // Call the method to print topics & links
            scrape.printOutTopicsWithQuestions();
        }
    }


