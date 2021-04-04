@hepsiBurada_Uye_Ol
  Feature: HepsiBurada uygulamasi uzerinde uyelik olusturulmasi

    @TC_01
    Scenario:  Kullanici hepsiburada sitesinde uyelik olusturur
      Given Kullanici hepsiburada sitesine gider
      And Kullanici Giris Yap veya uye ola tiklar
      And Kullanici Uye ola tiklar
      And Kullanici Ad kutusuna ismini girer
      And Kullanici Soyad kutusuna soy ismini girer
      And Kulllanici E-posta kutusuna email adresini girer
      And Kullanici sifre kutusuna sifresini girer
      Then Kullanici uye ol butonunu tiklar
