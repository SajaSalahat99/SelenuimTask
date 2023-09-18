package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollDown {

    private WebElement Element = null;
    public WebElement ScrollDownProcess (WebDriver Driver)
    {

        JavascriptExecutor js = (JavascriptExecutor) Driver;

        // Scroll down by a certain number of pixels
        int pixelsToScroll =3000; // Adjust this value as needed
        js.executeScript("window.scrollBy(0, " + pixelsToScroll + ");");

        return Element;

    }


    public WebElement GoToNextPage (WebDriver Driver)
    {
//        WebElement nextPageButton = Driver.findElement(By.xpath("//a[@id='pnnext']"));
//        nextPageButton.click();

        return Element;

    }
}
