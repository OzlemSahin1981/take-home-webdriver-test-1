package TakeHome.pages;

import TakeHome.utilities.BrowserUtils;
import TakeHome.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class DownloadPage extends BasePage {

    public DownloadPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[@href='download/some-file.txt']")
    private WebElement textFile;

    @FindBy(xpath = "//*[@href='download/webdriverIO.png']")
    private WebElement picFile;

    @FindBy(xpath = "//*[@href='download/Logo.png']")
    private WebElement picFileLogo;



    public void downloadText(){
        textFile.click();
        BrowserUtils.waitFor(3);
    }



}
