package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class reSearchGoogle {
    private WebElement Element = null;

    public WebElement ReSearchBox(WebDriver Driver) {
        WebElement Element = Driver.findElement(By.name("q"));
        Element.clear();
        Element.sendKeys("This is The Second Search");

        return Element;

    }

    public WebElement ReClickSearchButton(WebDriver Driver) {
        WebElement Element = Driver.findElement(By.name("q"));
        Element.sendKeys(Keys.RETURN);
        return Element;

    }
}