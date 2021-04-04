package riseTech.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import riseTech.pages.HepsiBurada_Giris_Yap_pages;
import riseTech.utilities.ConfigurationReader;
import riseTech.utilities.Driver;
import riseTech.utilities.ReusableMethods;

public class Giris_Yap_StepDef {

    HepsiBurada_Giris_Yap_pages hepsiBurada_giris_yap_pages = new HepsiBurada_Giris_Yap_pages();
    String ilkFiyat;
    String sepettekiFiyat;

    @Given("Kullanici hepsiburada sitesine erisim yapar")
    public void kullanici_hepsiburada_sitesine_erisim_yapar() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hebsiburada_url"));
    }

    @Given("Kullanici Giris Yap veya Uye ola tiklar")
    public void kullanici_Giris_Yap_veya_Uye_ola_tiklar() {
       hepsiBurada_giris_yap_pages.giris_Yap_veya_Uye_ol.click();
    }

    @Given("Kullanici Giris Yap a tiklar")
    public void kullanici_Giris_Yap_a_tiklar() {
        hepsiBurada_giris_yap_pages.girisYap.click();
    }

    @Given("Kulllanici e-posta kutusuna email adresini girer")
    public void kulllanici_e_posta_kutusuna_email_adresini_girer() {
      hepsiBurada_giris_yap_pages.ePosta.sendKeys(ConfigurationReader.getProperty("email"));
    }

    @Given("Kullanici sifresini girer")
    public void kullanici_sifresini_girer() {
        hepsiBurada_giris_yap_pages.sifre.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Then("Kullanici giris Yap butonuna tiklar")
    public void kullanici_giris_Yap_butonuna_tiklar() {
       hepsiBurada_giris_yap_pages.giris_Yap_Butonu.click();
    }

    @Given("Kullanici arama kutusunda urun aratir")
    public void kullanici_arama_kutusunda_urun_aratir() {
        ReusableMethods.waitFor(10);
       Driver.getDriver().navigate().refresh();
       ReusableMethods.waitFor(3);
        hepsiBurada_giris_yap_pages.aramaKutusu.sendKeys(ConfigurationReader.getProperty("urun"));
    }

    @Given("Kullanici ara butonuna tiklar")
    public void kullanici_ara_butonuna_tiklar() {
        hepsiBurada_giris_yap_pages.araButonu.click();
    }

    @Given("Kullanici cikan ilk urunu secer")
    public void kullanici_cikan_ilk_urunu_secer() {
        hepsiBurada_giris_yap_pages.ilkUrun.click();
    }

    @Given("Kullanici ilk urun fiyatini alir")
    public void kullanici_ilk_urun_fiyatini_alir() {
     ilkFiyat =  hepsiBurada_giris_yap_pages.ilkUrunFiyat.getText();
        System.out.println("ilk fiyat = " + ilkFiyat);
    }

    @Given("Kullanici ilk urunu sepetine ekler")
    public void kullanici_ilk_urunu_sepetine_ekler() {
        hepsiBurada_giris_yap_pages.sepeteEkle.click();
    }

    @Given("Kullanici sepetine gider")
    public void kullanici_sepetine_gider() {
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(hepsiBurada_giris_yap_pages.sepeteGit);
      // hepsiBurada_giris_yap_pages.sepeteGit.click();
    }

    @Given("Kullanici sectigi urunun fiyatini kontrol eder")
    public void kullanici_sectigi_urunun_fiyatini_kontrol_eder() {
        ReusableMethods.waitFor(5);
      sepettekiFiyat = hepsiBurada_giris_yap_pages.sepettekiUrunFiyati.getText();
        System.out.println("Sepetteki fiyat = " + sepettekiFiyat);
        Assert.assertEquals(ilkFiyat,sepettekiFiyat);
        System.out.println("Iki fiyat birbirine esittir");
    }

    @Given("Kullanici Alisverisi tamamlaya tiklar")
    public void kullanici_Alisverisi_tamamlaya_tiklar() {
       hepsiBurada_giris_yap_pages.alisverisiTamamla.click();
    }

    @Given("Kullanici Yeni adres ekleye tiklar")
    public void kullanici_Yeni_adres_ekleye_tiklar() {
      hepsiBurada_giris_yap_pages.yeniAdresEkle.click();
    }

    @Given("Kullanici Ad kutusuna ismini adini girer")
    public void kullanici_Ad_kutusuna_ismini_adini_girer() {
       hepsiBurada_giris_yap_pages.ad.sendKeys(ConfigurationReader.getProperty("isim"));
    }

    @Given("Kullanici Soyad kutusuna soyadini girer")
    public void kullanici_Soyad_kutusuna_soyadini_girer() {
       hepsiBurada_giris_yap_pages.soyad.sendKeys(ConfigurationReader.getProperty("soyIsim"));
    }

    @Given("Kullanici Telefon kutusuna cep numarasini girer")
    public void kullanici_Telefon_kutusuna_cep_numarasini_girer() {
        hepsiBurada_giris_yap_pages.telefon.sendKeys(ConfigurationReader.getProperty("cepNo"));
    }

    @Given("Kullanici Sehrini secer")
    public void kullanici_Sehrini_secer() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(hepsiBurada_giris_yap_pages.sehir);
       // hepsiBurada_giris_yap_pages.sehir.click();
        ReusableMethods.waitFor(2);
      ReusableMethods.clickWithJS(hepsiBurada_giris_yap_pages.istanbul);

    }

    @Given("Kullanici Ilcesini secer")
    public void kullanici_Ilcesini_secer() {
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(hepsiBurada_giris_yap_pages.ilce);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(hepsiBurada_giris_yap_pages.adalar);
    }

    @Given("Kullanici Mahallesini secer")
    public void kullanici_Mahallesini_secer() {
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithJS(hepsiBurada_giris_yap_pages.mahalle);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickWithJS(hepsiBurada_giris_yap_pages.burgazAda);
    }

    @Given("Kulllanici adresini girer")
    public void kulllanici_adresini_girer() {
        ReusableMethods.waitFor(2);
        hepsiBurada_giris_yap_pages.adres.sendKeys(ConfigurationReader.getProperty("adres"));
    }

    @Given("Kullanici Girmis oldugu adrese ad verir")
    public void kullanici_Girmis_oldugu_adrese_ad_verir() {
        hepsiBurada_giris_yap_pages.adresAdi.sendKeys(ConfigurationReader.getProperty("adresAdi"));
    }

    @Given("Kullanici Adresini Kaydeder")
    public void kullanici_Adresini_Kaydeder() {
       hepsiBurada_giris_yap_pages.adresiKaydet.click();
    }

    @Then("Kullanici Sayfayi kapatir")
    public void kullanici_Sayfayi_kapatir() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }

}
