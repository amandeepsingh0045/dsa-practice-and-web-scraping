package com.practice.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class CricbuzzTest {

    private WebDriver driver;
    private WebDriverWait wait;

    private static final By ROWS =
            By.xpath("//div[contains(@class,'bg-white') and contains(@class,'flex-col')]");

    private static final By TEAM_NAME =
            By.xpath(".//a//div[contains(@class,'text-xs')]");

    private static final By STATS =
            By.xpath(".//div[contains(@class,'point-table-grid')]/div");

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.cricbuzz.com/cricket-series/11275/womens-premier-league-2026/points-table");

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ROWS));
    }

    /**
     * Find teams whose Win Percentage > 50%
     */
    @Test
    public void verifyTeamsWithWinPercentageAbove50() {

        List<WebElement> rows = driver.findElements(ROWS);
        System.out.println("Rows found: " + rows.size());

        for (WebElement row : rows) {

            String teamName = row.findElement(TEAM_NAME).getText();

            List<WebElement> stats = row.findElements(STATS);

            int matches = Integer.parseInt(stats.get(2).getText());
            int wins = Integer.parseInt(stats.get(3).getText());

            if (matches == 0) continue;

            double winPercentage = (wins * 100.0) / matches;

            if (winPercentage > 50) {
                System.out.printf("Team: %s | Win%%: %.2f%%%n",
                        teamName, winPercentage);
            }
        }
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
