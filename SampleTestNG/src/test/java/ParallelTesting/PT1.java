package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PT1 {
    WebDriver driver;

    @Test
    void LogoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/gyanpratapsingh/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed");
        Thread.sleep(5000);
    }

    @Test
    void TitleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/gyanpratapsingh/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        Thread.sleep(5000);
    }

    @AfterMethod
    void teardown(){
        driver.quit();
    }
}
