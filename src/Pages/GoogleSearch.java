package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearch {

    private WebElement Element = null;

    public WebElement TestBox_Search(WebDriver Driver) {
        WebElement Element = Driver.findElement(By.name("q"));
        Element.sendKeys("This is The First Search");
        return Element;
//sendKeys("Hi");
    }

    public WebElement ButtonSearch(WebDriver Driver) {
        Element = Driver.findElement(By.name("q"));
        Element.sendKeys(Keys.RETURN);

        return Element;
    }

}
