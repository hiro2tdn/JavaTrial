package jp.gr.selenium;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

    @Test
    public void testNewsLinkClick() throws Exception {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.hatena.ne.jp/");
        assertThat("はてな", is(driver.getTitle()));

        WebElement webElement = driver.findElement(By.linkText("ニュース"));
        webElement.click();
        assertThat("はてなニュース", is(driver.getTitle()));

        driver.quit();
    }
}
