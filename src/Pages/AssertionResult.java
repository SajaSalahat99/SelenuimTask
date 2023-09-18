package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssertionResult {

    private WebElement Element = null;

    public WebElement AssertionResult_(WebDriver Driver) {
        Element = Driver.findElement(By.id("result-stats"));
        if (Element.isDisplayed())
            System.out.println("foundElement");
            else
            System.out.println("NotfoundElement");


        return Element;

    }
}

