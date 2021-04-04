@hebsiBurada_end_to_end
  Feature: HepsiBurada ile verilen taskin java faker kullanilarak end to end test edilmesi

    @TC_04
    Scenario:  Kullanici hepsiburada sitesinde uyelik olusturur,
               urun arartir ve arattigi urunun ilkini secer ,
               sectigi urunu sepetine ekler ,
               sectigi urunun fiyatini kontrol eder ve
               alim islemini gerceklestirir
      Given E2E Kullanici hepsiburada sitesine gider
      And E2E Kullanici Giris Yap veya uye ola tiklar
      And E2E Kullanici Uye ola tiklar
      And E2E Kullanici Ad kutusuna ismini girer
      And E2E Kullanici Soyad kutusuna soy ismini girer
      And E2E Kulllanici E-posta kutusuna email adresini girer
      And E2E Kullanici sifre kutusuna sifresini girer
      And E2E Kullanici uye ol butonunu tiklar
      And E2E Kullanici arama kutusunda urun aratir
      And E2E Kullanici ara butonuna tiklar
      And E2E Kullanici cikan ilk urunu secer
      And E2E Kullanici ilk urun fiyatini alir
      And E2E Kullanici ilk urunu sepetine ekler
      And E2E Kullanici sepetine gider
      And E2E Kullanici sectigi urunun fiyatini kontrol eder
      And E2E Kullanici Alisverisi tamamlaya tiklar
      And E2E Kullanici Yeni adres ekleye tiklar
      And E2E Kullanici Ad kutusuna ismini adini girer
      And E2E Kullanici Soyad kutusuna soyadini girer
      And E2E Kullanici Telefon kutusuna cep numarasini girer
      And E2E Kullanici Sehrini secer
      And E2E Kullanici Ilcesini secer
      And E2E Kullanici Mahallesini secer
      And E2E Kulllanici adresini girer
      And E2E Kullanici Girmis oldugu adrese ad verir
      And E2E Kullanici Adresini Kaydeder
      Then E2E Kullanici Sayfayi kapatir