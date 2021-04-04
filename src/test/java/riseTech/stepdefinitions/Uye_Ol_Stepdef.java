package riseTech.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import riseTech.pages.HepsiBurada_Uye_Ol_pages;
import riseTech.utilities.ConfigurationReader;
import riseTech.utilities.Driver;

public class Uye_Ol_Stepdef {

    HepsiBurada_Uye_Ol_pages hepsiBurada_uye_ol_pages = new HepsiBurada_Uye_Ol_pages();

    @Given("Kullanici hepsiburada sitesine gider")
    public void kullanici_hepsiburada_sitesine_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hebsiburada_url"));
    }

    @Given("Kullanici Giris Yap veya uye ola tiklar")
    public void kullanici_Giris_Yap_veya_uye_ola_tiklar() {
        hepsiBurada_uye_ol_pages.girisYap.click();
    }

    @Given("Kullanici Uye ola tiklar")
    public void kullanici_Uye_ola_tiklar() {
        hepsiBurada_uye_ol_pages.uyeOl.click();
    }

    @Given("Kullanici Ad kutusuna ismini girer")
    public void kullanici_Ad_kutusuna_ismini_girer() {
        hepsiBurada_uye_ol_pages.ad.sendKeys(ConfigurationReader.getProperty("isim"));
    }

    @Given("Kullanici Soyad kutusuna soy ismini girer")
    public void kullanici_Soyad_kutusuna_soy_ismini_girer() {
        hepsiBurada_uye_ol_pages.soyAd.sendKeys(ConfigurationReader.getProperty("soyIsim"));
    }

    @Given("Kulllanici E-posta kutusuna email adresini girer")
    public void kulllanici_E_posta_kutusuna_email_adresini_girer() {
        hepsiBurada_uye_ol_pages.ePosta.sendKeys(ConfigurationReader.getProperty("email"));
    }

    @Given("Kullanici sifre kutusuna sifresini girer")
    public void kullanici_sifre_kutusuna_sifresini_girer() {
        hepsiBurada_uye_ol_pages.sifre.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Then("Kullanici uye ol butonunu tiklar")
    public void kullanici_uye_ol_butonunu_tiklar() {
       hepsiBurada_uye_ol_pages.uyeOlButonu.click();
    }


}
