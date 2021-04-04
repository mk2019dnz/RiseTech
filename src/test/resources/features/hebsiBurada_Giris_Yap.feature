@hepsiBurada_Giris_Yap
  Feature: Kullanici daha once olusturmus oldugu uyelik uzerinden HebsiBurada uygulamasina giris yapar

    @TC_02
    Scenario: Kullanici daha once olusturdugu uyelik ile giris yapar
      Given Kullanici hepsiburada sitesine erisim yapar
      And Kullanici Giris Yap veya Uye ola tiklar
      And Kullanici Giris Yap a tiklar
      And Kulllanici e-posta kutusuna email adresini girer
      And Kullanici sifresini girer
      Then Kullanici giris Yap butonuna tiklar

    @TC_03
    Scenario: Kullanici urun aramasi yapar , urunu sepetine ekler ve fiyat kontrolu yapar
      Given Kullanici hepsiburada sitesine erisim yapar
      And Kullanici Giris Yap veya Uye ola tiklar
      And Kullanici Giris Yap a tiklar
      And Kulllanici e-posta kutusuna email adresini girer
      And Kullanici sifresini girer
      And Kullanici giris Yap butonuna tiklar
      And Kullanici arama kutusunda urun aratir
      And Kullanici ara butonuna tiklar
      And Kullanici cikan ilk urunu secer
      And Kullanici ilk urun fiyatini alir
      And Kullanici ilk urunu sepetine ekler
      And Kullanici sepetine gider
      And Kullanici sectigi urunun fiyatini kontrol eder
      And Kullanici Alisverisi tamamlaya tiklar
      And Kullanici Yeni adres ekleye tiklar
      And Kullanici Ad kutusuna ismini adini girer
      And Kullanici Soyad kutusuna soyadini girer
      And Kullanici Telefon kutusuna cep numarasini girer
      And Kullanici Sehrini secer
      And Kullanici Ilcesini secer
      And Kullanici Mahallesini secer
      And Kulllanici adresini girer
      And Kullanici Girmis oldugu adrese ad verir
      And Kullanici Adresini Kaydeder
      Then Kullanici Sayfayi kapatir

