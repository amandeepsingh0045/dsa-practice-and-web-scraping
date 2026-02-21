package com.practice.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class IPL20Tests {


    private WebDriver driver;
    private WebDriverWait wait;

    private static final By POINTS_TABLE = By.xpath("//ul[contains(@class,'site-menu main-menu')]//a[@data-element_text='POINTS TABLE']");

    private static final By ROWS = By.xpath("//tr[@class='team0 ng-scope']");
    private static final By TEAM_NAME = By.xpath("//tr[@class='team0 ng-scope']//h2[@class='ih-pt-cont mb-0 ng-binding']");

    private static final By RECENT_FROM = By.xpath("//tr[@class='team0 ng-scope']//td[@class='ih-pt-fb-w mob-hide ng-scope']");
    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.iplt20.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(POINTS_TABLE));
    }

    @Test
    public void navigateToPointsTableAndRetrieveTeamNames() {

        driver.findElement(POINTS_TABLE).click();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.iplt20.com/points-table/men");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ROWS));

        List<WebElement> teamNames = driver.findElements(TEAM_NAME);
        List<WebElement> recentFormRow = driver.findElements(RECENT_FROM);

        int globalMaxStreak = 0;
        List<String> bestTeams = new ArrayList<>();

        for (int i = 0; i < teamNames.size(); i++) {

            String team = teamNames.get(i).getText();
            List<WebElement> form = recentFormRow.get(i)
                    .findElements(By.xpath(".//span"));

            int currentStreak = 0;
            int teamMaxStreak = 0;

            System.out.println("The Team is " + team);

            for (WebElement e : form) {
                String result = e.getText();
                System.out.print(result + " ,");

                if (result.equals("W")) {
                    currentStreak++;
                    teamMaxStreak = Math.max(teamMaxStreak, currentStreak);
                } else {
                    currentStreak = 0; // reset on L or N
                }
            }
            System.out.println();

            System.out.println("Max consecutive wins for " + team + " = "
                    + teamMaxStreak);
            System.out.println("------------------------------");

            // Track global maximum
            if (teamMaxStreak > globalMaxStreak) {
                globalMaxStreak = teamMaxStreak;
                bestTeams.clear();
                bestTeams.add(team);
            } else if (teamMaxStreak == globalMaxStreak) {
                bestTeams.add(team);
            }
        }

        System.out.println("================================");
        System.out.println("Highest Consecutive Wins: " + globalMaxStreak);
        System.out.println("Teams: " + bestTeams);
    }








    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
