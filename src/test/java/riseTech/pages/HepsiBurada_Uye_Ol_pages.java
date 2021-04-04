package riseTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import riseTech.utilities.Driver;

public class HepsiBurada_Uye_Ol_pages {

    public HepsiBurada_Uye_Ol_pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "myAccount")
    public WebElement girisYap;

    @FindBy(id = "register")
    public WebElement uyeOl;

    @FindBy(id = "txtName")
    public WebElement ad;

    @FindBy(id = "txtSurname")
    public WebElement soyAd;

    @FindBy(id = "txtEmail")
    public WebElement ePosta;

    @FindBy(id = "txtNewPassEmail")
    public WebElement sifre;

    @FindBy(id = "btnSignUpSubmit")
    public WebElement uyeOlButonu;




}
