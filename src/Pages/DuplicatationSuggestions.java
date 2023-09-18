package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatationSuggestions {


    public void  DuplicatationSuggestions_(WebDriver Driver)
    {
    List<WebElement> suggestions = Driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
    Set<String> suggestionTexts = new HashSet<>();
        for (
    WebElement suggestion : suggestions) {
        String text = suggestion.getText().trim();
        suggestionTexts.add(text);
    }

        if (suggestionTexts.size() == suggestions.size()) {
        System.out.println("All Suggestions are different.");
    } else {
        System.out.println("There are duplicate suggestions.");
    }

}}
