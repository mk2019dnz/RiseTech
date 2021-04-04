package riseTech.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import riseTech.pages.HepsiBurada_E2E_pages;
import riseTech.utilities.ConfigurationReader;
import riseTech.utilities.Driver;
import riseTech.utilities.ReusableMethods;

public class HepsiBurada_End_To_End_StepDef {

    HepsiBurada_E2E_pages hepsiBurada_e2E_pages = new HepsiBurada_E2E_pages();
    Faker faker = new Faker();
    String ilkFiyat;
    String sepettekiFiyat;

    @Given("E2E Kullanici hepsiburada sitesine gider")
    public void e2e_Kullanici_hepsiburada_sitesine_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hebsiburada_url"));
    }

    @Given("E2E Kullanici Giris Yap veya uye ola tiklar")
    public void e2e_Kullanici_Giris_Yap_veya_uye_ola_tiklar() {
        hepsiBurada_e2E_pages.girisYap.click();
    }

    @Given("E2E Kullanici Uye ola tiklar")
    public void e2e_Kullanici_Uye_ola_tiklar() {
        hepsiBurada_e2E_pages.uyeOl.click();
    }

    @Given("E2E Kullanici Ad kutusuna ismini girer")
    public void e2e_Kullanici_Ad_kutusuna_ismini_girer() {
        String isim = faker.name().firstName();
        hepsiBurada_e2E_pages.ad.sendKeys(isim);
    }

    @Given("E2E Kullanici Soyad kutusuna soy ismini girer")
    public void e2e_Kullanici_Soyad_kutusuna_soy_ismini_girer() {
        String soyIsim = faker.name().lastName();
        hepsiBurada_e2E_pages.soyAd.sendKeys(soyIsim);
    }

    @Given("E2E Kulllanici E-posta kutusuna email adresini girer")
    public void e2e_Kulllanici_E_posta_kutusuna_email_adresini_girer() {
        String email = faker.internet().emailAddress();
        hepsiBurada_e2E_pages.ePosta.sendKeys(email);
    }

    @Given("E2E Kullanici sifre kutusuna sifresini girer")
    public void e2e_Kullanici_sifre_kutusuna_sifresini_girer() {
        String password = faker.internet().password(10,14,true,true,true);
        hepsiBurada_e2E_pages.sifre.sendKeys(password);
    }

    @Given("E2E Kullanici uye ol butonunu tiklar")
    public void e2e_Kullanici_uye_ol_butonunu_tiklar() {
        hepsiBurada_e2E_pages.uyeOlButonu.click();
    }

    @Given("E2E Kullanici arama kutusunda urun aratir")
    public void e2e_Kullanici_arama_kutusunda_urun_aratir() {
        ReusableMethods.waitFor(10);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(3);
        hepsiBurada_e2E_pages.aramaKutusu.sendKeys(ConfigurationReader.getProperty("urun"));
    }

    @Given("E2E Kullanici ara butonuna tiklar")
    public void e2e_Kullanici_ara_butonuna_tiklar() {
        hepsiBurada_e2E_pages.araButonu.click();
    }

    @Given("E2E Kullanici cikan ilk urunu secer")
    public void e2e_Kullanici_cikan_ilk_urunu_secer() {
       hepsiBurada_e2E_pages.ilkUrun.click();
    }

    @Given("E2E Kullanici ilk urun fiyatini alir")
    public void e2e_Kullanici_ilk_urun_fiyatini_alir() {
        ilkFiyat =  hepsiBurada_e2E_pages.ilkUrunFiyat.getText();
        System.out.println("ilk fiyat = " + ilkFiyat);
    }

    @Given("E2E Kullanici ilk urunu sepetine ekler")
    public void e2e_Kullanici_ilk_urunu_sepetine_ekler() {
        hepsiBurada_e2E_pages.sepeteEkle.click();
    }

    @Given("E2E Kullanici sepetine gider")
    public void e2e_Kullanici_sepetine_gider() {
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(hepsiBurada_e2E_pages.sepeteGit);
    }

    @Given("E2E Kullanici sectigi urunun fiyatini kontrol eder")
    public void e2e_Kullanici_sectigi_urunun_fiyatini_kontrol_eder() {
        ReusableMethods.waitFor(5);
        sepettekiFiyat = hepsiBurada_e2E_pages.sepettekiUrunFiyati.getText();
        System.out.println("Sepetteki fiyat = " + sepettekiFiyat);
        Assert.assertEquals(ilkFiyat,sepettekiFiyat);
        System.out.println("Iki fiyat birbirine esittir");;
    }

    @Given("E2E Kullanici Alisverisi tamamlaya tiklar")
    public void e2e_Kullanici_Alisverisi_tamamlaya_tiklar() {
        hepsiBurada_e2E_pages.alisverisiTamamla.click();
    }

    @Given("E2E Kullanici Yeni adres ekleye tiklar")
    public void e2e_Kullanici_Yeni_adres_ekleye_tiklar() {
       hepsiBurada_e2E_pages.yeniAdresEkle.click();
    }

    @Given("E2E Kullanici Ad kutusuna ismini adini girer")
    public void e2e_Kullanici_Ad_kutusuna_ismini_adini_girer() {
        String isim = faker.name().firstName();
        hepsiBurada_e2E_pages.adi.sendKeys(isim);
    }

    @Given("E2E Kullanici Soyad kutusuna soyadini girer")
    public void e2e_Kullanici_Soyad_kutusuna_soyadini_girer() {
        String soyad = faker.name().lastName();
        hepsiBurada_e2E_pages.soyad.sendKeys(soyad);
    }

    @Given("E2E Kullanici Telefon kutusuna cep numarasini girer")
    public void e2e_Kullanici_Telefon_kutusuna_cep_numarasini_girer() {
        hepsiBurada_e2E_pages.telefon.sendKeys(ConfigurationReader.getProperty("cepNo"));
    }

    @Given("E2E Kullanici Sehrini secer")
    public void e2e_Kullanici_Sehrini_secer() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(hepsiBurada_e2E_pages.sehir);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(hepsiBurada_e2E_pages.istanbul);
    }

    @Given("E2E Kullanici Ilcesini secer")
    public void e2e_Kullanici_Ilcesini_secer() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(hepsiBurada_e2E_pages.ilce);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(hepsiBurada_e2E_pages.adalar);
    }

    @Given("E2E Kullanici Mahallesini secer")
    public void e2e_Kullanici_Mahallesini_secer() {
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithJS(hepsiBurada_e2E_pages.mahalle);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(hepsiBurada_e2E_pages.burgazAda);
    }

    @Given("E2E Kulllanici adresini girer")
    public void e2e_Kulllanici_adresini_girer() {
        ReusableMethods.waitFor(2);
        String adres = faker.address().secondaryAddress();
        hepsiBurada_e2E_pages.adres.sendKeys(adres);
    }

    @Given("E2E Kullanici Girmis oldugu adrese ad verir")
    public void e2e_Kullanici_Girmis_oldugu_adrese_ad_verir() {
       String adreseIsimVer = faker.harryPotter().house();
       hepsiBurada_e2E_pages.adresAdi.sendKeys(adreseIsimVer);
    }

    @Given("E2E Kullanici Adresini Kaydeder")
    public void e2e_Kullanici_Adresini_Kaydeder() {
        hepsiBurada_e2E_pages.adresiKaydet.click();
    }

    @Then("E2E Kullanici Sayfayi kapatir")
    public void e2e_Kullanici_Sayfayi_kapatir() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }
}
