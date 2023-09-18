import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GoogleSearchTests {
    public WebDriver Driver = null;

    @BeforeClass
    public void setUp() {
        Driver = new ChromeDriver();
        System.setProperty("Webdriver.chrome.driver", "/Users/sajasalahat/Desktop/chromedriver-mac-x64");
        Driver.get("https://www.google.com");
    }


    @Test(priority = 0)
    public void verifyUserCanSearchForAnyKeyword() {
        GoogleSearch Search = new GoogleSearch();
        Search.TestBox_Search(Driver);
        Search.ButtonSearch(Driver);
        System.out.println("1.First Search done");
    }

    @Test(priority = 1)
    public void verifyClearingKeywordAndSearchForNew() {
        reSearchGoogle reSearch = new reSearchGoogle();
        reSearch.ReSearchBox(Driver);
        reSearch.ReClickSearchButton(Driver);
        System.out.println("2.Second Search Done ");
    }


    @Test(priority = 2)
    public void assertThatNumberOfResultsExistOnUI() {
        AssertionResult ValidateResult = new AssertionResult();
        ValidateResult.AssertionResult_(Driver);
        System.out.println("3. AssertionResult Done ");
    }


    @Test(priority = 3)
    public void verifyScrollDownAndGoToTheNextPage() {
        ScrollDown ScrollDown_ = new ScrollDown();
        ScrollDown_.ScrollDownProcess(Driver);
        ScrollDown_.GoToNextPage(Driver);
        System.out.println("4.ScrollDown and ..... //Go to Next Page Done ");
    }

//5. Validate if the number of results on page 2 is equal to page 3 or not


    @Test(priority = 4)

    public void ValidateSuggestionsProcess() {
        DuplicatationSuggestions Suggestions = new DuplicatationSuggestions();
        Suggestions.DuplicatationSuggestions_(Driver);
        System.out.println("6. Search suggestions Done ");
    }

    @AfterTest
    public void EndProcess() throws InterruptedException {
        Thread.sleep(4000);
        CloseWindow CloseWindow_ = new CloseWindow();
        CloseWindow_.CloseWindows(Driver);
        System.out.println(" 7.Close Window Done ");
    }

}


