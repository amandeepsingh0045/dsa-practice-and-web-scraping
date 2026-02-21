package com.practice.page;

import com.practice.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Scrape extends Base {

    WebDriver driver;

    public Scrape(WebDriver driver) {
        this.driver = driver;
    }

    // Each topic section (container with one h2 and multiple links)
    private By topicSections = By.xpath("//div[@class='space-y-4']/div[contains(@class,'bg-white')]");

    public void printOutTopicsWithQuestions() {
        // find all topic "sections"
        List<WebElement> sections = driver.findElements(topicSections);
        for (int i = 0; i < sections.size(); i++) {
            WebElement section = sections.get(i);
            // topic name
            String topicName = section.findElement(By.tagName("h2")).getText();

            // all questions under this topic
            List<WebElement> questions = section.findElements(By.tagName("a"));
            System.out.println("Topic " + (i + 1) + ": " + topicName +"No of questions   "+questions.size());
            for (int j = 0; j < questions.size(); j++) {
                String qText = questions.get(j).getText();
                String qLink = questions.get(j).getAttribute("href");
                System.out.println("   Q" + (j + 1) + ": " + qText + " --> " + qLink);
            }
            System.out.println("--------------------------------------------------");
        }
    }
}
