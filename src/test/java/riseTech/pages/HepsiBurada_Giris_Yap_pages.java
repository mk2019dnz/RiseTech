package riseTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import riseTech.utilities.Driver;

public class HepsiBurada_Giris_Yap_pages {

    public HepsiBurada_Giris_Yap_pages (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "myAccount")
    public WebElement giris_Yap_veya_Uye_ol;

    @FindBy(id = "login")
    public WebElement girisYap;

    @FindBy(id = "txtUserName")
    public WebElement ePosta;

    @FindBy(id = "txtPassword")
    public WebElement sifre;

    @FindBy(id = "btnLogin")
    public WebElement giris_Yap_Butonu;

    @FindBy(xpath = "//input[@class='desktopOldAutosuggestTheme-input']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='SearchBoxOld-buttonContainer']")
    public WebElement araButonu;

    @FindBy(xpath = "//div[@class='carousel-lazy-item'][1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "//span[@class='price hepsiburada']")
    public WebElement ilkUrunFiyat;

    @FindBy(id = "addToCart")
    public WebElement sepeteEkle;

    @FindBy(id = "shoppingCart")
    public WebElement sepeteGit;

    @FindBy(xpath = "//div[@class='product_priceBox_3V_jx']")
    public WebElement sepettekiUrunFiyati;

    @FindBy(id = "continue_step_btn")
    public WebElement alisverisiTamamla;

    @FindBy (xpath = "//span[@class='new_address_link_1fEiD has_no_address_1uAWQ']")
    public WebElement yeniAdresEkle;

    @FindBy(name = "contact.firstName")
    public WebElement ad;

    @FindBy (name = "contact.lastName")
    public WebElement soyad;

    @FindBy (name = "phoneNumber.gsmNumber")
    public WebElement telefon;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement sehir;

    @FindBy (xpath = "//div[@class=' css-12xhro3-option']")
    public WebElement istanbul;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[2]/div/input")
    public WebElement ilce;

    @FindBy (xpath = "//div[@class=' css-12xhro3-option']")
    public WebElement adalar;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[2]/div/div[1]/div/div[3]/div/input")
    public WebElement mahalle;

    @FindBy (xpath = "//div[@class=' css-12xhro3-option']")
    public WebElement burgazAda;

    @FindBy (xpath = "//textarea[@name='detail']")
    public WebElement adres;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement adresAdi;

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/form/fieldset[4]/div/div/div/button[1]")
    public WebElement adresiKaydet;








}
